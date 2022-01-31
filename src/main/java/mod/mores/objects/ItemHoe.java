package mod.mores.objects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemHoe extends HoeItem {
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;

    public ItemHoe(Tier toolMaterial, int attackDamage, float attackSpeed, Properties itemProperties) {
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
//    }

    @Override
    public Item asItem() {
        return this;
    }
}
