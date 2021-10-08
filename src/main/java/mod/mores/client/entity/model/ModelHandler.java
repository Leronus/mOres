package mod.mores.client.entity.model;

import mod.mores.Mores;
import mod.mores.client.entity.ShieldTextures;
import mod.mores.init.ItemInit;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModelHandler {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        addShieldPropertyOverrides(new ResourceLocation(Mores.MOD_ID, "blocking"),
                (stack, world, entity) -> entity != null && entity.isUsingItem()
                        && entity.getUseItem() == stack ? 1.0F : 0.0F,
                ItemInit.COPPER_SHIELD.get());
//                ,BetterShields.goldShield, BetterShields.diamondShield,
//                BetterShields.netheriteShield)
    }

    private static void addShieldPropertyOverrides(ResourceLocation override, IItemPropertyGetter propertyGetter,
                                                   IItemProvider... shields) {
        for (IItemProvider shield : shields) {
            ItemModelsProperties.register(shield.asItem(), override, propertyGetter);
        }
    }

    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void onStitch(TextureStitchEvent.Pre event) {
        if (event.getMap().location().equals(AtlasTexture.LOCATION_BLOCKS)) {
            for (RenderMaterial textures : new RenderMaterial[] { ShieldTextures.LOCATION_COPPER_SHIELD_BASE_PATTERN,
                    ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN
//                    , ShieldTextures.LOCATION_GOLD_SHIELD_BASE,
//                    ShieldTextures.LOCATION_GOLD_SHIELD_BASE_NOPATTERN, ShieldTextures.LOCATION_DIAMOND_SHIELD_BASE,
//                    ShieldTextures.LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_NETHERITE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN
            }) {
                event.addSprite(textures.texture());
            }
        }
    }

}
