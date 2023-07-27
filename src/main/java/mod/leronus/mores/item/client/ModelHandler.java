package mod.leronus.mores.item.client;

import mod.leronus.mores.Mores;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.item.custom.ModShieldItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = Mores.MODID)
public class ModelHandler {

    @SuppressWarnings("unused")
    public static void setup(final FMLClientSetupEvent event) {
        initShields();
    }

    private static void initShields() {
        //noinspection deprecation
        ItemPropertyFunction blockFn = (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F;
        for (RegistryObject<ModShieldItem> shieldItem : ModItems.SHIELDS) {
            ItemProperties.register(shieldItem.get(), ModShieldItem.BLOCKING, blockFn);
        }
    }

    public static void creativeTabsBuildContents(final CreativeModeTabEvent.BuildContents event)
    {
        //TODO Set creative tab to mOres shields
        if (event.getTab() == CreativeModeTabs.COMBAT) {
            for (RegistryObject<ModShieldItem> shield : ModItems.SHIELDS) {
                event.accept(shield.get());
            }
        }
    }
}