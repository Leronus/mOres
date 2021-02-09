package mod.mores.objects.items.tools;

import com.google.common.collect.Sets;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.Set;

public class ToolDagger extends ItemTool {

    public static final Set<Block> EFFECTIVE = Sets.newHashSet();

    public ToolDagger(float attackDamageIn, float attackSpeedIn, String name, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE);

        this.attackDamage = attackDamageIn;
        this.attackSpeed = attackSpeedIn;

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Mores.MORESTOOLSTAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add("Max Uses: " + TextFormatting.LIGHT_PURPLE + toolMaterial.getMaxUses());
    }

    /*
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
     */

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
