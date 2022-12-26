package mod.mores.api.content;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import mod.mores.api.helpers.SidedWrapper;
import mod.mores.recipe.AlloyRecipe;
import mod.mores.recipe.IAlloyRecipe;
import mod.mores.recipe.ModRecipes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public abstract class AbstractAlloyFurnaceTileEntity extends BlockEntity
{
    protected static final Logger LOGGER = LogManager.getLogger();

    public static final int INPUT1_SLOT = 1;
    public static final int INPUT2_SLOT = 2;
    public static final int CATALYST_SLOT = 4;
    public static final int OUTPUT_SLOT = 3;
    public static final int FUEL_SLOT = 0;

    public static final int DATA_FUEL_TIME_LEFT = 0;
    public static final int DATA_FUEL_TIME_MAX = 1;
    public static final int DATA_COOKING_PROGRESS = 2;
    public static final int DATA_COOKING_TOTAL_TIME = 3;
    public static final int NUM_DATA_VALUES = 4;

    // TODO - make configurable.
    public static double BURN_TIME_MODIFIER = 1.875F;
    public static int DEFAULT_ALLOY_TIME = 600;

    protected static final String INVENTORY_TAG = "inventory";
    protected static final String SMELT_TIME_LEFT_TAG = "smeltTimeLeft";
    protected static final String MAX_SMELT_TIME_TAG = "maxSmeltTime";
    protected static final String FUEL_BURN_TIME_LEFT_TAG = "fuelBurnTimeLeft";
    protected static final String MAX_FUEL_BURN_TIME_TAG = "maxFuelBurnTime";

    public int smeltTimeProgress = 0;
    public int maxSmeltTime = -1;

    public int fuelBurnTimeLeft = -1;
    public int maxFuelBurnTime = -1;
    protected boolean lastBurning = false;

    private final Map<ResourceLocation, Integer> recipe2xp_map = Maps.newHashMap();

    // used for improved alloy furnaces
    protected boolean hasFuelMultiplier = false;
    protected double fuelMultiplier = 1.0;
    protected int YieldChance = 0;
    protected int YieldAmount = 0;
    protected Random generator = new Random();

    // implement recipe-caching like all the cool kids.
    protected IAlloyRecipe cachedRecipe;
    protected ItemStack failedMatch1 = ItemStack.EMPTY;
    protected ItemStack failedMatch2 = ItemStack.EMPTY;
    protected ItemStack failedMatchC = ItemStack.EMPTY;

    public final ContainerData dataAccess = new ContainerData()
    {
        @Override
        public int get(int index) {
            switch (index)
            {
                case DATA_FUEL_TIME_LEFT:
                    return AbstractAlloyFurnaceTileEntity.this.fuelBurnTimeLeft;
                case DATA_FUEL_TIME_MAX:
                    return AbstractAlloyFurnaceTileEntity.this.maxFuelBurnTime;
                case DATA_COOKING_PROGRESS:
                    return AbstractAlloyFurnaceTileEntity.this.smeltTimeProgress;
                case DATA_COOKING_TOTAL_TIME:
                    return AbstractAlloyFurnaceTileEntity.this.maxSmeltTime;
                default:
                    return 0;
            }
        } // end get()

        @Override
        public void set(int index, int value) {
            switch (index)
            {
                case DATA_FUEL_TIME_LEFT:
                    AbstractAlloyFurnaceTileEntity.this.fuelBurnTimeLeft = value;
                    break;
                case DATA_FUEL_TIME_MAX:
                    AbstractAlloyFurnaceTileEntity.this.maxFuelBurnTime = value;
                    break;
                case DATA_COOKING_PROGRESS:
                    AbstractAlloyFurnaceTileEntity.this.smeltTimeProgress = value;
                    break;
                case DATA_COOKING_TOTAL_TIME:
                    AbstractAlloyFurnaceTileEntity.this.maxSmeltTime = value;
            }
        } // end set()

        @Override
        public int getCount() {
            return NUM_DATA_VALUES;
        }
    }; // end AbstractAlloyFurnaceTileEntity$ContainerData


    public final ItemStackHandler inventory = new ItemStackHandler(5)
    {
        /**
         * this is where the CLIENT checks to see if item is valid to insert in slot.
         * Be relaxed in checks, don't cross the streams! (i.e, don't call server-side code here!)
         */
        @Override
        public boolean isItemValid(final int slot, @Nonnull final ItemStack stack)
        {
            switch (slot)
            {
                case FUEL_SLOT:
                    return isFuel(stack);
                case INPUT1_SLOT:
                case INPUT2_SLOT:
                    return isInput(stack);
//              return true;
                case CATALYST_SLOT:
                    return isCatalyst(stack);
//                return true;
                case OUTPUT_SLOT:
                    return isOutput(stack);
                default:
                    return false;
            } // end-switch
        } // end ItemStackHandler.isItemValid()

        @Override
        protected void onContentsChanged(final int slot)
        {
            super.onContentsChanged(slot);
            // Mark the tile entity as having changed whenever its inventory changes.
            // "markDirty" tells vanilla that the chunk containing the tile entity has
            // changed and means the game will save the chunk to disk later.
            setChanged();
        } // end ItemStackHandler.onContentsChanged()
    };

    public class AlloyFurnaceHandler extends SidedWrapper
    {

        public AlloyFurnaceHandler(IItemHandlerModifiable inventory, Direction side)
        {
            super(inventory, side);
        }

        @Nonnull
        @Override
        public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate)
        {
            // no, you can't put stuff in the output slot.
            if (slot == OUTPUT_SLOT)
            {
                return stack;
            }
            // catalysts go in top
            if (slot == CATALYST_SLOT && this.side == Direction.UP) {
                return super.insertItem(slot, stack, simulate);
            }
            // fuel goes in front or back
            if (slot == FUEL_SLOT && (this.side == Direction.NORTH || this.side == Direction.SOUTH)) {
                return super.insertItem(slot, stack, simulate);
            }
            // inputs go in left or right.
            if ((slot == INPUT1_SLOT && this.side == Direction.EAST)
                    || (slot == INPUT2_SLOT && this.side == Direction.WEST))
            {
                return super.insertItem(slot, stack, simulate);
            }
            return stack;
        } // end insertItem()

        @Override
        public ItemStack extractItem(int slot, int amount, boolean simulate)
        {
            // you can extract buckets from the fuel or catalyst slot.
            if ((slot == FUEL_SLOT || slot == CATALYST_SLOT) && this.side == Direction.DOWN)
            {
                ItemStack pstack = this.getStackInSlot(slot);
                if (pstack.is(Items.BUCKET))
                {
                    return super.extractItem(slot, amount, simulate);
                }
                else {
                    return ItemStack.EMPTY;
                }
            }
            // you can extract anything from the output slot.
            if (slot == OUTPUT_SLOT && this.side == Direction.DOWN) {
                return super.extractItem(slot, amount, simulate);
            }

            return ItemStack.EMPTY;
        } // end extractItem()

    }; // end class AlloyFurnaceHandler

    protected LazyOptional<ItemStackHandler> inventoryCapabilityInternal = LazyOptional.of(() -> this.inventory);
    protected LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalUp =
            LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.UP));
    protected LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalLeft =
            LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.EAST));
    protected LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalRight =
            LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.WEST));
    protected LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalDown =
            LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.DOWN));
    protected LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalBack =
            LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.SOUTH));

    /**
     * Retrieves the Optional handler for the capability requested on the specific side.
     *
     * @param cap  The capability to check
     * @param side The Direction to check from. CAN BE NULL! Null is defined to represent 'internal' or 'self'
     * @return The requested an optional holding the requested capability.
     */
    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull final Capability<T> cap, @Nullable final Direction side)
    {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
        {
            if (side == null)
                return inventoryCapabilityInternal.cast();

            /* fix side for any rotation... */
            Direction actual_facing = this.getBlockState().getValue(HorizontalDirectionalBlock.FACING);
            Direction default_facing = Direction.NORTH;

            Direction true_side;
            if (side == Direction.UP || side == Direction.DOWN)
            {
                true_side = side;
            }
            else if (actual_facing.getOpposite() == default_facing) {
                true_side = side.getOpposite();
            }
            else if (actual_facing.getClockWise() == default_facing) {
                true_side = side.getClockWise();
            }
            else if (actual_facing.getCounterClockWise() == default_facing) {
                true_side = side.getCounterClockWise();
            }
            else {
                true_side = side;
            }
            switch (true_side) {
                case DOWN:
                    return inventoryCapabilityExternalDown.cast();
                case UP:
                    return inventoryCapabilityExternalUp.cast();
                case NORTH:
                case SOUTH:
                    return inventoryCapabilityExternalBack.cast();
                case WEST:
                    return inventoryCapabilityExternalRight.cast();
                case EAST:
                    return inventoryCapabilityExternalLeft.cast();
            }
        }
        return super.getCapability(cap, side);
    } // end getCapability()


    @Override
    public void invalidateCaps()
    {
        super.invalidateCaps();
        // We need to invalidate our capability references so that any cached references (by other mods) don't
        // continue to reference our capabilities and try to use them and/or prevent them from being garbage collected
        inventoryCapabilityInternal.invalidate();
        inventoryCapabilityExternalUp.invalidate();
        inventoryCapabilityExternalDown.invalidate();
        inventoryCapabilityExternalBack.invalidate();
        inventoryCapabilityExternalLeft.invalidate();
        inventoryCapabilityExternalRight.invalidate();
    }


    @Override
    public void reviveCaps()
    {
        super.reviveCaps();
        inventoryCapabilityInternal = LazyOptional.of(() -> this.inventory);
        inventoryCapabilityExternalUp = LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.UP));
        inventoryCapabilityExternalLeft = LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.EAST));
        inventoryCapabilityExternalRight = LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.WEST));
        inventoryCapabilityExternalDown = LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.DOWN));
        inventoryCapabilityExternalBack = LazyOptional.of(() -> new AlloyFurnaceHandler(this.inventory, Direction.SOUTH));
    }


    public AbstractAlloyFurnaceTileEntity(BlockEntityType<?> tileEntityTypeIn, BlockPos blockpos, BlockState blockstate)
    {
        super(tileEntityTypeIn, blockpos, blockstate);
        this.fuelMultiplier = 1.0;
        this.hasFuelMultiplier = false;
    }

    /**
     * @return If the stack is not empty and has an alloying recipe associated with it
     */
    protected boolean isInput(final ItemStack stack)
    {
        if (stack.isEmpty())
            return false;
        boolean is_input = AlloyRecipe.isInput(stack);
        return is_input;
    }

    protected boolean isCatalyst(final ItemStack stack)
    {
        if (stack.isEmpty())
            return false;
        boolean is_cata = AlloyRecipe.isCatalyst(stack);
        return is_cata;
    }

    /**
     * @return If the stack's item is equal to the result of smelting our input
     */

    protected boolean isOutput(final ItemStack stack)
    {
        final Optional<ItemStack> result = getResult(inventory.getStackInSlot(INPUT1_SLOT),
                inventory.getStackInSlot(INPUT2_SLOT), inventory.getStackInSlot(CATALYST_SLOT));
        return result.isPresent() && ItemStack.isSame(result.get(), stack);
    }

    public boolean isFuel(ItemStack stack)
    {
        return FurnaceBlockEntity.isFuel(stack);
    }

    public boolean isBurning()
    {
        return this.fuelBurnTimeLeft > 0;
    }

    /**
     * @return The smelting recipe for the input stack
     */
    private Optional<IAlloyRecipe> getRecipe(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
    {
        if (input1.isEmpty() || input2.isEmpty() || catalyst.isEmpty()
                || (input1 == failedMatch1 && input2 == failedMatch2 && catalyst == failedMatchC))
        {
            return Optional.empty();
        }
        // Due to vanilla's code we need to pass an IInventory into
        // RecipeManager#getRecipe, so we make one here.
        return getRecipe(new SimpleContainer(input1, input2, catalyst));
    }

    /**
     * @return The alloying recipe for the inventory
     */
    private Optional<IAlloyRecipe> getRecipe(final Container inv)
    {
        RecipeWrapper inv0 = new RecipeWrapper(new InvWrapper(inv));
        if (cachedRecipe != null && cachedRecipe.matches(inv0, level))
        {
            return Optional.of(cachedRecipe);
        }
        else
        {
            IAlloyRecipe rec
                    = level.getRecipeManager().getRecipeFor(ModRecipes.ALLOY_TYPE.get(), inv0, level).orElse(null);
            if (rec == null)
            {
                failedMatch1 = inv.getItem(INPUT1_SLOT);
                failedMatch2 = inv.getItem(INPUT2_SLOT);
                failedMatchC = inv.getItem(CATALYST_SLOT);
            }
            else {
                failedMatch1 = ItemStack.EMPTY;
                failedMatch2 = ItemStack.EMPTY;
                failedMatchC = ItemStack.EMPTY;
            }
            cachedRecipe = rec;
            return Optional.ofNullable(rec);
        } // end-else
    } // end getRecipe(IInventory)

    /**
     * @return The result of smelting the input stack
     */
    private Optional<ItemStack> getResult(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
    {
        RecipeWrapper inv0 = new RecipeWrapper(new InvWrapper(new SimpleContainer(input1, input2, catalyst)));
        Optional<ItemStack> maybe_result = getRecipe(input1, input2, catalyst).map(recipe -> recipe.assemble(inv0));

        return Optional.of(maybe_result.orElse(ItemStack.EMPTY));
    }

    public void setRecipeUsed(@Nullable Recipe<?> recipe)
    {
        if (recipe != null)
        {
            this.recipe2xp_map.compute(recipe.getId(), (p_214004_0_, p_214004_1_) -> {
                return 1 + (p_214004_1_ == null ? 0 : p_214004_1_);
            });
        }
    } // end setRecipeUsed()

    /**
     * Given a stack of fuel, gets the burn duration of one item.
     * @param fuelstack - fuel items to be checked.
     * @return burn duration in ticks.
     */
    protected int getBurnDuration(ItemStack fuelstack)
    {
        int returnval = 0;

        // ForgeHooks.getBurnTime() handles empty stack case, so we don't have to.
        if (!hasFuelMultiplier)
        {
            returnval = (int) Math.ceil(((double)ForgeHooks.getBurnTime(fuelstack, null)) * BURN_TIME_MODIFIER);
        }
        else {
            // improved fuel efficiency processing here.
            returnval = (int) Math.ceil(((double) ForgeHooks.getBurnTime(fuelstack, null)) * fuelMultiplier  * BURN_TIME_MODIFIER);
        }
        return returnval;
    } // end getBurnDuration

    /**
     * Is it physically possible to put the smelting result in the output slot and do we have inputs at all?
     * @param result - hypothetical smelting product.
     * @return true if result can be added to output slot, false if it cannot.
     */
    protected boolean canSmelt(ItemStack result)
    {
        if (!this.inventory.getStackInSlot(INPUT1_SLOT).isEmpty() && !this.inventory.getStackInSlot(INPUT2_SLOT).isEmpty()
                && !this.inventory.getStackInSlot(CATALYST_SLOT).isEmpty() && !result.isEmpty())
        {
            ItemStack outstack = inventory.getStackInSlot(OUTPUT_SLOT);
            if (outstack.isEmpty())
            {
                return true;
            }
            else if (!outstack.sameItem(result))
            {
                return false;
            }
            else
            { // Forge fix: make furnace respect stack sizes in furnace recipes
                return (outstack.getCount() + result.getCount() <= outstack.getMaxStackSize());
            }

        } // end-if not output empty and not result empty.
        else
        {
            return false;
        }
    } // end canSmelt()


    private int getAlloyTime(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
    {
        Optional<IAlloyRecipe> maybeRecipe = getRecipe(input1, input2, catalyst);
        if (maybeRecipe.isPresent()) {
            return ((AlloyRecipe) maybeRecipe.get()).getCookTime();
        }
        else {
            return DEFAULT_ALLOY_TIME;
        }
    } // end getAlloyTime

    protected void smelt(ItemStack result)  // result = itemstack1
    {
        if (!result.isEmpty() && this.canSmelt(result))
        {
            final ItemStack input1 = inventory.getStackInSlot(INPUT1_SLOT).copy();
            final ItemStack input2 = inventory.getStackInSlot(INPUT2_SLOT).copy();
            final ItemStack catalyst = inventory.getStackInSlot(CATALYST_SLOT).copy();
            ItemStack outstack = inventory.getStackInSlot(OUTPUT_SLOT).copy();

            if (outstack.isEmpty())
            {
                inventory.setStackInSlot(OUTPUT_SLOT, result.copy());
            }
            else if (outstack.getItem() == result.getItem())
            {
                outstack.grow(result.getCount());
                inventory.setStackInSlot(OUTPUT_SLOT, outstack);
            }
            if (!this.level.isClientSide)
            {
                this.setRecipeUsed(getRecipe(input1, input2, catalyst).orElse(null));
            }
            if (input1.hasContainerItem())
                inventory.setStackInSlot(INPUT1_SLOT, input1.getContainerItem());
            else {
                input1.shrink(1);
                inventory.setStackInSlot(INPUT1_SLOT, input1); // Update the data
            }
            if (input2.hasContainerItem())
                inventory.setStackInSlot(INPUT2_SLOT, input2.getContainerItem());
            else {
                input2.shrink(1);
                inventory.setStackInSlot(INPUT2_SLOT, input2); // Update the data
            }
            if (catalyst.hasContainerItem())
                inventory.setStackInSlot(CATALYST_SLOT, catalyst.getContainerItem());
            else {
                catalyst.shrink(1);
                inventory.setStackInSlot(CATALYST_SLOT, catalyst); // Update the data
            }
        } // end-if canSmelt result
    } // end burn()

    /**
     * Called every tick to update our tile entity
     */
    public static void serverTick(Level level, BlockPos blockpos, BlockState blockstate, AbstractAlloyFurnaceTileEntity tile)
    {
        // Fuel burning code
        boolean hasFuel = tile.isBurning();
        boolean flag1 = false;
        if (tile.isBurning()) {
            --tile.fuelBurnTimeLeft;
        }

        if (!level.isClientSide)
        {
            // Alloying code
            ItemStack input1 = tile.inventory.getStackInSlot(INPUT1_SLOT).copy();
            ItemStack input2 = tile.inventory.getStackInSlot(INPUT2_SLOT).copy();
            ItemStack catalyst = tile.inventory.getStackInSlot(CATALYST_SLOT).copy();
            ItemStack fuel = tile.inventory.getStackInSlot(FUEL_SLOT).copy();
            ItemStack result = tile.getResult(input1, input2, catalyst).orElse(ItemStack.EMPTY);

            if ((tile.isBurning() || !fuel.isEmpty()) &&
                    (!input1.isEmpty() && !input2.isEmpty() && !catalyst.isEmpty()))
            {
                if (!tile.isBurning() && tile.canSmelt(result))
                {
                    tile.fuelBurnTimeLeft = tile.getBurnDuration(fuel);
                    tile.maxFuelBurnTime = tile.fuelBurnTimeLeft;
                    if (tile.isBurning())
                    {
                        flag1 = true;
                        if (fuel.hasContainerItem())
                        {
                            tile.inventory.setStackInSlot(FUEL_SLOT, fuel.getContainerItem());
                        }
                        else if (!fuel.isEmpty())
                        {
                            fuel.shrink(1);
                            tile.inventory.setStackInSlot(FUEL_SLOT, fuel); // Update the data
                        }
                    } // end-if isBurning
                } // end-if !isBurning but canSmelt
                if (tile.isBurning() && tile.canSmelt(result))
                {
                    if (tile.smeltTimeProgress <= 0) // Item has not been smelted before
                    {
                        tile.maxSmeltTime = tile.getAlloyTime(input1, input2, catalyst);
                        tile.smeltTimeProgress = 0;
                    }
                    ++tile.smeltTimeProgress;
                    if (tile.smeltTimeProgress >= tile.maxSmeltTime)
                    {
                        tile.smelt(result);
                        tile.smeltTimeProgress = 0;
                        if (!tile.inventory.getStackInSlot(INPUT1_SLOT).isEmpty()
                                && !tile.inventory.getStackInSlot(INPUT2_SLOT).isEmpty()
                                && !tile.inventory.getStackInSlot(CATALYST_SLOT).isEmpty())
                        {
                            tile.maxSmeltTime =
                                    tile.getAlloyTime(tile.inventory.getStackInSlot(INPUT1_SLOT),
                                            tile.inventory.getStackInSlot(INPUT2_SLOT),
                                            tile.inventory.getStackInSlot(CATALYST_SLOT));
                        }
                        else {
                            tile.maxSmeltTime = 0;
                        }
                        flag1 = true;
                    } // end-if progress == maxTime
                } // end-if burning and canBurn
                else {
                    tile.smeltTimeProgress = 0;
                }
            } // end-if isBurning & fuel & inputs
            else if (! tile.isBurning() && tile.smeltTimeProgress > 0)
            {
                tile.smeltTimeProgress = (short) Mth.clamp(tile.smeltTimeProgress - 2, 0, tile.maxSmeltTime);
            } // end-else if ! burning & smeltTimeProgress
            if (hasFuel != tile.isBurning())
            {
                flag1 = true;
                final BlockState newState = tile.getBlockState().setValue(BlockStateProperties.LIT, tile.isBurning());

                // Flag 2: Send the change to clients
                level.setBlock(blockpos, newState, 3);
            }
        } // end-if ! clientSide

        if (flag1) {
            tile.setChanged();
        }
    } // end tick()

    /**
     * Read saved data from disk into the tile.
     */
    @Override
    public void load(CompoundTag compound)
    {
        super.load(compound);
        this.inventory.deserializeNBT(compound.getCompound(INVENTORY_TAG));
        this.smeltTimeProgress = compound.getInt(SMELT_TIME_LEFT_TAG);
        this.maxSmeltTime = compound.getInt(MAX_SMELT_TIME_TAG);
        this.fuelBurnTimeLeft = compound.getInt(FUEL_BURN_TIME_LEFT_TAG);
        this.maxFuelBurnTime = compound.getInt(MAX_FUEL_BURN_TIME_TAG);

        // We set this in read() instead of the constructor so that TileEntities
        // constructed from NBT (saved tile entities) have this set to the proper value
        if (this.hasLevel() && !this.level.isClientSide) {
            lastBurning = this.isBurning();
        }

        // get recipe2xp map
        int ii = compound.getShort("RecipesUsedSize");
        for(int jj = 0; jj < ii; ++jj) {
            ResourceLocation resourcelocation
                    = new ResourceLocation(compound.getString("RecipeLocation" + jj));
            int kk = compound.getInt("RecipeAmount" + jj);
            this.recipe2xp_map.put(resourcelocation, kk);
        }

        // blockstate?
        if (this.hasLevel()) {
            this.level.setBlockAndUpdate(getBlockPos(), this.getBlockState().setValue(AbstractAlloyFurnaceBlock.LIT, this.isBurning()));
        }

    } // end load()

    /**
     * Write data from the tile into a compound tag for saving to disk.
     */
    @Nonnull
    @Override
    public void saveAdditional(final CompoundTag compound)
    {
        super.saveAdditional(compound);
        compound.put(INVENTORY_TAG, this.inventory.serializeNBT());
        compound.putInt(SMELT_TIME_LEFT_TAG, this.smeltTimeProgress);
        compound.putInt(MAX_SMELT_TIME_TAG, this.maxSmeltTime);
        compound.putInt(FUEL_BURN_TIME_LEFT_TAG, this.fuelBurnTimeLeft);
        compound.putInt(MAX_FUEL_BURN_TIME_TAG, this.maxFuelBurnTime);

        // write recipe2xp map
        compound.putShort("RecipesUsedSize", (short)this.recipe2xp_map.size());
        int ii = 0;
        for(Entry<ResourceLocation, Integer> entry : this.recipe2xp_map.entrySet())
        {
            compound.putString("RecipeLocation" + ii, entry.getKey().toString());
            compound.putInt("RecipeAmount" + ii, entry.getValue());
            ++ii;
        }
    } // end saveAdditional()

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    /**
     * Called when you receive a TileEntityData packet for the location this
     * TileEntity is currently in. On the client, the NetworkManager will always
     * be the remote server. On the server, it will be whoever is responsible for
     * sending the packet.
     *
     * @param net The NetworkManager the packet originated from
     * @param pkt The data packet
     */
    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt)
    {
        CompoundTag nbtTag = pkt.getTag();
        this.load(nbtTag);
    }


    @Override
    @Nonnull
    public CompoundTag getUpdateTag()
    {
        return this.saveWithFullMetadata();
    }

    @Override
    public void handleUpdateTag(CompoundTag tag)
    {
        this.load(tag);
    }


    public void grantExperience(Player player)
    {
        List<Recipe<?>> list = Lists.newArrayList();

        for (Entry<ResourceLocation, Integer> entry : this.recipe2xp_map.entrySet())
        {
            player.level.getRecipeManager().byKey(entry.getKey()).ifPresent((p_213993_3_) -> {
                list.add(p_213993_3_);
                spawnExpOrbs(player, entry.getValue(), ((AlloyRecipe) p_213993_3_).getExperience());
            });
        }
        player.awardRecipes(list);
        this.recipe2xp_map.clear();
    }

    private static void spawnExpOrbs(Player player, int pCount, float experience)
    {
        if (experience == 0.0F) {
            pCount = 0;
        }
        else if (experience < 1.0F)
        {
            int i = Mth.floor((float) pCount * experience);
            if (i < Mth.ceil((float) pCount * experience)
                    && Math.random() < (double) ((float) pCount * experience - (float) i))
            {
                ++i;
            }
            pCount = i;
        }

        while (pCount > 0)
        {
            int j = ExperienceOrb.getExperienceValue(pCount);
            pCount -= j;
            player.level.addFreshEntity(new ExperienceOrb(player.level, player.getX(), player.getY() + 0.5D,
                    player.getZ() + 0.5D, j));
        }
    } // end spawnExpOrbs()

} // end-class