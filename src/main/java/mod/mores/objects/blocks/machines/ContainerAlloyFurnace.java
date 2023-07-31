package mod.mores.objects.blocks.machines;

import mod.mores.objects.blocks.machines.slots.SlotOutput;
import mod.mores.objects.blocks.machines.slots.SlotAlloyFurnaceFuel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerAlloyFurnace extends Container
{
    public static final int INPUT_LEFT = 0;
    public static final int INPUT_RIGHT = 1;
    public static final int INPUT_FUEL = 2;
    public static final int OUTPUT = 3;

    private final TileEntityAlloyFurnace tileentity;
    private int cookTime, totalCookTime, burnTime, currentBurnTime;

    public ContainerAlloyFurnace(InventoryPlayer player, TileEntityAlloyFurnace tileentity)
    {
        this.tileentity = tileentity;
        IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

        //Top Left Input Slot
        this.addSlotToContainer(new SlotItemHandler(handler, INPUT_LEFT, 44, 17));
        //Top Right Input Slot
        this.addSlotToContainer(new SlotItemHandler(handler, INPUT_RIGHT, 66, 17));
        //Bottom Fuel Input Slot
        this.addSlotToContainer(new SlotAlloyFurnaceFuel(handler, INPUT_FUEL, 56, 53));
        //Far Right Output Slot
        this.addSlotToContainer(new SlotOutput(handler, OUTPUT, 115, 36));

        for(int y = 0; y < 3; y++)
        {
            for(int x = 0; x < 9; x++)
            {
                this.addSlotToContainer(new Slot(player, x + y*9 + 9, 8 + x*18, 84 + y*18));
            }
        }

        for(int x = 0; x < 9; x++)
        {
            this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
        }
    }

    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for(int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener listener = (IContainerListener)this.listeners.get(i);

            if(this.cookTime != this.tileentity.getField(2)) listener.sendWindowProperty(this, 2, this.tileentity.getField(2));
            if(this.burnTime != this.tileentity.getField(0)) listener.sendWindowProperty(this, 0, this.tileentity.getField(0));
            if(this.currentBurnTime != this.tileentity.getField(1)) listener.sendWindowProperty(this, 1, this.tileentity.getField(1));
            if(this.totalCookTime != this.tileentity.getField(3)) listener.sendWindowProperty(this, 3, this.tileentity.getField(3));
        }

        this.cookTime = this.tileentity.getField(2);
        this.burnTime = this.tileentity.getField(0);
        this.currentBurnTime = this.tileentity.getField(1);
        this.totalCookTime = this.tileentity.getField(3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tileentity.setField(id, data);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.tileentity.isUsableByPlayer(playerIn);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally
     * this moves the stack between the player inventory and the other
     * inventory(s).
     */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // output slot?
            if (index == OUTPUT)
            {
                if (!this.mergeItemStack(itemstack1, 4, 40, true))
                {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(itemstack1, itemstack);
            }
            // player inv/hotbar slot?
            else if (index > OUTPUT )
            {
                // inputs
                if(AlloyFurnaceRecipes.isItemInput(itemstack1))
                {
                    if(!this.mergeItemStack(itemstack1, 0, 1, false)
                            && !this.mergeItemStack(itemstack1, 1, 2, false))
                        if (!this.mergeItemStack(itemstack1, 2, 3, false) && itemstack1.getItem() == Items.COAL)
                            return ItemStack.EMPTY;
                }
                // fusion furnace uses standard fuel.
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 2, 3, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                // catalysts
//                else if(AlloyFurnaceRecipes.isItemCatalyst(itemstack1))
//                {
//                    if (!this.mergeItemStack(itemstack1, 4, 5, false))
//                        return ItemStack.EMPTY;
//                }
                else if (index < 31)
                {
                    if (!this.mergeItemStack(itemstack1, 31, 40, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 31 && index < 40 && !this.mergeItemStack(itemstack1, 4, 31, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 4, 40, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
}
