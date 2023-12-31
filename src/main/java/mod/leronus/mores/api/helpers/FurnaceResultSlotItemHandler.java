//package mod.leronus.mores.api.helpers;
//
//import mod.leronus.mores.block.custom.AlloyFurnaceBlockEntity;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraftforge.event.ForgeEventFactory;
//import net.minecraftforge.items.IItemHandler;
//import net.minecraftforge.items.SlotItemHandler;
//
///**
// * Based on vanilla FurnaceResultSlot class, but for SlotItemHandlers.
// *
// */
//public class FurnaceResultSlotItemHandler extends SlotItemHandler
//{
//    private final Player player;
//    private int removeCount;
//    private final BlockEntity blockEntity;
//
//    public FurnaceResultSlotItemHandler(Player player, IItemHandler itemHandler, BlockEntity be,
//                                        int index, int xPosition, int yPosition)
//    {
//        super(itemHandler, index, xPosition, yPosition);
//        this.player = player;
//        this.blockEntity = be;
//    }
//
//    /**
//     * No, you can't stick items in the output slot.
//     */
//    @Override
//    public boolean mayPlace(ItemStack stack)
//    {
//        return false;
//    }
//
//
//    @Override
//    public ItemStack remove(int amount)
//    {
//        if (this.hasItem()) {
//            this.removeCount += Math.min(amount, this.getItem().getCount());
//        }
//        return super.remove(amount);
//    }
//
//    @Override
//    protected void onQuickCraft(ItemStack stack, int amount)
//    {
//        this.removeCount += amount;
//        this.checkTakeAchievements(stack);
//    }
//
//    @Override
//    protected void checkTakeAchievements(ItemStack stack)
//    {
//        stack.onCraftedBy(this.player.level(), this.player, this.removeCount);
//        if (this.player instanceof ServerPlayer && this.blockEntity instanceof AlloyFurnaceBlockEntity)
//        {
//            ((AlloyFurnaceBlockEntity)this.blockEntity).grantExperience(this.player);
//        }
//        this.removeCount = 0;
//        ForgeEventFactory.firePlayerSmeltedEvent(this.player, stack);
//    } // end onCrafting
//
//    @Override
//    public void onTake(Player thePlayer, ItemStack stack)
//    {
//        this.checkTakeAchievements(stack);
//        super.onTake(thePlayer, stack);
//    }
//
//} // end class