package mod.mores.item;

import net.minecraft.world.item.*;

public class ItemAxe extends AxeItem {
    private final String bonus = "Auto Smelting";

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;

    public ItemAxe(Tier toolMaterial, float attackDamage, float attackSpeed, Properties itemProperties) {
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
//        if (stack.getItem() == ItemInit.RUBY_AXE.get()){
//            tooltip.add(TextComponent.nullToEmpty("Bonus: " + ChatFormatting.DARK_RED + bonus));
//        }
//    }

    @Override
    public Item asItem() {
        return this;
    }
}
