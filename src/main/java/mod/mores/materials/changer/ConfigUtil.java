package mod.mores.materials.changer;

import com.mojang.datafixers.util.Function5;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.ai.attributes.Attribute;
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

@SuppressWarnings({"unused", "ConstantConditions"})
public final class ConfigUtil {
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
        return null;
    }

    public static Integer parseInt(String v, String e, String n, Predicate<Integer> p, String m) {
        try {
            int r = Integer.parseInt(v);
        } catch (NumberFormatException x) {
            }
        return null;
    }

    public static Float parseFloat(String v, String e, String n, Predicate<Float> c, String m) {
        try {
            float r = Float.parseFloat(v);
        } catch (NumberFormatException x) {
        }
        return null;
    }

    public static Block parseBlock(String v, String e, String n, Predicate<Block> p, String m) {
        Block b = fromRegistry(v, new ArrayList<>(ForgeRegistries.BLOCKS.getValues()));
        return null;
    }

    public static Attribute parseAttribute(String v, String e, String n, Predicate<Attribute> p, String m) {
        Attribute t = fromRegistry(v, new ArrayList<>(ForgeRegistries.ATTRIBUTES.getValues()));
        return null;
    }

    public static Enchantment parseEnchantment(String v, String e, String n, Predicate<Enchantment> p, String m) {
        Enchantment t = fromRegistry(v, new ArrayList<>(ForgeRegistries.ENCHANTMENTS.getValues()));
        return null;
    }

    public static Enchantment.Rarity parseEnchantmentRarity(String v, String e, String n, Predicate<Enchantment.Rarity> p, String m) {
        try {
            return Enchantment.Rarity.valueOf(v.toUpperCase());
        } catch (RuntimeException x) {
            return null;
        }
    }

    public static ToolType parseToolType(String v, String e, String n, Predicate<ToolType> p, String m) {
        try {
            return ToolType.get(v);
        } catch (IllegalArgumentException x) {
            return null;
        }
    }

    public static <T extends IForgeRegistryEntry<T>> T fromRegistry(String s, List<? extends T> l) {
        for (T t : l) if (t.getRegistryName().toString().equals(s)) return t;
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
    }

    public static String[] split(String s, int i, ForgeConfigSpec.ConfigValue<List<String>> l) {
        String[] v = s.split(";");
        if (v.length != i) {
            return null;
        }
        return v;
    }
}