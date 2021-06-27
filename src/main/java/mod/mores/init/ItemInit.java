package mod.mores.init;

import mod.mores.Mores;
import mod.mores.materials.ArmorMaterial;
import mod.mores.materials.ToolMaterial;
import mod.mores.objects.ItemTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class to initialise all items from mores
 */
public class ItemInit{
    /**
     * Register all mores items
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mores.MOD_ID);



    //Item Registry
    public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TOPAZ_GEM = ITEMS.register("topaz_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TOURMALINE_GEM = ITEMS.register("tourmaline_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> MOISSANITE_GEM = ITEMS.register("moissanite_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ONYX_GEM = ITEMS.register("onyx_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> GRAPHENE_GEM = ITEMS.register("graphene_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));


    /**
     * All horse armor
     * p_i50042_1_: Armor protection
     */
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new HorseArmorItem(3, "copper", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem(2, "copper", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SILVER_HORSE_ARMOR = ITEMS.register("silver_horse_armor", () -> new HorseArmorItem(5, "silver", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_HORSE_ARMOR = ITEMS.register("cobalt_horse_armor", () -> new HorseArmorItem(6, "cobalt", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem(4, "bronze", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor", () -> new HorseArmorItem(8, "steel", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new HorseArmorItem(7, "amethyst", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new HorseArmorItem(9, "topaz", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_HORSE_ARMOR = ITEMS.register("tourmaline_horse_armor", () -> new HorseArmorItem(10, "tourmaline", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new HorseArmorItem(12, "ruby", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new HorseArmorItem(11, "sapphire", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> MOISSANITE_HORSE_ARMOR = ITEMS.register("moissanite_horse_armor", () -> new HorseArmorItem(13, "moissanite", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_HORSE_ARMOR = ITEMS.register("onyx_horse_armor", () -> new HorseArmorItem(14, "onyx", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> GRAPHENE_HORSE_ARMOR = ITEMS.register("graphene_horse_armor", () -> new HorseArmorItem(16, "graphene", (new Item.Properties()).stacksTo(1).tab(ItemGroup.TAB_MISC)));


    /**
     * All armor
     */
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> TOURMALINE_HELMET = ITEMS.register("tourmaline_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOURMALINE_CHESTPLATE = ITEMS.register("tourmaline_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOURMALINE_LEGGINGS = ITEMS.register("tourmaline_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> TOURMALINE_BOOTS = ITEMS.register("tourmaline_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> MOISSANITE_HELMET = ITEMS.register("moissanite_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MOISSANITE_CHESTPLATE = ITEMS.register("moissanite_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MOISSANITE_LEGGINGS = ITEMS.register("moissanite_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> MOISSANITE_BOOTS = ITEMS.register("moissanite_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> ONYX_HELMET = ITEMS.register("onyx_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ONYX_CHESTPLATE = ITEMS.register("onyx_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ONYX_LEGGINGS = ITEMS.register("onyx_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> ONYX_BOOTS = ITEMS.register("onyx_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> GRAPHENE_HELMET = ITEMS.register("graphene_helmet", () -> new ArmorItem(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAPHENE_CHESTPLATE = ITEMS.register("graphene_chestplate", () -> new ArmorItem(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAPHENE_LEGGINGS = ITEMS.register("graphene_leggings", () -> new ArmorItem(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> GRAPHENE_BOOTS = ITEMS.register("graphene_boots", () -> new ArmorItem(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ItemGroup.TAB_COMBAT)));


    /**
     * All swords
     * p_i48460_2_: Attack Damage (1 = 1 Attack Point)
     * p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
     */
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword", () -> new SwordItem(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MOISSANITE_SWORD = ITEMS.register("moissanite_sword", () -> new SwordItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword", () -> new SwordItem(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> GRAPHENE_SWORD = ITEMS.register("graphene_sword", () -> new SwordItem(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    /**
     * All battleaxes
     * p_i48460_2_: Attack Damage (1 = 1 Attack Point)
     * p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
     */
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_BATTLEAXE = ITEMS.register("wood_battleaxe", () -> new SwordItem(ItemTier.WOOD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STONE_BATTLEAXE = ITEMS.register("stone_battleaxe", () -> new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battleaxe", () -> new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> GOLD_BATTLEAXE = ITEMS.register("gold_battleaxe", () -> new SwordItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_BATTLEAXE = ITEMS.register("diamond_battleaxe", () -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TIN_BATTLEAXE = ITEMS.register("tin_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COPPER_BATTLEAXE = ITEMS.register("copper_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_BATTLEAXE = ITEMS.register("silver_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_BATTLEAXE = ITEMS.register("bronze_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> OBSIDIAN_BATTLEAXE = ITEMS.register("obsidian_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_BATTLEAXE = ITEMS.register("cobalt_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_BATTLEAXE = ITEMS.register("steel_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> AMETHYST_BATTLEAXE = ITEMS.register("amethyst_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_BATTLEAXE = ITEMS.register("emerald_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_BATTLEAXE = ITEMS.register("topaz_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_BATTLEAXE = ITEMS.register("tourmaline_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_BATTLEAXE = ITEMS.register("ruby_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_BATTLEAXE = ITEMS.register("sapphire_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MOISSANITE_BATTLEAXE = ITEMS.register("moissanite_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_BATTLEAXE = ITEMS.register("onyx_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> GRAPHENE_BATTLEAXE = ITEMS.register("graphene_battleaxe", () -> new SwordItem(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));


    /**
     * All maces
     * p_i48460_2_: Attack Damage (1 = 1 Attack Point)
     * p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
     */
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_MACE = ITEMS.register("wood_mace", () -> new SwordItem(ItemTier.WOOD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STONE_MACE = ITEMS.register("stone_mace", () -> new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> GOLD_MACE = ITEMS.register("gold_mace", () -> new SwordItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TIN_MACE = ITEMS.register("tin_mace", () -> new SwordItem(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COPPER_MACE = ITEMS.register("copper_mace", () -> new SwordItem(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_MACE = ITEMS.register("silver_mace", () -> new SwordItem(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_MACE = ITEMS.register("bronze_mace", () -> new SwordItem(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> OBSIDIAN_MACE = ITEMS.register("obsidian_mace", () -> new SwordItem(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_MACE = ITEMS.register("cobalt_mace", () -> new SwordItem(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_MACE = ITEMS.register("steel_mace", () -> new SwordItem(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> AMETHYST_MACE = ITEMS.register("amethyst_mace", () -> new SwordItem(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_MACE = ITEMS.register("emerald_mace", () -> new SwordItem(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_MACE = ITEMS.register("topaz_mace", () -> new SwordItem(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_MACE = ITEMS.register("tourmaline_mace", () -> new SwordItem(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_MACE = ITEMS.register("ruby_mace", () -> new SwordItem(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_MACE = ITEMS.register("sapphire_mace", () -> new SwordItem(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MOISSANITE_MACE = ITEMS.register("moissanite_mace", () -> new SwordItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_MACE = ITEMS.register("onyx_mace", () -> new SwordItem(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> GRAPHENE_MACE = ITEMS.register("graphene_mace", () -> new SwordItem(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));


    /**
     * All daggers
     * p_i48460_2_: Attack Damage (1 = 1 Attack Point)
     * p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
     */
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wood_dagger", () -> new SwordItem(ItemTier.WOOD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger", () -> new SwordItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TIN_DAGGER = ITEMS.register("tin_dagger", () -> new SwordItem(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger", () -> new SwordItem(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_DAGGER = ITEMS.register("silver_dagger", () -> new SwordItem(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_DAGGER = ITEMS.register("bronze_dagger", () -> new SwordItem(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger", () -> new SwordItem(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_DAGGER = ITEMS.register("cobalt_dagger", () -> new SwordItem(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register("steel_dagger", () -> new SwordItem(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> AMETHYST_DAGGER = ITEMS.register("amethyst_dagger", () -> new SwordItem(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger", () -> new SwordItem(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_DAGGER = ITEMS.register("topaz_dagger", () -> new SwordItem(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_DAGGER = ITEMS.register("tourmaline_dagger", () -> new SwordItem(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_DAGGER = ITEMS.register("ruby_dagger", () -> new SwordItem(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_DAGGER = ITEMS.register("sapphire_dagger", () -> new SwordItem(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MOISSANITE_DAGGER = ITEMS.register("moissanite_dagger", () -> new SwordItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_DAGGER = ITEMS.register("onyx_dagger", () -> new SwordItem(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> GRAPHENE_DAGGER = ITEMS.register("graphene_dagger", () -> new SwordItem(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));


    /**
     * All pickaxes
     */
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_TIN, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_COPPER, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_SILVER, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_BRONZE, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_OBSIDIAN, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_COBALT, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_STEEL, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_AMETHYST, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_EMERALD, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_TOPAZ, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_TOURMALINE, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_RUBY, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_SAPPHIRE, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> MOISSANITE_PICKAXE = ITEMS.register("moissanite_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_ONYX, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> GRAPHENE_PICKAXE = ITEMS.register("graphene_pickaxe", () -> new PickaxeItem(ToolMaterial.TOOL_GRAPHENE, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));


    /**
     * All axes
     */
    //TODO Checkout items for proper atk dmg and speed values
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(ToolMaterial.TOOL_TIN, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ToolMaterial.TOOL_COPPER, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ToolMaterial.TOOL_SILVER, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ToolMaterial.TOOL_BRONZE, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ToolMaterial.TOOL_OBSIDIAN, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(ToolMaterial.TOOL_COBALT, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ToolMaterial.TOOL_STEEL, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ToolMaterial.TOOL_AMETHYST, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ToolMaterial.TOOL_EMERALD, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ToolMaterial.TOOL_TOPAZ, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> TOURMALINE_AXE = ITEMS.register("tourmaline_axe", () -> new AxeItem(ToolMaterial.TOOL_TOURMALINE, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ToolMaterial.TOOL_RUBY, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ToolMaterial.TOOL_SAPPHIRE, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> MOISSANITE_AXE = ITEMS.register("moissanite_axe", () -> new AxeItem(ToolMaterial.TOOL_MOISSANITE, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> ONYX_AXE = ITEMS.register("onyx_axe", () -> new AxeItem(ToolMaterial.TOOL_ONYX, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> GRAPHENE_AXE = ITEMS.register("graphene_axe", () -> new AxeItem(ToolMaterial.TOOL_GRAPHENE, 6.0F, -3.2F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));


    /**
     * All shovels
     */
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(ToolMaterial.TOOL_TIN, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ToolMaterial.TOOL_TIN, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ToolMaterial.TOOL_SILVER, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ToolMaterial.TOOL_BRONZE, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ToolMaterial.TOOL_OBSIDIAN, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(ToolMaterial.TOOL_COBALT, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ToolMaterial.TOOL_STEEL, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ToolMaterial.TOOL_AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ToolMaterial.TOOL_EMERALD, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ToolMaterial.TOOL_TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel", () -> new ShovelItem(ToolMaterial.TOOL_TOURMALINE, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ToolMaterial.TOOL_RUBY, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ToolMaterial.TOOL_SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> MOISSANITE_SHOVEL = ITEMS.register("moissanite_shovel", () -> new ShovelItem(ToolMaterial.TOOL_MOISSANITE, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> ONYX_SHOVEL = ITEMS.register("onyx_shovel", () -> new ShovelItem(ToolMaterial.TOOL_ONYX, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> GRAPHENE_SHOVEL = ITEMS.register("graphene_shovel", () -> new ShovelItem(ToolMaterial.TOOL_GRAPHENE, 1.5F, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));


    /**
     * All hoes
     */
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(ToolMaterial.TOOL_TIN, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ToolMaterial.TOOL_COPPER, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ToolMaterial.TOOL_SILVER, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ToolMaterial.TOOL_BRONZE, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ToolMaterial.TOOL_OBSIDIAN, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(ToolMaterial.TOOL_COBALT, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ToolMaterial.TOOL_STEEL, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ToolMaterial.TOOL_AMETHYST, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ToolMaterial.TOOL_EMERALD, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ToolMaterial.TOOL_TOPAZ, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe", () -> new HoeItem(ToolMaterial.TOOL_TOURMALINE, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ToolMaterial.TOOL_RUBY, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ToolMaterial.TOOL_SAPPHIRE, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> MOISSANITE_HOE = ITEMS.register("moissanite_hoe", () -> new HoeItem(ToolMaterial.TOOL_MOISSANITE, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> ONYX_HOE = ITEMS.register("onyx_hoe", () -> new HoeItem(ToolMaterial.TOOL_ONYX, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> GRAPHENE_HOE = ITEMS.register("graphene_hoe", () -> new HoeItem(ToolMaterial.TOOL_GRAPHENE, 0, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));



    //Block Registry

    /**
     * Tin blocks
     */
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(BlockInit.RAW_TIN_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockInit.TIN_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    /**
     * Copper blocks
     */
    public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RAW_COPPER_BLOCK = ITEMS.register("raw_copper_block", () -> new BlockItem(BlockInit.RAW_COPPER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockInit.DEEPSLATE_COPPER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    /**
     * Silver blocks
     */
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockInit.SILVER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(BlockInit.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockInit.DEEPSLATE_SILVER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> NETHER_SILVER_ORE = ITEMS.register("nether_silver_ore", () -> new BlockItem(BlockInit.NETHER_SILVER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    /**
     * Cobalt blocks
     */
    public static final RegistryObject<BlockItem> COBALT_ORE = ITEMS.register("cobalt_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RAW_COBALT_BLOCK = ITEMS.register("raw_cobalt_block", () -> new BlockItem(BlockInit.RAW_COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COBALT_ORE = ITEMS.register("deepslate_cobalt_ore", () -> new BlockItem(BlockInit.DEEPSLATE_COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));


    /**
     * Other blocks
     */
    public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore", () -> new BlockItem(BlockInit.TOPAZ_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(BlockInit.TOPAZ_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOPAZ_ORE = ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore", () -> new BlockItem(BlockInit.TOURMALINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TOURMALINE_BLOCK = ITEMS.register("tourmaline_block", () -> new BlockItem(BlockInit.TOURMALINE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOURMALINE_ORE = ITEMS.register("deepslate_tourmaline_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TOURMALINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE = ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(BlockInit.DEEPSLATE_RUBY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(BlockInit.SAPPHIRE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SAPPHIRE_ORE = ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

//    public static final RegistryObject<BlockItem> MOISSANITE_ORE = ITEMS.register("moissanite_ore", () -> new BlockItem(BlockInit.MOISSANITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> MOISSANITE_BLOCK = ITEMS.register("moissanite_block", () -> new BlockItem(BlockInit.MOISSANITE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> MOISSANITE_NETHER_ORE = ITEMS.register("moissanite_nether_ore", () -> new BlockItem(BlockInit.MOISSANITE_NETHER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MOISSANITE_ORE = ITEMS.register("deepslate_moissanite_ore", () -> new BlockItem(BlockInit.DEEPSLATE_MOISSANITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(BlockInit.ONYX_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(BlockInit.ONYX_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> GRAPHENE_BLOCK = ITEMS.register("graphene_block", () -> new BlockItem(BlockInit.GRAPHENE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}
