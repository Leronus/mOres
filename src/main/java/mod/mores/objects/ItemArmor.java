package mod.mores.objects;

import mod.mores.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemArmor extends ArmorItem {
    public ItemArmor(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType, Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        //Turquoise: Water breathing & Dolphins Grace
        if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.TURQUOISE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.TURQUOISE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.TURQUOISE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.TURQUOISE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.WATER_BREATHING, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 10, 0, false, false));

        //Sapphire: Night Vision
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.SAPPHIRE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.SAPPHIRE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.SAPPHIRE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.SAPPHIRE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 10, 0, false, false));

        //Ruby: Fire Resistance
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.RUBY_HELMET.get())
            && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.RUBY_CHESTPLATE.get())
            && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.RUBY_LEGGINGS.get())
            && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.RUBY_BOOTS.get())) {
        player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 10, 0, false, false));

        //Tanzanite: Speed Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.TANZANITE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.TANZANITE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.TANZANITE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.TANZANITE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 10, 0, false, false));

        //Cobalt: Mining Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.COBALT_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.COBALT_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.COBALT_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.COBALT_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.DIG_SPEED, 10, 0, false, false));

        //Tourmaline: Regeneration
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.TOURMALINE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.TOURMALINE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.TOURMALINE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.TOURMALINE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 0, false, false));

        //Emerald: Luck
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.EMERALD_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.EMERALD_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.EMERALD_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.EMERALD_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.LUCK, 10, 0, false, false));

        //Obsidian: Slowness + Strength
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.OBSIDIAN_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.OBSIDIAN_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.OBSIDIAN_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.OBSIDIAN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 0, false, false));

        //Tin: Jump Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.TIN_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.TIN_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.TIN_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.TIN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.JUMP, 10, 1, false, false));

        //Amethyst: Slow Falling
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == (ItemInit.AMETHYST_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == (ItemInit.AMETHYST_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == (ItemInit.AMETHYST_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem() == (ItemInit.AMETHYST_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.SLOW_FALLING, 10, 0, false, false));
        }
    }


    @Override
    public EquipmentSlotType getSlot() {
        return super.getSlot();
    }

    @Override
    public IArmorMaterial getMaterial() {
        return super.getMaterial();
    }
}
