package mod.mores.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupItems extends ItemGroup {
    public ItemGroupItems(String label) {
        super(label);
    }

    public ItemGroupItems(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
