package mod.leronus.mores.item.client;

import mod.leronus.mores.Mores;
import mod.leronus.mores.item.ModItems;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModelHandler {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            addShieldPropertyOverrides(new ResourceLocation(Mores.MODID, "blocking"),
                    (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F,
                    ModItems.COPPER_SHIELD.get(), ModItems.TIN_SHIELD.get(), ModItems.BRONZE_SHIELD.get(),
                    ModItems.SILVER_SHIELD.get(), ModItems.COBALT_SHIELD.get(),
                    ModItems.AMETHYST_SHIELD.get(),
                    ModItems.EMERALD_SHIELD.get(),
                    ModItems.OBSIDIAN_SHIELD.get(), ModItems.STERLING_SHIELD.get(), ModItems.STEEL_SHIELD.get(),
                    ModItems.TOPAZ_SHIELD.get(), ModItems.TOURMALINE_SHIELD.get(), ModItems.TANZANITE_SHIELD.get(),
                    ModItems.SAPPHIRE_SHIELD.get(), ModItems.RUBY_SHIELD.get(), ModItems.MOISSANITE_SHIELD.get(),
                    ModItems.ONYX_SHIELD.get(), ModItems.GRAPHENE_SHIELD.get(), ModItems.TURQUOISE_SHIELD.get());
        });
    }

    private static void addShieldPropertyOverrides(ResourceLocation override, ClampedItemPropertyFunction propertyGetter,
                                                   ItemLike... shields) {
        for (ItemLike shield : shields) {
            ItemProperties.register(shield.asItem(), override, propertyGetter);
        }
    }

    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void onStitch(TextureStitchEvent.Pre event) {
        if (event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            for (Material textures : new Material[] {
                    ShieldTextures.LOCATION_COPPER_SHIELD_BASE,
                    ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_TIN_SHIELD_BASE,
                    ShieldTextures.LOCATION_TIN_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_SILVER_SHIELD_BASE,
                    ShieldTextures.LOCATION_SILVER_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_BRONZE_SHIELD_BASE,
                    ShieldTextures.LOCATION_BRONZE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_COBALT_SHIELD_BASE,
                    ShieldTextures.LOCATION_COBALT_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE,
                    ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_STERLING_SHIELD_BASE,
                    ShieldTextures.LOCATION_STERLING_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_STEEL_SHIELD_BASE,
                    ShieldTextures.LOCATION_STEEL_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE,
                    ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_EMERALD_SHIELD_BASE,
                    ShieldTextures.LOCATION_EMERALD_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE,
                    ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE,
                    ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE,
                    ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_RUBY_SHIELD_BASE,
                    ShieldTextures.LOCATION_RUBY_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE,
                    ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE,
                    ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE,
                    ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_ONYX_SHIELD_BASE,
                    ShieldTextures.LOCATION_ONYX_SHIELD_BASE_NOPATTERN,
                    ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE,
                    ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN
            }) {
                event.addSprite(textures.texture());
            }
        }
    }

}
