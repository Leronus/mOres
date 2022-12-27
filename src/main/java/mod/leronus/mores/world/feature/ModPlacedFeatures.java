package mod.leronus.mores.world.feature;

import mod.leronus.mores.Mores;
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

    //Tin Ore
    public static final RegistryObject<PlacedFeature> TIN_ORE_UPPER_PLACED = PLACED_FEATURES.register("tin_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (95, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(90), VerticalAnchor.aboveBottom(400)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("tin_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(), commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> TIN_ORE_SMALL_PLACED = PLACED_FEATURES.register("tin_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TIN_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (8, // VeinsPerChunk
                    HeightRangePlacement.uniform
                            (VerticalAnchor.bottom(), VerticalAnchor.absolute(100)))));


    //Silver Ore
    public static final RegistryObject<PlacedFeature> SILVER_ORE_UPPER_PLACED = PLACED_FEATURES.register("silver_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (85, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(20)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("silver_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(), commonOrePlacement
                    (10, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(20)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_SMALL_PLACED = PLACED_FEATURES.register("silver_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (7, // VeinsPerChunk
                    HeightRangePlacement.uniform
                            (VerticalAnchor.bottom(), VerticalAnchor.absolute(80)))));

/*nether*/public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = PLACED_FEATURES.register("nether_silver_ore_placed",
        ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_SILVER_ORE.getHolder().get(), commonOrePlacement
                (24, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(20)))));


    //Cobalt Ore
    public static final RegistryObject<PlacedFeature> COBALT_ORE_UPPER_PLACED = PLACED_FEATURES.register("cobalt_ore_upper_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (75, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(85), VerticalAnchor.aboveBottom(320)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = PLACED_FEATURES.register("cobalt_ore_middle_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE.getHolder().get(), commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> COBALT_ORE_SMALL_PLACED = PLACED_FEATURES.register("cobalt_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.COBALT_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(60)))));


    //Topaz Ore
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = PLACED_FEATURES.register("topaz_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (9,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = PLACED_FEATURES.register("topaz_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (11,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95)))));
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_BURIED_PLACED = PLACED_FEATURES.register("topaz_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95)))));


    //Tourmaline Ore
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_SMALL_PLACED = PLACED_FEATURES.register("tourmaline_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (8,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_LARGE_PLACED = PLACED_FEATURES.register("tourmaline_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));
    public static final RegistryObject<PlacedFeature> TOURMALINE_ORE_BURIED_PLACED = PLACED_FEATURES.register("tourmaline_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TOURMALINE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110)))));


    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = PLACED_FEATURES.register("sapphire_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = PLACED_FEATURES.register("sapphire_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (7,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65)))));
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_BURIED_PLACED = PLACED_FEATURES.register("sapphire_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65)))));


    //Ruby
    public static final RegistryObject<PlacedFeature> RUBY_ORE_SMALL_PLACED = PLACED_FEATURES.register("ruby_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_LARGE_PLACED = PLACED_FEATURES.register("ruby_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (7,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70)))));
    public static final RegistryObject<PlacedFeature> RUBY_ORE_BURIED_PLACED = PLACED_FEATURES.register("ruby_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.RUBY_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70)))));


    //Turquoise
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_SMALL_PLACED = PLACED_FEATURES.register("turquoise_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (8,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_LARGE_PLACED = PLACED_FEATURES.register("turquoise_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (10,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_ORE_BURIED_PLACED = PLACED_FEATURES.register("turquoise_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.TURQUOISE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10)))));


    //Moissanite
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_SMALL_PLACED = PLACED_FEATURES.register("moissanite_ore_small_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_SMALL.getHolder().get(), commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_LARGE_PLACED = PLACED_FEATURES.register("moissanite_ore_large_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_LARGE.getHolder().get(), rareOrePlacement
                    (4,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40)))));
    public static final RegistryObject<PlacedFeature> MOISSANITE_ORE_BURIED_PLACED = PLACED_FEATURES.register("moissanite_ore_buried_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.MOISSANITE_ORE_BURIED.getHolder().get(), commonOrePlacement
                    (3,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40)))));

    public static final RegistryObject<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = PLACED_FEATURES.register("nether_moissanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_MOISSANITE_ORE.getHolder().get(), commonOrePlacement
                    (7, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));

    //Tanzanite
    public static final RegistryObject<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PLACED_FEATURES.register("nether_tanzanite_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.NETHER_TANZANITE_ORE.getHolder().get(), commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));


    //Carbonado
    public static final RegistryObject<PlacedFeature> ONYX_ORE_PLACED = PLACED_FEATURES.register("onyx_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.ONYX_ORE.getHolder().get(), commonOrePlacement
                    (9, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256)))));

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
        PLACED_FEATURES.register(eventBus);
    }
}