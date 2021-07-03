package mod.mores.init;

import mod.mores.tileentity.AlloyFurnaceRecipes;
import mod.mores.tileentity.IAlloyFurnaceRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;

public class RecipeTypeInit
{
    public static final IRecipeType<IAlloyFurnaceRecipe> ALLOY_TYPE = new RecipeType<>();
    public static final IRecipeSerializer<AlloyFurnaceRecipes> ALLOY_SERIALIZER =
            new AlloyFurnaceRecipes.AlloyRecipeSerializer();

    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T>
    {
        @Override
        public String toString()
        {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    } // end class RecipeType
} // end class ModRecipeTypes