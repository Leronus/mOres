package mod.leronus.mores.world;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mod.leronus.mores.config.Config;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;

// NOTE: This codec pattern matches Forge's own AddSpawnsBiomeModifier style.
public record ConfigurableAddSpawnsModifier(
        HolderSet<Biome> biomes,
        MobCategory category,
        MobSpawnSettings.SpawnerData spawner
) implements BiomeModifier {

    public static final Codec<ConfigurableAddSpawnsModifier> CODEC = RecordCodecBuilder.create(inst -> inst.group(
            Biome.LIST_CODEC.fieldOf("biomes").forGetter(ConfigurableAddSpawnsModifier::biomes),
            MobCategory.CODEC.fieldOf("category").forGetter(ConfigurableAddSpawnsModifier::category),
            MobSpawnSettings.SpawnerData.CODEC.fieldOf("spawner").forGetter(ConfigurableAddSpawnsModifier::spawner)
    ).apply(inst, ConfigurableAddSpawnsModifier::new));

    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase != Phase.ADD) return;

        // ✅ config gate
        if (!Config.spawnDuck.get()) return;

        if (!biomes.contains(biome)) return;

        builder.getMobSpawnSettings().addSpawn(category, spawner);
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return CODEC;
    }
}
