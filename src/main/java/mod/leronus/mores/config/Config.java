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

    private static final String CATEGORY_TOOLTIPS = "tooltips";
    private static final String CATEGORY_ENTITY = "entities";
    private static final String CATEGORY_PAINTINGS = "paintings";
    private static final String CATEGORY_SOUNDS = "sounds";
    private static final String CATEGORY_SHIELDS = "shields";
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
    private static final String SUB_CATEGORY_ORES_ANTHRACITE = "anthracite";

    public static BooleanValue enableTooltips;
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

    // Ores
    public static ConfigValue<Integer> overworldTinUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldTinMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldTinSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldSilverSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltUpperVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltMiddleVeinsPerChunk;
    public static ConfigValue<Integer> overworldCobaltSmallVeinsPerChunk;

    public static ConfigValue<Integer> overworldTourmalineSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTourmalineLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTourmalineBuriedVeinsPerChunk;

    public static ConfigValue<Integer> overworldTopazSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTopazLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTopazBuriedVeinsPerChunk;

    public static ConfigValue<Integer> overworldSapphireSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldSapphireLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldSapphireBuriedVeinsPerChunk;

    public static ConfigValue<Integer> overworldRubySmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldRubyLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldRubyBuriedVeinsPerChunk;

    public static ConfigValue<Integer> overworldTurquoiseSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldTurquoiseLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldTurquoiseBuriedVeinsPerChunk;

    public static ConfigValue<Integer> overworldMoissaniteSmallVeinsPerChunk;
    public static ConfigValue<Integer> overworldMoissaniteLargeVeinsPerChunk;
    public static ConfigValue<Integer> overworldMoissaniteBuriedVeinsPerChunk;

    public static ConfigValue<Integer> netherMoissaniteVeinsPerChunk;
    public static ConfigValue<Integer> netherTanzaniteVeinsPerChunk;
    public static ConfigValue<Integer> netherSilverVeinsPerChunk;

    public static ConfigValue<Integer> endOnyxVeinsPerChunk;

    public static ConfigValue<Integer> netherSapphireVeinsPerChunk;
    public static ConfigValue<Integer> netherRubyVeinsPerChunk;

    public static ConfigValue<Integer> anthraciteUpperVeinsPerChunk;
    public static ConfigValue<Integer> anthraciteLowerVeinsPerChunk;
    public static ConfigValue<Integer> netherAnthraciteVeinsPerChunk;

    // Heights
    public static ConfigValue<Integer> overworldTinUpperTop;
    public static ConfigValue<Integer> overworldTinUpperBottom;
    public static ConfigValue<Integer> overworldTinMiddleTop;
    public static ConfigValue<Integer> overworldTinMiddleBottom;
    public static ConfigValue<Integer> overworldTinSmallTop;

    public static ConfigValue<Integer> overworldSilverUpperTop;
    public static ConfigValue<Integer> overworldSilverUpperBottom;
    public static ConfigValue<Integer> overworldSilverMiddleTop;
    public static ConfigValue<Integer> overworldSilverMiddleBottom;
    public static ConfigValue<Integer> overworldSilverSmallTop;

    public static ConfigValue<Integer> overworldCobaltUpperTop;
    public static ConfigValue<Integer> overworldCobaltUpperBottom;
    public static ConfigValue<Integer> overworldCobaltMiddleTop;
    public static ConfigValue<Integer> overworldCobaltMiddleBottom;
    public static ConfigValue<Integer> overworldCobaltSmallTop;

    // Gem anchors
    public static ConfigValue<Integer> overworldTopazSmallTop;
    public static ConfigValue<Integer> overworldTopazSmallBottom;
    public static ConfigValue<Integer> overworldTopazLargeTop;
    public static ConfigValue<Integer> overworldTopazLargeBottom;
    public static ConfigValue<Integer> overworldTopazBuriedTop;
    public static ConfigValue<Integer> overworldTopazBuriedBottom;

    public static ConfigValue<Integer> overworldTourmalineSmallTop;
    public static ConfigValue<Integer> overworldTourmalineSmallBottom;
    public static ConfigValue<Integer> overworldTourmalineLargeTop;
    public static ConfigValue<Integer> overworldTourmalineLargeBottom;
    public static ConfigValue<Integer> overworldTourmalineBuriedTop;
    public static ConfigValue<Integer> overworldTourmalineBuriedBottom;

    public static ConfigValue<Integer> overworldRubySmallTop;
    public static ConfigValue<Integer> overworldRubySmallBottom;
    public static ConfigValue<Integer> overworldRubyLargeTop;
    public static ConfigValue<Integer> overworldRubyLargeBottom;
    public static ConfigValue<Integer> overworldRubyBuriedTop;
    public static ConfigValue<Integer> overworldRubyBuriedBottom;

    public static ConfigValue<Integer> overworldSapphireSmallTop;
    public static ConfigValue<Integer> overworldSapphireSmallBottom;
    public static ConfigValue<Integer> overworldSapphireLargeTop;
    public static ConfigValue<Integer> overworldSapphireLargeBottom;
    public static ConfigValue<Integer> overworldSapphireBuriedTop;
    public static ConfigValue<Integer> overworldSapphireBuriedBottom;

    public static ConfigValue<Integer> overworldTurquoiseSmallTop;
    public static ConfigValue<Integer> overworldTurquoiseSmallBottom;
    public static ConfigValue<Integer> overworldTurquoiseLargeTop;
    public static ConfigValue<Integer> overworldTurquoiseLargeBottom;
    public static ConfigValue<Integer> overworldTurquoiseBuriedTop;
    public static ConfigValue<Integer> overworldTurquoiseBuriedBottom;

    public static ConfigValue<Integer> overworldMoissaniteSmallTop;
    public static ConfigValue<Integer> overworldMoissaniteSmallBottom;
    public static ConfigValue<Integer> overworldMoissaniteLargeTop;
    public static ConfigValue<Integer> overworldMoissaniteLargeBottom;
    public static ConfigValue<Integer> overworldMoissaniteBuriedTop;
    public static ConfigValue<Integer> overworldMoissaniteBuriedBottom;

    public static ConfigValue<Integer> overworldAnthraciteUpperBottom;
    public static ConfigValue<Integer> overworldAnthraciteLowerBottom;
    public static ConfigValue<Integer> overworldAnthraciteLowerTop;

    public static ConfigValue<Integer> endOnyxTop;
    public static ConfigValue<Integer> endOnyxBottom;

    public static ConfigValue<Integer> netherSilverTop;
    public static ConfigValue<Integer> netherSilverBottom;

    public static ConfigValue<Integer> netherTanzaniteTop;
    public static ConfigValue<Integer> netherTanzaniteBottom;

    public static ConfigValue<Integer> netherRubyTop;
    public static ConfigValue<Integer> netherRubyBottom;

    public static ConfigValue<Integer> netherSapphireTop;
    public static ConfigValue<Integer> netherSapphireBottom;

    public static ConfigValue<Integer> netherMoissaniteTop;
    public static ConfigValue<Integer> netherMoissaniteBottom;

    public static ConfigValue<Integer> netherAnthraciteTop;
    public static ConfigValue<Integer> netherAnthraciteBottom;

    public static BooleanValue thornsOnShields;
    public static BooleanValue enableDamageReduction;

    public static BooleanValue enableCustomDeathSounds;
    public static BooleanValue enableCustomPlayerSleepingSound;
    public static BooleanValue enableCustomPlayerHurtSound;

    public static ForgeConfigSpec spec;

    public Config() {
        cfg = CommentedFileConfig.builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MODID + ".toml"))
                .sync()
                .autosave()
                .preserveInsertionOrder()
                .build();

        cfg.load();

        buildConfig();

        spec = builder.build();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    private static void buildConfig() {

        // --------------------
        // tooltips
        // --------------------
        builder.comment("The tooltip configuration for this mod").push(CATEGORY_TOOLTIPS);
        enableTooltips = bool(builder,
                "enableTooltips", true,
                "Whether to enable custom mOres tooltips, showing durability for armor/tools and full set bonuses for armor.");
        builder.pop();

        // --------------------
        // sounds
        // --------------------
        builder.comment("The sound configuration for this mod").push(CATEGORY_SOUNDS);
        enableCustomDeathSounds = bool(builder,
                "enableCustomDeathSounds", false,
                "Whether to enable custom death sounds. Includes bruh & uyêeh sounds.");
        enableCustomPlayerSleepingSound = bool(builder,
                "enableCustomPlayerSleepingSound", false,
                "Whether to enable custom player sleeping sound. Aauugh.");
        enableCustomPlayerHurtSound = bool(builder,
                "enableCustomPlayerHurtSound", false,
                "Whether to enable custom player hurting another player sound. Oof.");
        builder.pop();

        // --------------------
        // entities
        // --------------------
        builder.comment("The entity configuration for this mod").push(CATEGORY_ENTITY);
        spawnDuck = bool(builder,
                "spawnDuck", false,
                "Whether ducks should generate naturally in your Minecraft world (beaches/rivers).");
        builder.pop();

        // --------------------
        // ores (root)
        // --------------------
        builder.comment("""
                The ore configuration for this mod\s

                Metal ores (tin, silver, cobalt) are generated in 3 separate veins;
                \tfrequent veins relatively high in the world, referred to as 'upper'
                \tmedium veins distributed fairly evenly across the middle layer of the world, referred to as 'middle'
                \tsmaller veins that are generated in a very wide radius, referred to as 'small'

                For the 'upper' and 'middle' generation methods, the number is the amount of vertical blocks from bedrock (usually y=-64).
                For example, overworldTinUpperMaxHeight default value is 210 which means the ores will spawn up to a maximum height of -64 + 210 -> y = 146

                The 'small' generation methods are different. The minimum height is bedrock and the maximum height is the absolute y-level.
                For example, overworldTinSmallMaxHeight default value is -40 which means the ores will spawn up to a maximum height of y=-40

                Gem ores are also generated in 3 separate veins; Referred to as 'small', 'large' and 'buried'
                Ores that have been generated buried means they will not spawn in contact with air, meaning they are rare.
                The values for the vertical anchors correspond to the y value in your Minecraft world.

                These values may also be below the world border of y=-64.

                * Buried means an ore has less chance to spawn if the block next to it is air (no block).
                """).push(CATEGORY_ORES);

        // ores.tin
        builder.push(SUB_CATEGORY_ORES_TIN);
        overworldTinUpperVeinsPerChunk = integer(builder,
                "overworldTinUpperVeinsPerChunk", 12, 0, 100,
                "The amount of tin ore veins per chunk for the upper layer");
        overworldTinUpperBottom = integer(builder,
                "overworldTinUpperMinHeight", 85, 0, 256,
                "Minimum height from the bottom for the upper layer of tin ores");
        overworldTinUpperTop = integer(builder,
                "overworldTinUpperMaxHeight", 210, 0, 256,
                "Maximum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleVeinsPerChunk = integer(builder,
                "overworldTinMiddleVeinsPerChunk", 7, 0, 100,
                "The amount of tin ore veins per chunk for the middle layer");
        overworldTinMiddleBottom = integer(builder,
                "overworldTinMiddleMinHeight", 40, 0, 256,
                "Minimum height from the bottom for the middle layer of tin ores");
        overworldTinMiddleTop = integer(builder,
                "overworldTinMiddleMaxHeight", 85, 0, 256,
                "Maximum height from the bottom for the middle layer of tin ores");
        overworldTinSmallVeinsPerChunk = integer(builder,
                "overworldTinSmallVeinsPerChunk", 3, 0, 100,
                "The amount of small tin ore veins per chunk");
        overworldTinSmallTop = integer(builder,
                "overworldTinSmallMaxHeight", -40, -64, 191,
                "Maximum VERTICAL Y-LEVEL for tin ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");
        builder.pop();

        // ores.silver
        builder.push(SUB_CATEGORY_ORES_SILVER);
        overworldSilverUpperVeinsPerChunk = integer(builder,
                "overworldSilverUpperVeinsPerChunk", 11, 0, 100,
                "The amount of silver ore veins per chunk for the upper layer");
        overworldSilverUpperBottom = integer(builder,
                "overworldSilverUpperMinHeight", 90, 0, 256,
                "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverUpperTop = integer(builder,
                "overworldSilverUpperMaxHeight", 190, 0, 256,
                "Maximum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleVeinsPerChunk = integer(builder,
                "overworldSilverMiddleVeinsPerChunk", 8, 0, 100,
                "The amount of silver ore veins per chunk for the middle layer");
        overworldSilverMiddleBottom = integer(builder,
                "overworldSilverMiddleMinHeight", 60, 0, 256,
                "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleTop = integer(builder,
                "overworldSilverMiddleMaxHeight", 90, 0, 256,
                "Maximum height from the bottom for the middle layer of silver ores");
        overworldSilverSmallVeinsPerChunk = integer(builder,
                "overworldSilverSmallVeinsPerChunk", 4, 0, 100,
                "The amount of small silver ore veins per chunk for the upper layer");
        overworldSilverSmallTop = integer(builder,
                "overworldSilverSmallMaxHeight", 0, -64, 191,
                "Maximum VERTICAL Y-LEVEL for silver ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");
        netherSilverVeinsPerChunk = integer(builder,
                "netherSilverVeinsPerChunk", 18, 0, 100,
                "The amount of nether silver ore veins per chunk");
        netherSilverBottom = integer(builder,
                "netherSilverMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether silver ore");
        netherSilverTop = integer(builder,
                "netherSilverMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether silver ore");
        builder.pop();

        // ores.cobalt
        builder.push(SUB_CATEGORY_ORES_COBALT);
        overworldCobaltUpperVeinsPerChunk = integer(builder,
                "overworldCobaltUpperVeinsPerChunk", 6, 0, 100,
                "The amount of cobalt ore veins per chunk for the upper layer");
        overworldCobaltUpperBottom = integer(builder,
                "overworldCobaltUpperMinHeight", 100, 0, 256,
                "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltUpperTop = integer(builder,
                "overworldCobaltUpperMaxHeight", 120, 0, 256,
                "Maximum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleVeinsPerChunk = integer(builder,
                "overworldCobaltMiddleVeinsPerChunk", 12, 0, 100,
                "The amount of cobalt ore veins per chunk for the middle layer");
        overworldCobaltMiddleBottom = integer(builder,
                "overworldCobaltMiddleMinHeight", 60, 0, 256,
                "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleTop = integer(builder,
                "overworldCobaltMiddleMaxHeight", 100, 0, 256,
                "Maximum height from the bottom for the middle layer of cobalt ores");
        overworldCobaltSmallVeinsPerChunk = integer(builder,
                "overworldCobaltSmallVeinsPerChunk", 5, 0, 100,
                "The amount of small cobalt ore veins per chunk for the upper layer");
        overworldCobaltSmallTop = integer(builder,
                "overworldCobaltSmallMaxHeight", -10, -64, 191,
                "Maximum VERTICAL Y-LEVEL for cobalt ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");
        builder.pop();

        // ores.tourmaline
        builder.push(SUB_CATEGORY_ORES_TOURMALINE);
        overworldTourmalineSmallVeinsPerChunk = integer(builder,
                "overworldTourmalineSmallVeinsPerChunk", 9, 0, 100,
                "The amount of small tourmaline ore veins per chunk");
        overworldTourmalineSmallBottom = integer(builder,
                "overworldTourmalineSmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineSmallTop = integer(builder,
                "overworldTourmalineSmallMaxHeight", 110, -64, 256,
                "Maximum height from the bottom for the upper layer of tourmaline ores");

        overworldTourmalineLargeVeinsPerChunk = integer(builder,
                "overworldTourmalineLargeVeinsPerChunk", 8, 0, 100,
                "The amount of large tourmaline ore veins per chunk");
        overworldTourmalineLargeBottom = integer(builder,
                "overworldTourmalineLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeTop = integer(builder,
                "overworldTourmalineLargeMaxHeight", 110, -64, 256,
                "Maximum height from the bottom for the middle layer of tourmaline ores");

        overworldTourmalineBuriedVeinsPerChunk = integer(builder,
                "overworldTourmalineBuriedVeinsPerChunk", 5, 0, 100,
                "The amount of buried* tourmaline ore veins per chunk");
        overworldTourmalineBuriedBottom = integer(builder,
                "overworldTourmalineBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of tourmaline ores");
        overworldTourmalineBuriedTop = integer(builder,
                "overworldTourmalineBuriedMaxHeight", 110, -64, 256,
                "Maximum height from the bottom for the buried layer of tourmaline ores");
        builder.pop();

        // ores.topaz
        builder.push(SUB_CATEGORY_ORES_TOPAZ);
        overworldTopazSmallVeinsPerChunk = integer(builder,
                "overworldTopazSmallVeinsPerChunk", 7, 0, 100,
                "The amount of small topaz ore veins per chunk");
        overworldTopazSmallBottom = integer(builder,
                "overworldTopazSmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazSmallTop = integer(builder,
                "overworldTopazSmallMaxHeight", 95, -64, 256,
                "Maximum height from the bottom for the upper layer of topaz ores");

        overworldTopazLargeVeinsPerChunk = integer(builder,
                "overworldTopazLargeVeinsPerChunk", 10, 0, 100,
                "The amount of large topaz ore veins per chunk");
        overworldTopazLargeBottom = integer(builder,
                "overworldTopazLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeTop = integer(builder,
                "overworldTopazLargeMaxHeight", 95, -64, 256,
                "Maximum height from the bottom for the middle layer of topaz ores");

        overworldTopazBuriedVeinsPerChunk = integer(builder,
                "overworldTopazBuriedVeinsPerChunk", 6, 0, 100,
                "The amount of buried* topaz ore veins per chunk");
        overworldTopazBuriedBottom = integer(builder,
                "overworldTopazBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of topaz ores");
        overworldTopazBuriedTop = integer(builder,
                "overworldTopazBuriedMaxHeight", 95, -64, 256,
                "Maximum height from the bottom for the buried layer of topaz ores");
        builder.pop();

        // ores.sapphire
        builder.push(SUB_CATEGORY_ORES_SAPPHIRE);
        overworldSapphireSmallVeinsPerChunk = integer(builder,
                "overworldSapphireSmallVeinsPerChunk", 6, 0, 100,
                "The amount of small sapphire ore veins per chunk");
        overworldSapphireSmallBottom = integer(builder,
                "overworldSapphireSmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireSmallTop = integer(builder,
                "overworldSapphireSmallMaxHeight", 65, -64, 256,
                "Maximum height from the bottom for the upper layer of sapphire ores");

        overworldSapphireLargeVeinsPerChunk = integer(builder,
                "overworldSapphireLargeVeinsPerChunk", 7, 0, 100,
                "The amount of large sapphire ore veins per chunk");
        overworldSapphireLargeBottom = integer(builder,
                "overworldSapphireLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeTop = integer(builder,
                "overworldSapphireLargeMaxHeight", 65, -64, 256,
                "Maximum height from the bottom for the middle layer of sapphire ores");

        overworldSapphireBuriedVeinsPerChunk = integer(builder,
                "overworldSapphireBuriedVeinsPerChunk", 5, 0, 100,
                "The amount of buried* sapphire ore veins per chunk");
        overworldSapphireBuriedBottom = integer(builder,
                "overworldSapphireBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of sapphire ores");
        overworldSapphireBuriedTop = integer(builder,
                "overworldSapphireBuriedMaxHeight", 65, -64, 256,
                "Maximum height from the bottom for the buried layer of sapphire ores");

        netherSapphireVeinsPerChunk = integer(builder,
                "netherSapphireVeinsPerChunk", 4, 0, 100,
                "The amount of nether sapphire ore veins per chunk");
        netherSapphireBottom = integer(builder,
                "netherSapphireMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether sapphire ore");
        netherSapphireTop = integer(builder,
                "netherSapphireMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether sapphire ore");
        builder.pop();

        // ores.ruby
        builder.push(SUB_CATEGORY_ORES_RUBY);
        overworldRubySmallVeinsPerChunk = integer(builder,
                "overworldRubySmallVeinsPerChunk", 5, 0, 100,
                "The amount of small ruby ore veins per chunk");
        overworldRubySmallBottom = integer(builder,
                "overworldRubySmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubySmallTop = integer(builder,
                "overworldRubySmallMaxHeight", 70, -64, 256,
                "Maximum height from the bottom for the upper layer of ruby ores");

        overworldRubyLargeVeinsPerChunk = integer(builder,
                "overworldRubyLargeVeinsPerChunk", 6, 0, 100,
                "The amount of large ruby ore veins per chunk");
        overworldRubyLargeBottom = integer(builder,
                "overworldRubyLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeTop = integer(builder,
                "overworldRubyLargeMaxHeight", 70, -64, 256,
                "Maximum height from the bottom for the middle layer of ruby ores");

        overworldRubyBuriedVeinsPerChunk = integer(builder,
                "overworldRubyBuriedVeinsPerChunk", 4, 0, 100,
                "The amount of buried* ruby ore veins per chunk");
        overworldRubyBuriedBottom = integer(builder,
                "overworldRubyBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of ruby ores");
        overworldRubyBuriedTop = integer(builder,
                "overworldRubyBuriedMaxHeight", 70, -64, 256,
                "Maximum height from the bottom for the buried layer of ruby ores");

        netherRubyVeinsPerChunk = integer(builder,
                "netherRubyVeinsPerChunk", 4, 0, 100,
                "The amount of nether ruby ore veins per chunk");
        netherRubyBottom = integer(builder,
                "netherRubyMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether ruby ore");
        netherRubyTop = integer(builder,
                "netherRubyMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether ruby ore");
        builder.pop();

        // ores.turquoise
        builder.push(SUB_CATEGORY_ORES_TURQUOISE);
        overworldTurquoiseSmallVeinsPerChunk = integer(builder,
                "overworldTurquoiseSmallVeinsPerChunk", 13, 0, 100,
                "The amount of small turquoise ore veins per chunk");
        overworldTurquoiseSmallBottom = integer(builder,
                "overworldTurquoiseSmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseSmallTop = integer(builder,
                "overworldTurquoiseSmallMaxHeight", 20, -64, 256,
                "Maximum height from the bottom for the upper layer of turquoise ores");

        overworldTurquoiseLargeVeinsPerChunk = integer(builder,
                "overworldTurquoiseLargeVeinsPerChunk", 17, 0, 100,
                "The amount of large turquoise ore veins per chunk");
        overworldTurquoiseLargeBottom = integer(builder,
                "overworldTurquoiseLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeTop = integer(builder,
                "overworldTurquoiseLargeMaxHeight", 20, -64, 256,
                "Maximum height from the bottom for the middle layer of turquoise ores");

        overworldTurquoiseBuriedVeinsPerChunk = integer(builder,
                "overworldTurquoiseBuriedVeinsPerChunk", 10, 0, 100,
                "The amount of buried* turquoise ore veins per chunk");
        overworldTurquoiseBuriedBottom = integer(builder,
                "overworldTurquoiseBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of turquoise ores");
        overworldTurquoiseBuriedTop = integer(builder,
                "overworldTurquoiseBuriedMaxHeight", 20, -64, 256,
                "Maximum height from the bottom for the buried layer of turquoise ores");
        builder.pop();

        // ores.moissanite
        builder.push(SUB_CATEGORY_ORES_MOISSANITE);
        overworldMoissaniteSmallVeinsPerChunk = integer(builder,
                "overworldMoissaniteSmallVeinsPerChunk", 6, 0, 100,
                "The amount of small moissanite ore veins per chunk");
        overworldMoissaniteSmallBottom = integer(builder,
                "overworldMoissaniteSmallMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteSmallTop = integer(builder,
                "overworldMoissaniteSmallMaxHeight", 40, -64, 256,
                "Maximum height from the bottom for the upper layer of moissanite ores");

        overworldMoissaniteLargeVeinsPerChunk = integer(builder,
                "overworldMoissaniteLargeVeinsPerChunk", 4, 0, 100,
                "The amount of large moissanite ore veins per chunk");
        overworldMoissaniteLargeBottom = integer(builder,
                "overworldMoissaniteLargeMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeTop = integer(builder,
                "overworldMoissaniteLargeMaxHeight", 40, -64, 256,
                "Maximum height from the bottom for the middle layer of moissanite ores");

        overworldMoissaniteBuriedVeinsPerChunk = integer(builder,
                "overworldMoissaniteBuriedVeinsPerChunk", 3, 0, 100,
                "The amount of buried* moissanite ore veins per chunk");
        overworldMoissaniteBuriedBottom = integer(builder,
                "overworldMoissaniteBuriedMinHeight", -64, -64, 256,
                "Minimum height from the bottom for the buried layer of moissanite ores");
        overworldMoissaniteBuriedTop = integer(builder,
                "overworldMoissaniteBuriedMaxHeight", 40, -64, 256,
                "Maximum height from the bottom for the buried layer of moissanite ores");

        netherMoissaniteVeinsPerChunk = integer(builder,
                "netherMoissaniteVeinsPerChunk", 7, 0, 100,
                "The amount of nether moissanite ore veins per chunk");
        netherMoissaniteBottom = integer(builder,
                "netherMoissaniteMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether moissanite ore");
        netherMoissaniteTop = integer(builder,
                "netherMoissaniteMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether moissanite ore");
        builder.pop();

        // ores.tanzanite
        builder.push(SUB_CATEGORY_ORES_TANZANITE);
        netherTanzaniteVeinsPerChunk = integer(builder,
                "netherTanzaniteVeinsPerChunk", 10, 0, 100,
                "The amount of nether tanzanite ore veins per chunk");
        netherTanzaniteBottom = integer(builder,
                "netherTanzaniteMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether tanzanite ore");
        netherTanzaniteTop = integer(builder,
                "netherTanzaniteMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether tanzanite ore");
        builder.pop();

        // ores.onyx
        builder.push(SUB_CATEGORY_ORES_ONYX);
        endOnyxVeinsPerChunk = integer(builder,
                "endOnyxVeinsPerChunk", 7, 0, 100,
                "The amount of end onyx ore veins per chunk");
        endOnyxBottom = integer(builder,
                "endOnyxMinHeight", -64, -64, 256,
                "Minimum height from the bottom for end onyx ore");
        endOnyxTop = integer(builder,
                "endOnyxMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for end onyx ore");
        builder.pop();

        // ores.anthracite
        builder.push(SUB_CATEGORY_ORES_ANTHRACITE);
        anthraciteUpperVeinsPerChunk = integer(builder,
                "anthraciteUpperVeinsPerChunk", 9, 0, 100,
                "The amount of anthracite ore veins per chunk for the upper layer");
        overworldAnthraciteUpperBottom = integer(builder,
                "anthraciteUpperMinHeight", -64, -64, 256,
                "Minimum height from the bottom for upper layer anthracite ore (Maximum height cannot be changed due to vertical anchor top!)");

        anthraciteLowerVeinsPerChunk = integer(builder,
                "anthraciteLowerVeinsPerChunk", 6, 0, 100,
                "The amount of anthracite ore veins per chunk for the bottom layer");
        overworldAnthraciteLowerBottom = integer(builder,
                "anthraciteLowerMinHeight", -64, -64, 256,
                "Minimum height from the bottom for bottom layer anthracite ore");
        overworldAnthraciteLowerTop = integer(builder,
                "anthraciteLowerMaxHeight", 192, -64, 256,
                "Maximum height from the bottom for bottom layer anthracite ore");

        netherAnthraciteVeinsPerChunk = integer(builder,
                "netherAnthraciteVeinsPerChunk", 17, 0, 100,
                "The amount of nether anthracite ore veins per chunk");
        netherAnthraciteBottom = integer(builder,
                "netherAnthraciteMinHeight", -64, -64, 256,
                "Minimum height from the bottom for nether anthracite ore");
        netherAnthraciteTop = integer(builder,
                "netherAnthraciteMaxHeight", 256, -64, 256,
                "Maximum height from the bottom for nether anthracite ore");
        builder.pop();

        builder.pop(); // ores root

        // --------------------
        // shields
        // --------------------
        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELDS);

        copperDurability = integer(builder, "copperDurability", 200, 1, 32767, "The durability of the Copper Shield.");
        tinDurability = integer(builder, "tinDurability", 240, 1, 32767, "The durability of the Tin Shield.");
        silverDurability = integer(builder, "silverDurability", 350, 1, 32767, "The durability of the Silver Shield.");
        bronzeDurability = integer(builder, "bronzeDurability", 385, 1, 32767, "The durability of the Bronze Shield.");
        cobaltDurability = integer(builder, "cobaltDurability", 500, 1, 32767, "The durability of the Cobalt Shield.");
        obsidianDurability = integer(builder, "obsidianDurability", 1200, 1, 32767, "The durability of the Obsidian Shield.");
        sterlingDurability = integer(builder, "sterlingDurability", 600, 1, 32767, "The durability of the Sterling Silver Shield.");
        steelDurability = integer(builder, "steelDurability", 690, 1, 32767, "The durability of the Steel Shield.");
        amethystDurability = integer(builder, "amethystDurability", 550, 1, 32767, "The durability of the Amethyst Shield.");
        emeraldDurability = integer(builder, "emeraldDurability", 550, 1, 32767, "The durability of the Emerald Shield.");
        topazDurability = integer(builder, "topazDurability", 680, 1, 32767, "The durability of the Topaz Shield.");
        tourmalineDurability = integer(builder, "tourmalineDurability", 700, 1, 32767, "The durability of the Tourmaline Shield.");
        tanzaniteDurability = integer(builder, "tanzaniteDurability", 720, 1, 32767, "The durability of the Tanzanite Shield.");
        rubyDurability = integer(builder, "rubyDurability", 800, 1, 32767, "The durability of the Ruby Shield.");
        sapphireDurability = integer(builder, "sapphireDurability", 825, 1, 32767, "The durability of the Sapphire Shield.");
        turquoiseDurability = integer(builder, "turquoiseDurability", 1000, 1, 32767, "The durability of the Turquoise Shield.");
        moissaniteDurability = integer(builder, "moissaniteDurability", 850, 1, 32767, "The durability of the Moissanite Shield.");
        onyxDurability = integer(builder, "onyxDurability", 1500, 1, 32767, "The durability of the Onyx Shield.");
        grapheneDurability = integer(builder, "grapheneDurability", 2000, 1, 32767, "The durability of the Graphene Shield.");

        builder.pop();
    }

    // --- "local key" helpers (order is kept in the order you call them) ---

    private static BooleanValue bool(ForgeConfigSpec.Builder b, String name, boolean def, String comment) {
        return b.comment(comment, "Default: " + def).define(name, def);
    }

    private static ConfigValue<Integer> integer(ForgeConfigSpec.Builder b, String name, int def, int min, int max, String comment) {
        return b.comment(comment, "Default: " + def).defineInRange(name, def, min, max);
    }
}
