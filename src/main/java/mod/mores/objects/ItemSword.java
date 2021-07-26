package mod.mores.objects;

import mod.mores.init.ItemInit;
import mod.mores.materials.ToolMaterial;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemSword extends SwordItem {
    private final int maxUses;
    private final String bonusEffectWither = "Wither Effect";
    private final String bonusEffectBurn = "Burn Effect";


    public ItemSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.maxUses = toolMaterial.getUses();
    }
    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        //Making the tooltips
        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
        tooltip.add(Component.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + maxUses));
        if(stack.getItem() == ItemInit.ONYX_SWORD.get() || stack.getItem() == ItemInit.ONYX_MACE.get() || stack.getItem() == ItemInit.ONYX_DAGGER.get() || stack.getItem() == ItemInit.ONYX_BATTLEAXE.get()){
            tooltip.add(Component.nullToEmpty("Bonus: " + ChatFormatting.BLACK + bonusEffectWither));
        }
        if (stack.getItem() == ItemInit.RUBY_SWORD.get() || stack.getItem() == ItemInit.RUBY_MACE.get() || stack.getItem() == ItemInit.RUBY_BATTLEAXE.get() || stack.getItem() == ItemInit.RUBY_DAGGER.get()){
            tooltip.add(Component.nullToEmpty("Bonus: " + ChatFormatting.RED + bonusEffectBurn));
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
        if(stack.getItem() == ItemInit.ONYX_SWORD.get() || stack.getItem() == ItemInit.ONYX_MACE.get() || stack.getItem() == ItemInit.ONYX_DAGGER.get() || stack.getItem() == ItemInit.ONYX_BATTLEAXE.get()) {
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0, false, false));
        }
        else if (stack.getItem() == ItemInit.RUBY_SWORD.get() || stack.getItem() == ItemInit.RUBY_MACE.get() || stack.getItem() == ItemInit.RUBY_BATTLEAXE.get() || stack.getItem() == ItemInit.RUBY_DAGGER.get()) {
            target.setSecondsOnFire(5);
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    /**
     * Called when item is created
     * @param stack Itemstack of the item being created
     * @param world World that the player is in
     * @param playerEntity Player that created the item
     */
    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player playerEntity) {
        //Add enchantment to silver sword upon creation
        if (stack.getItem() == ItemInit.SILVER_SWORD.get()) {
            stack.enchant(Enchantments.SMITE, 4);
        }
        super.onCraftedBy(stack, world, playerEntity);
    }
}
