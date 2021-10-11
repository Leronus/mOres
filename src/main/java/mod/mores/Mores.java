package mod.mores;

import mod.mores.config.Config;
import mod.mores.entity.DuckEntity;
import mod.mores.event.HarvestEvent;
import mod.mores.init.*;
import mod.mores.objects.ItemSpawnEgg;
import mod.mores.recipe.ShieldRecipes;
import mod.mores.world.DeepslateOreGeneration;
import mod.mores.world.OreGeneration;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

/**
 * Main class that loads mOres
 * @author Leronus
 */
@Mod("mores")
public class Mores
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "mores";

    public Mores() {
        //Create config
        new Config();

        //Get the mod event bus
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the setup method for modloading
        bus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        bus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        bus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        bus.addListener(this::doClientStuff);

        //Registering mores resources
        SoundTypeInit.SOUND_TYPES.register(bus);
        EntityTypeInit.ENTITY_TYPES.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        ContainerInit.CONTAINER_TYPES.register(bus);
        TileEntityTypeInit.TILE_ENTITY_TYPES.register(bus);

        //Registering the harvestLevels
        MinecraftForge.EVENT_BUS.register(HarvestEvent.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        //Start the ore generation
        //MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, DeepslateOreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    @SuppressWarnings("deprecation")
    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> GlobalEntityTypeAttributes.put(EntityTypeInit.DUCK.get(), DuckEntity.setAttributes().build()));
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // dispatch IMC to another mod
        InterModComms.sendTo("mores", "modloaded", () -> { LOGGER.info("Intermod queue event"); return "Mores ready to talk";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ItemSpawnEgg.initSpawnEggs();
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("Server has started");
    }
}

