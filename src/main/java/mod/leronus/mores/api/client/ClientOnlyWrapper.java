package mod.leronus.mores.api.client;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.crafting.RecipeManager;

public class ClientOnlyWrapper
{
    public static RecipeManager getRecipeManager()
    {
        return Minecraft.getInstance().level.getRecipeManager();
    } // end getRecipeManager()
} // end class