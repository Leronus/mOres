package mod.leronus.mores.sound;

import mod.leronus.mores.Mores;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_TYPES = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MODID);

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = SOUND_TYPES.register(
            "living_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "living_duck_sound")));
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = SOUND_TYPES.register(
            "dying_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "dying_duck_sound")));
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = SOUND_TYPES.register(
            "hurt_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "hurt_duck_sound")));

    public static void register(IEventBus eventBus) {
        SOUND_TYPES.register(eventBus);
    }
}