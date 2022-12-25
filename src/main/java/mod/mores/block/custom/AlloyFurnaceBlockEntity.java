package mod.mores.block.custom;

import mod.mores.api.content.AbstractAlloyFurnaceTileEntity;
import mod.mores.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class AlloyFurnaceBlockEntity extends AbstractAlloyFurnaceTileEntity
{
    public AlloyFurnaceBlockEntity(BlockPos blockpos, BlockState blockstate)
    {
        super(ModBlockEntities.ALLOY_FURNACE.get(), blockpos, blockstate);
    }

} // end class