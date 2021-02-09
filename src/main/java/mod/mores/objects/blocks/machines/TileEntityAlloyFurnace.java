package mod.mores.objects.blocks.machines;

import mod.mores.init.BlockInit;
import mod.mores.modid.Mores;
import mod.mores.util.Reference;
import mod.mores.util.handlers.PacketRequestUpdateAlloyFurnace;
import mod.mores.util.handlers.PacketUpdatedAlloyFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import java.util.ArrayList;

public class TileEntityAlloyFurnace extends TileEntity implements ITickable, IInventory {
    private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);
    public long lastChangeTime;

    private String customName;
    private ItemStack smelting = ItemStack.EMPTY;

    public static final int INPUT_LEFT = 0;
    public static final int INPUT_RIGHT = 1;
    public static final int INPUT_FUEL = 2;
    public static final int OUTPUT = 3;

    public int burnTime = 0;
    public int currentBurnTime = 0;
    public int cookTime = 0;
    public int totalCookTime = 400;

    IBlockState state;

    public boolean isActive = false;
    public int ticksSinceSync = 0;
    public boolean updateLight = false;

    public ItemStackHandler itemStackHandlerInventory = new ItemStackHandler(NonNullList.withSize(4, ItemStack.EMPTY)){
        @Override
        protected void onContentsChanged(int slot) {
            if (!world.isRemote) {
                lastChangeTime = world.getTotalWorldTime();
                Mores.network.sendToAllAround(new PacketUpdatedAlloyFurnace(TileEntityAlloyFurnace.this), new NetworkRegistry.TargetPoint(world.provider.getDimension(), pos.getX(), pos.getY(), pos.getZ(), 64));
            }
        }
    };
    @Override
    public void onLoad() {
        if (world.isRemote) {
            Mores.network.sendToServer(new PacketRequestUpdateAlloyFurnace(this));
        }
    }

    /**
     * This method is used for rendering a dynamic item in the container
     * @return Visibility item
     */
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return new AxisAlignedBB(getPos(), getPos().add(1, 2, 1));
    }



    /**
     * This constructor writes a successful tile entity bind to the build log
     */
    public TileEntityAlloyFurnace() {
        Reference.LOGGER.info("TileEntity is successfully bound to a block");
    }


    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState)
    {
        Reference.LOGGER.info("ShouldRefresh called!");
        if(oldState.getBlock() != newState.getBlock()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        // TODO Auto-generated method stub
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return true;
        return super.hasCapability(capability, facing);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        // TODO Auto-generated method stub
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return (T) this.itemStackHandlerInventory;
        return super.getCapability(capability, facing);
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.customName : "container.alloy_furnace";
    }

    public boolean hasCustomName() {

        return customName != null && !customName.isEmpty();
    }

    public void setCustomName(String customname) {
        this.customName = customname;
    }

    @Override
    public ITextComponent getDisplayName() {
        return this.hasCustomName() ? new TextComponentString(this.customName)
                : new TextComponentTranslation("container.alloy_furnace");
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, this.inventory);
        itemStackHandlerInventory.deserializeNBT(compound.getCompoundTag("inventory"));
        lastChangeTime = compound.getLong("lastChangeTime");
        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentBurnTime = getItemBurnTime((ItemStack)this.inventory.get(2));
        this.isActive = compound.getBoolean("isActive");

        if(compound.hasKey("CustomName", 8)) this.setCustomName(compound.getString("CustomName"));

        if (world != null)
        {
            IBlockState state = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, state, state, 3);
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setTag("inventory", itemStackHandlerInventory.serializeNBT());
        compound.setLong("lastChangeTime", lastChangeTime);
        compound.setInteger("BurnTime", this.burnTime);
        compound.setInteger("CookTime", this.cookTime);
        compound.setInteger("CookTimeTotal", this.totalCookTime);
        ItemStackHelper.saveAllItems(compound, this.inventory);
        compound.setBoolean("isActive", this.isActive);

        if(this.hasCustomName()) compound.setString("CustomName", this.customName);
        return compound;
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(TileEntityAlloyFurnace te) {
        return te.burnTime > 0;
    }

    public boolean isActive()
    {
        return isActive;
    }

    /*
    /**
     * Checks if the burning state of the furnace has changed. If it has changed update the block.
     *
     * @param wasBurning Whether the furnace was burning in the previous tick.
     * @return True if the state has changed, false if not.


    private boolean updateBlockActiveState(boolean wasBurning)
    {
        boolean dirty = false;

        if (wasBurning != this.isBurning() && type.fuelSlots > 0)
        {
            dirty = true;
            isActive = this.isBurning();

            IBlockState state = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, state, state, 3);
        } else if (type.fuelSlots == 0)
        {
            if (isActive != isBurning())
            {
                currentBurnTime = burnTime = 3600;
                dirty = true;
                isActive = this.isBurning();

                IBlockState state = world.getBlockState(pos);
                world.notifyBlockUpdate(pos, state, state, 3);
            }
        }

        return dirty;
    }

     */

    public void update()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if(this.isBurning()){
            --this.burnTime;
        }

        if(!this.world.isRemote)
        {

            ItemStack fuel = this.itemStackHandlerInventory.getStackInSlot(2);


            if(this.isBurning() || !fuel.isEmpty() && !(this.itemStackHandlerInventory.getStackInSlot(0)).isEmpty() || (this.itemStackHandlerInventory.getStackInSlot(1)).isEmpty())
            {
                if(!this.isBurning() && this.canSmelt())
                {
                    this.burnTime = getItemBurnTime(fuel);
                    this.currentBurnTime = this.burnTime;

                    if(this.isBurning())
                    {
                        flag1 = true;

                        if(!fuel.isEmpty())
                        {
                            Item item = fuel.getItem();
                            fuel.shrink(1);

                            if(fuel.isEmpty())
                            {
                                ItemStack item1 = item.getContainerItem(fuel);
                                this.itemStackHandlerInventory.setStackInSlot(2, item1);
                            }
                        }
                    }
                }
                if(this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    //the 20 here is the total cook time i want. The cook lasts 20 ticks then the item is cooked

                    if(this.cookTime == 400)
                    {
                        this.cookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else this.cookTime = 0;
            }
            else if(!this.isBurning() && this.cookTime > 0)

            //same here : 20 is for 20 ticks of cooking
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, 20);
            }
            if(flag != this.isBurning())
            {
                flag1 = true;
                setState(this.isBurning(), this.world, this.pos);
                Reference.LOGGER.info("Blockstate set to: " + this.isBurning());
            }
        }
        if(flag1) this.markDirty();
    }

    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState state = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (active) {
            worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE.getDefaultState()
                    .withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)).withProperty(BlockAlloyFurnace.BURNING, true), 1 | 2);
            Reference.LOGGER.info("Furnace is burning!");
        } else
            worldIn.setBlockState(pos, BlockInit.ALLOY_FURNACE.getDefaultState()
                    .withProperty(BlockAlloyFurnace.FACING, state.getValue(BlockAlloyFurnace.FACING)).withProperty(BlockAlloyFurnace.BURNING, false), 1 | 2);

        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }

    private boolean canSmelt() {
        if (((ItemStack) itemStackHandlerInventory.getStackInSlot(0)).isEmpty())
            return false;
        else {
            ItemStack result = AlloyFurnaceRecipes.getInstance().getAlloyResult((ItemStack) itemStackHandlerInventory.getStackInSlot(0), (ItemStack) itemStackHandlerInventory.getStackInSlot(1));
            if (result.isEmpty())
                return false;
            else {
                ItemStack fuel = (ItemStack) itemStackHandlerInventory.getStackInSlot(2);
                ItemStack output = (ItemStack) itemStackHandlerInventory.getStackInSlot(3);
                int res1 = output.getCount() + result.getCount();
                int res2 = fuel.getCount() + 1;
                return (res1 <= 64 && res1 <= output.getMaxStackSize())
                        || (res2 <= 64 && res2 <= fuel.getMaxStackSize());
            }
        }
    }

    public static int getItemBurnTime(ItemStack fuel) {
        if (fuel.isEmpty())
            return 0;
        else {
            Item item = fuel.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.WOODEN_SLAB)
                    return 100;
                if (block == Blocks.ACACIA_STAIRS || block == Blocks.OAK_STAIRS || block == Blocks.JUNGLE_STAIRS
                        || block == Blocks.BIRCH_STAIRS || block == Blocks.DARK_OAK_STAIRS
                        || block == Blocks.SPRUCE_STAIRS)
                    return 150;
                if (block.getDefaultState().getMaterial() == Material.WOOD)
                    return 200;
                if (block == Blocks.COAL_BLOCK)
                    return 14400;
            }

            if (item instanceof ItemTool && "WOOD".contentEquals(((ItemTool) item).getToolMaterialName()))
                return 180;
            if (item instanceof ItemSword && "WOOD".contentEquals(((ItemTool) item).getToolMaterialName()))
                return 180;
            if (item instanceof ItemHoe && "WOOD".contentEquals(((ItemTool) item).getToolMaterialName()))
                return 180;
            if (item == Items.STICK)
                return 50;
            if (item == Items.COAL)
                return 1600;
            if (item == Items.LAVA_BUCKET)
                return 20000;
            if (item == Item.getItemFromBlock(Blocks.SAPLING))
                return 70;
            if (item == Items.BLAZE_ROD)
                return 1600;

            return ForgeEventFactory.getItemBurnTime(fuel);
        }
    }

    public static boolean isItemFuel(ItemStack fuel) {
        return getItemBurnTime(fuel) > 0;
    }

    @Override
    public int getSizeInventory() {
        return this.inventory.size();
    }

    @Override
    public boolean isEmpty() {
        for(ItemStack stack : this.inventory){
            if(!stack.isEmpty()) return false;
        }
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return (ItemStack)this.inventory.get(index);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.inventory, index, count);
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.inventory, index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        ItemStack itemStack = (ItemStack)this.inventory.get(index);
        boolean flag = !stack.isEmpty() && stack.isItemEqual(itemStack) && ItemStack.areItemStackTagsEqual(stack, itemStack);
        this.inventory.set(index, stack);

        if(stack.getCount()>this.getInventoryStackLimit()) stack.setCount((this.getInventoryStackLimit()));
        if(index==0 && index+1==1 && !flag){
            ItemStack stack1 = (ItemStack)this.inventory.get(index+1);
            this.totalCookTime = this.getCookTime(stack, stack1);
            this.cookTime=0;
            this.markDirty();
        }
    }

    public int getCookTime(ItemStack input1, ItemStack input2){
        return 200;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isUsableByPlayer(EntityPlayer player) {

        return world.getTileEntity(pos) == this && player.getDistanceSq((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D,
                (double) pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        if(index==OUTPUT)return false;
        else if (index==INPUT_FUEL){
            return isItemFuel(stack);
        }
        else{
            return true;
        }
    }

    public final ArrayList<ItemStack> containerLists() {
        ArrayList<ItemStack> stackList = new ArrayList(itemStackHandlerInventory.getSlots());
        for (int i = 0; i < itemStackHandlerInventory.getSlots(); i++) {
            stackList.add(itemStackHandlerInventory.getStackInSlot(i));
        }
        return stackList;
    }

    public int getField(int id)
    {
        switch(id)
        {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch(id)
        {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }
    public void smeltItem(){
        if(this.canSmelt()){
            ItemStack input1 = (ItemStack)this.itemStackHandlerInventory.getStackInSlot(0);
            ItemStack input2 = (ItemStack)this.itemStackHandlerInventory.getStackInSlot(1);
            ItemStack result = AlloyFurnaceRecipes.getInstance().getAlloyResult(input1, input2);
            ItemStack output = (ItemStack)this.itemStackHandlerInventory.getStackInSlot(3);

            if(output.isEmpty()) this.itemStackHandlerInventory.setStackInSlot(3, result.copy());
            else if(output.getItem()==result.getItem()) output.grow(result.getCount());

            input1.shrink(1);
            input2.shrink(2);
        }
    }
    @Override
    public int getFieldCount() {
        return 4;
    }

    @Override
    public void clear() {
        this.inventory.clear();
    }

    @Override
    public void handleUpdateTag(NBTTagCompound tag) {
        readFromNBT(tag);
        Reference.LOGGER.info(this.isBurning() + " = isBurning value");
        setState(isBurning(), getWorld(), getPos());
    }
    @Override
    public NBTTagCompound getUpdateTag() {
        return writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        handleUpdateTag(pkt.getNbtCompound());
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(getPos(), -1, getUpdateTag());
    }

}