package mod.mores.util.helpers;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class ToolHelper
{
    /**
     * Check if a given tool "is effective" against a given block. Code
     * inspired by Tinkers Construct code, because simple and useful.
     *
     * @param tool itemstack of tool to check effectiveness against block.
     * @param state blockstate of block to check tool effectiveness against
     * @return true if \a tool is effective against \a state; false if not.
     */
    public static boolean isEffective(ItemStack tool, IBlockState state)
    {
        boolean is_effective = false;
        for (String type : tool.getItem().getToolClasses(tool))
        {
            is_effective = is_effective || state.getBlock().isToolEffective(type, state);
        }
        return is_effective;
    } // end isEffective()

} // end class
