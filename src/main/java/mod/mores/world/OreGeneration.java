package mod.mores.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import mod.mores.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.RangeDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * This class handles the ore generation for all ores added by mOres
 * @author Leronus
 */
public class OreGeneration {
    public static void initOres() {
		/*
		ORE_GOLD = register("ore_gold",
		Feature.ORE.configured(new OreConfiguration(ORE_GOLD_TARGET_LIST, 9))
		.rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(31)).squared().count(2));
		ORE_GOLD_TARGET_LIST = ImmutableList.of(
		OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, Features.States.GOLD_ORE),
		OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, Features.States.DEEPSLATE_GOLD_ORE));
		 */
        ImmutableList<OreConfiguration.TargetBlockState> SAPPHIRE_ORE_TARGETS = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockInit.SAPPHIRE_ORE.get().defaultBlockState()),
                // TODO add Deepslate ore variant
                OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())

        );
        ImmutableList<OreConfiguration.TargetBlockState> NETHER_SILVER_ORE_TARGETS = ImmutableList.of(
                OreConfiguration.target(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES, BlockInit.NETHER_SILVER_ORE.get().defaultBlockState()));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, BlockInit.NETHER_SILVER_ORE.get().getRegistryName(),
                Feature.ORE
                        .configured(new OreConfiguration(NETHER_SILVER_ORE_TARGETS, 10 /*veinSize*/))
                        .rangeUniform(
                                VerticalAnchor.absolute(0 /*minY*/),
                                VerticalAnchor.absolute(100 /*maxY*/))
                        .squared()
                        .count(35 /*veinCount*/));
    }

    public static void setupOres() {
        for (Map.Entry<ResourceKey<Biome>, Biome> biome : BuiltinRegistries.BIOME.entrySet()) {
            if (!biome.getValue().getBiomeCategory().equals(Biome.BiomeCategory.NETHER)
                    && !biome.getValue().getBiomeCategory().equals(Biome.BiomeCategory.THEEND)) {
                addFeatureToBiome(biome.getValue(), GenerationStep.Decoration.UNDERGROUND_ORES,
                        BuiltinRegistries.CONFIGURED_FEATURE.get(BlockInit.NETHER_SILVER_ORE.get().getRegistryName()));
            }
        }
    }

    public static void addFeatureToBiome(Biome biome, GenerationStep.Decoration decoration,
                                         ConfiguredFeature<?, ?> configuredFeature) {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(
                biome.getGenerationSettings().features());
        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.getGenerationSettings(), biomeFeatures,
                "features");
    }
//        //Overworld
//        if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
//            generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE,
//                    BlockInit.TIN_ORE.get().defaultBlockState(), 11, 50, 80, 34);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 45, 75, 32);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.SILVER_ORE.get().defaultBlockState(), 7, 31, 58, 16);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.COBALT_ORE.get().defaultBlockState(), 6, 22, 39, 17);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.AMETHYST_ORE.get().defaultBlockState(), 7, 17, 31, 15);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 10);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 5, 11, 23, 12);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 4, 15, 4);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 14, 6);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                    BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 5);
//        }
//        //Nether
//        else if (event.getCategory().equals(Biome.BiomeCategory.NETHER)){
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
//                    BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 10, 0, 100, 35);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
//                    BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 4, 0, 50, 16);
//            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
//                    BlockInit.TANZANITE_ORE.get().defaultBlockState(), 5, 15, 70, 25);
//        }
//        //End
//        else if (event.getCategory().equals(Biome.BiomeCategory.THEEND)){
//            generateOre(event.getGeneration(), END_STONE,
//                    BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 8);
//        }
//    }
//
//    /**
//     * Function used for the generation of the ores
//     * @param settings Type of generation
//     * @param fillerType Blocks surrounding the generated ore
//     * @param state The blockstate
//     * @param veinSize Maximum vein size
//     * @param minHeight Minimum ore generation height
//     * @param maxHeight Maximum ore generation height
//     * @param amount Number of times the generated ore could spawn
//     */
//    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
//                                    int veinSize, int minHeight, int maxHeight, int amount) {
//        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
//                Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
//                        .decorated(RangeDecorator.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
//                        .squared().count(amount));
}

