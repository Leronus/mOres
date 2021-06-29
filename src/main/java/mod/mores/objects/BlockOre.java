package mod.mores.objects;

import mod.mores.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockOre extends OreBlock {

    public BlockOre(Properties properties) {
        super(properties);
    }

    //TODO Add deepslate
    @Override
    protected int xpOnDrop(Random random) {
        if (this == BlockInit.AMETHYST_ORE.get()) {
            return MathHelper.nextInt(random, 2, 5);
        } else if (this == BlockInit.TOPAZ_ORE.get()) {
            return MathHelper.nextInt(random, 3, 6);
        } else if (this == BlockInit.TOURMALINE_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.TANZANITE_ORE.get()) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlockInit.SAPPHIRE_ORE.get()) {
            return MathHelper.nextInt(random, 3, 8);
        } else if (this == BlockInit.RUBY_ORE.get()) {
            return MathHelper.nextInt(random, 3, 8);
        } else if (this == BlockInit.MOISSANITE_NETHER_ORE.get()) {
            return MathHelper.nextInt(random, 3, 9);
        } else if (this == BlockInit.MOISSANITE_ORE.get()) {
            return MathHelper.nextInt(random, 3, 9);
        } else if (this == BlockInit.ONYX_ORE.get()) {
            return MathHelper.nextInt(random, 4, 10);
        } else if (this == BlockInit.TURQUOISE_ORE.get()) {
            return MathHelper.nextInt(random, 3, 9);
        } else {
            return this == BlockInit.NETHER_SILVER_ORE.get() ? MathHelper.nextInt(random, 0, 1) : 0;
        }
    }

    @Override
    public void spawnAfterBreak(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.spawnAfterBreak(state, world, pos, stack);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return super.getExpDrop(state, reader, pos, fortune, silktouch);
    }

    @Override
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        super.animateTick(state, world, pos, random);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader blockReader, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, blockReader, tooltip, flagIn);
        tooltip.add(ITextComponent.nullToEmpty("Harvest Level: " + TextFormatting.GOLD + getHarvestLevel(this.defaultBlockState())));
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return super.getHarvestLevel(state);
    }
}
