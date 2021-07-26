package mod.mores.init;

import mod.mores.Mores;
import mod.mores.entity.DuckEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            Mores.MOD_ID);

    public static final RegistryObject<EntityType<DuckEntity>> DUCK = ENTITY_TYPES.register("duck",
            () -> EntityType.Builder.of(DuckEntity::new, MobCategory.WATER_CREATURE).sized(0.4F, 0.7F)
                    .build(new ResourceLocation(Mores.MOD_ID, "duck").toString()));
}
