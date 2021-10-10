package mod.mores.gui;

import mod.mores.Mores;
import mod.mores.container.AlloyFurnaceContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlloyFurnaceScreen extends AbstractAlloyFurnaceScreen<AlloyFurnaceContainer> {
    private final static int name_color =  0xFFFFFF;

    public AlloyFurnaceScreen(final AlloyFurnaceContainer screenContainer, PlayerInventory inv,
                               ITextComponent titleIn)
    {
        super(screenContainer, inv,
                new ResourceLocation(Mores.MODID, "textures/gui/container/alloy_furnace_gui.png"),
                titleIn, name_color);
    }
}
