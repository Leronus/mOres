//package mod.mores.init;
//
//
//import net.minecraft.core.Registry;
//
//public class RecipeTypeInit
//{
//    public static final IRecipeType<IAlloyFurnaceRecipe> ALLOY_TYPE = new RecipeType<>();
//    public static final IRecipeSerializer<AlloyFurnaceRecipe> ALLOY_SERIALIZER =
//            new AlloyFurnaceRecipe.AlloyRecipeSerializer();
//    public static final SpecialRecipeSerializer<ShieldRecipes> SHIELD_SERIALIZER =
//            new SpecialRecipeSerializer<>(ShieldRecipes::new);
//
//    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T>
//    {
//        @Override
//        public String toString()
//        {
//            return Registry.RECIPE_TYPE.getKey(this).toString();
//        }
//    } // end class RecipeType
//} // end class RecipeTypeInit