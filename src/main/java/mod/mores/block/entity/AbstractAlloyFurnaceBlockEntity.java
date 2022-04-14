package mod.mores.block.entity;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import mod.mores.block.custom.AbstractAlloyFurnaceBlock;
import mod.mores.recipe.AlloyFurnaceRecipe;
import mod.mores.recipe.ModRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.RecipeHolder;
import net.minecraft.world.inventory.StackedContentsCompatible;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.RangedWrapper;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public abstract class AbstractAlloyFurnaceBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer, RecipeHolder, StackedContentsCompatible
{

    public static final int INPUT1_SLOT = 0;
    public static final int INPUT2_SLOT = 1;
    public static final int CATALYST_SLOT = 2;
    public static final int OUTPUT_SLOT = 3;
    public static final int FUEL_SLOT = 4;

    private static final String INVENTORY_TAG = "inventory";
    private static final String SMELT_TIME_LEFT_TAG = "smeltTimeLeft";
    private static final String MAX_SMELT_TIME_TAG = "maxSmeltTime";
    private static final String FUEL_BURN_TIME_LEFT_TAG = "fuelBurnTimeLeft";
    private static final String MAX_FUEL_BURN_TIME_TAG = "maxFuelBurnTime";

    public short smeltTimeLeft = -1;
    public short maxSmeltTime = -1;
    public int fuelBurnTimeLeft = -1;
    public int maxFuelBurnTime = -1;
    private boolean lastBurning = false;

    private final Map<ResourceLocation, Integer> recipe2xp_map = Maps.newHashMap();

    // configurable.
    private final double BURN_TIME_MODIFIER = 1.875F;

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
                    return FurnaceBlockEntity.isFuel(stack);
                case INPUT1_SLOT:
                case INPUT2_SLOT:
                    return true;
                case CATALYST_SLOT:
                    return true;
                case OUTPUT_SLOT:
//                    return isOutput(stack);
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
            AbstractAlloyFurnaceBlockEntity.this.setChanged();
        } // end ItemStackHandler.onContentsChanged()
    };

    private final LazyOptional<ItemStackHandler> inventoryCapabilityExternal = LazyOptional.of(() -> this.inventory);
    private final LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalUp = LazyOptional.of(() -> new RangedWrapper(this.inventory, CATALYST_SLOT, CATALYST_SLOT + 1));
    private final LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalLeft = LazyOptional.of(() -> new RangedWrapper(this.inventory, INPUT1_SLOT, INPUT1_SLOT + 1));
    private final LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalRight = LazyOptional.of(() -> new RangedWrapper(this.inventory, INPUT2_SLOT, INPUT2_SLOT + 1));
    private final LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalDown = LazyOptional.of(() -> new RangedWrapper(this.inventory, OUTPUT_SLOT, OUTPUT_SLOT + 1));
    private final LazyOptional<IItemHandlerModifiable> inventoryCapabilityExternalBack = LazyOptional.of(() -> new RangedWrapper(this.inventory, FUEL_SLOT, FUEL_SLOT + 1));

    private final RecipeType<? extends AbstractCookingRecipe> recipeType;

    public AbstractAlloyFurnaceBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends AbstractCookingRecipe> pRecipeType)
    {
        super(pType, pWorldPosition, pBlockState);
        this.recipeType = pRecipeType;
    }


//    /**
//     * @return If the stack's item is equal to the result of smelting our input
//     */
//
//    protected boolean isOutput(final ItemStack stack)
//    {
//        final Optional<ItemStack> result = getResult(inventory);
//        return result.isPresent() && ItemStack.isSame(result.get(), stack);
//    }

//    /**
//     * @return The smelting recipe for the input stack
//     */
//    private Optional<AlloyFurnaceRecipe> getRecipe(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
//    {
//        // Due to vanilla's code we need to pass an IInventory into
//        // RecipeManager#getRecipe so we make one here.
//        return getRecipe(new Inventory(input1, input2, catalyst));
//    }
//
//    /**
//     *
//     * @return The alloying recipe for the inventory
//     */
//    private Optional<AlloyFurnaceRecipe> getRecipe(final Inventory inv)
//    {
//        RecipeWrapper inv0 = new RecipeWrapper(new InvWrapper(inv));
//        return level.getRecipeManager().getRecipeFor(ModRecipes.ALLOY_TYPE, inv0, level);
//    }
//
//    /**
//     * @return The result of smelting the input stack
//     */
//    private Optional<ItemStack> getResult(final ItemStackHandler inventory)
//    {
//        RecipeWrapper inv0 = new RecipeWrapper(inventory);
//        Optional<AlloyFurnaceRecipe> recipe = getRecipe(inventory.getStackInSlot(INPUT1_SLOT), inventory.getStackInSlot(INPUT2_SLOT), inventory.getStackInSlot(CATALYST_SLOT));
//        ItemStack result = recipe.isPresent()
//                ? recipe.get().assemble(inv0)
//                : null;
//        return Optional.ofNullable(result);
//    }

    public boolean isBurning()
    {
        return this.fuelBurnTimeLeft > 0;
    }

//    /**
//     * Called every tick to update our tile entity
//     */
//    @Override
//    public void serverTick(Level pLevel, BlockPos pPos, BlockState pState, AbstractAlloyFurnaceBlockEntity pBlockEntity)
//    {
//        // Fuel burning code
//        boolean hasFuel = this.isBurning();
//
//        if (this.isBurning()) {
//            --fuelBurnTimeLeft;
//        }
//
//        if (level == null || level.isClientSide)
//            return;
//
//        // Alloying code
//        final ItemStack input1 = inventory.getStackInSlot(INPUT1_SLOT).copy();
//        final ItemStack input2 = inventory.getStackInSlot(INPUT2_SLOT).copy();
//        final ItemStack catalyst = inventory.getStackInSlot(CATALYST_SLOT).copy();
//
//        final ItemStack result = getResult(inventory).orElse(ItemStack.EMPTY);
//
//        if (!result.isEmpty())
//        {
//            final boolean canInsertResultIntoOutput = inventory.insertItem(OUTPUT_SLOT, result, true).isEmpty();
//            if (canInsertResultIntoOutput)
//            {
//                if (!hasFuel) {
//                    if (burnFuel())
//                        hasFuel = true;
//                }
//                if (hasFuel)
//                {
//                    if (smeltTimeLeft == -1)
//                    { // Item has not been smelted before
//                        smeltTimeLeft = maxSmeltTime = getAlloyTime(input1, input2, catalyst);
//                    }
//                    else { // Item was already being smelted
//                        --smeltTimeLeft;
//                        if (smeltTimeLeft == 0)
//                        {
//                            this.setRecipeUsed(getRecipe(input1, input2, catalyst).get());
//                            inventory.insertItem(OUTPUT_SLOT, result, false);
//                            if (input1.hasContainerItem())
//                                inventory.setStackInSlot(INPUT1_SLOT, input1.getContainerItem());
//                            else {
//                                input1.shrink(1);
//                                inventory.setStackInSlot(INPUT1_SLOT, input1); // Update the data
//                            }
//                            if (input2.hasContainerItem())
//                                inventory.setStackInSlot(INPUT2_SLOT, input2.getContainerItem());
//                            else {
//                                input2.shrink(1);
//                                inventory.setStackInSlot(INPUT2_SLOT, input2); // Update the data
//                            }
//                            if (catalyst.hasContainerItem())
//                                inventory.setStackInSlot(CATALYST_SLOT, catalyst.getContainerItem());
//                            else {
//                                catalyst.shrink(1);
//                                inventory.setStackInSlot(CATALYST_SLOT, catalyst); // Update the data
//                            }
//                            smeltTimeLeft = -1; // Set to -1 so we smelt the next stack on the next tick
//                        } // end-if
//                    } // end-else
//                }
//                else // No fuel -> add to smelt time left to simulate cooling
//                {
//                    if (smeltTimeLeft < maxSmeltTime)
//                        ++smeltTimeLeft;
//                }
//            } // end-if canInsert
//        } // end-if valid inputs
//        else // We have an invalid input stack (somehow)
//        {
//            smeltTimeLeft = maxSmeltTime = -1;
//        }
//
//        // Syncing code
//        // If the burning state has changed.
//        if (lastBurning != hasFuel)
//        {
//            // We use hasFuel because the current fuel may be all burnt out but we have
//            // more that will be used next tick
//
//            // "markDirty" tells vanilla that the chunk containing the tile entity has
//            // changed and means the game will save the chunk to disk later.
//            this.setChanged();
//
//            // Flag 2: Send the change to clients & update blockstate
//            this.level.setBlock(this.worldPosition,
//                    this.level.getBlockState(this.worldPosition).setValue(AbstractAlloyFurnaceBlock.LIT,
//                            Boolean.valueOf(this.isBurning())),
//                    2);
//
//            // Update the last synced burning state to the current burning state
//            lastBurning = hasFuel;
//        } // end-if
//    } // end tick()
//
//
//    /**
//     * Mimics the code in {AbstractFurnaceTileEntity#getTotalCookTime()}
//     *
//     * @return The custom smelt time or 200 if there is no recipe for the input
//     */
//    private short getAlloyTime(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
//    {
//        Optional<IAlloyFurnaceRecipe> maybeRecipe = getRecipe(input1, input2, catalyst);
//        if (maybeRecipe.isPresent()) {
//            return (short) ((AlloyFurnaceRecipe) maybeRecipe.get()).getCookTime();
//        }
//        else {
//            return 200;
//        }
//    } // end getAlloyTime
//
//    /**
//     * @return If the fuel was burnt
//     */
//    private boolean burnFuel()
//    {
//        final ItemStack fuelStack = inventory.getStackInSlot(FUEL_SLOT).copy();
//        if (!fuelStack.isEmpty())
//        {
//            final int burnTime = (int) (ForgeHooks.getBurnTime(fuelStack) * BURN_TIME_MODIFIER);
//            if (burnTime > 0) {
//                fuelBurnTimeLeft = maxFuelBurnTime = burnTime;
//                if (fuelStack.hasContainerItem())
//                    inventory.setStackInSlot(FUEL_SLOT, fuelStack.getContainerItem());
//                else {
//                    fuelStack.shrink(1);
//                    inventory.setStackInSlot(FUEL_SLOT, fuelStack); // Update the data
//                }
//                return true;
//            }
//        } // end-if
//        fuelBurnTimeLeft = maxFuelBurnTime = -1;
//        return false;
//    } // end burnFuel()

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
                return inventoryCapabilityExternal.cast();

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

    /**
     * Read saved data from disk into the tile.
     */
    @Override
    public void load(CompoundTag compound)
    {
        super.load(compound);
        this.inventory.deserializeNBT(compound.getCompound(INVENTORY_TAG));
        this.smeltTimeLeft = compound.getShort(SMELT_TIME_LEFT_TAG);
        this.maxSmeltTime = compound.getShort(MAX_SMELT_TIME_TAG);
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
            this.level.setBlockAndUpdate(getBlockPos(), this.getBlockState().setValue(AbstractAlloyFurnaceBlock.LIT, Boolean.valueOf(this.isBurning())));
        }

    } // end read()

    /**
     * Write data from the tile into a compound tag for saving to disk.
     */
    @Nonnull
    @Override
    public void saveAdditional(final CompoundTag compound)
    {
        super.saveAdditional(compound);
        compound.put(INVENTORY_TAG, this.inventory.serializeNBT());
        compound.putShort(SMELT_TIME_LEFT_TAG, this.smeltTimeLeft);
        compound.putShort(MAX_SMELT_TIME_TAG, this.maxSmeltTime);
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
    }

    /**
     * Invalidates our tile entity
     */
    @Override
    public void setRemoved()
    {
        super.setRemoved();
        // We need to invalidate our capability references so that any cached references (by other mods) don't
        // continue to reference our capabilities and try to use them and/or prevent them from being garbage collected
        inventoryCapabilityExternal.invalidate();
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return super.createMenu(pContainerId, pInventory, pPlayer);
    }

    public abstract Component getDisplayName();

} // end-class
