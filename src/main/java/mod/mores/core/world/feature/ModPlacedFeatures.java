package mod.mores.core.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    //Tin Ore
    public static final Holder<PlacedFeature> TIN_ORE_UPPER_PLACED = PlacementUtils.register("tin_ore_upper_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(95, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(90), VerticalAnchor.aboveBottom(400))));
    public static final Holder<PlacedFeature> TIN_ORE_MIDDLE_PLACED = PlacementUtils.register("tin_ore_middle_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> TIN_ORE_SMALL_PLACED = PlacementUtils.register("tin_ore_small_placed",
            ModConfiguredFeatures.TIN_ORE_SMALL, ModOrePlacement.commonOrePlacement(15, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(100))));

    //Silver Ore
    public static final Holder<PlacedFeature> SILVER_ORE_UPPER_PLACED = PlacementUtils.register("silver_ore_upper_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(85, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(85), VerticalAnchor.aboveBottom(340))));
    public static final Holder<PlacedFeature> SILVER_ORE_MIDDLE_PLACED = PlacementUtils.register("silver_ore_middle_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(13, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(65))));
    public static final Holder<PlacedFeature> SILVER_ORE_SMALL_PLACED = PlacementUtils.register("silver_ore_small_placed",
            ModConfiguredFeatures.SILVER_ORE_SMALL, ModOrePlacement.commonOrePlacement(13, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(90))));

    public static final Holder<PlacedFeature> COBALT_ORE_UPPER_PLACED = PlacementUtils.register("cobalt_ore_upper_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(75, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(85), VerticalAnchor.aboveBottom(320))));
    public static final Holder<PlacedFeature> COBALT_ORE_MIDDLE_PLACED = PlacementUtils.register("cobalt_ore_middle_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> COBALT_ORE_SMALL_PLACED = PlacementUtils.register("cobalt_ore_small_placed",
            ModConfiguredFeatures.COBALT_ORE_SMALL, ModOrePlacement.commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(60))));


    public static final Holder<PlacedFeature> NETHER_SILVER_ORE_PLACED = PlacementUtils.register("nether_silver_ore_placed",
            ModConfiguredFeatures.NETHER_SILVER_ORE, ModOrePlacement.commonOrePlacement(24, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));
    //Original
//    public static final Holder<PlacedFeature> TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed",
//            ModConfiguredFeatures.TOPAZ_ORE, ModOrePlacement.commonOrePlacement(14, // VeinsPerChunk
//                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-45), VerticalAnchor.aboveBottom(0))));
    public static final Holder<PlacedFeature> TOPAZ_ORE_PLACED = PlacementUtils.register("topaz_ore_placed",
            ModConfiguredFeatures.TOPAZ_ORE, ModOrePlacement.commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(10))));
    public static final Holder<PlacedFeature> TOURMALINE_ORE_PLACED = PlacementUtils.register("tourmaline_ore_placed",
            ModConfiguredFeatures.TOURMALINE_ORE, ModOrePlacement.commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(10))));
    //TODO Check if height is correct
    public static final Holder<PlacedFeature> TANZANITE_ORE_PLACED = PlacementUtils.register("tanzanite_ore_placed",
            ModConfiguredFeatures.TANZANITE_ORE, ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, ModOrePlacement.commonOrePlacement(11, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-20))));
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-20))));
    public static final Holder<PlacedFeature> TURQUOISE_ORE_PLACED = PlacementUtils.register("turquoise_ore_placed",
            ModConfiguredFeatures.TURQUOISE_ORE, ModOrePlacement.commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-75), VerticalAnchor.aboveBottom(-45))));
    //TODO Change height
    public static final Holder<PlacedFeature> MOISSANITE_ORE_PLACED = PlacementUtils.register("moissanite_ore_placed",
            ModConfiguredFeatures.MOISSANITE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(-50))));
    public static final Holder<PlacedFeature> NETHER_MOISSANITE_ORE_PLACED = PlacementUtils.register("nether_moissanite_ore_placed",
            ModConfiguredFeatures.NETHER_MOISSANITE_ORE, ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));
    public static final Holder<PlacedFeature> ONYX_ORE_PLACED = PlacementUtils.register("onyx_ore_placed",
            ModConfiguredFeatures.ONYX_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(256))));

}