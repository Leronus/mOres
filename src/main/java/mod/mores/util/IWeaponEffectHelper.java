package mod.mores.util;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

/**
 * interface for helper classes for weapons with special effects on hitting
 * or using.
 * @author Sinhika
 */
public interface IWeaponEffectHelper
{
    public abstract boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker);

} //  end interface IWeaponEffectHelper