package mod.mores.block.custom.screen;

import mod.mores.api.content.AbstractAlloyFurnaceScreen;
import mod.mores.block.custom.AlloyFurnaceMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class AlloyFurnaceScreen extends AbstractAlloyFurnaceScreen<AlloyFurnaceMenu>
{
    private final static int name_color =  0x404040;

    public AlloyFurnaceScreen(final AlloyFurnaceMenu screenMenu, Inventory inv,
                               Component titleIn)
    {
        super(screenMenu, inv,
                titleIn, name_color);
    }

} // end class