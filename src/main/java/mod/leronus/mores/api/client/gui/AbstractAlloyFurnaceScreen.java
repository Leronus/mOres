//package mod.leronus.mores.api.client.gui;
//
//import com.mojang.blaze3d.systems.RenderSystem;
//import mod.leronus.mores.Mores;
//import mod.leronus.mores.api.content.AbstractAlloyFurnaceContainer;
//import mod.leronus.mores.block.custom.AlloyFurnaceBlockEntity;
//import net.minecraft.client.gui.GuiGraphics;
//import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
//import net.minecraft.client.renderer.GameRenderer;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.player.Inventory;
//
//public abstract class AbstractAlloyFurnaceScreen<T extends AbstractAlloyFurnaceContainer>  extends AbstractContainerScreen<T>
//{
//
//    private static final ResourceLocation TEXTURE =
//            new ResourceLocation(Mores.MODID, "textures/gui/alloy_furnace_gui.png");
//
//    private int displayNameColor = 0x404040;
//
//    public AbstractAlloyFurnaceScreen(T screenContainer, Inventory inv, Component titleIn, int nameColor)
//    {
//        super(screenContainer, inv, titleIn);
//        displayNameColor = nameColor;
//    }
//
//    @Override
//    public void render(GuiGraphics graphics, final int mouseX, final int mouseY, final float partialTicks)
//    {
//        this.renderBackground(graphics, mouseX, mouseY, partialTicks);
//        super.render(graphics, mouseX, mouseY, partialTicks);
//        this.renderTooltip(graphics, mouseX, mouseY);  // formerly renderHoveredTooltip
//    }
//
//    @Override
//    protected void renderBg(GuiGraphics graphics, float pPartialTick, int pMouseX, int pMouseY) {
//        RenderSystem.setShader(GameRenderer::getPositionTexShader);
//        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
//        RenderSystem.setShaderTexture(0, TEXTURE);
//        int x = (width - imageWidth) / 2;
//        int y = (height - imageHeight) / 2;
//
//        graphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
//
//        final AlloyFurnaceBlockEntity blockEntity = (AlloyFurnaceBlockEntity) this.menu.blockEntity;
//        if (blockEntity.isBurning())
//        {
//            int k = this.getFuelBurnTimeScaled(13);
//            graphics.blit(TEXTURE, x + 56, y + 36 + 12 - k, 176, 12 - k, 14, k + 1);
//        }
//
//        int l = this.getSmeltTimeScaled(24);
//        graphics.blit(TEXTURE, x + 79, y + 34, 176, 14, l + 1, 16);
//    }
//
//    /**
//     * Probably corresponds to ContainerScreen.renderLabels() in 1.16.1.
//     * Formerly drawGuiContainerForegroundLayer() in 1.15.2.
//     * @param graphics
//     * @param mouseX
//     * @param mouseY
//     */
//    @Override
//    protected void renderLabels(GuiGraphics graphics, int mouseX, int mouseY)
//    {
//        // Copied from AbstractFurnaceScreen#drawGuiContainerForegroundLayer
//        String alloy_furnace = this.title.getString();
////        String [] alloy_split_furnace = alloy_furnace.split("\\s+", 2);;
//
//        //First piece of text - "alloy"
////        this.font.draw(matStack, alloy_split_furnace[0], 6.0F, 6.0F, displayNameColor);
//
//        // In some languages, alloy furnace is one word, not two
////        if (alloy_split_furnace.length > 1)
////        {
//        //Second piece of text - "furnace"
////              this.font.draw(matStack, alloy_split_furnace[1], 120.0F, 6.0F, displayNameColor);
//        graphics.drawString(this.font, alloy_furnace, 100.0F, 6.0F, displayNameColor, true);
////        }
//        //Inventory text
//        graphics.drawString(this.font, this.playerInventoryTitle.getString(),
//                120.0F, (float) (this.imageHeight - 96 + 2), displayNameColor, true);
//    } // end ()
//
//    private int getSmeltTimeScaled(int pixels)
//    {
//        return this.menu.getBurnProgress(pixels);
//    }
//
//    private int getFuelBurnTimeScaled(int pixels)
//    {
//        return this.menu.getLitProgress(pixels);
//    }
//
//} // end-class