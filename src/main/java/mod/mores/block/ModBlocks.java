package mod.mores.block;

import mod.mores.Mores;
import mod.mores.item.ModItems;
import mod.mores.item.ModTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/**
 * Class that initialises all blocks from mOres
 * @author Leronus
 */
public class ModBlocks {
    /**
     * Registers all mOres blocks
     */
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mores.MODID);
    public static final DeferredRegister<Block> VANILLA_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");



    /**
     * Fills the registry with blocks
     */
    //.strength(destroyTime, blastResistance)
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);

    //In 1.18.1 copper ore & blocks are added by vanilla
//    public static final RegistryObject<Block> COPPER_ORE = registerBlock("copper_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
//    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
//    public static final RegistryObject<Block> RAW_COPPER_BLOCK = registerBlock("raw_copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
//    public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE = registerBlock("deepslate_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(4.5F, 3.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> NETHER_SILVER_ORE = registerBlock("nether_silver_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);

    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_ORES);

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> STERLING_BLOCK = registerBlock("sterling_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 6)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 6)), ModTabs.MORES_ORES);

    public static final RegistryObject<Block> TOURMALINE_ORE = registerBlock("tourmaline_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> TOURMALINE_BLOCK = registerBlock("tourmaline_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TOURMALINE_ORE = registerBlock("deepslate_tourmaline_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModTabs.MORES_ORES);

//    public static final RegistryObject<Block> OBSIDIAN = VANILLA_BLOCKS.register("obsidian", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));

    public static final RegistryObject<Block> NETHER_TANZANITE_ORE = registerBlock("nether_tanzanite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> TANZANITE_BLOCK = registerBlock("tanzanite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.LAPIS).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);

    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 9)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_TURQUOISE_ORE = registerBlock("deepslate_turquoise_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.LAPIS).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 9)), ModTabs.MORES_ORES);

//    public static final RegistryObject<Block> DIAMOND_ORE = VANILLA_BLOCKS.register("diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIAMOND).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));, ModTabs.MORES_BLOCKS
//    public static final RegistryObject<Block> DIAMOND_BLOCK = VANILLA_BLOCKS.register("diamond_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock("nether_ruby_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);

    public static final RegistryObject<Block> MOISSANITE_ORE = registerBlock("moissanite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> MOISSANITE_BLOCK = registerBlock("moissanite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);
    public static final RegistryObject<Block> MOISSANITE_NETHER_ORE = registerBlock("nether_moissanite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 8)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> DEEPSLATE_MOISSANITE_ORE = registerBlock("deepslate_moissanite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(4.5F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 8)), ModTabs.MORES_ORES);

//    public static final RegistryObject<Block> ANCIENT_DEBRIS = VANILLA_BLOCKS.register("ancient_debris", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));
//    public static final RegistryObject<Block> NETHERITE_BLOCK = VANILLA_BLOCKS.register("netherite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops().strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> ONYX_ORE = registerBlock("onyx_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(4, 10)), ModTabs.MORES_ORES);
    public static final RegistryObject<Block> ONYX_BLOCK = registerBlock("onyx_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

    public static final RegistryObject<Block> GRAPHENE_BLOCK = registerBlock("graphene_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

//    public static final RegistryObject<Block> DEEPSLATE_BLOCK = registerBlock("deepslate_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().lootFrom(ModBlocks.COBBLED_DEEPSLATE)), ModTabs.MORES_BLOCKS);
//    public static final RegistryObject<Block> COBBLED_DEEPSLATE = registerBlock("cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 3.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), ModTabs.MORES_BLOCKS);

//    public static final RegistryObject<BlockAlloyFurnace> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", () -> new BlockAlloyFurnace(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops().lightLevel(lit_makes_light())));

    private static ToIntFunction<BlockState> lit_makes_light() {
        return (bar) -> bar.getValue(BlockStateProperties.LIT) ? 13 : 0;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

