package mod.mores.item.client;

import mod.mores.Mores;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

public class ShieldTextures {
    public static final Material LOCATION_COPPER_SHIELD_BASE = material("entity/copper_shield_base");
    public static final Material LOCATION_COPPER_SHIELD_BASE_NOPATTERN = material("entity/copper_shield_base_nopattern");

    public static final Material LOCATION_TIN_SHIELD_BASE = material("entity/tin_shield_base");
    public static final Material LOCATION_TIN_SHIELD_BASE_NOPATTERN = material("entity/tin_shield_base_nopattern");

    public static final Material LOCATION_SILVER_SHIELD_BASE = material("entity/silver_shield_base");
    public static final Material LOCATION_SILVER_SHIELD_BASE_NOPATTERN = material("entity/silver_shield_base_nopattern");

    public static final Material LOCATION_BRONZE_SHIELD_BASE = material("entity/bronze_shield_base");
    public static final Material LOCATION_BRONZE_SHIELD_BASE_NOPATTERN = material("entity/bronze_shield_base_nopattern");

    public static final Material LOCATION_COBALT_SHIELD_BASE = material("entity/cobalt_shield_base");
    public static final Material LOCATION_COBALT_SHIELD_BASE_NOPATTERN = material("entity/cobalt_shield_base_nopattern");

    public static final Material LOCATION_OBSIDIAN_SHIELD_BASE = material("entity/obsidian_shield_base");
    public static final Material LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN = material("entity/obsidian_shield_base_nopattern");

    public static final Material LOCATION_STERLING_SHIELD_BASE = material("entity/sterling_shield_base");
    public static final Material LOCATION_STERLING_SHIELD_BASE_NOPATTERN = material("entity/sterling_shield_base_nopattern");

    public static final Material LOCATION_STEEL_SHIELD_BASE = material("entity/steel_shield_base");
    public static final Material LOCATION_STEEL_SHIELD_BASE_NOPATTERN = material("entity/steel_shield_base_nopattern");

    public static final Material LOCATION_AMETHYST_SHIELD_BASE = material("entity/amethyst_shield_base");
    public static final Material LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN = material("entity/amethyst_shield_base_nopattern");

    public static final Material LOCATION_EMERALD_SHIELD_BASE = material("entity/emerald_shield_base");
    public static final Material LOCATION_EMERALD_SHIELD_BASE_NOPATTERN = material("entity/emerald_shield_base_nopattern");

    public static final Material LOCATION_TOPAZ_SHIELD_BASE = material("entity/topaz_shield_base");
    public static final Material LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN = material("entity/topaz_shield_base_nopattern");

    public static final Material LOCATION_TOURMALINE_SHIELD_BASE = material("entity/tourmaline_shield_base");
    public static final Material LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN = material("entity/tourmaline_shield_base_nopattern");

    public static final Material LOCATION_TANZANITE_SHIELD_BASE = material("entity/tanzanite_shield_base");
    public static final Material LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN = material("entity/tanzanite_shield_base_nopattern");

    public static final Material LOCATION_RUBY_SHIELD_BASE = material("entity/ruby_shield_base");
    public static final Material LOCATION_RUBY_SHIELD_BASE_NOPATTERN = material("entity/ruby_shield_base_nopattern");

    public static final Material LOCATION_SAPPHIRE_SHIELD_BASE = material("entity/sapphire_shield_base");
    public static final Material LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN = material("entity/sapphire_shield_base_nopattern");

    public static final Material LOCATION_MOISSANITE_SHIELD_BASE = material("entity/moissanite_shield_base");
    public static final Material LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN = material("entity/moissanite_shield_base_nopattern");

    public static final Material LOCATION_ONYX_SHIELD_BASE = material("entity/onyx_shield_base");
    public static final Material LOCATION_ONYX_SHIELD_BASE_NOPATTERN = material("entity/onyx_shield_base_nopattern");

    public static final Material LOCATION_GRAPHENE_SHIELD_BASE = material("entity/graphene_shield_base");
    public static final Material LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN = material("entity/graphene_shield_base_nopattern");

    public static final Material LOCATION_TURQUOISE_SHIELD_BASE = material("entity/turquoise_shield_base");
    public static final Material LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN = material("entity/turquoise_shield_base_nopattern");

    @SuppressWarnings("deprecation")
    private static Material material(String path) {
        return new Material(
                TextureAtlas.LOCATION_BLOCKS, new ResourceLocation(Mores.MODID, path));
    }
}