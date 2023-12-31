package mod.leronus.mores.config.module.util;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

public class ConfigUtils {
    private static final Splitter DOT_SPLITTER = Splitter.on(".");
    public static List<String> split(String path)
    {
        return Lists.newArrayList(DOT_SPLITTER.split(path));
    }
}