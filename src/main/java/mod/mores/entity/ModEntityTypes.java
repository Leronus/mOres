package mod.mores.entity;

import mod.mores.Mores;
import mod.mores.entity.custom.Duck;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Mores.MODID);

    public static final RegistryObject<EntityType<Duck>> DUCK = ENTITY_TYPES.register("duck",
            () -> EntityType.Builder.of(Duck::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.7F)
                    .build(new ResourceLocation(Mores.MODID, "duck").toString()));

//    public static final RegistryObject<EntityType<ModBoatEntity>> BOAT_ENTITY =
//            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new,
//                    MobCategory.MISC).fireImmune().sized(1.375F, 0.5625F)
//                    .setCustomClientFactory((spawnEntity, world) -> new ModBoatEntity(world, 0, 0, 0))
//                    .build("mod_boat"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}