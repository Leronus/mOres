package mod.mores.client.entity;

import mod.mores.Mores;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//@OnlyIn(Dist.CLIENT)
public class ShieldTextures {
    public static final RenderMaterial LOCATION_COPPER_SHIELD_BASE_PATTERN = material("entity/copper_shield_base_pattern");
    public static final RenderMaterial LOCATION_COPPER_SHIELD_BASE_NOPATTERN = material("entity/copper_shield_base_nopattern");

//    public static final RenderMaterial LOCATION_GOLD_SHIELD_BASE = material("entity/gold_shield_base");
//    public static final RenderMaterial LOCATION_GOLD_SHIELD_BASE_NOPATTERN = material("entity/gold_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_DIAMOND_SHIELD_BASE = material("entity/diamond_shield_base");
//    public static final RenderMaterial LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN = material("entity/diamond_shield_base_nopattern");
//
//    public static final RenderMaterial LOCATION_NETHERITE_SHIELD_BASE = material("entity/netherite_shield_base");
//    public static final RenderMaterial LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN = material("entity/netherite_shield_base_nopattern");

    @SuppressWarnings("deprecation")
    private static RenderMaterial material(String path) {
        return new RenderMaterial(
                AtlasTexture.LOCATION_BLOCKS, new ResourceLocation(Mores.MOD_ID, path));
    }
}