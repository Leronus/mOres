package mod.mores.objects;

import mod.mores.init.TileEntityTypesInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import org.jetbrains.annotations.Nullable;

public class BlockAlloyFurnace extends Block {
    public BlockAlloyFurnace(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypesInit.ALLOY_FURNACE_TILE_ENTITY_TYPE.get().create();
    }
}
