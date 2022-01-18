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
import java.util.HashMap;
import java.util.Map;

public class Config {
    public static CommentedFileConfig cfg;
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    private static final String CATEGORY_SHIELD = "shield";
    private static final String CATEGORY_ENTITY = "entity";
    private static final String CATEGORY_ORES = "ores";

    public static BooleanValue spawnDuck;

    public static BooleanValue spawnCopper;
    public static BooleanValue spawnTin;
    public static BooleanValue spawnCobalt;
    public static BooleanValue spawnAmethyst;
    public static BooleanValue spawnSilver;
    public static BooleanValue spawnTourmaline;
    public static BooleanValue spawnTopaz;
    public static BooleanValue spawnTanzanite;
    public static BooleanValue spawnMoissanite;
    public static BooleanValue spawnOnyx;
    public static BooleanValue spawnRuby;
    public static BooleanValue spawnSapphire;
    public static BooleanValue spawnNetherRuby;
    public static BooleanValue spawnNetherSapphire;
    public static BooleanValue spawnTurquoise;


    public static BooleanValue customShieldMaxReduction;
    public static ConfigValue<Integer> defaultDamageReduction;

    public static ConfigValue<Integer> tinDamageReduction;
    public static ConfigValue<Integer> copperDamageReduction;
    public static ConfigValue<Integer> silverDamageReduction;
    public static ConfigValue<Integer> bronzeDamageReduction;
    public static ConfigValue<Integer> cobaltDamageReduction;
    public static ConfigValue<Integer> obsidianDamageReduction;
    public static ConfigValue<Integer> sterlingDamageReduction;
    public static ConfigValue<Integer> steelDamageReduction;
    public static ConfigValue<Integer> amethystDamageReduction;
    public static ConfigValue<Integer> emeraldDamageReduction;
    public static ConfigValue<Integer> topazDamageReduction;
    public static ConfigValue<Integer> tourmalineDamageReduction;
    public static ConfigValue<Integer> tanzaniteDamageReduction;
    public static ConfigValue<Integer> rubyDamageReduction;
    public static ConfigValue<Integer> sapphireDamageReduction;
    public static ConfigValue<Integer> turquoiseDamageReduction;
    public static ConfigValue<Integer> moissaniteDamageReduction;
    public static ConfigValue<Integer> onyxDamageReduction;
    public static ConfigValue<Integer> grapheneDamageReduction;

    public static ConfigValue<Integer> tinDurability;
    public static ConfigValue<Integer> copperDurability;
    public static ConfigValue<Integer> silverDurability;
    public static ConfigValue<Integer> bronzeDurability;
    public static ConfigValue<Integer> cobaltDurability;
    public static ConfigValue<Integer> obsidianDurability;
    public static ConfigValue<Integer> sterlingDurability;
    public static ConfigValue<Integer> steelDurability;
    public static ConfigValue<Integer> amethystDurability;
    public static ConfigValue<Integer> emeraldDurability;
    public static ConfigValue<Integer> topazDurability;
    public static ConfigValue<Integer> tourmalineDurability;
    public static ConfigValue<Integer> tanzaniteDurability;
    public static ConfigValue<Integer> rubyDurability;
    public static ConfigValue<Integer> sapphireDurability;
    public static ConfigValue<Integer> turquoiseDurability;
    public static ConfigValue<Integer> moissaniteDurability;
    public static ConfigValue<Integer> onyxDurability;
    public static ConfigValue<Integer> grapheneDurability;

    public static BooleanValue thornsOnShields;

    public Config() {
        cfg = CommentedFileConfig
                .builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MODID + "-common.toml")).sync()
                .autosave().build();
        cfg.load();
        oreConfig();
        shieldConfig();
        entityConfig();
        ForgeConfigSpec spec = builder.build();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    private void oreConfig(){
        builder.comment("The ore configuration for this mod").push(CATEGORY_ENTITY).pop();

        spawnCopper = getBoolean("spawnCopper", CATEGORY_ORES, true, "Should copper spawn in the overworld");
        spawnTin = getBoolean("spawnTin", CATEGORY_ORES, true, "Should tin spawn in the overworld");
        spawnSilver = getBoolean("spawnSilver", CATEGORY_ORES, true, "Should silver spawn in the overworld");
        spawnCobalt = getBoolean("spawnCobalt", CATEGORY_ORES, true, "Should cobalt spawn in the overworld");
        spawnAmethyst = getBoolean("spawnAmethyst", CATEGORY_ORES, true, "Should amethyst spawn in the overworld");
        spawnTourmaline = getBoolean("spawnTourmaline", CATEGORY_ORES, true, "Should tourmaline spawn in the overworld");
        spawnTopaz = getBoolean("spawnTopaz", CATEGORY_ORES, true, "Should topaz spawn in the overworld");
        spawnSapphire = getBoolean("spawnSapphire", CATEGORY_ORES, true, "Should sapphire spawn in the overworld");
        spawnRuby = getBoolean("spawnRuby", CATEGORY_ORES, true, "Should ruby spawn in the overworld");
        spawnTurquoise = getBoolean("spawnTurquoise", CATEGORY_ORES, true, "Should turquoise spawn in the overworld");

        spawnNetherSapphire = getBoolean("spawnNetherSapphire", CATEGORY_ORES, true, "Should sapphire spawn in the nether");
        spawnNetherRuby = getBoolean("spawnNetherRuby", CATEGORY_ORES, true, "Should ruby spawn in the nether");
        spawnTanzanite = getBoolean("spawnTanzanite", CATEGORY_ORES, true, "Should tanzanite spawn in the nether");
        spawnMoissanite = getBoolean("spawnMoissanite", CATEGORY_ORES, true, "Should moissanite spawn in the nether");

        spawnOnyx = getBoolean("spawnCarbonado", CATEGORY_ORES, true, "Should carbonado spawn in the overworld");
    }

    private void shieldConfig() {
        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELD).pop();

        customShieldMaxReduction = getBoolean("customShieldMaxReduction", CATEGORY_SHIELD, true,
                "If set to true Shields added by other mods block 100% of the incoming damage, "
                        + "if set to false they will block the amount set in defaultDamageReduction.");

        defaultDamageReduction = getInt("defaultDamageReduction", CATEGORY_SHIELD, 60,
                "The portion of the incoming damage Vanilla Shields block in percent.");

        copperDamageReduction = getInt("copperDamageReduction", CATEGORY_SHIELD, 60,
                "The portion of the incoming damage Copper Shields block in percent.");
        tinDamageReduction = getInt("tinDamageReduction", CATEGORY_SHIELD, 60,
                "The portion of the incoming damage Tin Shields block in percent.");
        silverDamageReduction = getInt("silverDamageReduction", CATEGORY_SHIELD, 65,
                "The portion of the incoming damage Silver Shields block in percent.");
        bronzeDamageReduction = getInt("bronzeDamageReduction", CATEGORY_SHIELD, 65,
                "The portion of the incoming damage Bronze Shields block in percent.");
        cobaltDamageReduction = getInt("cobaltDamageReduction", CATEGORY_SHIELD, 65,
                "The portion of the incoming damage Cobalt Shields block in percent.");
        obsidianDamageReduction = getInt("obsidianDamageReduction", CATEGORY_SHIELD, 85,
                "The portion of the incoming damage Obsidian Shields block in percent.");
        sterlingDamageReduction = getInt("sterlingDamageReduction", CATEGORY_SHIELD, 75,
                "The portion of the incoming damage Sterling Silver Shields block in percent.");
        steelDamageReduction = getInt("steelDamageReduction", CATEGORY_SHIELD, 80,
                "The portion of the incoming damage Carbon Steel Shields block in percent.");
        amethystDamageReduction = getInt("amethystDamageReduction", CATEGORY_SHIELD, 70,
                "The portion of the incoming damage Amethyst Shields block in percent.");
        emeraldDamageReduction = getInt("emeraldDamageReduction", CATEGORY_SHIELD, 80,
                "The portion of the incoming damage Emerald Shields block in percent.");
        topazDamageReduction = getInt("topazDamageReduction", CATEGORY_SHIELD, 80,
                "The portion of the incoming damage Topaz Shields block in percent.");
        tourmalineDamageReduction = getInt("tourmalineDamageReduction", CATEGORY_SHIELD, 80,
                "The portion of the incoming damage Tourmaline Shields block in percent.");
        tanzaniteDamageReduction = getInt("tanzaniteDamageReduction", CATEGORY_SHIELD, 85,
                "The portion of the incoming damage Tanzanite Shields block in percent.");
        rubyDamageReduction = getInt("rubyDamageReduction", CATEGORY_SHIELD, 90,
                "The portion of the incoming damage Ruby Shields block in percent.");
        sapphireDamageReduction = getInt("sapphireDamageReduction", CATEGORY_SHIELD, 93,
                "The portion of the incoming damage Sapphire Shields block in percent.");
        turquoiseDamageReduction = getInt("turquoiseDamageReduction", CATEGORY_SHIELD, 95,
                "The portion of the incoming damage Sapphire Shields block in percent.");
        moissaniteDamageReduction = getInt("moissaniteDamageReduction", CATEGORY_SHIELD, 95,
                "The portion of the incoming damage Moissanite Shields block in percent.");
        onyxDamageReduction = getInt("onyxDamageReduction", CATEGORY_SHIELD, 95,
                "The portion of the incoming damage Onyx Shields block in percent.");
        grapheneDamageReduction = getInt("grapheneDamageReduction", CATEGORY_SHIELD, 100,
                "The portion of the incoming damage Graphene Shields block in percent.");

        copperDurability = getInt("copperDurability", CATEGORY_SHIELD, 580, "The durability of the Copper Shield.");
        tinDurability = getInt("tinDurability", CATEGORY_SHIELD, 80, "The durability of the Tin Shield.");
        silverDurability = getInt("silverDurability", CATEGORY_SHIELD, 730, "The durability of the Silver Shield.");
        bronzeDurability = getInt("bronzeDurability", CATEGORY_SHIELD, 840, "The durability of the Bronze Shield.");
        cobaltDurability = getInt("cobaltDurability", CATEGORY_SHIELD, 1300, "The durability of the Cobalt Shield.");
        obsidianDurability = getInt("obsidianDurability", CATEGORY_SHIELD, 3000, "The durability of the Obsidian Shield.");
        sterlingDurability = getInt("sterlingDurability", CATEGORY_SHIELD, 1800, "The durability of the Sterling Silver Shield.");
        steelDurability = getInt("steelDurability", CATEGORY_SHIELD, 2000, "The durability of the Steel Shield.");
        amethystDurability = getInt("amethystDurability", CATEGORY_SHIELD, 1250, "The durability of the Amethyst Shield.");
        emeraldDurability = getInt("emeraldDurability", CATEGORY_SHIELD, 2500, "The durability of the Emerald Shield.");
        topazDurability = getInt("topazDurability", CATEGORY_SHIELD, 2900, "The durability of the Topaz Shield.");
        tourmalineDurability = getInt("tourmalineDurability", CATEGORY_SHIELD, 3500, "The durability of the Tourmaline Shield.");
        tanzaniteDurability = getInt("tanzaniteDurability", CATEGORY_SHIELD, 5100, "The durability of the Tanzanite Shield.");
        rubyDurability = getInt("rubyDurability", CATEGORY_SHIELD, 4200, "The durability of the Ruby Shield.");
        sapphireDurability = getInt("sapphireDurability", CATEGORY_SHIELD, 4500, "The durability of the Sapphire Shield.");
        turquoiseDurability = getInt("turquoiseDurability", CATEGORY_SHIELD, 3500, "The durability of the Turquoise Shield.");
        moissaniteDurability = getInt("moissaniteDurability", CATEGORY_SHIELD, 5300, "The durability of the Moissanite Shield.");
        onyxDurability = getInt("onyxDurability", CATEGORY_SHIELD, 6200, "The durability of the Onyx Shield.");
        grapheneDurability = getInt("grapheneDurability", CATEGORY_SHIELD, 7500, "The durability of the Graphene Shield.");
//        diamondDurability = getInt("diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt("cobaltDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Cobalt Shield.");
        thornsOnShields = getBoolean("thornsOnShields", CATEGORY_SHIELD, true,
                "Allows the Thorns enchantment to by applied to Shields");
    }

    private void entityConfig(){
        builder.comment("The entity configuration for this mod").push(CATEGORY_ENTITY).pop();

        spawnDuck = getBoolean("spawnDuck", CATEGORY_ENTITY, true, "Should ducks spawn naturally");
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