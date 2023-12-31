package mod.leronus.mores.entity;

import mod.leronus.mores.Mores;
import mod.leronus.mores.entity.custom.DuckEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Mores.MODID);

    public static final RegistryObject<EntityType<DuckEntity>> DUCK =
            ENTITY_TYPES.register("duck",
                    () -> EntityType.Builder.of(DuckEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(0.4f, 0.7f)
                            .build(new ResourceLocation(Mores.MODID, "duck").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}