package mod.mores.core.init;

import mod.mores.Mores;
import mod.mores.objects.BlockOre;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final DeferredRegister<Block> VANILLA_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");



    /**
     * Fills the registry with blocks
     */
    //.strength(destroyTime, blastResistance)
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = BLOCKS.register("raw_copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE = BLOCKS.register("deepslate_copper_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(4.5F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_SILVER_ORE = BLOCKS.register("nether_silver_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = BLOCKS.register("raw_cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register("deepslate_cobalt_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STERLING_BLOCK = BLOCKS.register("sterling_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = BLOCKS.register("deepslate_amethyst_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = BLOCKS.register("deepslate_topaz_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    public static final RegistryObject<Block> TOURMALINE_ORE = BLOCKS.register("tourmaline_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TOURMALINE_BLOCK = BLOCKS.register("tourmaline_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TOURMALINE_ORE = BLOCKS.register("deepslate_tourmaline_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> OBSIDIAN = VANILLA_BLOCKS.register("obsidian", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));

    public static final RegistryObject<Block> TANZANITE_ORE = BLOCKS.register("tanzanite_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TANZANITE_BLOCK = BLOCKS.register("tanzanite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.LAPIS).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = BLOCKS.register("nether_sapphire_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));

    public static final RegistryObject<Block> TURQUOISE_ORE = BLOCKS.register("turquoise_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 9)));
    public static final RegistryObject<Block> TURQUOISE_BLOCK = BLOCKS.register("turquoise_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TURQUOISE_ORE = BLOCKS.register("deepslate_turquoise_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 9)));

    public static final RegistryObject<Block> DIAMOND_ORE = VANILLA_BLOCKS.register("diamond_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIAMOND).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DIAMOND_BLOCK = VANILLA_BLOCKS.register("diamond_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));
    public static final RegistryObject<Block> NETHER_RUBY_ORE = BLOCKS.register("nether_ruby_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));

    public static final RegistryObject<Block> MOISSANITE_ORE = BLOCKS.register("moissanite_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));
    public static final RegistryObject<Block> MOISSANITE_BLOCK = BLOCKS.register("moissanite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOISSANITE_NETHER_ORE = BLOCKS.register("moissanite_nether_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 8)));
    public static final RegistryObject<Block> DEEPSLATE_MOISSANITE_ORE = BLOCKS.register("deepslate_moissanite_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 8)));

    public static final RegistryObject<Block> ANCIENT_DEBRIS = VANILLA_BLOCKS.register("ancient_debris", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> NETHERITE_BLOCK = VANILLA_BLOCKS.register("netherite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", () -> new BlockOre(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(4, 10)));
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GRAPHENE_BLOCK = BLOCKS.register("graphene_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_BLOCK = BLOCKS.register("deepslate_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().lootFrom(BlockInit.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE = BLOCKS.register("cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

//    public static final RegistryObject<BlockAlloyFurnace> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", () -> new BlockAlloyFurnace(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().lightLevel(lit_makes_light())));

    private static ToIntFunction<BlockState> lit_makes_light() {
        return (bar) -> bar.getValue(BlockStateProperties.LIT) ? 13 : 0;
    }
}

