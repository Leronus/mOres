package mod.leronus.mores.block.custom;
import mod.leronus.mores.api.content.AbstractAlloyFurnaceContainer;
import mod.leronus.mores.block.ModContainers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;


public class AlloyFurnaceContainer extends AbstractAlloyFurnaceContainer
{
    public AlloyFurnaceContainer(final int windowId, final Inventory playerInventory, final BlockPos pos, Player playerEntity)
    {
        super(ModContainers.ALLOY_FURNACE.get(), windowId, pos, playerInventory, playerEntity);

    }  // end-ctor server-side


} // end class