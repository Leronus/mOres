package mod.mores.client.entity.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mod.mores.entity.DuckEntity;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DuckEntityModel<T extends DuckEntity> extends AgeableModel<T> {
  private final ModelRenderer Head;
  private final ModelRenderer Mouth;
  private final ModelRenderer Body;
  private final ModelRenderer Wing1;
  private final ModelRenderer Wing2;
  private final ModelRenderer LegLeft;
  private final ModelRenderer LegRight;
  private final ModelRenderer FeetLeft1;
  private final ModelRenderer FeetLeft2;
  private final ModelRenderer FeetRight1;
  private final ModelRenderer FeetRight2;

  public DuckEntityModel() {
    LegLeft = new ModelRenderer(this, 12, 12);
    LegLeft.addBox(0F, 0F, 0F, 1, 5, 0);
    LegLeft.setPos(-2F, 19F, 0F);
    LegLeft.setTexSize(64, 32);
    LegLeft.mirror = true;
    FeetLeft1 = new ModelRenderer(this, 0, 13);
    FeetLeft1.addBox(0F, 5F, -1F, 1, 0, 1);
    FeetLeft1.setPos(-2F, 19F, 0F);
    FeetLeft1.setTexSize(64, 32);
    FeetLeft1.mirror = true;
    FeetLeft2 = new ModelRenderer(this, 0, 15);
    FeetLeft2.addBox(-1F, 5F, -3F, 3, 0, 2);
    FeetLeft2.setPos(-2F, 19F, 0F);
    FeetLeft2.setTexSize(64, 32);
    FeetLeft2.mirror = true;
    LegRight = new ModelRenderer(this, 12, 12);
    LegRight.addBox(0F, 0F, 0F, 1, 5, 0);
    LegRight.setPos(1F, 19F, 0F);
    LegRight.setTexSize(64, 32);
    LegRight.mirror = true;
    FeetRight1 = new ModelRenderer(this, 0, 13);
    FeetRight1.addBox(0F, 5F, -1F, 1, 0, 1);
    FeetRight1.setPos(1F, 19F, 0F);
    FeetRight1.setTexSize(64, 32);
    FeetRight1.mirror = true;
    FeetRight2 = new ModelRenderer(this, 0, 15);
    FeetRight2.addBox(-1F, 5F, -3F, 3, 0, 2);
    FeetRight2.setPos(1F, 19F, 0F);
    FeetRight2.setTexSize(64, 32);
    FeetRight2.mirror = true;
    Body = new ModelRenderer(this, 0, 18);
    Body.addBox(0F, 0F, 0F, 6, 6, 8);
    Body.setPos(-3F, 13F, -5F);
    Body.setTexSize(64, 32);
    Body.mirror = true;
    Wing1 = new ModelRenderer(this, 44, 22);
    Wing1.addBox(0F, 0F, -3F, 1, 4, 6);
    Wing1.setPos(-4F, 13F, -1F);
    Wing1.setTexSize(64, 32);
    Wing1.mirror = true;
    Wing2 = new ModelRenderer(this, 44, 11);
    Wing2.addBox(0F, 0F, -3F, 1, 4, 6);
    Wing2.setPos(3F, 13F, -1F);
    Wing2.setTexSize(64, 32);
    Wing2.mirror = true;
    Head = new ModelRenderer(this, 29, 23);
    Head.addBox(-2F, -5F, -3F, 4, 6, 3);
    Head.setPos(0F, 14F, -4F);
    Head.setTexSize(64, 32);
    Head.mirror = true;
    Mouth = new ModelRenderer(this, 30, 18);
    Mouth.addBox(-2F, -3F, -5F, 4, 2, 2);
    Mouth.setPos(0F, 14F, -4F);
    Mouth.setTexSize(64, 32);
    Mouth.mirror = true;
  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.Head, this.Mouth);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.Body, this.LegLeft, this.LegRight, this.Wing1, this.Wing2, this.FeetLeft1, this.FeetLeft2, this.FeetRight1, this.FeetRight2);
  }

  public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
    this.Head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
    this.Head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
    this.Mouth.xRot = this.Head.xRot;
    this.Mouth.yRot = this.Head.yRot;
    this.Body.xRot = ((float)Math.PI / 2F);
    this.LegLeft.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * 1.4F * p_225597_3_;
    this.LegRight.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_225597_3_;
    this.Wing1.zRot = p_225597_4_;
    this.Wing2.zRot = -p_225597_4_;
  }

  @Override
  public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

  }
}
