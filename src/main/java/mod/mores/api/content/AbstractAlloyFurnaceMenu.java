package mod.mores.api.content;

import javax.annotation.Nonnull;

import mod.mores.api.helpers.FurnaceResultSlotItemHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public abstract class AbstractAlloyFurnaceMenu extends AbstractContainerMenu
{
    public static final int INPUT1_SLOT = 0;
    public static final int INPUT2_SLOT = 1;
    public static final int CATALYST_SLOT = 2;
    public static final int OUTPUT_SLOT = 3;
    public static final int FUEL_SLOT = 4;

    public static final int DATA_FUEL_TIME_LEFT = 0;
    public static final int DATA_FUEL_TIME_MAX = 1;
    public static final int DATA_COOKING_PROGRESS = 2;
    public static final int DATA_COOKING_TOTAL_TIME = 3;
    public static final int NUM_DATA_VALUES = 4;

    protected final BlockEntity blockEntity;
    protected final Player playerEntity;
    protected IItemHandler playerInventory;
    protected Container recipeInv;
    protected ContainerData data;


    public AbstractAlloyFurnaceMenu(MenuType<?> menutype, int id, BlockPos pos, Inventory playerInventory, Player player)
    {
        super(menutype, id);
        this.blockEntity = player.getCommandSenderWorld().getBlockEntity(pos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        if (blockEntity != null && blockEntity instanceof AbstractAlloyFurnaceTileEntity)
        {
            this.recipeInv = new RecipeWrapper(((AbstractAlloyFurnaceTileEntity) this.blockEntity).inventory);
            this.data = ((AbstractAlloyFurnaceTileEntity) this.blockEntity).dataAccess;

            // Add tracking for data (Syncs to client/updates value when it changes)
            this.addDataSlots(data);

            // Add all the slots for the tileEntity's inventory and the playerInventory to
            // this container
            blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
                addSlot(new SlotItemHandler(h, INPUT1_SLOT, 56, 53));
                addSlot(new SlotItemHandler(h, INPUT2_SLOT, 44, 17));
                addSlot(new SlotItemHandler(h, CATALYST_SLOT, 66, 17));
                addSlot(new SlotItemHandler(h, FUEL_SLOT, 8, 53));
                addSlot(new FurnaceResultSlotItemHandler(player, h, blockEntity, OUTPUT_SLOT, 115, 36));
            });
        }

        final int playerInventoryStartX = 8;
        final int playerInventoryStartY = 84;
        layoutPlayerInventorySlots(playerInventoryStartX, playerInventoryStartY);
    }

    protected int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx)
    {
        for (int i = 0; i < amount; i++)
        {
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    protected int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount,
                             int dy)
    {
        for (int j = 0; j < verAmount; j++)
        {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    protected void layoutPlayerInventorySlots(int leftCol, int topRow)
    {
        // Player inventory
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }

    @Nonnull
    @Override
    public ItemStack quickMoveStack(final Player player, final int index)
    {
        ItemStack returnStack = ItemStack.EMPTY;
        final Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            final ItemStack slotStack = slot.getItem();
            returnStack = slotStack.copy();

            final int containerSlots =
                    this.slots.size() - player.getInventory().items.size();
            if (index < containerSlots)
            {
                if (!moveItemStackTo(slotStack, containerSlots, this.slots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!moveItemStackTo(slotStack, 0, containerSlots, false))
            {
                return ItemStack.EMPTY;
            }
            if (slotStack.getCount() == 0)
            {
                slot.set(ItemStack.EMPTY);
            }
            else {
                slot.setChanged();
            }
            if (slotStack.getCount() == returnStack.getCount())
            {
                return ItemStack.EMPTY;
            }
            slot.onTake(player, slotStack);
        }
        return returnStack;
    } // end transferStackInSlot()

    @Override
    public boolean stillValid(@Nonnull final Player player)
    {
        return stillValid(ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos()),
                player, blockEntity.getBlockState().getBlock());
    }

    public int getBurnProgress(int pixels)
    {
        int i = this.data.get(DATA_COOKING_PROGRESS);
        int j = this.data.get(DATA_COOKING_TOTAL_TIME);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    public int getLitProgress(int pixels)
    {
        int i = this.data.get(DATA_FUEL_TIME_MAX);
        int j = this.data.get(DATA_FUEL_TIME_LEFT);
        if (i == 0)
        {
            i = AbstractAlloyFurnaceTileEntity.DEFAULT_ALLOY_TIME;
        }
        return  j * pixels / i;
    }

    public boolean isLit() {
        return this.data.get(DATA_FUEL_TIME_LEFT) > 0;
    }


} // end class