package mod.mores.objects;

import mod.mores.init.TileEntityTypeInit;
import mod.mores.tileentity.AbstractAlloyFurnaceTileEntity;
import mod.mores.tileentity.AlloyFurnaceTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class BlockAlloyFurnace extends AbstractBlockAlloyFurnace {
    public BlockAlloyFurnace(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get().create();
    }

    /**
     * Called on the logical server when a BlockState with a TileEntity is replaced by another BlockState.
     * We use this method to drop all the items from our tile entity's inventory and update comparators near our block.
     *
     * @deprecated Call via {BlockState#onReplaced(World, BlockPos, BlockState, boolean)}
     * Implementing/overriding is fine.
     */
    @Override
    public void onRemove(BlockState oldState, World worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if (!oldState.is(newState.getBlock()))
        {
            TileEntity tileEntity = worldIn.getBlockEntity(pos);
            if (tileEntity instanceof AbstractAlloyFurnaceTileEntity)
            {
                final ItemStackHandler inventory = ((AbstractAlloyFurnaceTileEntity) tileEntity).inventory;
                for (int slot = 0; slot < inventory.getSlots(); ++slot)
                    InventoryHelper.dropItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), inventory.getStackInSlot(slot));
                worldIn.updateNeighbourForOutputSignal(pos, this);
            }
        }
    } // end onReplaced


    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player)
    {
        final TileEntity tileEntity = worldIn.getBlockEntity(pos);
        if (tileEntity instanceof AlloyFurnaceTileEntity) {
            NetworkHooks.openGui((ServerPlayerEntity) player, (AlloyFurnaceTileEntity) tileEntity, pos);
        }
    }

} // end class