package mod.leronus.mores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    private static final String CATEGORY_SHIELDS = "shields";
    private static final String CATEGORY_ENTITY = "entities";
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
    private static final String CATEGORY_PAINTINGS = "paintings";

    public static ForgeConfigSpec.BooleanValue enableCustomPaintingsMores;
    public static ForgeConfigSpec.BooleanValue spawnDuck;

    public static ForgeConfigSpec.BooleanValue spawnTin;
    public static ForgeConfigSpec.BooleanValue spawnCobalt;
    public static ForgeConfigSpec.BooleanValue spawnSilver;
    public static ForgeConfigSpec.BooleanValue spawnTourmaline;
    public static ForgeConfigSpec.BooleanValue spawnTopaz;
    public static ForgeConfigSpec.BooleanValue spawnMoissanite;
    public static ForgeConfigSpec.BooleanValue spawnRuby;
    public static ForgeConfigSpec.BooleanValue spawnSapphire;
    public static ForgeConfigSpec.BooleanValue spawnTurquoise;
    public static ForgeConfigSpec.BooleanValue spawnAnthracite;

    public static ForgeConfigSpec.BooleanValue spawnTanzanite;
    public static ForgeConfigSpec.BooleanValue spawnNetherMoissanite;
    public static ForgeConfigSpec.BooleanValue spawnNetherRuby;
    public static ForgeConfigSpec.BooleanValue spawnNetherSapphire;
    public static ForgeConfigSpec.BooleanValue spawnNetherSilver;
    public static ForgeConfigSpec.BooleanValue spawnNetherAnthracite;
    public static ForgeConfigSpec.BooleanValue spawnEndOnyx;

    public static ForgeConfigSpec.BooleanValue customShieldMaxReduction;
    public static ForgeConfigSpec.IntValue defaultDamageReduction;

    public static ForgeConfigSpec.IntValue tinDamageReduction;
    public static ForgeConfigSpec.IntValue copperDamageReduction;
    public static ForgeConfigSpec.IntValue silverDamageReduction;
    public static ForgeConfigSpec.IntValue bronzeDamageReduction;
    public static ForgeConfigSpec.IntValue cobaltDamageReduction;
    public static ForgeConfigSpec.IntValue obsidianDamageReduction;
    public static ForgeConfigSpec.IntValue sterlingDamageReduction;
    public static ForgeConfigSpec.IntValue steelDamageReduction;
    public static ForgeConfigSpec.IntValue amethystDamageReduction;
    public static ForgeConfigSpec.IntValue emeraldDamageReduction;
    public static ForgeConfigSpec.IntValue topazDamageReduction;
    public static ForgeConfigSpec.IntValue tourmalineDamageReduction;
    public static ForgeConfigSpec.IntValue tanzaniteDamageReduction;
    public static ForgeConfigSpec.IntValue rubyDamageReduction;
    public static ForgeConfigSpec.IntValue sapphireDamageReduction;
    public static ForgeConfigSpec.IntValue turquoiseDamageReduction;
    public static ForgeConfigSpec.IntValue moissaniteDamageReduction;
    public static ForgeConfigSpec.IntValue onyxDamageReduction;
    public static ForgeConfigSpec.IntValue grapheneDamageReduction;

    public static ForgeConfigSpec.IntValue tinDurability;
    public static ForgeConfigSpec.IntValue copperDurability;
    public static ForgeConfigSpec.IntValue silverDurability;
    public static ForgeConfigSpec.IntValue bronzeDurability;
    public static ForgeConfigSpec.IntValue cobaltDurability;
    public static ForgeConfigSpec.IntValue obsidianDurability;
    public static ForgeConfigSpec.IntValue sterlingDurability;
    public static ForgeConfigSpec.IntValue steelDurability;
    public static ForgeConfigSpec.IntValue amethystDurability;
    public static ForgeConfigSpec.IntValue emeraldDurability;
    public static ForgeConfigSpec.IntValue topazDurability;
    public static ForgeConfigSpec.IntValue tourmalineDurability;
    public static ForgeConfigSpec.IntValue tanzaniteDurability;
    public static ForgeConfigSpec.IntValue rubyDurability;
    public static ForgeConfigSpec.IntValue sapphireDurability;
    public static ForgeConfigSpec.IntValue turquoiseDurability;
    public static ForgeConfigSpec.IntValue moissaniteDurability;
    public static ForgeConfigSpec.IntValue onyxDurability;
    public static ForgeConfigSpec.IntValue grapheneDurability;

    public static ForgeConfigSpec.IntValue overworldTinUpperTop;
    public static ForgeConfigSpec.IntValue overworldSilverUpperTop;
    public static ForgeConfigSpec.IntValue overworldCobaltUpperTop;
    public static ForgeConfigSpec.IntValue overworldTinUpperBottom;
    public static ForgeConfigSpec.IntValue overworldSilverUpperBottom;
    public static ForgeConfigSpec.IntValue overworldCobaltUpperBottom;

    public static ForgeConfigSpec.IntValue overworldTinMiddleTop;
    public static ForgeConfigSpec.IntValue overworldSilverMiddleTop;
    public static ForgeConfigSpec.IntValue overworldCobaltMiddleTop;
    public static ForgeConfigSpec.IntValue overworldTinMiddleBottom;
    public static ForgeConfigSpec.IntValue overworldSilverMiddleBottom;
    public static ForgeConfigSpec.IntValue overworldCobaltMiddleBottom;
    public static ForgeConfigSpec.IntValue overworldTinSmallTop;
    public static ForgeConfigSpec.IntValue overworldSilverSmallTop;
    public static ForgeConfigSpec.IntValue overworldCobaltSmallTop;

    public static ForgeConfigSpec.IntValue overworldTopazSmallTop;
    public static ForgeConfigSpec.IntValue overworldTourmalineSmallTop;
    public static ForgeConfigSpec.IntValue overworldRubySmallTop;
    public static ForgeConfigSpec.IntValue overworldSapphireSmallTop;
    public static ForgeConfigSpec.IntValue overworldTurquoiseSmallTop;
    public static ForgeConfigSpec.IntValue overworldMoissaniteSmallTop;
    public static ForgeConfigSpec.IntValue overworldTopazSmallBottom;
    public static ForgeConfigSpec.IntValue overworldTourmalineSmallBottom;
    public static ForgeConfigSpec.IntValue overworldRubySmallBottom;
    public static ForgeConfigSpec.IntValue overworldSapphireSmallBottom;
    public static ForgeConfigSpec.IntValue overworldTurquoiseSmallBottom;
    public static ForgeConfigSpec.IntValue overworldMoissaniteSmallBottom;

    public static ForgeConfigSpec.IntValue overworldTopazLargeTop;
    public static ForgeConfigSpec.IntValue overworldTourmalineLargeTop;
    public static ForgeConfigSpec.IntValue overworldRubyLargeTop;
    public static ForgeConfigSpec.IntValue overworldSapphireLargeTop;
    public static ForgeConfigSpec.IntValue overworldTurquoiseLargeTop;
    public static ForgeConfigSpec.IntValue overworldMoissaniteLargeTop;
    public static ForgeConfigSpec.IntValue overworldTopazLargeBottom;
    public static ForgeConfigSpec.IntValue overworldTourmalineLargeBottom;
    public static ForgeConfigSpec.IntValue overworldRubyLargeBottom;
    public static ForgeConfigSpec.IntValue overworldSapphireLargeBottom;
    public static ForgeConfigSpec.IntValue overworldTurquoiseLargeBottom;
    public static ForgeConfigSpec.IntValue overworldMoissaniteLargeBottom;

    public static ForgeConfigSpec.IntValue overworldTopazBuriedTop;
    public static ForgeConfigSpec.IntValue overworldTourmalineBuriedTop;
    public static ForgeConfigSpec.IntValue overworldRubyBuriedTop;
    public static ForgeConfigSpec.IntValue overworldSapphireBuriedTop;
    public static ForgeConfigSpec.IntValue overworldTurquoiseBuriedTop;
    public static ForgeConfigSpec.IntValue overworldMoissaniteBuriedTop;
    public static ForgeConfigSpec.IntValue overworldTopazBuriedBottom;
    public static ForgeConfigSpec.IntValue overworldTourmalineBuriedBottom;
    public static ForgeConfigSpec.IntValue overworldRubyBuriedBottom;
    public static ForgeConfigSpec.IntValue overworldSapphireBuriedBottom;
    public static ForgeConfigSpec.IntValue overworldTurquoiseBuriedBottom;
    public static ForgeConfigSpec.IntValue overworldMoissaniteBuriedBottom;

    public static ForgeConfigSpec.IntValue anthraciteLowerBottom;
    public static ForgeConfigSpec.IntValue anthraciteUpperBottom;
    public static ForgeConfigSpec.IntValue anthraciteLowerTop;

    public static ForgeConfigSpec.IntValue endOnyxTop;
    public static ForgeConfigSpec.IntValue endOnyxBottom;

    public static ForgeConfigSpec.IntValue netherSilverTop;
    public static ForgeConfigSpec.IntValue netherTanzaniteTop;
    public static ForgeConfigSpec.IntValue netherRubyTop;
    public static ForgeConfigSpec.IntValue netherSapphireTop;
    public static ForgeConfigSpec.IntValue netherMoissaniteTop;
    public static ForgeConfigSpec.IntValue netherAnthraciteTop;
    public static ForgeConfigSpec.IntValue netherSilverBottom;
    public static ForgeConfigSpec.IntValue netherTanzaniteBottom;
    public static ForgeConfigSpec.IntValue netherRubyBottom;
    public static ForgeConfigSpec.IntValue netherSapphireBottom;
    public static ForgeConfigSpec.IntValue netherMoissaniteBottom;
    public static ForgeConfigSpec.IntValue netherAnthraciteBottom;

    public static ForgeConfigSpec.BooleanValue thornsOnShields;
    public static ForgeConfigSpec.BooleanValue enableDamageReduction;


    Config(final ForgeConfigSpec.Builder builder){
        builder.comment("""
                The ore configuration for this mod\s

                Metal ores (tin, silver, cobalt) are generated in 3 separate veins;
                \tfrequent veins relatively high in the world, referred to as 'upper'
                \tmedium veins distributed fairly evenly across the middle layer of the world, referred to as 'middle'
                \tsmaller veins that are generated in a very wide radius, referred to as 'small'
                
                For the 'upper' and 'middle' generation methods, the number is the amount of vertical blocks from bedrock (usually y=-64).
                For example, overworldTinUpperLayerMaxHeight default value is 210 which means the ores will spawn up to a maximum height of -64 + 210 -> y = 146
                
                The 'small' generation methods are different. The minimum height is bedrock and the maximum height is the absolute y-level.
                For example, overworldTinSmallLayerMaxHeight default value is -40 which means the ores will spawn up to a maximum height of y=-40

                Gem ores are also generated in 3 separate veins; Referred to as 'small', 'large' and 'buried'
                Ores that have been generated buried means they will not spawn in contact with air, meaning they are rare.
                The values for the vertical anchors correspond to the y value in your Minecraft world.
                
                These values may also be below the world border of y=-64.
                """).push(CATEGORY_ORES);

        spawnTin = getBoolean(builder,"spawnTin", SUB_CATEGORY_ORES_TIN, true, "Should tin spawn in the overworld");
        overworldTinUpperBottom = getInt(builder,"overworldTinUpperLayerMinHeight", SUB_CATEGORY_ORES_TIN, 85, 0, 256,"Minimum height from the bottom for the upper layer of tin ores");
        overworldTinUpperTop = getInt(builder,"overworldTinUpperLayerMaxHeight", SUB_CATEGORY_ORES_TIN, 210, 0, 256,"Maximum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleBottom = getInt(builder,"overworldTinMiddleLayerMinHeight", SUB_CATEGORY_ORES_TIN, 40,0, 256, "Minimum height from the bottom for the upper layer of tin ores");
        overworldTinMiddleTop = getInt(builder,"overworldTinMiddleLayerMaxHeight", SUB_CATEGORY_ORES_TIN, 85,0, 256, "Maximum height from the bottom for the middle layer of tin ores");
        overworldTinSmallTop = getInt(builder,"overworldTinSmallLayerMaxHeight", SUB_CATEGORY_ORES_TIN, -40, -64, 191,"Maximum VERTICAL Y-LEVEL for tin ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

        spawnSilver = getBoolean(builder,"spawnSilver", SUB_CATEGORY_ORES_SILVER, false, "Should silver spawn in the overworld");
        overworldSilverUpperBottom = getInt(builder,"overworldSilverUpperLayerMinHeight", SUB_CATEGORY_ORES_SILVER, 90,0, 256, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverUpperTop = getInt(builder,"overworldSilverUpperLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 190, 0, 256,"Maximum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleBottom = getInt(builder,"overworldSilverMiddleLayerMinHeight", SUB_CATEGORY_ORES_SILVER, 60,0, 256, "Minimum height from the bottom for the upper layer of silver ores");
        overworldSilverMiddleTop = getInt(builder,"overworldSilverMiddleLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 90, 0, 256,"Maximum height from the bottom for the middle layer of silver ores");
        overworldSilverSmallTop = getInt(builder,"overworldSilverSmallLayerMaxHeight", SUB_CATEGORY_ORES_SILVER, 0, -64, 191, "Maximum VERTICAL Y-LEVEL for silver ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

        spawnCobalt = getBoolean(builder,"spawnCobalt", SUB_CATEGORY_ORES_COBALT, true, "Should cobalt spawn in the overworld");
        overworldCobaltUpperBottom = getInt(builder,"overworldCobaltUpperLayerMinHeight", SUB_CATEGORY_ORES_COBALT, 100,0, 256, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltUpperTop = getInt(builder,"overworldCobaltUpperLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, 120, 0, 256,"Maximum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleBottom = getInt(builder,"overworldCobaltMiddleLayerMinHeight", SUB_CATEGORY_ORES_COBALT, 60,0, 256, "Minimum height from the bottom for the upper layer of cobalt ores");
        overworldCobaltMiddleTop = getInt(builder,"overworldCobaltMiddleLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, 100, 0, 256,"Maximum height from the bottom for the middle layer of cobalt ores");
        overworldCobaltSmallTop = getInt(builder,"overworldCobaltSmallLayerMaxHeight", SUB_CATEGORY_ORES_COBALT, -10,-64, 191,  "Maximum VERTICAL Y-LEVEL for cobalt ore generation in small veins - NOTE: This generation method differs from the others. The bottom anchor for this generation cannot be changed (starts spawning from bedrock; y=-64)");

        spawnTourmaline = getBoolean(builder,"spawnTourmaline", SUB_CATEGORY_ORES_TOURMALINE, true, "Should tourmaline spawn in the overworld");
        overworldTourmalineSmallBottom = getInt(builder,"overworldTourmalineSmallLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64, -64, 256, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineSmallTop = getInt(builder,"overworldTourmalineSmallLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, -64, 256, "Maximum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeBottom = getInt(builder,"overworldTourmalineLargeLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64, -64, 256, "Minimum height from the bottom for the upper layer of tourmaline ores");
        overworldTourmalineLargeTop = getInt(builder,"overworldTourmalineLargeLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110, -64, 256, "Maximum height from the bottom for the middle layer of tourmaline ores");
        overworldTourmalineBuriedBottom = getInt(builder,"overworldTourmalineBuriedLayerMinHeight", SUB_CATEGORY_ORES_TOURMALINE, -64,-64, 256,  "Minimum height from the bottom for the buried layer of tourmaline ores");
        overworldTourmalineBuriedTop = getInt(builder,"overworldTourmalineBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TOURMALINE, 110,-64, 256,  "Maximum height from the bottom for the buried layer of tourmaline ores");

        spawnTopaz = getBoolean(builder,"spawnTopaz", SUB_CATEGORY_ORES_TOPAZ, true, "Should topaz spawn in the overworld");
        overworldTopazSmallBottom = getInt(builder,"overworldTopazSmallLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazSmallTop = getInt(builder,"overworldTopazSmallLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95,-64, 256,  "Maximum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeBottom = getInt(builder,"overworldTopazLargeLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the upper layer of topaz ores");
        overworldTopazLargeTop = getInt(builder,"overworldTopazLargeLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95, -64, 256, "Maximum height from the bottom for the middle layer of topaz ores");
        overworldTopazBuriedBottom = getInt(builder,"overworldTopazBuriedLayerMinHeight", SUB_CATEGORY_ORES_TOPAZ, -64, -64, 256, "Minimum height from the bottom for the buried layer of topaz ores");
        overworldTopazBuriedTop = getInt(builder,"overworldTopazBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TOPAZ, 95,-64, 256,  "Maximum height from the bottom for the buried layer of topaz ores");

        spawnSapphire = getBoolean(builder,"spawnSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the overworld");
        overworldSapphireSmallBottom = getInt(builder,"overworldSapphireSmallLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireSmallTop = getInt(builder,"overworldSapphireSmallLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, -64, 256, "Maximum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeBottom = getInt(builder,"overworldSapphireLargeLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the upper layer of sapphire ores");
        overworldSapphireLargeTop = getInt(builder,"overworldSapphireLargeLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65, -64, 256, "Maximum height from the bottom for the middle layer of sapphire ores");
        overworldSapphireBuriedBottom = getInt(builder,"overworldSapphireBuriedLayerMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64,-64, 256,  "Minimum height from the bottom for the buried layer of sapphire ores");
        overworldSapphireBuriedTop = getInt(builder,"overworldSapphireBuriedLayerMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 65,-64, 256,  "Maximum height from the bottom for the buried layer of sapphire ores");

        spawnRuby = getBoolean(builder,"spawnRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the overworld");
        overworldRubySmallBottom = getInt(builder,"overworldRubySmallLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -64, -64, 256, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubySmallTop = getInt(builder,"overworldRubySmallLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeBottom = getInt(builder,"overworldRubyLargeLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256, "Minimum height from the bottom for the upper layer of ruby ores");
        overworldRubyLargeTop = getInt(builder,"overworldRubyLargeLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the middle layer of ruby ores");
        overworldRubyBuriedBottom = getInt(builder,"overworldRubyBuriedLayerMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256, "Minimum height from the bottom for the buried layer of ruby ores");
        overworldRubyBuriedTop = getInt(builder,"overworldRubyBuriedLayerMaxHeight", SUB_CATEGORY_ORES_RUBY, 70, -64, 256,"Maximum height from the bottom for the buried layer of ruby ores");

        spawnTurquoise = getBoolean(builder,"spawnTurquoise", SUB_CATEGORY_ORES_TURQUOISE, true, "Should turquoise spawn in the overworld");
        overworldTurquoiseSmallBottom = getInt(builder,"overworldTurquoiseSmallLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64, -64, 256,"Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseSmallTop = getInt(builder,"overworldTurquoiseSmallLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 10,-64, 256, "Maximum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeBottom = getInt(builder,"overworldTurquoiseLargeLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64,-64, 256, "Minimum height from the bottom for the upper layer of turquoise ores");
        overworldTurquoiseLargeTop = getInt(builder,"overworldTurquoiseLargeLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 10,-64, 256, "Maximum height from the bottom for the middle layer of turquoise ores");
        overworldTurquoiseBuriedBottom = getInt(builder,"overworldTurquoiseBuriedLayerMinHeight", SUB_CATEGORY_ORES_TURQUOISE, -64,-64, 256, "Minimum height from the bottom for the buried layer of turquoise ores");
        overworldTurquoiseBuriedTop = getInt(builder,"overworldTurquoiseBuriedLayerMaxHeight", SUB_CATEGORY_ORES_TURQUOISE, 10,-64, 256, "Maximum height from the bottom for the buried layer of turquoise ores");

        spawnMoissanite = getBoolean(builder,"spawnMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the overworld");
        overworldMoissaniteSmallBottom = getInt(builder,"overworldMoissaniteSmallLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteSmallTop = getInt(builder,"overworldMoissaniteSmallLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, -64, 256,"Maximum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeBottom = getInt(builder,"overworldMoissaniteLargeLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the upper layer of moissanite ores");
        overworldMoissaniteLargeTop = getInt(builder,"overworldMoissaniteLargeLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40, -64, 256,"Maximum height from the bottom for the middle layer of moissanite ores");
        overworldMoissaniteBuriedBottom = getInt(builder,"overworldMoissaniteBuriedLayerMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for the buried layer of moissanite ores");
        overworldMoissaniteBuriedTop = getInt(builder,"overworldMoissaniteBuriedLayerMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 40,-64, 256, "Maximum height from the bottom for the buried layer of moissanite ores");

        spawnNetherMoissanite = getBoolean(builder,"spawnNetherMoissanite", SUB_CATEGORY_ORES_MOISSANITE, true, "Should moissanite spawn in the nether");
        netherMoissaniteBottom = getInt(builder,"netherMoissaniteMinHeight", SUB_CATEGORY_ORES_MOISSANITE, -64,-64, 256, "Minimum height from the bottom for nether moissanite ore");
        netherMoissaniteTop = getInt(builder,"netherMoissaniteMaxHeight", SUB_CATEGORY_ORES_MOISSANITE, 256, -64, 256, "Maximum height from the bottom for nether moissanite ore");

        spawnTanzanite = getBoolean(builder,"spawnTanzanite", SUB_CATEGORY_ORES_TANZANITE, true, "Should tanzanite spawn in the nether");
        netherTanzaniteBottom = getInt(builder,"netherTanzaniteMinHeight", SUB_CATEGORY_ORES_TANZANITE, -64, -64, 256, "Minimum height from the bottom for nether tanzanite ore");
        netherTanzaniteTop = getInt(builder,"netherTanzaniteMaxHeight", SUB_CATEGORY_ORES_TANZANITE, 256, -64, 256, "Maximum height from the bottom for nether tanzanite ore");

        spawnNetherSilver = getBoolean(builder,"spawnNetherSilver", SUB_CATEGORY_ORES_SILVER, true, "Should silver spawn in the nether");
        netherSilverBottom = getInt(builder,"netherSilverMinHeight", SUB_CATEGORY_ORES_SILVER, -64, -64, 256, "Minimum height from the bottom for nether silver ore");
        netherSilverTop = getInt(builder,"netherSilverMaxHeight", SUB_CATEGORY_ORES_SILVER, 256, -64, 256, "Maximum height from the bottom for nether silver ore");

        spawnEndOnyx = getBoolean(builder,"spawnEndOnyx", SUB_CATEGORY_ORES_ONYX, true, "Should onyx spawn in the end");
        endOnyxBottom = getInt(builder,"endOnyxMinHeight", SUB_CATEGORY_ORES_ONYX, -64,-64, 256,  "Minimum height from the bottom for nether silver ore");
        endOnyxTop = getInt(builder,"endOnyxMaxHeight", SUB_CATEGORY_ORES_ONYX, 256, -64, 256, "Maximum height from the bottom for nether silver ore");

        spawnNetherSapphire = getBoolean(builder,"spawnNetherSapphire", SUB_CATEGORY_ORES_SAPPHIRE, true, "Should sapphire spawn in the nether");
        netherSapphireBottom = getInt(builder,"netherSapphireMinHeight", SUB_CATEGORY_ORES_SAPPHIRE, -64, -64, 256, "Minimum height from the bottom for nether sapphire ore");
        netherSapphireTop = getInt(builder,"netherSapphireMaxHeight", SUB_CATEGORY_ORES_SAPPHIRE, 256, -64, 256, "Maximum height from the bottom for nether sapphire ore");

        spawnNetherRuby = getBoolean(builder,"spawnNetherRuby", SUB_CATEGORY_ORES_RUBY, true, "Should ruby spawn in the nether");
        netherRubyBottom = getInt(builder,"netherRubyMinHeight", SUB_CATEGORY_ORES_RUBY, -64,-64, 256,  "Minimum height from the bottom for nether ruby ore");
        netherRubyTop = getInt(builder,"netherRubyMaxHeight", SUB_CATEGORY_ORES_RUBY, 256, -64, 256, "Maximum height from the bottom for nether ruby ore");

        spawnAnthracite = getBoolean(builder,"spawnAnthracite", SUB_CATEGORY_ORES_ANTHRACITE, true, "Should anthracite spawn in the overworld");
        anthraciteUpperBottom = getInt(builder,"anthraciteUpperLayerMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64,-64, 256,  "Minimum height from the bottom for upper layer anthracite ore (Maximum height cannot be changed due to vertical anchor top!)");
        anthraciteLowerBottom = getInt(builder,"anthraciteLowerLayerMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64, -64, 256, "Minimum height from the bottom for bottom layer anthracite ore");
        anthraciteLowerTop = getInt(builder,"anthraciteLowerLayerMaxHeight", SUB_CATEGORY_ORES_ANTHRACITE, 192,-64, 256,  "Maximum height from the bottom for bottom layer anthracite ore");

        spawnNetherAnthracite = getBoolean(builder,"spawnNetherAnthracite", SUB_CATEGORY_ORES_ANTHRACITE, true, "Should anthracite spawn in the nether");
        netherAnthraciteBottom = getInt(builder,"netherAnthraciteMinHeight", SUB_CATEGORY_ORES_ANTHRACITE, -64,-64, 256,  "Minimum height from the bottom for nether anthracite ore");
        netherAnthraciteTop = getInt(builder,"netherAnthraciteMaxHeight", SUB_CATEGORY_ORES_ANTHRACITE, 256, -64, 256, "Maximum height from the bottom for nether anthracite ore");
        builder.pop();

        builder.comment("The shield configuration for this mod").push(CATEGORY_SHIELDS).pop();
        customShieldMaxReduction = getBoolean(builder,"customShieldMaxReduction", CATEGORY_SHIELDS, true,
                "If set to true Shields added by other mods block 100% of the incoming damage, "
                        + "if set to false they will block the amount set in defaultDamageReduction.");

        defaultDamageReduction = getInt(builder,"defaultDamageReduction", CATEGORY_SHIELDS, 60, 0, 100,
                "The portion of the incoming damage Vanilla Shields block in percent.");

        copperDamageReduction = getInt(builder,"copperDamageReduction", CATEGORY_SHIELDS, 60,0, 100,
                "The portion of the incoming damage Copper Shields block in percent.");
        tinDamageReduction = getInt(builder,"tinDamageReduction", CATEGORY_SHIELDS, 60,0, 100,
                "The portion of the incoming damage Tin Shields block in percent.");
        silverDamageReduction = getInt(builder,"silverDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
                "The portion of the incoming damage Silver Shields block in percent.");
        bronzeDamageReduction = getInt(builder,"bronzeDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
                "The portion of the incoming damage Bronze Shields block in percent.");
        cobaltDamageReduction = getInt(builder,"cobaltDamageReduction", CATEGORY_SHIELDS, 65,0, 100,
                "The portion of the incoming damage Cobalt Shields block in percent.");
        obsidianDamageReduction = getInt(builder,"obsidianDamageReduction", CATEGORY_SHIELDS, 85,0, 100,
                "The portion of the incoming damage Obsidian Shields block in percent.");
        sterlingDamageReduction = getInt(builder,"sterlingDamageReduction", CATEGORY_SHIELDS, 75,0, 100,
                "The portion of the incoming damage Sterling Silver Shields block in percent.");
        steelDamageReduction = getInt(builder,"steelDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
                "The portion of the incoming damage Carbon Steel Shields block in percent.");
        amethystDamageReduction = getInt(builder,"amethystDamageReduction", CATEGORY_SHIELDS, 70,0, 100,
                "The portion of the incoming damage Amethyst Shields block in percent.");
        emeraldDamageReduction = getInt(builder,"emeraldDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
                "The portion of the incoming damage Emerald Shields block in percent.");
        topazDamageReduction = getInt(builder,"topazDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
                "The portion of the incoming damage Topaz Shields block in percent.");
        tourmalineDamageReduction = getInt(builder,"tourmalineDamageReduction", CATEGORY_SHIELDS, 80,0, 100,
                "The portion of the incoming damage Tourmaline Shields block in percent.");
        tanzaniteDamageReduction = getInt(builder,"tanzaniteDamageReduction", CATEGORY_SHIELDS, 85,0, 100,
                "The portion of the incoming damage Tanzanite Shields block in percent.");
        rubyDamageReduction = getInt(builder,"rubyDamageReduction", CATEGORY_SHIELDS, 90,0, 100,
                "The portion of the incoming damage Ruby Shields block in percent.");
        sapphireDamageReduction = getInt(builder,"sapphireDamageReduction", CATEGORY_SHIELDS, 93,0, 100,
                "The portion of the incoming damage Sapphire Shields block in percent.");
        turquoiseDamageReduction = getInt(builder,"turquoiseDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
                "The portion of the incoming damage Sapphire Shields block in percent.");
        moissaniteDamageReduction = getInt(builder,"moissaniteDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
                "The portion of the incoming damage Moissanite Shields block in percent.");
        onyxDamageReduction = getInt(builder,"onyxDamageReduction", CATEGORY_SHIELDS, 95,0, 100,
                "The portion of the incoming damage Onyx Shields block in percent.");
        grapheneDamageReduction = getInt(builder,"grapheneDamageReduction", CATEGORY_SHIELDS, 100,0, 100,
                "The portion of the incoming damage Graphene Shields block in percent.");

        copperDurability = getInt(builder,"copperDurability", CATEGORY_SHIELDS, 580, 1, 32767, "The durability of the Copper Shield.");
        tinDurability = getInt(builder,"tinDurability", CATEGORY_SHIELDS, 80, 1, 32767,"The durability of the Tin Shield.");
        silverDurability = getInt(builder,"silverDurability", CATEGORY_SHIELDS, 730,1, 32767, "The durability of the Silver Shield.");
        bronzeDurability = getInt(builder,"bronzeDurability", CATEGORY_SHIELDS, 840,1, 32767, "The durability of the Bronze Shield.");
        cobaltDurability = getInt(builder,"cobaltDurability", CATEGORY_SHIELDS, 1300, 1, 32767,"The durability of the Cobalt Shield.");
        obsidianDurability = getInt(builder,"obsidianDurability", CATEGORY_SHIELDS, 3000,1, 32767, "The durability of the Obsidian Shield.");
        sterlingDurability = getInt(builder,"sterlingDurability", CATEGORY_SHIELDS, 1800,1, 32767, "The durability of the Sterling Silver Shield.");
        steelDurability = getInt(builder,"steelDurability", CATEGORY_SHIELDS, 2000,1, 32767, "The durability of the Steel Shield.");
        amethystDurability = getInt(builder,"amethystDurability", CATEGORY_SHIELDS, 1250,1, 32767, "The durability of the Amethyst Shield.");
        emeraldDurability = getInt(builder,"emeraldDurability", CATEGORY_SHIELDS, 2500,1, 32767, "The durability of the Emerald Shield.");
        topazDurability = getInt(builder,"topazDurability", CATEGORY_SHIELDS, 2900, 1, 32767,"The durability of the Topaz Shield.");
        tourmalineDurability = getInt(builder,"tourmalineDurability", CATEGORY_SHIELDS, 3500, 1, 32767,"The durability of the Tourmaline Shield.");
        tanzaniteDurability = getInt(builder,"tanzaniteDurability", CATEGORY_SHIELDS, 5100,1, 32767, "The durability of the Tanzanite Shield.");
        rubyDurability = getInt(builder,"rubyDurability", CATEGORY_SHIELDS, 4200,1, 32767, "The durability of the Ruby Shield.");
        sapphireDurability = getInt(builder,"sapphireDurability", CATEGORY_SHIELDS, 4500,1, 32767, "The durability of the Sapphire Shield.");
        turquoiseDurability = getInt(builder,"turquoiseDurability", CATEGORY_SHIELDS, 3500, 1, 32767,"The durability of the Turquoise Shield.");
        moissaniteDurability = getInt(builder,"moissaniteDurability", CATEGORY_SHIELDS, 5300, 1, 32767,"The durability of the Moissanite Shield.");
        onyxDurability = getInt(builder,"onyxDurability", CATEGORY_SHIELDS, 6200, 1, 32767,"The durability of the Onyx Shield.");
        grapheneDurability = getInt(builder,"grapheneDurability", CATEGORY_SHIELDS, 7500,1, 32767, "The durability of the Graphene Shield.");
//        diamondDurability = getInt(builder,"diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt(builder,"netheriteDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Netherite Shield.");
        thornsOnShields = getBoolean(builder,"thornsOnShields", CATEGORY_SHIELDS, true,
                "Allows the Thorns enchantment to by applied to Shields");
        enableDamageReduction = getBoolean(builder,"enableDamageReduction", CATEGORY_SHIELDS, true,
                "Enables modified damage reduction values for shields.");

        builder.comment("The entity configuration for this mod").push(CATEGORY_ENTITY).pop();
        spawnDuck = getBoolean(builder,"spawnDuck", CATEGORY_ENTITY, true, "Whether ducks should generate naturally in your Minecraft world.");
    }

    private static void shieldConfig(ForgeConfigSpec.Builder builder) {

    }

    private static void entityConfig(ForgeConfigSpec.Builder builder){
    }


    private static ForgeConfigSpec.BooleanValue getBoolean(ForgeConfigSpec.Builder builder, String name, String category, boolean defaultValue, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).define(path, defaultValue);
    }

    private static ForgeConfigSpec.IntValue getInt(ForgeConfigSpec.Builder builder, String name, String category, int defaultValue, int min, int max, String comment) {
        String path = category + "." + name;
        return builder.comment(comment, "Default: " + defaultValue).defineInRange(path, defaultValue, min, max);
    }
}