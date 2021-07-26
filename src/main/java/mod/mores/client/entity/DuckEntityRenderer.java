package mod.mores.client.entity;

import mod.mores.Mores;
import mod.mores.client.entity.model.DuckEntityModel;
import mod.mores.client.entity.model.LayerModel;
import mod.mores.entity.DuckEntity;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class DuckEntityRenderer extends MobRenderer<DuckEntity, DuckEntityModel<DuckEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Mores.MOD_ID, "textures/entity/duck/duck_entity_model.png");

    public DuckEntityRenderer(EntityRendererProvider.Context manager) {
        super(manager, new DuckEntityModel<DuckEntity>(manager.bakeLayer(LayerModel.DUCK)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(DuckEntity entity) {
        return TEXTURE;
    }


    protected float getBob(DuckEntity duckEntity, float flap) {
        float f = Mth.lerp(flap, duckEntity.oFlap, duckEntity.flap);
        float f1 = Mth.lerp(flap, duckEntity.oFlapSpeed, duckEntity.flapSpeed);
        return (Mth.sin(f) + 1.0F) * f1;
    }
}
