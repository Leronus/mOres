package mod.leronus.mores.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class ModBattleAxeItem extends SwordItem {

    public ModBattleAxeItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, attackDamageModifier, attackSpeedModifier)));
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        // Disable sweeping edge
        if (toolAction == ToolActions.SWORD_SWEEP) return false;

        return super.canPerformAction(stack, toolAction);
    }
}
