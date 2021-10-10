package mod.mores.event;

import mod.mores.Mores;
import mod.mores.init.EntityTypeInit;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Event that handles all natural entity spawning
 * @author Leronus
 */
@Mod.EventBusSubscriber(modid = Mores.MODID)
public class EntityEvent {
    /**
     * Called when a biome is loaded
     * @author Leronus
     */
    @SubscribeEvent
    public static void onBiomeLoad(final BiomeLoadingEvent event){
        if (event.getName() == null){
            return;
        }

        MobSpawnInfoBuilder spawns = event.getSpawns();

        if (event.getCategory().equals(Biome.Category.BEACH) || event.getCategory().equals(Biome.Category.RIVER)) {
            spawns.addSpawn(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityTypeInit.DUCK.get(), 1, 2, 5));
        }
    }
}
