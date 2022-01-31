package mod.mores.objects;

import mod.mores.util.AutoSmeltHandler;
import mod.mores.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ItemPickaxe extends PickaxeItem {
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;

    private final String bonus = "Auto Smelting";

    public ItemPickaxe(Tier toolMaterial, int attackDamage, float attackSpeed, Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.harvestLevel = toolMaterial.getLevel();
        this.maxUses = toolMaterial.getUses();
        this.efficiency = toolMaterial.getSpeed();
    }

//    @Override
//    public void appendHoverText(ItemStack stack, Level worldIn, List<TextComponent> tooltip, TooltipFlag flagIn){
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//        //Making the tooltips
//        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
//        tooltip.add(TextComponent.nullToEmpty("Harvest Level: " + ChatFormatting.GOLD + harvestLevel));
//        tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + maxUses));
//        tooltip.add(TextComponent.nullToEmpty("Efficiency: " + ChatFormatting.RED + efficiency));
//
//        if (stack.getItem() == ItemInit.RUBY_PICKAXE.get()){
//            tooltip.add(TextComponent.nullToEmpty("Bonus: " + ChatFormatting.DARK_RED + bonus));
//        }
//    }

    @Override
    public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos,
                             LivingEntity entityLiving)
    {
        if (this.equals(ItemInit.RUBY_PICKAXE.get())) {
            AutoSmeltHandler.INSTANCE.afterBlockSmelt(worldIn, pos, true);
        }
        return super.mineBlock(stack, worldIn, state, pos, entityLiving);
    }

//    @Override
//    public ActionResultType useOn(ItemUseContext context)
//    {
//        ActionResultType result = super.useOn(context);
//        if (this.equals(ItemInit.RUBY_PICKAXE.get())) {
//            AutoSmeltHandler.INSTANCE.onItemUse(context);
//        }
//        return result;
//    }

    @Override
    public Item asItem() {
        return this;
    }
}
