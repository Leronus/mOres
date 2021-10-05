package mod.mores.client.entity.render;

import java.util.List;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.datafixers.util.Pair;
import mod.mores.client.entity.ShieldTextures;
import mod.mores.init.ItemInit;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.ShieldModel;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.tileentity.BannerTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ShieldTileEntityRenderer extends ItemStackTileEntityRenderer {
    private final ShieldModel shieldModel;

    public ShieldTileEntityRenderer() {
        shieldModel = new ShieldModel();
    }

    @Override
    public void renderByItem(ItemStack stack, TransformType p_239207_2_, MatrixStack matrixStack,
                               IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
        matrixStack.pushPose();
        matrixStack.scale(1, -1, -1);
        boolean flag = stack.getTagElement("BlockEntityTag") != null;
        RenderMaterial rendermaterial = flag ? ModelBakery.SHIELD_BASE
                : ModelBakery.NO_PATTERN_SHIELD;

        Item shield = stack.getItem();
        if (shield == ItemInit.COPPER_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_COPPER_SHIELD_BASE_PATTERN
                    : ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN;
//        } else if (shield == BetterShields.goldShield) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_GOLD_SHIELD_BASE
//                    : ShieldTextures.LOCATION_GOLD_SHIELD_BASE_NOPATTERN;
//        } else if (shield == BetterShields.diamondShield) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_DIAMOND_SHIELD_BASE
//                    : ShieldTextures.LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN;
//        } else if (shield == BetterShields.netheriteShield) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_NETHERITE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN;
        }

        IVertexBuilder ivertexbuilder = rendermaterial.sprite().wrap(ItemRenderer.getFoilBuffer(buffer, this.shieldModel.renderType(rendermaterial.atlasLocation()), true, stack.hasFoil()));
        this.shieldModel.handle().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
                1.0F, 1.0F, 1.0F);
        if (flag) {
            List<Pair<BannerPattern, DyeColor>> list = BannerTileEntity.createPatterns(ShieldItem.getColor(stack),
                    BannerTileEntity.getItemPatterns(stack));
            BannerTileEntityRenderer.renderPatterns(matrixStack, buffer, combinedLight, combinedOverlay,
                    this.shieldModel.handle(), rendermaterial, false, list, stack.hasFoil());
        } else {
            this.shieldModel.plate().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
                    1.0F, 1.0F, 1.0F);
        }
        matrixStack.popPose();
    }

}
