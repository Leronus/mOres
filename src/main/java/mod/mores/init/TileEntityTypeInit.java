//package mod.mores.init;
//
//import mod.mores.Mores;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class TileEntityTypeInit {
//    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Mores.MODID);
//
//    public static final RegistryObject<TileEntityType<AlloyFurnaceTileEntity>> ALLOY_FURNACE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPES.register("alloy_furnace", () -> TileEntityType.Builder.of(AlloyFurnaceTileEntity::new, BlockInit.ALLOY_FURNACE.get()).build(null));
//}
