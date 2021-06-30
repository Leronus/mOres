package mod.mores.objects;

import mod.mores.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemArmor extends ArmorItem {

    public ItemArmor(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Properties p_i48534_3_) {
        super(p_i48534_1_, p_i48534_2_, p_i48534_3_);
    }

    @Override
    public void onUseTick(World world, LivingEntity player, ItemStack armor, int unknown) {

        //Turquoise: Water breathing & Dolphins Grace
        if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.TURQUOISE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.TURQUOISE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.TURQUOISE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.TURQUOISE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.WATER_BREATHING, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 10, 0, false, false));

        //Sapphire: Night Vision
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.SAPPHIRE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.SAPPHIRE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.SAPPHIRE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.SAPPHIRE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 10, 0, false, false));

        //Ruby: Fire Resistance
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.RUBY_HELMET.get())
            && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.RUBY_CHESTPLATE.get())
            && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.RUBY_LEGGINGS.get())
            && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.RUBY_BOOTS.get())) {
        player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 10, 0, false, false));

        //Tanzanite: Speed Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.TANZANITE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.TANZANITE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.TANZANITE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.TANZANITE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 10, 0, false, false));

        //Topaz: Mining Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.TOPAZ_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.TOPAZ_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.TOPAZ_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.TOPAZ_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.DIG_SPEED, 10, 0, false, false));

        //Tourmaline: Regeneration
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.TOURMALINE_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.TOURMALINE_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.TOURMALINE_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.TOURMALINE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 0, false, false));

        //Emerald: Luck
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.EMERALD_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.EMERALD_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.EMERALD_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.EMERALD_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.LUCK, 10, 0, false, false));

        //Obsidian: Slowness + Strength
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.OBSIDIAN_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.OBSIDIAN_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.OBSIDIAN_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.OBSIDIAN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 0, false, false));

        //Tin: Jump Boost
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.TIN_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.TIN_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.TIN_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.TIN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.JUMP, 10, 0, false, false));

        //Amethyst: Slow Falling
        }else if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem().equals(ItemInit.AMETHYST_HELMET.get())
                && player.getItemBySlot(EquipmentSlotType.CHEST).getItem().equals(ItemInit.AMETHYST_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlotType.LEGS).getItem().equals(ItemInit.AMETHYST_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlotType.FEET).getItem().getItem().equals(ItemInit.AMETHYST_BOOTS.get())) {
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
