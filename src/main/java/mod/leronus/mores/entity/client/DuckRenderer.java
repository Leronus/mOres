package mod.leronus.mores.entity.client;

import mod.leronus.mores.entity.custom.DuckEntity;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final ResourceLocation DUCK_LOCATION = new ResourceLocation("textures/entity/chicken.png");

    public DuckRenderer(EntityRendererProvider.Context context) {
        super(context, new DuckModel<DuckEntity>(context.bakeLayer(ModelLayers.CHICKEN)), 0.3F);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getTextureLocation(DuckEntity pEntity) {
        return DUCK_LOCATION;
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float getBob(DuckEntity pLivingBase, float pPartialTicks) {
        float f = Mth.lerp(pPartialTicks, pLivingBase.oFlap, pLivingBase.flap);
        float f1 = Mth.lerp(pPartialTicks, pLivingBase.oFlapSpeed, pLivingBase.flapSpeed);
        return (Mth.sin(f) + 1.0F) * f1;
    }
}
