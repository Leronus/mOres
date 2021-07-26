//package mod.mores.init;
//
//import mod.mores.Mores;
//import mod.mores.container.AlloyFurnaceMenu;
//import net.minecraft.world.inventory.MenuType;
//import net.minecraftforge.common.extensions.IForgeContainerType;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public final class MenuInit {
//    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
//            DeferredRegister.create(ForgeRegistries.MENUS, Mores.MOD_ID);
//
//    public static RegistryObject<MenuType<AlloyFurnaceMenu>> ALLOY_FURNACE =
//            MENU_TYPES.register("alloy_furnace",
//                    () -> IForgeContainerType.create(AlloyFurnaceMenu::new));
//}
