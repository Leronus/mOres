package mod.mores.events;

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
@Mod.EventBusSubscriber(modid = Mores.MOD_ID)
public class EntityEvents {
    /**
     * Called when a biome is loaded
     * @author Leronus
     */
    @SubscribeEvent
    public static void onBiomeLoad(final BiomeLoadingEvent biomeLoadingEvent){
        if (biomeLoadingEvent.getName() == null){
            return;
        }
        MobSpawnInfoBuilder spawns = biomeLoadingEvent.getSpawns();
        boolean beach = biomeLoadingEvent.getCategory().equals(Biome.Category.BEACH);
        boolean river = biomeLoadingEvent.getCategory().equals(Biome.Category.RIVER);
        boolean swamp = biomeLoadingEvent.getCategory().equals(Biome.Category.SWAMP);
        boolean ocean = biomeLoadingEvent.getCategory().equals(Biome.Category.OCEAN);
        boolean savanna = biomeLoadingEvent.getCategory().equals(Biome.Category.SAVANNA);
        boolean jungle = biomeLoadingEvent.getCategory().equals(Biome.Category.JUNGLE);

        if (beach || river || swamp || savanna || jungle) {
            spawns.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(EntityTypeInit.DUCK.get(), 9, 3, 8));
        }
    }
}
