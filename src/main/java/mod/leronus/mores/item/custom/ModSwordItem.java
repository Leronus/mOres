package mod.leronus.mores.item.custom;

import mod.leronus.mores.item.ModItems;
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
        // 1.20.6+: SwordItem constructor is (Tier, Properties) and attributes go into Properties
        super(toolMaterial, itemProperties.attributes(SwordItem.createAttributes(toolMaterial, attackDamage, attackSpeed)));
        this.maxUses = toolMaterial.getUses();
    }

    /**
     * Called when an enemy is attacked using the sword
     */
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Onyx weapons apply Wither
        if (isOnyxWeapon(stack)) {
            // MobEffects.WITHER is a Holder<MobEffect> in 1.20.6, and MobEffectInstance expects a Holder
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 250, 1, false, false, true));
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    /**
     * Called when item is created (crafted)
     */
    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        // Add Smite I to silver weapons
        if (isSilverWeapon(stack)) {
            stack.enchant(Enchantments.SMITE, 1);
        }
        super.onCraftedBy(stack, level, player);
    }

    public int getMaxUses() {
        return maxUses;
    }

    private static boolean isOnyxWeapon(ItemStack stack) {
        Item item = stack.getItem();
        return item == ModItems.ONYX_SWORD.get()
                || item == ModItems.ONYX_MACE.get()
                || item == ModItems.ONYX_DAGGER.get()
                || item == ModItems.ONYX_BATTLEAXE.get();
    }

    private static boolean isSilverWeapon(ItemStack stack) {
        Item item = stack.getItem();
        return item == ModItems.SILVER_SWORD.get()
                || item == ModItems.SILVER_DAGGER.get()
                || item == ModItems.SILVER_MACE.get()
                || item == ModItems.SILVER_BATTLEAXE.get();
    }
}
