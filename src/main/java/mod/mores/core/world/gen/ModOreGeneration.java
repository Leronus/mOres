package mod.mores.core.world.gen;

import mod.mores.core.world.feature.ModPlacedFeatures;
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

        base.add(ModPlacedFeatures.TIN_ORE_UPPER_PLACED);
        base.add(ModPlacedFeatures.TIN_ORE_MIDDLE_PLACED);
        base.add(ModPlacedFeatures.TIN_ORE_SMALL_PLACED);

        base.add(ModPlacedFeatures.COBALT_ORE_UPPER_PLACED);
        base.add(ModPlacedFeatures.COBALT_ORE_MIDDLE_PLACED);
        base.add(ModPlacedFeatures.COBALT_ORE_SMALL_PLACED);

        base.add(ModPlacedFeatures.SILVER_ORE_UPPER_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_MIDDLE_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.NETHER_SILVER_ORE_PLACED);

        base.add(ModPlacedFeatures.TOPAZ_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.TOPAZ_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.TOPAZ_ORE_BURIED_PLACED);

        base.add(ModPlacedFeatures.TOURMALINE_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.TOURMALINE_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.TOURMALINE_ORE_BURIED_PLACED);

        base.add(ModPlacedFeatures.TANZANITE_ORE_PLACED);

        base.add(ModPlacedFeatures.RUBY_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.RUBY_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.RUBY_ORE_BURIED_PLACED);

        base.add(ModPlacedFeatures.SAPPHIRE_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.SAPPHIRE_ORE_BURIED_PLACED);

        base.add(ModPlacedFeatures.TURQUOISE_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.TURQUOISE_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.TURQUOISE_ORE_BURIED_PLACED);

        base.add(ModPlacedFeatures.MOISSANITE_ORE_SMALL_PLACED);
        base.add(ModPlacedFeatures.MOISSANITE_ORE_LARGE_PLACED);
        base.add(ModPlacedFeatures.MOISSANITE_ORE_BURIED_PLACED);
        base.add(ModPlacedFeatures.NETHER_MOISSANITE_ORE_PLACED);
//      base.add(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED);
//      base.add(ModPlacedFeatures.NETHER_SAPPHIRE_ORE_PLACED);

        base.add(ModPlacedFeatures.ONYX_ORE_PLACED);
    }
}
