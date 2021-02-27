package mod.mores.objects.items.tools;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class OnyxSword extends ItemSword
{
    public OnyxSword(String name, ToolMaterial material)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESTOOLSTAB);

        ItemInit.ITEMS.add(this);
    }

    //Add potion effect to target entity upon attacking
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 100, 0, false, false));
        return true;
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
