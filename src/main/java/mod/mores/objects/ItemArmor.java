package mod.mores.objects;

import mod.mores.Mores;
import mod.mores.init.ItemInit;
import mod.mores.materials.ArmorMaterial;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemArmor extends ArmorItem {
    private IArmorMaterial armorMaterial;
    public ItemArmor(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType, Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
        this.armorMaterial = armorMaterial;
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        Item HELMET = player.getItemBySlot(EquipmentSlotType.HEAD).getItem();
        Item CHESTPLATE = player.getItemBySlot(EquipmentSlotType.CHEST).getItem();
        Item LEGGINGS = player.getItemBySlot(EquipmentSlotType.LEGS).getItem();
        Item BOOTS = player.getItemBySlot(EquipmentSlotType.FEET).getItem();
        //Turquoise: Water breathing & Dolphins Grace
        if (HELMET == (ItemInit.TURQUOISE_HELMET.get())
                && CHESTPLATE == (ItemInit.TURQUOISE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TURQUOISE_LEGGINGS.get())
                && BOOTS == (ItemInit.TURQUOISE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.WATER_BREATHING, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 10, 0, false, false));

        //Sapphire: Night Vision
        }else if (HELMET == (ItemInit.SAPPHIRE_HELMET.get())
                && CHESTPLATE == (ItemInit.SAPPHIRE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.SAPPHIRE_LEGGINGS.get())
                && BOOTS == (ItemInit.SAPPHIRE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 10, 0, false, false));

        //Ruby: Fire Resistance
        }else if (HELMET == (ItemInit.RUBY_HELMET.get())
            && CHESTPLATE == (ItemInit.RUBY_CHESTPLATE.get())
            && LEGGINGS == (ItemInit.RUBY_LEGGINGS.get())
            && BOOTS == (ItemInit.RUBY_BOOTS.get())) {
        player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 10, 0, false, false));

        //Tanzanite: Speed Boost
        }else if (HELMET == (ItemInit.TANZANITE_HELMET.get())
                && CHESTPLATE == (ItemInit.TANZANITE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TANZANITE_LEGGINGS.get())
                && BOOTS == (ItemInit.TANZANITE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 10, 0, false, false));

        //Cobalt: Mining Boost
        }else if (HELMET == (ItemInit.COBALT_HELMET.get())
                && CHESTPLATE == (ItemInit.COBALT_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.COBALT_LEGGINGS.get())
                && BOOTS == (ItemInit.COBALT_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.DIG_SPEED, 10, 0, false, false));

        //Tourmaline: Regeneration
        }else if (HELMET == (ItemInit.TOURMALINE_HELMET.get())
                && CHESTPLATE == (ItemInit.TOURMALINE_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TOURMALINE_LEGGINGS.get())
                && BOOTS == (ItemInit.TOURMALINE_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 0, false, false));

        //Emerald: Luck
        }else if (HELMET == (ItemInit.EMERALD_HELMET.get())
                && CHESTPLATE == (ItemInit.EMERALD_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.EMERALD_LEGGINGS.get())
                && BOOTS == (ItemInit.EMERALD_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.LUCK, 10, 0, false, false));

        //Obsidian: Slowness + Strength
        }else if (HELMET == (ItemInit.OBSIDIAN_HELMET.get())
                && CHESTPLATE == (ItemInit.OBSIDIAN_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.OBSIDIAN_LEGGINGS.get())
                && BOOTS == (ItemInit.OBSIDIAN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 10, 0, false, false));
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 0, false, false));

        //Tin: Jump Boost
        }else if (HELMET == (ItemInit.TIN_HELMET.get())
                && CHESTPLATE == (ItemInit.TIN_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.TIN_LEGGINGS.get())
                && BOOTS == (ItemInit.TIN_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.JUMP, 10, 1, false, false));

        //Amethyst: Slow Falling
        }else if (HELMET == (ItemInit.AMETHYST_HELMET.get())
                && CHESTPLATE == (ItemInit.AMETHYST_CHESTPLATE.get())
                && LEGGINGS == (ItemInit.AMETHYST_LEGGINGS.get())
                && BOOTS == (ItemInit.AMETHYST_BOOTS.get())) {
            player.addEffect(new EffectInstance(Effects.SLOW_FALLING, 10, 0, false, false));
        }
    }
    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        EquipmentSlotType type = stack.getItem().getEquipmentSlot(stack);
        Mores.LOGGER.info("stack.getItem() = " + stack.getItem());
        if (armorMaterial == ArmorMaterial.ARMOR_TIN){
            //Making the tooltips
            tooltip.add(ITextComponent.nullToEmpty("Bonus: " + TextFormatting.GRAY + "Jump Boost"));
            if (type != null) {
                tooltip.add(ITextComponent.nullToEmpty("Max Uses: " + TextFormatting.LIGHT_PURPLE + ArmorMaterial.ARMOR_TIN.getDurabilityForSlot(type)));
            }
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
