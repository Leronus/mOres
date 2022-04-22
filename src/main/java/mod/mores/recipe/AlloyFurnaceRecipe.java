package mod.mores.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import mod.mores.Mores;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.crafting.CraftingHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class AlloyFurnaceRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> inputs;
    private final Ingredient catalyst;
    private final int cook_time;
    private final float experience;

    private final int INPUT1_SLOT = 0;
    private final int INPUT2_SLOT = 1;
    private final int CATALYST_SLOT = 2;

    public AlloyFurnaceRecipe(ResourceLocation id, ItemStack output, int cook_time, float experience,
                              Ingredient catalyst, Ingredient... inputs)
    {
        this.id = id;
        this.output = output;
        this.inputs = NonNullList.of(null, inputs);
        this.catalyst = catalyst;
        this.cook_time = cook_time;
        this.experience = experience;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    @Override
    public boolean matches(SimpleContainer inv, Level worldIn)
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
     * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
     * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
     */
    @Override
    public ItemStack getResultItem()
    {
        return this.output;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    public Ingredient getCatalyst()
    {
        return this.catalyst;
    }


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

    public float getExperience()
    {
        return this.experience;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlloyFurnaceRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloying";
    }

    public static class Serializer implements RecipeSerializer<AlloyFurnaceRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(Mores.MODID,"alloying");

        @Override
        public AlloyFurnaceRecipe fromJson(ResourceLocation id, JsonObject json) {
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

            return new AlloyFurnaceRecipe(id, output, cook_time, experience, catalyst,
                    inputs.toArray(new Ingredient[0]));
        }

        @Override
        public AlloyFurnaceRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            Ingredient[] inputs = new Ingredient[buf.readVarInt()];
            for (int ii = 0; ii < inputs.length; ii++) {
                inputs[ii] = Ingredient.fromNetwork(buf);
            }
            ItemStack output = buf.readItem();
            Ingredient catalyst = Ingredient.fromNetwork(buf);
            int cook_time = buf.readVarInt();
            float exp = buf.readFloat();

            return new AlloyFurnaceRecipe(id, output, cook_time, exp, catalyst, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, AlloyFurnaceRecipe recipe) {
            buf.writeVarInt(recipe.getIngredients().size());
            for (Ingredient input : recipe.getIngredients()) {
                input.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), true);
            recipe.getCatalyst().toNetwork(buf);
            buf.writeVarInt(recipe.getCookTime());
            buf.writeFloat(recipe.getExperience());
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }
}