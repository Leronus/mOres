//package mod.mores.world;
//
//import mod.mores.config.Config;
//import mod.mores.init.BlockInit;
//import net.minecraft.block.AbstractBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.gen.GenerationStage;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.OreFeatureConfig;
//import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
//import net.minecraft.world.gen.feature.template.RuleTest;
//import net.minecraft.world.gen.placement.Placement;
//import net.minecraft.world.gen.placement.TopSolidRangeConfig;
//import net.minecraft.world.level.biome.Biome;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
//import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
//import net.minecraftforge.event.world.BiomeLoadingEvent;
//
///**
// * This class handles the ore generation for all ores added by mOres
// * @author Leronus
// */
//public class OreGeneration {
//    //Create new fillerBlockType
//    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
//
//    public static final RuleTest NATURAL_STONE = OreFeatureConfig.FillerBlockType.NATURAL_STONE;
//    public static final RuleTest NETHERRACK = OreFeatureConfig.FillerBlockType.NETHERRACK;
//
//    /**
//     * Generates all the ores in the three different world biomes
//     * @param event Type of world biome
//     */
//    public static void generateOres(final BiomeLoadingEvent event) {
//        //Overworld
//        if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
//            if (Config.spawnTin.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.TIN_ORE.get().defaultBlockState(), 11, 54, 145, 29);
//            }
//            if (Config.spawnCopper.get()){
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 47, 130, 27);
//            }
//            if (Config.spawnSilver.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.SILVER_ORE.get().defaultBlockState(), 7, 31, 65, 19);
//            }
//            if (Config.spawnCobalt.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.COBALT_ORE.get().defaultBlockState(), 6, 18, 42, 14);
//            }
//            if (Config.spawnAmethyst.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.AMETHYST_ORE.get().defaultBlockState(), 5, 15, 31, 12);
//            }
//            if (Config.spawnTopaz.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 5);
//            }
//            if (Config.spawnTourmaline.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.TOURMALINE_ORE.get().defaultBlockState(), 5, 11, 23, 6);
//            }
//            if (Config.spawnSapphire.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 3, 11, 2);
//            }
//            if (Config.spawnRuby.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.RUBY_ORE.get().defaultBlockState(), 5, 4, 13, 1);
//            }
//            if (Config.spawnTurquoise.get()) {
//                generateOre(event.getGeneration(), NATURAL_STONE,
//                        BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 4);
//            }
//        }
//        //Nether
//        else if (event.getCategory().equals(Biome.BiomeCategory.NETHER)){
//            if (Config.spawnSilver.get()) {
//                generateOre(event.getGeneration(), NETHERRACK,
//                        BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 8, 0, 100, 22);
//            }
//            if (Config.spawnNetherRuby.get()) {
//                generateOre(event.getGeneration(), NETHERRACK,
//                        BlockInit.NETHER_RUBY_ORE.get().defaultBlockState(), 5, 60, 110, 2);
//            }
//            if (Config.spawnNetherSapphire.get()) {
//                generateOre(event.getGeneration(), NETHERRACK,
//                        BlockInit.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 4, 50, 100, 3);
//            }
//            if (Config.spawnMoissanite.get()) {
//                generateOre(event.getGeneration(), NETHERRACK,
//                        BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 4, 0, 75, 5);
//            }
//            if (Config.spawnTanzanite.get()) {
//                generateOre(event.getGeneration(), NETHERRACK,
//                        BlockInit.TANZANITE_ORE.get().defaultBlockState(), 6, 15, 70, 7);
//            }
//        }
//        //End
//        else if (event.getCategory().equals(Biome.BiomeCategory.THEEND)){
//            if (Config.spawnOnyx.get()) {
//                generateOre(event.getGeneration(), END_STONE,
//                        BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 7);
//            }
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
//                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
//                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
//                        .squared().count(amount));
//    }
//}
