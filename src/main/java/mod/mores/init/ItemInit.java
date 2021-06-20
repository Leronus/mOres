package mod.mores.init;

import mod.mores.Mores;
import mod.mores.objects.ItemTools;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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




    //Tool Registry

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
    public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> TOURMALINE_ORE = ITEMS.register("tourmaline_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> TOURMALINE_BLOCK = ITEMS.register("tourmaline_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> MOISSANITE_ORE = ITEMS.register("moissanite_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> MOISSANITE_BLOCK = ITEMS.register("moissanite_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> GRAPHENE_BLOCK = ITEMS.register("graphene_block", () -> new BlockItem(BlockInit.GRAPHENE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}
