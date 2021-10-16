package mod.mores.init;

import mod.mores.Mores;
import mod.mores.config.Config;
import mod.mores.material.ArmorMaterial;
import mod.mores.material.ToolMaterial;
import mod.mores.objects.*;
import mod.mores.tabs.MoresTabs;
import mod.mores.util.MoresTags;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class that initialise all items from mOres
 */
public class ItemInit{
    /**
     * Registers all mores items
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mores.MODID);

    /**
     * Fills the registry with items
     */
    //Item Registry
    public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> STERLING_INGOT = ITEMS.register("sterling_ingot", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TOPAZ_GEM = ITEMS.register("topaz_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TOURMALINE_GEM = ITEMS.register("tourmaline_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TANZANITE_GEM = ITEMS.register("tanzanite_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TURQUOISE_GEM = ITEMS.register("turquoise_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> MOISSANITE_GEM = ITEMS.register("moissanite_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> ONYX_GEM = ITEMS.register("onyx_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> GRAPHENE_GEM = ITEMS.register("graphene_gem", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> CHAIN = ITEMS.register("chain", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> SILVER_APPLE = ITEMS.register("silver_apple", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_FOODS).food(new Food.Builder().nutrition(4).saturationMod(0.6F).effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 200, 0), 1.0F).effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 200, 0), 1.0F).alwaysEat().build())));
    public static final RegistryObject<Item> BRONZE_APPLE = ITEMS.register("bronze_apple", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_FOODS).food(new Food.Builder().nutrition(4).saturationMod(0.3F).effect(() -> new EffectInstance(Effects.DIG_SPEED, 200, 0), 1.0F).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 200, 0), 1.0F).alwaysEat().build())));

    public static final RegistryObject<Item> DUCK = ITEMS.register("duck", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_FOODS).food(new Food.Builder().nutrition(2).saturationMod(0.3F).effect(() -> new EffectInstance(Effects.HUNGER, 600, 0), 0.3F).meat().build())));
    public static final RegistryObject<Item> COOKED_DUCK = ITEMS.register("cooked_duck", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_FOODS).food(new Food.Builder().nutrition(6).saturationMod(0.6F).meat().build())));

    public static final RegistryObject<Item> ROOIEKOOL = ITEMS.register("rooiekool", () -> new Item(new Item.Properties().tab(MoresTabs.MORES_FOODS).food(new Food.Builder().nutrition(4).saturationMod(0.6F).effect(new EffectInstance(Effects.DIG_SLOWDOWN, 200, 0), 1.0F).effect(new EffectInstance(Effects.CONFUSION, 100, 0), 1.0F).alwaysEat().build())));

    public static final RegistryObject<SpawnEggItem> DUCK_SPAWN_EGG  = ITEMS.register("duck_spawn_egg", () -> new ItemSpawnEgg(EntityTypeInit.DUCK, 0x006808, 0xFFD400, new Item.Properties().tab(MoresTabs.MORES_ENTITIES)));

    //All horse armor
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new HorseArmorItem(3, "copper", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem(2, "tin", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> SILVER_HORSE_ARMOR = ITEMS.register("silver_horse_armor", () -> new HorseArmorItem(5, "silver", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> COBALT_HORSE_ARMOR = ITEMS.register("cobalt_horse_armor", () -> new HorseArmorItem(6, "cobalt", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem(4, "bronze", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor", () -> new HorseArmorItem(8, "steel", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> STERLING_HORSE_ARMOR = ITEMS.register("sterling_horse_armor", () -> new HorseArmorItem(7, "sterling", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new HorseArmorItem(7, "amethyst", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_HORSE_ARMOR = ITEMS.register("obsidian_horse_armor", () -> new HorseArmorItem(9, "obsidian", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new HorseArmorItem(8, "emerald", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new HorseArmorItem(9, "topaz", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_HORSE_ARMOR = ITEMS.register("tourmaline_horse_armor", () -> new HorseArmorItem(10, "tourmaline", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_HORSE_ARMOR = ITEMS.register("tanzanite_horse_armor", () -> new HorseArmorItem(10, "tanzanite", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new HorseArmorItem(12, "ruby", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new HorseArmorItem(11, "sapphire", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_HORSE_ARMOR = ITEMS.register("turquoise_horse_armor", () -> new HorseArmorItem(12, "turquoise", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_HORSE_ARMOR = ITEMS.register("moissanite_horse_armor", () -> new HorseArmorItem(13, "moissanite", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> ONYX_HORSE_ARMOR = ITEMS.register("onyx_horse_armor", () -> new HorseArmorItem(14, "onyx", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_HORSE_ARMOR = ITEMS.register("graphene_horse_armor", () -> new HorseArmorItem(16, "graphene", (new Item.Properties()).stacksTo(1).tab(MoresTabs.MORES_HORSE_ARMOR)));


    //All armor
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_TIN, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_COPPER, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_SILVER, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_BRONZE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> STERLING_HELMET = ITEMS.register("sterling_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_STERLING, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_CHESTPLATE = ITEMS.register("sterling_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_STERLING, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_LEGGINGS = ITEMS.register("sterling_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_STERLING, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_BOOTS = ITEMS.register("sterling_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_STERLING, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_COBALT, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_STEEL, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_AMETHYST, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_EMERALD, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_TOPAZ, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TOURMALINE_HELMET = ITEMS.register("tourmaline_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_CHESTPLATE = ITEMS.register("tourmaline_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_LEGGINGS = ITEMS.register("tourmaline_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_BOOTS = ITEMS.register("tourmaline_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_TOURMALINE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TANZANITE_HELMET = ITEMS.register("tanzanite_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_TANZANITE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_CHESTPLATE = ITEMS.register("tanzanite_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_TANZANITE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_LEGGINGS = ITEMS.register("tanzanite_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_TANZANITE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_BOOTS = ITEMS.register("tanzanite_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_TANZANITE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_RUBY, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_SAPPHIRE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TURQUOISE_HELMET = ITEMS.register("turquoise_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_TURQUOISE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_CHESTPLATE = ITEMS.register("turquoise_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_TURQUOISE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_LEGGINGS = ITEMS.register("turquoise_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_TURQUOISE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_BOOTS = ITEMS.register("turquoise_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_TURQUOISE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> MOISSANITE_HELMET = ITEMS.register("moissanite_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_CHESTPLATE = ITEMS.register("moissanite_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_LEGGINGS = ITEMS.register("moissanite_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_BOOTS = ITEMS.register("moissanite_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_MOISSANITE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> ONYX_HELMET = ITEMS.register("onyx_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_CHESTPLATE = ITEMS.register("onyx_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_LEGGINGS = ITEMS.register("onyx_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_BOOTS = ITEMS.register("onyx_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_ONYX, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> GRAPHENE_HELMET = ITEMS.register("graphene_helmet", () -> new ItemArmor(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_CHESTPLATE = ITEMS.register("graphene_chestplate", () -> new ItemArmor(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_LEGGINGS = ITEMS.register("graphene_leggings", () -> new ItemArmor(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_BOOTS = ITEMS.register("graphene_boots", () -> new ItemArmor(ArmorMaterial.ARMOR_GRAPHENE, EquipmentSlotType.FEET, (new Item.Properties()).tab(MoresTabs.MORES_ARMOR)));


    //All swords
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new ItemSword(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new ItemSword(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new ItemSword(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new ItemSword(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new ItemSword(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new ItemSword(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new ItemSword(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_SWORD = ITEMS.register("sterling_sword", () -> new ItemSword(ToolMaterial.TOOL_STERLING, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new ItemSword(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new ItemSword(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new ItemSword(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword", () -> new ItemSword(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_SWORD = ITEMS.register("tanzanite_sword", () -> new ItemSword(ToolMaterial.TOOL_TANZANITE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new ItemSword(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new ItemSword(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_SWORD = ITEMS.register("turquoise_sword", () -> new ItemSword(ToolMaterial.TOOL_TURQUOISE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_SWORD = ITEMS.register("moissanite_sword", () -> new ItemSword(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword", () -> new ItemSword(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_SWORD = ITEMS.register("graphene_sword", () -> new ItemSword(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    //All battleaxes
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_BATTLEAXE = ITEMS.register("wood_battleaxe", () -> new ItemSword(ItemTier.WOOD, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_BATTLEAXE = ITEMS.register("stone_battleaxe", () -> new ItemSword(ItemTier.STONE, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battleaxe", () -> new ItemSword(ItemTier.IRON, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_BATTLEAXE = ITEMS.register("gold_battleaxe", () -> new ItemSword(ItemTier.GOLD, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_BATTLEAXE = ITEMS.register("diamond_battleaxe", () -> new ItemSword(ItemTier.DIAMOND, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_BATTLEAXE = ITEMS.register("tin_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_TIN, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_BATTLEAXE = ITEMS.register("copper_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_COPPER, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_BATTLEAXE = ITEMS.register("silver_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_SILVER, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_BATTLEAXE = ITEMS.register("bronze_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_BRONZE, 5, -2.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_BATTLEAXE = ITEMS.register("obsidian_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_OBSIDIAN, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_BATTLEAXE = ITEMS.register("cobalt_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_COBALT, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_BATTLEAXE = ITEMS.register("steel_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_STEEL, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_BATTLEAXE = ITEMS.register("sterling_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_STERLING, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_BATTLEAXE = ITEMS.register("amethyst_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_AMETHYST, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_BATTLEAXE = ITEMS.register("emerald_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_EMERALD, 5, -2.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_BATTLEAXE = ITEMS.register("topaz_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_TOPAZ, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_BATTLEAXE = ITEMS.register("tourmaline_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_TOURMALINE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_BATTLEAXE = ITEMS.register("tanzanite_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_TANZANITE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_BATTLEAXE = ITEMS.register("ruby_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_RUBY, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_BATTLEAXE = ITEMS.register("sapphire_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_SAPPHIRE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_BATTLEAXE = ITEMS.register("turquoise_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_TURQUOISE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_BATTLEAXE = ITEMS.register("moissanite_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_MOISSANITE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_BATTLEAXE = ITEMS.register("onyx_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_ONYX, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_BATTLEAXE = ITEMS.register("graphene_battleaxe", () -> new ItemSword(ToolMaterial.TOOL_GRAPHENE, 5, -2.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));


    //All maces
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_MACE = ITEMS.register("wood_mace", () -> new ItemSword(ItemTier.WOOD, 2, -2.0F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_MACE = ITEMS.register("stone_mace", () -> new ItemSword(ItemTier.STONE, 2, -2.0F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new ItemSword(ItemTier.IRON, 2, -2.1F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_MACE = ITEMS.register("gold_mace", () -> new ItemSword(ItemTier.GOLD, 2, -2.1F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new ItemSword(ItemTier.DIAMOND, 2, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_MACE = ITEMS.register("tin_mace", () -> new ItemSword(ToolMaterial.TOOL_TIN, 2, -2.0F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_MACE = ITEMS.register("copper_mace", () -> new ItemSword(ToolMaterial.TOOL_COPPER, 2, -2.0F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_MACE = ITEMS.register("silver_mace", () -> new ItemSword(ToolMaterial.TOOL_SILVER, 2, -2.1F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_MACE = ITEMS.register("bronze_mace", () -> new ItemSword(ToolMaterial.TOOL_BRONZE, 2, -2.1F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_MACE = ITEMS.register("obsidian_mace", () -> new ItemSword(ToolMaterial.TOOL_OBSIDIAN, 2, -2.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_MACE = ITEMS.register("cobalt_mace", () -> new ItemSword(ToolMaterial.TOOL_COBALT, 2, -2.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_MACE = ITEMS.register("steel_mace", () -> new ItemSword(ToolMaterial.TOOL_STEEL, 2, -2.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_MACE = ITEMS.register("sterling_mace", () -> new ItemSword(ToolMaterial.TOOL_STERLING, 2, -2.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_MACE = ITEMS.register("amethyst_mace", () -> new ItemSword(ToolMaterial.TOOL_AMETHYST, 2, -2.3F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_MACE = ITEMS.register("emerald_mace", () -> new ItemSword(ToolMaterial.TOOL_EMERALD, 2, -2.3F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_MACE = ITEMS.register("topaz_mace", () -> new ItemSword(ToolMaterial.TOOL_TOPAZ, 2, -2.3F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_MACE = ITEMS.register("tourmaline_mace", () -> new ItemSword(ToolMaterial.TOOL_TOURMALINE, 2, -2.3F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_MACE = ITEMS.register("tanzanite_mace", () -> new ItemSword(ToolMaterial.TOOL_TANZANITE, 2, -2.3F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_MACE = ITEMS.register("ruby_mace", () -> new ItemSword(ToolMaterial.TOOL_RUBY, 2, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_MACE = ITEMS.register("sapphire_mace", () -> new ItemSword(ToolMaterial.TOOL_SAPPHIRE, 2, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_MACE = ITEMS.register("turquoise_mace", () -> new ItemSword(ToolMaterial.TOOL_TURQUOISE, 2, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_MACE = ITEMS.register("moissanite_mace", () -> new ItemSword(ToolMaterial.TOOL_MOISSANITE, 2, -2.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_MACE = ITEMS.register("onyx_mace", () -> new ItemSword(ToolMaterial.TOOL_ONYX, 2, -2.5F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_MACE = ITEMS.register("graphene_mace", () -> new ItemSword(ToolMaterial.TOOL_GRAPHENE, 2, -2.5F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));


    //All daggers
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wood_dagger", () -> new ItemSword(ItemTier.WOOD, 1, -1.0F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new ItemSword(ItemTier.STONE, 1, -1.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new ItemSword(ItemTier.IRON, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger", () -> new ItemSword(ItemTier.GOLD, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new ItemSword(ItemTier.DIAMOND, 1, -1.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_DAGGER = ITEMS.register("tin_dagger", () -> new ItemSword(ToolMaterial.TOOL_TIN, 1, -1.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger", () -> new ItemSword(ToolMaterial.TOOL_COPPER, 1, -1.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_DAGGER = ITEMS.register("silver_dagger", () -> new ItemSword(ToolMaterial.TOOL_SILVER, 1, -1.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_DAGGER = ITEMS.register("bronze_dagger", () -> new ItemSword(ToolMaterial.TOOL_BRONZE, 1, -1.2F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger", () -> new ItemSword(ToolMaterial.TOOL_OBSIDIAN, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_DAGGER = ITEMS.register("cobalt_dagger", () -> new ItemSword(ToolMaterial.TOOL_COBALT, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register("steel_dagger", () -> new ItemSword(ToolMaterial.TOOL_STEEL, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_DAGGER = ITEMS.register("sterling_dagger", () -> new ItemSword(ToolMaterial.TOOL_STERLING, 1, -1.4F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_DAGGER = ITEMS.register("amethyst_dagger", () -> new ItemSword(ToolMaterial.TOOL_AMETHYST, 1, -1.5F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger", () -> new ItemSword(ToolMaterial.TOOL_EMERALD, 1, -1.5F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_DAGGER = ITEMS.register("topaz_dagger", () -> new ItemSword(ToolMaterial.TOOL_TOPAZ, 1, -1.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_DAGGER = ITEMS.register("tourmaline_dagger", () -> new ItemSword(ToolMaterial.TOOL_TOURMALINE, 1, -1.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_DAGGER = ITEMS.register("tanzanite_dagger", () -> new ItemSword(ToolMaterial.TOOL_TANZANITE, 1, -1.6F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_DAGGER = ITEMS.register("ruby_dagger", () -> new ItemSword(ToolMaterial.TOOL_RUBY, 1, -1.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_DAGGER = ITEMS.register("sapphire_dagger", () -> new ItemSword(ToolMaterial.TOOL_SAPPHIRE, 1, -1.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_DAGGER = ITEMS.register("turquoise_dagger", () -> new ItemSword(ToolMaterial.TOOL_TURQUOISE, 1, -1.7F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_DAGGER = ITEMS.register("moissanite_dagger", () -> new ItemSword(ToolMaterial.TOOL_MOISSANITE, 1, -1.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_DAGGER = ITEMS.register("onyx_dagger", () -> new ItemSword(ToolMaterial.TOOL_ONYX, 1, -1.8F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_DAGGER = ITEMS.register("graphene_dagger", () -> new ItemSword(ToolMaterial.TOOL_GRAPHENE, 1, -1.9F, new Item.Properties().tab(MoresTabs.MORES_WEAPONS)));


    // All pickaxes
    public static final RegistryObject<ItemPickaxe> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_TIN, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_COPPER, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_SILVER, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_BRONZE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_OBSIDIAN, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_COBALT, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_STEEL, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> STERLING_PICKAXE = ITEMS.register("sterling_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_STERLING, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_AMETHYST, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_EMERALD, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_TOPAZ, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_TOURMALINE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> TANZANITE_PICKAXE = ITEMS.register("tanzanite_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_TANZANITE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_RUBY, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_SAPPHIRE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> TURQUOISE_PICKAXE = ITEMS.register("turquoise_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_TURQUOISE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> MOISSANITE_PICKAXE = ITEMS.register("moissanite_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_MOISSANITE, 3, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemPickaxe> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_ONYX, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemPickaxe> GRAPHENE_PICKAXE = ITEMS.register("graphene_pickaxe", () -> new ItemPickaxe(ToolMaterial.TOOL_GRAPHENE, 1, -2.8F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));


    //All axes
    //TODO Checkout items for proper atk dmg and speed values
    public static final RegistryObject<ItemAxe> TIN_AXE = ITEMS.register("tin_axe", () -> new ItemAxe(ToolMaterial.TOOL_TIN, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> COPPER_AXE = ITEMS.register("copper_axe", () -> new ItemAxe(ToolMaterial.TOOL_COPPER, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> SILVER_AXE = ITEMS.register("silver_axe", () -> new ItemAxe(ToolMaterial.TOOL_SILVER, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new ItemAxe(ToolMaterial.TOOL_BRONZE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new ItemAxe(ToolMaterial.TOOL_OBSIDIAN, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new ItemAxe(ToolMaterial.TOOL_COBALT, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> STEEL_AXE = ITEMS.register("steel_axe", () -> new ItemAxe(ToolMaterial.TOOL_STEEL, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> STERLING_AXE = ITEMS.register("sterling_axe", () -> new ItemAxe(ToolMaterial.TOOL_STERLING, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new ItemAxe(ToolMaterial.TOOL_AMETHYST, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ItemAxe(ToolMaterial.TOOL_EMERALD, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new ItemAxe(ToolMaterial.TOOL_TOPAZ, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> TOURMALINE_AXE = ITEMS.register("tourmaline_axe", () -> new ItemAxe(ToolMaterial.TOOL_TOURMALINE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> TANZANITE_AXE = ITEMS.register("tanzanite_axe", () -> new ItemAxe(ToolMaterial.TOOL_TANZANITE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ItemAxe(ToolMaterial.TOOL_RUBY, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new ItemAxe(ToolMaterial.TOOL_SAPPHIRE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> TURQUOISE_AXE = ITEMS.register("turquoise_axe", () -> new ItemAxe(ToolMaterial.TOOL_TURQUOISE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> MOISSANITE_AXE = ITEMS.register("moissanite_axe", () -> new ItemAxe(ToolMaterial.TOOL_MOISSANITE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemAxe> ONYX_AXE = ITEMS.register("onyx_axe", () -> new ItemAxe(ToolMaterial.TOOL_ONYX, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemAxe> GRAPHENE_AXE = ITEMS.register("graphene_axe", () -> new ItemAxe(ToolMaterial.TOOL_GRAPHENE, 6.0F, -3.2F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));


    //All shovels
    public static final RegistryObject<ItemShovel> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TIN, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TIN, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ItemShovel(ToolMaterial.TOOL_SILVER, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ItemShovel(ToolMaterial.TOOL_BRONZE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ItemShovel(ToolMaterial.TOOL_OBSIDIAN, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ItemShovel(ToolMaterial.TOOL_COBALT, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ItemShovel(ToolMaterial.TOOL_STEEL, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> STERLING_SHOVEL = ITEMS.register("sterling_shovel", () -> new ItemShovel(ToolMaterial.TOOL_STERLING, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ItemShovel(ToolMaterial.TOOL_AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ItemShovel(ToolMaterial.TOOL_EMERALD, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TOURMALINE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> TANZANITE_SHOVEL = ITEMS.register("tanzanite_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TANZANITE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ItemShovel(ToolMaterial.TOOL_RUBY, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ItemShovel(ToolMaterial.TOOL_SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> TURQUOISE_SHOVEL = ITEMS.register("turquoise_shovel", () -> new ItemShovel(ToolMaterial.TOOL_TURQUOISE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> MOISSANITE_SHOVEL = ITEMS.register("moissanite_shovel", () -> new ItemShovel(ToolMaterial.TOOL_MOISSANITE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemShovel> ONYX_SHOVEL = ITEMS.register("onyx_shovel", () -> new ItemShovel(ToolMaterial.TOOL_ONYX, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemShovel> GRAPHENE_SHOVEL = ITEMS.register("graphene_shovel", () -> new ItemShovel(ToolMaterial.TOOL_GRAPHENE, 1.5F, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));


    //All hoes
    public static final RegistryObject<ItemHoe> TIN_HOE = ITEMS.register("tin_hoe", () -> new ItemHoe(ToolMaterial.TOOL_TIN, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> COPPER_HOE = ITEMS.register("copper_hoe", () -> new ItemHoe(ToolMaterial.TOOL_COPPER, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> SILVER_HOE = ITEMS.register("silver_hoe", () -> new ItemHoe(ToolMaterial.TOOL_SILVER, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new ItemHoe(ToolMaterial.TOOL_BRONZE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new ItemHoe(ToolMaterial.TOOL_OBSIDIAN, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new ItemHoe(ToolMaterial.TOOL_COBALT, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> STEEL_HOE = ITEMS.register("steel_hoe", () -> new ItemHoe(ToolMaterial.TOOL_STEEL, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> STERLING_HOE = ITEMS.register("sterling_hoe", () -> new ItemHoe(ToolMaterial.TOOL_STERLING, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new ItemHoe(ToolMaterial.TOOL_AMETHYST, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ItemHoe(ToolMaterial.TOOL_EMERALD, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new ItemHoe(ToolMaterial.TOOL_TOPAZ, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe", () -> new ItemHoe(ToolMaterial.TOOL_TOURMALINE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> TANZANITE_HOE = ITEMS.register("tanzanite_hoe", () -> new ItemHoe(ToolMaterial.TOOL_TANZANITE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ItemHoe(ToolMaterial.TOOL_RUBY, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new ItemHoe(ToolMaterial.TOOL_SAPPHIRE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> TURQUOISE_HOE = ITEMS.register("turquoise_hoe", () -> new ItemHoe(ToolMaterial.TOOL_TURQUOISE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> MOISSANITE_HOE = ITEMS.register("moissanite_hoe", () -> new ItemHoe(ToolMaterial.TOOL_MOISSANITE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));
    public static final RegistryObject<ItemHoe> ONYX_HOE = ITEMS.register("onyx_hoe", () -> new ItemHoe(ToolMaterial.TOOL_ONYX, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));

    public static final RegistryObject<ItemHoe> GRAPHENE_HOE = ITEMS.register("graphene_hoe", () -> new ItemHoe(ToolMaterial.TOOL_GRAPHENE, 0, -3.0F, new Item.Properties().tab(MoresTabs.MORES_TOOLS)));


    //Tin blocks
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(BlockInit.RAW_TIN_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockInit.TIN_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    //Copper blocks
    public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> RAW_COPPER_BLOCK = ITEMS.register("raw_copper_block", () -> new BlockItem(BlockInit.RAW_COPPER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockInit.DEEPSLATE_COPPER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    //Silver blocks
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(BlockInit.SILVER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(BlockInit.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockInit.DEEPSLATE_SILVER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> NETHER_SILVER_ORE = ITEMS.register("nether_silver_ore", () -> new BlockItem(BlockInit.NETHER_SILVER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    //Cobalt blocks
    public static final RegistryObject<BlockItem> COBALT_ORE = ITEMS.register("cobalt_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> RAW_COBALT_BLOCK = ITEMS.register("raw_cobalt_block", () -> new BlockItem(BlockInit.RAW_COBALT_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COBALT_ORE = ITEMS.register("deepslate_cobalt_ore", () -> new BlockItem(BlockInit.DEEPSLATE_COBALT_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    //Other blocks
    public static final RegistryObject<BlockItem> AMETHYST_ORE = ITEMS.register("amethyst_ore", () -> new BlockItem(BlockInit.AMETHYST_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> DEEPSLATE_AMETHYST_ORE = ITEMS.register("deepslate_amethyst_ore", () -> new BlockItem(BlockInit.DEEPSLATE_AMETHYST_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> AMETHYST_BLOCK = ITEMS.register("amethyst_block", () -> new BlockItem(BlockInit.AMETHYST_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore", () -> new BlockItem(BlockInit.TOPAZ_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(BlockInit.TOPAZ_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOPAZ_ORE = ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore", () -> new BlockItem(BlockInit.TOURMALINE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TOURMALINE_BLOCK = ITEMS.register("tourmaline_block", () -> new BlockItem(BlockInit.TOURMALINE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOURMALINE_ORE = ITEMS.register("deepslate_tourmaline_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TOURMALINE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TANZANITE_ORE = ITEMS.register("tanzanite_ore", () -> new BlockItem(BlockInit.TANZANITE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TANZANITE_BLOCK = ITEMS.register("tanzanite_block", () -> new BlockItem(BlockInit.TANZANITE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE = ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(BlockInit.DEEPSLATE_RUBY_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(BlockInit.SAPPHIRE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SAPPHIRE_ORE = ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TURQUOISE_ORE = ITEMS.register("turquoise_ore", () -> new BlockItem(BlockInit.TURQUOISE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TURQUOISE_BLOCK = ITEMS.register("turquoise_block", () -> new BlockItem(BlockInit.TURQUOISE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TURQUOISE_ORE = ITEMS.register("deepslate_turquoise_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TURQUOISE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> MOISSANITE_ORE = ITEMS.register("moissanite_ore", () -> new BlockItem(BlockInit.MOISSANITE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> MOISSANITE_BLOCK = ITEMS.register("moissanite_block", () -> new BlockItem(BlockInit.MOISSANITE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> MOISSANITE_NETHER_ORE = ITEMS.register("moissanite_nether_ore", () -> new BlockItem(BlockInit.MOISSANITE_NETHER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MOISSANITE_ORE = ITEMS.register("deepslate_moissanite_ore", () -> new BlockItem(BlockInit.DEEPSLATE_MOISSANITE_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(BlockInit.ONYX_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(BlockInit.ONYX_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> STERLING_BLOCK = ITEMS.register("sterling_block", () -> new BlockItem(BlockInit.STERLING_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAPHENE_BLOCK = ITEMS.register("graphene_block", () -> new BlockItem(BlockInit.GRAPHENE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_BLOCK = ITEMS.register("deepslate_block", () -> new BlockItem(BlockInit.DEEPSLATE_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> COBBLED_DEEPSLATE = ITEMS.register("cobbled_deepslate", () -> new BlockItem(BlockInit.COBBLED_DEEPSLATE.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    //Regular block as of now, will become TileEntity later
    public static final RegistryObject<BlockItem> ALLOY_FURNACE = ITEMS.register("alloy_furnace", () -> new BlockItem(BlockInit.ALLOY_FURNACE.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));


    public static final RegistryObject<ItemShield> TIN_SHIELD = ITEMS.register("tin_shield", () -> new ItemShield(() -> Config.tinDamageReduction.get(), MoresTags.Items.TIN, Config.tinDurability.get(), false));
    public static final RegistryObject<ItemShield> COPPER_SHIELD = ITEMS.register("copper_shield", () -> new ItemShield(() -> Config.copperDamageReduction.get(), MoresTags.Items.COPPER, Config.copperDurability.get(), false));
    public static final RegistryObject<ItemShield> SILVER_SHIELD = ITEMS.register("silver_shield", () -> new ItemShield(() -> Config.silverDamageReduction.get(), MoresTags.Items.SILVER, Config.silverDurability.get(), false));
    public static final RegistryObject<ItemShield> BRONZE_SHIELD = ITEMS.register("bronze_shield", () -> new ItemShield(() -> Config.bronzeDamageReduction.get(), MoresTags.Items.BRONZE, Config.bronzeDurability.get(), false));
    public static final RegistryObject<ItemShield> COBALT_SHIELD = ITEMS.register("cobalt_shield", () -> new ItemShield(() -> Config.cobaltDamageReduction.get(), MoresTags.Items.COBALT, Config.cobaltDurability.get(), false));
    public static final RegistryObject<ItemShield> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield", () -> new ItemShield(() -> Config.obsidianDamageReduction.get(), Tags.Items.OBSIDIAN, Config.obsidianDurability.get(), false));
    public static final RegistryObject<ItemShield> STERLING_SHIELD = ITEMS.register("sterling_shield", () -> new ItemShield(() -> Config.sterlingDamageReduction.get(), MoresTags.Items.STERLING_SILVER, Config.sterlingDurability.get(), false));
    public static final RegistryObject<ItemShield> STEEL_SHIELD = ITEMS.register("steel_shield", () -> new ItemShield(() -> Config.steelDamageReduction.get(), MoresTags.Items.STEEL, Config.steelDurability.get(), false));
    public static final RegistryObject<ItemShield> AMETHYST_SHIELD = ITEMS.register("amethyst_shield", () -> new ItemShield(() -> Config.amethystDamageReduction.get(), MoresTags.Items.AMETHYST, Config.amethystDurability.get(), false));
    public static final RegistryObject<ItemShield> EMERALD_SHIELD = ITEMS.register("emerald_shield", () -> new ItemShield(() -> Config.emeraldDamageReduction.get(), Tags.Items.GEMS_EMERALD, Config.emeraldDurability.get(), false));
    public static final RegistryObject<ItemShield> TOPAZ_SHIELD = ITEMS.register("topaz_shield", () -> new ItemShield(() -> Config.topazDamageReduction.get(), MoresTags.Items.TOPAZ, Config.topazDurability.get(), false));
    public static final RegistryObject<ItemShield> TOURMALINE_SHIELD = ITEMS.register("tourmaline_shield", () -> new ItemShield(() -> Config.tourmalineDamageReduction.get(), MoresTags.Items.TOURMALINE, Config.tourmalineDurability.get(), false));
    public static final RegistryObject<ItemShield> TANZANITE_SHIELD = ITEMS.register("tanzanite_shield", () -> new ItemShield(() -> Config.tanzaniteDamageReduction.get(), MoresTags.Items.TANZANITE, Config.tanzaniteDurability.get(), false));
    public static final RegistryObject<ItemShield> RUBY_SHIELD = ITEMS.register("ruby_shield", () -> new ItemShield(() -> Config.rubyDamageReduction.get(), MoresTags.Items.RUBY, Config.rubyDurability.get(), true));
    public static final RegistryObject<ItemShield> SAPPHIRE_SHIELD = ITEMS.register("sapphire_shield", () -> new ItemShield(() -> Config.sapphireDamageReduction.get(), MoresTags.Items.SAPPHIRE, Config.sapphireDurability.get(), false));
    public static final RegistryObject<ItemShield> TURQUOISE_SHIELD = ITEMS.register("turquoise_shield", () -> new ItemShield(() -> Config.turquoiseDamageReduction.get(), MoresTags.Items.TURQUOISE, Config.turquoiseDurability.get(), false));
    public static final RegistryObject<ItemShield> MOISSANITE_SHIELD = ITEMS.register("moissanite_shield", () -> new ItemShield(() -> Config.moissaniteDamageReduction.get(), MoresTags.Items.MOISSANITE, Config.moissaniteDurability.get(), false));
    public static final RegistryObject<ItemShield> ONYX_SHIELD = ITEMS.register("onyx_shield", () -> new ItemShield(() -> Config.onyxDamageReduction.get(), MoresTags.Items.ONYX, Config.onyxDurability.get(), false));
    public static final RegistryObject<ItemShield> GRAPHENE_SHIELD = ITEMS.register("graphene_shield", () -> new ItemShield(() -> Config.grapheneDamageReduction.get(), MoresTags.Items.GRAPHENE, Config.grapheneDurability.get(), true));

}
