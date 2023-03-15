package mod.leronus.mores.api.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import mod.leronus.mores.api.client.ClientOnlyWrapper;
import mod.leronus.mores.recipe.ModRecipes;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.items.wrapper.RecipeWrapper;
import net.minecraftforge.server.ServerLifecycleHooks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlloyRecipe implements IAlloyRecipe
{
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> inputs;
    private final Ingredient catalyst;
    private final int cook_time;
    private final float experience;

    private final int INPUT1_SLOT = 0;
    private final int INPUT2_SLOT = 1;
    private final int CATALYST_SLOT = 2;

    private static Set<Item> legal_inputs = new HashSet<Item>();
    private static Set<Item> legal_catalysts = new HashSet<Item>();

    public AlloyRecipe(ResourceLocation id, ItemStack output,  int cook_time, float experience,
                        Ingredient catalyst, Ingredient... inputs)
    {
        this.id = id;
        this.output = output;
        this.inputs = NonNullList.of(null, inputs);
        this.catalyst = catalyst;
        this.cook_time = cook_time;
        this.experience = experience;

    } // ctor

    private static void initLegalisms()
    {
//        Mores.LOGGER.info(Mores.MODID + ": in AlloyRecipe.InitLegalisms()");

        List<IAlloyRecipe> recipes;

        // check for client-side vs server-side
        if (FMLEnvironment.dist == Dist.CLIENT)
        {
            recipes = ClientOnlyWrapper.getRecipeManager().getAllRecipesFor(ModRecipes.ALLOY_TYPE.get());
        }
        else {
            recipes = ServerLifecycleHooks.getCurrentServer().getRecipeManager().getAllRecipesFor(ModRecipes.ALLOY_TYPE.get());
        }

        for (IAlloyRecipe recipe: recipes)
        {
            NonNullList<Ingredient> ingrs = recipe.getIngredients();
            for (Ingredient ingr: ingrs)
            {
                for (ItemStack stack : ingr.getItems()) {
                    legal_inputs.add(stack.getItem());
                }
            } // end-for
            for (ItemStack stack : ((AlloyRecipe) recipe).getCatalyst().getItems())
            {
                legal_catalysts.add(stack.getItem());
            }
        } // end-for
    } // end initLegalisms

    public static boolean isInput(ItemStack stack)
    {
        if (legal_inputs.isEmpty()) {
            initLegalisms();
        }
        return legal_inputs.contains(stack.getItem());
    }

    public static boolean isCatalyst(ItemStack stack)
    {
        if (legal_catalysts.isEmpty()) {
            initLegalisms();
        }
        return legal_catalysts.contains(stack.getItem());
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    @Override
    public boolean matches(RecipeWrapper inv, Level worldIn)
    {
        List<Ingredient> ingredientsMissing = new ArrayList<>(inputs);

        // check inputs, could be in either slot...
        for (int ii = INPUT1_SLOT; ii <= INPUT2_SLOT; ii++)
        {
            ItemStack input = inv.getItem(ii);
            if (input.isEmpty()) {
                break;
            }
            int stackIndex = -1;
            for (int jj = 0; jj < ingredientsMissing.size(); jj++)
            {
                Ingredient ingr = ingredientsMissing.get(jj);
                if (ingr.test(input)) {
                    stackIndex = jj;
                    break;
                }
            }
            if (stackIndex != -1) {
                ingredientsMissing.remove(stackIndex);
            }
            else {
                return false;
            }
        } // end-for ii

        // check catalyst
        ItemStack cata = inv.getItem(CATALYST_SLOT);
        if (this.catalyst.test(cata)) {
            return ingredientsMissing.isEmpty();
        }
        else {
            return false;
        }
    } // end matches()

    /**
     * Returns an Item that is the result of this recipe
     */
    @Override
    public ItemStack assemble(RecipeWrapper inv)
    {
        return getResultItem().copy();
    }

    /**
     * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
     * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
     */
    @Override
    public ItemStack getResultItem()
    {
        return this.output;
    }

    @Override
    public Ingredient getCatalyst()
    {
        return this.catalyst;
    } // end class AlloyRecipe


    @Override
    public NonNullList<Ingredient> getIngredients()
    {
        return inputs;
    }


    @Override
    public ResourceLocation getId()
    {
        return this.id;
    }

    public int getCookTime()
    {
        return this.cook_time;
    }

    @Override
    public float getExperience()
    {
        return this.experience;
    }

    @Override
    public RecipeSerializer<?> getSerializer()
    {
        return ModRecipes.ALLOY_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlloyRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloying";
    }

    public static class AlloyRecipeSerializer implements RecipeSerializer<AlloyRecipe>
    {

        public static final AlloyRecipeSerializer INSTANCE = new AlloyRecipeSerializer();
        @Override
        public AlloyRecipe fromJson(ResourceLocation recipeId, JsonObject json)
        {
            ItemStack output = CraftingHelper.getItemStack(GsonHelper.getAsJsonObject(json, "output"),
                    true);
            JsonArray ingrs = GsonHelper.getAsJsonArray(json, "inputs");
            List<Ingredient> inputs = new ArrayList<>();
            for (JsonElement e : ingrs) {
                inputs.add(Ingredient.fromJson(e));
            }
            Ingredient catalyst = Ingredient.fromJson(
                    GsonHelper.getAsJsonObject(json, "catalyst"));

            int cook_time = GsonHelper.getAsInt(json, "cookingtime");
            float experience = GsonHelper.getAsFloat(json, "experience");

            return new AlloyRecipe(recipeId, output, cook_time, experience, catalyst,
                    inputs.toArray(new Ingredient[0]));
        } // end read(json)

        @Override
        public AlloyRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buf)
        {
            Ingredient[] inputs = new Ingredient[buf.readVarInt()];
            for (int ii = 0; ii < inputs.length; ii++) {
                inputs[ii] = Ingredient.fromNetwork(buf);
            }
            ItemStack output = buf.readItem();
            Ingredient catalyst = Ingredient.fromNetwork(buf);
            int cook_time = buf.readVarInt();
            float exp = buf.readFloat();

            return new AlloyRecipe(recipeId, output, cook_time, exp, catalyst, inputs);
        } // end read(packet)

        @Override
        public void toNetwork(FriendlyByteBuf buf, AlloyRecipe recipe)
        {
            buf.writeVarInt(recipe.getIngredients().size());
            for (Ingredient input : recipe.getIngredients()) {
                input.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), true);
            recipe.getCatalyst().toNetwork(buf);
            buf.writeVarInt(recipe.getCookTime());
            buf.writeFloat(recipe.getExperience());
        } // end write(packet)

    } // end class AlloyRecipeSerializer

} // end class AlloyRecipe