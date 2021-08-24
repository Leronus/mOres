package mod.mores;

import mod.mores.client.ClientModEventSubscriber;
import mod.mores.events.HarvestEvent;
import mod.mores.init.BlockInit;
import mod.mores.init.EntityTypeInit;
import mod.mores.init.ItemInit;
import mod.mores.init.SoundTypeInit;
import mod.mores.objects.ItemSpawnEgg;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class that loads mOres
 * @author Leronus
 */
// The value here should match an entry in the META-INF/mods.toml file
@Mod("mores")
public class Mores
{
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "mores";

    public Mores() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the setupCommon method for modloading
        bus.addListener(this::setupCommon);
        // Register the setupClient method for modloading
        bus.addListener(this::setupClient);

        SoundTypeInit.SOUND_TYPES.register(bus);
        EntityTypeInit.ENTITY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

//        MenuInit.MENU_TYPES.register(bus);
        //TODO AlloyFurnaceTypes
//        BLockEntityTypeInit.TILE_ENTITY_TYPES.register(bus);


        MinecraftForge.EVENT_BUS.register(HarvestEvent.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Start the ore generation
        //TODO Fix oreGen
//        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

//    @SuppressWarnings("deprecation")
    private void setupCommon(final FMLCommonSetupEvent event) {

    }

    private void setupClient(final FMLCommonSetupEvent event) {
        ClientModEventSubscriber.init();
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ItemSpawnEgg.initSpawnEggs();
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("Server has started");
    }
}

