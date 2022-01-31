//package mod.mores.init;
//
//import mod.mores.Mores;
//import mod.mores.entity.DuckEntity;
//import net.minecraft.entity.EntityClassification;
//import net.minecraft.entity.EntityType;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class EntityTypeInit {
//    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
//            Mores.MODID);
//
//    public static final RegistryObject<EntityType<DuckEntity>> DUCK = ENTITY_TYPES.register("duck",
//            () -> EntityType.Builder.of(DuckEntity::new, EntityClassification.CREATURE).sized(0.4F, 0.7F)
//                    .build(new ResourceLocation(Mores.MODID, "duck").toString()));
//}
