//package mod.mores.tileentity;
//
//import mod.mores.container.AlloyFurnaceMenu;
//import mod.mores.init.TileEntityTypeInit;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.world.Container;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//
//public class AlloyFurnaceBlockEntity extends AbstractAlloyFurnaceBlockEntity {
//    public AlloyFurnaceBlockEntity(BlockEntityType<?> tileEntityTypeIn) {
//        super(tileEntityTypeIn);
//    }
//
//    @Override
//    public Container createMenu(int windowId, Inventory inventory, Inventory player) {
//        return new AlloyFurnaceMenu(windowId, inventory, this);
//    }
//
//    protected Component getDefaultName() {
//        return new TranslatableComponent("container.alloy.furnace");
//    }
//
//    public AlloyFurnaceBlockEntity() {
//        this(TileEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get());
//    }
//
//}
