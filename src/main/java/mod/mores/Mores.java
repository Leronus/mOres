package mod.mores;

import mod.mores.config.Config;
import mod.mores.entity.ModEntityTypes;
import mod.mores.item.custom.ModSpawnEggItem;
import mod.mores.block.ModBlocks;
import mod.mores.item.ModItems;
import mod.mores.sound.ModSounds;
import mod.mores.util.FuelHandler;
//import mod.mores.world.OreGeneration;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mores")
public class Mores
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "mores";

    public Mores() {
        //Get the mod event bus
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //Registering mores resources
        ModItems.register(bus);
        ModBlocks.register(bus);

        //enchants.register
        ModSounds.register(bus);
        //paintings.register
        //fluids.register

//        ModBlockEntities.register(bus);
//        ModMenuTypes.register(bus);

        //recipes.register
        //effects.register

        //potions.register
        ModEntityTypes.register(bus);

        //structures.register
        //villagers.register

        //Register fuels
        MinecraftForge.EVENT_BUS.register(FuelHandler.instance);

        //Load config
        new Config();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // dispatch IMC to another mod
        InterModComms.sendTo("mores", "modloaded", () -> { LOGGER.info("Intermod queue event"); return "Mores ready to talk";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
