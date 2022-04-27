package mod.mores.world.feature;

import mod.mores.config.Config;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.ForgeConfigSpec;

public class ModPlacedFeatures {
    public static int tinUpperTop = Config.overworldTinUpperTop.get();
    public static int silverUpperTop;
    public static int cobaltUpperTop;
    public static int tinUpperBottom;
    public static int silverUpperBottom;
    public static int cobaltUpperBottom;

    public static int tinMiddleTop;
    public static int silverMiddleTop;
    public static int cobaltMiddleTop;
    public static int tinMiddleBottom;
    public static int silverMiddleBottom;
    public static int cobaltMiddleBottom;

    public static int tinSmallTop;
    public static int silverSmallTop;
    public static int cobaltSmallTop;
    public static int tinSmallBottom;
    public static int silverSmallBottom;
    public static int cobaltSmallBottom;

    public static int topazSmallTop;
    public static int tourmalineSmallTop;
    public static int rubySmallTop;
    public static int sapphireSmallTop;
    public static int turquoiseSmallTop;
    public static int moissaniteSmallTop;
    public static int topazSmallBottom;
    public static int tourmalineSmallBottom;
    public static int rubySmallBottom;
    public static int sapphireSmallBottom;
    public static int turquoiseSmallBottom;
    public static int moissaniteSmallBottom;

    public static int topazLargeTop;
    public static int tourmalineLargeTop;
    public static int rubyLargeTop;
    public static int sapphireLargeTop;
    public static int turquoiseLargeTop;
    public static int moissaniteLargeTop;
    public static int topazLargeBottom;
    public static int tourmalineLargeBottom;
    public static int rubyLargeBottom;
    public static int sapphireLargeBottom;
    public static int turquoiseLargeBottom;
    public static int moissaniteLargeBottom;

    public static int topazBuriedTop;
    public static int tourmalineBuriedTop;
    public static int rubyBuriedTop;
    public static int sapphireBuriedTop;
    public static int turquoiseBuriedTop;
    public static int moissaniteBuriedTop;
    public static int topazBuriedBottom;
    public static int tourmalineBuriedBottom;
    public static int rubyBuriedBottom;
    public static int sapphireBuriedBottom;
    public static int turquoiseBuriedBottom;
    public static int moissaniteBuriedBottom;

    public static int endOnyxTop;
    public static int endOnyxBottom;

    public static int netherSilverTop;
    public static int netherTanzaniteTop;
    public static int netherMoissaniteTop;
    public static int netherSilverBottom;
    public static int netherTanzaniteBottom;
    public static int netherMoissaniteBottom;


    //Tin Ore
    public static final Holder<PlacedFeature> TIN_ORE_UPPER_PLACED = PlacementUtils.register("tin_ore_upper_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement
                    (95, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(90), VerticalAnchor.aboveBottom(400))));
    public static final Holder<PlacedFeature> TIN_ORE_MIDDLE_PLACED = PlacementUtils.register("tin_ore_middle_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> TIN_ORE_SMALL_PLACED = PlacementUtils.register("tin_ore_small_placed",
            ModConfiguredFeatures.TIN_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (8, // VeinsPerChunk
                    HeightRangePlacement.uniform
                            (VerticalAnchor.bottom(), VerticalAnchor.absolute(100))));


    //Silver Ore
    public static final Holder<PlacedFeature> SILVER_ORE_UPPER_PLACED = PlacementUtils.register("silver_ore_upper_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement
                    (85, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(60), VerticalAnchor.aboveBottom(340))));
    public static final Holder<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = PlacementUtils.register("silver_ore_middle_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement
                    (10, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(65))));
    public static final Holder<PlacedFeature> SILVER_ORE_SMALL_PLACED = PlacementUtils.register("silver_ore_small_placed",
            ModConfiguredFeatures.SILVER_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (7, // VeinsPerChunk
                    HeightRangePlacement.uniform
                            (VerticalAnchor.bottom(), VerticalAnchor.absolute(80))));

/*nether*/public static final Holder<PlacedFeature> NETHER_SILVER_ORE_PLACED = PlacementUtils.register("nether_silver_ore_placed",
            ModConfiguredFeatures.NETHER_SILVER_ORE, ModOrePlacement.commonOrePlacement
                (24, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));


    //Cobalt Ore
    public static final Holder<PlacedFeature> COBALT_ORE_UPPER_PLACED = PlacementUtils.register("cobalt_ore_upper_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement
                    (75, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(85), VerticalAnchor.aboveBottom(320))));
    public static final Holder<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = PlacementUtils.register("cobalt_ore_middle_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> COBALT_ORE_SMALL_PLACED = PlacementUtils.register("cobalt_ore_small_placed",
            ModConfiguredFeatures.COBALT_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(60))));


    //Topaz Ore
    public static final Holder<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = PlacementUtils.register("topaz_ore_small_placed",
            ModConfiguredFeatures.TOPAZ_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (9,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95))));
    public static final Holder<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = PlacementUtils.register("topaz_ore_large_placed",
            ModConfiguredFeatures.TOPAZ_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (11,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95))));
    public static final Holder<PlacedFeature> TOPAZ_ORE_BURIED_PLACED = PlacementUtils.register("topaz_ore_buried_placed",
            ModConfiguredFeatures.TOPAZ_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(95))));


    //Tourmaline Ore
    public static final Holder<PlacedFeature> TOURMALINE_ORE_SMALL_PLACED = PlacementUtils.register("tourmaline_ore_small_placed",
            ModConfiguredFeatures.TOURMALINE_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (8,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110))));
    public static final Holder<PlacedFeature> TOURMALINE_ORE_LARGE_PLACED = PlacementUtils.register("tourmaline_ore_large_placed",
            ModConfiguredFeatures.TOURMALINE_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (10,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110))));
    public static final Holder<PlacedFeature> TOURMALINE_ORE_BURIED_PLACED = PlacementUtils.register("tourmaline_ore_buried_placed",
            ModConfiguredFeatures.TOURMALINE_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(110))));


    public static final Holder<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = PlacementUtils.register("sapphire_ore_small_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65))));
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = PlacementUtils.register("sapphire_ore_large_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (7,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65))));
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_BURIED_PLACED = PlacementUtils.register("sapphire_ore_buried_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-110), VerticalAnchor.aboveBottom(65))));


    //Ruby
    public static final Holder<PlacedFeature> RUBY_ORE_SMALL_PLACED = PlacementUtils.register("ruby_ore_small_placed",
            ModConfiguredFeatures.RUBY_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70))));
    public static final Holder<PlacedFeature> RUBY_ORE_LARGE_PLACED = PlacementUtils.register("ruby_ore_large_placed",
            ModConfiguredFeatures.RUBY_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (7,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70))));
    public static final Holder<PlacedFeature> RUBY_ORE_BURIED_PLACED = PlacementUtils.register("ruby_ore_buried_placed",
            ModConfiguredFeatures.RUBY_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(70))));


    //Turquoise
    public static final Holder<PlacedFeature> TURQUOISE_ORE_SMALL_PLACED = PlacementUtils.register("turquoise_ore_small_placed",
            ModConfiguredFeatures.TURQUOISE_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (8,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> TURQUOISE_ORE_LARGE_PLACED = PlacementUtils.register("turquoise_ore_large_placed",
            ModConfiguredFeatures.TURQUOISE_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (10,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> TURQUOISE_ORE_BURIED_PLACED = PlacementUtils.register("turquoise_ore_buried_placed",
            ModConfiguredFeatures.TURQUOISE_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (5,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(10))));


    //Moissanite
    public static final Holder<PlacedFeature> MOISSANITE_ORE_SMALL_PLACED = PlacementUtils.register("moissanite_ore_small_placed",
            ModConfiguredFeatures.MOISSANITE_ORE_SMALL, ModOrePlacement.commonOrePlacement
                    (6,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> MOISSANITE_ORE_LARGE_PLACED = PlacementUtils.register("moissanite_ore_large_placed",
            ModConfiguredFeatures.MOISSANITE_ORE_LARGE, ModOrePlacement.rareOrePlacement
                    (4,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> MOISSANITE_ORE_BURIED_PLACED = PlacementUtils.register("moissanite_ore_buried_placed",
            ModConfiguredFeatures.MOISSANITE_ORE_BURIED, ModOrePlacement.commonOrePlacement
                    (3,
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-120), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = PlacementUtils.register("nether_moissanite_ore_placed",
            ModConfiguredFeatures.NETHER_MOISSANITE_ORE, ModOrePlacement.commonOrePlacement
                    (7, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));

    //Tanzanite
    public static final Holder<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PlacementUtils.register("nether_tanzanite_ore_placed",
            ModConfiguredFeatures.NETHER_TANZANITE_ORE, ModOrePlacement.commonOrePlacement
                    (12, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));


    //Carbonado
    public static final Holder<PlacedFeature> ONYX_ORE_PLACED = PlacementUtils.register("onyx_ore_placed",
            ModConfiguredFeatures.ONYX_ORE, ModOrePlacement.commonOrePlacement
                    (9, // VeinsPerChunk
                    HeightRangePlacement.triangle
                            (VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));

}