package mod.mores.item;

import mod.mores.core.init.ItemInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemArmor extends ArmorItem {
    private ArmorMaterial armorMaterial;
    private EquipmentSlot equipmentSlotType;
    public ItemArmor(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlotType, Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
        this.armorMaterial = armorMaterial;
        this.equipmentSlotType = equipmentSlotType;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        Item HELMET = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
        Item CHESTPLATE = player.getItemBySlot(EquipmentSlot.CHEST).getItem();
        Item LEGGINGS = player.getItemBySlot(EquipmentSlot.LEGS).getItem();
        Item BOOTS = player.getItemBySlot(EquipmentSlot.FEET).getItem();
        //Turquoise: Water breathing & Dolphins Grace
        if (HELMET == (ItemInit.TURQUOISE_HELMET.get())
                && CHESTPLATE == (ItemInit.TURQUOISE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TURQUOISE_LEGGINGS.get())
                && BOOTS == (ItemInit.TURQUOISE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 10, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 10, 0, false, false));

        //Sapphire: Night Vision
        } if (HELMET == (ItemInit.SAPPHIRE_HELMET.get())
                && CHESTPLATE == (ItemInit.SAPPHIRE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.SAPPHIRE_LEGGINGS.get())
                && BOOTS == (ItemInit.SAPPHIRE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, false, false));
        } else {
            player.removeEffect(MobEffects.NIGHT_VISION);

        //Ruby: Fire Resistance
        } if (HELMET == (ItemInit.RUBY_HELMET.get())
            && CHESTPLATE == (ItemInit.RUBY_CHESTPLATE.get())
            && LEGGINGS == (ItemInit.RUBY_LEGGINGS.get())
            && BOOTS == (ItemInit.RUBY_BOOTS.get())) {
        player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10, 0, false, false));

        //Tanzanite: Speed Boost
        }else if (HELMET == (ItemInit.TANZANITE_HELMET.get())
                && CHESTPLATE == (ItemInit.TANZANITE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TANZANITE_LEGGINGS.get())
                && BOOTS == (ItemInit.TANZANITE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 0, false, false));

        //Cobalt: Mining Boost
        }else if (HELMET == (ItemInit.COBALT_HELMET.get())
                && CHESTPLATE == (ItemInit.COBALT_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.COBALT_LEGGINGS.get())
                && BOOTS == (ItemInit.COBALT_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 10, 0, false, false));

        //Tourmaline: Regeneration
        }else if (HELMET == (ItemInit.TOURMALINE_HELMET.get())
                && CHESTPLATE == (ItemInit.TOURMALINE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TOURMALINE_LEGGINGS.get())
                && BOOTS == (ItemInit.TOURMALINE_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 0, false, false));

        //Emerald: Luck
        }else if (HELMET == (ItemInit.EMERALD_HELMET.get())
                && CHESTPLATE == (ItemInit.EMERALD_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.EMERALD_LEGGINGS.get())
                && BOOTS == (ItemInit.EMERALD_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 10, 0, false, false));

        //Obsidian: Slowness + Strength
        }else if (HELMET == (ItemInit.OBSIDIAN_HELMET.get())
                && CHESTPLATE == (ItemInit.OBSIDIAN_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.OBSIDIAN_LEGGINGS.get())
                && BOOTS == (ItemInit.OBSIDIAN_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 0, false, false));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 0, false, false));

        //Tin: Jump Boost
        }else if (HELMET == (ItemInit.TIN_HELMET.get())
                && CHESTPLATE == (ItemInit.TIN_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TIN_LEGGINGS.get())
                && BOOTS == (ItemInit.TIN_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 10, 1, false, false));

        //Amethyst: Slow Falling
        }else if (HELMET == (ItemInit.AMETHYST_HELMET.get())
                && CHESTPLATE == (ItemInit.AMETHYST_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.AMETHYST_LEGGINGS.get())
                && BOOTS == (ItemInit.AMETHYST_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10, 0, false, false));
        //Topaz: Mining Boost 2
        }else if (HELMET == (ItemInit.TOPAZ_HELMET.get())
                && CHESTPLATE == (ItemInit.TOPAZ_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TOPAZ_LEGGINGS.get())
                && BOOTS == (ItemInit.TOPAZ_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 10, 1, false, false));
        }
    }
//    @Override
//    public void appendHoverText(ItemStack stack, Level worldIn, List<TextComponent> tooltip, TooltipFlag flagIn){
//        if (armorMaterial == ArmorMaterial.ARMOR_TIN){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.DARK_GRAY + "Jump Boost"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TIN.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_COBALT){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.GOLD + "Haste"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_COBALT.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_AMETHYST){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.GRAY + "Slow Falling"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_AMETHYST.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_OBSIDIAN){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.DARK_PURPLE + "Strength & Slowness"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_OBSIDIAN.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_EMERALD){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.GREEN + "Luck"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_EMERALD.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_TOURMALINE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.RED + "Regeneration"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TOURMALINE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_TANZANITE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.YELLOW + "Speed"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TANZANITE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_RUBY){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.DARK_RED + "Fire Resistance"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_RUBY.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_SAPPHIRE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.BLUE + "Night Vision"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_SAPPHIRE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_TURQUOISE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.AQUA + "Water Breathing & Dolphins"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TURQUOISE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_COPPER){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_COPPER.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_BRONZE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_BRONZE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_SILVER){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_SILVER.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_STERLING){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_STERLING.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_STEEL){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_STEEL.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_TOPAZ){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Full Set Bonus: " + ChatFormatting.GOLD + "Haste"));
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TOPAZ.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_MOISSANITE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_MOISSANITE.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_ONYX){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_ONYX.getDurabilityForSlot(equipmentSlotType)));
//        }
//        else if (armorMaterial == ArmorMaterial.ARMOR_GRAPHENE){
//            //Making the tooltips
//            tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_GRAPHENE.getDurabilityForSlot(equipmentSlotType)));
//        }
//    }


    @Override
    public EquipmentSlot getSlot() {
        return super.getSlot();
    }

    @Override
    public ArmorMaterial getMaterial() {
        return super.getMaterial();
    }
}
