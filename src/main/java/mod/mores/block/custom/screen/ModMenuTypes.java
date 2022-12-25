package mod.mores.block.custom.screen;

import mod.mores.Mores;
import mod.mores.block.custom.AlloyFurnaceMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModMenuTypes
{
    public static final DeferredRegister<MenuType<?>> CONTAINER_TYPES =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Mores.MODID);

    public static RegistryObject<MenuType<AlloyFurnaceMenu>> ALLOY_FURNACE =
            CONTAINER_TYPES.register("alloy_furnace",
                    () -> IForgeMenuType.create((windowId, inv, data)
                            -> new AlloyFurnaceMenu(windowId, inv, data.readBlockPos(), inv.player)));
} // end class