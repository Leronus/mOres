package mod.mores.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ShieldBaseModel extends Model {
    public ModelRenderer plate;
    public ModelRenderer handle;

    public ShieldBaseModel() {
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 64;
        this.plate = new ModelRenderer(this, 0, 0);
        this.plate.setPos(0.0F, 0.0F, 0.0F);
        this.plate.addBox(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
        this.handle = new ModelRenderer(this, 26, 0);
        this.handle.setPos(0.0F, 0.0F, 0.0F);
        this.handle.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
    }

    public ModelRenderer getMainPlate() {
        return this.plate;
    }

    public ModelRenderer getHandle() {
        return this.handle;
    }

    public void renderExtraParts(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn) {
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.plate.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        this.handle.render(matrixStack, vertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }
}
