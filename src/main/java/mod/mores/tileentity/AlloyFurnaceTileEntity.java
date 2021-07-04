package mod.mores.tileentity;

import mod.mores.container.AlloyFurnaceContainer;
import mod.mores.init.BlockInit;
import mod.mores.init.TileEntityTypeInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class AlloyFurnaceTileEntity extends AbstractAlloyFurnaceTileEntity{
    public AlloyFurnaceTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public Container createMenu(int windowId, PlayerInventory inventory, PlayerEntity player) {
        return new AlloyFurnaceContainer(windowId, inventory, this);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent(BlockInit.ALLOY_FURNACE.get().getDescriptionId());
    }

    public AlloyFurnaceTileEntity() {
        this(TileEntityTypeInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get());
    }

}
