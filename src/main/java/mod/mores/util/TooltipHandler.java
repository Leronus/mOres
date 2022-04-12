package mod.mores.util;

import mod.mores.Mores;
import mod.mores.config.Config;
import mod.mores.item.ModArmorMaterials;
import mod.mores.item.ModItems;
import mod.mores.item.custom.ModArmorItem;
import mod.mores.item.custom.ModSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.List;

@EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID)
public class TooltipHandler {

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent e) {
//        if (e.getItemStack().getItem() instanceof ShieldItem) {
//            Item shield = e.getItemStack().getItem();
//            List<Component> tooltip = e.getToolTip();
//            tooltip.add(new TextComponent(""));
//            if (shield == Items.SHIELD) {
//                tooltip.add(ItemShield.getDamageReductionTextComponent(Config.defaultDamageReduction.get()));
//            } else if (shield instanceof ItemShield) {
//                tooltip.add(ItemShield
//                        .getDamageReductionTextComponent(((ItemShield) shield).getDamageReduction()));
//            } else {
//                tooltip.add(ItemShield.getDamageReductionTextComponent(
//                        Config.customShieldMaxReduction.get() ? 100 : Config.defaultDamageReduction.get()));
//            }
//        }
        if(e.getItemStack().getItem() instanceof SwordItem) {
            List<Component> tooltip = e.getToolTip();
            if (e.getItemStack().getItem() instanceof SwordItem sword) {
                if (sword == Items.NETHERITE_SWORD){
                    Tier netherite = Tiers.NETHERITE;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + netherite.getUses()));
                } else if (sword == Items.DIAMOND_SWORD){
                    Tier diamond = Tiers.DIAMOND;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + diamond.getUses()));
                } else if (sword == Items.GOLDEN_SWORD){
                    Tiers gold = Tiers.GOLD;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + gold.getUses()));
                } else if (sword == Items.IRON_SWORD){
                    Tiers iron = Tiers.IRON;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + iron.getUses()));
                } else if (sword == Items.STONE_SWORD){
                    Tiers stone = Tiers.STONE;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + stone.getUses()));
                } else if (sword == Items.WOODEN_SWORD){
                    Tiers wood = Tiers.WOOD;
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + wood.getUses()));
                }
                if (e.getItemStack().getItem() instanceof ModSwordItem modded_sword){
                    tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + modded_sword.getMaxUses()));
                    if (e.getItemStack().getItem() == ModItems.ONYX_SWORD.get() || e.getItemStack().getItem() == ModItems.ONYX_MACE.get() || e.getItemStack().getItem() == ModItems.ONYX_DAGGER.get() || e.getItemStack().getItem() == ModItems.ONYX_BATTLEAXE.get()) {
                        tooltip.add(new TextComponent("Bonus: " + ChatFormatting.DARK_GRAY + "Wither Effect"));
                    }
                    if (e.getItemStack().getItem() == ModItems.RUBY_SWORD.get() || e.getItemStack().getItem() == ModItems.RUBY_MACE.get() || e.getItemStack().getItem() == ModItems.RUBY_BATTLEAXE.get() || e.getItemStack().getItem() == ModItems.RUBY_DAGGER.get()) {
                        tooltip.add(new TextComponent("Bonus: " + ChatFormatting.RED + "Burn Effect"));
                    }
                }
            }
        }
        if (e.getItemStack().getItem() instanceof ModArmorItem modArmorItem) {
            List<Component> tooltip = e.getToolTip();
            if (modArmorItem.getMaterial() == ModArmorMaterials.TIN) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.DARK_GRAY + "Jump Boost"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.TIN.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.COBALT) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.GOLD + "Haste"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.COBALT.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.AMETHYST) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.GRAY + "Slow Falling"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.AMETHYST.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.OBSIDIAN) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.DARK_PURPLE + "Strength & Slowness"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.OBSIDIAN.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.EMERALD) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.GREEN + "Luck"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.EMERALD.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TOURMALINE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.RED + "Regeneration"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.TOURMALINE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TANZANITE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.YELLOW + "Speed"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.TANZANITE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.RUBY) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.DARK_RED + "Fire Resistance"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.RUBY.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.SAPPHIRE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.BLUE + "Night Vision"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.SAPPHIRE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TURQUOISE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.AQUA + "Water Breathing & Dolphins"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.TURQUOISE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.COPPER) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.COPPER.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.BRONZE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.BRONZE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.SILVER) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.SILVER.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.STERLING) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.STERLING.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.STEEL) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.STEEL.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TOPAZ) {
                //Making the tooltips
                tooltip.add(new TextComponent("Full Set Bonus: " + ChatFormatting.GOLD + "Haste"));
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.TOPAZ.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.MOISSANITE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.MOISSANITE.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.ONYX) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.ONYX.getDurabilityForSlot(modArmorItem.getSlot())));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.GRAPHENE) {
                //Making the tooltips
                tooltip.add(new TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + ModArmorMaterials.GRAPHENE.getDurabilityForSlot(modArmorItem.getSlot())));
            }
        }
    }
}