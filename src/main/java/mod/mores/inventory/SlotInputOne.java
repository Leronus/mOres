package mod.mores.inventory;

import mod.mores.init.ItemInit;
import mod.mores.objects.ItemBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nullable;

public class SlotInputOne extends SlotItemHandler {
    public SlotInputOne(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(@Nullable ItemStack stack) {
        return super.isItemValid(stack) && !stack.isEmpty() && stack.getItem() != null && stack.getItem() instanceof ItemBase;
    }
}
