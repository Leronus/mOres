package mod.mores.init;

import mod.mores.objects.ItemBase;
import mod.mores.objects.items.armor.ArmorBase;
import mod.mores.objects.items.tools.*;
import mod.mores.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();


    //Materials
    public static final ItemArmor.ArmorMaterial ARMOR_AMETHYST = EnumHelper.addArmorMaterial("amethyst_armor", Reference.MODID + ":amethyst", 769, new int[] {2, 5, 7, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_COBALT = EnumHelper.addArmorMaterial("cobalt_armor", Reference.MODID + ":cobalt", 691, new int[] {2, 5, 7, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
    public static final ItemArmor.ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("steel_armor", Reference.MODID + ":steel", 743, new int[] {2, 6, 7, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("copper_armor", Reference.MODID + ":copper", 333, new int[] {1, 4, 5, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
    public static final ItemArmor.ArmorMaterial ARMOR_TIN = EnumHelper.addArmorMaterial("tin_armor", Reference.MODID + ":tin", 300, new int[] {1, 4, 4, 1}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
    public static final ItemArmor.ArmorMaterial ARMOR_SILVER = EnumHelper.addArmorMaterial("silver_armor", Reference.MODID + ":silver", 367, new int[] {1, 4, 5, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("bronze_armor", Reference.MODID + ":bronze", 479, new int[] {2, 4, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_EMERALD = EnumHelper.addArmorMaterial("emerald_armor", Reference.MODID + ":emerald", 678, new int[] {2, 5, 7, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
    public static final ItemArmor.ArmorMaterial ARMOR_OBSIDIAN = EnumHelper.addArmorMaterial("obsidian_armor", Reference.MODID + ":obsidian", 1891, new int[] {2, 5, 6, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("ruby_armor", Reference.MODID + ":ruby", 1500, new int[] {3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_SAPPHIRE = EnumHelper.addArmorMaterial("sapphire_armor", Reference.MODID + ":sapphire", 1142, new int[] {3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_TOPAZ = EnumHelper.addArmorMaterial("topaz_armor", Reference.MODID + ":topaz", 924, new int[] {3, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_TOURMALINE = EnumHelper.addArmorMaterial("tourmaline_armor", Reference.MODID + ":tourmaline", 876, new int[] {2, 5, 7, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3);
    public static final ItemArmor.ArmorMaterial ARMOR_TANZANITE = EnumHelper.addArmorMaterial("tanzanite_armor", Reference.MODID + ":tanzanite", 1245, new int[] {2, 5, 6, 2}, 27, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
    public static final ItemArmor.ArmorMaterial ARMOR_MOISSANITE = EnumHelper.addArmorMaterial("moissanite_armor", Reference.MODID + ":moissanite", 924, new int[] {2, 5, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
    public static final ItemArmor.ArmorMaterial ARMOR_ONYX = EnumHelper.addArmorMaterial("onyx_armor", Reference.MODID + ":onyx", 3000, new int[] {3, 5, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
    public static final ItemArmor.ArmorMaterial ARMOR_TURQUARTZ = EnumHelper.addArmorMaterial("turquartz_armor", Reference.MODID + ":turquartz", 2796, new int[] {3, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);
    public static final ItemArmor.ArmorMaterial ARMOR_GRAPHENE = EnumHelper.addArmorMaterial("graphene_armor", Reference.MODID + ":graphene", 5000, new int[] {2, 5, 7, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3);


    //Tool materials
    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("copper", 2, 87, 5.0F, 1.5F, 10);
    public static final Item.ToolMaterial TOOL_TIN = EnumHelper.addToolMaterial("tin", 2, 100, 4.8F, 1.5F, 13);
    public static final Item.ToolMaterial TOOL_SILVER = EnumHelper.addToolMaterial("silver", 3, 234, 5.5F, 1.8F, 25);

    public static final Item.ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("bronze", 4, 256, 5.5F, 2.0F, 12);
    public static final Item.ToolMaterial TOOL_STERLING = EnumHelper.addToolMaterial("sterling", 4, 287, 6.0F, 2.2F, 17);

    public static final Item.ToolMaterial TOOL_OBSIDIAN = EnumHelper.addToolMaterial("obsidian", 5, 1931, 6.3F, 2.5F, 7);
    public static final Item.ToolMaterial TOOL_COBALT = EnumHelper.addToolMaterial("cobalt", 5, 351, 6.5F, 2.2F, 20);
    public static final Item.ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("steel", 5, 407, 6.2F, 2.5F, 12);

    public static final Item.ToolMaterial TOOL_AMETHYST = EnumHelper.addToolMaterial("amethyst", 6, 1021, 7.0F, 2.5F, 12);
    public static final Item.ToolMaterial TOOL_EMERALD = EnumHelper.addToolMaterial("emerald", 6, 455, 6.5F, 2.5F, 18);

    public static final Item.ToolMaterial TOOL_TOPAZ = EnumHelper.addToolMaterial("topaz", 7, 1245, 7.5F, 2.5F, 15);
    public static final Item.ToolMaterial TOOL_TOURMALINE = EnumHelper.addToolMaterial("tourmaline", 7, 1671, 7.0F, 3.0F, 20);
    public static final Item.ToolMaterial TOOL_TANZANITE = EnumHelper.addToolMaterial("tanzanite", 6, 1963, 8.0F, 3.0F, 31);

    public static final Item.ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("ruby", 8, 1345, 8.5F, 3.0F, 12);
    public static final Item.ToolMaterial TOOL_SAPPHIRE = EnumHelper.addToolMaterial("sapphire", 8, 783, 8.0F, 3.5F, 20);

    public static final Item.ToolMaterial TOOL_MOISSANITE = EnumHelper.addToolMaterial("moissanite", 9, 2471, 9.0F, 4.0F, 16);
    public static final Item.ToolMaterial TOOL_ONYX = EnumHelper.addToolMaterial("onyx", 9, 3000, 9.0F, 4.0F, 25);
    public static final Item.ToolMaterial TOOL_TURQUARTZ = EnumHelper.addToolMaterial("turquartz", 9, 2769, 8.0F, 3.0F, 8);

    public static final Item.ToolMaterial TOOL_GRAPHENE = EnumHelper.addToolMaterial("graphene", 10, 5000, 9.0F, 4.5F, 25);


    //Items
    public static final Item AMETHYST_GEM = new ItemBase("amethyst_gem");
    public static final Item MOISSANITE_GEM = new ItemBase("moissanite_gem");
    public static final Item ONYX_GEM = new ItemBase("onyx_gem");
    public static final Item RUBY_GEM = new ItemBase("ruby_gem");
    public static final Item SAPPHIRE_GEM = new ItemBase("sapphire_gem");
    public static final Item TOURMALINE_GEM = new ItemBase("tourmaline_gem");
    public static final Item GRAPHENE_GEM = new ItemBase("graphene_gem");
    public static final Item TANZANITE_GEM = new ItemBase("tanzanite_gem");

    public static final Item TOPAZ_GEM = new ItemBase("topaz_gem");
    public static final Item TURQUOISE_GEM = new ItemBase("turquoise_gem");

    public static final Item TURQUARTZ_GEM = new ItemBase("turquartz_gem");

    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
    public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
    public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
    public static final Item TIN_INGOT = new ItemBase("tin_ingot");
    public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
    //public static final Item STERLING_INGOT = new ItemBase("sterling_ingot");

    public static final Item ROOIEKOOL = new ItemBase("rooiekool");


    //Tools
    public static final Item AMETHYST_SWORD = new ToolSword("amethyst_sword", TOOL_AMETHYST);
    public static final Item AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", TOOL_AMETHYST);
    public static final Item AMETHYST_AXE = new ToolAxe(7.0F, -3.1F, "amethyst_axe", TOOL_AMETHYST);
    public static final Item AMETHYST_SHOVEL = new ToolShovel("amethyst_shovel", TOOL_AMETHYST);
    public static final Item AMETHYST_HOE = new ToolHoe("amethyst_hoe", TOOL_AMETHYST);
    public static final Item AMETHYST_BATTLEAXE = new ToolBattleaxe("amethyst_battleaxe", TOOL_AMETHYST);
    public static final Item AMETHYST_DAGGER = new ToolDagger("amethyst_dagger", TOOL_AMETHYST);
    public static final Item AMETHYST_MACE = new ToolMace("amethyst_mace", TOOL_AMETHYST);

    public static final Item MOISSANITE_SWORD = new ToolSword("moissanite_sword", TOOL_MOISSANITE);
    public static final Item MOISSANITE_PICKAXE = new ToolPickaxe("moissanite_pickaxe", TOOL_MOISSANITE);
    public static final Item MOISSANITE_AXE = new ToolAxe(8.0F, -2.8F, "moissanite_axe", TOOL_MOISSANITE);
    public static final Item MOISSANITE_SHOVEL = new ToolShovel("moissanite_shovel", TOOL_MOISSANITE);
    public static final Item MOISSANITE_HOE = new ToolHoe("moissanite_hoe", TOOL_MOISSANITE);
    public static final Item MOISSANITE_BATTLEAXE = new ToolBattleaxe("moissanite_battleaxe", TOOL_MOISSANITE);
    public static final Item MOISSANITE_DAGGER = new ToolDagger("moissanite_dagger", TOOL_MOISSANITE);
    public static final Item MOISSANITE_MACE = new ToolMace("moissanite_mace", TOOL_MOISSANITE);

    public static final Item ONYX_SWORD = new ToolSword("onyx_sword", TOOL_ONYX);
    public static final Item ONYX_PICKAXE = new ToolPickaxe("onyx_pickaxe", TOOL_ONYX);
    public static final Item ONYX_AXE = new ToolAxe(8.5F, -2.9F, "onyx_axe", TOOL_ONYX);
    public static final Item ONYX_SHOVEL = new ToolShovel("onyx_shovel", TOOL_ONYX);
    public static final Item ONYX_HOE = new ToolHoe("onyx_hoe", TOOL_ONYX);
    public static final Item ONYX_BATTLEAXE = new ToolBattleaxe("onyx_battleaxe", TOOL_ONYX);
    public static final Item ONYX_DAGGER = new ToolDagger("onyx_dagger", TOOL_ONYX);
    public static final Item ONYX_MACE = new ToolMace("onyx_mace", TOOL_ONYX);

    public static final Item RUBY_SWORD = new ToolSword("ruby_sword", TOOL_RUBY);
    public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", TOOL_RUBY);
    public static final Item RUBY_AXE = new ToolAxe(8.0F, -3.0F, "ruby_axe", TOOL_RUBY);
    public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", TOOL_RUBY);
    public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", TOOL_RUBY);
    public static final Item RUBY_BATTLEAXE = new ToolBattleaxe("ruby_battleaxe", TOOL_RUBY);
    public static final Item RUBY_DAGGER = new ToolDagger("ruby_dagger", TOOL_RUBY);
    public static final Item RUBY_MACE = new ToolMace("ruby_mace", TOOL_RUBY);

    public static final Item SAPPHIRE_SWORD = new ToolSword("sapphire_sword", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_AXE = new ToolAxe(8.0F, -3.0F, "sapphire_axe", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_SHOVEL = new ToolShovel("sapphire_shovel", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_BATTLEAXE = new ToolBattleaxe("sapphire_battleaxe", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_DAGGER = new ToolDagger("sapphire_dagger", TOOL_SAPPHIRE);
    public static final Item SAPPHIRE_MACE = new ToolMace("sapphire_mace", TOOL_SAPPHIRE);

    public static final Item TOURMALINE_SWORD = new ToolSword("tourmaline_sword", TOOL_TOURMALINE);
    public static final Item TOURMALINE_PICKAXE = new ToolPickaxe("tourmaline_pickaxe", TOOL_TOURMALINE);
    public static final Item TOURMALINE_AXE = new ToolAxe(7.7F, -3.0F, "tourmaline_axe", TOOL_TOURMALINE);
    public static final Item TOURMALINE_SHOVEL = new ToolShovel("tourmaline_shovel", TOOL_TOURMALINE);
    public static final Item TOURMALINE_HOE = new ToolHoe("tourmaline_hoe", TOOL_TOURMALINE);
    public static final Item TOURMALINE_BATTLEAXE = new ToolBattleaxe("tourmaline_battleaxe", TOOL_TOURMALINE);
    public static final Item TOURMALINE_DAGGER = new ToolDagger("tourmaline_dagger", TOOL_TOURMALINE);
    public static final Item TOURMALINE_MACE = new ToolMace("tourmaline_mace", TOOL_TOURMALINE);

    public static final Item GRAPHENE_SWORD = new ToolSword("graphene_sword", TOOL_GRAPHENE);
    public static final Item GRAPHENE_PICKAXE = new ToolPickaxe("graphene_pickaxe", TOOL_GRAPHENE);
    public static final Item GRAPHENE_AXE = new ToolAxe(8.2F, -2.9F, "graphene_axe", TOOL_GRAPHENE);
    public static final Item GRAPHENE_SHOVEL = new ToolShovel("graphene_shovel", TOOL_GRAPHENE);
    public static final Item GRAPHENE_HOE = new ToolHoe("graphene_hoe", TOOL_GRAPHENE);
    public static final Item GRAPHENE_BATTLEAXE = new ToolBattleaxe("graphene_battleaxe", TOOL_GRAPHENE);
    public static final Item GRAPHENE_DAGGER = new ToolDagger("graphene_dagger", TOOL_GRAPHENE);
    public static final Item GRAPHENE_MACE = new ToolMace("graphene_mace", TOOL_GRAPHENE);

    public static final Item TANZANITE_SWORD = new ToolSword("tanzanite_sword", TOOL_TANZANITE);
    public static final Item TANZANITE_PICKAXE = new ToolPickaxe("tanzanite_pickaxe", TOOL_TANZANITE);
    public static final Item TANZANITE_AXE = new ToolAxe(7.7F, -3.0F, "tanzanite_axe", TOOL_TANZANITE);
    public static final Item TANZANITE_SHOVEL = new ToolShovel("tanzanite_shovel", TOOL_TANZANITE);
    public static final Item TANZANITE_HOE = new ToolHoe("tanzanite_hoe", TOOL_TANZANITE);
    public static final Item TANZANITE_BATTLEAXE = new ToolBattleaxe("tanzanite_battleaxe", TOOL_TANZANITE);
    public static final Item TANZANITE_DAGGER = new ToolDagger("tanzanite_dagger", TOOL_TANZANITE);
    public static final Item TANZANITE_MACE = new ToolMace("tanzanite_mace", TOOL_TANZANITE);

    public static final Item TOPAZ_SWORD = new ToolSword("topaz_sword", TOOL_TOPAZ);
    public static final Item TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", TOOL_TOPAZ);
    public static final Item TOPAZ_AXE = new ToolAxe(7.7F, -3.0F, "topaz_axe", TOOL_TOPAZ);
    public static final Item TOPAZ_SHOVEL = new ToolShovel("topaz_shovel", TOOL_TOPAZ);
    public static final Item TOPAZ_HOE = new ToolHoe("topaz_hoe", TOOL_TOPAZ);
    public static final Item TOPAZ_BATTLEAXE = new ToolBattleaxe("topaz_battleaxe", TOOL_TOPAZ);
    public static final Item TOPAZ_DAGGER = new ToolDagger("topaz_dagger", TOOL_TOPAZ);
    public static final Item TOPAZ_MACE = new ToolMace("topaz_mace", TOOL_TOPAZ);

    public static final Item TURQUARTZ_SWORD = new ToolSword("turquartz_sword", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_PICKAXE = new ToolPickaxe("turquartz_pickaxe", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_AXE = new ToolAxe(7.7F, -3.0F, "turquartz_axe", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_SHOVEL = new ToolShovel("turquartz_shovel", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_HOE = new ToolHoe("turquartz_hoe", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_BATTLEAXE = new ToolBattleaxe("turquartz_battleaxe", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_DAGGER = new ToolDagger("turquartz_dagger", TOOL_TURQUARTZ);
    public static final Item TURQUARTZ_MACE = new ToolMace("turquartz_mace", TOOL_TURQUARTZ);

    public static final Item COBALT_SWORD = new ToolSword("cobalt_sword", TOOL_COBALT);
    public static final Item COBALT_PICKAXE = new ToolPickaxe("cobalt_pickaxe", TOOL_COBALT);
    public static final Item COBALT_AXE = new ToolAxe(7.2F, -3.1F, "cobalt_axe", TOOL_COBALT);
    public static final Item COBALT_SHOVEL = new ToolShovel("cobalt_shovel", TOOL_COBALT);
    public static final Item COBALT_HOE = new ToolHoe("cobalt_hoe", TOOL_COBALT);
    public static final Item COBALT_BATTLEAXE = new ToolBattleaxe("cobalt_battleaxe", TOOL_COBALT);
    public static final Item COBALT_DAGGER = new ToolDagger("cobalt_dagger", TOOL_COBALT);
    public static final Item COBALT_MACE = new ToolMace("cobalt_mace", TOOL_COBALT);

    public static final Item COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER);
    public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER);
    public static final Item COPPER_AXE = new ToolAxe(6.5F, -3.3F, "copper_axe", TOOL_COPPER);
    public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER);
    public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER);
    public static final Item COPPER_BATTLEAXE = new ToolBattleaxe("copper_battleaxe", TOOL_COPPER);
    public static final Item COPPER_DAGGER = new ToolDagger("copper_dagger", TOOL_COPPER);
    public static final Item COPPER_MACE = new ToolMace("copper_mace", TOOL_COPPER);

    public static final Item SILVER_SWORD = new ToolSword("silver_sword", TOOL_SILVER);
    public static final Item SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", TOOL_SILVER);
    public static final Item SILVER_AXE = new ToolAxe(7.0F, -3.2F, "silver_axe", TOOL_SILVER);
    public static final Item SILVER_SHOVEL = new ToolShovel("silver_shovel", TOOL_SILVER);
    public static final Item SILVER_HOE = new ToolHoe("silver_hoe", TOOL_SILVER);
    public static final Item SILVER_BATTLEAXE = new ToolBattleaxe("silver_battleaxe", TOOL_SILVER);
    public static final Item SILVER_DAGGER = new ToolDagger("silver_dagger", TOOL_SILVER);
    public static final Item SILVER_MACE = new ToolMace("silver_mace", TOOL_SILVER);

    public static final Item STEEL_SWORD = new ToolSword("steel_sword", TOOL_STEEL);
    public static final Item STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", TOOL_STEEL);
    public static final Item STEEL_AXE = new ToolAxe(7.5F, -3.1F, "steel_axe", TOOL_STEEL);
    public static final Item STEEL_SHOVEL = new ToolShovel("steel_shovel", TOOL_STEEL);
    public static final Item STEEL_HOE = new ToolHoe("steel_hoe", TOOL_STEEL);
    public static final Item STEEL_BATTLEAXE = new ToolBattleaxe("steel_battleaxe", TOOL_STEEL);
    public static final Item STEEL_DAGGER = new ToolDagger("steel_dagger", TOOL_STEEL);
    public static final Item STEEL_MACE = new ToolMace("steel_mace", TOOL_STEEL);

    public static final Item TIN_SWORD = new ToolSword("tin_sword", TOOL_TIN);
    public static final Item TIN_PICKAXE = new ToolPickaxe("tin_pickaxe", TOOL_TIN);
    public static final Item TIN_AXE = new ToolAxe(6.5F, -3.3F, "tin_axe", TOOL_TIN);
    public static final Item TIN_SHOVEL = new ToolShovel("tin_shovel", TOOL_TIN);
    public static final Item TIN_HOE = new ToolHoe("tin_hoe", TOOL_TIN);
    public static final Item TIN_BATTLEAXE = new ToolBattleaxe("tin_battleaxe", TOOL_TIN);
    public static final Item TIN_DAGGER = new ToolDagger("tin_dagger", TOOL_TIN);
    public static final Item TIN_MACE = new ToolMace("tin_mace", TOOL_TIN);

    public static final Item BRONZE_SWORD = new ToolSword("bronze_sword", TOOL_BRONZE);
    public static final Item BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", TOOL_BRONZE);
    public static final Item BRONZE_AXE = new ToolAxe(7.0F, -3.2F, "bronze_axe", TOOL_BRONZE);
    public static final Item BRONZE_SHOVEL = new ToolShovel("bronze_shovel", TOOL_BRONZE);
    public static final Item BRONZE_HOE = new ToolHoe("bronze_hoe", TOOL_BRONZE);
    public static final Item BRONZE_BATTLEAXE = new ToolBattleaxe("bronze_battleaxe", TOOL_BRONZE);
    public static final Item BRONZE_DAGGER = new ToolDagger("bronze_dagger", TOOL_BRONZE);
    public static final Item BRONZE_MACE = new ToolMace("bronze_mace", TOOL_BRONZE);

    public static final Item STERLING_SWORD = new ToolSword("sterling_sword", TOOL_STERLING);
    public static final Item STERLING_PICKAXE = new ToolPickaxe("sterling_pickaxe", TOOL_STERLING);
    public static final Item STERLING_AXE = new ToolAxe(6.5F, -3.3F, "sterling_axe", TOOL_STERLING);
    public static final Item STERLING_SHOVEL = new ToolShovel("sterling_shovel", TOOL_STERLING);
    public static final Item STERLING_HOE = new ToolHoe("sterling_hoe", TOOL_STERLING);
    public static final Item STERLING_BATTLEAXE = new ToolBattleaxe("sterling_battleaxe", TOOL_STERLING);
    public static final Item STERLING_DAGGER = new ToolDagger("sterling_dagger", TOOL_STERLING);
    public static final Item STERLING_MACE = new ToolMace("sterling_mace", TOOL_STERLING);

    public static final Item EMERALD_SWORD = new ToolSword("emerald_sword", TOOL_EMERALD);
    public static final Item EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", TOOL_EMERALD);
    public static final Item EMERALD_AXE = new ToolAxe(7.5F, -3.0F, "emerald_axe", TOOL_EMERALD);
    public static final Item EMERALD_SHOVEL = new ToolShovel("emerald_shovel", TOOL_EMERALD);
    public static final Item EMERALD_HOE = new ToolHoe("emerald_hoe", TOOL_EMERALD);
    public static final Item EMERALD_BATTLEAXE = new ToolBattleaxe("emerald_battleaxe", TOOL_EMERALD);
    public static final Item EMERALD_DAGGER = new ToolDagger("emerald_dagger", TOOL_EMERALD);
    public static final Item EMERALD_MACE = new ToolMace("emerald_mace", TOOL_EMERALD);

    public static final Item OBSIDIAN_SWORD = new ToolSword("obsidian_sword", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_AXE = new ToolAxe(7.5F, -3.0F, "obsidian_axe", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_SHOVEL = new ToolShovel("obsidian_shovel", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_BATTLEAXE = new ToolBattleaxe("obsidian_battleaxe", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_DAGGER = new ToolDagger("obsidian_dagger", TOOL_OBSIDIAN);
    public static final Item OBSIDIAN_MACE = new ToolMace("obsidian_mace", TOOL_OBSIDIAN);






    //Armor
    public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_AMETHYST, 1, EntityEquipmentSlot.HEAD);
    public static final Item AMETHYST_CHEST = new ArmorBase("amethyst_chest", ARMOR_AMETHYST, 1, EntityEquipmentSlot.CHEST);
    public static final Item AMETHYST_LEGS = new ArmorBase("amethyst_legs", ARMOR_AMETHYST, 2, EntityEquipmentSlot.LEGS);
    public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_AMETHYST, 1, EntityEquipmentSlot.FEET);

    public static final Item MOISSANITE_HELMET = new ArmorBase("moissanite_helmet", ARMOR_MOISSANITE, 1, EntityEquipmentSlot.HEAD);
    public static final Item MOISSANITE_CHEST = new ArmorBase("moissanite_chest", ARMOR_MOISSANITE, 1, EntityEquipmentSlot.CHEST);
    public static final Item MOISSANITE_LEGS = new ArmorBase("moissanite_legs", ARMOR_MOISSANITE, 2, EntityEquipmentSlot.LEGS);
    public static final Item MOISSANITE_BOOTS = new ArmorBase("moissanite_boots", ARMOR_MOISSANITE, 1, EntityEquipmentSlot.FEET);

    public static final Item ONYX_HELMET = new ArmorBase("onyx_helmet", ARMOR_ONYX, 1, EntityEquipmentSlot.HEAD);
    public static final Item ONYX_CHEST = new ArmorBase("onyx_chest", ARMOR_ONYX, 1, EntityEquipmentSlot.CHEST);
    public static final Item ONYX_LEGS = new ArmorBase("onyx_legs", ARMOR_ONYX, 2, EntityEquipmentSlot.LEGS);
    public static final Item ONYX_BOOTS = new ArmorBase("onyx_boots", ARMOR_ONYX, 1, EntityEquipmentSlot.FEET);

    public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHEST = new ArmorBase("ruby_chest", ARMOR_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGS = new ArmorBase("ruby_legs", ARMOR_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_RUBY, 1, EntityEquipmentSlot.FEET);

    public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
    public static final Item SAPPHIRE_CHEST = new ArmorBase("sapphire_chest", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
    public static final Item SAPPHIRE_LEGS = new ArmorBase("sapphire_legs", ARMOR_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
    public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.FEET);

    public static final Item TOURMALINE_HELMET = new ArmorBase("tourmaline_helmet", ARMOR_TOURMALINE, 1, EntityEquipmentSlot.HEAD);
    public static final Item TOURMALINE_CHEST = new ArmorBase("tourmaline_chest", ARMOR_TOURMALINE, 1, EntityEquipmentSlot.CHEST);
    public static final Item TOURMALINE_LEGS = new ArmorBase("tourmaline_legs", ARMOR_TOURMALINE, 2, EntityEquipmentSlot.LEGS);
    public static final Item TOURMALINE_BOOTS = new ArmorBase("tourmaline_boots", ARMOR_TOURMALINE, 1, EntityEquipmentSlot.FEET);

    public static final Item GRAPHENE_HELMET = new ArmorBase("graphene_helmet", ARMOR_GRAPHENE, 1, EntityEquipmentSlot.HEAD);
    public static final Item GRAPHENE_CHEST = new ArmorBase("graphene_chest", ARMOR_GRAPHENE, 1, EntityEquipmentSlot.CHEST);
    public static final Item GRAPHENE_LEGS = new ArmorBase("graphene_legs", ARMOR_GRAPHENE, 2, EntityEquipmentSlot.LEGS);
    public static final Item GRAPHENE_BOOTS = new ArmorBase("graphene_boots", ARMOR_GRAPHENE, 1, EntityEquipmentSlot.FEET);

    public static final Item TANZANITE_HELMET = new ArmorBase("tanzanite_helmet", ARMOR_TANZANITE, 1, EntityEquipmentSlot.HEAD);
    public static final Item TANZANITE_CHEST = new ArmorBase("tanzanite_chest", ARMOR_TANZANITE, 1, EntityEquipmentSlot.CHEST);
    public static final Item TANZANITE_LEGS = new ArmorBase("tanzanite_legs", ARMOR_TANZANITE, 2, EntityEquipmentSlot.LEGS);
    public static final Item TANZANITE_BOOTS = new ArmorBase("tanzanite_boots", ARMOR_TANZANITE, 1, EntityEquipmentSlot.FEET);

    public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_TOPAZ, 1, EntityEquipmentSlot.HEAD);
    public static final Item TOPAZ_CHEST = new ArmorBase("topaz_chest", ARMOR_TOPAZ, 1, EntityEquipmentSlot.CHEST);
    public static final Item TOPAZ_LEGS = new ArmorBase("topaz_legs", ARMOR_TOPAZ, 2, EntityEquipmentSlot.LEGS);
    public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_TOPAZ, 1, EntityEquipmentSlot.FEET);

    public static final Item TURQUARTZ_HELMET = new ArmorBase("turquartz_helmet", ARMOR_TURQUARTZ, 1, EntityEquipmentSlot.HEAD);
    public static final Item TURQUARTZ_CHEST = new ArmorBase("turquartz_chest", ARMOR_TURQUARTZ, 1, EntityEquipmentSlot.CHEST);
    public static final Item TURQUARTZ_LEGS = new ArmorBase("turquartz_legs", ARMOR_TURQUARTZ, 2, EntityEquipmentSlot.LEGS);
    public static final Item TURQUARTZ_BOOTS = new ArmorBase("turquartz_boots", ARMOR_TURQUARTZ, 1, EntityEquipmentSlot.FEET);

    public static final Item COBALT_HELMET = new ArmorBase("cobalt_helmet", ARMOR_COBALT, 1, EntityEquipmentSlot.HEAD);
    public static final Item COBALT_CHEST = new ArmorBase("cobalt_chest", ARMOR_COBALT, 1, EntityEquipmentSlot.CHEST);
    public static final Item COBALT_LEGS = new ArmorBase("cobalt_legs", ARMOR_COBALT, 2, EntityEquipmentSlot.LEGS);
    public static final Item COBALT_BOOTS = new ArmorBase("cobalt_boots", ARMOR_COBALT, 1, EntityEquipmentSlot.FEET);

    public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
    public static final Item COPPER_CHEST = new ArmorBase("copper_chest", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
    public static final Item COPPER_LEGS = new ArmorBase("copper_legs", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
    public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);

    public static final Item SILVER_HELMET = new ArmorBase("silver_helmet", ARMOR_SILVER, 1, EntityEquipmentSlot.HEAD);
    public static final Item SILVER_CHEST = new ArmorBase("silver_chest", ARMOR_SILVER, 1, EntityEquipmentSlot.CHEST);
    public static final Item SILVER_LEGS = new ArmorBase("silver_legs", ARMOR_SILVER, 2, EntityEquipmentSlot.LEGS);
    public static final Item SILVER_BOOTS = new ArmorBase("silver_boots", ARMOR_SILVER, 1, EntityEquipmentSlot.FEET);

    public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_STEEL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STEEL_CHEST = new ArmorBase("steel_chest", ARMOR_STEEL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STEEL_LEGS = new ArmorBase("steel_legs", ARMOR_STEEL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_STEEL, 1, EntityEquipmentSlot.FEET);

    public static final Item TIN_HELMET = new ArmorBase("tin_helmet", ARMOR_TIN, 1, EntityEquipmentSlot.HEAD);
    public static final Item TIN_CHEST = new ArmorBase("tin_chest", ARMOR_TIN, 1, EntityEquipmentSlot.CHEST);
    public static final Item TIN_LEGS = new ArmorBase("tin_legs", ARMOR_TIN, 2, EntityEquipmentSlot.LEGS);
    public static final Item TIN_BOOTS = new ArmorBase("tin_boots", ARMOR_TIN, 1, EntityEquipmentSlot.FEET);

    public static final Item BRONZE_HELMET = new ArmorBase("bronze_helmet", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
    public static final Item BRONZE_CHEST = new ArmorBase("bronze_chest", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
    public static final Item BRONZE_LEGS = new ArmorBase("bronze_legs", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
    public static final Item BRONZE_BOOTS = new ArmorBase("bronze_boots", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);

    public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_EMERALD, 1, EntityEquipmentSlot.HEAD);
    public static final Item EMERALD_CHEST = new ArmorBase("emerald_chest", ARMOR_EMERALD, 1, EntityEquipmentSlot.CHEST);
    public static final Item EMERALD_LEGS = new ArmorBase("emerald_legs", ARMOR_EMERALD, 2, EntityEquipmentSlot.LEGS);
    public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_EMERALD, 1, EntityEquipmentSlot.FEET);

    public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item OBSIDIAN_CHEST = new ArmorBase("obsidian_chest", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item OBSIDIAN_LEGS = new ArmorBase("obsidian_legs", ARMOR_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_OBSIDIAN, 1, EntityEquipmentSlot.FEET);

}
