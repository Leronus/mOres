package mod.mores.objects;

import mod.mores.Mores;
import mod.mores.tileentity.AbstractAlloyFurnaceTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class AbstractBlockAlloyFurnace extends HorizontalBlock{
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    protected AbstractBlockAlloyFurnace(Properties builder) {
        super(builder);

        // Set the default values for our blockstate properties
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(LIT, false)
        );
    }
    @Override
    public boolean hasTileEntity(final BlockState state)
    {
        return true;
    }

    @Nullable
    @Override
    public abstract TileEntity createTileEntity(final BlockState state, final IBlockReader world);

    /**
     * Called on the logical server when a BlockState with a TileEntity is replaced by another BlockState.
     * We use this method to drop all the items from our tile entity's inventory and update comparators near our block.
     *
     * @deprecated Call via {BlockState#onReplaced(World, BlockPos, BlockState, boolean)}
     * Implementing/overriding is fine.
     */
    @Override
    public abstract void onRemove(BlockState oldState, World worldIn, BlockPos pos, BlockState newState, boolean isMoving);

    /**
     * Interface for handling interaction with blocks that implement AbstractAlloyFurnaceBlock. Called in onBlockActivated
     * inside AbstractAlloyFurnaceBlock.
     */
    protected abstract void interactWith(World worldIn, BlockPos pos, PlayerEntity player);

    /**
     * Called when a player right clicks our block.
     * We use this method to open our gui.
     *
     * @deprecated Call via {BlockState#onBlockActivated(World, PlayerEntity, Hand, BlockRayTraceResult)} whenever possible.
     * Implementing/overriding is fine.
     */
    @Override
    public ActionResultType use(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit)
    {
        if (worldIn.isClientSide) {
            return ActionResultType.SUCCESS;
        }
        else {
            this.interactWith(worldIn, pos, player);
            return ActionResultType.CONSUME;
        }
    } // end onBlockActivated()

    /**
     * Makes the block face the player when placed
     */
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    /**
     * We return the redstone calculated from our inventory
     *
     * @deprecated call via {BlockState#getComparatorInputOverride(World, BlockPos)} whenever possible.
     * Implementing/overriding is fine.
     */
    @Override
    public int getAnalogOutputSignal(BlockState blockState, World worldIn, BlockPos pos)
    {
        final TileEntity tileEntity = worldIn.getBlockEntity(pos);
        if (tileEntity instanceof AbstractAlloyFurnaceTileEntity)
            return ItemHandlerHelper.calcRedstoneFromInventory(((AbstractAlloyFurnaceTileEntity) tileEntity).inventory);
        return super.getAnalogOutputSignal(blockState, worldIn, pos);
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate.
     * If inapplicable, returns the passed blockstate.
     *
     * @deprecated call via {@link BlockState#rotate(Rotation)} whenever possible. Implementing/overriding is fine.
     */
    @Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate.
     * If inapplicable, returns the passed blockstate.
     *
     * @deprecated call via {@link BlockState#mirror(Mirror)} whenever possible. Implementing/overriding is fine.
     */
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn)
    {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    /**
     * Called from inside the constructor {@link Block#Block(Properties)} to add all the properties to our blockstate
     */
    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(FACING, LIT);
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to {randomTick} and { #needsRandomTick}, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (stateIn.getValue(LIT))
        {
            double d0 = (double) pos.getX() + 0.5D;
            double d1 = (double) pos.getY();
            double d2 = (double) pos.getZ() + 0.5D;
            if (rand.nextDouble() < 0.1D)
            {
                worldIn.playLocalSound(d0, d1, d2, SoundEvents.FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F,
                        false);
            }

            Direction direction = stateIn.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            // double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;
            double d5 = direction$axis == Direction.Axis.X ? (double) direction.getStepX() * 0.52D : d4;
            double d6 = rand.nextDouble() * 6.0D / 16.0D;
            double d7 = direction$axis == Direction.Axis.Z ? (double) direction.getStepZ() * 0.52D : d4;
            worldIn.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
            worldIn.addParticle(ParticleTypes.SOUL_FIRE_FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
        }
    } // end animateTick()

} // end class

