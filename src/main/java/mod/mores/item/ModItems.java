package mod.mores.item;

import mod.mores.Mores;
import mod.mores.block.ModBlocks;
import mod.mores.item.custom.ModArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Class that initialise all items from mOres
 */
public class ModItems {
    /**
     * Registers all mores items
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mores.MODID);
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    /**
     * Fills the registry with items
     */
    //Item Registry
    public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> STERLING_INGOT = ITEMS.register("sterling_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TOPAZ_GEM = ITEMS.register("topaz_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TOURMALINE_GEM = ITEMS.register("tourmaline_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TANZANITE_GEM = ITEMS.register("tanzanite_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> TURQUOISE_GEM = ITEMS.register("turquoise_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> MOISSANITE_GEM = ITEMS.register("moissanite_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> ONYX_GEM = ITEMS.register("onyx_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> GRAPHENE_GEM = ITEMS.register("graphene_gem", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> CHAIN = ITEMS.register("chain", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(ModTabs.MORES_MATERIALS)));

    public static final RegistryObject<Item> SILVER_APPLE = ITEMS.register("silver_apple", () -> new Item(new Item.Properties().tab(ModTabs.MORES_FOODS).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0F).alwaysEat().build())));
    public static final RegistryObject<Item> BRONZE_APPLE = ITEMS.register("bronze_apple", () -> new Item(new Item.Properties().tab(ModTabs.MORES_FOODS).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0), 0.8F).alwaysEat().build())));

    public static final RegistryObject<Item> DUCK = ITEMS.register("duck", () -> new Item(new Item.Properties().tab(ModTabs.MORES_FOODS).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build())));
    public static final RegistryObject<Item> COOKED_DUCK = ITEMS.register("cooked_duck", () -> new Item(new Item.Properties().tab(ModTabs.MORES_FOODS).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).meat().build())));

    public static final RegistryObject<Item> ROOIEKOOL = ITEMS.register("rooiekool", () -> new Item(new Item.Properties().tab(ModTabs.MORES_FOODS).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4F).effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 250, 0), 0.9F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 1.0F).alwaysEat().build())));

//    public static final RegistryObject<SpawnEggItem> DUCK_SPAWN_EGG  = ITEMS.register("duck_spawn_egg", () -> new ItemSpawnEgg(EntityTypeInit.DUCK, 0x006808, 0xFFD400, new Item.Properties().tab(MoresTabs.MORES_ENTITIES)));

    //All horse armor
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new HorseArmorItem(3, "copper", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem(2, "tin", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> SILVER_HORSE_ARMOR = ITEMS.register("silver_horse_armor", () -> new HorseArmorItem(5, "silver", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> COBALT_HORSE_ARMOR = ITEMS.register("cobalt_horse_armor", () -> new HorseArmorItem(6, "cobalt", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem(4, "bronze", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor", () -> new HorseArmorItem(8, "steel", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> STERLING_HORSE_ARMOR = ITEMS.register("sterling_horse_armor", () -> new HorseArmorItem(7, "sterling", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor", () -> new HorseArmorItem(7, "amethyst", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_HORSE_ARMOR = ITEMS.register("obsidian_horse_armor", () -> new HorseArmorItem(9, "obsidian", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new HorseArmorItem(8, "emerald", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () -> new HorseArmorItem(9, "topaz", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_HORSE_ARMOR = ITEMS.register("tourmaline_horse_armor", () -> new HorseArmorItem(10, "tourmaline", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_HORSE_ARMOR = ITEMS.register("tanzanite_horse_armor", () -> new HorseArmorItem(10, "tanzanite", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () -> new HorseArmorItem(12, "ruby", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () -> new HorseArmorItem(11, "sapphire", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_HORSE_ARMOR = ITEMS.register("turquoise_horse_armor", () -> new HorseArmorItem(12, "turquoise", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_HORSE_ARMOR = ITEMS.register("moissanite_horse_armor", () -> new HorseArmorItem(13, "moissanite", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> ONYX_HORSE_ARMOR = ITEMS.register("onyx_horse_armor", () -> new HorseArmorItem(14, "onyx", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_HORSE_ARMOR = ITEMS.register("graphene_horse_armor", () -> new HorseArmorItem(16, "graphene", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () -> new HorseArmorItem(15, "netherite", (new Item.Properties()).stacksTo(1).tab(ModTabs.MORES_HORSE_ARMOR)));


    //All armor
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ModArmorItem(ModArmorMaterials.TIN, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ModArmorItem(ModArmorMaterials.TIN, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ModArmorItem(ModArmorMaterials.TIN, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ModArmorItem(ModArmorMaterials.TIN, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ModArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ModArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ModArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ModArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ModArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ModArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ModArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ModArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ModArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> STERLING_HELMET = ITEMS.register("sterling_helmet", () -> new ModArmorItem(ModArmorMaterials.STERLING, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_CHESTPLATE = ITEMS.register("sterling_chestplate", () -> new ModArmorItem(ModArmorMaterials.STERLING, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_LEGGINGS = ITEMS.register("sterling_leggings", () -> new ModArmorItem(ModArmorMaterials.STERLING, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STERLING_BOOTS = ITEMS.register("sterling_boots", () -> new ModArmorItem(ModArmorMaterials.STERLING, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ModArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ModArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ModArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ModArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ModArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ModArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ModArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ModArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ModArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ModArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ModArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ModArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ModArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ModArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TOURMALINE_HELMET = ITEMS.register("tourmaline_helmet", () -> new ModArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_CHESTPLATE = ITEMS.register("tourmaline_chestplate", () -> new ModArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_LEGGINGS = ITEMS.register("tourmaline_leggings", () -> new ModArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TOURMALINE_BOOTS = ITEMS.register("tourmaline_boots", () -> new ModArmorItem(ModArmorMaterials.TOURMALINE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TANZANITE_HELMET = ITEMS.register("tanzanite_helmet", () -> new ModArmorItem(ModArmorMaterials.TANZANITE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_CHESTPLATE = ITEMS.register("tanzanite_chestplate", () -> new ModArmorItem(ModArmorMaterials.TANZANITE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_LEGGINGS = ITEMS.register("tanzanite_leggings", () -> new ModArmorItem(ModArmorMaterials.TANZANITE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TANZANITE_BOOTS = ITEMS.register("tanzanite_boots", () -> new ModArmorItem(ModArmorMaterials.TANZANITE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ModArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ModArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ModArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ModArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> TURQUOISE_HELMET = ITEMS.register("turquoise_helmet", () -> new ModArmorItem(ModArmorMaterials.TURQUOISE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_CHESTPLATE = ITEMS.register("turquoise_chestplate", () -> new ModArmorItem(ModArmorMaterials.TURQUOISE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_LEGGINGS = ITEMS.register("turquoise_leggings", () -> new ModArmorItem(ModArmorMaterials.TURQUOISE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> TURQUOISE_BOOTS = ITEMS.register("turquoise_boots", () -> new ModArmorItem(ModArmorMaterials.TURQUOISE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> MOISSANITE_HELMET = ITEMS.register("moissanite_helmet", () -> new ModArmorItem(ModArmorMaterials.MOISSANITE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_CHESTPLATE = ITEMS.register("moissanite_chestplate", () -> new ModArmorItem(ModArmorMaterials.MOISSANITE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_LEGGINGS = ITEMS.register("moissanite_leggings", () -> new ModArmorItem(ModArmorMaterials.MOISSANITE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> MOISSANITE_BOOTS = ITEMS.register("moissanite_boots", () -> new ModArmorItem(ModArmorMaterials.MOISSANITE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> ONYX_HELMET = ITEMS.register("onyx_helmet", () -> new ModArmorItem(ModArmorMaterials.ONYX, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_CHESTPLATE = ITEMS.register("onyx_chestplate", () -> new ModArmorItem(ModArmorMaterials.ONYX, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_LEGGINGS = ITEMS.register("onyx_leggings", () -> new ModArmorItem(ModArmorMaterials.ONYX, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> ONYX_BOOTS = ITEMS.register("onyx_boots", () -> new ModArmorItem(ModArmorMaterials.ONYX, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));

    public static final RegistryObject<Item> GRAPHENE_HELMET = ITEMS.register("graphene_helmet", () -> new ModArmorItem(ModArmorMaterials.GRAPHENE, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_CHESTPLATE = ITEMS.register("graphene_chestplate", () -> new ModArmorItem(ModArmorMaterials.GRAPHENE, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_LEGGINGS = ITEMS.register("graphene_leggings", () -> new ModArmorItem(ModArmorMaterials.GRAPHENE, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));
    public static final RegistryObject<Item> GRAPHENE_BOOTS = ITEMS.register("graphene_boots", () -> new ModArmorItem(ModArmorMaterials.GRAPHENE, EquipmentSlot.FEET, (new Item.Properties()).tab(ModTabs.MORES_ARMOR)));


    //All swords
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(ModTiers.TIN, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModTiers.COPPER, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModTiers.SILVER, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModTiers.BRONZE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModTiers.OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ModTiers.COBALT, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModTiers.STEEL, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_SWORD = ITEMS.register("sterling_sword", () -> new SwordItem(ModTiers.STERLING, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModTiers.AMETHYST, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModTiers.EMERALD, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ModTiers.TOPAZ, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword", () -> new SwordItem(ModTiers.TOURMALINE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_SWORD = ITEMS.register("tanzanite_sword", () -> new SwordItem(ModTiers.TANZANITE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModTiers.RUBY, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModTiers.SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_SWORD = ITEMS.register("turquoise_sword", () -> new SwordItem(ModTiers.TURQUOISE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_SWORD = ITEMS.register("moissanite_sword", () -> new SwordItem(ModTiers.MOISSANITE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword", () -> new SwordItem(ModTiers.ONYX, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_SWORD = ITEMS.register("graphene_sword", () -> new SwordItem(ModTiers.GRAPHENE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    //All battleaxes
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    public static final RegistryObject<Item> WOOD_BATTLEAXE = ITEMS.register("wood_battleaxe", () -> new AxeItem(Tiers.WOOD, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_BATTLEAXE = ITEMS.register("stone_battleaxe", () -> new AxeItem(Tiers.STONE, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battleaxe", () -> new AxeItem(Tiers.IRON, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_BATTLEAXE = ITEMS.register("gold_battleaxe", () -> new AxeItem(Tiers.GOLD, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_BATTLEAXE = ITEMS.register("diamond_battleaxe", () -> new AxeItem(Tiers.DIAMOND, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> NETHERITE_BATTLEAXE = ITEMS.register("netherite_battleaxe", () -> new AxeItem(Tiers.NETHERITE, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_BATTLEAXE = ITEMS.register("tin_battleaxe", () -> new AxeItem(ModTiers.TIN, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_BATTLEAXE = ITEMS.register("copper_battleaxe", () -> new AxeItem(ModTiers.COPPER, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_BATTLEAXE = ITEMS.register("silver_battleaxe", () -> new AxeItem(ModTiers.SILVER, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_BATTLEAXE = ITEMS.register("bronze_battleaxe", () -> new AxeItem(ModTiers.BRONZE, 5, -2.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_BATTLEAXE = ITEMS.register("obsidian_battleaxe", () -> new AxeItem(ModTiers.OBSIDIAN, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_BATTLEAXE = ITEMS.register("cobalt_battleaxe", () -> new AxeItem(ModTiers.COBALT, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_BATTLEAXE = ITEMS.register("steel_battleaxe", () -> new AxeItem(ModTiers.STEEL, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_BATTLEAXE = ITEMS.register("sterling_battleaxe", () -> new AxeItem(ModTiers.STERLING, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_BATTLEAXE = ITEMS.register("amethyst_battleaxe", () -> new AxeItem(ModTiers.AMETHYST, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_BATTLEAXE = ITEMS.register("emerald_battleaxe", () -> new AxeItem(ModTiers.EMERALD, 5, -2.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_BATTLEAXE = ITEMS.register("topaz_battleaxe", () -> new AxeItem(ModTiers.TOPAZ, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_BATTLEAXE = ITEMS.register("tourmaline_battleaxe", () -> new AxeItem(ModTiers.TOURMALINE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_BATTLEAXE = ITEMS.register("tanzanite_battleaxe", () -> new AxeItem(ModTiers.TANZANITE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_BATTLEAXE = ITEMS.register("ruby_battleaxe", () -> new AxeItem(ModTiers.RUBY, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_BATTLEAXE = ITEMS.register("sapphire_battleaxe", () -> new AxeItem(ModTiers.SAPPHIRE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_BATTLEAXE = ITEMS.register("turquoise_battleaxe", () -> new AxeItem(ModTiers.TURQUOISE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_BATTLEAXE = ITEMS.register("moissanite_battleaxe", () -> new AxeItem(ModTiers.MOISSANITE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_BATTLEAXE = ITEMS.register("onyx_battleaxe", () -> new AxeItem(ModTiers.ONYX, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_BATTLEAXE = ITEMS.register("graphene_battleaxe", () -> new AxeItem(ModTiers.GRAPHENE, 5, -2.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));


    //All maces
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    //TODO Check attack values
    public static final RegistryObject<Item> WOOD_MACE = ITEMS.register("wood_mace", () -> new SwordItem(Tiers.WOOD, 2, -2.0F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_MACE = ITEMS.register("stone_mace", () -> new SwordItem(Tiers.STONE, 2, -2.0F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new SwordItem(Tiers.IRON, 2, -2.1F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_MACE = ITEMS.register("gold_mace", () -> new SwordItem(Tiers.GOLD, 2, -2.1F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_MACE = ITEMS.register("diamond_mace", () -> new SwordItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> NETHERITE_MACE = ITEMS.register("netherite_mace", () -> new SwordItem(Tiers.NETHERITE, 3, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_MACE = ITEMS.register("tin_mace", () -> new SwordItem(ModTiers.TIN, 2, -2.0F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_MACE = ITEMS.register("copper_mace", () -> new SwordItem(ModTiers.COPPER, 2, -2.0F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_MACE = ITEMS.register("silver_mace", () -> new SwordItem(ModTiers.SILVER, 2, -2.1F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_MACE = ITEMS.register("bronze_mace", () -> new SwordItem(ModTiers.BRONZE, 2, -2.1F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_MACE = ITEMS.register("obsidian_mace", () -> new SwordItem(ModTiers.OBSIDIAN, 2, -2.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_MACE = ITEMS.register("cobalt_mace", () -> new SwordItem(ModTiers.COBALT, 2, -2.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_MACE = ITEMS.register("steel_mace", () -> new SwordItem(ModTiers.STEEL, 2, -2.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_MACE = ITEMS.register("sterling_mace", () -> new SwordItem(ModTiers.STERLING, 2, -2.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_MACE = ITEMS.register("amethyst_mace", () -> new SwordItem(ModTiers.AMETHYST, 2, -2.3F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_MACE = ITEMS.register("emerald_mace", () -> new SwordItem(ModTiers.EMERALD, 2, -2.3F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_MACE = ITEMS.register("topaz_mace", () -> new SwordItem(ModTiers.TOPAZ, 2, -2.3F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_MACE = ITEMS.register("tourmaline_mace", () -> new SwordItem(ModTiers.TOURMALINE, 2, -2.3F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_MACE = ITEMS.register("tanzanite_mace", () -> new SwordItem(ModTiers.TANZANITE, 2, -2.3F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_MACE = ITEMS.register("ruby_mace", () -> new SwordItem(ModTiers.RUBY, 2, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_MACE = ITEMS.register("sapphire_mace", () -> new SwordItem(ModTiers.SAPPHIRE, 2, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_MACE = ITEMS.register("turquoise_mace", () -> new SwordItem(ModTiers.TURQUOISE, 2, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_MACE = ITEMS.register("moissanite_mace", () -> new SwordItem(ModTiers.MOISSANITE, 2, -2.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_MACE = ITEMS.register("onyx_mace", () -> new SwordItem(ModTiers.ONYX, 2, -2.5F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_MACE = ITEMS.register("graphene_mace", () -> new SwordItem(ModTiers.GRAPHENE, 2, -2.5F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));


    //All daggers
    //p_i48460_2_: Attack Damage (1 = 1 Attack Point)
    //p_i48460_3_: Attack Speed (1.0F = ... Attack Speed)
    public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wood_dagger", () -> new SwordItem(Tiers.WOOD, 1, -1.0F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new SwordItem(Tiers.STONE, 1, -1.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new SwordItem(Tiers.IRON, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger", () -> new SwordItem(Tiers.GOLD, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new SwordItem(Tiers.DIAMOND, 1, -1.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger", () -> new SwordItem(Tiers.NETHERITE, 1, -1.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TIN_DAGGER = ITEMS.register("tin_dagger", () -> new SwordItem(ModTiers.TIN, 1, -1.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COPPER_DAGGER = ITEMS.register("copper_dagger", () -> new SwordItem(ModTiers.COPPER, 1, -1.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> SILVER_DAGGER = ITEMS.register("silver_dagger", () -> new SwordItem(ModTiers.SILVER, 1, -1.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> BRONZE_DAGGER = ITEMS.register("bronze_dagger", () -> new SwordItem(ModTiers.BRONZE, 1, -1.2F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger", () -> new SwordItem(ModTiers.OBSIDIAN, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> COBALT_DAGGER = ITEMS.register("cobalt_dagger", () -> new SwordItem(ModTiers.COBALT, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register("steel_dagger", () -> new SwordItem(ModTiers.STEEL, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> STERLING_DAGGER = ITEMS.register("sterling_dagger", () -> new SwordItem(ModTiers.STERLING, 1, -1.4F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> AMETHYST_DAGGER = ITEMS.register("amethyst_dagger", () -> new SwordItem(ModTiers.AMETHYST, 1, -1.5F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger", () -> new SwordItem(ModTiers.EMERALD, 1, -1.5F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> TOPAZ_DAGGER = ITEMS.register("topaz_dagger", () -> new SwordItem(ModTiers.TOPAZ, 1, -1.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TOURMALINE_DAGGER = ITEMS.register("tourmaline_dagger", () -> new SwordItem(ModTiers.TOURMALINE, 1, -1.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TANZANITE_DAGGER = ITEMS.register("tanzanite_dagger", () -> new SwordItem(ModTiers.TANZANITE, 1, -1.6F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> RUBY_DAGGER = ITEMS.register("ruby_dagger", () -> new SwordItem(ModTiers.RUBY, 1, -1.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> SAPPHIRE_DAGGER = ITEMS.register("sapphire_dagger", () -> new SwordItem(ModTiers.SAPPHIRE, 1, -1.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> TURQUOISE_DAGGER = ITEMS.register("turquoise_dagger", () -> new SwordItem(ModTiers.TURQUOISE, 1, -1.7F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> MOISSANITE_DAGGER = ITEMS.register("moissanite_dagger", () -> new SwordItem(ModTiers.MOISSANITE, 1, -1.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));
    public static final RegistryObject<Item> ONYX_DAGGER = ITEMS.register("onyx_dagger", () -> new SwordItem(ModTiers.ONYX, 1, -1.8F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));

    public static final RegistryObject<Item> GRAPHENE_DAGGER = ITEMS.register("graphene_dagger", () -> new SwordItem(ModTiers.GRAPHENE, 1, -1.9F, new Item.Properties().tab(ModTabs.MORES_WEAPONS)));


    // All pickaxes
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ModTiers.TIN, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModTiers.SILVER, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModTiers.OBSIDIAN, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(ModTiers.COBALT, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModTiers.STEEL, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> STERLING_PICKAXE = ITEMS.register("sterling_pickaxe", () -> new PickaxeItem(ModTiers.STERLING, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModTiers.AMETHYST, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new PickaxeItem(ModTiers.TOPAZ, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe", () -> new PickaxeItem(ModTiers.TOURMALINE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> TANZANITE_PICKAXE = ITEMS.register("tanzanite_pickaxe", () -> new PickaxeItem(ModTiers.TANZANITE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> TURQUOISE_PICKAXE = ITEMS.register("turquoise_pickaxe", () -> new PickaxeItem(ModTiers.TURQUOISE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> MOISSANITE_PICKAXE = ITEMS.register("moissanite_pickaxe", () -> new PickaxeItem(ModTiers.MOISSANITE, 3, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<PickaxeItem> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe", () -> new PickaxeItem(ModTiers.ONYX, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<PickaxeItem> GRAPHENE_PICKAXE = ITEMS.register("graphene_pickaxe", () -> new PickaxeItem(ModTiers.GRAPHENE, 1, -2.8F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));


    //All axes
    //TODO Checkout items for proper atk dmg and speed values
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(ModTiers.TIN, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModTiers.COPPER, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModTiers.SILVER, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModTiers.BRONZE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModTiers.OBSIDIAN, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(ModTiers.COBALT, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModTiers.STEEL, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> STERLING_AXE = ITEMS.register("sterling_axe", () -> new AxeItem(ModTiers.STERLING, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModTiers.AMETHYST, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModTiers.EMERALD, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new AxeItem(ModTiers.TOPAZ, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> TOURMALINE_AXE = ITEMS.register("tourmaline_axe", () -> new AxeItem(ModTiers.TOURMALINE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> TANZANITE_AXE = ITEMS.register("tanzanite_axe", () -> new AxeItem(ModTiers.TANZANITE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModTiers.RUBY, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModTiers.SAPPHIRE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> TURQUOISE_AXE = ITEMS.register("turquoise_axe", () -> new AxeItem(ModTiers.TURQUOISE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> MOISSANITE_AXE = ITEMS.register("moissanite_axe", () -> new AxeItem(ModTiers.MOISSANITE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<AxeItem> ONYX_AXE = ITEMS.register("onyx_axe", () -> new AxeItem(ModTiers.ONYX, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<AxeItem> GRAPHENE_AXE = ITEMS.register("graphene_axe", () -> new AxeItem(ModTiers.GRAPHENE, 6.0F, -3.2F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));


    //All shovels
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(ModTiers.TIN, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModTiers.TIN, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModTiers.SILVER, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModTiers.BRONZE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModTiers.OBSIDIAN, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(ModTiers.COBALT, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModTiers.STEEL, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> STERLING_SHOVEL = ITEMS.register("sterling_shovel", () -> new ShovelItem(ModTiers.STERLING, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModTiers.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTiers.EMERALD, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ShovelItem(ModTiers.TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel", () -> new ShovelItem(ModTiers.TOURMALINE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> TANZANITE_SHOVEL = ITEMS.register("tanzanite_shovel", () -> new ShovelItem(ModTiers.TANZANITE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTiers.RUBY, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModTiers.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> TURQUOISE_SHOVEL = ITEMS.register("turquoise_shovel", () -> new ShovelItem(ModTiers.TURQUOISE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> MOISSANITE_SHOVEL = ITEMS.register("moissanite_shovel", () -> new ShovelItem(ModTiers.MOISSANITE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<ShovelItem> ONYX_SHOVEL = ITEMS.register("onyx_shovel", () -> new ShovelItem(ModTiers.ONYX, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<ShovelItem> GRAPHENE_SHOVEL = ITEMS.register("graphene_shovel", () -> new ShovelItem(ModTiers.GRAPHENE, 1.5F, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));


    //All hoes
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(ModTiers.TIN, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModTiers.COPPER, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModTiers.SILVER, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModTiers.BRONZE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModTiers.OBSIDIAN, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(ModTiers.COBALT, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModTiers.STEEL, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> STERLING_HOE = ITEMS.register("sterling_hoe", () -> new HoeItem(ModTiers.STERLING, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModTiers.AMETHYST, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModTiers.EMERALD, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new HoeItem(ModTiers.TOPAZ, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe", () -> new HoeItem(ModTiers.TOURMALINE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> TANZANITE_HOE = ITEMS.register("tanzanite_hoe", () -> new HoeItem(ModTiers.TANZANITE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModTiers.RUBY, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModTiers.SAPPHIRE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> TURQUOISE_HOE = ITEMS.register("turquoise_hoe", () -> new HoeItem(ModTiers.TURQUOISE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> MOISSANITE_HOE = ITEMS.register("moissanite_hoe", () -> new HoeItem(ModTiers.MOISSANITE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));
    public static final RegistryObject<HoeItem> ONYX_HOE = ITEMS.register("onyx_hoe", () -> new HoeItem(ModTiers.ONYX, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));

    public static final RegistryObject<HoeItem> GRAPHENE_HOE = ITEMS.register("graphene_hoe", () -> new HoeItem(ModTiers.GRAPHENE, 0, -3.0F, new Item.Properties().tab(ModTabs.MORES_TOOLS)));


    //Tin blocks
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    //Copper blocks
//    public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));
//    public static final RegistryObject<BlockItem> COPPER_BLOCK = ITEMS.register("copper_block", () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
//    public static final RegistryObject<BlockItem> RAW_COPPER_BLOCK = ITEMS.register("raw_copper_block", () -> new BlockItem(BlockInit.RAW_COPPER_BLOCK.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));
//    public static final RegistryObject<BlockItem> DEEPSLATE_COPPER_ORE = ITEMS.register("deepslate_copper_ore", () -> new BlockItem(BlockInit.DEEPSLATE_COPPER_ORE.get(), new Item.Properties().tab(MoresTabs.MORES_ORES)));

    //Silver blocks
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(ModBlocks.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_SILVER_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> NETHER_SILVER_ORE = ITEMS.register("nether_silver_ore", () -> new BlockItem(ModBlocks.NETHER_SILVER_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    //Cobalt blocks
    public static final RegistryObject<BlockItem> COBALT_ORE = ITEMS.register("cobalt_ore", () -> new BlockItem(ModBlocks.COBALT_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(ModBlocks.COBALT_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> RAW_COBALT_BLOCK = ITEMS.register("raw_cobalt_block", () -> new BlockItem(ModBlocks.RAW_COBALT_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COBALT_ORE = ITEMS.register("deepslate_cobalt_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_COBALT_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    //Other blocks
    public static final RegistryObject<BlockItem> AMETHYST_ORE = ITEMS.register("amethyst_ore", () -> new BlockItem(ModBlocks.AMETHYST_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> DEEPSLATE_AMETHYST_ORE = ITEMS.register("deepslate_amethyst_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> AMETHYST_BLOCK = ITEMS.register("amethyst_block", () -> new BlockItem(ModBlocks.AMETHYST_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore", () -> new BlockItem(ModBlocks.TOPAZ_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(ModBlocks.TOPAZ_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOPAZ_ORE = ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore", () -> new BlockItem(ModBlocks.TOURMALINE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TOURMALINE_BLOCK = ITEMS.register("tourmaline_block", () -> new BlockItem(ModBlocks.TOURMALINE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TOURMALINE_ORE = ITEMS.register("deepslate_tourmaline_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TOURMALINE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TANZANITE_ORE = ITEMS.register("tanzanite_ore", () -> new BlockItem(ModBlocks.NETHER_TANZANITE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TANZANITE_BLOCK = ITEMS.register("tanzanite_block", () -> new BlockItem(ModBlocks.TANZANITE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE = ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> NETHER_RUBY_ORE = ITEMS.register("nether_ruby_ore", () -> new BlockItem(ModBlocks.NETHER_RUBY_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SAPPHIRE_ORE = ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> NETHER_SAPPHIRE_ORE = ITEMS.register("nether_sapphire_ore", () -> new BlockItem(ModBlocks.NETHER_SAPPHIRE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> TURQUOISE_ORE = ITEMS.register("turquoise_ore", () -> new BlockItem(ModBlocks.TURQUOISE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> TURQUOISE_BLOCK = ITEMS.register("turquoise_block", () -> new BlockItem(ModBlocks.TURQUOISE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TURQUOISE_ORE = ITEMS.register("deepslate_turquoise_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TURQUOISE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> MOISSANITE_ORE = ITEMS.register("moissanite_ore", () -> new BlockItem(ModBlocks.MOISSANITE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> MOISSANITE_BLOCK = ITEMS.register("moissanite_block", () -> new BlockItem(ModBlocks.MOISSANITE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> MOISSANITE_NETHER_ORE = ITEMS.register("moissanite_nether_ore", () -> new BlockItem(ModBlocks.MOISSANITE_NETHER_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MOISSANITE_ORE = ITEMS.register("deepslate_moissanite_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_MOISSANITE_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));

    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(ModBlocks.ONYX_ORE.get(), new Item.Properties().tab(ModTabs.MORES_ORES)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(ModBlocks.ONYX_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));

    // Vanilla
    public static final RegistryObject<BlockItem> DIAMOND_ORE = VANILLA_ITEMS.register("diamond_ore", () -> new BlockItem(ModBlocks.DIAMOND_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIAMOND_BLOCK = VANILLA_ITEMS.register("diamond_block", () -> new BlockItem(ModBlocks.DIAMOND_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> OBSIDIAN = VANILLA_ITEMS.register("obsidian", () -> new BlockItem(ModBlocks.OBSIDIAN.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ANCIENT_DEBRIS = VANILLA_ITEMS.register("ancient_debris", () -> new BlockItem(ModBlocks.ANCIENT_DEBRIS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> NETHERITE_BLOCK = VANILLA_ITEMS.register("netherite_block", () -> new BlockItem(ModBlocks.NETHERITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(ModBlocks.BRONZE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> STERLING_BLOCK = ITEMS.register("sterling_block", () -> new BlockItem(ModBlocks.STERLING_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> GRAPHENE_BLOCK = ITEMS.register("graphene_block", () -> new BlockItem(ModBlocks.GRAPHENE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));

    public static final RegistryObject<BlockItem> DEEPSLATE_BLOCK = ITEMS.register("deepslate_block", () -> new BlockItem(ModBlocks.DEEPSLATE_BLOCK.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));
    public static final RegistryObject<BlockItem> COBBLED_DEEPSLATE = ITEMS.register("cobbled_deepslate", () -> new BlockItem(ModBlocks.COBBLED_DEEPSLATE.get(), new Item.Properties().tab(ModTabs.MORES_BLOCKS)));

    //Alloy Furnace
    //TODO Fix alloy furnace
//    public static final RegistryObject<BlockItem> ALLOY_FURNACE = ITEMS.register("alloy_furnace", () -> new BlockItem(BlockInit.ALLOY_FURNACE.get(), new Item.Properties().tab(MoresTabs.MORES_BLOCKS)));

    //Vanilla tools
    public static final RegistryObject<PickaxeItem> DIAMOND_PICKAXE = VANILLA_ITEMS.register("diamond_pickaxe", () -> new PickaxeItem(ModTiers.DIAMOND, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ShovelItem> DIAMOND_SHOVEL = VANILLA_ITEMS.register("diamond_shovel", () -> new ShovelItem(ModTiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<AxeItem> DIAMOND_AXE = VANILLA_ITEMS.register("diamond_axe", () -> new AxeItem(ModTiers.DIAMOND, 6.0F, -3.2F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<HoeItem> DIAMOND_HOE = VANILLA_ITEMS.register("diamond_hoe", () -> new HoeItem(ModTiers.DIAMOND, 0, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<PickaxeItem> NETHERITE_PICKAXE = VANILLA_ITEMS.register("netherite_pickaxe", () -> new PickaxeItem(ModTiers.NETHERITE, 1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ShovelItem> NETHERITE_SHOVEL = VANILLA_ITEMS.register("netherite_shovel", () -> new ShovelItem(ModTiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<AxeItem> NETHERITE_AXE = VANILLA_ITEMS.register("netherite_axe", () -> new AxeItem(ModTiers.NETHERITE, 6.0F, -3.2F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<HoeItem> NETHERITE_HOE = VANILLA_ITEMS.register("netherite_hoe", () -> new HoeItem(ModTiers.NETHERITE, 0, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    //Shields
    //TODO Fix Shields
//    public static final RegistryObject<ItemShield> TIN_SHIELD = ITEMS.register("tin_shield", () -> new ItemShield(() -> Config.tinDamageReduction.get(), MoresTags.Items.TIN, Config.tinDurability.get(), false));
//    public static final RegistryObject<ItemShield> COPPER_SHIELD = ITEMS.register("copper_shield", () -> new ItemShield(() -> Config.copperDamageReduction.get(), MoresTags.Items.COPPER, Config.copperDurability.get(), false));
//    public static final RegistryObject<ItemShield> SILVER_SHIELD = ITEMS.register("silver_shield", () -> new ItemShield(() -> Config.silverDamageReduction.get(), MoresTags.Items.SILVER, Config.silverDurability.get(), false));
//    public static final RegistryObject<ItemShield> BRONZE_SHIELD = ITEMS.register("bronze_shield", () -> new ItemShield(() -> Config.bronzeDamageReduction.get(), MoresTags.Items.BRONZE, Config.bronzeDurability.get(), false));
//    public static final RegistryObject<ItemShield> COBALT_SHIELD = ITEMS.register("cobalt_shield", () -> new ItemShield(() -> Config.cobaltDamageReduction.get(), MoresTags.Items.COBALT, Config.cobaltDurability.get(), false));
//    public static final RegistryObject<ItemShield> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield", () -> new ItemShield(() -> Config.obsidianDamageReduction.get(), Tags.Items.OBSIDIAN, Config.obsidianDurability.get(), false));
//    public static final RegistryObject<ItemShield> STERLING_SHIELD = ITEMS.register("sterling_shield", () -> new ItemShield(() -> Config.sterlingDamageReduction.get(), MoresTags.Items.STERLING_SILVER, Config.sterlingDurability.get(), false));
//    public static final RegistryObject<ItemShield> STEEL_SHIELD = ITEMS.register("steel_shield", () -> new ItemShield(() -> Config.steelDamageReduction.get(), MoresTags.Items.STEEL, Config.steelDurability.get(), false));
//    public static final RegistryObject<ItemShield> AMETHYST_SHIELD = ITEMS.register("amethyst_shield", () -> new ItemShield(() -> Config.amethystDamageReduction.get(), MoresTags.Items.AMETHYST, Config.amethystDurability.get(), false));
//    public static final RegistryObject<ItemShield> EMERALD_SHIELD = ITEMS.register("emerald_shield", () -> new ItemShield(() -> Config.emeraldDamageReduction.get(), Tags.Items.GEMS_EMERALD, Config.emeraldDurability.get(), false));
//    public static final RegistryObject<ItemShield> TOPAZ_SHIELD = ITEMS.register("topaz_shield", () -> new ItemShield(() -> Config.topazDamageReduction.get(), MoresTags.Items.TOPAZ, Config.topazDurability.get(), false));
//    public static final RegistryObject<ItemShield> TOURMALINE_SHIELD = ITEMS.register("tourmaline_shield", () -> new ItemShield(() -> Config.tourmalineDamageReduction.get(), MoresTags.Items.TOURMALINE, Config.tourmalineDurability.get(), false));
//    public static final RegistryObject<ItemShield> TANZANITE_SHIELD = ITEMS.register("tanzanite_shield", () -> new ItemShield(() -> Config.tanzaniteDamageReduction.get(), MoresTags.Items.TANZANITE, Config.tanzaniteDurability.get(), false));
//    public static final RegistryObject<ItemShield> RUBY_SHIELD = ITEMS.register("ruby_shield", () -> new ItemShield(() -> Config.rubyDamageReduction.get(), MoresTags.Items.RUBY, Config.rubyDurability.get(), true));
//    public static final RegistryObject<ItemShield> SAPPHIRE_SHIELD = ITEMS.register("sapphire_shield", () -> new ItemShield(() -> Config.sapphireDamageReduction.get(), MoresTags.Items.SAPPHIRE, Config.sapphireDurability.get(), false));
//    public static final RegistryObject<ItemShield> TURQUOISE_SHIELD = ITEMS.register("turquoise_shield", () -> new ItemShield(() -> Config.turquoiseDamageReduction.get(), MoresTags.Items.TURQUOISE, Config.turquoiseDurability.get(), false));
//    public static final RegistryObject<ItemShield> MOISSANITE_SHIELD = ITEMS.register("moissanite_shield", () -> new ItemShield(() -> Config.moissaniteDamageReduction.get(), MoresTags.Items.MOISSANITE, Config.moissaniteDurability.get(), false));
//    public static final RegistryObject<ItemShield> ONYX_SHIELD = ITEMS.register("onyx_shield", () -> new ItemShield(() -> Config.onyxDamageReduction.get(), MoresTags.Items.ONYX, Config.onyxDurability.get(), false));
//    public static final RegistryObject<ItemShield> GRAPHENE_SHIELD = ITEMS.register("graphene_shield", () -> new ItemShield(() -> Config.grapheneDamageReduction.get(), MoresTags.Items.GRAPHENE, Config.grapheneDurability.get(), true));

}
