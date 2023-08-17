package mod.mores.item.client;

import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;

import mod.mores.Mores;
import mod.mores.item.ModItems;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ItemTransforms.TransformType;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ShieldTileEntityRenderer extends BlockEntityWithoutLevelRenderer {

    public static ShieldTileEntityRenderer instance;

    public ShieldTileEntityRenderer(BlockEntityRenderDispatcher p_172550_, EntityModelSet p_172551_) {
        super(p_172550_, p_172551_);
    }

    @SubscribeEvent
    public static void onRegisterReloadListener(RegisterClientReloadListenersEvent event) {
        instance = new ShieldTileEntityRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                Minecraft.getInstance().getEntityModels());
        event.registerReloadListener(instance);
    }

    @Override
    public void renderByItem(ItemStack stack, TransformType p_239207_2_, PoseStack matrixStack,
                             MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        matrixStack.pushPose();
        matrixStack.scale(1, -1, -1);
        boolean flag = stack.getTagElement("BlockEntityTag") != null;
        Material rendermaterial = flag ? ModelBakery.SHIELD_BASE
                : ModelBakery.NO_PATTERN_SHIELD;

        Item shield = stack.getItem();
        if (shield == ModItems.COPPER_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_COPPER_SHIELD_BASE
                    : ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.TIN_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_TIN_SHIELD_BASE
                    : ShieldTextures.LOCATION_TIN_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.SILVER_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_SILVER_SHIELD_BASE
                    : ShieldTextures.LOCATION_SILVER_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.COBALT_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_COBALT_SHIELD_BASE
                    : ShieldTextures.LOCATION_COBALT_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.BRONZE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_BRONZE_SHIELD_BASE
                    : ShieldTextures.LOCATION_BRONZE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.STERLING_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_STERLING_SHIELD_BASE
                    : ShieldTextures.LOCATION_STERLING_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.STEEL_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_STEEL_SHIELD_BASE
                    : ShieldTextures.LOCATION_STEEL_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.AMETHYST_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE
                    : ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.EMERALD_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_EMERALD_SHIELD_BASE
                    : ShieldTextures.LOCATION_EMERALD_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.OBSIDIAN_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE
                    : ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.TOPAZ_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE
                    : ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.TOURMALINE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE
                    : ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.TANZANITE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE
                    : ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.RUBY_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_RUBY_SHIELD_BASE
                    : ShieldTextures.LOCATION_RUBY_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.SAPPHIRE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE
                    : ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.MOISSANITE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE
                    : ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.ONYX_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_ONYX_SHIELD_BASE
                    : ShieldTextures.LOCATION_ONYX_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.GRAPHENE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE
                    : ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN;
        }  else if (shield == ModItems.TURQUOISE_SHIELD.get()) {
            rendermaterial = flag ? ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE
                    : ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN;
        }

        VertexConsumer ivertexbuilder = rendermaterial.sprite().wrap(ItemRenderer.getFoilBufferDirect(
                buffer, shieldModel.renderType(rendermaterial.atlasLocation()), true, stack.hasFoil()));
        this.shieldModel.handle().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
                1.0F, 1.0F, 1.0F);
        if (flag) {
            List<Pair<BannerPattern, DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(stack),
                    BannerBlockEntity.getItemPatterns(stack));
            BannerRenderer.renderPatterns(matrixStack, buffer, combinedLight, combinedOverlay,
                    this.shieldModel.plate(), rendermaterial, false, list, stack.hasFoil());
        } else {
            this.shieldModel.plate().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
                    1.0F, 1.0F, 1.0F);
        }
        matrixStack.popPose();
    }

}
