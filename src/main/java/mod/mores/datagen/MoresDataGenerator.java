package mod.mores.datagen;
import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import mod.mores.Mores;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * Bundles up the GatherDataEvent handler and all the necessary data providers
 * for data generation.
 *
 * @author Leronus
 */
@EventBusSubscriber(modid = Mores.MODID, bus = MOD)
public class MoresDataGenerator
{

    /**
     * GatherDataEvent handler.
     *
     * @param event GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer())
        {
        }
    } // end gatherData()

} // end-class MoresDataGenerator