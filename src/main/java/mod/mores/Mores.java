package mod.mores;

import mod.mores.client.ClientModEventSubscriber;
import mod.mores.entity.DuckEntity;
import mod.mores.init.BlockInit;
import mod.mores.init.EntityInit;
import mod.mores.init.ItemInit;
import mod.mores.init.SoundInit;
import mod.mores.objects.ItemSpawnEgg;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
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
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setupCommon);
        bus.addListener(this::setupClient);

        //Register our registries
        registerDeferredRegistries(bus);

        //TODO Fix harvestEvent
        ///Register our new harvest tiers to vanilla items
//        MinecraftForge.EVENT_BUS.register(HarvestEvent.class);

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

    public static void registerDeferredRegistries(IEventBus bus) {
        //TODO AlloyFurnaceTypes
//      BLockEntityTypeInit.TILE_ENTITY_TYPES.register(bus);
//      MenuInit.MENU_TYPES.register(bus);
        SoundInit.SOUND_TYPES.register(bus);
        EntityInit.ENTITY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ItemSpawnEgg.initSpawnEggs();
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.DUCK_ENTITY.get(), DuckEntity.createAttributes().build());
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("Server has started");
    }
}

