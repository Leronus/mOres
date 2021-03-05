package mod.mores.tabs;

import mod.mores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoresHorseArmorTab extends CreativeTabs {

    public MoresHorseArmorTab(String label){
        super("moreshorsearmortab");
        this.setBackgroundImageName("morestab.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.EMERALD_HORSE_ARMOR);
    }
}
