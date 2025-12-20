package mod.leronus.mores.item.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mod.leronus.mores.Mores;
import mod.leronus.mores.item.custom.ModShieldItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShieldBlockEntityRenderer extends BlockEntityWithoutLevelRenderer {

    public static ShieldBlockEntityRenderer instance;

    public ShieldBlockEntityRenderer(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
        super(dispatcher, modelSet);
    }

    @SubscribeEvent
    public static void onRegisterReloadListener(RegisterClientReloadListenersEvent event) {
        instance = new ShieldBlockEntityRenderer(
                Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                Minecraft.getInstance().getEntityModels()
        );
        event.registerReloadListener(instance);
    }

    @Override
    public void renderByItem(ItemStack stack,
                             ItemDisplayContext displayContext,
                             PoseStack poseStack,
                             MultiBufferSource buffer,
                             int light,
                             int overlay) {

        // In 1.20.6 shield patterns + base color are DataComponents.
        BannerPatternLayers patterns = stack.get(DataComponents.BANNER_PATTERNS);
        boolean hasPatterns = patterns != null;

        DyeColor baseColor = stack.get(DataComponents.BASE_COLOR);
        if (baseColor == null) baseColor = DyeColor.WHITE;

        poseStack.pushPose();
        poseStack.scale(1.0F, -1.0F, -1.0F);

        // Vanilla shield base material in 1.20.6 is Sheets.SHIELD_BASE
        Material material = Sheets.SHIELD_BASE;

        // If your mod shield wants a custom material/atlas, keep your hook.
        if (stack.getItem() instanceof ModShieldItem modShield) {
            material = modShield.getClientMaterial(hasPatterns);
        }

        VertexConsumer vc = material.sprite().wrap(
                ItemRenderer.getFoilBufferDirect(
                        buffer,
                        this.shieldModel.renderType(material.atlasLocation()),
                        true,
                        stack.hasFoil()
                )
        );

        // Render handle always
        this.shieldModel.handle().render(poseStack, vc, light, overlay, 1, 1, 1, 1);

        if (hasPatterns) {
            // 1.20.6 signature:
            // renderPatterns(PoseStack, MultiBufferSource, int, int, ModelPart, Material, boolean, DyeColor, BannerPatternLayers, boolean)
            BannerRenderer.renderPatterns(
                    poseStack,
                    buffer,
                    light,
                    overlay,
                    this.shieldModel.plate(),
                    material,
                    false,
                    baseColor,
                    patterns,
                    stack.hasFoil()
            );
        } else {
            // No patterns -> render plate directly
            this.shieldModel.plate().render(poseStack, vc, light, overlay, 1, 1, 1, 1);
        }

        poseStack.popPose();
    }
}
