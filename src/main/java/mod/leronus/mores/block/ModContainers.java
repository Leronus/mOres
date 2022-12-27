package mod.leronus.mores.block;

import mod.leronus.mores.Mores;
import mod.leronus.mores.block.custom.AlloyFurnaceContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModContainers
{
    public static final DeferredRegister<MenuType<?>> CONTAINER_TYPES =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Mores.MODID);

    public static RegistryObject<MenuType<AlloyFurnaceContainer>> ALLOY_FURNACE =
            CONTAINER_TYPES.register("alloy_furnace",
                    () -> IForgeMenuType.create((windowId, inv, data)
                            -> new AlloyFurnaceContainer(windowId, inv, data.readBlockPos(), inv.player)));
} // end class