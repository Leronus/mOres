package mod.mores.init;

import mod.mores.recipe.AlloyRecipe;
import mod.mores.recipe.AlloyFurnaceRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class RecipeTypeInit
{
    public static final RecipeType<AlloyFurnaceRecipe> ALLOY_TYPE = new RecipeType<>();
    public static final RecipeSerializer<AlloyRecipe> ALLOY_SERIALIZER =
            new AlloyRecipe.AlloyRecipeSerializer();

    private static class RecipeType<T extends Recipe<?>> implements net.minecraft.world.item.crafting.RecipeType<T>
    {
        @Override
        public String toString()
        {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    } // end class RecipeType
} // end class ModRecipeTypes