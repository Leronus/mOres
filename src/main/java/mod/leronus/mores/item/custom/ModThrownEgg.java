package mod.leronus.mores.item.custom;

import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.entity.custom.DuckEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class ModThrownEgg extends ThrownEgg {
    public ModThrownEgg(Level level, LivingEntity player) {
        super(level, player);
    }

    @Override
    protected void onHit(HitResult result) {
        if (!this.level.isClientSide) {
            if (this.random.nextInt(4) == 0) {
                int i = 1;
                if (this.random.nextInt(24) == 0) {
                    i = 3;
                }

                for(int j = 0; j < i; ++j) {
                    DuckEntity duck = ModEntityTypes.DUCK.get().create(this.level);
                    if (duck != null) {
                        duck.setAge(-24000);
                        duck.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                        this.level.addFreshEntity(duck);
                    }
                }
            }

            this.level.broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
    }
}
