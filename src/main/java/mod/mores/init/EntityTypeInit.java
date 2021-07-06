package mod.mores.init;

import entity.DuckEntity;
import mod.mores.Mores;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            Mores.MOD_ID);

    public static final RegistryObject<EntityType<DuckEntity>> DUCK = ENTITY_TYPES.register("duck",
            () -> EntityType.Builder.of(DuckEntity::new, EntityClassification.CREATURE).sized(0.4F, 0.7F)
                    .build(new ResourceLocation(Mores.MOD_ID, "duck").toString()));
}