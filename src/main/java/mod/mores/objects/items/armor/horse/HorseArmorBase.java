package mod.mores.objects.items.armor.horse;

import mod.mores.util.Reference;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class HorseArmorBase {

    public HorseArmorBase(String name, int armorHardness){
        generateHorseArmorType(name, armorHardness);
    }

    public HorseArmorType generateHorseArmorType(String name, int armorHardness) {
            final String textureLocation = Reference.MODID + ":textures/entity/horse/armor/horse_armor_" + name + ".png";


            final int armorStrength = armorHardness;

            return EnumHelper.addHorseArmor(name, textureLocation, armorStrength);
    }
}
