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
    public static final DeferredRegister<PlacedFeature> TIN_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> SILVER_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> NETHER_SILVER_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> COBALT_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> TOPAZ_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> TOURMALINE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> RUBY_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> NETHER_RUBY_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> SAPPHIRE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> NETHER_SAPPHIRE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> TANZANITE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> ONYX_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> MOISSANITE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> NETHER_MOISSANITE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> TURQUOISE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> ANTHRACITE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);
    public static final DeferredRegister<PlacedFeature> NETHER_ANTHRACITE_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mores.MODID);

    //Tin Ore
    public static final RegistryObject<PlacedFeature> TIN_ORE_UPPER_PLACED = TIN_PLACED_FEATURES.register("tin_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (17, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTinUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTinUpperTop)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_MIDDLE_PLACED = TIN_PLACED_FEATURES.register("tin_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (10, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTinMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTinMiddleTop)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_SMALL_PLACED = TIN_PLACED_FEATURES.register("tin_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldTinSmallTop)))));


    //Silver Ore
    public static final RegistryObject<PlacedFeature> SILVER_ORE_UPPER_PLACED = SILVER_PLACED_FEATURES.register("silver_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (14, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSilverUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSilverUpperTop)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = SILVER_PLACED_FEATURES.register("silver_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (10, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSilverMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSilverMiddleTop)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_SMALL_PLACED = SILVER_PLACED_FEATURES.register("silver_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.uniform
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldSilverSmallTop)))));

    /*nether*/public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = NETHER_SILVER_PLACED_FEATURES.register("nether_silver_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SILVER_ORE.getHolder().get(), commonOrePlacement
                    (18, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));


    //Cobalt Ore
    public static final RegistryObject<PlacedFeature> COBALT_ORE_UPPER_PLACED = COBALT_PLACED_FEATURES.register("cobalt_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltUpperBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltUpperTop)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = COBALT_PLACED_FEATURES.register("cobalt_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (14, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltMiddleBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldCobaltMiddleTop)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_SMALL_PLACED = COBALT_PLACED_FEATURES.register("cobalt_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (5, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.bottom(), VerticalAnchor.absolute(MoresConfig.overworldCobaltSmallTop)))));


    //Topaz Ore
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = TOPAZ_PLACED_FEATURES.register("topaz_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (7,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazSmallTop)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = TOPAZ_PLACED_FEATURES.register("topaz_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazLargeTop)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_BURIED_PLACED = TOPAZ_PLACED_FEATURES.register("topaz_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTopazBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTopazBuriedTop)))));


    //Tourmaline Ore
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_SMALL_PLACED = TOURMALINE_PLACED_FEATURES.register("tourmaline_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (8,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineSmallTop)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_LARGE_PLACED = TOURMALINE_PLACED_FEATURES.register("tourmaline_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineLargeTop)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_BURIED_PLACED = TOURMALINE_PLACED_FEATURES.register("tourmaline_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTourmalineBuriedTop)))));


    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = SAPPHIRE_PLACED_FEATURES.register("sapphire_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireSmallTop)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = SAPPHIRE_PLACED_FEATURES.register("sapphire_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (7,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireLargeTop)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_BURIED_PLACED = SAPPHIRE_PLACED_FEATURES.register("sapphire_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldSapphireBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED = NETHER_SAPPHIRE_PLACED_FEATURES.register("nether_sapphire_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE.getHolder().get(), commonOrePlacement
                    (4, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherSapphireBottom), VerticalAnchor.aboveBottom(MoresConfig.netherSapphireTop)))));


    //Ruby
    public static final RegistryObject<PlacedFeature> RUBY_ORE_SMALL_PLACED = RUBY_PLACED_FEATURES.register("ruby_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubySmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubySmallTop)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_LARGE_PLACED = RUBY_PLACED_FEATURES.register("ruby_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (7,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubyLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubyLargeTop)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_BURIED_PLACED = RUBY_PLACED_FEATURES.register("ruby_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldRubyBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldRubyBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_RUBY_ORE_PLACED = NETHER_RUBY_PLACED_FEATURES.register("nether_ruby_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_RUBY_ORE.getHolder().get(), commonOrePlacement
                    (5, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherRubyBottom), VerticalAnchor.aboveBottom(MoresConfig.netherRubyTop)))));


    //Turquoise
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_SMALL_PLACED = TURQUOISE_PLACED_FEATURES.register("turquoise_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (8,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseSmallTop)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_LARGE_PLACED = TURQUOISE_PLACED_FEATURES.register("turquoise_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseLargeTop)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_BURIED_PLACED = TURQUOISE_PLACED_FEATURES.register("turquoise_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldTurquoiseBuriedTop)))));


    //Moissanite
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_SMALL_PLACED = MOISSANITE_PLACED_FEATURES.register("moissanite_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteSmallBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteSmallTop)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_LARGE_PLACED = MOISSANITE_PLACED_FEATURES.register("moissanite_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (4,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteLargeBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteLargeTop)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_BURIED_PLACED = MOISSANITE_PLACED_FEATURES.register("moissanite_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (3,
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteBuriedBottom), VerticalAnchor.aboveBottom(MoresConfig.overworldMoissaniteBuriedTop)))));

    public static final RegistryObject<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = NETHER_MOISSANITE_PLACED_FEATURES.register("nether_moissanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_MOISSANITE_ORE.getHolder().get(), commonOrePlacement
                    (7, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherMoissaniteBottom), VerticalAnchor.aboveBottom(MoresConfig.netherMoissaniteTop)))));

    //Tanzanite
    public static final RegistryObject<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = TANZANITE_PLACED_FEATURES.register("nether_tanzanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_TANZANITE_ORE.getHolder().get(), commonOrePlacement
                    (11, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.netherTanzaniteBottom), VerticalAnchor.aboveBottom(MoresConfig.netherTanzaniteTop)))));


    //Carbonado
    public static final RegistryObject<PlacedFeature> ONYX_ORE_PLACED = ONYX_PLACED_FEATURES.register("onyx_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ONYX_ORE.getHolder().get(), commonOrePlacement
                    (9, // VeinsPerChunk
                            HeightRangePlacement.triangle
                                    (VerticalAnchor.aboveBottom(MoresConfig.endOnyxBottom), VerticalAnchor.aboveBottom(MoresConfig.endOnyxTop)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        if (MoresConfig.spawnTin){
            TIN_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnSilver){
            SILVER_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnNetherSilver){
            NETHER_SILVER_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnCobalt){
            COBALT_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnTopaz){
            TOPAZ_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnTourmaline){
            TOURMALINE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnTanzanite){
            TANZANITE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnRuby){
            RUBY_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnNetherRuby){
            NETHER_RUBY_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnSapphire){
            SAPPHIRE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnNetherSapphire){
            NETHER_SAPPHIRE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnMoissanite){
            MOISSANITE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnNetherMoissanite){
            NETHER_MOISSANITE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnEndOnyx){
            ONYX_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnAnthracite){
            ANTHRACITE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnNetherAnthracite){
            NETHER_ANTHRACITE_PLACED_FEATURES.register(eventBus);
        }
        if (MoresConfig.spawnTurquoise){
            TURQUOISE_PLACED_FEATURES.register(eventBus);
        }
    }
}