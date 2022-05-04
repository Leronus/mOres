package mod.mores.recipe;

import mod.mores.item.custom.ModShieldItem;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class ShieldRecipe extends CustomRecipe {

    public static final SimpleRecipeSerializer<ShieldRecipe> SERIALIZER = new SimpleRecipeSerializer<ShieldRecipe>(
            ShieldRecipe::new);

    public ShieldRecipe(ResourceLocation idIn) {
        super(idIn);
    }

    public boolean matches(CraftingContainer inv, Level worldIn) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < inv.getContainerSize(); ++i) {
            ItemStack itemstack2 = inv.getItem(i);
            if (!itemstack2.isEmpty()) {
                if (itemstack2.getItem() instanceof BannerItem) {
                    if (!itemstack1.isEmpty()) {
                        return false;
                    }

                    itemstack1 = itemstack2;
                } else {
                    if (!(itemstack2.getItem() instanceof ModShieldItem)) {
                        return false;
                    }

                    if (!itemstack.isEmpty()) {
                        return false;
                    }

                    if (itemstack2.getTagElement("BlockEntityTag") != null) {
                        return false;
                    }

                    itemstack = itemstack2;
                }
            }
        }

        if (!itemstack.isEmpty() && !itemstack1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ItemStack assemble(CraftingContainer inv) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < inv.getContainerSize(); ++i) {
            ItemStack itemstack2 = inv.getItem(i);
            if (!itemstack2.isEmpty()) {
                if (itemstack2.getItem() instanceof BannerItem) {
                    itemstack = itemstack2;
                } else if (itemstack2.getItem() instanceof ModShieldItem) {
                    itemstack1 = itemstack2.copy();
                }
            }
        }

        if (itemstack1.isEmpty()) {
            return itemstack1;
        } else {
            CompoundTag compoundnbt = itemstack.getTagElement("BlockEntityTag");
            CompoundTag compoundnbt1 = compoundnbt == null ? new CompoundTag() : compoundnbt.copy();
            compoundnbt1.putInt("Base", ((BannerItem) itemstack.getItem()).getColor().getId());
            itemstack1.addTagElement("BlockEntityTag", compoundnbt1);
            return itemstack1;
        }
    }

    /**
     * Used to determine if this recipe can fit in a grid of the given width/height
     */
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    public RecipeSerializer<?> getSerializer() {
        return SERIALIZER;
    }
}