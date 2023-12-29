package mod.mores.objects;

import mod.mores.entity.DuckEntity;
import mod.mores.init.EntityTypeInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ThrownEgg extends EggEntity {
    public ThrownEgg(World world, LivingEntity player) {
        super(world, player);
    }

    @Override
    protected void onHit(RayTraceResult result) {
        if (!this.level.isClientSide) {
            if (this.random.nextInt(4) == 0) {
                int i = 1;
                if (this.random.nextInt(24) == 0) {
                    i = 3;
                }

                for (int j = 0; j < i; ++j) {
                    DuckEntity duck = EntityTypeInit.DUCK.get().create(this.level);
                    duck.setAge(-24000);
                    duck.moveTo(this.getX(), this.getY(), this.getZ(), this.yRot, 0.0F);
                    this.level.addFreshEntity(duck);
                }
            }

            this.level.broadcastEntityEvent(this, (byte) 3);
            this.remove();
        }
    }
}
