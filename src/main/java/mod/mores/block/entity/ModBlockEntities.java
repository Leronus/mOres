package mod.mores.block.entity;

import mod.mores.Mores;
import mod.mores.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Mores.MODID);

//    public static final RegistryObject<BlockEntityType<AlloyFurnaceBlockEntity>> ALLOY_FURNACE =
//            BLOCK_ENTITIES.register("alloy_furnace", () ->
//                    BlockEntityType.Builder.of(AlloyFurnaceBlockEntity::new,
//                            ModBlocks.ALLOY_FURNACE.get()).build(null));

//    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
//            BLOCK_ENTITIES.register("sign_block_entity", () ->
//                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
//                            ModBlocks.CHERRY_BLOSSOM_WALL_SIGN.get(),
//                            ModBlocks.CHERRY_BLOSSOM_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
