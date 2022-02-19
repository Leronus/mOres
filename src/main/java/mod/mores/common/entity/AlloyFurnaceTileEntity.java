//package mod.mores.tileentity;
//
//import mod.mores.init.BlockInit;
//import mod.mores.init.TileEntityTypeInit;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.world.Container;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//
//public class AlloyFurnaceTileEntity extends AbstractAlloyFurnaceTileEntity{
//    public AlloyFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
//        super(tileEntityTypeIn);
//    }
//
//    @Override
//    public Container createMenu(int windowId, Inventory inventory, Player player) {
//        return new AlloyFurnaceContainer(windowId, inventory, this);
//    }
//
//    @Override
//    public TextComponent getDisplayName() {
//        return new TextComponent(BlockInit.ALLOY_FURNACE.get().getDescriptionId());
//    }
//
//    public AlloyFurnaceTileEntity() {
//        this(TileEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get());
//    }
//
//}
