package mod.leronus.mores.block.custom;

import mod.leronus.mores.api.content.AbstractAlloyFurnaceBlock;
import mod.leronus.mores.api.content.AbstractAlloyFurnaceBlockEntity;
import mod.leronus.mores.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.network.NetworkHooks;

public class AlloyFurnaceBlock extends AbstractAlloyFurnaceBlock
{
    private static final String DISPLAY_NAME = "block.mores.alloy_furnace";

    public AlloyFurnaceBlock(Properties builder)
    {
        super(builder);
    } // end ctor

    @SuppressWarnings("dep-ann")
    @Override
    public void onRemove(BlockState oldState, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        if (!oldState.is(newState.getBlock()))
        {
            BlockEntity tileEntity = worldIn.getBlockEntity(pos);
            if (tileEntity instanceof AbstractAlloyFurnaceBlockEntity)
            {
                final ItemStackHandler inventory = ((AbstractAlloyFurnaceBlockEntity) tileEntity).inventory;
                for (int slot = 0; slot < inventory.getSlots(); ++slot)
                    Containers.dropItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), inventory.getStackInSlot(slot));
                worldIn.updateNeighbourForOutputSignal(pos, this);
            }
        }
        super.onRemove(oldState, worldIn, pos, newState, isMoving);
    } // end onReplaced

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState bstate,
                                                                  BlockEntityType<T> entityType)
    {
        return createFurnaceTicker(level, entityType, ModBlockEntities.ALLOY_FURNACE.get());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos bpos, BlockState bstate)
    {
        return new AlloyFurnaceBlockEntity(bpos, bstate);
    }

    @Override
    protected void openContainer(Level level, BlockPos bpos, Player player)
    {
        BlockEntity be = level.getBlockEntity(bpos);
        if (be instanceof AlloyFurnaceBlockEntity)
        {
            MenuProvider containerProvider = new MenuProvider() {
                @Override
                public Component getDisplayName() {
                    return Component.translatable(DISPLAY_NAME);
                }

                @Override
                public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player playerEntity)
                {
                    return new AlloyFurnaceContainer(windowId, playerInventory, bpos, playerEntity);
                }
            }; // end anonymous-class
            NetworkHooks.openScreen((ServerPlayer) player, containerProvider, be.getBlockPos());
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        } // end-if
        else {
            throw new IllegalStateException("Our named container provider is missing!");
        }
    }


} // end class