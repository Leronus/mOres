package mod.leronus.mores.item.custom;

import mod.leronus.mores.Mores;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.armortrim.TrimPattern;

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

    private static final Component BRONZE_ALLOY = Component.translatable(Util.makeDescriptionId("alloy", new ResourceLocation(Mores.MODID,"bronze_alloy"))).withStyle(TITLE_FORMAT);
    private static final Component BRONZE_ALLOY_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.bronze_alloy.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component BRONZE_ALLOY_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.bronze_alloy.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component BRONZE_ALLOY_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.bronze_alloy.base_slot_description")));
    private static final Component BRONZE_ALLOY_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.bronze_alloy.additions_slot_description")));

    private static final Component STERLING_ALLOY = Component.translatable(Util.makeDescriptionId("alloy", new ResourceLocation(Mores.MODID,"sterling_alloy"))).withStyle(TITLE_FORMAT);
    private static final Component STERLING_ALLOY_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.sterling_alloy.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component STERLING_ALLOY_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.sterling_alloy.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component STERLING_ALLOY_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.sterling_alloy.base_slot_description")));
    private static final Component STERLING_ALLOY_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.sterling_alloy.additions_slot_description")));

    private static final Component STEEL_ALLOY = Component.translatable(Util.makeDescriptionId("alloy", new ResourceLocation(Mores.MODID,"steel_alloy"))).withStyle(TITLE_FORMAT);
    private static final Component STEEL_ALLOY_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.steel_alloy.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component STEEL_ALLOY_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.steel_alloy.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component STEEL_ALLOY_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.steel_alloy.base_slot_description")));
    private static final Component STEEL_ALLOY_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.steel_alloy.additions_slot_description")));

    private static final Component GRAPHENE_ALLOY = Component.translatable(Util.makeDescriptionId("alloy", new ResourceLocation(Mores.MODID,"graphene_alloy"))).withStyle(TITLE_FORMAT);
    private static final Component GRAPHENE_ALLOY_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.graphene_alloy.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component GRAPHENE_ALLOY_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.graphene_alloy.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component GRAPHENE_ALLOY_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.graphene_alloy.base_slot_description")));
    private static final Component GRAPHENE_ALLOY_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(Mores.MODID,"smithing_template.graphene_alloy.additions_slot_description")));

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
    private static final ResourceLocation EMPTY_SLOT_REDSTONE_DUST = new ResourceLocation("item/empty_slot_redstone_dust");
    private static final ResourceLocation EMPTY_SLOT_QUARTZ = new ResourceLocation("item/empty_slot_quartz");
    private static final ResourceLocation EMPTY_SLOT_EMERALD = new ResourceLocation("item/empty_slot_emerald");
    private static final ResourceLocation EMPTY_SLOT_DIAMOND = new ResourceLocation("item/empty_slot_diamond");
    private static final ResourceLocation EMPTY_SLOT_LAPIS_LAZULI = new ResourceLocation("item/empty_slot_lapis_lazuli");
    private static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD = new ResourceLocation("item/empty_slot_amethyst_shard");
    //Mores location
    private static final ResourceLocation EMPTY_SLOT_COAL = new ResourceLocation(Mores.MODID, "item/empty_slot_coal");
    private static final ResourceLocation EMPTY_SLOT_BATTLEAXE = new ResourceLocation(Mores.MODID, "item/empty_slot_battleaxe");
    private static final ResourceLocation EMPTY_SLOT_MACE = new ResourceLocation(Mores.MODID,"item/empty_slot_mace");
    private static final ResourceLocation EMPTY_SLOT_DAGGER = new ResourceLocation(Mores.MODID,"item/empty_slot_dagger");

    //Constructor
    public ModSmithingTemplateItem(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons) {
        super(appliesTo, ingredients, upgradeDescription, baseSlotDescription, additionsSlotDescription, baseSlotEmptyIcons, additionalSlotEmptyIcons);
    }

    //Upgrade Templates
    public static SmithingTemplateItem createObsidianUpgradeTemplate() {
        return new SmithingTemplateItem(OBSIDIAN_UPGRADE_APPLIES_TO, OBSIDIAN_UPGRADE_INGREDIENTS, OBSIDIAN_UPGRADE, OBSIDIAN_UPGRADE_BASE_SLOT_DESCRIPTION, OBSIDIAN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createObsidianUpgradeIconList(), createObsidianUpgradeMaterialList());
    }


    //Alloy Templates
    public static SmithingTemplateItem createBronzeAlloyTemplate() {
        return new SmithingTemplateItem(BRONZE_ALLOY_APPLIES_TO, BRONZE_ALLOY_INGREDIENTS, BRONZE_ALLOY, BRONZE_ALLOY_BASE_SLOT_DESCRIPTION, BRONZE_ALLOY_ADDITIONS_SLOT_DESCRIPTION, createIngotAlloyIconList(), createObsidianUpgradeMaterialList());
    }
    public static SmithingTemplateItem createSterlingAlloyTemplate() {
        return new SmithingTemplateItem(STERLING_ALLOY_APPLIES_TO, STERLING_ALLOY_INGREDIENTS, STERLING_ALLOY, STERLING_ALLOY_BASE_SLOT_DESCRIPTION, STERLING_ALLOY_ADDITIONS_SLOT_DESCRIPTION, createIngotAlloyIconList(), createIngotAlloyIconList());
    }

    public static SmithingTemplateItem createSteelAlloyTemplate() {
        return new SmithingTemplateItem(STEEL_ALLOY_APPLIES_TO, STEEL_ALLOY_INGREDIENTS, STEEL_ALLOY, STEEL_ALLOY_BASE_SLOT_DESCRIPTION, STEEL_ALLOY_ADDITIONS_SLOT_DESCRIPTION, createIngotAlloyIconList(), createCoalIconList());
    }

    public static SmithingTemplateItem createGrapheneAlloyTemplate() {
        return new SmithingTemplateItem(GRAPHENE_ALLOY_APPLIES_TO, GRAPHENE_ALLOY_INGREDIENTS, GRAPHENE_ALLOY, GRAPHENE_ALLOY_BASE_SLOT_DESCRIPTION, GRAPHENE_ALLOY_ADDITIONS_SLOT_DESCRIPTION, createGemAlloyIconList(), createGemAlloyIconList());
    }



    //Icon Lists
    private static List<ResourceLocation> createObsidianUpgradeIconList() {
        return List.of(EMPTY_SLOT_BATTLEAXE, EMPTY_SLOT_MACE, EMPTY_SLOT_DAGGER, EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }
    private static List<ResourceLocation> createIngotAlloyIconList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    private static List<ResourceLocation> createGemAlloyIconList() {
        return List.of(EMPTY_SLOT_DIAMOND);
    }

    private static List<ResourceLocation> createObsidianUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    private static List<ResourceLocation> createCoalIconList() {
        return List.of(EMPTY_SLOT_COAL);
    }

    public static SmithingTemplateItem createArmorTrimTemplate(ResourceKey<TrimPattern> p_266875_) {
        return createArmorTrimTemplate(p_266875_.location());
    }

    public static SmithingTemplateItem createArmorTrimTemplate(ResourceLocation p_266880_) {
        return new SmithingTemplateItem(ARMOR_TRIM_APPLIES_TO, ARMOR_TRIM_INGREDIENTS, Component.translatable(Util.makeDescriptionId("trim_pattern", p_266880_)).withStyle(TITLE_FORMAT), ARMOR_TRIM_BASE_SLOT_DESCRIPTION, ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION, createTrimmableArmorIconList(), createTrimmableMaterialIconList());
    }
    private static List<ResourceLocation> createTrimmableArmorIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<ResourceLocation> createTrimmableMaterialIconList() {
        return List.of(EMPTY_SLOT_INGOT, EMPTY_SLOT_REDSTONE_DUST, EMPTY_SLOT_LAPIS_LAZULI, EMPTY_SLOT_QUARTZ, EMPTY_SLOT_DIAMOND, EMPTY_SLOT_EMERALD, EMPTY_SLOT_AMETHYST_SHARD);
    }
}
