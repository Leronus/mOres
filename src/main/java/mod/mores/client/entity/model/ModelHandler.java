//package mod.mores.client.entity.model;
//
//import mod.mores.Mores;
//import mod.mores.client.entity.ShieldTextures;
//import mod.mores.init.ItemInit;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.client.event.TextureStitchEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//
//@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class ModelHandler {
//
//    @SubscribeEvent
//    public static void init(FMLClientSetupEvent event) {
//        addShieldPropertyOverrides(new ResourceLocation(Mores.MODID, "blocking"),
//                (stack, world, entity) -> entity != null && entity.isUsingItem()
//                        && entity.getUseItem() == stack ? 1.0F : 0.0F,
//                ItemInit.COPPER_SHIELD.get(), ItemInit.TIN_SHIELD.get(), ItemInit.BRONZE_SHIELD.get(),
//                ItemInit.SILVER_SHIELD.get(), ItemInit.COBALT_SHIELD.get(), ItemInit.AMETHYST_SHIELD.get(), ItemInit.EMERALD_SHIELD.get(),
//                ItemInit.OBSIDIAN_SHIELD.get(), ItemInit.STERLING_SHIELD.get(), ItemInit.STEEL_SHIELD.get(),
//                ItemInit.TOPAZ_SHIELD.get(), ItemInit.TOURMALINE_SHIELD.get(), ItemInit.TANZANITE_SHIELD.get(),
//                ItemInit.SAPPHIRE_SHIELD.get(), ItemInit.RUBY_SHIELD.get(), ItemInit.MOISSANITE_SHIELD.get(),
//                ItemInit.ONYX_SHIELD.get(), ItemInit.GRAPHENE_SHIELD.get(), ItemInit.TURQUOISE_SHIELD.get());
//    }
//
//    private static void addShieldPropertyOverrides(ResourceLocation override, IItemPropertyGetter propertyGetter,
//                                                   IItemProvider... shields) {
//        for (IItemProvider shield : shields) {
//            ItemModelsProperties.register(shield.asItem(), override, propertyGetter);
//        }
//    }
//
//    @SuppressWarnings("deprecation")
//    @SubscribeEvent
//    public static void onStitch(TextureStitchEvent.Pre event) {
//        if (event.getMap().location().equals(AtlasTexture.LOCATION_BLOCKS)) {
//            for (RenderMaterial textures : new RenderMaterial[] {
//                    ShieldTextures.LOCATION_COPPER_SHIELD_BASE,
//                    ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_TIN_SHIELD_BASE,
//                    ShieldTextures.LOCATION_TIN_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_SILVER_SHIELD_BASE,
//                    ShieldTextures.LOCATION_SILVER_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_BRONZE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_BRONZE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_COBALT_SHIELD_BASE,
//                    ShieldTextures.LOCATION_COBALT_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE,
//                    ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_STERLING_SHIELD_BASE,
//                    ShieldTextures.LOCATION_STERLING_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_STEEL_SHIELD_BASE,
//                    ShieldTextures.LOCATION_STEEL_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE,
//                    ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_EMERALD_SHIELD_BASE,
//                    ShieldTextures.LOCATION_EMERALD_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE,
//                    ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_RUBY_SHIELD_BASE,
//                    ShieldTextures.LOCATION_RUBY_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_ONYX_SHIELD_BASE,
//                    ShieldTextures.LOCATION_ONYX_SHIELD_BASE_NOPATTERN,
//                    ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE,
//                    ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN
//            }) {
//                event.addSprite(textures.texture());
//            }
//        }
//    }
//
//}
