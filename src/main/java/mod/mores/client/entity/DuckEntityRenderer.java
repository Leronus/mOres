package mod.mores.client.entity;

import mod.mores.Mores;
import mod.mores.client.entity.model.DuckEntityModel;
import mod.mores.entity.DuckEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DuckEntityRenderer extends MobRenderer<DuckEntity, DuckEntityModel<DuckEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Mores.MOD_ID, "textures/entity/duck/duck_entity_model.png");

    public DuckEntityRenderer(EntityRendererManager manager) {
        super(manager, new DuckEntityModel<DuckEntity>(), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(DuckEntity entity) {
        return TEXTURE;
    }
}
