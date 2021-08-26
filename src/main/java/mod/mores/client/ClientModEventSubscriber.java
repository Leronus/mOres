package mod.mores.client;

import mod.mores.Mores;
import mod.mores.client.entity.DuckRenderer;
import mod.mores.client.entity.model.DuckModel;
import mod.mores.init.EntityInit;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Subscribe to events from the MOD EventBus that should be handled on the PHYSICAL CLIENT side in this class
 *
 * @author Leronus
 */
@EventBusSubscriber(modid= Mores.MOD_ID, bus=EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
public class ClientModEventSubscriber
{
    public static ModelLayerLocation DUCK_LAYER = new ModelLayerLocation(new ResourceLocation(Mores.MOD_ID, "duck"), "duck");
    private static final Logger LOGGER = LogManager.getLogger(Mores.MOD_ID + " Client Mod Event Subscriber");

    public static void init() {

    }

    /**
     * We need to register our renderers on the client because rendering code does not exist on the server
     * and trying to use it on a dedicated server will crash the game.
     * <p>
     * This method will be called by Forge when it is time for the mod to do its client-side setup
     * This method will always be called after the Registry events.
     * This means that all Blocks, Items, TileEntityTypes, etc. will all have been registered already
     */
//    @SubscribeEvent
//    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event)
//    {
//        // Register ContainerType Screens
//        //TODO MenuScreens
//        event.enqueueWork(() -> {
//            MenuScreens.register(MenuInit.ALLOY_FURNACE, AlloyFurnaceScreen::new);
//            LOGGER.debug("Registered ContainerType Screens");
//        });
//    }

    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.DUCK_ENTITY.get(), DuckRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DUCK_LAYER, DuckModel::createBodyLayer);
    }
} // end class