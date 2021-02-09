package mod.mores.objects.blocks.machines;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.objects.BlockBase;
import mod.mores.particle.FlameParticle;
import mod.mores.particle.ParticleCustom;
import mod.mores.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidActionResult;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;

import java.util.Random;
import java.util.logging.Logger;

public class BlockAlloySmelter extends Block {
    //public static final PropertyDirection FACING;
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    protected boolean isBurning;
    private static Block unlit_furnace;
    private static Block lit_furnace;
    protected static boolean keepInventory;

    public BlockAlloySmelter(String name, Material material, CreativeTabs creativeTab, boolean isBurning) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(creativeTab);

        setSoundType(SoundType.ANVIL);
        setHardness(5.0f);
        setResistance(30.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.0f);
        // setLightOpacity(1);
        // setBlockUnbreakable();

        Reference.LOGGER.info("Block is reset to default state");

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        this.isBurning = isBurning;

        //setLit_furnace(BlockInit.ALLOY_FURNACE_LIT);
        setUnlit_furnace(BlockInit.ALLOY_FURNACE);
    }
    public static Block getUnlit_furnace() {
        return unlit_furnace;
    }

    public static void setUnlit_furnace(Block unlit_furnace) {
        BlockAlloySmelter.unlit_furnace = unlit_furnace;
    }

    public static Block getLit_furnace() {
        return lit_furnace;
    }

    public static void setLit_furnace(Block lit_furnace) {
        BlockAlloySmelter.lit_furnace = lit_furnace;
    }
    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState state = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (active) {
            //worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE_LIT.getDefaultState()
                    //.withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)), 1 | 2);
            //worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE_LIT.getDefaultState()
                    //.withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)), 1 | 2);
            Reference.LOGGER.info("Furnace is burning!");
        } else
            worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE.getDefaultState()
                    .withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)), 1 | 2);
            worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE.getDefaultState()
                    .withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)), 1 | 2);

        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }


    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(BlockInit.ALLOY_FURNACE);

    }
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(BlockInit.ALLOY_FURNACE);

    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
                                    EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote)
        {
            playerIn.openGui(Mores.instance, Reference.GUI_ALLOY_FURNACE, worldIn, pos.getX(), pos.getY(), pos.getZ());
            Reference.LOGGER.info("Furnace GUI opened!");
        }
        return true;
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        // TODO Auto-generated method stub

        if (!worldIn.isRemote) {

            IBlockState north = worldIn.getBlockState(pos.north());
            IBlockState south = worldIn.getBlockState(pos.south());
            IBlockState west = worldIn.getBlockState(pos.west());
            IBlockState east = worldIn.getBlockState(pos.east());
            EnumFacing face = state.getValue(FACING);

            if (face == EnumFacing.NORTH)
                face = EnumFacing.SOUTH;
            if (face == EnumFacing.SOUTH)
                face = EnumFacing.NORTH;
            if (face == EnumFacing.WEST)
                face = EnumFacing.EAST;
            if (face == EnumFacing.EAST)
                face = EnumFacing.WEST;
            worldIn.setBlockState(pos, state.withProperty(FACING, face), 2);
        }
    }


    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
        // TODO Auto-generated method stub
        return isBurning ? 15 : 0;
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
                                            float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        // TODO Auto-generated method stub
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        // TODO Auto-generated method stub
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        // TODO Auto-generated method stub
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        // TODO Auto-generated method stub
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        // TODO Auto-generated method stub
        EnumFacing facing = EnumFacing.getFront(meta);
        if (facing.getAxis() == EnumFacing.Axis.Y)
            facing = EnumFacing.NORTH;
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        // TODO Auto-generated method stub
        return state.getValue(FACING).getIndex();
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public TileEntityAlloySmelter createTileEntity(World world, IBlockState state) {
        // TODO Auto-generated method stub
        return new TileEntityAlloySmelter();
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        // TODO Auto-generated method stub
        TileEntity te = worldIn.getTileEntity(pos);
        if (te instanceof TileEntityAlloySmelter) {
            for (ItemStack stack : ((TileEntityAlloySmelter) te).containerLists()) {
                spawnAsEntity(worldIn, pos, stack);
            }
        }
        super.breakBlock(worldIn, pos, state);
    }

    @SideOnly(Side.CLIENT)
    @SuppressWarnings("incomplete-switch")
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (isBurning)
        {
            EnumFacing enumfacing = stateIn.getValue(FACING);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            if (rand.nextDouble() < 0.1D)
            {
                worldIn.playSound((double)pos.getX() + 0.5D, pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            switch (enumfacing) {
                case WEST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    Particle newEffectWest = new ParticleCustom(new ParticleCustom.TextureDefinition("flame_fx"), worldIn, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    Minecraft.getMinecraft().effectRenderer.addEffect(newEffectWest);
                    break;
                case EAST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    Particle newEffectEast = new ParticleCustom(new ParticleCustom.TextureDefinition("flame_fx"), worldIn, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    Minecraft.getMinecraft().effectRenderer.addEffect(newEffectEast);
                    break;
                case NORTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                    Particle newEffectNorth = new ParticleCustom(new ParticleCustom.TextureDefinition("flame_fx"), worldIn, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                    Minecraft.getMinecraft().effectRenderer.addEffect(newEffectNorth);
                    break;
                case SOUTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
                    Particle newEffectSouth = new ParticleCustom(new ParticleCustom.TextureDefinition("flame_fx"), worldIn, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
                    Minecraft.getMinecraft().effectRenderer.addEffect(newEffectSouth);
            }
        }
    }
}