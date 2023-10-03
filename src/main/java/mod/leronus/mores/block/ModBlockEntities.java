package mod.leronus.mores.block;

import mod.leronus.mores.Mores;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Mores.MODID);

//    // tile entity type
//    // We don't have a datafixer for our TileEntities, so we pass null into build.
//    public static RegistryObject<BlockEntityType<AlloyFurnaceBlockEntity>> ALLOY_FURNACE =
//            TILE_ENTITY_TYPES.register("alloy_furnace",
//                    () -> BlockEntityType.Builder.of(AlloyFurnaceBlockEntity::new,
//                            ModBlocks.ALLOY_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITY_TYPES.register(eventBus);
    }
} // end class