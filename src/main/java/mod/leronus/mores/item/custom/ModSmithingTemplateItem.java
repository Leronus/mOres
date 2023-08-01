package mod.leronus.mores.item.custom;

import mod.leronus.mores.Mores;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final String DESCRIPTION_ID = Util.makeDescriptionId("item", new ResourceLocation("smithing_template"));
    private static final Component INGREDIENTS_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID, "smithing_template.ingredients"))).withStyle(TITLE_FORMAT);
    private static final Component APPLIES_TO_TITLE = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.applies_to"))).withStyle(TITLE_FORMAT);
    private static final Component OBSIDIAN_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(Mores.MODID,"obsidian_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component ARMOR_TRIM_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.armor_trim.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component ARMOR_TRIM_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.armor_trim.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component ARMOR_TRIM_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.armor_trim.base_slot_description")));
    private static final Component ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.armor_trim.additions_slot_description")));
    private static final Component OBSIDIAN_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.obsidian_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component OBSIDIAN_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.obsidian_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component OBSIDIAN_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.obsidian_upgrade.base_slot_description")));
    private static final Component OBSIDIAN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.obsidian_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    public ModSmithingTemplateItem(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons) {
        super(appliesTo, ingredients, upgradeDescription, baseSlotDescription, additionsSlotDescription, baseSlotEmptyIcons, additionalSlotEmptyIcons);
    }

    public static SmithingTemplateItem createObsidianUpgradeTemplate() {
        return new SmithingTemplateItem(OBSIDIAN_UPGRADE_APPLIES_TO, OBSIDIAN_UPGRADE_INGREDIENTS, OBSIDIAN_UPGRADE, OBSIDIAN_UPGRADE_BASE_SLOT_DESCRIPTION, OBSIDIAN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createObsidianUpgradeIconList(), createObsidianUpgradeMaterialList());
    }
    private static List<ResourceLocation> createObsidianUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createObsidianUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

}
