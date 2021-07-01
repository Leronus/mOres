package mod.mores.materials.changer;

import com.mojang.datafixers.util.Function5;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.misc.Triple;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

@SuppressWarnings({"unused", "ConstantConditions"})
public final class ConfigUtil {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ConfigUtil.class));
    public static <T extends IForgeRegistryEntry<T>, U> LinkedHashMap<T, U> getMap(ForgeConfigSpec.ConfigValue<List<String>> l, List<? extends T> r, Function5<String, String, String, Predicate<U>, String, U> f, Predicate<U> p, String e) {
        LinkedHashMap<T, U> m = new LinkedHashMap<>();
        for (String x : l.get()) {
            String[] s = split(x, 2, l);
            if (s == null) continue;
            U u = f.apply(s[1], x, getPath(l.getPath()), p, e);
            if (u == null) continue;
            if (s[0].equals("any")) {
                for (T t : r) {
                    m.put(t, u);
                    logProperty(getLast(l.getPath()), t, u);
                }
            } else {
                T t = fromRegistry(s[0], r);
                if (t != null) {
                    m.put(t, u);
                    logProperty(getLast(l.getPath()), t, u);
                }
            }
        }
        return m;
    }

    public static <T extends IForgeRegistryEntry<T>, U, V> LinkedHashMap<T, Pair<U, V>> pairMap(ForgeConfigSpec.ConfigValue<List<String>> l, List<? extends T> r, Function5<String, String, String, Predicate<U>, String, U> fu, Predicate<U> pu, Function5<String, String, String, Predicate<V>, String, V> fv, Predicate<V> pv) {
        LinkedHashMap<T, Pair<U, V>> m = new LinkedHashMap<>();
        for (String x : l.get()) {
            String[] s = split(x, 3, l);
            if (s == null) continue;
            U u = fu.apply(s[1], x, getPath(l.getPath()), pu, "");
            if (u == null) continue;
            V v = fv.apply(s[2], x, getPath(l.getPath()), pv, "");
            if (v == null) continue;
            if (s[0].equals("any")) {
                for (T t : r) {
                    m.put(t, new Pair<>(u, v));
                    logProperty(getLast(l.getPath()), t, u);
                }
            } else {
                T t = fromRegistry(s[0], r);
                if (t != null) {
                    m.put(t, new Pair<>(u, v));
                    logProperty(getLast(l.getPath()), t, u);
                }
            }
        }
        return m;
    }

    public static <T extends IForgeRegistryEntry<T>, U, V, W> LinkedHashMap<T, Triple<U, V, W>> tripleMap(ForgeConfigSpec.ConfigValue<List<String>> l, List<? extends T> r, Function5<String, String, String, Predicate<U>, String, U> fu, Predicate<U> pu, Function5<String, String, String, Predicate<V>, String, V> fv, Predicate<V> pv, Function5<String, String, String, Predicate<W>, String, W> fw, Predicate<W> pw) {
        LinkedHashMap<T, Triple<U, V, W>> m = new LinkedHashMap<>();
        for (String x : l.get()) {
            String[] s = split(x, 4, l);
            if (s == null) continue;
            U u = fu.apply(s[1], x, getPath(l.getPath()), pu, "");
            if (u == null) continue;
            V v = fv.apply(s[2], x, getPath(l.getPath()), pv, "");
            if (v == null) continue;
            W w = fw.apply(s[3], x, getPath(l.getPath()), pw, "");
            if (w == null) continue;
            if (s[0].equals("any")) {
                for (T t : r) {
                    m.put(t, new Triple<>(u, v, w));
                    logProperty(getLast(l.getPath()), t, u);
                }
            } else {
                T t = fromRegistry(s[0], r);
                if (t != null) {
                    m.put(t, new Triple<>(u, v, w));
                    logProperty(getLast(l.getPath()), t, u);
                }
            }
        }
        return m;
    }

    public static Boolean parseBoolean(String v, String e, String n, Predicate<Boolean> p, String m) {
        switch (v) {
            case "true":
                return true;
            case "false":
                return false;
        }
        LOGGER.info(v + " is not a boolean (is invalid for " + e + " in " + n + ")");
        return null;
    }

    public static Integer parseInt(String v, String e, String n, Predicate<Integer> p, String m) {
        try {
            int r = Integer.parseInt(v);
            if (!p.test(r))
                LOGGER.info(m + " (is invalid for " + e + " in " + n + ")");
            else return r;
        } catch (NumberFormatException x) {
            LOGGER.info(v + " is not an integer (is invalid for " + e + " in " + n + ")");
        }
        return null;
    }

    public static Float parseFloat(String v, String e, String n, Predicate<Float> c, String m) {
        try {
            float r = Float.parseFloat(v);
            if (!c.test(r))
                LOGGER.info(m + " (is invalid for " + e + " in " + n + ")");
            else return r;
        } catch (NumberFormatException x) {
            LOGGER.info(v + " is not a number (is invalid for " + e + " in " + n + ")");
        }
        return null;
    }

    public static Attribute parseAttribute(String v, String e, String n, Predicate<Attribute> p, String m) {
        Attribute t = fromRegistry(v, new ArrayList<>(ForgeRegistries.ATTRIBUTES.getValues()));
        if (t == null) LOGGER.info("Unknown attribute " + v + " (is invalid for " + e + " in " + n + ")");
        else if (p.test(t)) return t;
        else LOGGER.info(m + " " + v + " (is invalid for " + e + " in " + n + ")");
        return null;
    }

    public static Enchantment parseEnchantment(String v, String e, String n, Predicate<Enchantment> p, String m) {
        Enchantment t = fromRegistry(v, new ArrayList<>(ForgeRegistries.ENCHANTMENTS.getValues()));
        if (t == null) LOGGER.info("Unknown enchantment " + v + " (is invalid for " + e + " in " + n + ")");
        else if (p.test(t)) return t;
        else LOGGER.info(m + " " + v + " (is invalid for " + e + " in " + n + ")");
        return null;
    }

    public static Enchantment.Rarity parseEnchantmentRarity(String v, String e, String n, Predicate<Enchantment.Rarity> p, String m) {
        try {
            return Enchantment.Rarity.valueOf(v.toUpperCase());
        } catch (RuntimeException x) {
            LOGGER.info("Invalid enchantment rarity " + v + " (is invalid for " + e + " in " + n + ")");
            return null;
        }
    }

    public static Rarity parseRarity(String v, String e, String n, Predicate<Rarity> p, String m) {
        try {
            return Rarity.valueOf(v.toUpperCase());
        } catch (RuntimeException x) {
            LOGGER.info("Invalid rarity " + v + " (is invalid for " + e + " in " + n + ")");
            return null;
        }
    }

    public static SoundType parseSoundType(String v, String e, String n, Predicate<SoundType> p, String m) {
        switch (v) {
            case "wood":
                return SoundType.WOOD;
            case "stone":
                return SoundType.STONE;
            case "metal":
                return SoundType.METAL;
            case "glass":
                return SoundType.GLASS;
            case "sand":
                return SoundType.SAND;
            case "snow":
                return SoundType.SNOW;
            case "ladder":
                return SoundType.LADDER;
            case "anvil":
                return SoundType.ANVIL;
            case "wet_grass":
                return SoundType.WET_GRASS;
            case "bamboo":
                return SoundType.BAMBOO;
            case "bamboo_sapling":
                return SoundType.BAMBOO_SAPLING;
            case "scaffolding":
                return SoundType.SCAFFOLDING;
            case "sweet_berry_bush":
                return SoundType.SWEET_BERRY_BUSH;
            case "crop":
                return SoundType.CROP;
            case "stem":
                return SoundType.STEM;
            case "vine":
                return SoundType.VINE;
            case "nether_wart":
                return SoundType.NETHER_WART;
            case "lantern":
                return SoundType.LANTERN;
            case "nylium":
                return SoundType.NYLIUM;
            case "fungus":
                return SoundType.FUNGUS;
            case "shroomlight":
                return SoundType.SHROOMLIGHT;
            case "soul_sand":
                return SoundType.SOUL_SAND;
            case "soul_soil":
                return SoundType.SOUL_SOIL;
            case "basalt":
                return SoundType.BASALT;
            case "netherrack":
                return SoundType.NETHERRACK;
            case "nether_ore":
                return SoundType.NETHER_ORE;
            case "ancient_debris":
                return SoundType.ANCIENT_DEBRIS;
            case "lodestone":
                return SoundType.LODESTONE;
            case "chain":
                return SoundType.CHAIN;
            case "gilded_blackstone":
                return SoundType.GILDED_BLACKSTONE;
        }
        LOGGER.info("Unknown sound type " + v + " (is invalid for " + e + " in " + n + ")");
        return null;
    }

    public static ToolType parseToolType(String v, String e, String n, Predicate<ToolType> p, String m) {
        try {
            return ToolType.get(v);
        } catch (IllegalArgumentException x) {
            LOGGER.info("Invalid tool type " + v + " (is invalid for " + e + " in " + n + ")");
            return null;
        }
    }

    public static <T extends IForgeRegistryEntry<T>> T fromRegistry(String s, List<? extends T> l) {
        for (T t : l) if (t.getRegistryName().toString().equals(s)) return t;
        LOGGER.info("Could not find " + s);
        return null;
    }

    public static <T> T getLast(List<? extends T> l) {
        return l.get(l.size() - 1);
    }

    public static <T> String getPath(List<T> l) {
        StringBuilder b = new StringBuilder();
        for (T t : l) b.append(t).append('.');
        return b.substring(0, b.length() - 1);
    }

    public static void logProperty(String s, IForgeRegistryEntry<?> e, Object v) {
        LOGGER.info("Set " + s + " for " + e.getRegistryName().toString() + " to " + v);
    }

    public static String[] split(String s, int i, ForgeConfigSpec.ConfigValue<List<String>> l) {
        String[] v = s.split(";");
        if (v.length != i) {
            LOGGER.info("Entry " + s + " in " + getPath(l.getPath()) + " is invalid, needs " + i + " entries separated by semicolons");
            return null;
        }
        return v;
    }
}