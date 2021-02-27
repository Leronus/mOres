package mod.mores.objects.items.armor.horse;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.util.Reference;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class HorseArmorBase extends Item {

    public String name;

    public HorseArmorBase(String name, int armorHardness){
        setRegistryName(name + "_horse_armor");
        setUnlocalizedName(name + "_horse_armor");
        setCreativeTab(Mores.MORESITEMSTAB);

        ItemInit.ITEMS.add(this);
        generateHorseArmorType(name, armorHardness);
    }

    public HorseArmorType generateHorseArmorType(String name, int armorHardness) {
            this.name = name;

            final String textureLocation = Reference.MODID + ":textures/entity/horse/armor/horse_armor_" + name + ".png";
            final int armorStrength = armorHardness;

            return EnumHelper.addHorseArmor(name, textureLocation, armorStrength);
    }

    @Override
    public HorseArmorType getHorseArmorType(ItemStack stack){

        return HorseArmorType.getByName(name);
    }
}
