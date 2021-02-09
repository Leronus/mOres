package mod.mores.tabs;

import mod.mores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresItemsTab extends CreativeTabs {

    public MoresItemsTab(String label){
        super("moresitemstab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.TURQUOISE_GEM);
    }
}
