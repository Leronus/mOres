package mod.mores.modid;

import mod.mores.proxy.CommonProxy;
import mod.mores.tabs.*;
import mod.mores.util.Reference;
import mod.mores.util.handlers.PacketRequestUpdateAlloyFurnace;
import mod.mores.util.handlers.PacketUpdatedAlloyFurnace;
import mod.mores.util.handlers.RegistryHandler;
import mod.mores.world.gen.WorldGenOres;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptableRemoteVersions = "*")
public class Mores
{
    @Mod.Instance
    public static Mores instance;

    public static SimpleNetworkWrapper network;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    //Creative tabs
    public static final CreativeTabs MORESITEMSTAB = new MoresItemsTab("moresitemstab");
    public static final CreativeTabs MORESTOOLSTAB = new MoresToolsTab("morestoolstab");
    public static final CreativeTabs MORESARMORTAB = new MoresArmorTab("moresarmortab");
    public static final CreativeTabs MORESBLOCKSTAB = new MoresBlocksTab("moresblockstab");
    public static final CreativeTabs MORESORESTAB = new MoresOresTab("moresorestab");
    public static final CreativeTabs MORESHORSEARMORTAB = new MoresHorseArmorTab("moreshorsearmortab");


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
        network.registerMessage(new PacketUpdatedAlloyFurnace.Handler(), PacketUpdatedAlloyFurnace.class, 0, Side.CLIENT);
        network.registerMessage(new PacketRequestUpdateAlloyFurnace.Handler(), PacketRequestUpdateAlloyFurnace.class, 1, Side.SERVER);

        //proxy.registerRenderers();

        //RegistryHandler
        RegistryHandler.preInitRegistries();

        //SetHarvestLevels
        Blocks.IRON_ORE.setHarvestLevel("pickaxe", 3);
        Blocks.DIAMOND_ORE.setHarvestLevel("pickaxe", 7);
        Blocks.EMERALD_ORE.setHarvestLevel("pickaxe", 5);
        Blocks.OBSIDIAN.setHarvestLevel("pickaxe", 5);

        Items.DIAMOND_PICKAXE.setHarvestLevel("pickaxe", 8);
        Items.IRON_PICKAXE.setHarvestLevel("pickaxe", 4);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries();
    }
}
