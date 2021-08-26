package mod.mores.client.entity;

import mod.mores.Mores;
import mod.mores.client.ClientModEventSubscriber;
import mod.mores.client.entity.model.DuckModel;
import mod.mores.entity.DuckEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Mores.MOD_ID, "textures/entity/duck/duck_entity_model.png");

    public DuckRenderer(EntityRendererProvider.Context manager) {
        super(manager, new DuckModel<DuckEntity>(manager.bakeLayer(ClientModEventSubscriber.DUCK_LAYER)), 0.3F);
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
