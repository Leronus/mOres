package mod.mores;

//import mod.mores.world.OreGeneration;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Subscribe to events from the FORGE EventBus that should be handled on both PHYSICAL sides in this class
 *
 */
@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventSubscriber {
    /**
     * Biome loading triggers ore generation.
     */
    @SubscribeEvent(priority= EventPriority.HIGH)
    public static void onBiomeLoading(BiomeLoadingEvent evt)
    {
        if (evt.getCategory() == Biome.BiomeCategory.NETHER)
        {
//            OreGeneration.generateOres(evt);
            //DeepslateOreGeneration.generateOres(evt);
        }
        else if (evt.getCategory() != Biome.BiomeCategory.THEEND)
        {
//            OreGeneration.generateOres(evt);
            //DeepslateOreGeneration.generateOres(evt);
        }
    } // end onBiomeLoading()
}
