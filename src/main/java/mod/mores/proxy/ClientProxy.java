package mod.mores.proxy;

import mod.mores.objects.blocks.machines.TileEntityAlloyFurnace;
import mod.mores.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void registerRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlloyFurnace.class, new TESRAlloyFurnace());
    }

    public static void preInit()
    {

    }
    public static void init()
    {

    }
    public static void postInit()
    {

    }
}
