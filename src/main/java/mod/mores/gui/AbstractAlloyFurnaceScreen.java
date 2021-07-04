package mod.mores.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mod.mores.container.AbstractAlloyFurnaceContainer;
import mod.mores.tileentity.AbstractAlloyFurnaceTileEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public abstract class AbstractAlloyFurnaceScreen<T extends AbstractAlloyFurnaceContainer<?>>  extends ContainerScreen<T>
{

    protected static ResourceLocation BACKGROUND_TEXTURE;
    private int displayNameColor = 0x404040;

    public AbstractAlloyFurnaceScreen(T screenContainer, PlayerInventory inv, ResourceLocation texture,
                                      ITextComponent titleIn, int nameColor)
    {
        super(screenContainer, inv, titleIn);
        BACKGROUND_TEXTURE = texture;
        displayNameColor = nameColor;
    }

    @Override
    public void render(MatrixStack matStack, final int mouseX, final int mouseY, final float partialTicks)
    {
        this.renderBackground(matStack);
        super.render(matStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matStack, mouseX, mouseY);  // formerly renderHoveredTooltip
    }

    /**
     * Corresponds to AbstractFurnaceScreen.renderBg() in 1.16.1.
     * Formerly drawGuiContainerBackgroundLayer() in 1.15.2
     * @param matStack
     * @param partialTicks
     * @param mouseX
     * @param mouseY
     */
    @SuppressWarnings("deprecation")
    @Override
    protected void renderBg(MatrixStack matStack, final float partialTicks, final int mouseX, final int mouseY)
    {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        getMinecraft().getTextureManager().bind(BACKGROUND_TEXTURE);
        int startX = this.leftPos;
        int startY = this.topPos;

        // Screen#blit draws a part of the current texture (assumed to be 256x256) to the screen
        // The parameters are (x, y, u, v, width, height)
        this.blit(matStack, startX, startY, 0, 0, this.imageWidth, this.imageHeight);

        final AbstractAlloyFurnaceTileEntity tileEntity = this.menu.tileEntity;

        int i = (this.width - this.imageWidth) / 2;
        int j = (this.height - this.imageHeight) / 2;
        int i1;

        if (tileEntity.isBurning())
        {
            int k = this.getBurnLeftScaled(13);
            this.blit(matStack, i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.blit(matStack, i + 79, j + 34, 176, 14, l + 1, 16);
//
//        i1 = this.getCookProgressScaled(24); //Left Arrow
//        this.blit(matStack, k + 51, l + 34, 176, 14, i1 + 1, 16);
//
//        i1 = this.getCookProgressScaled(24); //Right Arrow
//        this.blit(matStack, k + 100, l + 34, 176, 31, 23, 16);
//
//        i1 = this.getCookProgressScaled(24); //Right Arrow Grey Overlay
//        this.blit(matStack, k + 100, l + 34, 176, 47, 23 - i1, 16);

//        i1 = this.getCookProgressScaled(30); //Bubbles
//        this.blit(matStack, k + 64, l + 4 + 29 - i1, 176, 92 - i1, 12, 29);
//
//        i1 = this.getCookProgressScaled(30); //Bubbles
//        this.blit(matStack, k + 98, l + 4 + 29 - i1, 188, 92 - i1, 12, 29);
    } // end drawGuiContainerBackgroundLayer()

    /**
     * Probably corresponds to ContainerScreen.renderLabels() in 1.16.1.
     * Formerly drawGuiContainerForegroundLayer() in 1.15.2.
     * @param matStack
     * @param mouseX
     * @param mouseY
     */
    @Override
    protected void renderLabels(MatrixStack matStack, int mouseX, int mouseY)
    {
        int forbidden_area = 54;

        // Copied from AbstractFurnaceScreen#drawGuiContainerForegroundLayer
        String s = this.title.getString();
        String [] s2 = s.split("\\s+", 2);
        int left_offset = this.imageWidth / 2 - forbidden_area/2 - this.font.width(s2[0]);
        this.font.draw(matStack, s2[0], (float) left_offset, 6.0F, displayNameColor);
        // In some languages, the title is one word, not two.
        if (s2.length > 1)
        {
            int right_offset = this.imageWidth / 2 + forbidden_area/2;
            this.font.draw(matStack, s2[1], (float) right_offset, 6.0F, displayNameColor);
        }
        //this.font.drawString(s, (float) (this.xSize / 2 - this.font.getStringWidth(s) / 2), 6.0F, 0x404040);

        this.font.draw(matStack, this.inventory.getDisplayName().getString(),
                8.0F, (float) (this.imageHeight - 96 + 2), displayNameColor);
    } // end ()

    /**
     *
     * @param pixels width of graphic progress bar
     * @return scaled progress in pixels
     */
    private int getCookProgressScaled(int pixels)
    {
        final AbstractAlloyFurnaceTileEntity tileEntity = this.menu.tileEntity;
        final short smeltTimeLeft = tileEntity.smeltTimeLeft;
        final short maxSmeltTime = tileEntity.maxSmeltTime;
        if (smeltTimeLeft <= 0 || maxSmeltTime <= 0)
            return 0;
        return (maxSmeltTime - smeltTimeLeft) * pixels / maxSmeltTime;
    }

    private int getBurnLeftScaled(int pixels)
    {
        final AbstractAlloyFurnaceTileEntity tileEntity = this.menu.tileEntity;
        if (tileEntity.maxFuelBurnTime <= 0)
            return 0;
        return (tileEntity.fuelBurnTimeLeft * (pixels + 2)) / tileEntity.maxFuelBurnTime;
    }

} // end-class