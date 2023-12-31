package mod.leronus.mores.painting;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.Config;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> MORES_PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Mores.MODID);
    public static final DeferredRegister<PaintingVariant> LERONUS_PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Mores.MODID);

    //Mores paintings
    public static final RegistryObject<PaintingVariant> ALIENBONG = MORES_PAINTING_VARIANTS.register("alienbong",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> CNTOWER = MORES_PAINTING_VARIANTS.register("cntower",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> TORONTO = MORES_PAINTING_VARIANTS.register("toronto",
            () -> new PaintingVariant(64, 64));

    //Leronus paintings
    public static final RegistryObject<PaintingVariant> MARTIJN = LERONUS_PAINTING_VARIANTS.register("martijn",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> BRAMHAPPY = LERONUS_PAINTING_VARIANTS.register("bramhappy",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> DAANHOT = LERONUS_PAINTING_VARIANTS.register("daanhot",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HANDCRAFTEDPP = LERONUS_PAINTING_VARIANTS.register("handcraftedpp",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HAPPYKEVIN = LERONUS_PAINTING_VARIANTS.register("happykevin",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HAPPYSILBIG = LERONUS_PAINTING_VARIANTS.register("happysilbig",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HAPPYSILSMALL = LERONUS_PAINTING_VARIANTS.register("happysilsmall",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HIPSTERS = LERONUS_PAINTING_VARIANTS.register("hipsters",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> HUIBCEPTION = LERONUS_PAINTING_VARIANTS.register("huibception",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> JASPERDRIPPIN = LERONUS_PAINTING_VARIANTS.register("jasperdrippin",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> JASPERLOSINIT = LERONUS_PAINTING_VARIANTS.register("jasperlosinit",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> JASPERNOTFEELINGGOOD = LERONUS_PAINTING_VARIANTS.register("jaspernotfeelinggood",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> KAILEROY = LERONUS_PAINTING_VARIANTS.register("kaileroy",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LEROYBIER = LERONUS_PAINTING_VARIANTS.register("leroybier",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LEROYBROKKO = LERONUS_PAINTING_VARIANTS.register("leroybrokko",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LEROYLUUKGANG = LERONUS_PAINTING_VARIANTS.register("leroyluukgang",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LEROYLUUKWEG = LERONUS_PAINTING_VARIANTS.register("leroyluukweg",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LEROYSMILE = LERONUS_PAINTING_VARIANTS.register("leroysmile",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LUUKPOOTNEER = LERONUS_PAINTING_VARIANTS.register("luukpootneer",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LUUKZWOEL = LERONUS_PAINTING_VARIANTS.register("luukzwoel",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> MARTIJNSMILE = LERONUS_PAINTING_VARIANTS.register("martijnsmile",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> MEDEA = LERONUS_PAINTING_VARIANTS.register("medea",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> ZWAREKEVIN = LERONUS_PAINTING_VARIANTS.register("zwarekevin",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> TIMGROTESTOK = LERONUS_PAINTING_VARIANTS.register("timgrotestok",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> SILBIGUP = LERONUS_PAINTING_VARIANTS.register("silbigup",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> SJORS = LERONUS_PAINTING_VARIANTS.register("sjors",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> LISACUTE = LERONUS_PAINTING_VARIANTS.register("lisacute",
            () -> new PaintingVariant(64, 64));


    public static void register(IEventBus eventBus) {
        MORES_PAINTING_VARIANTS.register(eventBus);
//      LERONUS_PAINTING_VARIANTS.register(eventBus);
    }
}
