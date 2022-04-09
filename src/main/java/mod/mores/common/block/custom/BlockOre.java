package mod.mores.common.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class BlockOre extends OreBlock {
    private final UniformInt xpRange;

    public BlockOre(BlockBehaviour.Properties properties) {
        this(properties, UniformInt.of(0, 0));
    }

    public BlockOre(BlockBehaviour.Properties properties, UniformInt xpRange) {
        super(properties);
        this.xpRange = xpRange;
    }

    public void spawnAfterBreak(BlockState p_55142_, ServerLevel p_55143_, BlockPos p_55144_, ItemStack p_55145_) {
        super.spawnAfterBreak(p_55142_, p_55143_, p_55144_, p_55145_);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(RANDOM) : 0;
    }
}
