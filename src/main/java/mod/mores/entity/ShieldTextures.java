//package mod.mores.client.entity;
//
//import mod.mores.Mores;
//import net.minecraft.client.renderer.model.RenderMaterial;
//import net.minecraft.client.renderer.texture.AtlasTexture;
//import net.minecraft.util.ResourceLocation;
//
////@OnlyIn(Dist.CLIENT)
//public class ShieldTextures {
//    public static final RenderMaterial LOCATION_COPPER_SHIELD_BASE = material("entity/copper_shield_base");
//    public static final RenderMaterial LOCATION_COPPER_SHIELD_BASE_NOPATTERN = material("entity/copper_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_TIN_SHIELD_BASE = material("entity/tin_shield_base");
//    public static final RenderMaterial LOCATION_TIN_SHIELD_BASE_NOPATTERN = material("entity/tin_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_SILVER_SHIELD_BASE = material("entity/silver_shield_base");
//    public static final RenderMaterial LOCATION_SILVER_SHIELD_BASE_NOPATTERN = material("entity/silver_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_BRONZE_SHIELD_BASE = material("entity/bronze_shield_base");
//    public static final RenderMaterial LOCATION_BRONZE_SHIELD_BASE_NOPATTERN = material("entity/bronze_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_COBALT_SHIELD_BASE = material("entity/cobalt_shield_base");
//    public static final RenderMaterial LOCATION_COBALT_SHIELD_BASE_NOPATTERN = material("entity/cobalt_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_OBSIDIAN_SHIELD_BASE = material("entity/obsidian_shield_base");
//    public static final RenderMaterial LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN = material("entity/obsidian_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_STERLING_SHIELD_BASE = material("entity/sterling_shield_base");
//    public static final RenderMaterial LOCATION_STERLING_SHIELD_BASE_NOPATTERN = material("entity/sterling_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_STEEL_SHIELD_BASE = material("entity/steel_shield_base");
//    public static final RenderMaterial LOCATION_STEEL_SHIELD_BASE_NOPATTERN = material("entity/steel_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_AMETHYST_SHIELD_BASE = material("entity/amethyst_shield_base");
//    public static final RenderMaterial LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN = material("entity/amethyst_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_EMERALD_SHIELD_BASE = material("entity/emerald_shield_base");
//    public static final RenderMaterial LOCATION_EMERALD_SHIELD_BASE_NOPATTERN = material("entity/emerald_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_TOPAZ_SHIELD_BASE = material("entity/topaz_shield_base");
//    public static final RenderMaterial LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN = material("entity/topaz_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_TOURMALINE_SHIELD_BASE = material("entity/tourmaline_shield_base");
//    public static final RenderMaterial LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN = material("entity/tourmaline_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_TANZANITE_SHIELD_BASE = material("entity/tanzanite_shield_base");
//    public static final RenderMaterial LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN = material("entity/tanzanite_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_RUBY_SHIELD_BASE = material("entity/ruby_shield_base");
//    public static final RenderMaterial LOCATION_RUBY_SHIELD_BASE_NOPATTERN = material("entity/ruby_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_SAPPHIRE_SHIELD_BASE = material("entity/sapphire_shield_base");
//    public static final RenderMaterial LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN = material("entity/sapphire_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_MOISSANITE_SHIELD_BASE = material("entity/moissanite_shield_base");
//    public static final RenderMaterial LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN = material("entity/moissanite_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_ONYX_SHIELD_BASE = material("entity/onyx_shield_base");
//    public static final RenderMaterial LOCATION_ONYX_SHIELD_BASE_NOPATTERN = material("entity/onyx_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_GRAPHENE_SHIELD_BASE = material("entity/graphene_shield_base");
//    public static final RenderMaterial LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN = material("entity/graphene_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_TURQUOISE_SHIELD_BASE = material("entity/turquoise_shield_base");
//    public static final RenderMaterial LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN = material("entity/turquoise_shield_base_nopattern");
//
//    @SuppressWarnings("deprecation")
//    private static RenderMaterial material(String path) {
//        return new RenderMaterial(
//                AtlasTexture.LOCATION_BLOCKS, new ResourceLocation(Mores.MODID, path));
//    }
//}