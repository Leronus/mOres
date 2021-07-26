package mod.mores.helper;

import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

public class ModifiedDispenseItemBehavior implements DispenseItemBehavior {
    public ItemStack dispense(BlockSource p_dispense_1_, ItemStack p_dispense_2_) {
        ItemStack itemstack = this.execute(p_dispense_1_, p_dispense_2_);
        this.playSound(p_dispense_1_);
        this.playAnimation(p_dispense_1_, p_dispense_1_.getBlockState().getValue(DispenserBlock.FACING));
        return itemstack;
    }

    protected ItemStack execute(BlockSource p_82487_1_, ItemStack p_82487_2_) {
        Direction direction = p_82487_1_.getBlockState().getValue(DispenserBlock.FACING);
        Position iposition = DispenserBlock.getDispensePosition(p_82487_1_);
        ItemStack itemstack = p_82487_2_.split(1);
        spawnItem(p_82487_1_.getLevel(), itemstack, 6, direction, iposition);
        return p_82487_2_;
    }

    public static void spawnItem(Level p_82486_0_, ItemStack p_82486_1_, int p_82486_2_, Direction p_82486_3_, Position p_82486_4_) {
        double d0 = p_82486_4_.x();
        double d1 = p_82486_4_.y();
        double d2 = p_82486_4_.z();
        if (p_82486_3_.getAxis() == Direction.Axis.Y) {
            d1 = d1 - 0.125D;
        } else {
            d1 = d1 - 0.15625D;
        }

        ItemEntity itementity = new ItemEntity(p_82486_0_, d0, d1, d2, p_82486_1_);
        double d3 = p_82486_0_.random.nextDouble() * 0.1D + 0.2D;
        itementity.setDeltaMovement(p_82486_0_.random.nextGaussian() * (double)0.0075F * (double)p_82486_2_ + (double)p_82486_3_.getStepX() * d3, p_82486_0_.random.nextGaussian() * (double)0.0075F * (double)p_82486_2_ + (double)0.2F, p_82486_0_.random.nextGaussian() * (double)0.0075F * (double)p_82486_2_ + (double)p_82486_3_.getStepZ() * d3);
        p_82486_0_.addFreshEntity(itementity);
    }

    protected void playSound(BlockSource p_82485_1_) {
        p_82485_1_.getLevel().levelEvent(1000, p_82485_1_.getPos(), 0);
    }

    protected void playAnimation(BlockSource p_82489_1_, Direction p_82489_2_) {
        p_82489_1_.getLevel().levelEvent(2000, p_82489_1_.getPos(), p_82489_2_.get3DDataValue());
    }
}