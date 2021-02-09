package mod.mores.tabs;

import mod.mores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresArmorTab extends CreativeTabs {

    public MoresArmorTab(String label){
        super("moresarmortab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.RUBY_CHEST);
    }
}
