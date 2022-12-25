package mod.mores.block.custom;

import mod.mores.api.content.AbstractAlloyFurnaceMenu;
import mod.mores.block.custom.screen.ModMenuTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;


public class AlloyFurnaceMenu extends AbstractAlloyFurnaceMenu
{
    public AlloyFurnaceMenu(final int windowId, final Inventory playerInventory, final BlockPos pos, Player playerEntity)
    {
        super(ModMenuTypes.ALLOY_FURNACE.get(), windowId, pos, playerInventory, playerEntity);

    }  // end-ctor server-side


} // end class