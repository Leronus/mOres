package mod.leronus.mores.recipe;

import mod.leronus.mores.item.custom.ModShieldItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import org.jetbrains.annotations.NotNull;

public class ShieldRecipe extends CustomRecipe {

    public ShieldRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingContainer container, @NotNull Level level) {
        ItemStack shieldStack = ItemStack.EMPTY;
        ItemStack bannerStack = ItemStack.EMPTY;

        for (int i = 0; i < container.getContainerSize(); i++) {
            ItemStack stack = container.getItem(i);
            if (stack.isEmpty()) continue;

            if (stack.getItem() instanceof BannerItem) {
                if (!bannerStack.isEmpty()) return false;
                bannerStack = stack;
            } else {
                if (!(stack.getItem() instanceof ModShieldItem)) return false;
                if (!shieldStack.isEmpty()) return false;

                // In 1.20.6, decorated shields store banner patterns as data components.
                // Prevent applying a banner twice.
                if (stack.has(DataComponents.BANNER_PATTERNS) || stack.has(DataComponents.BASE_COLOR)) {
                    return false;
                }

                shieldStack = stack;
            }
        }

        return !shieldStack.isEmpty() && !bannerStack.isEmpty();
    }

    @Override
    public @NotNull ItemStack assemble(CraftingContainer container, HolderLookup.Provider provider) {
        ItemStack shieldStack = ItemStack.EMPTY;
        ItemStack bannerStack = ItemStack.EMPTY;

        for (int i = 0; i < container.getContainerSize(); i++) {
            ItemStack stack = container.getItem(i);
            if (stack.isEmpty()) continue;

            if (stack.getItem() instanceof BannerItem) {
                bannerStack = stack;
            } else if (stack.getItem() instanceof ModShieldItem) {
                shieldStack = stack.copy();
            }
        }

        if (shieldStack.isEmpty() || bannerStack.isEmpty()) {
            return ItemStack.EMPTY;
        }

        // Copy banner patterns (data component) onto the shield.
        BannerPatternLayers layers = bannerStack.get(DataComponents.BANNER_PATTERNS);
        if (layers != null) {
            shieldStack.set(DataComponents.BANNER_PATTERNS, layers);
        }

        // Store the base color too (used for rendering/tint like vanilla).
        DyeColor baseColor = ((BannerItem) bannerStack.getItem()).getColor();
        shieldStack.set(DataComponents.BASE_COLOR, baseColor);

        return shieldStack;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return ModRecipes.SHIELD_DECORATION_RECIPE.get();
    }
}
