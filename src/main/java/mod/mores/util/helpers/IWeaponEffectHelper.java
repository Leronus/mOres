package mod.mores.util.helpers;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * interface for helper classes for weapons with special effects on hitting
 * or using.
 * @author Sinhika
 * @note vetted for 1.11.2 compatibility
 */
public interface IWeaponEffectHelper
{
    public abstract boolean hitEntity(ItemStack stack, EntityLivingBase target,
                                      EntityLivingBase attacker);

}
