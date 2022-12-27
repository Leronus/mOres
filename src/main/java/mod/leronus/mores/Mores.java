package mod.leronus.mores;

import com.mojang.logging.LogUtils;
import mod.leronus.mores.block.ModBlockEntities;
import mod.leronus.mores.block.ModBlocks;
import mod.leronus.mores.block.ModContainers;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.recipe.ModRecipes;
import mod.leronus.mores.world.feature.ModConfiguredFeatures;
import mod.leronus.mores.world.feature.ModPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Mores.MODID)
public class Mores {
    public static final String MODID = "mores";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public Mores() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModBlockEntities.TILE_ENTITY_TYPES.register(modEventBus);
        ModRecipes.RECIPE_TYPES.register(modEventBus);
        ModRecipes.RECIPE_SERIALIZERS.register(modEventBus);
        ModContainers.CONTAINER_TYPES.register(modEventBus);

        //Load config
        new Config();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
