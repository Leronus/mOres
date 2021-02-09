package mod.mores.proxy;

import mod.mores.modid.Mores;
import mod.mores.objects.blocks.machines.BlockAlloyFurnace;
import mod.mores.util.handlers.GuiHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class CommonProxy
{
	public static BlockAlloyFurnace blockAlloyFurnace;  // this holds the unique instance of your block

	public void registerItemRenderer(Item item, int meta, String id)
	{

	}

	public void render()
	{
		/*
		// each instance of your block should have a name that is unique within your mod.  use lower case.
		blockAlloyFurnace = (BlockAlloyFurnace)(new BlockAlloyFurnace().setUnlocalizedName("block_alloy_furnace"));
		blockAlloyFurnace.setRegistryName("block_alloy_furnace_registry_name");
		ForgeRegistries.BLOCKS.register(blockAlloyFurnace);

		// We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
		itemBlockFlameEmitter = new ItemBlock(blockAlloyFurnace);
		itemBlockFlameEmitter.setRegistryName(blockAlloyFurnace.getRegistryName());
		ForgeRegistries.ITEMS.register(itemBlockAlloyFurnace);
		 */
	}
	public static void preInit()
	{

	}
	public static void init()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Mores.instance, new GuiHandler());
	}
	public static void postInit()
	{

	}
}
