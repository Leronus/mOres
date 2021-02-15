package mod.mores.world.gen;

import mod.mores.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenOres implements IWorldGenerator {

    private int one = 1;
    private int two = one + one;
    private int three = one + two;


    private int minOne_maxFour = (int)(Math.random() * 4) + 1;
    private int minOne_maxFive = one + (int)(Math.random() * 5);

    private int minTwo_maxFour = one + ((int)(Math.random() * 3) + 1);
    private int minTwo_maxFive = one + ((int)(Math.random() * 4) + 1);
    private int minTwo_maxSix = two + (int)(Math.random() * 4);
    private int minTwo_maxThree = two + (int)(Math.random() * 1);
    private int minTwo_maxSeven = two + (int)(Math.random() * 5);
    private int minTwo_maxTen = one + ((int)(Math.random() * 9) + 1);

    private int minThree_maxEight = one + ((int)(Math.random() * 7) + 2);
    private int minThree_maxNine = three + ((int)(Math.random() * 6) + 1);

    private int minFour_maxEleven = one + one + one + one + ((int)(Math.random() * 7) + 1);

    private WorldGenerator amethyst_ore;
    private WorldGenerator moissanite_nether_ore;
    private WorldGenerator onyx_ore;
    private WorldGenerator ruby_ore;
    private WorldGenerator sapphire_ore;
    private WorldGenerator tourmaline_ore;
    private WorldGenerator tanzanite_ore;
    private WorldGenerator topaz_ore;
    private WorldGenerator turquoise_ore;
    private WorldGenerator copper_ore;
    private WorldGenerator silver_ore;
    private WorldGenerator tin_ore;
    private WorldGenerator cobalt_ore;
    //private WorldGenerator moissanite_overworld_ore;



    public WorldGenOres() {
        tin_ore = new WorldGenMinable(BlockInit.TIN_ORE.getDefaultState(), minFour_maxEleven);
        copper_ore = new WorldGenMinable(BlockInit.COPPER_ORE.getDefaultState(), minFour_maxEleven);
        silver_ore = new WorldGenMinable(BlockInit.SILVER_ORE.getDefaultState(), minThree_maxNine);

        cobalt_ore = new WorldGenMinable(BlockInit.COBALT_ORE.getDefaultState(), minThree_maxEight);
        amethyst_ore = new WorldGenMinable(BlockInit.AMETHYST_ORE.getDefaultState(), minTwo_maxSeven);

        topaz_ore = new WorldGenMinable(BlockInit.TOPAZ_ORE.getDefaultState(), minThree_maxEight);
        tourmaline_ore = new WorldGenMinable(BlockInit.TOURMALINE_ORE.getDefaultState(), minTwo_maxSeven);
        tanzanite_ore = new WorldGenMinable(BlockInit.TANZANITE_ORE.getDefaultState(), minTwo_maxSix, BlockMatcher.forBlock(Blocks.NETHERRACK));

        ruby_ore = new WorldGenMinable(BlockInit.RUBY_ORE.getDefaultState(), minOne_maxFive);
        sapphire_ore = new WorldGenMinable(BlockInit.SAPPHIRE_ORE.getDefaultState(), minOne_maxFour);

        turquoise_ore = new WorldGenMinable(BlockInit.TURQUOISE_ORE.getDefaultState(), minOne_maxFour);
        moissanite_nether_ore = new WorldGenMinable(BlockInit.MOISSANITE_NETHER_ORE.getDefaultState(), minTwo_maxFour, BlockMatcher.forBlock(Blocks.NETHERRACK));
        onyx_ore = new WorldGenMinable(BlockInit.ONYX_ORE.getDefaultState(), minTwo_maxSix, BlockMatcher.forBlock(Blocks.END_STONE));
    }


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        //Overworld
        if(world.provider.getDimension() == 0)
        {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        //End
        if(world.provider.getDimension() == 1)
        {
            generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        //Nether
        if(world.provider.getDimension() == -1)
        {
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(tin_ore, world, random, chunkX * 16, chunkZ * 16, 50, 80, 45);
        generateOre(copper_ore, world, random, chunkX * 16, chunkZ * 16, 45, 75, 50);
        generateOre(silver_ore, world, random, chunkX * 16, chunkZ * 16, 30, 60, 30);
        generateOre(cobalt_ore, world, random, chunkX * 16, chunkZ * 16, 25, 48, 25);
        generateOre(amethyst_ore, world, random, chunkX * 16, chunkZ * 16, 20, 40, 20);
        generateOre(topaz_ore, world, random, chunkX * 16, chunkZ * 16, 10, 32, 13);
        generateOre(tourmaline_ore, world, random, chunkX * 16, chunkZ * 16, 8, 37, 15);
        generateOre(ruby_ore, world, random, chunkX * 16, chunkZ * 16, 7, 18, 9);
        generateOre(sapphire_ore, world, random, chunkX * 16, chunkZ * 16, 8, 18, 10);
        generateOre(turquoise_ore, world, random, chunkX * 16, chunkZ * 16, 0, 8, 4);
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(moissanite_nether_ore, world, random, chunkX * 16, chunkZ * 16, 0, 50, 35);
        generateOre(tanzanite_ore, world, random, chunkX * 16, chunkZ * 16, 0, 70, 50);
    }
    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(onyx_ore, world, random, chunkX * 16, chunkZ * 16, 30, 100, 10);
    }


    private void generateOre(WorldGenerator gen, World world, Random random, int x, int z, int minY, int maxY, int chances)
    {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++)
        {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            gen.generate(world, random, pos);
        }
    }
}
