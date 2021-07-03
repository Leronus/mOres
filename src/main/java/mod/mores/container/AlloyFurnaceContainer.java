package mod.mores.container;

import mod.mores.init.BlockInit;
import mod.mores.init.ContainerInit;
import mod.mores.init.TileEntityTypeInit;
import mod.mores.objects.BlockAlloyFurnace;
import mod.mores.tileentity.AbstractAlloyFurnaceTileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;

import java.util.Objects;

/**
 * Smelt time is synced with Server: Each tick {#detectAndSendChanges()}
 * is called ({ServerPlayerEntity#tick()}) Server: The (tracked) value of
 * the tile's energy is updated (#updateProgressBar(int, int)}) Server:
 * If the value is different from the value last sent to the client
 * ({IntReferenceHolder#isDirty()}), it is synced to the client
 * ({ServerPlayerEntity#sendWindowProperty(Container, int, int)}) Client:
 * The sync packet is received
 * ({ClientPlayNetHandler#handleWindowProperty(SWindowPropertyPacket)})
 * and the tracked value of is updated
 * ({Container#updateProgressBar(int, int)}) Client: The tile's data is
 * set to the new value
 *
 * @author Leronus
 */
public class AlloyFurnaceContainer extends AbstractAlloyFurnaceContainer<BlockAlloyFurnace>
{
    /**
     * Logical-client-side constructor, called from {ContainerType#create(IContainerFactory)}
     * Calls the logical-server-side constructor with the TileEntity at the pos in the PacketBuffer
     */
    public AlloyFurnaceContainer(final int windowId, final PlayerInventory playerInventory,
                                  final PacketBuffer data)
    {
        this(windowId, playerInventory, getTileEntity(playerInventory, data));
    }

    /**
     * Constructor called logical-server-side from {FusionFurnaceTileEntity#createMenu}
     * and logical-client-side from {#FusionFurnaceContainer(int, PlayerInventory, PacketBuffer)}
     */
    public AlloyFurnaceContainer(final int windowId, final PlayerInventory playerInventory,
                                  final AbstractAlloyFurnaceTileEntity tileEntity)
    {
        super(ContainerInit.ALLOY_FURNACE.get(), windowId, playerInventory, tileEntity, BlockInit.ALLOY_FURNACE);

    }  // end-ctor server-side

    private static AbstractAlloyFurnaceTileEntity getTileEntity(final PlayerInventory playerInventory, final PacketBuffer data)
    {
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null!");
        Objects.requireNonNull(data, "data cannot be null!");
        final TileEntity tileAtPos = playerInventory.player.level.getBlockEntity(data.readBlockPos());
        if (tileAtPos instanceof AbstractAlloyFurnaceTileEntity) return (AbstractAlloyFurnaceTileEntity) tileAtPos;
        throw new IllegalStateException("Tile entity is not correct! " + tileAtPos);
    } // end getTileEntity()

} // end class