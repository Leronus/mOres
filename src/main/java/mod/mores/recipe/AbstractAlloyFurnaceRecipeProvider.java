package mod.mores.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;

import mod.mores.init.RecipeTypeInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class AbstractAlloyFurnaceRecipeProvider extends RecipeProvider
{

    public AbstractAlloyFurnaceRecipeProvider(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    public String getName()
    {
        return "mOres alloy recipes";
    }

    public static ResourceLocation id(String modid, String path)
    {
        return new ResourceLocation(modid, "alloy_furnace/" + path);
    }


    public static class FinishedRecipe implements IFinishedRecipe
    {
        private final ResourceLocation id;
        private final ItemStack output;
        private final NonNullList<Ingredient> inputs;
        private final Ingredient catalyst;
        private final int cook_time;
        private final float experience;

        public FinishedRecipe(ResourceLocation id, ItemStack output,  int cook_time, float experience,
                              Ingredient catalyst, Ingredient... inputs)
        {
            this.id = id;
            this.output = output;
            this.inputs = NonNullList.of(null, inputs);
            this.catalyst = catalyst;
            this.cook_time = cook_time;
            this.experience = experience;
        }

        @Override
        public void serializeRecipeData(JsonObject json)
        {
            JsonArray json_inputs = new JsonArray();
            for (Ingredient ing : inputs)
            {
                json_inputs.add(ing.toJson());
            }
            json.add("inputs", json_inputs);
            json.add("catalyst", catalyst.toJson());
            json.add("output", serializeStack(output));
            json.addProperty("cookingtime", cook_time);
            json.addProperty("experience", experience);
        }

        @Override
        public ResourceLocation getId()
        {
            return id;
        }

        @Override
        public IRecipeSerializer<?> getType()
        {
            return RecipeTypeInit.ALLOY_SERIALIZER;
        }

        @Override
        public JsonObject serializeAdvancement()
        {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public ResourceLocation getAdvancementId()
        {
            // TODO Auto-generated method stub
            return null;
        }

        /**
         * Serializes the given stack such that {@link net.minecraftforge.common.crafting.CraftingHelper#getItemStack}
         * would be able to read the result back. (Borrowed from Botania).
         *
         * @param stack - stack to be serialized.
         * @return JsonObject describing stack.
         */
        private static JsonObject serializeStack(ItemStack stack)
        {
            CompoundNBT nbt = stack.save(new CompoundNBT());
            byte c = nbt.getByte("Count");
            if (c != 1) {
                nbt.putByte("count", c);
            }
            nbt.remove("Count");
            renameTag(nbt, "id", "item");
            renameTag(nbt, "tag", "nbt");
            Dynamic<INBT> dyn = new Dynamic<>(NBTDynamicOps.INSTANCE, nbt);
            return dyn.convert(JsonOps.INSTANCE).getValue().getAsJsonObject();
        }

        /**
         * also borrowed from Botania.
         * @param nbt
         * @param oldName
         * @param newName
         */
        public static void renameTag(CompoundNBT nbt, String oldName, String newName) {
            INBT tag = nbt.get(oldName);
            if (tag != null) {
                nbt.remove(oldName);
                nbt.put(newName, tag);
            }
        }
    } // end-class FinishedRecipe

} // end class