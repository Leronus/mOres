package mod.mores.entity.client;

import mod.mores.Mores;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation DUCK_LAYER =
            new ModelLayerLocation(new ResourceLocation(Mores.MODID, "duck"), "main");
}
