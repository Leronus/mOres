package mod.mores.item.custom;

import mod.mores.entity.ModEntityTypes;
import mod.mores.entity.custom.Duck;
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
                int $$1 = 1;
                if (this.random.nextInt(24) == 0) {
                    $$1 = 3;
                }

                for(int $$2 = 0; $$2 < $$1; ++$$2) {
                    Duck $$3 = (Duck) ModEntityTypes.DUCK.get().create(this.level);
                    $$3.setAge(-24000);
                    $$3.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                    this.level.addFreshEntity($$3);
                }
            }

            this.level.broadcastEntityEvent(this, (byte)3);
            this.discard();
        }

    }
}
