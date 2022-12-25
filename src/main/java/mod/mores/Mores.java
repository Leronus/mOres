package mod.mores;

import mod.mores.block.entity.ModBlockEntities;
import mod.mores.config.Config;
import mod.mores.item.custom.ModSpawnEggItem;
import mod.mores.block.ModBlocks;
import mod.mores.item.ModItems;
import mod.mores.recipe.ModRecipes;
import mod.mores.block.custom.screen.AlloyFurnaceScreen;
import mod.mores.block.custom.screen.ModMenuTypes;
import mod.mores.sound.ModSounds;
import mod.mores.util.FuelHandler;
import mod.mores.util.ModItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mores")
public class Mores
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "mores";

    public Mores() {
        //Get the mod event bus
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //Registering mores resources
        ModItems.register(bus);
        ModBlocks.register(bus);

//        ModEnchants.register(bus);
        ModSounds.register(bus);
//        ModPaintings.register(bus);
//        ModFluids.register(bus);

        ModBlockEntities.register(bus);
        ModMenuTypes.CONTAINER_TYPES.register(bus);

        ModRecipes.RECIPE_TYPES.register(bus);
        ModRecipes.RECIPE_SERIALIZERS.register(bus);
//        ModEffects.register(bus);

//        ModPotions.register(bus);
//        ModEntityTypes.register(bus);

//        ModStructures.register(bus);
//        ModVillagers.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        //Register fuels
        MinecraftForge.EVENT_BUS.register(FuelHandler.instance);

        //Load config
        new Config();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_DOOR.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_WINDOW.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_LEAVES.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ALLOY_FURNACE.get(), RenderType.translucent());

        ModItemProperties.addCustomItemProperties();

        MenuScreens.register(ModMenuTypes.ALLOY_FURNACE.get(), AlloyFurnaceScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //Adding a flower
//        event.enqueueWork(() -> {
//            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_ROSE.getId(), ModBlocks.POTTED_PINK_ROSE);
//
//            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
//                    ModItems.RUBY.get(), ModPotions.FREEZE_POTION.get()));
//        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("mOres has started on a server");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
