//package mod.mores.block.entity;
//
//import mod.mores.block.ModBlocks;
//import net.minecraft.core.BlockPos;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.world.Container;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.inventory.FurnaceMenu;
//import net.minecraft.world.item.crafting.AbstractCookingRecipe;
//import net.minecraft.world.item.crafting.RecipeType;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.state.BlockState;
//
//public class AlloyFurnaceBlockEntity extends BlockEntity implements MenuProvider {
//    public AlloyFurnaceBlockEntity(BlockEntityType<?> pType, BlockPos pWorldPosition, BlockState pBlockState, RecipeType<? extends AbstractCookingRecipe> pRecipeType) {
//        super(pType, pWorldPosition, pBlockState, pRecipeType);
//    }
//    protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
//        return new FurnaceMenu(pId, pPlayer, this, this.dataAccess);
//    }
//
//    protected Component getDefaultName() {
//        return new TranslatableComponent("container.alloy_furnace");
//    }
//
//    public AlloyFurnaceBlockEntity() {
//        this(ModBlockEntities.ALLOY_FURNACE.get());
//    }
//}
