package mod.mores.world;

import mod.mores.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
    //Create new fillerBlockType
    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);

    public static void generateOres(final BiomeLoadingEvent event) {
        //Overworld
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.TIN_ORE.get().defaultBlockState(), 11, 50, 80, 39);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 45, 75, 34);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SILVER_ORE.get().defaultBlockState(), 9, 31, 58, 26);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.COBALT_ORE.get().defaultBlockState(), 9, 22, 49, 22);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.AMETHYST_ORE.get().defaultBlockState(), 9, 17, 41, 18);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.TOPAZ_ORE.get().defaultBlockState(), 6, 14, 31, 11);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 5, 13, 27, 14);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 4, 15, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 14, 7);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 5);
        }
        //Nether
        else if (event.getCategory().equals(Biome.Category.NETHER)){
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES,
                    BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 5, 0, 100, 35);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 5, 0, 50, 16);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    BlockInit.TANZANITE_ORE.get().defaultBlockState(), 5, 15, 70, 25);
        }
        //End
        else if (event.getCategory().equals(Biome.Category.NETHER)){
            generateOre(event.getGeneration(), END_STONE,
                    BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 10);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }
}
