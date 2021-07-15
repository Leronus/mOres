package mod.mores.helper;

import mod.mores.Mores;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeBlockState;

import java.util.Random;

public class AutoSmeltHandler implements IWeaponEffectHelper
{
    public static AutoSmeltHandler INSTANCE = new AutoSmeltHandler();

    private AutoSmeltHandler() {}

    /**
     * set target on fire if it's not already on fire.
     */
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
    public void afterBlockSmelt(World world, BlockPos pos, boolean was_effective)
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

    public ActionResultType onItemUse(ItemUseContext context)
    {
        BlockPos adjacentPos = context.getClickedPos();
        BlockPos pos = context.getClickedPos();
        ItemStack stack = context.getItemInHand();
        PlayerEntity playerIn = context.getPlayer();
        World worldIn = context.getLevel();

        if (stack.isEmpty()) {
            return ActionResultType.PASS;
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
            return ActionResultType.PASS;
        }
        IForgeBlockState targetBlock = worldIn.getBlockState(adjacentPos);
        if (targetBlock.getBlockState().getBlock().isAir(targetBlock.getBlockState(), worldIn, adjacentPos))
        {
            if (worldIn.isClientSide) {
                playerIn.playSound(SoundEvents.FIRE_AMBIENT, 1.0F, 1.0F);
            }
            worldIn.setBlockAndUpdate(adjacentPos, Blocks.FIRE.defaultBlockState());
            stack.hurt(1, worldIn.random, null);
        }
        return ActionResultType.PASS;
    } // end onItemUse()

}  // end class AutoSmeltHandler