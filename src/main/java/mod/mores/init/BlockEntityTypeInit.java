//package mod.mores.init;
//
//import mod.mores.Mores;
//import mod.mores.tileentity.AlloyFurnaceBlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraftforge.fmllegacy.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class BlockEntityTypeInit {
//    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Mores.MOD_ID);
//
//    public static final RegistryObject<BlockEntityType<AlloyFurnaceBlockEntity>> ALLOY_FURNACE_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPES.register("alloy_furnace", () -> BlockEntityType.Builder.of(AlloyFurnaceBlockEntity::new, BlockInit.ALLOY_FURNACE.get()).build(null));
//}
