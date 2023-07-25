package mod.leronus.mores.world.feature;

import mod.leronus.mores.Mores;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;


public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> OVERWORLD_ANTHRACITE_PLACED_KEY = createKey("overworld_anthracite_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ANTHRACITE_PLACED_KEY = createKey("nether_anthracite_placed");

    public static final ResourceKey<PlacedFeature> TIN_UPPER_PLACED_KEY = createKey("tin_upper_placed");
    public static final ResourceKey<PlacedFeature> TIN_MIDDLE_PLACED_KEY = createKey("tin_middle_placed");
    public static final ResourceKey<PlacedFeature> TIN_SMALL_PLACED_KEY = createKey("tin_small_placed");

    public static final ResourceKey<PlacedFeature> COBALT_UPPER_PLACED_KEY = createKey("cobalt_upper_placed");
    public static final ResourceKey<PlacedFeature> COBALT_MIDDLE_PLACED_KEY = createKey("cobalt_middle_placed");
    public static final ResourceKey<PlacedFeature> COBALT_SMALL_PLACED_KEY = createKey("cobalt_small_placed");

    public static final ResourceKey<PlacedFeature> SILVER_UPPER_PLACED_KEY = createKey("silver_upper_placed");
    public static final ResourceKey<PlacedFeature> SILVER_MIDDLE_PLACED_KEY = createKey("silver_middle_placed");
    public static final ResourceKey<PlacedFeature> SILVER_SMALL_PLACED_KEY = createKey("silver_small_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_PLACED_KEY = createKey("nether_silver_placed");

    public static final ResourceKey<PlacedFeature> TOPAZ_SMALL_PLACED_KEY = createKey("topaz_small_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_LARGE_PLACED_KEY = createKey("topaz_large_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_BURIED_PLACED_KEY = createKey("topaz_buried_placed");

    public static final ResourceKey<PlacedFeature> TOURMALINE_SMALL_PLACED_KEY = createKey("tourmaline_small_placed");
    public static final ResourceKey<PlacedFeature> TOURMALINE_LARGE_PLACED_KEY = createKey("tourmaline_large_placed");
    public static final ResourceKey<PlacedFeature> TOURMALINE_BURIED_PLACED_KEY = createKey("tourmaline_buried_placed");

    public static final ResourceKey<PlacedFeature> RUBY_SMALL_PLACED_KEY = createKey("ruby_small_placed");
    public static final ResourceKey<PlacedFeature> RUBY_LARGE_PLACED_KEY = createKey("ruby_large_placed");
    public static final ResourceKey<PlacedFeature> RUBY_BURIED_PLACED_KEY = createKey("ruby_buried_placed");
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_PLACED_KEY = createKey("nether_ruby_placed");

    public static final ResourceKey<PlacedFeature> SAPPHIRE_SMALL_PLACED_KEY = createKey("sapphire_small_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_LARGE_PLACED_KEY = createKey("sapphire_large_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_BURIED_PLACED_KEY = createKey("sapphire_buried_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_PLACED_KEY = createKey("nether_sapphire_placed");

    public static final ResourceKey<PlacedFeature> NETHER_TANZANITE_PLACED_KEY = createKey("nether_tanzanite_placed");

    public static final ResourceKey<PlacedFeature> MOISSANITE_SMALL_PLACED_KEY = createKey("moissanite_small_placed");
    public static final ResourceKey<PlacedFeature> MOISSANITE_LARGE_PLACED_KEY = createKey("moissanite_large_placed");
    public static final ResourceKey<PlacedFeature> MOISSANITE_BURIED_PLACED_KEY = createKey("moissanite_buried_placed");
    public static final ResourceKey<PlacedFeature> NETHER_MOISSANITE_PLACED_KEY = createKey("nether_moissanite_placed");

    public static final ResourceKey<PlacedFeature> TURQUOISE_SMALL_PLACED_KEY = createKey("turquoise_small_placed");
    public static final ResourceKey<PlacedFeature> TURQUOISE_LARGE_PLACED_KEY = createKey("turquoise_large_placed");
    public static final ResourceKey<PlacedFeature> TURQUOISE_BURIED_PLACED_KEY = createKey("turquoise_buried_placed");

    public static final ResourceKey<PlacedFeature> END_ONYX_PLACED_KEY = createKey("end_onyx_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_ANTHRACITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ANTHRACITE_ORE_KEY),
                commonOrePlacement(8, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(80))));
        register(context, NETHER_ANTHRACITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ANTHRACITE_ORE_KEY),
                commonOrePlacement(14, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256))));

        register(context, TIN_UPPER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_UPPER_ORE_KEY),
                commonOrePlacement(8, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(312))));
        register(context, TIN_MIDDLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_MIDDLE_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(80))));
        register(context, TIN_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_SMALL_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));


        //TODO Finish all the values (dont forget to change triangle to uniform for equal distribution && aboveBottom 0 -> y = -64 aka aboveBottom 64 would be y = 0
        register(context, COBALT_UPPER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_UPPER_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(124), VerticalAnchor.aboveBottom(312))));
        register(context, COBALT_MIDDLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_MIDDLE_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(312))));
        register(context, COBALT_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_SMALL_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));

        register(context, SILVER_UPPER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_UPPER_ORE_KEY),
                commonOrePlacement(11, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, SILVER_MIDDLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_MIDDLE_ORE_KEY),
                commonOrePlacement(8, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, SILVER_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_SMALL_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, NETHER_SILVER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                commonOrePlacement(16, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));


        register(context, TOPAZ_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_SMALL_ORE_KEY),
                commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, TOPAZ_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_LARGE_ORE_KEY),
                commonOrePlacement(10, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, TOPAZ_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_BURIED_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));

        register(context, TOURMALINE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOURMALINE_SMALL_ORE_KEY),
                commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, TOURMALINE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOURMALINE_LARGE_ORE_KEY),
                commonOrePlacement(8, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, TOURMALINE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOURMALINE_BURIED_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));

        register(context, RUBY_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_SMALL_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, RUBY_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_LARGE_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, RUBY_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_BURIED_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, NETHER_RUBY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));


        register(context, SAPPHIRE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_SMALL_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, SAPPHIRE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_LARGE_ORE_KEY),
                commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, SAPPHIRE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_BURIED_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, NETHER_SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));


        register(context, NETHER_TANZANITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TANZANITE_ORE_KEY),
                commonOrePlacement(11, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));


        register(context, MOISSANITE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOISSANITE_SMALL_ORE_KEY),
                commonOrePlacement(5, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, MOISSANITE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOISSANITE_LARGE_ORE_KEY),
                commonOrePlacement(3, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, MOISSANITE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOISSANITE_BURIED_ORE_KEY),
                commonOrePlacement(4, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
        register(context, NETHER_MOISSANITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_MOISSANITE_ORE_KEY),
                commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));

        register(context, TURQUOISE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TURQUOISE_SMALL_ORE_KEY),
                commonOrePlacement(14, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(12))));
        register(context, TURQUOISE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TURQUOISE_LARGE_ORE_KEY),
                commonOrePlacement(12, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(12))));
        register(context, TURQUOISE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TURQUOISE_BURIED_ORE_KEY),
                commonOrePlacement(6, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(16))));

        register(context, END_ONYX_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ONYX_ORE_KEY),
                commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(312))));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Mores.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}