package mod.leronus.mores.block;

import mod.leronus.mores.Mores;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModContainers
{
    public static final DeferredRegister<MenuType<?>> CONTAINER_TYPES =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Mores.MODID);

//    public static RegistryObject<MenuType<AlloyFurnaceContainer>> ALLOY_FURNACE =
//            CONTAINER_TYPES.register("alloy_furnace",
//                    () -> IForgeMenuType.create((windowId, inv, data)
//                            -> new AlloyFurnaceContainer(windowId, inv, data.readBlockPos(), inv.player)));

    public static void register(IEventBus eventBus) {
        CONTAINER_TYPES.register(eventBus);
    }
} // end class