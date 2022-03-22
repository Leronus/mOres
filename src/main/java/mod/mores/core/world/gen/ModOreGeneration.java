package mod.mores.core.world.gen;

import mod.mores.Mores;
import mod.mores.core.init.BlockInit;
import mod.mores.core.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * This class handles the ore generation for all ores added by mOres
 * @author Leronus
 */
public class ModOreGeneration {
    public static final List<ConfiguredFeature<?, ?>> OVERWORLD_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?, ?>> END_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?, ?>> NETHER_ORES = new ArrayList<>();

    //Create new fillerBlockType
    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);

    /**
     * Generates all the ores in the three different world biomes
     */
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.TIN_ORE_PLACED);
    }
// BlockInit.TIN_ORE.get().defaultBlockState(), 11, 54, 145, 29);
// BlockInit.COPPER_ORE.get().defaultBlockState(), 10, 47, 130, 27);
// BlockInit.SILVER_ORE.get().defaultBlockState(), 7, 31, 65, 19);
// BlockInit.COBALT_ORE.get().defaultBlockState(), 6, 18, 42, 14);
// BlockInit.AMETHYST_ORE.get().defaultBlockState(), 5, 15, 31, 12);
// BlockInit.TOPAZ_ORE.get().defaultBlockState(), 5, 10, 21, 5);
// BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 3, 11, 2);
// BlockInit.RUBY_ORE.get().defaultBlockState(), 5, 4, 13, 1);
// BlockInit.TURQUOISE_ORE.get().defaultBlockState(), 3, 0, 10, 4);
// BlockInit.NETHER_SILVER_ORE.get().defaultBlockState(), 8, 0, 100, 22);
// BlockInit.NETHER_RUBY_ORE.get().defaultBlockState(), 5, 60, 110, 2);
// BlockInit.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 4, 50, 100, 3);
// BlockInit.MOISSANITE_NETHER_ORE.get().defaultBlockState(), 4, 0, 75, 5);
// BlockInit.TANZANITE_ORE.get().defaultBlockState(), 6, 15, 70, 7);
// BlockInit.ONYX_ORE.get().defaultBlockState(), 5, 30, 100, 7);
}
