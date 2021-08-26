package mod.mores.init;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import mod.mores.Mores;
import mod.mores.entity.DuckEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            Mores.MOD_ID);

    public static final RegistryObject<EntityType<DuckEntity>> DUCK_ENTITY = createEntity("duck", DuckEntity::new, 0.4F, 0.7F, 0x006808, 0xFFD400);

    private static <T extends Animal> RegistryObject<EntityType<T>> createEntity(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        ResourceLocation location = new ResourceLocation(Mores.MOD_ID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, MobCategory.WATER_CREATURE).sized(width, height).setTrackingRange(64).setUpdateInterval(1).build(location.toString());

        return ENTITY_TYPES.register(name, () -> entity);
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnPlacements.register(DUCK_ENTITY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, DuckEntity::canDuckSpawn);
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(DUCK_ENTITY.get(), DuckEntity.createAttributes().build());
    }
}
