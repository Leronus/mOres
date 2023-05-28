package mod.leronus.mores.world.feature;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.Config;
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
                    (Config.anthraciteUpperVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldAnthraciteUpperBottom.get()), VerticalAnchor.top()))));

    public static final RegistryObject<PlacedFeature> ANTHRACITE_ORE_LOWER_PLACED = PLACED_FEATURES.register("anthracite_ore_lower_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ANTHRACITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.anthraciteLowerVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldAnthraciteLowerBottom.get()), VerticalAnchor.aboveBottom(Config.overworldAnthraciteLowerTop.get())))));

    //Tin Ore
    public static final RegistryObject<PlacedFeature> TIN_ORE_UPPER_PLACED = PLACED_FEATURES.register("tin_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldTinUpperVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTinUpperBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTinUpperTop.get())))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("tin_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldTinMiddleVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTinMiddleBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTinMiddleTop.get())))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_SMALL_PLACED = PLACED_FEATURES.register("tin_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldTinSmallVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(Config.overworldTinSmallTop.get())))));


    //Silver Ore
    public static final RegistryObject<PlacedFeature> SILVER_ORE_UPPER_PLACED = PLACED_FEATURES.register("silver_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldSilverUpperVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldSilverUpperBottom.get()), VerticalAnchor.aboveBottom(Config.overworldSilverUpperTop.get())))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("silver_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldSilverMiddleVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldSilverMiddleBottom.get()), VerticalAnchor.aboveBottom(Config.overworldSilverMiddleTop.get())))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_SMALL_PLACED = PLACED_FEATURES.register("silver_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldSilverSmallVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(Config.overworldSilverSmallTop.get())))));

    /*nether*/public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = PLACED_FEATURES.register("nether_silver_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SILVER_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherSilverVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));


    //Cobalt Ore
    public static final RegistryObject<PlacedFeature> COBALT_ORE_UPPER_PLACED = PLACED_FEATURES.register("cobalt_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldCobaltUpperVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldCobaltUpperBottom.get()), VerticalAnchor.aboveBottom(Config.overworldCobaltUpperTop.get())))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("cobalt_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (Config.overworldCobaltMiddleVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldCobaltMiddleBottom.get()), VerticalAnchor.aboveBottom(Config.overworldCobaltMiddleTop.get())))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_SMALL_PLACED = PLACED_FEATURES.register("cobalt_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldCobaltSmallVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(Config.overworldCobaltSmallTop.get())))));


    //Topaz Ore
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = PLACED_FEATURES.register("topaz_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldTopazSmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTopazSmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTopazSmallTop.get())))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = PLACED_FEATURES.register("topaz_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldTopazLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTopazLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTopazLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_BURIED_PLACED = PLACED_FEATURES.register("topaz_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldTopazBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTopazBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTopazBuriedTop.get())))));


    //Tourmaline Ore
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_SMALL_PLACED = PLACED_FEATURES.register("tourmaline_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldTourmalineSmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTourmalineSmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTourmalineSmallTop.get())))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_LARGE_PLACED = PLACED_FEATURES.register("tourmaline_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldTourmalineLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTourmalineLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTourmalineLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_BURIED_PLACED = PLACED_FEATURES.register("tourmaline_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldTourmalineBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTourmalineBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTourmalineBuriedTop.get())))));


    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = PLACED_FEATURES.register("sapphire_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldSapphireSmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldSapphireSmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldSapphireSmallTop.get())))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = PLACED_FEATURES.register("sapphire_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldSapphireLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldSapphireLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldSapphireLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_BURIED_PLACED = PLACED_FEATURES.register("sapphire_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldSapphireBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldSapphireBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldSapphireBuriedTop.get())))));

    public static final RegistryObject<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("nether_sapphire_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherSapphireVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.netherSapphireBottom.get()), VerticalAnchor.aboveBottom(Config.netherSapphireTop.get())))));


    //Ruby
    public static final RegistryObject<PlacedFeature> RUBY_ORE_SMALL_PLACED = PLACED_FEATURES.register("ruby_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldRubySmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldRubySmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldRubySmallTop.get())))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_LARGE_PLACED = PLACED_FEATURES.register("ruby_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldRubyLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldRubyLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldRubyLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_BURIED_PLACED = PLACED_FEATURES.register("ruby_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldRubyBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldRubyBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldRubyBuriedTop.get())))));

    public static final RegistryObject<PlacedFeature> NETHER_RUBY_ORE_PLACED = PLACED_FEATURES.register("nether_ruby_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_RUBY_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherRubyVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.netherRubyBottom.get()), VerticalAnchor.aboveBottom(Config.netherRubyTop.get())))));


    //Turquoise
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_SMALL_PLACED = PLACED_FEATURES.register("turquoise_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldTurquoiseSmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTurquoiseSmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTurquoiseSmallTop.get())))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_LARGE_PLACED = PLACED_FEATURES.register("turquoise_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldTurquoiseLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTurquoiseLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTurquoiseLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_BURIED_PLACED = PLACED_FEATURES.register("turquoise_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldTurquoiseBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldTurquoiseBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldTurquoiseBuriedTop.get())))));


    //Moissanite
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_SMALL_PLACED = PLACED_FEATURES.register("moissanite_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (Config.overworldMoissaniteSmallVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldMoissaniteSmallBottom.get()), VerticalAnchor.aboveBottom(Config.overworldMoissaniteSmallTop.get())))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_LARGE_PLACED = PLACED_FEATURES.register("moissanite_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (Config.overworldMoissaniteLargeVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldMoissaniteLargeBottom.get()), VerticalAnchor.aboveBottom(Config.overworldMoissaniteLargeTop.get())))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_BURIED_PLACED = PLACED_FEATURES.register("moissanite_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (Config.overworldMoissaniteBuriedVeinsPerChunk.get(),
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.overworldMoissaniteBuriedBottom.get()), VerticalAnchor.aboveBottom(Config.overworldMoissaniteBuriedTop.get())))));

    public static final RegistryObject<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = PLACED_FEATURES.register("nether_moissanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_MOISSANITE_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherMoissaniteVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.netherMoissaniteBottom.get()), VerticalAnchor.aboveBottom(Config.netherMoissaniteTop.get())))));

    //Tanzanite
    public static final RegistryObject<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PLACED_FEATURES.register("nether_tanzanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_TANZANITE_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherTanzaniteVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.netherTanzaniteBottom.get()), VerticalAnchor.aboveBottom(Config.netherTanzaniteTop.get())))));

    public static final RegistryObject<PlacedFeature> NETHER_ANTHRACITE_ORE_PLACED = PLACED_FEATURES.register("nether_anthracite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_ANTHRACITE_ORE.getHolder().get(), commonOrePlacement
                    (Config.netherAnthraciteVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.netherAnthraciteBottom.get()), VerticalAnchor.aboveBottom(Config.netherAnthraciteTop.get())))));

    //Carbonado
    public static final RegistryObject<PlacedFeature> ONYX_ORE_PLACED = PLACED_FEATURES.register("onyx_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ONYX_ORE.getHolder().get(), commonOrePlacement
                    (Config.endOnyxVeinsPerChunk.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(Config.endOnyxBottom.get()), VerticalAnchor.aboveBottom(Config.endOnyxTop.get())))));

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