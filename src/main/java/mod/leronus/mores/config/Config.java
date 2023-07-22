package mod.leronus.mores.config;

import mod.leronus.mores.Mores;
import mod.leronus.mores.config.module.Modules;
import mod.leronus.mores.config.module.base.Module;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final CommonConfig COMMON;

    public static final ForgeConfigSpec.Builder builder;

    static {
        builder = new ForgeConfigSpec.Builder();
        final Pair<CommonConfig, ForgeConfigSpec> specPair = builder.configure(CommonConfig::new);
        COMMON = specPair.getLeft();
        COMMON_SPEC = specPair.getRight();
    }

    public static class CommonConfig {
        public CommonConfig(final ForgeConfigSpec.Builder builder) {
            Modules.init();
            Module.loadFeatures(ModConfig.Type.COMMON, Mores.MODID, this.getClass().getClassLoader());
        }
    }
}