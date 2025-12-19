package mod.leronus.mores.world;

import com.mojang.serialization.Codec;
import mod.leronus.mores.Mores;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeModifiers {
    // In 1.19.2 this registry is named BIOME_MODIFIER_SERIALIZERS in ForgeRegistries
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, Mores.MODID);

    public static final RegistryObject<Codec<? extends BiomeModifier>> CONFIGURABLE_ADD_SPAWNS =
            BIOME_MODIFIER_SERIALIZERS.register("configurable_add_spawns",
                    () -> ConfigurableAddSpawnsModifier.CODEC);

    public static void register(IEventBus bus) {
        BIOME_MODIFIER_SERIALIZERS.register(bus);
    }
}

