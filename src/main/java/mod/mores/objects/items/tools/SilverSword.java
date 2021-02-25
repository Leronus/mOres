package mod.mores.objects.items.tools;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Objects;

public class SilverSword extends ItemSword
{
    public SilverSword(String name, ToolMaterial material)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESTOOLSTAB);

        ItemInit.ITEMS.add(this);
    }

    //Add enchantment upon crafting the item
    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        stack.addEnchantment(Enchantments.SMITE, 5);
        super.onCreated(stack, worldIn, playerIn);
    }


    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
