//package mod.leronus.mores.sound;
//
//import mod.leronus.mores.Mores;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.sounds.SoundEvent;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class ModSounds {
//    public static final DeferredRegister<SoundEvent> SOUND_TYPES = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mores.MODID);
//
//    public static final RegistryObject<SoundEvent> LIVING_DUCK_SOUND = SOUND_TYPES.register(
//            "living_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "living_duck_sound")));
//    public static final RegistryObject<SoundEvent> DYING_DUCK_SOUND = SOUND_TYPES.register(
//            "dying_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "dying_duck_sound")));
//    public static final RegistryObject<SoundEvent> HURT_DUCK_SOUND = SOUND_TYPES.register(
//            "hurt_duck_sound", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "hurt_duck_sound")));
//
//    public static final RegistryObject<SoundEvent> BRUH = SOUND_TYPES.register(
//            "bruh", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "bruh")));
//    public static final RegistryObject<SoundEvent> YEAH = SOUND_TYPES.register(
//            "yeah", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "yeah")));
//    public static final RegistryObject<SoundEvent> AAUUGH = SOUND_TYPES.register(
//            "aauugh", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "aauugh")));
//    public static final RegistryObject<SoundEvent> OOF = SOUND_TYPES.register(
//            "oof", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "oof")));
//    public static final RegistryObject<SoundEvent> WORTEL9 = SOUND_TYPES.register(
//            "wortel9", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "wortel9")));
//    public static final RegistryObject<SoundEvent> WATWAAROM = SOUND_TYPES.register(
//            "watwaarom", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "watwaarom")));
//
//    public static final RegistryObject<SoundEvent> SWEET_CAROLINE_BOOTLEG = SOUND_TYPES.register(
//            "sweet_caroline_bootleg", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "sweet_caroline_bootleg")));
//    public static final RegistryObject<SoundEvent> CIPHER = SOUND_TYPES.register(
//            "cipher", () -> new SoundEvent(new ResourceLocation(Mores.MODID, "cipher")));
//
//    public static void register(IEventBus eventBus) {
//        SOUND_TYPES.register(eventBus);
//    }
//}