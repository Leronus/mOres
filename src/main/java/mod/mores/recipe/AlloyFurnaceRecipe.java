package mod.mores.recipe;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public interface AlloyFurnaceRecipe extends Recipe<RecipeWrapper>
{
    ResourceLocation TYPE_ID = new ResourceLocation(Mores.MOD_ID, "alloying");

    @Override
    default boolean canCraftInDimensions(int width, int height)
    {
        return false;
    }

    @Override
    default RecipeType<?> getType()
    {
        return Registry.RECIPE_TYPE.get(TYPE_ID);
    }

//    @Override
//    default ItemStack getToastSymbol()
//    {
//        return new ItemStack(BlockInit.ALLOY_FURNACE.get());
//    }

    Ingredient getCatalyst();

    float getExperience();

    /**
     * we are very special -- we don't use the recipe book.
     */
    @Override
    default boolean isSpecial()
    {
        return true;
    }


} // end-class