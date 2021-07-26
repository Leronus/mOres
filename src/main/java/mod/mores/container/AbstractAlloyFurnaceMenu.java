//package mod.mores.container;
//
//import mod.mores.helper.FunctionalIntReferenceHolder;
//import mod.mores.objects.BlockAlloyFurnace;
//import mod.mores.helper.FurnaceResultSlotItemHandler;
//import mod.mores.tileentity.AbstractAlloyFurnaceBlockEntity;
//import net.minecraft.world.Container;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.ContainerLevelAccess;
//import net.minecraft.world.inventory.MenuType;
//import net.minecraft.world.inventory.Slot;
//import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.fmllegacy.RegistryObject;
//import net.minecraftforge.items.SlotItemHandler;
//
//import javax.annotation.Nonnull;
//
//public abstract class AbstractAlloyFurnaceContainer<T extends BlockAlloyFurnace> implements Container {
//    protected RegistryObject<T> my_block;
//
//    public final AbstractAlloyFurnaceBlockEntity tileEntity;
//    protected final ContainerLevelAccess canInteractWithCallable;
//
//    public AbstractAlloyFurnaceContainer(MenuType<?> type, int id, final Inventory playerInventory,
//                                         final AbstractAlloyFurnaceBlockEntity tileEntity,
//                                         final RegistryObject<T> block)
//    {
//        super(type, id);
//        this.tileEntity = tileEntity;
//        this.canInteractWithCallable = ContainerLevelAccess.create(tileEntity.getLevel(), tileEntity.getBlockPos());
//        this.my_block = block;
//
//        // Add tracking for data (Syncs to client/updates value when it changes)
//        this.addDataSlot(new FunctionalIntReferenceHolder(() -> tileEntity.smeltTimeLeft, v -> tileEntity.smeltTimeLeft = (short) v));
//        this.addDataSlot(new FunctionalIntReferenceHolder(() -> tileEntity.maxSmeltTime, v -> tileEntity.maxSmeltTime = (short) v));
//        this.addDataSlot(new FunctionalIntReferenceHolder(() -> tileEntity.fuelBurnTimeLeft, v -> tileEntity.fuelBurnTimeLeft = (int) v));
//        this.addDataSlot(new FunctionalIntReferenceHolder(() -> tileEntity.maxFuelBurnTime, v -> tileEntity.maxFuelBurnTime = (int) v));
//
//        // Add all the slots for the tileEntity's inventory and the playerInventory to this container
//
//        // Tile inventory slot(s)
//        this.addSlot(new SlotItemHandler(tileEntity.inventory, AbstractAlloyFurnaceBlockEntity.FUEL_SLOT, 56, 53));
//        this.addSlot(new SlotItemHandler(tileEntity.inventory, AbstractAlloyFurnaceBlockEntity.INPUT1_SLOT, 44, 17));
//        this.addSlot(new SlotItemHandler(tileEntity.inventory, AbstractAlloyFurnaceBlockEntity.INPUT2_SLOT, 66, 17));
//        this.addSlot(new SlotItemHandler(tileEntity.inventory, AbstractAlloyFurnaceBlockEntity.CATALYST_SLOT, 8, 53));
//        this.addSlot(new FurnaceResultSlotItemHandler(playerInventory.player, tileEntity,
//                tileEntity.inventory, AbstractAlloyFurnaceBlockEntity.OUTPUT_SLOT, 115, 36));
//
//        final int playerInventoryStartX = 8;
//        final int playerInventoryStartY = 84;
//        final int slotSizePlus2 = 18; // slots are 16x16, plus 2 (for spacing/borders) is 18x18
//
//        // Player Top Inventory slots
//        for (int row = 0; row < 3; ++row) {
//            for (int column = 0; column < 9; ++column) {
//                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column, playerInventoryStartX + (column * slotSizePlus2), playerInventoryStartY + (row * slotSizePlus2)));
//            }
//        }
//
//        final int playerHotbarY = playerInventoryStartY + slotSizePlus2 * 3 + 4;
//        // Player Hotbar slots
//        for (int column = 0; column < 9; ++column) {
//            this.addSlot(new Slot(playerInventory, column, playerInventoryStartX + (column * slotSizePlus2), playerHotbarY));
//        }
//    }
//
//    /**
//     * Generic & dynamic version of {Container#transferStackInSlot(Player, int)}.
//     * Handle when the stack in slot {@code index} is shift-clicked.
//     * Normally this moves the stack between the player inventory and the other inventory(s).
//     *
//     * @param player the player passed in
//     * @param index  the index passed in
//     * @return the {@link ItemStack}
//     */
//    @Nonnull
//    @Override
//    public ItemStack quickMoveStack(final Player player, final int index)
//    {
//        ItemStack returnStack = ItemStack.EMPTY;
//        final Slot slot = this.slots.get(index);
//        if (slot != null && slot.hasItem()) {
//            final ItemStack slotStack = slot.getItem();
//            returnStack = slotStack.copy();
//
//            final int containerSlots =
//                    this.slots.size() - player.inventory.items.size();
//            if (index < containerSlots)
//            {
//                if (!moveItemStackTo(slotStack, containerSlots, this.slots.size(), true))
//                {
//                    return ItemStack.EMPTY;
//                }
//            }
//            else if (!moveItemStackTo(slotStack, 0, containerSlots, false))
//            {
//                return ItemStack.EMPTY;
//            }
//            if (slotStack.getCount() == 0)
//            {
//                slot.set(ItemStack.EMPTY);
//            }
//            else {
//                slot.setChanged();
//            }
//            if (slotStack.getCount() == returnStack.getCount())
//            {
//                return ItemStack.EMPTY;
//            }
//            slot.onTake(player, slotStack);
//        }
//        return returnStack;
//    } // end transferStackInSlot()
//
//    @Override
//    public boolean stillValid(@Nonnull final Player player)
//    {
//        return stillValid(canInteractWithCallable, player, my_block.get());
//    }
//
//}