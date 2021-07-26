//package mod.mores.container;
//
//import mod.mores.init.BlockInit;
//import mod.mores.init.ContainerInit;
//import mod.mores.objects.BlockAlloyFurnace;
//import mod.mores.tileentity.AbstractAlloyFurnaceBlockEntity;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.block.entity.BlockEntity;
//
//import java.util.Objects;
//
///**
// * Smelt time is synced with Server: Each tick {#detectAndSendChanges()}
// * is called ({ServerPlayerEntity#tick()}) Server: The (tracked) value of
// * the tile's energy is updated (#updateProgressBar(int, int)}) Server:
// * If the value is different from the value last sent to the client
// * ({IntReferenceHolder#isDirty()}), it is synced to the client
// * ({ServerPlayerEntity#sendWindowProperty(Container, int, int)}) Client:
// * The sync packet is received
// * ({ClientPlayNetHandler#handleWindowProperty(SWindowPropertyPacket)})
// * and the tracked value of is updated
// * ({Container#updateProgressBar(int, int)}) Client: The tile's data is
// * set to the new value
// *
// * @author Leronus
// */
//public class AlloyFurnaceMenu extends AbstractAlloyFurnaceContainer<BlockAlloyFurnace>
//{
//    /**
//     * Logical-client-side constructor, called from {ContainerType#create(IContainerFactory)}
//     * Calls the logical-server-side constructor with the TileEntity at the pos in the PacketBuffer
//     */
//    public AlloyFurnaceMenu(final int windowId, final Inventory playerInventory,
//                            final FriendlyByteBuf data)
//    {
//        this(windowId, playerInventory, getTileEntity(playerInventory, data));
//    }
//
//    /**
//     * Constructor called logical-server-side from {FusionFurnaceTileEntity#createMenu}
//     * and logical-client-side from {#FusionFurnaceContainer(int, Inventory, PacketBuffer)}
//     */
//    public AlloyFurnaceMenu(final int windowId, final Inventory playerInventory,
//                            final AbstractAlloyFurnaceBlockEntity tileEntity)
//    {
//        super(ContainerInit.ALLOY_FURNACE.get(), windowId, playerInventory, tileEntity, BlockInit.ALLOY_FURNACE);
//
//    }  // end-ctor server-side
//
//    private static AbstractAlloyFurnaceBlockEntity getTileEntity(final Inventory playerInventory, final FriendlyByteBuf data)
//    {
//        Objects.requireNonNull(playerInventory, "playerInventory cannot be null!");
//        Objects.requireNonNull(data, "data cannot be null!");
//        final BlockEntity tileAtPos = playerInventory.player.level.getBlockEntity(data.readBlockPos());
//        if (tileAtPos instanceof AbstractAlloyFurnaceBlockEntity) return (AbstractAlloyFurnaceBlockEntity) tileAtPos;
//        throw new IllegalStateException("Tile entity is not correct! " + tileAtPos);
//    } // end getTileEntity()
//
//    @Override
//    public int getContainerSize() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public ItemStack getItem(int p_18941_) {
//        return null;
//    }
//
//    @Override
//    public ItemStack removeItem(int p_18942_, int p_18943_) {
//        return null;
//    }
//
//    @Override
//    public ItemStack removeItemNoUpdate(int p_18951_) {
//        return null;
//    }
//
//    @Override
//    public void setItem(int p_18944_, ItemStack p_18945_) {
//
//    }
//
//    @Override
//    public void setChanged() {
//
//    }
//
//    @Override
//    public void clearContent() {
//
//    }
//} // end class