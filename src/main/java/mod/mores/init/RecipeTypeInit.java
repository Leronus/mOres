package mod.mores.init;

import mod.mores.recipe.AlloyFurnaceRecipe;
import mod.mores.recipe.IAlloyFurnaceRecipe;
import mod.mores.recipe.ShieldRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraft.util.registry.Registry;

public class RecipeTypeInit
{
    public static final IRecipeType<IAlloyFurnaceRecipe> ALLOY_TYPE = new RecipeType<>();
    public static final IRecipeSerializer<AlloyFurnaceRecipe> ALLOY_SERIALIZER =
            new AlloyFurnaceRecipe.AlloyRecipeSerializer();
    public static final SpecialRecipeSerializer<ShieldRecipes> SHIELD_SERIALIZER =
            new SpecialRecipeSerializer<>(ShieldRecipes::new);

    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T>
    {
        @Override
        public String toString()
        {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    } // end class RecipeType
} // end class RecipeTypeInit