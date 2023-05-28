package mod.leronus.mores;

import com.mojang.logging.LogUtils;
import mod.leronus.mores.block.ModBlockEntities;
import mod.leronus.mores.block.ModBlocks;
import mod.leronus.mores.block.ModContainers;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.loot.ModLootModifiers;
import mod.leronus.mores.painting.ModPaintings;
import mod.leronus.mores.recipe.ModRecipes;
import mod.leronus.mores.sound.ModSounds;
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
    public static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public Mores() {
        //Load config
        new Config();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModContainers.register(modEventBus);
        ModSounds.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ModPaintings.register(modEventBus);


        MinecraftForge.EVENT_BUS.register(this);
    }
}

