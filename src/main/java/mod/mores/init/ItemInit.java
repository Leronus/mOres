package mod.mores.init;

import mod.mores.Mores;
import mod.mores.materials.ToolMaterial;
import mod.mores.objects.ItemTools;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
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

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TOPAZ_GEM = ITEMS.register("topaz_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TOURMALINE_GEM = ITEMS.register("tourmaline_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> SAPPHIRE_GEM = ITEMS.register("sapphire_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> MOISSANITE_GEM = ITEMS.register("moissanite_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> ONYX_GEM = ITEMS.register("onyx_gem", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));



    /**
     * All swords
     */
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(ToolMaterial.TOOL_TIN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
//    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ToolMaterial.TOOL_COPPER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ToolMaterial.TOOL_SILVER, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ToolMaterial.TOOL_BRONZE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ToolMaterial.TOOL_OBSIDIAN, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(ToolMaterial.TOOL_COBALT, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ToolMaterial.TOOL_STEEL, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

//    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ToolMaterial.TOOL_AMETHYST, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ToolMaterial.TOOL_EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword", () -> new SwordItem(ToolMaterial.TOOL_TOPAZ, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword", () -> new SwordItem(ToolMaterial.TOOL_TOURMALINE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ToolMaterial.TOOL_RUBY, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ToolMaterial.TOOL_SAPPHIRE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MOISSANITE_SWORD = ITEMS.register("moissanite_sword", () -> new SwordItem(ToolMaterial.TOOL_MOISSANITE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword", () -> new SwordItem(ToolMaterial.TOOL_ONYX, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));

//    public static final RegistryObject<Item> GRAPHENE_SWORD = ITEMS.register("graphene_pickaxe", () -> new SwordItem(ToolMaterial.TOOL_GRAPHENE, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_MISC)));


    /**
     * All pickaxes
     */
    public static final RegistryObject<ItemTools> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 2).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 2).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 3).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 4).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 5).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 6).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 6).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 7).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 7).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 8).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 8).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> MOISSANITE_PICKAXE = ITEMS.register("moissanite_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 9).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 9).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> GRAPHENE_PICKAXE = ITEMS.register("graphene_pickaxe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.PICKAXE, 10).tab(ItemGroup.TAB_MISC)));


    /**
     * All axes
     */
    public static final RegistryObject<ItemTools> TIN_AXE = ITEMS.register("tin_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 2).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COPPER_AXE = ITEMS.register("copper_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 2).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> SILVER_AXE = ITEMS.register("silver_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 3).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 4).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> STEEL_AXE = ITEMS.register("steel_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 5).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 6).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 6).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> TOPAZ_AXE = ITEMS.register("topaz_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 7).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> TOURMALINE_AXE = ITEMS.register("tourmaline_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 7).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 8).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 8).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> MOISSANITE_AXE = ITEMS.register("moissanite_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 9).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> ONYX_AXE = ITEMS.register("onyx_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 9).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> GRAPHENE_AXE = ITEMS.register("graphene_axe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.AXE, 10).tab(ItemGroup.TAB_MISC)));


    /**
     * All shovels
     */
    public static final RegistryObject<ItemTools> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 2).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 2).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 3).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 4).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 5).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 6).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 6).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 7).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 7).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 8).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 8).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> MOISSANITE_SHOVEL = ITEMS.register("moissanite_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 9).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> ONYX_SHOVEL = ITEMS.register("onyx_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 9).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> GRAPHENE_SHOVEL = ITEMS.register("graphene_shovel", () -> new ItemTools(new Item.Properties().addToolType(ToolType.SHOVEL, 10).tab(ItemGroup.TAB_MISC)));


    /**
     * All hoes
     */
    public static final RegistryObject<ItemTools> TIN_HOE = ITEMS.register("tin_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 2).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COPPER_HOE = ITEMS.register("copper_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 2).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> SILVER_HOE = ITEMS.register("silver_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 3).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 4).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 5).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> STEEL_HOE = ITEMS.register("steel_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 5).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 6).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 6).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> TOPAZ_HOE = ITEMS.register("topaz_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 7).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 7).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 8).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 8).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> MOISSANITE_HOE = ITEMS.register("moissanite_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 9).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<ItemTools> ONYX_HOE = ITEMS.register("onyx_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 9).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<ItemTools> GRAPHENE_HOE = ITEMS.register("graphene_hoe", () -> new ItemTools(new Item.Properties().addToolType(ToolType.HOE, 10).tab(ItemGroup.TAB_MISC)));



    //Block Registry

    /**
     * Tin blocks
     */
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(BlockInit.RAW_TIN_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(BlockInit.TIN_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockInit.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

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

    public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore", () -> new BlockItem(BlockInit.TOURMALINE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TOURMALINE_BLOCK = ITEMS.register("tourmaline_block", () -> new BlockItem(BlockInit.TOURMALINE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(BlockInit.SAPPHIRE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

//    public static final RegistryObject<BlockItem> MOISSANITE_ORE = ITEMS.register("moissanite_ore", () -> new BlockItem(BlockInit.MOISSANITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> MOISSANITE_BLOCK = ITEMS.register("moissanite_block", () -> new BlockItem(BlockInit.MOISSANITE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> MOISSANITE_NETHER_ORE = ITEMS.register("moissanite_nether_ore", () -> new BlockItem(BlockInit.MOISSANITE_NETHER_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(BlockInit.ONYX_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(BlockInit.ONYX_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> GRAPHENE_BLOCK = ITEMS.register("graphene_block", () -> new BlockItem(BlockInit.GRAPHENE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}
