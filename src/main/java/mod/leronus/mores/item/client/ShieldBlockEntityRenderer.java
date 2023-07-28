package mod.leronus.mores.item.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
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
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShieldBlockEntityRenderer extends BlockEntityWithoutLevelRenderer {

    public static ShieldBlockEntityRenderer instance;

    public ShieldBlockEntityRenderer(BlockEntityRenderDispatcher rd, EntityModelSet ems) {
        super(rd, ems);
    }

    @SubscribeEvent
    public static void onRegisterReloadListener(RegisterClientReloadListenersEvent event) {
        instance = new ShieldBlockEntityRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
        event.registerReloadListener(instance);
    }

    @Override
    public void renderByItem(@NotNull ItemStack itemStack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource, int p_108834_, int p_108835_) {
        boolean hasBanner = BlockItem.getBlockEntityData(itemStack) != null;
        poseStack.pushPose();
        poseStack.scale(1.0F, -1.0F, -1.0F);
        Material material = hasBanner ? ModelBakery.SHIELD_BASE : ModelBakery.NO_PATTERN_SHIELD;
        if (itemStack.getItem() instanceof ModShieldItem shieldItem) {
            material = hasBanner ? new Material(Sheets.SHIELD_SHEET, new ResourceLocation(Mores.MODID, "entity/shield/%s_shield".formatted(shieldItem.material.materialName))) : new Material(Sheets.SHIELD_SHEET, new ResourceLocation(Mores.MODID, "entity/shield/%s_shield_nopattern".formatted(shieldItem.material.materialName)));
        }
        VertexConsumer vertexconsumer = material.sprite().wrap(ItemRenderer.getFoilBufferDirect(multiBufferSource, this.shieldModel.renderType(material.atlasLocation()), true, itemStack.hasFoil()));
        this.shieldModel.handle().render(poseStack, vertexconsumer, p_108834_, p_108835_, 1.0F, 1.0F, 1.0F, 1.0F);
        if (hasBanner) {
            List<Pair<Holder<BannerPattern>, DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(itemStack), BannerBlockEntity.getItemPatterns(itemStack));
            BannerRenderer.renderPatterns(poseStack, multiBufferSource, p_108834_, p_108835_, this.shieldModel.plate(), material, false, list, itemStack.hasFoil());
        } else {
            this.shieldModel.plate().render(poseStack, vertexconsumer, p_108834_, p_108835_, 1.0F, 1.0F, 1.0F, 1.0F);
        }

        poseStack.popPose();
    }
}