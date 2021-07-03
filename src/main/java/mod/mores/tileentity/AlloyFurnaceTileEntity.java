package mod.mores.tileentity;

import mod.mores.init.TileEntityTypeInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;

public class AlloyFurnaceTileEntity extends AbstractAlloyFurnaceTileEntity{
    public AlloyFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public Container createMenu(int windowId, PlayerInventory inventory, PlayerEntity player) {
        return null;
    }

    @Override
    public ITextComponent getDisplayName() {
        return null;
    }

    public AlloyFurnaceTileEntity() {
        this(TileEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get());
    }

}
