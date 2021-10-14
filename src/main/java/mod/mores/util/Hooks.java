package mod.mores.util;

import mod.mores.config.Config;
import mod.mores.objects.ItemShield;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.DamageSource;

public class Hooks {
    public static float getDamageReduction(LivingEntity victim, DamageSource source, float damage) {
        float f1 = 0.0f;
        if (damage > 0.0F && victim.isDamageSourceBlocked(source)) {
            victim.hurtCurrentlyUsedShield(damage);
            f1 = damage;
            float reduction = 1f;
            //getUseItem was getActiveItemStack
            Item shield = victim.getUseItem().getItem();
            if (shield instanceof ItemShield) {
                reduction = ((ItemShield) shield).getDamageReduction() / 100f;
            } else if (shield == Items.SHIELD
                    || (!Config.customShieldMaxReduction.get() && victim.getUseItem().isShield(victim))) {
                reduction = Config.defaultDamageReduction.get() / 100f;
            }
            if (!source.isProjectile() && reduction < 1f)
                f1 = damage * reduction;
            if (!source.isProjectile()) {
                Entity entity = source.getDirectEntity();
                if (entity instanceof LivingEntity) {
                    victim.blockUsingShield((LivingEntity) entity);
                }
            }
        }
        return f1;
    }

    public static boolean canThornsApply(ItemStack stack) {
        if (Config.thornsOnShields.get()) {
            return stack.getItem() instanceof ArmorItem || stack.getItem() instanceof ShieldItem;
        } else {
            return stack.getItem() instanceof ArmorItem;
        }
    }

    public static boolean damageEntityFromReturn(DamageSource source, boolean flag) {
        return flag || !source.isProjectile();
    }

}