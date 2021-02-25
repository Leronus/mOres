package mod.mores.objects.items.armor;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CobaltArmorBase extends ItemArmor {

    public CobaltArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot)
    {
        super(material, renderIndex, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESARMORTAB);

        ItemInit.ITEMS.add(this);
    }

    //Add enchantment upon crafting the item
    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        stack.addEnchantment(Enchantments.FIRE_PROTECTION, 4);
        super.onCreated(stack, worldIn, playerIn);
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}


