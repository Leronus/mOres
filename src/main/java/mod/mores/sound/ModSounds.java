package mod.mores.sound;

import mod.mores.Mores;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MODID);

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = registerSoundEvent("living_duck_sound");
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = registerSoundEvent( "dying_duck_sound");
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = registerSoundEvent( "hurt_duck_sound");

    public static final RegistryObject<SoundEvent> DARUDE_SANDSTORM = registerSoundEvent("darude_sandstorm");
    public static final RegistryObject<SoundEvent> RICK_ASTLEY = registerSoundEvent("rick_astley");
    public static final RegistryObject<SoundEvent> CRAZY_FROG = registerSoundEvent("crazy_frog");
    public static final RegistryObject<SoundEvent> IM_BLUE = registerSoundEvent("im_blue");
    public static final RegistryObject<SoundEvent> MY_HORSE = registerSoundEvent("my_horse");

    public static final RegistryObject<SoundEvent> THAT_DUCK = registerSoundEvent("that_duck");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Mores.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
