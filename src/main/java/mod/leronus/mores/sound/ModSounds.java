package mod.leronus.mores.sound;

import mod.leronus.mores.Mores;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MODID);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Mores.MODID, name)));
    }

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = registerSoundEvent( "living_duck_sound");
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = registerSoundEvent( "dying_duck_sound");
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = registerSoundEvent( "hurt_duck_sound");

    public static final RegistryObject<SoundEvent> SWEET_CAROLINE_BOOTLEG = registerSoundEvent("sweet_caroline_bootleg");
    public static final RegistryObject<SoundEvent> CIPHER = registerSoundEvent( "cipher");

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}