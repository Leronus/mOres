package mod.leronus.mores.world.feature;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.config.MoresConfig;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);

    public static final RegistryObject<PlacedFeature> ANTHRACITE_ORE_UPPER_PLACED = PLACED_FEATURES.register("anthracite_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ANTHRACITE_ORE_UPPER.getHolder().get(), commonOrePlacement
                    (21, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldAnthraciteUpperBottom), VerticalAnchor.top()))));

    public static final RegistryObject<PlacedFeature> ANTHRACITE_ORE_LOWER_PLACED = PLACED_FEATURES.register("anthracite_ore_lower_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ANTHRACITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (15, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldAnthraciteLowerBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldAnthraciteLowerTop)))));

    //Tin Ore
    public static final RegistryObject<PlacedFeature> TIN_ORE_UPPER_PLACED = PLACED_FEATURES.register("tin_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (17, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTinUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTinUpperTop)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("tin_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (10, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTinMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTinMiddleTop)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_SMALL_PLACED = PLACED_FEATURES.register("tin_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldTinSmallTop)))));


    //Silver Ore
    public static final RegistryObject<PlacedFeature> SILVER_ORE_UPPER_PLACED = PLACED_FEATURES.register("silver_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (14, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSilverUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSilverUpperTop)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("silver_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (10, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSilverMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSilverMiddleTop)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_SMALL_PLACED = PLACED_FEATURES.register("silver_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldSilverSmallTop)))));

    /*nether*/public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = PLACED_FEATURES.register("nether_silver_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SILVER_ORE.getHolder().get(), commonOrePlacement
                    (18, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));


    //Cobalt Ore
    public static final RegistryObject<PlacedFeature> COBALT_ORE_UPPER_PLACED = PLACED_FEATURES.register("cobalt_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltUpperTop)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("cobalt_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (14, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltMiddleTop)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_SMALL_PLACED = PLACED_FEATURES.register("cobalt_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (5, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldCobaltSmallTop)))));


    //Topaz Ore
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = PLACED_FEATURES.register("topaz_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (7,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazSmallTop)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = PLACED_FEATURES.register("topaz_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazLargeTop)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_BURIED_PLACED = PLACED_FEATURES.register("topaz_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazBuriedTop)))));


    //Tourmaline Ore
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_SMALL_PLACED = PLACED_FEATURES.register("tourmaline_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (9,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineSmallTop)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_LARGE_PLACED = PLACED_FEATURES.register("tourmaline_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (8,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineLargeTop)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_BURIED_PLACED = PLACED_FEATURES.register("tourmaline_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineBuriedTop)))));


    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = PLACED_FEATURES.register("sapphire_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireSmallTop)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = PLACED_FEATURES.register("sapphire_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (7,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireLargeTop)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_BURIED_PLACED = PLACED_FEATURES.register("sapphire_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("nether_sapphire_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherSapphireBottom), VerticalAnchor.aboveBottom(MoresConfig.netherSapphireTop)))));


    //Ruby
    public static final RegistryObject<PlacedFeature> RUBY_ORE_SMALL_PLACED = PLACED_FEATURES.register("ruby_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubySmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubySmallTop)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_LARGE_PLACED = PLACED_FEATURES.register("ruby_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubyLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubyLargeTop)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_BURIED_PLACED = PLACED_FEATURES.register("ruby_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (4,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubyBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubyBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_RUBY_ORE_PLACED = PLACED_FEATURES.register("nether_ruby_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_RUBY_ORE.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherRubyBottom), VerticalAnchor.aboveBottom(MoresConfig.netherRubyTop)))));


    //Turquoise
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_SMALL_PLACED = PLACED_FEATURES.register("turquoise_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (16,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseSmallTop)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_LARGE_PLACED = PLACED_FEATURES.register("turquoise_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (20,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseLargeTop)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_BURIED_PLACED = PLACED_FEATURES.register("turquoise_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (10,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseBuriedTop)))));


    //Moissanite
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_SMALL_PLACED = PLACED_FEATURES.register("moissanite_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteSmallTop)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_LARGE_PLACED = PLACED_FEATURES.register("moissanite_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (4,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteLargeTop)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_BURIED_PLACED = PLACED_FEATURES.register("moissanite_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (3,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = PLACED_FEATURES.register("nether_moissanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_MOISSANITE_ORE.getHolder().get(), commonOrePlacement
                    (7, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherMoissaniteBottom), VerticalAnchor.aboveBottom(MoresConfig.netherMoissaniteTop)))));

    //Tanzanite
    public static final RegistryObject<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PLACED_FEATURES.register("nether_tanzanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_TANZANITE_ORE.getHolder().get(), commonOrePlacement
                    (11, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherTanzaniteBottom), VerticalAnchor.aboveBottom(MoresConfig.netherTanzaniteTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_ANTHRACITE_ORE_PLACED = PLACED_FEATURES.register("nether_anthracite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_ANTHRACITE_ORE.getHolder().get(), commonOrePlacement
                    (25, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherAnthraciteBottom), VerticalAnchor.aboveBottom(MoresConfig.netherAnthraciteTop)))));

    //Carbonado
    public static final RegistryObject<PlacedFeature> ONYX_ORE_PLACED = PLACED_FEATURES.register("onyx_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ONYX_ORE.getHolder().get(), commonOrePlacement
                    (9, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.endOnyxBottom), VerticalAnchor.aboveBottom(MoresConfig.endOnyxTop)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier orePlacement, PlacementModifier heightRange) {
        return List.of(orePlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(pCount), heightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), heightRange);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}