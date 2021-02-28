package mod.mores.objects.items.armor.horse;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.util.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.List;

public class HorseArmorBase extends Item {

    private String name;
    private int armorProtection;

    public HorseArmorBase(String name, int armorHardness){
        setRegistryName(name + "_horse_armor");
        setUnlocalizedName(name + "_horse_armor");
        setCreativeTab(Mores.MORESITEMSTAB);
        setMaxStackSize(1);

        this.name = name;
        this.armorProtection = armorHardness;

        ItemInit.ITEMS.add(this);
        generateHorseArmorType(name, armorHardness);
    }

    public HorseArmorType generateHorseArmorType(String name, int armorHardness) {
            final String textureLocation = Reference.MODID + ":textures/entity/horse/armor/horse_armor_" + name + ".png";
            final int armorStrength = armorHardness;

            return EnumHelper.addHorseArmor(name, textureLocation, armorStrength);
    }

    @Override
    public HorseArmorType getHorseArmorType(ItemStack stack){

        return HorseArmorType.getByName(name);
    }

    @Override
    public Item setMaxStackSize(int maxStackSize) {
        return super.setMaxStackSize(maxStackSize);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add("Max Stack Size: " + TextFormatting.LIGHT_PURPLE + maxStackSize);
        tooltip.add("Protection: " + TextFormatting.GOLD + armorProtection);
    }
}
