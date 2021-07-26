//package mod.mores.objects;
//
//import mod.mores.init.BlockEntityTypeInit;
//import mod.mores.tileentity.AbstractAlloyFurnaceBlockEntity;
//import mod.mores.tileentity.AlloyFurnaceBlockEntity;
//import net.minecraft.block.AbstractBlock;
//import net.minecraft.core.BlockPos;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.ServerPlayerEntity;
//import net.minecraft.inventory.InventoryHelper;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.tileentity.BlockEntity;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.Containers;
//import net.minecraft.world.IBlockReader;
//import net.minecraft.world.Level;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraftforge.fml.network.NetworkHooks;
//import net.minecraftforge.fmllegacy.network.NetworkHooks;
//import net.minecraftforge.items.ItemStackHandler;
//import org.jetbrains.annotations.Nullable;
//
//public class BlockAlloyFurnace extends AbstractBlockAlloyFurnace {
//    public BlockAlloyFurnace(Properties properties) {
//        super(properties);
//    }
//
////    @Override
////    public boolean hasBlockEntity(BlockState state) {
////        return true;
////    }
////
////    @Nullable
////    @Override
////    public BlockEntity createBlockEntity(BlockState state, IBlockReader world) {
////        return BlockEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get().create();
////    }
//
//    /**
//     * Called on the logical server when a BlockState with a BlockEntity is replaced by another BlockState.
//     * We use this method to drop all the items from our tile entity's inventory and update comparators near our block.
//     *
//     * @deprecated Call via {BlockState#onReplaced(Level, BlockPos, BlockState, boolean)}
//     * Implementing/overriding is fine.
//     */
//    @Override
//    public void onRemove(BlockState oldState, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving)
//    {
//        if (!oldState.is(newState.getBlock()))
//        {
//            BlockEntity tileEntity = worldIn.getBlockEntity(pos);
//            if (tileEntity instanceof AbstractAlloyFurnaceBlockEntity)
//            {
//                final ItemStackHandler inventory = ((AbstractAlloyFurnaceBlockEntity) tileEntity).inventory;
//                for (int slot = 0; slot < inventory.getSlots(); ++slot)
//                    Containers.dropItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), inventory.getStackInSlot(slot));
//                worldIn.updateNeighbourForOutputSignal(pos, this);
//            }
//        }
//    } // end onReplaced
//
//
//    @Override
//    protected void interactWith(Level worldIn, BlockPos pos, Player player)
//    {
//        final BlockEntity tileEntity = worldIn.getBlockEntity(pos);
//        if (tileEntity instanceof AlloyFurnaceBlockEntity) {
//            NetworkHooks.openGui((ServerPlayer) player, (AlloyFurnaceBlockEntity) tileEntity, pos);
//        }
//    }
//
//} // end class