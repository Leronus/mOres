package mod.leronus.mores.api.mixin;

import mod.leronus.mores.item.ModShieldMaterials;
import mod.leronus.mores.item.custom.ModShieldItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public abstract class ItemMixin {

    @Inject(at = @At("RETURN"), method = "getEnchantmentValue", cancellable = true)
    public void getEnchantmentValue(CallbackInfoReturnable<Integer> callbackInfo) {
        //noinspection ConstantConditions
        if (((Object)this) instanceof ShieldItem
                && !(((Object)this) instanceof ModShieldItem))
            callbackInfo.setReturnValue(ModShieldMaterials.IRON.enchantmentValue);
    }
}