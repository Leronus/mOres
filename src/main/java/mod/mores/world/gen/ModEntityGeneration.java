package mod.mores.world.gen;

import mod.mores.entity.ModEntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {
        if (event.getName() == null) return;

        // Rivers (most common)
        if (event.getName().equals(Biomes.RIVER.location()) ||
                event.getName().equals(Biomes.FROZEN_RIVER.location())) {

            add(event, ModEntityTypes.DUCK.get(), 15, 3, 5);
        }

        // Swamps (medium)
        else if (event.getName().equals(Biomes.SWAMP.location())) {

            add(event, ModEntityTypes.DUCK.get(), 10, 2, 4);
        }

        // Beaches (rarer, smaller groups)
        else if (event.getName().equals(Biomes.BEACH.location()) ||
                event.getName().equals(Biomes.SNOWY_BEACH.location()) ||
                event.getName().equals(Biomes.STONY_SHORE.location())) {

            add(event, ModEntityTypes.DUCK.get(), 6, 1, 3);
        }
    }



    private static void add(BiomeLoadingEvent event, EntityType<?> type,
                            int weight, int min, int max) {
        event.getSpawns()
                .getSpawner(type.getCategory())
                .add(new MobSpawnSettings.SpawnerData(type, weight, min, max));
    }
}