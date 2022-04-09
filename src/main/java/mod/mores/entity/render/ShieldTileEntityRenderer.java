//package mod.mores.client.entity.render;
//
//import mod.mores.client.entity.ShieldTextures;
//import mod.mores.init.ItemInit;
//import mod.mores.objects.ItemShield;
//import net.minecraft.client.model.ShieldModel;
//import net.minecraft.client.renderer.block.model.ItemTransforms;
//import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//@OnlyIn(Dist.CLIENT)
//public class ShieldTileEntityRenderer extends ItemStackTileEntityRenderer {
//    private final ShieldModel shieldModel;
//
//    public ShieldTileEntityRenderer() {
//        shieldModel = new ShieldModel();
//    }
//
//    @Override
//    public void renderByItem(ItemStack stack, ItemTransforms.TransformType p_239207_2_, MatrixStack matrixStack,
//                             IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
//        matrixStack.pushPose();
//        matrixStack.scale(1, -1, -1);
//        boolean flag = stack.getTagElement("BlockEntityTag") != null;
//        RenderMaterial rendermaterial = flag ? ModelBakery.SHIELD_BASE
//                : ModelBakery.NO_PATTERN_SHIELD;
//
//        Item shield = stack.getItem();
//        if (shield == ItemInit.COPPER_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_COPPER_SHIELD_BASE
//                    : ShieldTextures.LOCATION_COPPER_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.TIN_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_TIN_SHIELD_BASE
//                    : ShieldTextures.LOCATION_TIN_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.SILVER_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_SILVER_SHIELD_BASE
//                    : ShieldTextures.LOCATION_SILVER_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.COBALT_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_COBALT_SHIELD_BASE
//                    : ShieldTextures.LOCATION_COBALT_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.BRONZE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_BRONZE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_BRONZE_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.STERLING_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_STERLING_SHIELD_BASE
//                    : ShieldTextures.LOCATION_STERLING_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.STEEL_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_STEEL_SHIELD_BASE
//                    : ShieldTextures.LOCATION_STEEL_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.AMETHYST_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE
//                    : ShieldTextures.LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.EMERALD_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_EMERALD_SHIELD_BASE
//                    : ShieldTextures.LOCATION_EMERALD_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.OBSIDIAN_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE
//                    : ShieldTextures.LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.TOPAZ_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE
//                    : ShieldTextures.LOCATION_TOPAZ_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.TOURMALINE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_TOURMALINE_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.TANZANITE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_TANZANITE_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.RUBY_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_RUBY_SHIELD_BASE
//                    : ShieldTextures.LOCATION_RUBY_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.SAPPHIRE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_SAPPHIRE_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.MOISSANITE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_MOISSANITE_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.ONYX_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_ONYX_SHIELD_BASE
//                    : ShieldTextures.LOCATION_ONYX_SHIELD_BASE_NOPATTERN;
//        } else if (shield == ItemInit.GRAPHENE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_GRAPHENE_SHIELD_BASE_NOPATTERN;
//        }  else if (shield == ItemInit.TURQUOISE_SHIELD.get()) {
//            rendermaterial = flag ? ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE
//                    : ShieldTextures.LOCATION_TURQUOISE_SHIELD_BASE_NOPATTERN;
//        }
//
//
//
//        IVertexBuilder ivertexbuilder = rendermaterial.sprite().wrap(ItemRenderer.getFoilBufferDirect(buffer, this.shieldModel.renderType(rendermaterial.atlasLocation()), true, stack.hasFoil()));
//        this.shieldModel.handle().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
//                1.0F, 1.0F, 1.0F);
//        if (flag) {
//            List<Pair<BannerPattern, DyeColor>> list = BannerTileEntity.createPatterns(ItemShield.getColor(stack),
//                    BannerTileEntity.getItemPatterns(stack));
//            BannerTileEntityRenderer.renderPatterns(matrixStack, buffer, combinedLight, combinedOverlay,
//                    this.shieldModel.plate(), rendermaterial, false, list, stack.hasFoil());
//        } else {
//            this.shieldModel.plate().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F,
//                    1.0F, 1.0F, 1.0F);
//        }
//        matrixStack.popPose();
//    }
//
//}
