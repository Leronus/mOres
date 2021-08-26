package mod.mores.events;

import mod.mores.Mores;
import mod.mores.init.EntityInit;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
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
        boolean beach = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.BEACH);
        boolean river = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.RIVER);
        boolean swamp = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.SWAMP);
        boolean ocean = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.OCEAN);
        boolean savanna = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.SAVANNA);
        boolean jungle = biomeLoadingEvent.getCategory().equals(Biome.BiomeCategory.JUNGLE);

        if (beach || river) {
            spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityInit.DUCK_ENTITY.get(), 8, 3, 6));
        }
    }
}
