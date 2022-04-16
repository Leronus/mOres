package mod.mores.entity.client;

import mod.mores.Mores;
import mod.mores.entity.custom.Duck;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Chicken;

public class DuckRenderer extends MobRenderer<Duck, DuckModel<Duck>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Mores.MODID, "textures/entity/duck/duck_entity_model.png");

    public DuckRenderer(EntityRendererProvider.Context manager) {
        super(manager, new DuckModel<>(manager.bakeLayer(new ModelLayerLocation(TEXTURE, "duck"))), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(Duck entity) {
        return TEXTURE;
    }

    protected float getBob(Duck p_114000_, float p_114001_) {
        float f = Mth.lerp(p_114001_, p_114000_.oFlap, p_114000_.flap);
        float f1 = Mth.lerp(p_114001_, p_114000_.oFlapSpeed, p_114000_.flapSpeed);
        return (Mth.sin(f) + 1.0F) * f1;
    }
}
