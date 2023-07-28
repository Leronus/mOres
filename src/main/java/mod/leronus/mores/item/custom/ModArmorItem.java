package mod.leronus.mores.item.custom;

import mod.leronus.mores.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlotType, Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
    }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        super.onArmorTick(stack, world, player);
        Item HELMET = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
        Item CHESTPLATE = player.getItemBySlot(EquipmentSlot.CHEST).getItem();
        Item LEGGINGS = player.getItemBySlot(EquipmentSlot.LEGS).getItem();
        Item BOOTS = player.getItemBySlot(EquipmentSlot.FEET).getItem();
        //Turquoise: Water breathing & Dolphins Grace
        if (HELMET == (ModItems.TURQUOISE_HELMET.get())
                && CHESTPLATE == (ModItems.TURQUOISE_CHESTPLATE.get())
                && LEGGINGS == (ModItems.TURQUOISE_LEGGINGS.get())
                && BOOTS == (ModItems.TURQUOISE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 10, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 10, 0, false, false));

        //Sapphire: Night Vision
        } if (HELMET == (ModItems.SAPPHIRE_HELMET.get())
                && CHESTPLATE == (ModItems.SAPPHIRE_CHESTPLATE.get())
                && LEGGINGS == (ModItems.SAPPHIRE_LEGGINGS.get())
                && BOOTS == (ModItems.SAPPHIRE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, false, false));

        //Ruby: Fire Resistance
        } if (HELMET == (ModItems.RUBY_HELMET.get())
            && CHESTPLATE == (ModItems.RUBY_CHESTPLATE.get())
            && LEGGINGS == (ModItems.RUBY_LEGGINGS.get())
            && BOOTS == (ModItems.RUBY_BOOTS.get())) {
        player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10, 0, false, false));

        //Tanzanite: Speed Boost
        }else if (HELMET == (ModItems.TANZANITE_HELMET.get())
                && CHESTPLATE == (ModItems.TANZANITE_CHESTPLATE.get())
                && LEGGINGS == (ModItems.TANZANITE_LEGGINGS.get())
                && BOOTS == (ModItems.TANZANITE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 0, false, false));

        //Cobalt: Mining Boost
        }else if (HELMET == (ModItems.COBALT_HELMET.get())
                && CHESTPLATE == (ModItems.COBALT_CHESTPLATE.get())
                && LEGGINGS == (ModItems.COBALT_LEGGINGS.get())
                && BOOTS == (ModItems.COBALT_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 10, 0, false, false));

        //Tourmaline: Regeneration
        }else if (HELMET == (ModItems.TOURMALINE_HELMET.get())
                && CHESTPLATE == (ModItems.TOURMALINE_CHESTPLATE.get())
                && LEGGINGS == (ModItems.TOURMALINE_LEGGINGS.get())
                && BOOTS == (ModItems.TOURMALINE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 0, false, false));

        //Emerald: Luck
        }else if (HELMET == (ModItems.EMERALD_HELMET.get())
                && CHESTPLATE == (ModItems.EMERALD_CHESTPLATE.get())
                && LEGGINGS == (ModItems.EMERALD_LEGGINGS.get())
                && BOOTS == (ModItems.EMERALD_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 10, 0, false, false));

        //Steel: Strength
        }else if (HELMET == (ModItems.STEEL_HELMET.get())
                && CHESTPLATE == (ModItems.STEEL_CHESTPLATE.get())
                && LEGGINGS == (ModItems.STEEL_LEGGINGS.get())
                && BOOTS == (ModItems.STEEL_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 0, false, false));

        //Tin: Jump Boost
        }else if (HELMET == (ModItems.TIN_HELMET.get())
                && CHESTPLATE == (ModItems.TIN_CHESTPLATE.get())
                && LEGGINGS == (ModItems.TIN_LEGGINGS.get())
                && BOOTS == (ModItems.TIN_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 10, 1, false, false));

        //Amethyst: Slow Falling
        }else if (HELMET == (ModItems.AMETHYST_HELMET.get())
                && CHESTPLATE == (ModItems.AMETHYST_CHESTPLATE.get())
                && LEGGINGS == (ModItems.AMETHYST_LEGGINGS.get())
                && BOOTS == (ModItems.AMETHYST_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10, 0, false, false));
        //Topaz: Mining Boost 2
        }else if (HELMET == (ModItems.TOPAZ_HELMET.get())
                && CHESTPLATE == (ModItems.TOPAZ_CHESTPLATE.get())
                && LEGGINGS == (ModItems.TOPAZ_LEGGINGS.get())
                && BOOTS == (ModItems.TOPAZ_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 10, 1, false, false));
        }
        //Moissanite: Health Boost (Absorption)
        else if (HELMET == (ModItems.MOISSANITE_HELMET.get())
                && CHESTPLATE == (ModItems.MOISSANITE_CHESTPLATE.get())
                && LEGGINGS == (ModItems.MOISSANITE_LEGGINGS.get())
                && BOOTS == (ModItems.MOISSANITE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 10, 0, false, false));
        }
    }
}
