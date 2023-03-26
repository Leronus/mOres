package mod.leronus.mores.datagen;

import mod.leronus.mores.config.Config;
import mod.leronus.mores.painting.ModPaintings;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModPlaceableTagProvider extends PaintingVariantTagsProvider {
    public ModPlaceableTagProvider(DataGenerator generatorIn, String modid, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, modid, existingFileHelper);
    }

    @Override
    protected void addTags() {
            // Create tags for Mores paintings
            this.tag(PaintingVariantTags.PLACEABLE).add(ModPaintings.ALIENBONG.get(), ModPaintings.CNTOWER.get(), ModPaintings.TORONTO.get());

//            // Create tags for Leronus paintings
//            this.tag(PaintingVariantTags.PLACEABLE).add(ModPaintings.MARTIJN.get(), ModPaintings.BRAMHAPPY.get(), ModPaintings.DAANHOT.get(),
//                    ModPaintings.HANDCRAFTEDPP.get(), ModPaintings.HAPPYKEVIN.get(), ModPaintings.HAPPYSILBIG.get(),
//                    ModPaintings.HAPPYSILSMALL.get(), ModPaintings.HIPSTERS.get(), ModPaintings.HUIBCEPTION.get(),
//                    ModPaintings.JASPERDRIPPIN.get(), ModPaintings.JASPERLOSINIT.get(), ModPaintings.JASPERNOTFEELINGGOOD.get(), ModPaintings.KAILEROY.get(),
//                    ModPaintings.LEROYBIER.get(), ModPaintings.LEROYBROKKO.get(), ModPaintings.LEROYLUUKGANG.get(), ModPaintings.LEROYLUUKWEG.get(),
//                    ModPaintings.LEROYSMILE.get(), ModPaintings.LUUKPOOTNEER.get(), ModPaintings.LUUKZWOEL.get(), ModPaintings.MARTIJNSMILE.get(),
//                    ModPaintings.MEDEA.get(), ModPaintings.TIMGROTESTOK.get(), ModPaintings.ZWAREKEVIN.get(), ModPaintings.SILBIGUP.get(), ModPaintings.SJORS.get(),
//                    ModPaintings.LISACUTE.get());
    }
}