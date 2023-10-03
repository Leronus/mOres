//package mod.leronus.mores.api.recipe;
//
//import mod.leronus.mores.Mores;
//import mod.leronus.mores.block.ModBlocks;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.Recipe;
//import net.minecraft.world.item.crafting.RecipeType;
//import net.minecraftforge.items.wrapper.RecipeWrapper;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public interface IAlloyRecipe extends Recipe<RecipeWrapper>
//{
//    String UID = "alloying";
//    ResourceLocation TYPE_ID = new ResourceLocation(Mores.MODID, IAlloyRecipe.UID);
//
//    @Override
//    default boolean canCraftInDimensions(int width, int height)
//    {
//        return false;
//    }
//
//    @Override
//    default RecipeType<?> getType()
//    {
//        return ForgeRegistries.RECIPE_TYPES.getValue(TYPE_ID);
//    }
//
//    @Override
//    default ItemStack getToastSymbol()
//    {
//        return new ItemStack(ModBlocks.ALLOY_FURNACE.get());
//    }
//
//    Ingredient getCatalyst();
//
//    float getExperience();
//
//    /**
//     * we are very special -- we don't use the recipe book.
//     */
//    @Override
//    default boolean isSpecial()
//    {
//        return true;
//    }
//
//
//} // end-class