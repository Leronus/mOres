package mod.mores.objects.blocks.ores;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
//import mod.mores.util.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class OreBase extends Block
{
    //public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.create("variant", EnumHandler.EnumType.class);

    private final String name;
    //private final String dimension;

    public OreBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESORESTAB);

        setSoundType(SoundType.STONE);

        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);

        this.name = name;
        //this.dimension = dimension;

        //setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.MOISSANITE));

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        //Diamond value, BlockOre class
        return MathHelper.getInt(rand, 0, 1);
    }
    /*
    public int damageDropped(IBlockState state){
        return state.getValue(VARIANT).getMeta();
    }
    public int getMetaFromState(IBlockState state){
        return state.getValue(VARIANT).getMeta();
    }

    public IBlockState getMetaFromState(int meta){
        return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player){
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
    }

    public void getSubFromBlock(CreativeTabs itemIn, NonNullList<ItemStack> items){
        for(EnumHandler.EnumType variant : EnumHandler.EnumType.values()){
            items.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }

    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, VARIANT);
    }
     */
}
