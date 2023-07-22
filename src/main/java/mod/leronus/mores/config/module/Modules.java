package mod.leronus.mores.config.module;

import mod.leronus.mores.config.module.base.Module;
import mod.leronus.mores.Mores;
import mod.leronus.mores.config.Config;
import net.minecraftforge.fml.config.ModConfig;

public class Modules {
    public static Module BaseModule;

    public static void init() {
        BaseModule = Module.Builder.create(Mores.MODID, "base", "mOres", ModConfig.Type.COMMON, Config.builder)
                .canBeDisabled(false)
                .build();
    }
}