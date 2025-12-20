package mod.leronus.mores.api.client;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.module.base.Feature;
import mod.leronus.mores.config.module.base.feature.BaseFeature;
import mod.leronus.mores.item.ModArmorMaterials;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.item.ModTiers;
import mod.leronus.mores.item.custom.ModArmorItem;
import mod.leronus.mores.item.custom.ModBattleAxeItem;
import mod.leronus.mores.item.custom.ModSwordItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID)
public class TooltipHandler {

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent e) {
        if (!Feature.isEnabled(BaseFeature.class) || !BaseFeature.extraTooltips) return;

        ItemStack stack = e.getItemStack();
        Item item = stack.getItem();
        List<Component> tooltip = e.getToolTip();

        // --- Shields ---
        if (item instanceof ShieldItem) {
            tooltip.add(Component.empty());
            addDurabilityLines(tooltip, stack, "mores.durability");
            return; // shields don't need other sections below
        }

        // --- Swords (vanilla + modded) ---
        if (item instanceof SwordItem) {
            if (item instanceof ModSwordItem modSword) {
                tooltip.add(Component.empty());

                // bonus text (onyx)
                if (item == ModItems.ONYX_SWORD.get()
                        || item == ModItems.ONYX_MACE.get()
                        || item == ModItems.ONYX_DAGGER.get()
                        || item == ModItems.ONYX_BATTLEAXE.get()) {
                    tooltip.add(Component.translatable("mores.bonus")
                            .withStyle(ChatFormatting.GRAY)
                            .append(Component.translatable("mores.wither_effect").withStyle(ChatFormatting.DARK_GRAY)));
                }

                tooltip.add(Component.translatable("mores.durability")
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(String.valueOf(modSword.getMaxUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
            } else {
                // vanilla sword: show tier uses
                Tier tier = getVanillaSwordTier(item);
                if (tier != null) {
                    tooltip.add(Component.empty());
                    tooltip.add(Component.translatable("mores.durability")
                            .withStyle(ChatFormatting.GRAY)
                            .append(Component.literal(String.valueOf(tier.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                }
            }
        }

        // --- Armor ---
        if (item instanceof ModArmorItem modArmorItem) {
            Holder<ArmorMaterial> mat = modArmorItem.getMaterial();

            tooltip.add(Component.empty());

            // IMPORTANT: durability in 1.20.6 comes from Item.Properties().durability(...)
            // If you never set it, maxDamage==0 and this will show 0.
            addDurabilityLines(tooltip, stack, "mores.durability");

            // Full-set bonus lines (only add for known sets)
            if (isMat(mat, ModArmorMaterials.TIN)) {
                addSetBonusLine(tooltip, "mores.jump_boost", ChatFormatting.YELLOW);
            } else if (isMat(mat, ModArmorMaterials.COBALT)) {
                addSetBonusLine(tooltip, "mores.haste", ChatFormatting.GOLD);
            } else if (isMat(mat, ModArmorMaterials.AMETHYST)) {
                addSetBonusLine(tooltip, "mores.slow_falling", ChatFormatting.YELLOW);
            } else if (isMat(mat, ModArmorMaterials.EMERALD)) {
                addSetBonusLine(tooltip, "mores.luck", ChatFormatting.GREEN);
            } else if (isMat(mat, ModArmorMaterials.TOURMALINE)) {
                addSetBonusLine(tooltip, "mores.regeneration", ChatFormatting.RED);
            } else if (isMat(mat, ModArmorMaterials.TANZANITE)) {
                addSetBonusLine(tooltip, "mores.speed", ChatFormatting.YELLOW);
            } else if (isMat(mat, ModArmorMaterials.RUBY)) {
                addSetBonusLine(tooltip, "mores.fire_resistance", ChatFormatting.DARK_RED);
            } else if (isMat(mat, ModArmorMaterials.SAPPHIRE)) {
                addSetBonusLine(tooltip, "mores.night_vision", ChatFormatting.BLUE);
            } else if (isMat(mat, ModArmorMaterials.TURQUOISE)) {
                addSetBonusLine(tooltip, "mores.water_effects", ChatFormatting.AQUA);
            } else if (isMat(mat, ModArmorMaterials.STEEL)) {
                addSetBonusLine(tooltip, "mores.strength", ChatFormatting.DARK_PURPLE);
            } else if (isMat(mat, ModArmorMaterials.TOPAZ)) {
                addSetBonusLine(tooltip, "mores.haste", ChatFormatting.GOLD);
            } else if (isMat(mat, ModArmorMaterials.MOISSANITE)) {
                addSetBonusLine(tooltip, "mores.conduit", ChatFormatting.AQUA);
            }
        }

        // --- Tiered tools (pickaxe/axe/shovel/hoe etc) ---
        if (item instanceof TieredItem tieredItem) {
            Tier tier = tieredItem.getTier();

            // battleaxe durability line (tier uses)
            if (item instanceof ModBattleAxeItem) {
                tooltip.add(Component.empty());
                tooltip.add(Component.translatable("mores.durability")
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(String.valueOf(tier.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
            }

            // avoid swords showing tool stats twice
            if (!(item instanceof SwordItem)) {
                tooltip.add(Component.empty());
                tooltip.add(Component.translatable("mores.durability")
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(String.valueOf(tier.getUses())).withStyle(ChatFormatting.LIGHT_PURPLE)));
                tooltip.add(Component.translatable("mores.efficiency")
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(String.valueOf(tier.getSpeed())).withStyle(ChatFormatting.RED)));
            }

            if (tier == ModTiers.RUBY && !(tieredItem instanceof HoeItem) && !(tieredItem instanceof SwordItem) && BaseFeature.rubyAutoSmelt) {
                tooltip.add(Component.empty());
                tooltip.add(Component.translatable("mores.bonus")
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.translatable("mores.auto_smelt").withStyle(ChatFormatting.DARK_RED)));
            }
        }

        // --- Horse armor in 1.20.6 is AnimalArmorItem ---
        if (item instanceof AnimalArmorItem animalArmorItem) {
            tooltip.add(Component.empty());
            tooltip.add(Component.translatable("mores.protection")
                    .withStyle(ChatFormatting.GRAY)
                    .append(Component.literal(String.valueOf(animalArmorItem.getDefense())).withStyle(ChatFormatting.GOLD)));
        }
    }

    private static void addSetBonusLine(List<Component> tooltip, String bonusKey, ChatFormatting bonusColor) {
        tooltip.add(Component.translatable("mores.full_set_bonus")
                .withStyle(ChatFormatting.GRAY)
                .append(Component.translatable(bonusKey).withStyle(bonusColor)));
    }

    private static void addDurabilityLines(List<Component> tooltip, ItemStack stack, String key) {
        int max = stack.getMaxDamage();
        if (max <= 0) {
            // Either truly unbreakable OR you forgot to set .durability(...) in Item.Properties()
            tooltip.add(Component.translatable(key)
                    .withStyle(ChatFormatting.GRAY)
                    .append(Component.literal("0").withStyle(ChatFormatting.LIGHT_PURPLE)));
            return;
        }
        int remaining = max - stack.getDamageValue();
        tooltip.add(Component.translatable(key)
                .withStyle(ChatFormatting.GRAY)
                .append(Component.literal(remaining + " / " + max).withStyle(ChatFormatting.LIGHT_PURPLE)));
    }

    private static boolean isMat(Holder<ArmorMaterial> equippedMat, RegistryObject<ArmorMaterial> regObj) {
        return regObj.getHolder().map(equippedMat::equals).orElse(false);
    }

    private static Tier getVanillaSwordTier(Item item) {
        if (item == Items.NETHERITE_SWORD) return Tiers.NETHERITE;
        if (item == Items.DIAMOND_SWORD) return Tiers.DIAMOND;
        if (item == Items.GOLDEN_SWORD) return Tiers.GOLD;
        if (item == Items.IRON_SWORD) return Tiers.IRON;
        if (item == Items.STONE_SWORD) return Tiers.STONE;
        if (item == Items.WOODEN_SWORD) return Tiers.WOOD;
        return null;
    }
}
