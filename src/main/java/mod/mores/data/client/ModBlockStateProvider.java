package mod.mores.data.client;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import mod.mores.objects.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Mores.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.SILVER_BLOCK.get());
        simpleBlock(BlockInit.SILVER_ORE.get());

    }
}