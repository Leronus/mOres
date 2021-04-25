package mod.mores.init;

import mod.mores.main.Mores;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

/**
 * Class to initialise all items from mores
 */
public class ItemInit{
    /**
     * Register all mores items
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mores.MOD_ID);

    //Item Registry
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //Block Registry
    public static final RegistryObject<BlockItem> COBALT_ORE = ITEMS.register("cobalt_ore", () -> new BlockItem(BlockInit.COBALT_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<BlockItem> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}
