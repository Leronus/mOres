package mod.mores.objects.items.tools;

import com.google.common.collect.Sets;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class ToolAxe extends ItemTool
{
    public static final Set<Block> EFFECTIVE = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF,
            Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK,
            Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB, Blocks.DOUBLE_WOODEN_SLAB,
            Blocks.ACACIA_DOOR, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.ACACIA_STAIRS, Blocks.BIRCH_DOOR, Blocks.BIRCH_FENCE,
            Blocks.BIRCH_FENCE_GATE, Blocks.BIRCH_STAIRS, Blocks.DARK_OAK_DOOR, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE,
            Blocks.DARK_OAK_STAIRS, Blocks.OAK_DOOR, Blocks.OAK_STAIRS, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.JUNGLE_DOOR,
            Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.JUNGLE_STAIRS, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_DOOR, Blocks.SPRUCE_STAIRS,
            Blocks.SPRUCE_FENCE_GATE, Blocks.CACTUS, Blocks.TRAPDOOR, Blocks.TRAPPED_CHEST);

    public ToolAxe(float attackDamageIn, float attackSpeedIn, String name, ToolMaterial material)
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
        tooltip.add("Efficiency: " + TextFormatting.RED + toolMaterial.getEfficiency());
    }

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    public void registerModels()
    {
        Mores.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
