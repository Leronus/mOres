package mod.leronus.mores.api.client;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.item.ModArmorMaterials;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.item.ModTiers;
import mod.leronus.mores.item.custom.ModArmorItem;
import mod.leronus.mores.item.custom.ModBattleAxeItem;
import mod.leronus.mores.item.custom.ModShieldItem;
import mod.leronus.mores.item.custom.ModSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
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
        if (e.getItemStack().getItem() instanceof ShieldItem) {
            Item shield = e.getItemStack().getItem();
            List<Component> tooltip = e.getToolTip();
            tooltip.add(Component.literal(""));
//            tooltip.add(ModShieldItem.getBlockingTextComponent());

            if (shield == Items.SHIELD) {
                tooltip.add(Component.translatable("mores.shield_damage_reduction").withStyle(ChatFormatting.GRAY)
                        .append(": " + ChatFormatting.GOLD + Config.defaultDamageReduction.get() + "%"));
            } else if (shield instanceof ModShieldItem modShieldItem) {
                tooltip.add(Component.translatable("mores.shield_damage_reduction").withStyle(ChatFormatting.GRAY)
                        .append(": " + ChatFormatting.GOLD + modShieldItem.getDamageReduction() + "%"));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(modShieldItem.durability)).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else {
                tooltip.add(Component.translatable(": " + ChatFormatting.GOLD + (Config.customShieldMaxReduction.get() ? 100 : Config.defaultDamageReduction.get()) + "%"));
            }
        }

        if(e.getItemStack().getItem() instanceof SwordItem) {
            List<Component> tooltip = e.getToolTip();
            if (e.getItemStack().getItem() instanceof SwordItem sword) {
                if (sword == Items.NETHERITE_SWORD){
                    Tier netherite = Tiers.NETHERITE;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(netherite.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                } else if (sword == Items.DIAMOND_SWORD){
                    Tier diamond = Tiers.DIAMOND;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(diamond.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                } else if (sword == Items.GOLDEN_SWORD){
                    Tiers gold = Tiers.GOLD;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(gold.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                } else if (sword == Items.IRON_SWORD){
                    Tiers iron = Tiers.IRON;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(iron.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                } else if (sword == Items.STONE_SWORD){
                    Tiers stone = Tiers.STONE;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(stone.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                } else if (sword == Items.WOODEN_SWORD){
                    Tiers wood = Tiers.WOOD;
                    tooltip.add(Component.translatable(""));
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(wood.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                }
                if (e.getItemStack().getItem() instanceof ModSwordItem moddedSword){
                    tooltip.add(Component.translatable(""));
                    if (e.getItemStack().getItem() == ModItems.ONYX_SWORD.get() || e.getItemStack().getItem() == ModItems.ONYX_MACE.get() || e.getItemStack().getItem() == ModItems.ONYX_DAGGER.get() || e.getItemStack().getItem() == ModItems.ONYX_BATTLEAXE.get()) {
                        tooltip.add(Component.translatable("mores.bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.wither_effect").withStyle(ChatFormatting.DARK_GRAY)));
                    }
                    tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(moddedSword.getMaxUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
//                    if (e.getItemStack().getItem() == ModItems.RUBY_SWORD.get() || e.getItemStack().getItem() == ModItems.RUBY_MACE.get() || e.getItemStack().getItem() == ModItems.RUBY_BATTLEAXE.get() || e.getItemStack().getItem() == ModItems.RUBY_DAGGER.get()) {
//                        tooltip.add(Component.translatable(ChatFormatting.GRAY + "mores.bonus" + ChatFormatting.RED + "Burn Effect"));
//                    }
                }
            }
        }
        if (e.getItemStack().getItem() instanceof ModArmorItem modArmorItem) {
            List<Component> tooltip = e.getToolTip();
            if (modArmorItem.getMaterial() == ModArmorMaterials.TIN) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.jump_boost").withStyle(ChatFormatting.DARK_GRAY)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.TIN.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.COBALT) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.haste").withStyle(ChatFormatting.GOLD)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.COBALT.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.AMETHYST) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.slow_falling").withStyle(ChatFormatting.WHITE)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.AMETHYST.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.OBSIDIAN) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.strength_and_slowness").withStyle(ChatFormatting.DARK_PURPLE)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.OBSIDIAN.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.EMERALD) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.luck").withStyle(ChatFormatting.GREEN)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.EMERALD.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TOURMALINE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.regeneration").withStyle(ChatFormatting.RED)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.TOURMALINE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TANZANITE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.speed").withStyle(ChatFormatting.YELLOW)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.TANZANITE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.RUBY) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.fire_resistance").withStyle(ChatFormatting.DARK_RED)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.RUBY.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.SAPPHIRE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.night_vision").withStyle(ChatFormatting.BLUE)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.SAPPHIRE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TURQUOISE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.water_effects").withStyle(ChatFormatting.AQUA)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.TURQUOISE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.COPPER) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.COPPER.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.BRONZE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.BRONZE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.SILVER) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.SILVER.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.STERLING) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.STERLING.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.STEEL) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.STEEL.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.TOPAZ) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.full_set_bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.haste").withStyle(ChatFormatting.GOLD)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.TOPAZ.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.MOISSANITE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.MOISSANITE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.ONYX) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.ONYX.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else if (modArmorItem.getMaterial() == ModArmorMaterials.GRAPHENE) {
                //Making the tooltips
                tooltip.add(Component.translatable(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(ModArmorMaterials.GRAPHENE.getDurabilityForSlot(modArmorItem.getSlot()))).withStyle(ChatFormatting.LIGHT_PURPLE)));
            }
        }
        if (e.getItemStack().getItem() instanceof TieredItem tieredItem) {
            List<Component> tooltip = e.getToolTip();

            if (e.getItemStack().getItem() instanceof ModBattleAxeItem moddedBattleAxe) {
                tooltip.add(Component.literal(""));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(moddedBattleAxe.getTier().getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
            }
            if (!(e.getItemStack().getItem() instanceof SwordItem) && !(e.getItemStack().getItem() instanceof ModBattleAxeItem)) {
                tooltip.add(Component.literal(""));
                tooltip.add(Component.translatable("mores.harvest_level").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(tieredItem.getTier().getLevel())).withStyle(ChatFormatting.GOLD)));
                tooltip.add(Component.translatable("mores.durability").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(tieredItem.getTier().getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                tooltip.add(Component.translatable("mores.efficiency").withStyle(ChatFormatting.GRAY).append(Component.translatable(String.valueOf(tieredItem.getTier().getSpeed())).withStyle(ChatFormatting.RED)));
            }

            if (tieredItem.getTier() == ModTiers.RUBY && !(tieredItem instanceof HoeItem) && !(tieredItem instanceof SwordItem)){
                tooltip.add(Component.literal(""));
                tooltip.add(Component.translatable("mores.bonus").withStyle(ChatFormatting.GRAY).append(Component.translatable("mores.auto_smelt").withStyle(ChatFormatting.DARK_RED)));
            }
        }
    }
}