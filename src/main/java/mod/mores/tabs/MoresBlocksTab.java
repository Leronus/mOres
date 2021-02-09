package mod.mores.tabs;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresBlocksTab extends CreativeTabs {

    public MoresBlocksTab(String label){
        super("moresblockstab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(BlockInit.TURQUOISE_BLOCK);
    }
}
