package mod.leronus.mores.block.custom;

import mod.leronus.mores.api.content.AbstractAlloyFurnaceBlockEntity;
import mod.leronus.mores.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class AlloyFurnaceBlockEntity extends AbstractAlloyFurnaceBlockEntity
{
    public AlloyFurnaceBlockEntity(BlockPos blockpos, BlockState blockstate)
    {
        super(ModBlockEntities.ALLOY_FURNACE.get(), blockpos, blockstate);
    }

} // end class