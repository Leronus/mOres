package mod.leronus.mores.api.mixin;

import mod.leronus.mores.config.module.base.feature.BaseFeature;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {

    protected PlayerMixin(EntityType<? extends LivingEntity> p_20966_, Level p_20967_) {
        super(p_20966_, p_20967_);
    }

    @ModifyConstant(constant = @Constant(floatValue = 3.0F), method = "hurtCurrentlyUsedShield")
    private float blockingWindupTime(float minDamage) {
        return BaseFeature.minShieldHurtDamage.floatValue();
    }
    @Shadow
    public abstract ItemCooldowns getCooldowns();
}