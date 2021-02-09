package mod.mores.tabs;

import mod.mores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresToolsTab extends CreativeTabs {

    public MoresToolsTab(String label){
        super("morestoolstab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.AMETHYST_PICKAXE);
    }
}
