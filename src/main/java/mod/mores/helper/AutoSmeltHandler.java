package mod.mores.helper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlockState;

import java.util.Random;

public class AutoSmeltHandler implements IWeaponEffectHelper
{
    public static AutoSmeltHandler INSTANCE = new AutoSmeltHandler();

    private AutoSmeltHandler() {}

    /**
     * set target on fire if it's not already on fire.
     */
    //TODO Fix hitEntity
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        if (target.getRemainingFireTicks() <= 100) {
            target.setSecondsOnFire(100);
        }
        return true;
    } // end hitEntity()

    /** show flame flash after block auto-smelted
     * @param world
     * @param pos
     * @param was_effective
     */
    public void afterBlockSmelt(Level world, BlockPos pos, boolean was_effective)
    {
        if (was_effective && world.isClientSide())
        {
            Random random = world.random;
            for(int i = 0; i < 3; i++) {
                world.addParticle(ParticleTypes.FLAME,
                        pos.getX() + random.nextDouble() * 0.6D,
                        pos.getY() + random.nextDouble() * 0.6D,
                        pos.getZ() + random.nextDouble() * 0.6D,
                        0.0D, 0.0D, 0.0D);
            } // end-for
        } // end-if
    }

        //TODO Fix onItemUse
    public InteractionResult onItemUse(UseOnContext context)
    {
        BlockPos adjacentPos = context.getClickedPos();
        BlockPos pos = context.getClickedPos();
        ItemStack stack = context.getItemInHand();
        Player playerIn = context.getPlayer();
        Level worldIn = context.getLevel();

        if (stack.isEmpty()) {
            return InteractionResult.PASS;
        }
        switch (context.getClickedFace())
        {
            case DOWN:
                adjacentPos = pos.below();
                break;
            case UP:
                adjacentPos = pos.above();
                break;
            case NORTH:
                adjacentPos = pos.north();
                break;
            case SOUTH:
                adjacentPos = pos.south();
                break;
            case EAST:
                adjacentPos = pos.east();
                break;
            case WEST:
                adjacentPos = pos.west();
                break;
        } // end switch
        if (!playerIn.mayUseItemAt(adjacentPos, context.getClickedFace(), stack))
        {
            return InteractionResult.PASS;
        }
        BlockState targetBlock = worldIn.getBlockState(adjacentPos);
        if (targetBlock.isAir())
        {
            if (worldIn.isClientSide) {
                playerIn.playSound(SoundEvents.FIRE_AMBIENT, 1.0F, 1.0F);
            }
            worldIn.setBlockAndUpdate(adjacentPos, Blocks.FIRE.defaultBlockState());
            stack.hurt(1, worldIn.random, null);
        }
        return InteractionResult.PASS;
    } // end onItemUse()

}  // end class AutoSmeltHandler