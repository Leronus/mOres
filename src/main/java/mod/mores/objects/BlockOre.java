package mod.mores.objects;

import mod.mores.init.BlockInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockOre extends OreBlock {
    //super(properties, someInt of xp?)
    public BlockOre(Properties properties) {
        super(properties);
    }

    //TODO Deprecated
    //TODO Add deepslate
    protected int xpOnDrop(Random random) {
        if (this == BlockInit.AMETHYST_ORE.get()) {
            return Mth.nextInt(random, 2, 5);
        } else if (this == BlockInit.TOPAZ_ORE.get()) {
            return Mth.nextInt(random, 3, 6);
        } else if (this == BlockInit.TOURMALINE_ORE.get()) {
            return Mth.nextInt(random, 3, 7);
        } else if (this == BlockInit.TANZANITE_ORE.get()) {
            return Mth.nextInt(random, 3, 7);
        } else if (this == BlockInit.SAPPHIRE_ORE.get()) {
            return Mth.nextInt(random, 3, 8);
        } else if (this == BlockInit.RUBY_ORE.get()) {
            return Mth.nextInt(random, 3, 8);
        } else if (this == BlockInit.MOISSANITE_NETHER_ORE.get()) {
            return Mth.nextInt(random, 3, 9);
        } else if (this == BlockInit.MOISSANITE_ORE.get()) {
            return Mth.nextInt(random, 3, 9);
        } else if (this == BlockInit.ONYX_ORE.get()) {
            return Mth.nextInt(random, 4, 10);
        } else if (this == BlockInit.TURQUOISE_ORE.get()) {
            return Mth.nextInt(random, 3, 9);
        } else {
            return this == BlockInit.NETHER_SILVER_ORE.get() ? Mth.nextInt(random, 0, 1) : 0;
        }
    }

    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel world, BlockPos pos, ItemStack stack) {
        super.spawnAfterBreak(state, world, pos, stack);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return super.getExpDrop(state, reader, pos, fortune, silktouch);
    }

    @Override
    public void animateTick(BlockState state, Level world, BlockPos pos, Random random) {
        super.animateTick(state, world, pos, random);
    }

//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable BlockGetter blockReader, List<Component> tooltip, TooltipFlag flagIn) {
//        super.appendHoverText(stack, blockReader, tooltip, flagIn);
//        tooltip.add(Component.nullToEmpty("Harvest Level: " + ChatFormatting.GOLD + getHarvestLevel(this.defaultBlockState())));
//    }

//    @Override
//    public int getHarvestLevel(BlockState state) {
//        return super.getHarvestLevel(state);
//    }


}
