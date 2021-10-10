package mod.mores.init;

import mod.mores.Mores;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundTypeInit {
    public static final DeferredRegister<SoundEvent> SOUND_TYPES = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MODID);

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = SOUND_TYPES.register(
            "living_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "living_duck_sound")));
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = SOUND_TYPES.register(
            "dying_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "dying_duck_sound")));
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = SOUND_TYPES.register(
            "hurt_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "hurt_duck_sound")));

    public static final RegistryObject<SoundEvent> DARUDE_SANDSTORM = SOUND_TYPES.register(
            "darude_sandstorm", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "darude_sandstorm")));
    public static final RegistryObject<SoundEvent> RICK_ASTLEY = SOUND_TYPES.register(
            "rick_astley", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "rick_astley")));
    public static final RegistryObject<SoundEvent> CRAZY_FROG = SOUND_TYPES.register(
            "crazy_frog", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "crazy_frog")));
    public static final RegistryObject<SoundEvent> IM_BLUE = SOUND_TYPES.register(
            "im_blue", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "im_blue")));
    public static final RegistryObject<SoundEvent> MY_HORSE = SOUND_TYPES.register(
            "my_horse", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "my_horse")));

    public static final RegistryObject<SoundEvent> THAT_DUCK = SOUND_TYPES.register(
            "that_duck", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "that_duck")));
}
