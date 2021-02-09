package mod.mores.tabs;

import mod.mores.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresOresTab extends CreativeTabs
{
    public MoresOresTab(String label){
        super("moresorestab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(BlockInit.TOPAZ_ORE);
    }
}

