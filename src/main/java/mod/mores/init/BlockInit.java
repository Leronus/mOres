package mod.mores.init;

import mod.mores.Mores;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class to initialise all blocks from mores
 */
public class BlockInit {
    /**
     * Register all mores blocks
     */
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mores.MOD_ID);

    //Item Registry
    /**
     * .strength(destroyTime, blastResistance)
     */
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(4.5F, 3.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = BLOCKS.register("raw_copper_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.PICKAXE).harvestLevel(0).strength(4.5F, 3.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(4.5F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NETHER_SILVER_ORE = BLOCKS.register("nether_silver_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).harvestTool(ToolType.PICKAXE).harvestLevel(1).strength(3.0F, 3.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = BLOCKS.register("raw_cobalt_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register("deepslate_cobalt_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(4.5F, 3.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> STERLING_BLOCK = BLOCKS.register("sterling_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BROWN).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TOURMALINE_ORE = BLOCKS.register("tourmaline_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TOURMALINE_BLOCK = BLOCKS.register("tourmaline_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TANZANITE_ORE = BLOCKS.register("tanzanite_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TANZANITE_BLOCK = BLOCKS.register("tanzanite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.LAPIS).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(4).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> MOISSANITE_ORE = BLOCKS.register("moissanite_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MOISSANITE_BLOCK = BLOCKS.register("moissanite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MOISSANITE_NETHER_ORE = BLOCKS.register("moissanite_nether_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).harvestLevel(5).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> GRAPHENE_BLOCK = BLOCKS.register("graphene_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).harvestTool(ToolType.PICKAXE).harvestLevel(6).strength(5.0F, 6.0F).sound(SoundType.METAL)));
}

