package mod.mores.inventory;

import mod.mores.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nullable;

public class SlotInputTwo extends SlotItemHandler {
    public SlotInputTwo(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(@Nullable ItemStack stack) {
        if (stack.getItem() == Items.IRON_INGOT && stack.getItem() == ItemInit.TIN_INGOT && stack.getItem() == ItemInit.SILVER_INGOT && stack.getItem() == ItemInit.TURQUOISE_GEM && stack.getItem() == Items.DIAMOND){
            return true;
        }
        else{
            return false;
        }
    }
}
