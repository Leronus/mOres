package mod.mores.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;

import mod.mores.Mores;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class Config {

    private static CommentedFileConfig cfg;
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    private static final String CATEGORY_SHIELD = "shield";

    public static BooleanValue customShieldMaxReduction;
    public static ConfigValue<Integer> defaultDamageReduction;
    public static ConfigValue<Integer> copperShieldDamageReduction;
//    public static ConfigValue<Integer> goldDamageReduction;
//    public static ConfigValue<Integer> diamondDamageReduction;
//    public static ConfigValue<Integer> netheriteDamageReduction;
    public static ConfigValue<Integer> copperDurability;
//    public static ConfigValue<Integer> goldDurability;
//    public static ConfigValue<Integer> diamondDurability;
//    public static ConfigValue<Integer> netheriteDurability;
    public static BooleanValue thornsOnShields;

    public Config() {
        cfg = CommentedFileConfig
                .builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MOD_ID + "-common.toml")).sync()
                .autosave().build();
        cfg.load();
        shieldConfig();
        ForgeConfigSpec spec = builder.build();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    private void shieldConfig() {
        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELD).pop();
        customShieldMaxReduction = getBoolean("customShieldMaxReduction", CATEGORY_SHIELD, true,
                "If set to true Shields added by other mods block 100% of the incoming damage, "
                        + "if set to false the will block the amount set in defaultDamageReduction.");
        defaultDamageReduction = getInt("defaultDamageReduction", CATEGORY_SHIELD, 75,
                "The portion of the incoming damage Vanilla Shields block in percent.");
        copperShieldDamageReduction = getInt("ironDamageReduction", CATEGORY_SHIELD, 90,
                "The portion of the incoming damage Copper Shields block in percent.");
//        goldDamageReduction = getInt("goldDamageReduction", CATEGORY_SHIELD, 85,
//                "The portion of the incoming damage Gold Shields block in percent.");
//        diamondDamageReduction = getInt("diamondDamageReduction", CATEGORY_SHIELD, 98,
//                "The portion of the incoming damage Diamond Shields block in percent.");
//        netheriteDamageReduction = getInt("netheriteDamageReduction", CATEGORY_SHIELD, 100,
//                "The portion of the incoming damage Netherite Shields block in percent.");
        copperDurability = getInt("copperDurability", CATEGORY_SHIELD, 920, "The durability of the Copper Shield.");
//        goldDurability = getInt("goldDurability", CATEGORY_SHIELD, 130, "The durability of the Gold Shield.");
//        diamondDurability = getInt("diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt("netheriteDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Netherite Shield.");
        thornsOnShields = getBoolean("thornsOnShields", CATEGORY_SHIELD, true,
                "Allows the Thorns enchantment to by applied to Shields");
    }

    private static BooleanValue getBoolean(String name, String category, boolean defaultValue, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).define(path, defaultValue);
    }

    private static ConfigValue<Integer> getInt(String name, String category, int defaultValue, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).define(path, defaultValue);
    }

}