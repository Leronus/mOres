package mod.mores.init;

import mod.mores.Mores;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundTypeInit {
    public static final DeferredRegister<SoundEvent> SOUND_TYPES = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MOD_ID);

    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = SOUND_TYPES.register(
            "living_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "living_duck_sound")));
    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = SOUND_TYPES.register(
            "dying_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "dying_duck_sound")));
    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = SOUND_TYPES.register(
            "hurt_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "hurt_duck_sound")));

    public static final RegistryObject<SoundEvent> DARUDE_SANDSTORM = SOUND_TYPES.register(
            "darude_sandstorm", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "darude_sandstorm")));
    public static final RegistryObject<SoundEvent> RICK_ASTLEY = SOUND_TYPES.register(
            "rick_astley", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "rick_astley")));
    public static final RegistryObject<SoundEvent> CRAZY_FROG = SOUND_TYPES.register(
            "crazy_frog", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "crazy_frog")));
    public static final RegistryObject<SoundEvent> IM_BLUE = SOUND_TYPES.register(
            "im_blue", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "im_blue")));
    public static final RegistryObject<SoundEvent> MY_HORSE = SOUND_TYPES.register(
            "my_horse", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "my_horse")));

    public static final RegistryObject<SoundEvent> THAT_DUCK = SOUND_TYPES.register(
            "that_duck", () -> new SoundEvent(new ResourceLocation(Mores.MOD_ID, "that_duck")));
}
