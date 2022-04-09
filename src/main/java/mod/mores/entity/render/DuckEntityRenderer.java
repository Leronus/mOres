//package mod.mores.client.entity.render;
//
//import mod.mores.Mores;
//import mod.mores.client.entity.model.DuckEntityModel;
//import mod.mores.entity.DuckEntity;
//import net.minecraft.client.model.ChickenModel;
//import net.minecraft.client.renderer.entity.EntityRendererProvider;
//import net.minecraft.client.renderer.entity.MobRenderer;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.util.Mth;
//import net.minecraft.world.entity.animal.Chicken;
//
//public class DuckEntityRenderer extends MobRenderer<DuckEntity, ChickenModel<DuckEntity>> {
//    public static final ResourceLocation TEXTURE = new ResourceLocation(Mores.MODID, "textures/entity/duck/duck_entity_model.png");
//
//    public DuckEntityRenderer(EntityRendererProvider.Context manager) {
//        super(manager, new DuckEntityModel<DuckEntity>(), 0.3F);
//    }
//
//    @Override
//    public ResourceLocation getTextureLocation(DuckEntity entity) {
//        return TEXTURE;
//    }
//
//    protected float getBob(Chicken p_114000_, float p_114001_) {
//        float f = Mth.lerp(p_114001_, p_114000_.oFlap, p_114000_.flap);
//        float f1 = Mth.lerp(p_114001_, p_114000_.oFlapSpeed, p_114000_.flapSpeed);
//        return (Mth.sin(f) + 1.0F) * f1;
//    }
//}
