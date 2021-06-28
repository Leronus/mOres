package mod.mores.tabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoresTools extends ItemGroup {
    public MoresTools(String label) {
        super(label);
    }

    public MoresTools(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
