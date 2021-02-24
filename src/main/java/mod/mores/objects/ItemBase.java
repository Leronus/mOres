package mod.mores.objects;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.tabs.MoresItemsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESITEMSTAB);

        ItemInit.ITEMS.add(this);
    }

    public int getItemBurnTime(ItemStack stack){
        if(stack.getItem() == ItemInit.ROOIEKOOL){
            return 5000;
        }
        return 0;
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
