package mod.mores.init;

import mod.mores.data.ShieldsRecipeProvider;
import mod.mores.recipe.AlloyFurnaceRecipe;
import mod.mores.recipe.IAlloyFurnaceRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;

public class RecipeTypeInit
{
    public static final IRecipeType<IAlloyFurnaceRecipe> ALLOY_TYPE = new RecipeType<>();
    public static final IRecipeSerializer<AlloyFurnaceRecipe> ALLOY_SERIALIZER =
            new AlloyFurnaceRecipe.AlloyRecipeSerializer();


    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T>
    {
        @Override
        public String toString()
        {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    } // end class RecipeType
} // end class RecipeTypeInit