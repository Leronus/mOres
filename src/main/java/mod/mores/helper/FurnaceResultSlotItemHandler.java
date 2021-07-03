package mod.mores.helper;

import mod.mores.tileentity.AbstractAlloyFurnaceTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FurnaceResultSlotItemHandler extends SlotItemHandler {
    private final PlayerEntity player;
    private int removeCount;
    private final TileEntity tile;

    public FurnaceResultSlotItemHandler(PlayerEntity player, TileEntity tileEntity, IItemHandler itemHandler, int index, int xPosition, int yPosition)
    {
        super(itemHandler, index, xPosition, yPosition);
        this.tile = tileEntity;
        this.player = player;
    }

    /**
     * No, you can't stick items in the output slot.
     */
    @Override
    public boolean mayPlace(ItemStack stack)
    {
        return false;
    }


    @Override
    public ItemStack remove(int amount)
    {
        if (this.hasItem()) {
            this.removeCount += Math.min(amount, this.getItem().getCount());
        }
        return super.remove(amount);
    }

    @Override
    protected void onQuickCraft(ItemStack stack, int amount)
    {
        this.removeCount += amount;
        this.checkTakeAchievements(stack);
    }

    @Override
    protected void checkTakeAchievements(ItemStack stack)
    {
        stack.onCraftedBy(this.player.level, this.player, this.removeCount);
        if (!this.player.level.isClientSide && this.tile instanceof AbstractAlloyFurnaceTileEntity)
        {
            ((AbstractAlloyFurnaceTileEntity)this.tile).grantExperience(this.player);
        }
        this.removeCount = 0;
        net.minecraftforge.fml.hooks.BasicEventHooks.firePlayerSmeltedEvent(this.player, stack);
    } // end onCrafting

    @Override
    public ItemStack onTake(PlayerEntity thePlayer, ItemStack stack)
    {
        this.checkTakeAchievements(stack);
        super.onTake(thePlayer, stack);
        return stack;
    }



} // end class