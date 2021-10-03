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
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Event that handles all natural entity spawning
 * @author Leronus
 */
@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EntityEvents {
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

        boolean beach = event.getCategory().equals(Biome.Category.BEACH);
        boolean river = event.getCategory().equals(Biome.Category.RIVER);

        if (river) {
            spawns.getSpawner(EntityClassification.WATER_AMBIENT).add(new MobSpawnInfo.Spawners(EntityTypeInit.DUCK.get(), 4, 1, 3));
        }
        else if (beach) {
            spawns.getSpawner(EntityClassification.WATER_AMBIENT).add(new MobSpawnInfo.Spawners(EntityTypeInit.DUCK.get(), 7, 2, 4));
        }
    }
}
