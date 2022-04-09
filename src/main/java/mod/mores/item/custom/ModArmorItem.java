package mod.mores.item.custom;

import mod.mores.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class ModArmorItem extends ArmorItem {
    private ArmorMaterial armorMaterial;
    private EquipmentSlot equipmentSlotType;
    public ModArmorItem(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlotType, Properties properties) {
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
        } else {
            player.removeEffect(MobEffects.NIGHT_VISION);

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

        //Obsidian: Slowness + Strength
        }else if (HELMET == (ModItems.OBSIDIAN_HELMET.get())
                && CHESTPLATE == (ModItems.OBSIDIAN_CHESTPLATE.get())
                && LEGGINGS == (ModItems.OBSIDIAN_LEGGINGS.get())
                && BOOTS == (ModItems.OBSIDIAN_BOOTS.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 0, false, false));
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
