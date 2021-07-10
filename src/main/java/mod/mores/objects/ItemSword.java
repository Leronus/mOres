package mod.mores.objects;

import mod.mores.init.ItemInit;
import mod.mores.materials.ToolMaterial;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ItemSword extends SwordItem {
    private final int maxUses;
    private final String BONUS = "Wither Effect";

    public ItemSword(IItemTier toolMaterial, int attackDamage, float attackSpeed, Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.maxUses = toolMaterial.getUses();
    }
    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add(ITextComponent.nullToEmpty("Max Uses: " + TextFormatting.LIGHT_PURPLE + maxUses));
        if(stack.getItem() == ItemInit.ONYX_SWORD.get() || stack.getItem() == ItemInit.ONYX_MACE.get() || stack.getItem() == ItemInit.ONYX_DAGGER.get() || stack.getItem() == ItemInit.ONYX_BATTLEAXE.get()){
            tooltip.add(ITextComponent.nullToEmpty("Bonus: " + TextFormatting.BLACK + BONUS));
        }
    }

    /**
     * Called when an enemy is attacked using the sword
     * @param stack Itemstack used to attack with
     * @param target Target entity that is being attacked
     * @param attacker The entity attacking the enemy
     * @return Hurt enemy
     */
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        //If the item is an onyx sword, apply wither effect on targetEntity
        if(stack.getItem() == ItemInit.ONYX_SWORD.get() || stack.getItem() == ItemInit.ONYX_MACE.get() || stack.getItem() == ItemInit.ONYX_DAGGER.get() || stack.getItem() == ItemInit.ONYX_BATTLEAXE.get()){
            target.addEffect(new EffectInstance(Effects.WITHER, 100, 0, false, false));
            return true;
        } else{
            return super.hurtEnemy(stack, target, attacker);
        }
    }

    /**
     * Called when item is created
     * @param stack Itemstack of the item being created
     * @param world World that the player is in
     * @param playerEntity Player that created the item
     */
    @Override
    public void onCraftedBy(ItemStack stack, World world, PlayerEntity playerEntity) {
        //Add enchantment to silver sword upon creation
        if (stack.getItem() == ItemInit.SILVER_SWORD.get()) {
            stack.enchant(Enchantments.SMITE, 4);
        }
        super.onCraftedBy(stack, world, playerEntity);
    }
}
