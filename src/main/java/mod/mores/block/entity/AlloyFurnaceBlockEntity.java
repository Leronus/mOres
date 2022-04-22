package mod.mores.block.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Maps;
import mod.mores.block.custom.AlloyFurnaceBlock;
import mod.mores.item.ModItems;
import mod.mores.recipe.AlloyFurnaceRecipe;
import mod.mores.recipe.ModRecipes;
import mod.mores.screen.AlloyFurnaceMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.items.wrapper.RecipeWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class AlloyFurnaceBlockEntity extends BlockEntity implements MenuProvider
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

    // used for improved fusion furnaces
    protected double fuelMultiplier = 1.0;
    protected int YieldChance = 0;
    protected int YieldAmount = 0;
    protected Random generator = new Random();

    // configurable.
    private final double BURN_TIME_MODIFIER = 1.875F;

    private final ItemStackHandler itemHandler = new ItemStackHandler(5) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    public AlloyFurnaceBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ALLOY_FURNACE.get(), pWorldPosition, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Alloy Furnace");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new AlloyFurnaceMenu(pContainerId, pInventory, this);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put(INVENTORY_TAG, itemHandler.serializeNBT());
        tag.putShort(SMELT_TIME_LEFT_TAG, this.smeltTimeLeft);
        tag.putShort(MAX_SMELT_TIME_TAG, this.maxSmeltTime);
        tag.putInt(FUEL_BURN_TIME_LEFT_TAG, this.fuelBurnTimeLeft);
        tag.putInt(MAX_FUEL_BURN_TIME_TAG, this.maxFuelBurnTime);

        // write recipe2xp map
        tag.putShort("RecipesUsedSize", (short)this.recipe2xp_map.size());
        int ii = 0;
        for(Map.Entry<ResourceLocation, Integer> entry : this.recipe2xp_map.entrySet())
        {
            tag.putString("RecipeLocation" + ii, entry.getKey().toString());
            tag.putInt("RecipeAmount" + ii, entry.getValue());
            ++ii;
        }
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        this.smeltTimeLeft = nbt.getShort(SMELT_TIME_LEFT_TAG);
        this.maxSmeltTime = nbt.getShort(MAX_SMELT_TIME_TAG);
        this.fuelBurnTimeLeft = nbt.getInt(FUEL_BURN_TIME_LEFT_TAG);
        this.maxFuelBurnTime = nbt.getInt(MAX_FUEL_BURN_TIME_TAG);

        // We set this in read() instead of the constructor so that TileEntities
        // constructed from NBT (saved tile entities) have this set to the proper value
        if (this.level != null && !this.level.isClientSide) {
            lastBurning = this.isBurning();
        }

        // Get recipe2xp map
        int ii = nbt.getShort("RecipesUsedSize");
        for(int jj = 0; jj < ii; ++jj) {
            ResourceLocation resourcelocation
                    = new ResourceLocation(nbt.getString("RecipeLocation" + jj));
            int kk = nbt.getInt("RecipeAmount" + jj);
            this.recipe2xp_map.put(resourcelocation, kk);
        }

        // Blockstate
        if (this.level != null) {
            this.level.setBlockAndUpdate(getBlockPos(), this.getBlockState().setValue(AlloyFurnaceBlock.LIT, this.isBurning()));
        }

        itemHandler.deserializeNBT(nbt.getCompound(INVENTORY_TAG));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public boolean isBurning()
    {
        return this.fuelBurnTimeLeft > 0;
    }


    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, AlloyFurnaceBlockEntity pBlockEntity) {
//        if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
//            craftItem(pBlockEntity);
//        }
        // Fuel burning code
        boolean hasFuel = pBlockEntity.isBurning();

        if (pBlockEntity.isBurning()) {
            --pBlockEntity.fuelBurnTimeLeft;
        }

        if (pLevel == null || pLevel.isClientSide)
            return;

        // Alloying code
        final ItemStack input1 = pBlockEntity.itemHandler.getStackInSlot(INPUT1_SLOT).copy();
        final ItemStack input2 = pBlockEntity.itemHandler.getStackInSlot(INPUT2_SLOT).copy();
        final ItemStack catalyst = pBlockEntity.itemHandler.getStackInSlot(CATALYST_SLOT).copy();

        final ItemStack result = pBlockEntity.getResult(pBlockEntity.itemHandler).orElse(ItemStack.EMPTY);

        if (!result.isEmpty())
        {
            final boolean canInsertResultIntoOutput = pBlockEntity.itemHandler.insertItem(OUTPUT_SLOT, result, true).isEmpty();
            if (canInsertResultIntoOutput)
            {
                if (!hasFuel) {
                    if (pBlockEntity.burnFuel())
                        hasFuel = true;
                }
                if (hasFuel)
                {
                    if (pBlockEntity.smeltTimeLeft == -1)
                    { // Item has not been smelted before
                        pBlockEntity.smeltTimeLeft = pBlockEntity.maxSmeltTime = pBlockEntity.getAlloyTime(input1, input2, catalyst);
                    }
                    else { // Item was already being smelted
                        --pBlockEntity.smeltTimeLeft;
                        if (pBlockEntity.smeltTimeLeft == 0)
                        {
                            pBlockEntity.setRecipeUsed(pBlockEntity.getRecipe(input1, input2, catalyst).get());
                            pBlockEntity.itemHandler.insertItem(OUTPUT_SLOT, result, false);
                            if (input1.hasContainerItem())
                                pBlockEntity.itemHandler.setStackInSlot(INPUT1_SLOT, input1.getContainerItem());
                            else {
                                input1.shrink(1);
                                pBlockEntity.itemHandler.setStackInSlot(INPUT1_SLOT, input1); // Update the data
                            }
                            if (input2.hasContainerItem())
                                pBlockEntity.itemHandler.setStackInSlot(INPUT2_SLOT, input2.getContainerItem());
                            else {
                                input2.shrink(1);
                                pBlockEntity.itemHandler.setStackInSlot(INPUT2_SLOT, input2); // Update the data
                            }
                            if (catalyst.hasContainerItem())
                                pBlockEntity.itemHandler.setStackInSlot(CATALYST_SLOT, catalyst.getContainerItem());
                            else {
                                catalyst.shrink(1);
                                pBlockEntity.itemHandler.setStackInSlot(CATALYST_SLOT, catalyst); // Update the data
                            }
                            pBlockEntity.smeltTimeLeft = -1; // Set to -1 so we smelt the next stack on the next tick
                        } // end-if
                    } // end-else
                }
                else // No fuel -> add to smelt time left to simulate cooling
                {
                    if (pBlockEntity.smeltTimeLeft < pBlockEntity.maxSmeltTime)
                        ++pBlockEntity.smeltTimeLeft;
                }
            } // end-if canInsert
        } // end-if valid inputs
        else // We have an invalid input stack (somehow)
        {
            pBlockEntity.smeltTimeLeft = pBlockEntity.maxSmeltTime = -1;
        }

        // Syncing code
        // If the burning state has changed.
        if (pBlockEntity.lastBurning != hasFuel)
        {
            // We use hasFuel because the current fuel may be all burnt out but we have
            // more that will be used next tick

            // "markDirty" tells vanilla that the chunk containing the tile entity has
            // changed and means the game will save the chunk to disk later.
            pBlockEntity.setChanged();

            // Flag 2: Send the change to clients & update blockstate
            pBlockEntity.level.setBlock(pBlockEntity.worldPosition,
                    pBlockEntity.level.getBlockState(pBlockEntity.worldPosition).setValue(AlloyFurnaceBlock.LIT,
                            pBlockEntity.isBurning()),
                    2);

            // Update the last synced burning state to the current burning state
            pBlockEntity.lastBurning = hasFuel;
        } // end-if
    }
    /**
     * Mimics the code in {AbstractFurnaceTileEntity#getTotalCookTime()}
     *
     * @return The custom smelt time or 200 if there is no recipe for the input
     */
    private short getAlloyTime(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
    {
        Optional<AlloyFurnaceRecipe> maybeRecipe = getRecipe(input1, input2, catalyst);
        if (maybeRecipe.isPresent()) {
            return (short) ((AlloyFurnaceRecipe) maybeRecipe.get()).getCookTime();
        }
        else {
            return 200;
        }
    } // end getAlloyTime

    /**
     * @return If the fuel was burnt
     */
    private boolean burnFuel()
    {
        final ItemStack fuelStack = itemHandler.getStackInSlot(FUEL_SLOT).copy();
        if (!fuelStack.isEmpty())
        {
            final int burnTime = (int) (ForgeHooks.getBurnTime(fuelStack, null) * BURN_TIME_MODIFIER);
            if (burnTime > 0) {
                fuelBurnTimeLeft = maxFuelBurnTime = burnTime;
                if (fuelStack.hasContainerItem())
                    itemHandler.setStackInSlot(FUEL_SLOT, fuelStack.getContainerItem());
                else {
                    fuelStack.shrink(1);
                    itemHandler.setStackInSlot(FUEL_SLOT, fuelStack); // Update the data
                }
                return true;
            }
        } // end-if
        fuelBurnTimeLeft = maxFuelBurnTime = -1;
        return false;
    } // end burnFuel()

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
     * @return If the stack's item is equal to the result of smelting our input
     */
//    protected boolean isOutput(final ItemStack stack)
//    {
//        final ItemStack result = getResult(itemHandler);
//        return result.isPresent() && ItemStack.isSame(result.get(), stack);
//    }

    /**
     * @return The smelting recipe for the input stack
     */
    private Optional<AlloyFurnaceRecipe> getRecipe(final ItemStack input1, final ItemStack input2, final ItemStack catalyst)
    {
        SimpleContainer inv0 = new SimpleContainer(input1, input2, catalyst);
        return level.getRecipeManager().getRecipeFor(AlloyFurnaceRecipe.Type.INSTANCE, inv0, level);
    }

    /**
     * @return The result of smelting the input stack
     */
    private Optional<ItemStack> getResult(final ItemStackHandler inventory)
    {
        SimpleContainer inv0 = new SimpleContainer(inventory.getSlots());
        Optional<AlloyFurnaceRecipe> recipe = getRecipe(inventory.getStackInSlot(INPUT1_SLOT), inventory.getStackInSlot(INPUT2_SLOT), inventory.getStackInSlot(CATALYST_SLOT));
        ItemStack result = recipe.isPresent()
                ? recipe.get().assemble(inv0)
                : null;
        return Optional.ofNullable(result);
    }

    private static void craftItem(AlloyFurnaceBlockEntity entity) {
        entity.itemHandler.extractItem(0, 1, false);
        entity.itemHandler.extractItem(1, 1, false);
//        entity.itemHandler.getStackInSlot(2).hurt(1, new Random(), null);
        entity.itemHandler.extractItem(2, 1, false);
        entity.itemHandler.extractItem(3, 1, false);

        entity.itemHandler.setStackInSlot(4, new ItemStack(ModItems.BRONZE_INGOT.get(),
                entity.itemHandler.getStackInSlot(4).getCount() + 1));
    }

    private static boolean hasRecipe(AlloyFurnaceBlockEntity entity) {
//        boolean hasItemInFirstSlot = PotionUtils.getPotion(entity.itemHandler.getStackInSlot(0)) == Potions.WATER;
        boolean hasItemInFuelSlot = entity.itemHandler.getStackInSlot(0).getItem() == Items.COAL;
        boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(1).getItem() == ModItems.TIN_INGOT.get();
        boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(2).getItem() == Items.COPPER_INGOT;
        boolean hasItemInThirdSlot = entity.itemHandler.getStackInSlot(3).getItem() == Items.GUNPOWDER;

        return hasItemInFuelSlot && hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(AlloyFurnaceBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(4).getCount() < entity.itemHandler.getStackInSlot(4).getMaxStackSize();
    }
} // end-class
