package mod.mores.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ShieldModel extends ShieldBaseModel {
    public ModelRenderer plateLeft = new ModelRenderer(this, 42, 0);
    public ModelRenderer plateRight;

    public ShieldModel() {
        this.plateLeft.setPos(-6.0F, 0.0F, -2.0F);
        this.plateLeft.xRot = 45.0F;
        this.plateLeft.addBox(-2.0F, -11.0F, 0.0F, 2.0F, 22.0F, 1.0F, 0.0F);
        this.plateRight = new ModelRenderer(this, 48, 0);
        this.plateRight.setPos(6.0F, 0.0F, -2.0F);
        this.plateRight.zRot = -45.0F;
        this.plateRight.addBox(0.0F, -11.0F, 0.0F, 2.0F, 22.0F, 1.0F, 0.0F);
    }

    public void renderExtraParts(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn) {
        this.plateLeft.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn);
        this.plateRight.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn);
    }

    public void renderExtraParts(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        super.renderToBuffer(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        this.plateLeft.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn);
        this.plateRight.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn);
    }
}
