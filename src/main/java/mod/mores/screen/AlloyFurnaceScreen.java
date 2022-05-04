package mod.mores.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import mod.mores.Mores;
import mod.mores.block.entity.AlloyFurnaceBlockEntity;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class AlloyFurnaceScreen extends AbstractContainerScreen<AlloyFurnaceMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Mores.MODID, "textures/gui/alloy_furnace_gui.png");

    public AlloyFurnaceScreen(AlloyFurnaceMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        final AlloyFurnaceBlockEntity blockEntity = this.menu.blockEntity;
        if (blockEntity.isBurning())
        {
            int k = this.getBurnLeftScaled(13);
            this.blit(pPoseStack, x + 56, y + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.blit(pPoseStack, x + 79, y + 34, 176, 14, l + 1, 16);
    }
    /**
     *
     * @param pixels width of graphic progress bar
     * @return scaled progress in pixels
     */
    private int getCookProgressScaled(int pixels)
    {
        final AlloyFurnaceBlockEntity blockEntity = this.menu.blockEntity;
        final int smeltTimeLeft = blockEntity.smeltTimeLeft;
        final int maxSmeltTime = blockEntity.maxSmeltTime;
        if (smeltTimeLeft <= 0 || maxSmeltTime <= 0)
            return 0;
        return (maxSmeltTime - smeltTimeLeft) * pixels / maxSmeltTime;
    }

    private int getBurnLeftScaled(int pixels)
    {
        final AlloyFurnaceBlockEntity blockEntity = this.menu.blockEntity;
        if (blockEntity.maxFuelBurnTime <= 0)
            return 0;
        return (blockEntity.fuelBurnTimeLeft * (pixels + 2)) / blockEntity.maxFuelBurnTime;
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
