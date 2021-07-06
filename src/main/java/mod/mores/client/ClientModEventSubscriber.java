package mod.mores.client;

import mod.mores.Mores;
import mod.mores.client.entity.DuckEntityRenderer;
import mod.mores.gui.AlloyFurnaceScreen;
import mod.mores.init.ContainerInit;

import mod.mores.init.EntityTypeInit;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Subscribe to events from the MOD EventBus that should be handled on the PHYSICAL CLIENT side in this class
 *
 * @author Sinhika
 */
@EventBusSubscriber(modid= Mores.MOD_ID, bus=EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
public class ClientModEventSubscriber
{
    private static final Logger LOGGER = LogManager.getLogger(Mores.MOD_ID + " Client Mod Event Subscriber");

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
        // ScreenManager.registerFactory is not safe to call during parallel mod loading so we queue it to run later
        event.enqueueWork(() -> {
            ScreenManager.register(ContainerInit.ALLOY_FURNACE.get(), AlloyFurnaceScreen::new);
            LOGGER.debug("Registered ContainerType Screens");
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.DUCK.get(), DuckEntityRenderer::new);
    }

} // end class