package mod.mores.objects;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.List;

public class ItemTools extends Item {
    public ItemTools(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public Item asItem() {
        return this;
    }
}
