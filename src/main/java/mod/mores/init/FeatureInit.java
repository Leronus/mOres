package mod.mores.init;

import mod.mores.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

    public static void addOres(final BiomeLoadingEvent event) {
//        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                BlockInit.TIN_ORE.get().defaultBlockState(), 4, 0, 60, 20);
    }
}
