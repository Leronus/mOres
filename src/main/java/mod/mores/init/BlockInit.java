package mod.mores.init;

import mod.mores.modid.Mores;
import mod.mores.objects.BlockBase;
import mod.mores.objects.blocks.machines.BlockAlloyFurnace;
import mod.mores.objects.blocks.ores.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks

    //Copper
    public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 5.0F, 30.0F, 2, "pickaxe");
    public static final Block COPPER_ORE = new OreBase("copper_ore",Material.ROCK, 3.0F, 15.0F, 2, "pickaxe");

    //Tin
    public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON, 5.0F, 30.0F, 0, "pickaxe");
    public static final Block TIN_ORE = new OreBase("tin_ore", Material.ROCK, 3.0F, 15.0F, 0, "pickaxe");

    //Silver
    public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON, 5.0F, 30.0F, 2, "pickaxe");
    public static final Block SILVER_ORE = new OreBase("silver_ore", Material.ROCK, 3.0F, 15.0F, 2, "pickaxe");

    //Bronze
    public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON, 10.0F, 50.0F, 3, "pickaxe");

    //Cobalt
    public static final Block COBALT_BLOCK = new BlockBase("cobalt_block", Material.IRON, 5.0F, 30.0F, 4, "pickaxe");
    public static final Block COBALT_ORE = new OreBase("cobalt_ore", Material.ROCK, 3.0F, 15.0F, 4, "pickaxe");

    //Steel
    public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, 15.0F, 100.0F, 3, "pickaxe");

    //Amethyst
    public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON, 5.0F, 30.0F, 5, "pickaxe");
    public static final Block AMETHYST_ORE = new AmethystOreBase("amethyst_ore", Material.ROCK, 3.0F, 15.0F, 5, "pickaxe");

    //Topaz
    public static final Block TOPAZ_BLOCK = new BlockBase("topaz_block", Material.IRON, 5.0F, 30.0F, 6, "pickaxe");
    public static final Block TOPAZ_ORE = new TopazOreBase("topaz_ore", Material.ROCK, 3.0F, 15.0F, 6, "pickaxe");

    //Tourmaline
    public static final Block TOURMALINE_BLOCK = new BlockBase("tourmaline_block", Material.IRON, 5.0F, 30.0F, 6, "pickaxe");
    public static final Block TOURMALINE_ORE = new TourmalineOreBase("tourmaline_ore", Material.ROCK, 3.0F, 15.0F, 6, "pickaxe");

    //Tanzanite
    public static final Block TANZANITE_BLOCK = new BlockBase("tanzanite_block", Material.IRON, 5.0F, 30.0F, 5, "pickaxe");
    public static final Block TANZANITE_ORE = new TanzaniteOreBase("tanzanite_ore", Material.ROCK, 3.0F, 15.0F, 5, "pickaxe");

    //Ruby
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 5.0F, 30.0F, 7, "pickaxe");
    public static final Block RUBY_ORE = new RubyOreBase("ruby_ore", Material.ROCK, 3.0F, 15.0F, 7, "pickaxe");

    //Sapphire
    public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON, 5.0F, 30.0F, 7, "pickaxe");
    public static final Block SAPPHIRE_ORE = new SapphireOreBase("sapphire_ore", Material.ROCK, 3.0F, 15.0F, 7, "pickaxe");

    //Turquoise
    public static final Block TURQUOISE_BLOCK = new BlockBase("turquoise_block", Material.IRON, 5.0F, 30.0F, 8, "pickaxe");
    public static final Block TURQUOISE_ORE = new TurquoiseOreBase("turquoise_ore", Material.ROCK, 3.0F, 15.0F, 8, "pickaxe");

    //Moissanite
    public static final Block MOISSANITE_BLOCK = new BlockBase("moissanite_block", Material.IRON, 5.0F, 30.0F, 7, "pickaxe");
    public static final Block MOISSANITE_NETHER_ORE = new MoissaniteOreBase("moissanite_nether_ore", Material.ROCK, 3.0F, 15.0F, 7, "pickaxe");

    //Onyx
    public static final Block ONYX_BLOCK = new BlockBase("onyx_block", Material.IRON, 5.0F, 30.0F, 8, "pickaxe");
    public static final Block ONYX_ORE = new OnyxOreBase("onyx_ore", Material.ROCK, 3.0F, 15.0F, 8, "pickaxe");

    //Turquartz
    public static final Block TURQUARTZ_BLOCK = new BlockBase("turquartz_block", Material.IRON, 15.0F, 100.0F, 7, "pickaxe");

    //Graphene
    public static final Block GRAPHENE_BLOCK = new BlockBase("graphene_block", Material.IRON, 15.0F, 100.0F, 8, "pickaxe");

    public static final Block ALLOY_FURNACE = new BlockAlloyFurnace("alloy_furnace", Material.IRON, Mores.MORESBLOCKSTAB);
    //public static final Block ALLOY_FURNACE_LIT = new BlockAlloySmelter("alloy_furnace_lit", Material.IRON, Mores.MORESBLOCKSTAB, true);
}
