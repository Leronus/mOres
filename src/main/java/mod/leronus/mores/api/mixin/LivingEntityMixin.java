package mod.leronus.mores.api.mixin;

import mod.leronus.mores.config.module.base.feature.BaseFeature;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = LivingEntity.class, priority = 1001)
public abstract class LivingEntityMixin extends Entity {

    public LivingEntityMixin(EntityType<?> p_19870_, Level p_19871_) {
        super(p_19870_, p_19871_);
    }

    @ModifyConstant(constant = @Constant(intValue = 5), method = "isBlocking")
    private int blockingWindupTime(int ticks) {
        return BaseFeature.shouldRemoveShieldWindup() ? 0 : ticks;
    }

	/*@Inject(at = @At(value = "JUMP", target = "Lnet/minecraft/world/entity/LivingEntity;playHurtSound(Lnet/minecraft/world/damagesource/DamageSource;)V"), method = "hurt", cancellable = true)
	private void onHurtSound(DamageSource source, float amount, CallbackInfoReturnable<Boolean> callbackInfo) {
	}*/
}