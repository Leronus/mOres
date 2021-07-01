package mod.mores.materials.changer;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.TieredItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;

public final class Config {
    private static final Map<Item, Properties.Item> ITEMS = new LinkedHashMap<>();
    public static final Map<TieredItem, Integer> MIXIN_TOOL_HARVEST_LEVEL = new HashMap<>();
    private static ForgeConfigSpec.ConfigValue<List<String>> TOOL_HARVEST_LEVEL;
    static ForgeConfigSpec SPEC;

    static{
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder().comment("Any invalid entries will result in a log warning, but will just be skipped, and working entries will work.");
        builder.push("logging");
        TOOL_HARVEST_LEVEL = builder.comment("Sets the tool harvest level. 0 is wood/gold, 1 is stone, 2 is iron, 3 is diamond/netherite. Does not work for swords or tridents.").define("harvest_level", new ArrayList<>());
        SPEC = builder.build();
    }

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
    public static void read() {
        List<Item> TIERED_REGISTRY = new ArrayList<>(ForgeRegistries.ITEMS.getValues());
        List<Item> TOOL_REGISTRY = new ArrayList<>(ForgeRegistries.ITEMS.getValues());
        TIERED_REGISTRY.removeIf(e -> !(e instanceof TieredItem));
        TOOL_REGISTRY.removeIf(e -> !(e instanceof ToolItem));
        for (Map.Entry<Item, Integer> entry : ConfigUtil.getMap(TOOL_HARVEST_LEVEL, TOOL_REGISTRY, ConfigUtil::parseInt, e -> e > -2, "Harvest level must be at least -1").entrySet()) {
            Properties.Item prop = ITEMS.getOrDefault(entry.getKey(), new Properties.Tool());
            ((Properties.Tool) prop).HARVEST_LEVEL = entry.getValue();
            ITEMS.put(entry.getKey(), prop);
        }
    }
}
