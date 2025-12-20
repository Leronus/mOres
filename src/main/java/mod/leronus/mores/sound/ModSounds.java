package mod.leronus.mores.sound;

import mod.leronus.mores.Mores;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, Mores.MODID);

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(
                name,
                () -> SoundEvent.createVariableRangeEvent(
                        new ResourceLocation(Mores.MODID, name)
                )
        );
    }
    // === Entity sounds ===
    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND =
            register("living_duck_sound");
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND =
            register("dying_duck_sound");
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND =
            register("hurt_duck_sound");

    // === Misc sounds ===
    public static final RegistryObject<SoundEvent> SWEET_CAROLINE_BOOTLEG =
            register("sweet_caroline_bootleg");
    public static final RegistryObject<SoundEvent> CIPHER =
            register("cipher");

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    private ModSounds() {}
}
