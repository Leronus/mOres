package mod.mores.util.handlers;

import mod.mores.objects.blocks.machines.TileEntityAlloyFurnace;
import mod.mores.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
    public static void registerTileEntities(){
        //change back to furnace
        GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, new ResourceLocation(Reference.MODID + ":alloy_furnace"));
    }
}
