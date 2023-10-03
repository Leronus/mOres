package mod.leronus.mores.api.client;

import mod.leronus.mores.Mores;
import mod.leronus.mores.block.ModContainers;
import mod.leronus.mores.block.custom.AlloyFurnaceContainer;
import mod.leronus.mores.block.custom.screen.AlloyFurnaceScreen;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.entity.client.DuckRenderer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@EventBusSubscriber(modid= Mores.MODID, bus=EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
public class ClientModEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(Mores.MODID + " Client Mod Event Subscriber");

    /**
     * We need to register our renderers on the client because rendering code does not exist on the server
     * and trying to use it on a dedicated server will crash the game.
     * <p>
     * This method will be called by Forge when it is time for the mod to do its client-side setup
     * This method will always be called after the Registry events.
     * This means that all Blocks, Items, TileEntityTypes, etc. will all have been registered already
     */
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event)
    {
        // Register ContainerType Screens
        // ScreenManager.registerFactory is not safe to call during parallel mod loading, so we queue it to run later
        event.enqueueWork(() -> {
            MenuScreens.register((MenuType<AlloyFurnaceContainer>) ModContainers.ALLOY_FURNACE.get(), AlloyFurnaceScreen::new);
            LOGGER.debug("Registered ContainerType Screens");
        });
        //Register the duck entity client side
        EntityRenderers.register(ModEntityTypes.DUCK.get(), DuckRenderer::new);
    } // end onFMLClientSetupEvent


} // end class