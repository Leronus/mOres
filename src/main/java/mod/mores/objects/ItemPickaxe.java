package mod.mores.objects;

import mod.mores.helper.AutoSmeltHandler;
import mod.mores.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemPickaxe extends PickaxeItem {
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;

    public ItemPickaxe(IItemTier toolMaterial, int attackDamage, float attackSpeed, Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.harvestLevel = toolMaterial.getLevel();
        this.maxUses = toolMaterial.getUses();
        this.efficiency = toolMaterial.getSpeed();
    }

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add(ITextComponent.nullToEmpty("Harvest Level: " + TextFormatting.GOLD + harvestLevel));
        tooltip.add(ITextComponent.nullToEmpty("Max Uses: " + TextFormatting.LIGHT_PURPLE + maxUses));
        tooltip.add(ITextComponent.nullToEmpty("Efficiency: " + TextFormatting.RED + efficiency));
    }
    @Override
    public boolean mineBlock(ItemStack stack, World worldIn, BlockState state, BlockPos pos,
                             LivingEntity entityLiving)
    {
        if (this.equals(ItemInit.RUBY_PICKAXE.get())) {
            AutoSmeltHandler.INSTANCE.afterBlockSmelt(worldIn, pos, true);
        }
        return super.mineBlock(stack, worldIn, state, pos, entityLiving);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context)
    {
        if (this.equals(ItemInit.RUBY_PICKAXE.get())) {
            ActionResultType result = super.useOn(context);
            AutoSmeltHandler.INSTANCE.onItemUse(context);
            return result;
        }
        else{
            return ActionResultType.FAIL;
        }
    }

    @Override
    public Item asItem() {
        return this;
    }
}
