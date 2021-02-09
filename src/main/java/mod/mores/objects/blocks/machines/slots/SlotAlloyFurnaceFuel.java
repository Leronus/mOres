package mod.mores.objects.blocks.machines.slots;

import mod.mores.objects.blocks.machines.TileEntityAlloyFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotAlloyFurnaceFuel extends SlotItemHandler {
    public SlotAlloyFurnaceFuel(IItemHandler handler, int index, int xPosition, int yPosition) {
        super(handler, index, xPosition, yPosition);
    }
    public boolean isItemValid(ItemStack stack){
        return TileEntityAlloyFurnace.isItemFuel(stack);
    }
    public int getItemStackLimit(ItemStack stack){
        return super.getItemStackLimit(stack);
    }
}
