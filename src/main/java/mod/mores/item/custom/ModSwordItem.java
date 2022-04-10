package mod.mores.item.custom;

import mod.mores.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class ModSwordItem extends SwordItem {
    private final int maxUses;


    public ModSwordItem(Tier toolMaterial, int attackDamage, float attackSpeed, Item.Properties itemProperties) {
        super(toolMaterial, attackDamage, attackSpeed, itemProperties);
        this.maxUses = toolMaterial.getUses();
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
        if(stack.getItem() == ModItems.ONYX_SWORD.get() || stack.getItem() == ModItems.ONYX_MACE.get() || stack.getItem() == ModItems.ONYX_DAGGER.get() || stack.getItem() == ModItems.ONYX_BATTLEAXE.get()) {
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
        if (stack.getItem() == ModItems.SILVER_SWORD.get() || stack.getItem() == ModItems.SILVER_DAGGER.get()
                || stack.getItem() == ModItems.SILVER_MACE.get() ||  stack.getItem() == ModItems.SILVER_BATTLEAXE.get()) {
            stack.enchant(Enchantments.SMITE, 2);
        } else if (stack.getItem() == ModItems.RUBY_SWORD.get() || stack.getItem() == ModItems.RUBY_DAGGER.get()
                || stack.getItem() == ModItems.RUBY_MACE.get() ||  stack.getItem() == ModItems.RUBY_BATTLEAXE.get())
            stack.enchant(Enchantments.FIRE_ASPECT, 1);
        super.onCraftedBy(stack, world, playerEntity);
    }

    public int getMaxUses() {
        return maxUses;
    }
}