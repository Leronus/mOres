package mod.mores.world;

import mod.mores.init.BlockInit;
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
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.codec.language.bm.Rule;

/**
 * This class handles the ore generation for all ores added by mOres
 * @author Leronus
 */
public class DeepslateOreGeneration {
    //Create new fillerBlockType
    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final RuleTest NATURAL_STONE = OreFeatureConfig.FillerBlockType.NATURAL_STONE;
    public static final RuleTest NETHERRACK = OreFeatureConfig.FillerBlockType.NETHERRACK;
    public static final RuleTest DEEPSLATE = new BlockMatchRuleTest(BlockInit.DEEPSLATE_BLOCK.get());

    /**
     * Generates deepslate in the overworld
     * @param event Type of world biome
     */
    public static void generateDeepslate(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.DEEPSLATE_BLOCK.get().defaultBlockState(), 30, 0, 12, 100);
        }
    }

    /**
     * Generates all the ores in the three different world biomes
     * @param event Type of world biome
     */
    public static void generateOres(final BiomeLoadingEvent event) {
        //Overworld
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {

            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TIN_ORE.get().defaultBlockState(), 11, 54, 145, 34);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 47, 130, 32);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.SILVER_ORE.get().defaultBlockState(), 7, 31, 65, 18);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.COBALT_ORE.get().defaultBlockState(), 6, 22, 42, 17);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.AMETHYST_ORE.get().defaultBlockState(), 7, 17, 34, 15);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 9);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 5, 11, 23, 11);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 4, 15, 4);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 14, 6);
            generateOre(event.getGeneration(), NATURAL_STONE,
                    BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 5);

            //Deepslate
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_TIN_ORE.get().defaultBlockState(), 11, 54, 145, 34);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_COPPER_ORE.get().defaultBlockState(), 10, 47, 130, 32);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState(), 7, 31, 65, 18);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_COBALT_ORE.get().defaultBlockState(), 6, 22, 42, 17);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState(), 7, 17, 34, 15);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 9);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_TOURMALINE_ORE.get().defaultBlockState(), 5, 11, 23, 11);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState(), 4, 4, 15, 4);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_RUBY_ORE.get().defaultBlockState(), 4, 6, 14, 6);
            generateOre(event.getGeneration(), DEEPSLATE,
                    BlockInit.DEEPSLATE_TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 5);
        }
        //Nether
        else if (event.getCategory().equals(Biome.Category.NETHER)){
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 10, 0, 100, 35);
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 4, 0, 50, 16);
            generateOre(event.getGeneration(), NETHERRACK,
                    BlockInit.TANZANITE_ORE.get().defaultBlockState(), 5, 15, 70, 25);
        }
        //End
        else if (event.getCategory().equals(Biome.Category.THEEND)){
            generateOre(event.getGeneration(), END_STONE,
                    BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 8);
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
