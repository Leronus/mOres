package mod.mores.tileentity;

import mod.mores.init.TileEntityTypesInit;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class AlloyFurnaceTileEntity extends TileEntity implements ITickableTileEntity {
    public AlloyFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public AlloyFurnaceTileEntity() {
        this(TileEntityTypesInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {

    }
}
