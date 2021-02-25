package mod.mores.objects.items.armor;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NightVisionArmorBase extends ItemArmor {

    public NightVisionArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot)
    {
        super(material, renderIndex, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESARMORTAB);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof NightVisionArmorBase
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof NightVisionArmorBase
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof NightVisionArmorBase
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof NightVisionArmorBase) {
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 10, 0, false, false));
        }
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
