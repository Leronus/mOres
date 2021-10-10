package mod.mores.data;

import mod.mores.Mores;
//import mod.mores.recipe.AlloyFurnaceRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * bundles up the GatherDataEvent handler and all the necessary data providers
 * for data generation.
 *
 * @author Leronus
 */
@EventBusSubscriber(modid = Mores.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators
{

    /**
     * GatherDataEvent handler.
     *
     * @param event the GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer())
        {
//            gen.addProvider(new AlloyFurnaceRecipes(gen));
        }
    }
}