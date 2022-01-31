package mod.mores.objects;

import mod.mores.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemSword extends SwordItem {
    private final int maxUses;
    private final String bonusEffectWither = "Wither Effect";
    private final String bonusEffectBurn = "Burn Effect";


    public ItemSword(Tier toolMaterial, int attackDamage, float attackSpeed, Item.Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.maxUses = toolMaterial.getUses();
    }
//    @Override
//    public void appendHoverText(ItemStack stack, Level worldIn, List<TextComponent> tooltip, TooltipFlag flagIn){
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//        //Making the tooltips
//        //tooltip.add("Text: " + TextFormatting.COLOR + toolMaterial.get);
//        tooltip.add(TextComponent.nullToEmpty("Max Uses: " + ChatFormatting.LIGHT_PURPLE + maxUses));
//        if(stack.getItem() == ItemInit.ONYX_SWORD.get() || stack.getItem() == ItemInit.ONYX_MACE.get() || stack.getItem() == ItemInit.ONYX_DAGGER.get() || stack.getItem() == ItemInit.ONYX_BATTLEAXE.get()){
//            tooltip.add(TextComponent.nullToEmpty("Bonus: " + ChatFormatting.DARK_GRAY + bonusEffectWither));
//        }
//        if (stack.getItem() == ItemInit.RUBY_SWORD.get() || stack.getItem() == ItemInit.RUBY_MACE.get() || stack.getItem() == ItemInit.RUBY_BATTLEAXE.get() || stack.getItem() == ItemInit.RUBY_DAGGER.get()){
//            tooltip.add(TextComponent.nullToEmpty("Bonus: " + ChatFormatting.RED + bonusEffectBurn));
//        }
//    }

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
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 250, 1, false, false));
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    /**
     * Called when item is created
     * @param stack Itemstack of the item being created
     * @param world Level that the player is in
     * @param playerEntity Player that created the item
     */
    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player playerEntity) {
        //Add enchantment to silver sword upon creation
        if (stack.getItem() == ItemInit.SILVER_SWORD.get() || stack.getItem() == ItemInit.SILVER_DAGGER.get()
        || stack.getItem() == ItemInit.SILVER_MACE.get() ||  stack.getItem() == ItemInit.SILVER_BATTLEAXE.get()) {
            stack.enchant(Enchantments.SMITE, 2);
        } else if (stack.getItem() == ItemInit.RUBY_SWORD.get() || stack.getItem() == ItemInit.RUBY_DAGGER.get()
                || stack.getItem() == ItemInit.RUBY_MACE.get() ||  stack.getItem() == ItemInit.RUBY_BATTLEAXE.get())
            stack.enchant(Enchantments.FIRE_ASPECT, 1);
        super.onCraftedBy(stack, world, playerEntity);
    }
}
