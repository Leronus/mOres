package mod.mores.data.client;

import mod.mores.Mores;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Mores.MOD_ID, existingFileHelper);
    }



    @Override
    protected void registerModels() {
        //withExistingParent()
    }
}
