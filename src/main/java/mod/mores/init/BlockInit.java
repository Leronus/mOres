package mod.mores.init;

import mod.mores.Mores;
import mod.mores.objects.BlockAlloyFurnace;
import mod.mores.objects.BlockOre;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

/**
 * Class that initialises all blocks from mOres
 * @author Leronus
 */
public class BlockInit {
    /**
     * Registers all mOres blocks
     */
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mores.MODID);



    /**
     * Fills the registry with blocks
     */
    //.strength(destroyTime, blastResistance)
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = BLOCKS.register("raw_copper_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(4.5F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_SILVER_ORE = BLOCKS.register("nether_silver_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = BLOCKS.register("raw_cobalt_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register("deepslate_cobalt_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STERLING_BLOCK = BLOCKS.register("sterling_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = BLOCKS.register("deepslate_amethyst_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = BLOCKS.register("deepslate_topaz_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOURMALINE_ORE = BLOCKS.register("tourmaline_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOURMALINE_BLOCK = BLOCKS.register("tourmaline_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TOURMALINE_ORE = BLOCKS.register("deepslate_tourmaline_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TANZANITE_ORE = BLOCKS.register("tanzanite_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TANZANITE_BLOCK = BLOCKS.register("tanzanite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = BLOCKS.register("nether_sapphire_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TURQUOISE_ORE = BLOCKS.register("turquoise_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TURQUOISE_BLOCK = BLOCKS.register("turquoise_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TURQUOISE_ORE = BLOCKS.register("deepslate_turquoise_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_RUBY_ORE = BLOCKS.register("nether_ruby_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOISSANITE_ORE = BLOCKS.register("moissanite_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOISSANITE_BLOCK = BLOCKS.register("moissanite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOISSANITE_NETHER_ORE = BLOCKS.register("moissanite_nether_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_MOISSANITE_ORE = BLOCKS.register("deepslate_moissanite_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", () -> new BlockOre(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAPHENE_BLOCK = BLOCKS.register("graphene_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).harvestLevel(6).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_BLOCK = BLOCKS.register("deepslate_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().lootFrom(BlockInit.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = BLOCKS.register("cobbled_deepslate", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<BlockAlloyFurnace> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", () -> new BlockAlloyFurnace(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().lightLevel(lit_makes_light())));

    private static ToIntFunction<BlockState> lit_makes_light() {
        return (bar) -> bar.getValue(BlockStateProperties.LIT) ? 13 : 0;
    }
}

