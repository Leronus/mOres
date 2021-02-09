package mod.mores.objects;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
    public BlockBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESBLOCKSTAB);

        setSoundType(SoundType.METAL);

        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
