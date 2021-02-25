package mod.mores.util.handlers;

import mod.mores.init.ItemInit;
import mod.mores.recipes.SmeltingRecipes;
import mod.mores.util.Reference;
import mod.mores.util.helpers.IHarvestEffectHelper;
import mod.mores.util.helpers.IWeaponEffectHelper;
import mod.mores.util.helpers.ToolHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ListIterator;
import java.util.Random;
import java.util.logging.Logger;

/** Helper class for handling Fyrite properties */
public class FireHandler implements IWeaponEffectHelper, IHarvestEffectHelper
{
    private boolean isTool = false;
    private boolean isEffective = false;
    private boolean isRuby = false;


    public static FireHandler INSTANCE = new FireHandler();

    private FireHandler() {
    }

    /**
     * Fyrite smelts blocks on harvest.
     * @see mod.mores.util.helpers.IHarvestEffectHelper#onHarvestDrops(net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent)
     */
    @Override
    @SubscribeEvent
    public void onHarvestDrops(BlockEvent.HarvestDropsEvent event)
    {
        // do not change harvest drops if non-player or we are using silk touch.
        EntityPlayer player = event.getHarvester();
        if (player == null) return;
        if (event.isSilkTouching()) return;

        Random random = event.getWorld().rand;
        // check if tool exists and is a fyrite tool.
        ItemStack tool = player.getHeldItem(player.getActiveHand());
        if (tool.isEmpty()) return;
        Item toolItem = tool.getItem();
        if (! (toolItem instanceof ItemTool)) return;

        isTool = true;
        Reference.LOGGER.info("isTool: " + isTool);
        if (((ItemTool) tool.getItem()).getToolMaterialName().equals("ruby"))
        {
            isRuby = true;
            Reference.LOGGER.info("isRuby: " + isRuby);
            IBlockState state = event.getState();

            // if fyrite tool, and can harvest this block effectively, smelt the drops
            if (ToolHelper.isEffective(tool, state))
            {
                isEffective = true;
				Reference.LOGGER.info("isEffective: " + isEffective);
                // iterate over the drops and do stuff...
                ListIterator<ItemStack> dropList = event.getDrops().listIterator();
                while (dropList.hasNext())
                {
                    ItemStack drop = dropList.next();
                    // is there a smelted version of this drop?
                    ItemStack smelted = FurnaceRecipes.instance().getSmeltingResult(drop);
                    if (!smelted.isEmpty())
                    {
                        smelted = smelted.copy();

                        // apply fortune enchantment to smelting results
                        int fortune = EnchantmentHelper.getEnchantmentLevel(
                                Enchantments.FORTUNE, tool);
                        if (fortune > 0)
                        {
                            //	smelted.setCount(smelted.getCount() *random.nextInt(fortune + 1) + 1);
                            int amount = smelted.getCount() * random.nextInt(fortune+1) + 1;
                            amount -= smelted.getCount();
                            smelted.grow(amount);
                        }
                        // replace original drop stack with smelted results.
                        dropList.set(smelted);

                        // afterBlockSmelt(event.getWorld(), event.getPos(), true);

                        // drop the xp for smelting.
                        float xp = FurnaceRecipes.instance().getSmeltingExperience(smelted);
                        if (xp < 1 && Math.random() < xp) {
                            xp += 1.0f;
                        }
                        if (xp >= 1.0f) {
                            state.getBlock().dropXpOnBlockBreak(event.getWorld(),
                                    event.getPos(), (int) xp);
                        } // end-if xp
                    } // end-if smelted
                } // end-while
            } // end-if effective
        } // end-if fyrite tool
    } // end onHarvestDrops()

    /**
     * show flame flash after block auto-smelted
     * @param world
     * @param pos
     * @param was_effective
     */
    public void afterBlockSmelt(World world, BlockPos pos, boolean was_effective)
    {
        if (world.isRemote && was_effective)
        {
            Random random = world.rand;
            for(int i = 0; i < 3; i++) {
                world.spawnParticle(EnumParticleTypes.FLAME,
                        pos.getX() + random.nextDouble(),
                        pos.getY() + random.nextDouble(),
                        pos.getZ() + random.nextDouble(),
                        0.0D, 0.0D, 0.0D);
            } // end-for
        } // end-if
    } // end afterBlockSmelt()

    /**
     * set entities on fire when hit by weapon. Implements IWeaponEffectHelper.
     */
    public boolean hitEntity(ItemStack stack, EntityLivingBase target,
                             EntityLivingBase attacker)
    {
        if (!target.isBurning()) {
            target.setFire(100);
        }
        return true;
    } // end hitEntity

    /**
     * what should Fyrite items do when right-clicked on something?
     * @param playerIn
     * @param worldIn
     * @param pos
     * @param hand
     * @param facing
     * @param hitX
     * @param hitY
     * @param hitZ
     * @return EnumActionResult.PASS because we're not done.
     */
    public EnumActionResult onItemUse(EntityPlayer playerIn,
                                      World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing,
                                      float hitX, float hitY, float hitZ)
    {
        BlockPos adjacentPos = pos;
        ItemStack stack = playerIn.getHeldItem(hand);

        if (stack.isEmpty()) {
            return EnumActionResult.PASS;
        }
        switch (facing)
        {
            case DOWN:
                adjacentPos = pos.down();
                break;
            case UP:
                adjacentPos = pos.up();
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
        if (!playerIn.canPlayerEdit(adjacentPos, facing, stack))
        {
            return EnumActionResult.PASS;
        }
        IBlockState targetBlock = worldIn.getBlockState(adjacentPos);
        if (targetBlock.getBlock().isAir(targetBlock, worldIn, adjacentPos))
        {
            playerIn.playSound(SoundEvents.BLOCK_FIRE_AMBIENT, 1.0F, 1.0F);
            worldIn.setBlockState(adjacentPos, Blocks.FIRE.getDefaultState());
            //stack.attemptDamageItem(1, worldIn.rand, (EntityPlayerMP) playerIn);
        }
        return EnumActionResult.PASS;
    } // end onItemUse()
} // end class