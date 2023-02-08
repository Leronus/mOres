package mod.leronus.mores.datagen;

import mod.leronus.mores.Mores;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModPlaceableTagProvider(generator, Mores.MODID, existingFileHelper));
//        generator.addProvider(new ModRecipeProvider(generator));
//        generator.addProvider(new ModLootTableProvider(generator));
//        generator.addProvider(new ModBlocksStateProvider(generator, existingFileHelper));
//        generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));
    }
}