package mod.mores.world;

import mod.mores.init.BlockInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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

/**
 * This class handles the ore generation for all ores added by mOres
 * @author Leronus
 */
public class OreGeneration {
    //Create new fillerBlockType
    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);

    public static final RuleTest NATURAL_STONE = OreFeatureConfig.FillerBlockType.NATURAL_STONE;
    public static final RuleTest NETHERRACK = OreFeatureConfig.FillerBlockType.NETHERRACK;

    /**
     * Generates all the ores in the three different world biomes
     * @param event Type of world biome
     */
    public static void generateOres(final BiomeLoadingEvent event) {
        //Overworld
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TIN_ORE.get().defaultBlockState(), 11, 54, 145, 28);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 47, 130, 26);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.SILVER_ORE.get().defaultBlockState(), 7, 31, 65, 18);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.COBALT_ORE.get().defaultBlockState(), 6, 22, 42, 14);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.AMETHYST_ORE.get().defaultBlockState(), 7, 17, 34, 12);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 5);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 5, 11, 23, 6);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 3, 11, 2);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 4, 13, 1);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 4);
        }
        //Nether
        else if (event.getCategory().equals(Biome.Category.NETHER)){
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 9, 0, 100, 29);
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 5, 0, 50, 16);
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.TANZANITE_ORE.get().defaultBlockState(), 6, 15, 70, 14);
        }
        //End
        else if (event.getCategory().equals(Biome.Category.THEEND)){
            generateOre(event.getGeneration(), END_STONE,
                    BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 7);
        }
    }

    /**
     * Function used for the generation of the ores
     * @param settings Type of generation
     * @param fillerType Blocks surrounding the generated ore
     * @param state The blockstate
     * @param veinSize Maximum vein size
     * @param minHeight Minimum ore generation height
     * @param maxHeight Maximum ore generation height
     * @param amount Number of times the generated ore could spawn
     */
    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }
}
