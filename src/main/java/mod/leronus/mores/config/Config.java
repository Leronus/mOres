package mod.leronus.mores.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import mod.leronus.mores.Mores;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class Config {
    public static CommentedFileConfig cfg;
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    private static final String CATEGORY_ORES = "ores";
    private static final String SUB_CATEGORY_ORES_TIN = "tin";
    private static final String SUB_CATEGORY_ORES_SILVER = "silver";
    private static final String SUB_CATEGORY_ORES_COBALT = "cobalt";
    private static final String SUB_CATEGORY_ORES_TOPAZ = "topaz";
    private static final String SUB_CATEGORY_ORES_TOURMALINE = "tourmaline";
    private static final String SUB_CATEGORY_ORES_RUBY = "ruby";
    private static final String SUB_CATEGORY_ORES_SAPPHIRE = "sapphire";
    private static final String SUB_CATEGORY_ORES_MOISSANITE = "moissanite";
    private static final String SUB_CATEGORY_ORES_TANZANITE = "tanzanite";
    private static final String SUB_CATEGORY_ORES_TURQUOISE = "turquoise";
    private static final String SUB_CATEGORY_ORES_ONYX = "onyx";
    private static final String SUB_CATEGORY_ORES_ANTRHACITE = "anthracite";
    private static final String CATEGORY_SHIELDS = "shields";
    private static final String CATEGORY_ENTITY = "entities";
    private static final String CATEGORY_PAINTINGS = "paintings";
    private static final String CATEGORY_SOUNDS = "sounds";

    public static BooleanValue enableCustomPaintingsMores;
    public static BooleanValue spawnDuck;

    public static BooleanValue spawnTin;
    public static BooleanValue spawnCobalt;
    public static BooleanValue spawnSilver;
    public static BooleanValue spawnTourmaline;
    public static BooleanValue spawnTopaz;
    public static BooleanValue spawnMoissanite;
    public static BooleanValue spawnRuby;
    public static BooleanValue spawnSapphire;
    public static BooleanValue spawnTurquoise;
    public static BooleanValue spawnAnthracite;

    public static BooleanValue spawnTanzanite;
    public static BooleanValue spawnNetherMoissanite;
    public static BooleanValue spawnNetherRuby;
    public static BooleanValue spawnNetherSapphire;
    public static BooleanValue spawnNetherSilver;
    public static BooleanValue spawnNetherAnthracite;
    public static BooleanValue spawnEndOnyx;

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

    public static ConfigValue<Integer> overworldTinUpperTop;
    public static ConfigValue<Integer> overworldSilverUpperTop;
    public static ConfigValue<Integer> overworldCobaltUpperTop;
    public static ConfigValue<Integer> overworldTinUpperBottom;
    public static ConfigValue<Integer> overworldSilverUpperBottom;
    public static ConfigValue<Integer> overworldCobaltUpperBottom;
    public static ConfigValue<Integer> overworldAnthraciteUpperBottom;

    public static ConfigValue<Integer> overworldTinMiddleTop;
    public static ConfigValue<Integer> overworldSilverMiddleTop;
    public static ConfigValue<Integer> overworldCobaltMiddleTop;
    public static ConfigValue<Integer> overworldTinMiddleBottom;
    public static ConfigValue<Integer> overworldSilverMiddleBottom;
    public static ConfigValue<Integer> overworldCobaltMiddleBottom;
    public static ConfigValue<Integer> overworldTinSmallTop;
    public static ConfigValue<Integer> overworldSilverSmallTop;
    public static ConfigValue<Integer> overworldCobaltSmallTop;

    public static ConfigValue<Integer> overworldTopazSmallTop;
    public static ConfigValue<Integer> overworldTourmalineSmallTop;
    public static ConfigValue<Integer> overworldRubySmallTop;
    public static ConfigValue<Integer> overworldSapphireSmallTop;
    public static ConfigValue<Integer> overworldTurquoiseSmallTop;
    public static ConfigValue<Integer> overworldMoissaniteSmallTop;
    public static ConfigValue<Integer> overworldTopazSmallBottom;
    public static ConfigValue<Integer> overworldTourmalineSmallBottom;
    public static ConfigValue<Integer> overworldRubySmallBottom;
    public static ConfigValue<Integer> overworldSapphireSmallBottom;
    public static ConfigValue<Integer> overworldTurquoiseSmallBottom;
    public static ConfigValue<Integer> overworldMoissaniteSmallBottom;

    public static ConfigValue<Integer> overworldTopazLargeTop;
    public static ConfigValue<Integer> overworldTourmalineLargeTop;
    public static ConfigValue<Integer> overworldRubyLargeTop;
    public static ConfigValue<Integer> overworldSapphireLargeTop;
    public static ConfigValue<Integer> overworldTurquoiseLargeTop;
    public static ConfigValue<Integer> overworldMoissaniteLargeTop;
    public static ConfigValue<Integer> overworldTopazLargeBottom;
    public static ConfigValue<Integer> overworldTourmalineLargeBottom;
    public static ConfigValue<Integer> overworldRubyLargeBottom;
    public static ConfigValue<Integer> overworldSapphireLargeBottom;
    public static ConfigValue<Integer> overworldTurquoiseLargeBottom;
    public static ConfigValue<Integer> overworldMoissaniteLargeBottom;

    public static ConfigValue<Integer> overworldTopazBuriedTop;
    public static ConfigValue<Integer> overworldTourmalineBuriedTop;
    public static ConfigValue<Integer> overworldRubyBuriedTop;
    public static ConfigValue<Integer> overworldSapphireBuriedTop;
    public static ConfigValue<Integer> overworldTurquoiseBuriedTop;
    public static ConfigValue<Integer> overworldMoissaniteBuriedTop;
    public static ConfigValue<Integer> overworldTopazBuriedBottom;
    public static ConfigValue<Integer> overworldTourmalineBuriedBottom;
    public static ConfigValue<Integer> overworldRubyBuriedBottom;
    public static ConfigValue<Integer> overworldSapphireBuriedBottom;
    public static ConfigValue<Integer> overworldTurquoiseBuriedBottom;
    public static ConfigValue<Integer> overworldMoissaniteBuriedBottom;

    public static ConfigValue<Integer> overworldAnthraciteLowerBottom;
    public static ConfigValue<Integer> overworldAnthraciteLowerTop;
    public static ConfigValue<Integer> endOnyxTop;
    public static ConfigValue<Integer> endOnyxBottom;

    public static ConfigValue<Integer> netherSilverTop;
    public static ConfigValue<Integer> netherTanzaniteTop;
    public static ConfigValue<Integer> netherRubyTop;
    public static ConfigValue<Integer> netherSapphireTop;
    public static ConfigValue<Integer> netherMoissaniteTop;
    public static ConfigValue<Integer> netherSilverBottom;
    public static ConfigValue<Integer> netherTanzaniteBottom;
    public static ConfigValue<Integer> netherRubyBottom;
    public static ConfigValue<Integer> netherSapphireBottom;
    public static ConfigValue<Integer> netherMoissaniteBottom;
    public static ConfigValue<Integer> netherAnthraciteBottom;
    public static ConfigValue<Integer> netherAnthraciteTop;

    public static BooleanValue thornsOnShields;
    public static BooleanValue enableDamageReduction;

    public static BooleanValue enableCustomDeathSounds;
    public static BooleanValue enableCustomPlayerSleepingSound;
    public static BooleanValue enableCustomPlayerHurtSound;

    public static ForgeConfigSpec spec;

    public Config() {
        cfg = CommentedFileConfig
                .builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MODID + ".toml")).sync()
                .autosave().build();
        cfg.load();
        oreConfig();
        shieldConfig();
        entityConfig();
        paintingConfig();
        soundConfig();
        ForgeConfigSpec spec = builder.build();
        Config.spec = spec;
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    private void oreConfig(){
        builder.comment("""
                The ore configuration for mOres\s

                Ores that contain any kind of metal are generated in 3 separate veins;
                \tfrequent veins relatively high in the world, referred to as 'upper'
                \tmedium veins distributed fairly evenly across the middle layer of the world, referred to as 'middle'
                \tsmaller veins that are generated in a very wide radius, referred to as 'small'
                
                For the 'upper' and 'middle' generation methods, the number is the amount of vertical blocks from bedrock (usually y=-64).
                For example, overworldTinUpperLayerMaxHeight default value is 210 which means the ores will spawn up to a maximum height of -64 + 210 -> y = 146
                
                The 'small' generation methods are different. The minimum height is bedrock and the maximum height is the absolute y-level.
                For example, overworldTinSmallLayerMaxHeight default value is -40 which means the ores will spawn up to a maximum height of y=-40

                Ores that contain gemstones are also generated in 3 separate veins; Referred to as 'small', 'large' and 'buried'
                Ores that have been generated buried means they will not spawn in contact with air, meaning they are rare.
                The values for the vertical anchors correspond to the y value in your Minecraft world.
                
                These values may also be below the world border of y=-64.""").push(CATEGORY_ORES);

//        spawnTin = getBoolean("spawnTin", SUB_CATEGORY_ORES_TIN, true, "Should tin spawn in the overworld");
        overworldTinUpperBottom = getInt("overworldTinUpperLayerMinHeight", SUB_CATEGORY_ORES_TIN, 85, "Minimum height from the bottom for the upper layer of tin ores");
        overworldTinUpperTop = getInt("overworldTinUpperLayerMaxHeight", SUB_CATEGORY_ORES_TIN, 210, "Maximum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleBottom = getInt("overworldTinMiddleLayerMinHeight", SUB_CATEGORY_ORES_TIN, 40, "Minimum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleTop = getInt("overworldTinMiddleLayerMaxHeight", SUB_CATEGORY_ORES_TIN, 85, "Maximum height from the bottom for the middle layer of tin ores");
        overworldTinSmallTop = getInt("overworldTinSmallLayerMaxHeight", SUB_CATEGORY_ORES_TIN, -40, "Maximum VERTICAL Y-LEVEL for tin ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

//        spawnSilver = getBoolean("spawnSilver", SUB_CATEGORY_ORES_SILVER, true, "Should silver spawn in the overworld");
        overworldSilverUpperBottom = getInt("overworldSilverUpperLayerMinHeight", SUB_CATEGORY_ORES_SILVER, 90, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverUpperTop = getInt("overworldSilverUpperLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 190, "Maximum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleBottom = getInt("overworldSilverMiddleLayerMinHeight", SUB_CATEGORY_ORES_SILVER, 60, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleTop = getInt("overworldSilverMiddleLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 90, "Maximum height from the bottom for the middle layer of silver ores");
        overworldSilverSmallTop = getInt("overworldSilverSmallLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 0, "Maximum VERTICAL Y-LEVEL for silver ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

//        spawnCobalt = getBoolean("spawnCobalt", SUB_CATEGORY_ORES_COBALT, true, "Should cobalt spawn in the overworld");
        overworldCobaltUpperBottom = getInt("overworldCobaltUpperLayerMinHeight", SUB_CATEGORY_ORES_COBALT, 100, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltUpperTop = getInt("overworldCobaltUpperLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, 120, "Maximum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleBottom = getInt("overworldCobaltMiddleLayerMinHeight", SUB_CATEGORY_ORES_COBALT, 60, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleTop = getInt("overworldCobaltMiddleLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, 100, "Maximum height from the bottom for the middle layer of cobalt ores");
        overworldCobaltSmallTop = getInt("overworldCobaltSmallLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, -10, "Maximum VERTICAL Y-LEVEL for cobalt ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

//        spawnTourmaline = getBoolean("spawnTourmaline", SUB_CATEGORY_ORES_TOURMALINE, true, "Should tourmaline spawn in the overworld");
        overworldTourmalineSmallBottom = getInt("overworldTourmalineSmallLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -80, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineSmallTop = getInt("overworldTourmalineSmallLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, "Maximum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeBottom = getInt("overworldTourmalineLargeLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -80, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeTop = getInt("overworldTourmalineLargeLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, "Maximum height from the bottom for the middle layer of tourmaline ores");
        overworldTourmalineBuriedBottom = getInt("overworldTourmalineBuriedLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -80, "Minimum height from the bottom for the buried layer of tourmaline ores");
        overworldTourmalineBuriedTop = getInt("overworldTourmalineBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, "Maximum height from the bottom for the buried layer of tourmaline ores");

//        spawnTopaz = getBoolean("spawnTopaz", SUB_CATEGORY_ORES_TOPAZ, true, "Should topaz spawn in the overworld");
        overworldTopazSmallBottom = getInt("overworldTopazSmallLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -80, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazSmallTop = getInt("overworldTopazSmallLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95, "Maximum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeBottom = getInt("overworldTopazLargeLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -80, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeTop = getInt("overworldTopazLargeLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95, "Maximum height from the bottom for the middle layer of topaz ores");
        overworldTopazBuriedBottom = getInt("overworldTopazBuriedLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -80, "Minimum height from the bottom for the buried layer of topaz ores");
        overworldTopazBuriedTop = getInt("overworldTopazBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95, "Maximum height from the bottom for the buried layer of topaz ores");

//        spawnSapphire = getBoolean("spawnSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the overworld");
        overworldSapphireSmallBottom = getInt("overworldSapphireSmallLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -110, "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireSmallTop = getInt("overworldSapphireSmallLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, "Maximum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeBottom = getInt("overworldSapphireLargeLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -110, "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeTop = getInt("overworldSapphireLargeLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, "Maximum height from the bottom for the middle layer of sapphire ores");
        overworldSapphireBuriedBottom = getInt("overworldSapphireBuriedLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -110, "Minimum height from the bottom for the buried layer of sapphire ores");
        overworldSapphireBuriedTop = getInt("overworldSapphireBuriedLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, "Maximum height from the bottom for the buried layer of sapphire ores");

//        spawnRuby = getBoolean("spawnRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the overworld");
        overworldRubySmallBottom = getInt("overworldRubySmallLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -100, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubySmallTop = getInt("overworldRubySmallLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, "Maximum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeBottom = getInt("overworldRubyLargeLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -100, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeTop = getInt("overworldRubyLargeLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, "Maximum height from the bottom for the middle layer of ruby ores");
        overworldRubyBuriedBottom = getInt("overworldRubyBuriedLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -100, "Minimum height from the bottom for the buried layer of ruby ores");
        overworldRubyBuriedTop = getInt("overworldRubyBuriedLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, "Maximum height from the bottom for the buried layer of ruby ores");

//        spawnTurquoise = getBoolean("spawnTurquoise", SUB_CATEGORY_ORES_TURQUOISE, true, "Should turquoise spawn in the overworld");
        overworldTurquoiseSmallBottom = getInt("overworldTurquoiseSmallLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -100, "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseSmallTop = getInt("overworldTurquoiseSmallLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 25, "Maximum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeBottom = getInt("overworldTurquoiseLargeLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -100, "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeTop = getInt("overworldTurquoiseLargeLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 18, "Maximum height from the bottom for the middle layer of turquoise ores");
        overworldTurquoiseBuriedBottom = getInt("overworldTurquoiseBuriedLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -100, "Minimum height from the bottom for the buried layer of turquoise ores");
        overworldTurquoiseBuriedTop = getInt("overworldTurquoiseBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 20, "Maximum height from the bottom for the buried layer of turquoise ores");

//        spawnMoissanite = getBoolean("spawnMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the overworld");
        overworldMoissaniteSmallBottom = getInt("overworldMoissaniteSmallLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -120, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteSmallTop = getInt("overworldMoissaniteSmallLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, "Maximum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeBottom = getInt("overworldMoissaniteLargeLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -120, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeTop = getInt("overworldMoissaniteLargeLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, "Maximum height from the bottom for the middle layer of moissanite ores");
        overworldMoissaniteBuriedBottom = getInt("overworldMoissaniteBuriedLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -120, "Minimum height from the bottom for the buried layer of moissanite ores");
        overworldMoissaniteBuriedTop = getInt("overworldMoissaniteBuriedLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, "Maximum height from the bottom for the buried layer of moissanite ores");

//        spawnNetherMoissanite = getBoolean("spawnNetherMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the nether");
        netherMoissaniteBottom = getInt("netherMoissaniteBottom", SUB_CATEGORY_ORES_MOISSANITE, -64, "Minimum height from the bottom for nether moissanite ore");
        netherMoissaniteTop = getInt("netherMoissaniteTop", SUB_CATEGORY_ORES_MOISSANITE, 256, "Maximum height from the bottom for nether moissanite ore");

//        spawnAnthracite = getBoolean("spawnNetherAnthracite", SUB_CATEGORY_ORES_ANTRHACITE, true, "Should anthracite spawn in the nether");
        overworldAnthraciteUpperBottom = getInt("overworldAnthraciteUpperLayerMinHeight", SUB_CATEGORY_ORES_ANTRHACITE, -64, "Minimum height from the bottom for upper layer of anthracite ore");
        overworldAnthraciteLowerBottom = getInt("overworldAnthraciteLowerLayerMinHeight", SUB_CATEGORY_ORES_ANTRHACITE, -64, "Minimum height from the bottom for lower layer of anthracite ore");
        overworldAnthraciteLowerTop = getInt("overworldAnthraciteLowerLayerMaxHeight", SUB_CATEGORY_ORES_ANTRHACITE, 256, "Maximum height from the bottom for lower layer of anthracite ore");

//        spawnTanzanite = getBoolean("spawnTanzanite", SUB_CATEGORY_ORES_TANZANITE, true, "Should tanzanite spawn in the nether");
        netherTanzaniteBottom = getInt("netherTanzaniteBottom", SUB_CATEGORY_ORES_TANZANITE, -64, "Minimum height from the bottom for nether tanzanite ore");
        netherTanzaniteTop = getInt("netherTanzaniteTop", SUB_CATEGORY_ORES_TANZANITE, 256, "Maximum height from the bottom for nether tanzanite ore");

//        spawnNetherSilver = getBoolean("spawnNetherSilver", SUB_CATEGORY_ORES_SILVER, true, "Should silver spawn in the nether");
        netherSilverBottom = getInt("netherSilverBottom", SUB_CATEGORY_ORES_SILVER, -64, "Minimum height from the bottom for nether silver ore");
        netherSilverTop = getInt("netherSilverTop", SUB_CATEGORY_ORES_SILVER, 256, "Maximum height from the bottom for nether silver ore");

//        spawnEndOnyx = getBoolean("spawnEndOnyx", SUB_CATEGORY_ORES_ONYX, true, "Should onyx spawn in the end");
        endOnyxBottom = getInt("endOnyxBottom", SUB_CATEGORY_ORES_ONYX, -64, "Minimum height from the bottom for nether silver ore");
        endOnyxTop = getInt("endOnyxTop", SUB_CATEGORY_ORES_ONYX, 256, "Maximum height from the bottom for nether silver ore");

//        spawnNetherSapphire = getBoolean("spawnNetherSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the nether");
        netherSapphireBottom = getInt("netherSapphireBottom", SUB_CATEGORY_ORES_SAPPHIRE, -64, "Minimum height from the bottom for nether sapphire ore");
        netherSapphireTop = getInt("netherSapphireTop", SUB_CATEGORY_ORES_SAPPHIRE, 256, "Maximum height from the bottom for nether sapphire ore");

//        spawnNetherRuby = getBoolean("spawnNetherRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the nether");
        netherRubyBottom = getInt("netherRubyBottom", SUB_CATEGORY_ORES_RUBY, -64, "Minimum height from the bottom for nether ruby ore");
        netherRubyTop = getInt("netherRubyTop", SUB_CATEGORY_ORES_RUBY, 256, "Maximum height from the bottom for nether ruby ore");

//        spawnNetherAnthracite = getBoolean("spawnNetherAnthracite", SUB_CATEGORY_ORES_ANTRHACITE, true, "Should anthracite spawn in the nether");
        netherAnthraciteBottom = getInt("netherAnthraciteBottom", SUB_CATEGORY_ORES_ANTRHACITE, -64, "Minimum height from the bottom for nether anthracite ore");
        netherAnthraciteTop = getInt("netherAnthraciteTop", SUB_CATEGORY_ORES_ANTRHACITE, 256, "Maximum height from the bottom for nether anthracite ore");
    builder.pop();
    }

    private void shieldConfig() {
        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELDS).pop();

//        customShieldMaxReduction = getBoolean("customShieldMaxReduction", CATEGORY_SHIELDS, true,
//                "If set to true Shields added by other mods block 100% of the incoming damage, "
//                        + "if set to false they will block the amount set in defaultDamageReduction.");
//
//        defaultDamageReduction = getInt("defaultDamageReduction", CATEGORY_SHIELDS, 60,
//                "The portion of the incoming damage Vanilla Shields block in percent.");
//
//        copperDamageReduction = getInt("copperDamageReduction", CATEGORY_SHIELDS, 60,
//                "The portion of the incoming damage Copper Shields block in percent.");
//        tinDamageReduction = getInt("tinDamageReduction", CATEGORY_SHIELDS, 60,
//                "The portion of the incoming damage Tin Shields block in percent.");
//        silverDamageReduction = getInt("silverDamageReduction", CATEGORY_SHIELDS, 65,
//                "The portion of the incoming damage Silver Shields block in percent.");
//        bronzeDamageReduction = getInt("bronzeDamageReduction", CATEGORY_SHIELDS, 65,
//                "The portion of the incoming damage Bronze Shields block in percent.");
//        cobaltDamageReduction = getInt("cobaltDamageReduction", CATEGORY_SHIELDS, 65,
//                "The portion of the incoming damage Cobalt Shields block in percent.");
//        obsidianDamageReduction = getInt("obsidianDamageReduction", CATEGORY_SHIELDS, 85,
//                "The portion of the incoming damage Obsidian Shields block in percent.");
//        sterlingDamageReduction = getInt("sterlingDamageReduction", CATEGORY_SHIELDS, 75,
//                "The portion of the incoming damage Sterling Silver Shields block in percent.");
//        steelDamageReduction = getInt("steelDamageReduction", CATEGORY_SHIELDS, 80,
//                "The portion of the incoming damage Carbon Steel Shields block in percent.");
//        amethystDamageReduction = getInt("amethystDamageReduction", CATEGORY_SHIELDS, 70,
//                "The portion of the incoming damage Amethyst Shields block in percent.");
//        emeraldDamageReduction = getInt("emeraldDamageReduction", CATEGORY_SHIELDS, 80,
//                "The portion of the incoming damage Emerald Shields block in percent.");
//        topazDamageReduction = getInt("topazDamageReduction", CATEGORY_SHIELDS, 80,
//                "The portion of the incoming damage Topaz Shields block in percent.");
//        tourmalineDamageReduction = getInt("tourmalineDamageReduction", CATEGORY_SHIELDS, 80,
//                "The portion of the incoming damage Tourmaline Shields block in percent.");
//        tanzaniteDamageReduction = getInt("tanzaniteDamageReduction", CATEGORY_SHIELDS, 85,
//                "The portion of the incoming damage Tanzanite Shields block in percent.");
//        rubyDamageReduction = getInt("rubyDamageReduction", CATEGORY_SHIELDS, 90,
//                "The portion of the incoming damage Ruby Shields block in percent.");
//        sapphireDamageReduction = getInt("sapphireDamageReduction", CATEGORY_SHIELDS, 93,
//                "The portion of the incoming damage Sapphire Shields block in percent.");
//        turquoiseDamageReduction = getInt("turquoiseDamageReduction", CATEGORY_SHIELDS, 95,
//                "The portion of the incoming damage Sapphire Shields block in percent.");
//        moissaniteDamageReduction = getInt("moissaniteDamageReduction", CATEGORY_SHIELDS, 95,
//                "The portion of the incoming damage Moissanite Shields block in percent.");
//        onyxDamageReduction = getInt("onyxDamageReduction", CATEGORY_SHIELDS, 95,
//                "The portion of the incoming damage Onyx Shields block in percent.");
//        grapheneDamageReduction = getInt("grapheneDamageReduction", CATEGORY_SHIELDS, 100,
//                "The portion of the incoming damage Graphene Shields block in percent.");

//        ironDurability = 336
        copperDurability = getInt("copperDurability", CATEGORY_SHIELDS, 200, "The durability of the Copper Shield.");
        tinDurability = getInt("tinDurability", CATEGORY_SHIELDS, 240, "The durability of the Tin Shield.");
        silverDurability = getInt("silverDurability", CATEGORY_SHIELDS, 350, "The durability of the Silver Shield.");
        bronzeDurability = getInt("bronzeDurability", CATEGORY_SHIELDS, 385, "The durability of the Bronze Shield.");
        cobaltDurability = getInt("cobaltDurability", CATEGORY_SHIELDS, 500, "The durability of the Cobalt Shield.");
        obsidianDurability = getInt("obsidianDurability", CATEGORY_SHIELDS, 1500, "The durability of the Obsidian Shield.");
        sterlingDurability = getInt("sterlingDurability", CATEGORY_SHIELDS, 600, "The durability of the Sterling Silver Shield.");
        steelDurability = getInt("steelDurability", CATEGORY_SHIELDS, 690, "The durability of the Steel Shield.");
        amethystDurability = getInt("amethystDurability", CATEGORY_SHIELDS, 550, "The durability of the Amethyst Shield.");
        emeraldDurability = getInt("emeraldDurability", CATEGORY_SHIELDS, 550, "The durability of the Emerald Shield.");
        topazDurability = getInt("topazDurability", CATEGORY_SHIELDS, 680, "The durability of the Topaz Shield.");
        tourmalineDurability = getInt("tourmalineDurability", CATEGORY_SHIELDS, 700, "The durability of the Tourmaline Shield.");
        tanzaniteDurability = getInt("tanzaniteDurability", CATEGORY_SHIELDS, 720, "The durability of the Tanzanite Shield.");
        rubyDurability = getInt("rubyDurability", CATEGORY_SHIELDS, 800, "The durability of the Ruby Shield.");
        sapphireDurability = getInt("sapphireDurability", CATEGORY_SHIELDS, 825, "The durability of the Sapphire Shield.");
        turquoiseDurability = getInt("turquoiseDurability", CATEGORY_SHIELDS, 1000, "The durability of the Turquoise Shield.");
        moissaniteDurability = getInt("moissaniteDurability", CATEGORY_SHIELDS, 850, "The durability of the Moissanite Shield.");
        onyxDurability = getInt("onyxDurability", CATEGORY_SHIELDS, 1250, "The durability of the Onyx Shield.");
        grapheneDurability = getInt("grapheneDurability", CATEGORY_SHIELDS, 2000, "The durability of the Graphene Shield.");
//        diamondDurability = getInt("diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt("netheriteDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Netherite Shield.");
//        thornsOnShields = getBoolean("thornsOnShields", CATEGORY_SHIELDS, true,
//                "Allows the Thorns enchantment to be applied to Shields");
//        enableDamageReduction = getBoolean("enableDamageReduction", CATEGORY_SHIELDS, true,
//                "Enables modified damage reduction values for shields.");
    }

    private void entityConfig(){
        builder.comment("The entity configuration for this mod").push(CATEGORY_ENTITY).pop();

        spawnDuck = getBoolean("spawnDuck", CATEGORY_ENTITY, true, "Whether ducks should generate naturally in your Minecraft world.");
    }

    private void paintingConfig(){
        builder.comment("The painting configuration for this mod").push(CATEGORY_PAINTINGS).pop();

        enableCustomPaintingsMores = getBoolean("enableMoresPaintings", CATEGORY_PAINTINGS, true, "Whether to enable custom paintings designed for mOres. Includes images of Toronto and some memes.");
    }

    private void soundConfig(){
        builder.comment("The sound configuration for this mod").push(CATEGORY_SOUNDS).pop();

        enableCustomDeathSounds = getBoolean("enableCustomDeathSounds", CATEGORY_SOUNDS, true, "Whether to enable custom death sounds. Includes bruh & uyêeh sounds.");
        enableCustomPlayerSleepingSound = getBoolean("enableCustomPlayerSleepingSound", CATEGORY_SOUNDS, true, "Whether to enable custom player sleeping sound. Aauugh.");
        enableCustomPlayerHurtSound = getBoolean("enableCustomPlayerHurtSound", CATEGORY_SOUNDS, true, "Whether to enable custom player hurting another player sound. Oof.");
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