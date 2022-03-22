package mod.mores.core.world.feature;

import mod.mores.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TIN_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COBALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.NETHER_SILVER_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TOPAZ_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TOURMALINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TOURMALINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TOURMALINE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_TANZANITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.TANZANITE_ORE.get().defaultBlockState())
//            ,OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TANZANITE_ORE.get().defaultBlockState())
            );

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MOISSANITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.MOISSANITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_MOISSANITE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TURQUOISE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TURQUOISE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TURQUOISE_ORE.get().defaultBlockState()));

//    public static final List<OreConfiguration.TargetBlockState> END_ONYX_ORES = List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.ONYX_ORE.get().defaultBlockState()));

        public static final List<OreConfiguration.TargetBlockState> NETHER_MOISSANITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState()));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE = FeatureUtils.register("tin_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COBALT_ORE = FeatureUtils.register("cobalt_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SILVER_ORE = FeatureUtils.register("nether_silver_ore",
            Feature.ORE, new OreConfiguration(NETHER_SILVER_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TOPAZ_ORE = FeatureUtils.register("topaz_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TOURMALINE_ORE = FeatureUtils.register("tourmaline_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TANZANITE_ORE = FeatureUtils.register("tanzanite_ore",
            Feature.ORE, new OreConfiguration(NETHER_TANZANITE_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAPPHIRE_ORE = FeatureUtils.register("sapphire_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TURQUOISE_ORE = FeatureUtils.register("turquoise_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES, 9));

//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ONYX_ORE = FeatureUtils.register("onyx_ore",
//            Feature.ORE, new OreConfiguration(END_ONYX_ORES, 9));
//
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOISSANITE_ORE = FeatureUtils.register("moissanite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES, 9));
//
//    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_MOISSANITE_ORE = FeatureUtils.register("nether_moissanite_ore",
//            Feature.ORE, new OreConfiguration(NETHER_MOISSANITE_ORES, 9));


}
