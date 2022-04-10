package mod.mores.world.gen;

import mod.mores.config.Config;
import mod.mores.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

/**
 * This class handles the ore generation for all ores added by mOres
 * @author Leronus
 */
public class ModOreGeneration {
    /**
     * Generates all the ores in the three different world biomes
     */
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        if (Config.spawnTin.get()) {
            base.add(ModPlacedFeatures.TIN_ORE_UPPER_PLACED);
            base.add(ModPlacedFeatures.TIN_ORE_MIDDLE_PLACED);
            base.add(ModPlacedFeatures.TIN_ORE_SMALL_PLACED);
        }
        if (Config.spawnCobalt.get()) {
            base.add(ModPlacedFeatures.COBALT_ORE_UPPER_PLACED);
            base.add(ModPlacedFeatures.COBALT_ORE_MIDDLE_PLACED);
            base.add(ModPlacedFeatures.COBALT_ORE_SMALL_PLACED);
        }
        if (Config.spawnSilver.get()) {
            base.add(ModPlacedFeatures.SILVER_ORE_UPPER_PLACED);
            base.add(ModPlacedFeatures.SILVER_ORE_MIDDLE_PLACED);
            base.add(ModPlacedFeatures.SILVER_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.NETHER_SILVER_ORE_PLACED);
        }
        if (Config.spawnTopaz.get()) {
            base.add(ModPlacedFeatures.TOPAZ_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.TOPAZ_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.TOPAZ_ORE_BURIED_PLACED);
        }
        if (Config.spawnTourmaline.get()) {
            base.add(ModPlacedFeatures.TOURMALINE_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.TOURMALINE_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.TOURMALINE_ORE_BURIED_PLACED);
        }
        if (Config.spawnTanzanite.get()) {
            base.add(ModPlacedFeatures.TANZANITE_ORE_PLACED);
        }
        if (Config.spawnRuby.get()) {
            base.add(ModPlacedFeatures.RUBY_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.RUBY_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.RUBY_ORE_BURIED_PLACED);
        }
        if (Config.spawnSapphire.get()) {
            base.add(ModPlacedFeatures.SAPPHIRE_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.SAPPHIRE_ORE_BURIED_PLACED);
        }
        if (Config.spawnTurquoise.get()) {
            base.add(ModPlacedFeatures.TURQUOISE_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.TURQUOISE_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.TURQUOISE_ORE_BURIED_PLACED);
        }
        if (Config.spawnMoissanite.get()) {
            base.add(ModPlacedFeatures.MOISSANITE_ORE_SMALL_PLACED);
            base.add(ModPlacedFeatures.MOISSANITE_ORE_LARGE_PLACED);
            base.add(ModPlacedFeatures.MOISSANITE_ORE_BURIED_PLACED);
            base.add(ModPlacedFeatures.NETHER_MOISSANITE_ORE_PLACED);
        }
//      base.add(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED);
//      base.add(ModPlacedFeatures.NETHER_SAPPHIRE_ORE_PLACED);
        if (Config.spawnOnyx.get()) {
            base.add(ModPlacedFeatures.ONYX_ORE_PLACED);
        }
    }
}
