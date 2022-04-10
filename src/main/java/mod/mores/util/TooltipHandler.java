package mod.mores.util;

import mod.mores.Mores;
import mod.mores.config.Config;
import mod.mores.item.ModItems;
import mod.mores.item.custom.ModSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
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
    }

}