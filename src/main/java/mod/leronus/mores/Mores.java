package mod.leronus.mores;

import com.mojang.logging.LogUtils;
import mod.leronus.mores.block.ModBlockEntities;
import mod.leronus.mores.block.ModBlocks;
import mod.leronus.mores.block.ModContainers;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.item.ModTabs;
import mod.leronus.mores.item.client.ModelHandler;
import mod.leronus.mores.loot.ModLootModifiers;
import mod.leronus.mores.painting.ModPaintings;
import mod.leronus.mores.recipe.ModRecipes;
import mod.leronus.mores.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.util.Arrays;

@Mod(Mores.MODID)
public class Mores {
    public static final String MODID = "mores";
    public static final String RESOURCE_PREFIX = MODID + ":";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public Mores() {
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, Config.COMMON_SPEC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModelHandler::setup);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModTabs.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModContainers.register(modEventBus);
        ModSounds.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ModPaintings.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        //Building Blocks
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RAW_TIN_BLOCK);
            for (RegistryObject<Block> blockRegistryObject : Arrays.asList(ModBlocks.RAW_SILVER_BLOCK, ModBlocks.RAW_COBALT_BLOCK, ModBlocks.TIN_BLOCK, ModBlocks.BRONZE_BLOCK, ModBlocks.SILVER_BLOCK, ModBlocks.COBALT_BLOCK, ModBlocks.STERLING_BLOCK, ModBlocks.STEEL_BLOCK, ModBlocks.TOPAZ_BLOCK, ModBlocks.TOURMALINE_BLOCK, ModBlocks.TANZANITE_BLOCK, ModBlocks.RUBY_BLOCK, ModBlocks.SAPPHIRE_BLOCK, ModBlocks.MOISSANITE_BLOCK, ModBlocks.TURQUOISE_BLOCK, ModBlocks.ONYX_BLOCK, ModBlocks.GRAPHENE_BLOCK)) {
                event.accept(blockRegistryObject);
            }
        }
        //Natural Blocks
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            for (RegistryObject<Block> blockRegistryObject : Arrays.asList(ModBlocks.ANTHRACITE_ORE, ModBlocks.DEEPSLATE_ANTHRACITE_ORE, ModBlocks.NETHER_ANTHRACITE_ORE, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE, ModBlocks.SILVER_ORE, ModBlocks.DEEPSLATE_SILVER_ORE, ModBlocks.NETHER_SILVER_ORE, ModBlocks.COBALT_ORE, ModBlocks.DEEPSLATE_COBALT_ORE, ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE, ModBlocks.TOURMALINE_ORE, ModBlocks.DEEPSLATE_TOURMALINE_ORE, ModBlocks.NETHER_TANZANITE_ORE, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.NETHER_SAPPHIRE_ORE, ModBlocks.MOISSANITE_ORE, ModBlocks.DEEPSLATE_MOISSANITE_ORE, ModBlocks.TURQUOISE_ORE, ModBlocks.DEEPSLATE_TURQUOISE_ORE, ModBlocks.ONYX_ORE)) {
                event.accept(blockRegistryObject);
            }
        }
        //Tools And Utilities
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            for (RegistryObject<Item> itemRegistryObject : Arrays.asList(ModItems.TIN_PICKAXE, ModItems.TIN_AXE, ModItems.TIN_SHOVEL, ModItems.TIN_HOE, ModItems.COPPER_PICKAXE, ModItems.COPPER_AXE, ModItems.COPPER_SHOVEL, ModItems.COPPER_HOE, ModItems.BRONZE_PICKAXE, ModItems.BRONZE_AXE, ModItems.BRONZE_SHOVEL, ModItems.BRONZE_HOE, ModItems.SILVER_PICKAXE, ModItems.SILVER_AXE, ModItems.SILVER_SHOVEL, ModItems.SILVER_HOE, ModItems.COBALT_PICKAXE, ModItems.COBALT_AXE, ModItems.COBALT_SHOVEL, ModItems.COBALT_HOE, ModItems.STERLING_PICKAXE, ModItems.STERLING_AXE, ModItems.STERLING_SHOVEL, ModItems.STERLING_HOE, ModItems.STEEL_PICKAXE, ModItems.STEEL_AXE, ModItems.STEEL_SHOVEL, ModItems.STEEL_HOE, ModItems.AMETHYST_PICKAXE, ModItems.AMETHYST_AXE, ModItems.AMETHYST_SHOVEL, ModItems.AMETHYST_HOE, ModItems.EMERALD_PICKAXE, ModItems.EMERALD_AXE, ModItems.EMERALD_SHOVEL, ModItems.EMERALD_HOE, ModItems.TOPAZ_PICKAXE, ModItems.TOPAZ_AXE, ModItems.TOPAZ_SHOVEL, ModItems.TOPAZ_HOE, ModItems.TOURMALINE_PICKAXE, ModItems.TOURMALINE_AXE, ModItems.TOURMALINE_SHOVEL, ModItems.TOURMALINE_HOE, ModItems.RUBY_PICKAXE, ModItems.RUBY_AXE, ModItems.RUBY_SHOVEL, ModItems.RUBY_HOE, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE_HOE, ModItems.TANZANITE_PICKAXE, ModItems.TANZANITE_AXE, ModItems.TANZANITE_SHOVEL, ModItems.TANZANITE_HOE, ModItems.MOISSANITE_PICKAXE, ModItems.MOISSANITE_AXE, ModItems.MOISSANITE_SHOVEL, ModItems.MOISSANITE_HOE, ModItems.TURQUOISE_PICKAXE, ModItems.TURQUOISE_AXE, ModItems.TURQUOISE_SHOVEL, ModItems.TURQUOISE_HOE, ModItems.OBSIDIAN_PICKAXE, ModItems.OBSIDIAN_AXE, ModItems.OBSIDIAN_SHOVEL, ModItems.OBSIDIAN_HOE, ModItems.ONYX_PICKAXE, ModItems.ONYX_AXE, ModItems.ONYX_SHOVEL, ModItems.ONYX_HOE, ModItems.GRAPHENE_PICKAXE, ModItems.GRAPHENE_AXE, ModItems.GRAPHENE_SHOVEL, ModItems.GRAPHENE_HOE, ModItems.CIPHER_DISC, ModItems.SWEET_CAROLINE_MUSIC_DISC)) {
                event.accept(itemRegistryObject);
            }

        }
        //Combat
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            for (RegistryObject<Item> itemRegistryObject : Arrays.asList(ModItems.TIN_AXE, ModItems.COPPER_AXE, ModItems.BRONZE_AXE, ModItems.SILVER_AXE, ModItems.COBALT_AXE, ModItems.STERLING_AXE, ModItems.STEEL_AXE, ModItems.AMETHYST_AXE, ModItems.EMERALD_AXE, ModItems.TOPAZ_AXE, ModItems.TOURMALINE_AXE, ModItems.RUBY_AXE, ModItems.SAPPHIRE_AXE, ModItems.TANZANITE_AXE, ModItems.MOISSANITE_AXE, ModItems.TURQUOISE_AXE, ModItems.OBSIDIAN_AXE, ModItems.ONYX_AXE, ModItems.GRAPHENE_AXE, ModItems.TIN_SWORD, ModItems.COPPER_SWORD, ModItems.BRONZE_SWORD, ModItems.SILVER_SWORD, ModItems.COBALT_SWORD, ModItems.STERLING_SWORD, ModItems.STEEL_SWORD, ModItems.AMETHYST_SWORD, ModItems.EMERALD_SWORD, ModItems.TOPAZ_SWORD, ModItems.TOURMALINE_SWORD, ModItems.RUBY_SWORD, ModItems.SAPPHIRE_SWORD, ModItems.TANZANITE_SWORD, ModItems.MOISSANITE_SWORD, ModItems.TURQUOISE_SWORD, ModItems.OBSIDIAN_SWORD, ModItems.ONYX_SWORD, ModItems.GRAPHENE_SWORD, ModItems.WOOD_BATTLEAXE, ModItems.STONE_BATTLEAXE, ModItems.TIN_BATTLEAXE, ModItems.COPPER_BATTLEAXE, ModItems.BRONZE_BATTLEAXE, ModItems.SILVER_BATTLEAXE, ModItems.GOLD_BATTLEAXE, ModItems.IRON_BATTLEAXE, ModItems.COBALT_BATTLEAXE, ModItems.STERLING_BATTLEAXE, ModItems.STEEL_BATTLEAXE, ModItems.AMETHYST_BATTLEAXE, ModItems.EMERALD_BATTLEAXE, ModItems.TOPAZ_BATTLEAXE, ModItems.TOURMALINE_BATTLEAXE, ModItems.DIAMOND_BATTLEAXE, ModItems.RUBY_BATTLEAXE, ModItems.SAPPHIRE_BATTLEAXE, ModItems.TANZANITE_BATTLEAXE, ModItems.MOISSANITE_BATTLEAXE, ModItems.TURQUOISE_BATTLEAXE, ModItems.OBSIDIAN_BATTLEAXE, ModItems.NETHERITE_BATTLEAXE, ModItems.ONYX_BATTLEAXE, ModItems.GRAPHENE_BATTLEAXE, ModItems.WOOD_MACE, ModItems.STONE_MACE, ModItems.TIN_MACE, ModItems.COPPER_MACE, ModItems.BRONZE_MACE, ModItems.SILVER_MACE, ModItems.GOLD_MACE, ModItems.IRON_MACE, ModItems.COBALT_MACE, ModItems.STERLING_MACE, ModItems.STEEL_MACE, ModItems.AMETHYST_MACE, ModItems.EMERALD_MACE, ModItems.TOPAZ_MACE, ModItems.TOURMALINE_MACE, ModItems.DIAMOND_MACE, ModItems.RUBY_MACE, ModItems.SAPPHIRE_MACE, ModItems.TANZANITE_MACE, ModItems.MOISSANITE_MACE, ModItems.TURQUOISE_MACE, ModItems.OBSIDIAN_MACE, ModItems.NETHERITE_MACE, ModItems.ONYX_MACE, ModItems.GRAPHENE_MACE, ModItems.WOOD_DAGGER, ModItems.STONE_DAGGER, ModItems.TIN_DAGGER, ModItems.COPPER_DAGGER, ModItems.BRONZE_DAGGER, ModItems.SILVER_DAGGER, ModItems.GOLD_DAGGER, ModItems.IRON_DAGGER, ModItems.COBALT_DAGGER, ModItems.STERLING_DAGGER, ModItems.STEEL_DAGGER, ModItems.AMETHYST_DAGGER, ModItems.EMERALD_DAGGER, ModItems.TOPAZ_DAGGER, ModItems.TOURMALINE_DAGGER, ModItems.DIAMOND_DAGGER, ModItems.RUBY_DAGGER, ModItems.SAPPHIRE_DAGGER, ModItems.TANZANITE_DAGGER, ModItems.MOISSANITE_DAGGER, ModItems.TURQUOISE_DAGGER, ModItems.OBSIDIAN_DAGGER, ModItems.NETHERITE_DAGGER, ModItems.ONYX_DAGGER, ModItems.GRAPHENE_DAGGER, ModItems.TIN_HELMET, ModItems.TIN_CHESTPLATE, ModItems.TIN_LEGGINGS, ModItems.TIN_BOOTS, ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS, ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS, ModItems.SILVER_HELMET, ModItems.SILVER_CHESTPLATE, ModItems.SILVER_LEGGINGS, ModItems.SILVER_BOOTS, ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS, ModItems.STERLING_HELMET, ModItems.STERLING_CHESTPLATE, ModItems.STERLING_LEGGINGS, ModItems.STERLING_BOOTS, ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS, ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS, ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS, ModItems.TOPAZ_HELMET, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_BOOTS, ModItems.TOURMALINE_HELMET, ModItems.TOURMALINE_CHESTPLATE, ModItems.TOURMALINE_LEGGINGS, ModItems.TOURMALINE_BOOTS, ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS, ModItems.TANZANITE_HELMET, ModItems.TANZANITE_CHESTPLATE, ModItems.TANZANITE_LEGGINGS, ModItems.TANZANITE_BOOTS, ModItems.MOISSANITE_HELMET, ModItems.MOISSANITE_CHESTPLATE, ModItems.MOISSANITE_LEGGINGS, ModItems.MOISSANITE_BOOTS, ModItems.TURQUOISE_HELMET, ModItems.TURQUOISE_CHESTPLATE, ModItems.TURQUOISE_LEGGINGS, ModItems.TURQUOISE_BOOTS, ModItems.OBSIDIAN_HELMET, ModItems.OBSIDIAN_CHESTPLATE, ModItems.OBSIDIAN_LEGGINGS, ModItems.OBSIDIAN_BOOTS, ModItems.ONYX_HELMET, ModItems.ONYX_CHESTPLATE, ModItems.ONYX_LEGGINGS, ModItems.ONYX_BOOTS, ModItems.GRAPHENE_HELMET, ModItems.GRAPHENE_CHESTPLATE, ModItems.GRAPHENE_LEGGINGS, ModItems.GRAPHENE_BOOTS, ModItems.TIN_HORSE_ARMOR, ModItems.COPPER_HORSE_ARMOR, ModItems.BRONZE_HORSE_ARMOR, ModItems.SILVER_HORSE_ARMOR, ModItems.COBALT_HORSE_ARMOR, ModItems.STERLING_HORSE_ARMOR, ModItems.STEEL_HORSE_ARMOR, ModItems.AMETHYST_HORSE_ARMOR, ModItems.EMERALD_HORSE_ARMOR, ModItems.TOPAZ_HORSE_ARMOR, ModItems.TOURMALINE_HORSE_ARMOR, ModItems.RUBY_HORSE_ARMOR, ModItems.SAPPHIRE_HORSE_ARMOR, ModItems.TANZANITE_HORSE_ARMOR, ModItems.MOISSANITE_HORSE_ARMOR, ModItems.TURQUOISE_HORSE_ARMOR, ModItems.OBSIDIAN_HORSE_ARMOR, ModItems.ONYX_HORSE_ARMOR, ModItems.GRAPHENE_HORSE_ARMOR, ModItems.NETHERITE_HORSE_ARMOR)) {
                event.accept(itemRegistryObject);
            }

        }
        //Food & Drinks
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            for (RegistryObject<Item> itemRegistryObject : Arrays.asList(ModItems.BRONZE_APPLE, ModItems.SILVER_APPLE, ModItems.COBALT_APPLE, ModItems.CHOCOLATE, ModItems.VELVET, ModItems.CARROT_PIE, ModItems.DUCK, ModItems.COOKED_DUCK)) {
                event.accept(itemRegistryObject);
            }
        }

        //Ingredients
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            for (RegistryObject<Item> itemRegistryObject : Arrays.asList(ModItems.ANTHRACITE, ModItems.RAW_TIN, ModItems.RAW_SILVER, ModItems.RAW_COBALT, ModItems.TIN_NUGGET, ModItems.BRONZE_NUGGET, ModItems.SILVER_NUGGET, ModItems.COBALT_NUGGET, ModItems.STERLING_NUGGET, ModItems.STEEL_NUGGET, ModItems.TIN_INGOT, ModItems.BRONZE_INGOT, ModItems.SILVER_INGOT, ModItems.COBALT_INGOT, ModItems.STERLING_INGOT, ModItems.STEEL_INGOT, ModItems.OBSIDIAN_INGOT, ModItems.TOPAZ_GEM, ModItems.TOURMALINE_GEM, ModItems.TANZANITE_GEM, ModItems.RUBY_GEM, ModItems.SAPPHIRE_GEM, ModItems.MOISSANITE_GEM, ModItems.TURQUOISE_GEM, ModItems.ONYX_GEM, ModItems.GRAPHENE_GEM, ModItems.CHAIN, ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE, ModItems.BRONZE_ALLOY_SMITHING_TEMPLATE, ModItems.STEEL_ALLOY_SMITHING_TEMPLATE, ModItems.STERLING_ALLOY_SMITHING_TEMPLATE, ModItems.GRAPHENE_ALLOY_SMITHING_TEMPLATE)) {
                event.accept(itemRegistryObject);
            }

        }
        //Spawn Eggs
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.DUCK_SPAWN_EGG);
        }
    }
}

