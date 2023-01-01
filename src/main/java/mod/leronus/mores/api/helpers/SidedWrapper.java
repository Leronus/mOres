package mod.leronus.mores.api.helpers;

import javax.annotation.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;

public class SidedWrapper implements IItemHandlerModifiable
{
    protected final IItemHandlerModifiable inventory;
    @Nullable
    protected final Direction side;


    public SidedWrapper(IItemHandlerModifiable inventory, Direction side)
    {
        this.inventory = inventory;
        this.side = side;
    }

    public boolean isHorizontalSide(Direction sideb)
    {
        return (sideb == Direction.EAST || sideb == Direction.NORTH || sideb == Direction.SOUTH || sideb == Direction.WEST);
    }

    @Override
    public int getSlots()
    {
        return inventory.getSlots();
    }

    @Override
    public ItemStack getStackInSlot(int slot)
    {
        return inventory.getStackInSlot(slot);
    }

    @Override
    public ItemStack insertItem(int slot, ItemStack stack, boolean simulate)
    {
        return inventory.insertItem(slot, stack, simulate);
    }

    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate)
    {
        return inventory.extractItem(slot, amount, simulate);
    }

    @Override
    public int getSlotLimit(int slot)
    {
        return inventory.getSlotLimit(slot);
    }

    @Override
    public boolean isItemValid(int slot, ItemStack stack)
    {
        return inventory.isItemValid(slot, stack);
    }

    @Override
    public void setStackInSlot(int slot, ItemStack stack)
    {
        inventory.setStackInSlot(slot, stack);
    }

} // end class