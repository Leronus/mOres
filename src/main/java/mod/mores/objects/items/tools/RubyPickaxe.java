package mod.mores.objects.items.tools;

import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.util.handlers.FireHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class RubyPickaxe extends ItemPickaxe
{

    public RubyPickaxe(String name, ToolMaterial material)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESTOOLSTAB);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add("Harvest Level: " + TextFormatting.GOLD + toolMaterial.getHarvestLevel());
        tooltip.add("Max Uses: " + TextFormatting.LIGHT_PURPLE + toolMaterial.getMaxUses());
        tooltip.add("Efficiency: " + TextFormatting.RED + toolMaterial.getEfficiency());
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn,
                                    IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        FireHandler.INSTANCE.afterBlockSmelt(worldIn, pos, true);

        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }


    /*
    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn,
                                      World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing,
                                      float hitX, float hitY, float hitZ)
    {
        EnumActionResult result
                = FireHandler.INSTANCE.onItemUse(playerIn, worldIn, pos, hand, facing,
                hitX, hitY, hitZ);
        if (result != EnumActionResult.PASS) {
            return result;
        }
        else {
            return super.onItemUse(playerIn, worldIn, pos, hand, facing,
                    hitX, hitY, hitZ);
        }
    } // onItemUse()
     */


} // end class

