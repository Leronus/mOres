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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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
            event.accept(ModBlocks.RAW_SILVER_BLOCK);
            event.accept(ModBlocks.RAW_COBALT_BLOCK);
            event.accept(ModBlocks.TIN_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.SILVER_BLOCK);
            event.accept(ModBlocks.COBALT_BLOCK);
            event.accept(ModBlocks.STERLING_BLOCK);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.TOPAZ_BLOCK);
            event.accept(ModBlocks.TOURMALINE_BLOCK);
            event.accept(ModBlocks.TANZANITE_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.MOISSANITE_BLOCK);
            event.accept(ModBlocks.TURQUOISE_BLOCK);
            event.accept(ModBlocks.ONYX_BLOCK);
            event.accept(ModBlocks.GRAPHENE_BLOCK);
        }
        //Natural Blocks
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.ANTHRACITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_ANTHRACITE_ORE);
            event.accept(ModBlocks.NETHER_ANTHRACITE_ORE);
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.SILVER_ORE);
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE);
            event.accept(ModBlocks.NETHER_SILVER_ORE);
            event.accept(ModBlocks.COBALT_ORE);
            event.accept(ModBlocks.DEEPSLATE_COBALT_ORE);
            event.accept(ModBlocks.TOPAZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE);
            event.accept(ModBlocks.TOURMALINE_ORE);
            event.accept(ModBlocks.DEEPSLATE_TOURMALINE_ORE);
            event.accept(ModBlocks.NETHER_TANZANITE_ORE);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModBlocks.NETHER_RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModBlocks.NETHER_SAPPHIRE_ORE);
            event.accept(ModBlocks.MOISSANITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_MOISSANITE_ORE);
            event.accept(ModBlocks.TURQUOISE_ORE);
            event.accept(ModBlocks.DEEPSLATE_TURQUOISE_ORE);
            event.accept(ModBlocks.ONYX_ORE);
        }
        //Tools And Utilities
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.TIN_PICKAXE);
            event.accept(ModItems.TIN_AXE);
            event.accept(ModItems.TIN_SHOVEL);
            event.accept(ModItems.TIN_HOE);
            event.accept(ModItems.COPPER_PICKAXE);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.COPPER_SHOVEL);
            event.accept(ModItems.COPPER_HOE);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.SILVER_PICKAXE);
            event.accept(ModItems.SILVER_AXE);
            event.accept(ModItems.SILVER_SHOVEL);
            event.accept(ModItems.SILVER_HOE);
            event.accept(ModItems.COBALT_PICKAXE);
            event.accept(ModItems.COBALT_AXE);
            event.accept(ModItems.COBALT_SHOVEL);
            event.accept(ModItems.COBALT_HOE);
            event.accept(ModItems.STERLING_PICKAXE);
            event.accept(ModItems.STERLING_AXE);
            event.accept(ModItems.STERLING_SHOVEL);
            event.accept(ModItems.STERLING_HOE);
            event.accept(ModItems.STEEL_PICKAXE);
            event.accept(ModItems.STEEL_AXE);
            event.accept(ModItems.STEEL_SHOVEL);
            event.accept(ModItems.STEEL_HOE);
            event.accept(ModItems.AMETHYST_PICKAXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.AMETHYST_SHOVEL);
            event.accept(ModItems.AMETHYST_HOE);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.EMERALD_HOE);
            event.accept(ModItems.TOPAZ_PICKAXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.TOPAZ_SHOVEL);
            event.accept(ModItems.TOPAZ_HOE);
            event.accept(ModItems.TOURMALINE_PICKAXE);
            event.accept(ModItems.TOURMALINE_AXE);
            event.accept(ModItems.TOURMALINE_SHOVEL);
            event.accept(ModItems.TOURMALINE_HOE);
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.TANZANITE_PICKAXE);
            event.accept(ModItems.TANZANITE_AXE);
            event.accept(ModItems.TANZANITE_SHOVEL);
            event.accept(ModItems.TANZANITE_HOE);
            event.accept(ModItems.MOISSANITE_PICKAXE);
            event.accept(ModItems.MOISSANITE_AXE);
            event.accept(ModItems.MOISSANITE_SHOVEL);
            event.accept(ModItems.MOISSANITE_HOE);
            event.accept(ModItems.TURQUOISE_PICKAXE);
            event.accept(ModItems.TURQUOISE_AXE);
            event.accept(ModItems.TURQUOISE_SHOVEL);
            event.accept(ModItems.TURQUOISE_HOE);
            event.accept(ModItems.OBSIDIAN_PICKAXE);
            event.accept(ModItems.OBSIDIAN_AXE);
            event.accept(ModItems.OBSIDIAN_SHOVEL);
            event.accept(ModItems.OBSIDIAN_HOE);
            event.accept(ModItems.ONYX_PICKAXE);
            event.accept(ModItems.ONYX_AXE);
            event.accept(ModItems.ONYX_SHOVEL);
            event.accept(ModItems.ONYX_HOE);
            event.accept(ModItems.GRAPHENE_PICKAXE);
            event.accept(ModItems.GRAPHENE_AXE);
            event.accept(ModItems.GRAPHENE_SHOVEL);
            event.accept(ModItems.GRAPHENE_HOE);

            event.accept(ModItems.CIPHER_DISC);
            event.accept(ModItems.SWEET_CAROLINE_MUSIC_DISC);
        }
        //Combat
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.TIN_AXE);
            event.accept(ModItems.COPPER_AXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.SILVER_AXE);
            event.accept(ModItems.COBALT_AXE);
            event.accept(ModItems.STERLING_AXE);
            event.accept(ModItems.STEEL_AXE);
            event.accept(ModItems.AMETHYST_AXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.TOPAZ_AXE);
            event.accept(ModItems.TOURMALINE_AXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.TANZANITE_AXE);
            event.accept(ModItems.MOISSANITE_AXE);
            event.accept(ModItems.TURQUOISE_AXE);
            event.accept(ModItems.OBSIDIAN_AXE);
            event.accept(ModItems.ONYX_AXE);
            event.accept(ModItems.GRAPHENE_AXE);
            event.accept(ModItems.TIN_SWORD);
            event.accept(ModItems.COPPER_SWORD);
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.SILVER_SWORD);
            event.accept(ModItems.COBALT_SWORD);
            event.accept(ModItems.STERLING_SWORD);
            event.accept(ModItems.STEEL_SWORD);
            event.accept(ModItems.AMETHYST_SWORD);
            event.accept(ModItems.EMERALD_SWORD);
            event.accept(ModItems.TOPAZ_SWORD);
            event.accept(ModItems.TOURMALINE_SWORD);
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.TANZANITE_SWORD);
            event.accept(ModItems.MOISSANITE_SWORD);
            event.accept(ModItems.TURQUOISE_SWORD);
            event.accept(ModItems.OBSIDIAN_SWORD);
            event.accept(ModItems.ONYX_SWORD);
            event.accept(ModItems.GRAPHENE_SWORD);
            event.accept(ModItems.WOOD_BATTLEAXE);
            event.accept(ModItems.STONE_BATTLEAXE);
            event.accept(ModItems.TIN_BATTLEAXE);
            event.accept(ModItems.COPPER_BATTLEAXE);
            event.accept(ModItems.BRONZE_BATTLEAXE);
            event.accept(ModItems.SILVER_BATTLEAXE);
            event.accept(ModItems.GOLD_BATTLEAXE);
            event.accept(ModItems.IRON_BATTLEAXE);
            event.accept(ModItems.COBALT_BATTLEAXE);
            event.accept(ModItems.STERLING_BATTLEAXE);
            event.accept(ModItems.STEEL_BATTLEAXE);
            event.accept(ModItems.AMETHYST_BATTLEAXE);
            event.accept(ModItems.EMERALD_BATTLEAXE);
            event.accept(ModItems.TOPAZ_BATTLEAXE);
            event.accept(ModItems.TOURMALINE_BATTLEAXE);
            event.accept(ModItems.DIAMOND_BATTLEAXE);
            event.accept(ModItems.RUBY_BATTLEAXE);
            event.accept(ModItems.SAPPHIRE_BATTLEAXE);
            event.accept(ModItems.TANZANITE_BATTLEAXE);
            event.accept(ModItems.MOISSANITE_BATTLEAXE);
            event.accept(ModItems.TURQUOISE_BATTLEAXE);
            event.accept(ModItems.OBSIDIAN_BATTLEAXE);
            event.accept(ModItems.NETHERITE_BATTLEAXE);
            event.accept(ModItems.ONYX_BATTLEAXE);
            event.accept(ModItems.GRAPHENE_BATTLEAXE);
            event.accept(ModItems.WOOD_MACE);
            event.accept(ModItems.STONE_MACE);
            event.accept(ModItems.TIN_MACE);
            event.accept(ModItems.COPPER_MACE);
            event.accept(ModItems.BRONZE_MACE);
            event.accept(ModItems.SILVER_MACE);
            event.accept(ModItems.GOLD_MACE);
            event.accept(ModItems.IRON_MACE);
            event.accept(ModItems.COBALT_MACE);
            event.accept(ModItems.STERLING_MACE);
            event.accept(ModItems.STEEL_MACE);
            event.accept(ModItems.AMETHYST_MACE);
            event.accept(ModItems.EMERALD_MACE);
            event.accept(ModItems.TOPAZ_MACE);
            event.accept(ModItems.TOURMALINE_MACE);
            event.accept(ModItems.DIAMOND_MACE);
            event.accept(ModItems.RUBY_MACE);
            event.accept(ModItems.SAPPHIRE_MACE);
            event.accept(ModItems.TANZANITE_MACE);
            event.accept(ModItems.MOISSANITE_MACE);
            event.accept(ModItems.TURQUOISE_MACE);
            event.accept(ModItems.OBSIDIAN_MACE);
            event.accept(ModItems.NETHERITE_MACE);
            event.accept(ModItems.ONYX_MACE);
            event.accept(ModItems.GRAPHENE_MACE);
            event.accept(ModItems.WOOD_DAGGER);
            event.accept(ModItems.STONE_DAGGER);
            event.accept(ModItems.TIN_DAGGER);
            event.accept(ModItems.COPPER_DAGGER);
            event.accept(ModItems.BRONZE_DAGGER);
            event.accept(ModItems.SILVER_DAGGER);
            event.accept(ModItems.GOLD_DAGGER);
            event.accept(ModItems.IRON_DAGGER);
            event.accept(ModItems.COBALT_DAGGER);
            event.accept(ModItems.STERLING_DAGGER);
            event.accept(ModItems.STEEL_DAGGER);
            event.accept(ModItems.AMETHYST_DAGGER);
            event.accept(ModItems.EMERALD_DAGGER);
            event.accept(ModItems.TOPAZ_DAGGER);
            event.accept(ModItems.TOURMALINE_DAGGER);
            event.accept(ModItems.DIAMOND_DAGGER);
            event.accept(ModItems.RUBY_DAGGER);
            event.accept(ModItems.SAPPHIRE_DAGGER);
            event.accept(ModItems.TANZANITE_DAGGER);
            event.accept(ModItems.MOISSANITE_DAGGER);
            event.accept(ModItems.TURQUOISE_DAGGER);
            event.accept(ModItems.OBSIDIAN_DAGGER);
            event.accept(ModItems.NETHERITE_DAGGER);
            event.accept(ModItems.ONYX_DAGGER);
            event.accept(ModItems.GRAPHENE_DAGGER);

            event.accept(ModItems.TIN_HELMET);
            event.accept(ModItems.TIN_CHESTPLATE);
            event.accept(ModItems.TIN_LEGGINGS);
            event.accept(ModItems.TIN_BOOTS);
            event.accept(ModItems.COPPER_HELMET);
            event.accept(ModItems.COPPER_CHESTPLATE);
            event.accept(ModItems.COPPER_LEGGINGS);
            event.accept(ModItems.COPPER_BOOTS);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);
            event.accept(ModItems.SILVER_HELMET);
            event.accept(ModItems.SILVER_CHESTPLATE);
            event.accept(ModItems.SILVER_LEGGINGS);
            event.accept(ModItems.SILVER_BOOTS);
            event.accept(ModItems.COBALT_HELMET);
            event.accept(ModItems.COBALT_CHESTPLATE);
            event.accept(ModItems.COBALT_LEGGINGS);
            event.accept(ModItems.COBALT_BOOTS);
            event.accept(ModItems.STERLING_HELMET);
            event.accept(ModItems.STERLING_CHESTPLATE);
            event.accept(ModItems.STERLING_LEGGINGS);
            event.accept(ModItems.STERLING_BOOTS);
            event.accept(ModItems.STEEL_HELMET);
            event.accept(ModItems.STEEL_CHESTPLATE);
            event.accept(ModItems.STEEL_LEGGINGS);
            event.accept(ModItems.STEEL_BOOTS);
            event.accept(ModItems.AMETHYST_HELMET);
            event.accept(ModItems.AMETHYST_CHESTPLATE);
            event.accept(ModItems.AMETHYST_LEGGINGS);
            event.accept(ModItems.AMETHYST_BOOTS);
            event.accept(ModItems.EMERALD_HELMET);
            event.accept(ModItems.EMERALD_CHESTPLATE);
            event.accept(ModItems.EMERALD_LEGGINGS);
            event.accept(ModItems.EMERALD_BOOTS);
            event.accept(ModItems.TOPAZ_HELMET);
            event.accept(ModItems.TOPAZ_CHESTPLATE);
            event.accept(ModItems.TOPAZ_LEGGINGS);
            event.accept(ModItems.TOPAZ_BOOTS);
            event.accept(ModItems.TOURMALINE_HELMET);
            event.accept(ModItems.TOURMALINE_CHESTPLATE);
            event.accept(ModItems.TOURMALINE_LEGGINGS);
            event.accept(ModItems.TOURMALINE_BOOTS);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.TANZANITE_HELMET);
            event.accept(ModItems.TANZANITE_CHESTPLATE);
            event.accept(ModItems.TANZANITE_LEGGINGS);
            event.accept(ModItems.TANZANITE_BOOTS);
            event.accept(ModItems.MOISSANITE_HELMET);
            event.accept(ModItems.MOISSANITE_CHESTPLATE);
            event.accept(ModItems.MOISSANITE_LEGGINGS);
            event.accept(ModItems.MOISSANITE_BOOTS);
            event.accept(ModItems.TURQUOISE_HELMET);
            event.accept(ModItems.TURQUOISE_CHESTPLATE);
            event.accept(ModItems.TURQUOISE_LEGGINGS);
            event.accept(ModItems.TURQUOISE_BOOTS);
            event.accept(ModItems.OBSIDIAN_HELMET);
            event.accept(ModItems.OBSIDIAN_CHESTPLATE);
            event.accept(ModItems.OBSIDIAN_LEGGINGS);
            event.accept(ModItems.OBSIDIAN_BOOTS);
            event.accept(ModItems.ONYX_HELMET);
            event.accept(ModItems.ONYX_CHESTPLATE);
            event.accept(ModItems.ONYX_LEGGINGS);
            event.accept(ModItems.ONYX_BOOTS);
            event.accept(ModItems.GRAPHENE_HELMET);
            event.accept(ModItems.GRAPHENE_CHESTPLATE);
            event.accept(ModItems.GRAPHENE_LEGGINGS);
            event.accept(ModItems.GRAPHENE_BOOTS);

            event.accept(ModItems.TIN_HORSE_ARMOR);
            event.accept(ModItems.COPPER_HORSE_ARMOR);
            event.accept(ModItems.BRONZE_HORSE_ARMOR);
            event.accept(ModItems.SILVER_HORSE_ARMOR);
            event.accept(ModItems.COBALT_HORSE_ARMOR);
            event.accept(ModItems.STERLING_HORSE_ARMOR);
            event.accept(ModItems.STEEL_HORSE_ARMOR);
            event.accept(ModItems.AMETHYST_HORSE_ARMOR);
            event.accept(ModItems.EMERALD_HORSE_ARMOR);
            event.accept(ModItems.TOPAZ_HORSE_ARMOR);
            event.accept(ModItems.TOURMALINE_HORSE_ARMOR);
            event.accept(ModItems.RUBY_HORSE_ARMOR);
            event.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
            event.accept(ModItems.TANZANITE_HORSE_ARMOR);
            event.accept(ModItems.MOISSANITE_HORSE_ARMOR);
            event.accept(ModItems.TURQUOISE_HORSE_ARMOR);
            event.accept(ModItems.OBSIDIAN_HORSE_ARMOR);
            event.accept(ModItems.ONYX_HORSE_ARMOR);
            event.accept(ModItems.GRAPHENE_HORSE_ARMOR);
            event.accept(ModItems.NETHERITE_HORSE_ARMOR);
        }
        //Food & Drinks
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.BRONZE_APPLE);
            event.accept(ModItems.SILVER_APPLE);
            event.accept(ModItems.COBALT_APPLE);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.VELVET);
            event.accept(ModItems.CARROT_PIE);
            event.accept(ModItems.DUCK);
            event.accept(ModItems.COOKED_DUCK);
        }

        //Ingredients
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ANTHRACITE);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.RAW_COBALT);
            event.accept(ModItems.TIN_NUGGET);
            event.accept(ModItems.BRONZE_NUGGET);
            event.accept(ModItems.SILVER_NUGGET);
            event.accept(ModItems.COBALT_NUGGET);
            event.accept(ModItems.STERLING_NUGGET);
            event.accept(ModItems.STEEL_NUGGET);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.COBALT_INGOT);
            event.accept(ModItems.STERLING_INGOT);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.OBSIDIAN_INGOT);

            event.accept(ModItems.TOPAZ_GEM);
            event.accept(ModItems.TOURMALINE_GEM);
            event.accept(ModItems.TANZANITE_GEM);
            event.accept(ModItems.RUBY_GEM);
            event.accept(ModItems.SAPPHIRE_GEM);
            event.accept(ModItems.MOISSANITE_GEM);
            event.accept(ModItems.TURQUOISE_GEM);
            event.accept(ModItems.ONYX_GEM);
            event.accept(ModItems.GRAPHENE_GEM);
            event.accept(ModItems.CHAIN);
            event.accept(ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE);
            event.accept(ModItems.BRONZE_ALLOY_SMITHING_TEMPLATE);
            event.accept(ModItems.STEEL_ALLOY_SMITHING_TEMPLATE);
            event.accept(ModItems.STERLING_ALLOY_SMITHING_TEMPLATE);
            event.accept(ModItems.GRAPHENE_ALLOY_SMITHING_TEMPLATE);
        }
        //Spawn Eggs
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.DUCK_SPAWN_EGG);
        }
    }
}

