package mod.mores.util.handlers;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import mod.mores.modid.Mores;
import mod.mores.proxy.CommonProxy;
import mod.mores.recipes.CraftingRecipes;
import mod.mores.recipes.SmeltingRecipes;
import mod.mores.world.gen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            Mores.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for(Block block : BlockInit.BLOCKS)
        {
            Mores.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    public static void preInitRegistries()
    {
        CommonProxy.preInit();
    }

    public static void initRegistries()
    {
        CraftingRecipes.init();
        SmeltingRecipes.init();
        CommonProxy.init();
    }

    public static void postInitRegistries()
    {
        CommonProxy.postInit();
    }

    public static void serverRegistries()
    {

    }
}