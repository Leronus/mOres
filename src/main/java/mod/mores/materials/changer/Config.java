package mod.mores.materials.changer;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.TieredItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public final class Config {
    private static final Map<Item, Properties.Item> ITEMS = new LinkedHashMap<>();
    public static final Map<TieredItem, Integer> MIXIN_TOOL_HARVEST_LEVEL = new HashMap<>();


    public static void changeVanillaHarvestLevel() {
        List<Item> TOOL_REGISTRY = new ArrayList<>(ForgeRegistries.ITEMS.getValues());
        TOOL_REGISTRY.removeIf(e -> !(e instanceof ToolItem));
        for (Item item : ITEMS.keySet()) {
            Properties.Item prop = ITEMS.get(item);
            if (item instanceof TieredItem) {
                TieredItem toolitem = (TieredItem) item;
                Properties.Tool toolprop = (Properties.Tool) prop;
                if (toolprop.HARVEST_LEVEL != null)
                    MIXIN_TOOL_HARVEST_LEVEL.put(toolitem, toolprop.HARVEST_LEVEL);
            }
        }
    }
}
