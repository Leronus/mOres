package mod.mores.recipe;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public interface IAlloyFurnaceRecipe extends IRecipe<RecipeWrapper>
{
    ResourceLocation TYPE_ID = new ResourceLocation(Mores.MODID, "alloying");

    @Override
    default boolean canCraftInDimensions(int width, int height)
    {
        return false;
    }

    @Override
    default IRecipeType<?> getType()
    {
        return Registry.RECIPE_TYPE.get(TYPE_ID);
    }

    @Override
    default ItemStack getToastSymbol()
    {
        return new ItemStack(BlockInit.ALLOY_FURNACE.get());
    }

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