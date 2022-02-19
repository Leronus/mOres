//package mod.mores.init;
//
//import mod.mores.Mores;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public final class ContainerInit {
//    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES =
//            DeferredRegister.create(ForgeRegistries.CONTAINERS, Mores.MODID);
//
//    public static RegistryObject<ContainerType<AlloyFurnaceContainer>> ALLOY_FURNACE =
//            CONTAINER_TYPES.register("alloy_furnace",
//                    () -> IForgeContainerType.create(AlloyFurnaceContainer::new));
//}
