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
    public static CommentedFileConfig cfg;
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    private static final String CATEGORY_SHIELD = "shield";
    private static final String CATEGORY_ENTITY = "entity";
    private static final String CATEGORY_ORES = "ores";

//    private static final String SUB_CATEGORY_ORES_TIN = "silver";


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

    public static BooleanValue spawnTanzanite;
    public static BooleanValue spawnNetherMoissanite;
    public static BooleanValue spawnNetherRuby;
    public static BooleanValue spawnNetherSapphire;
    public static BooleanValue spawnNetherSilver;
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

    public static ConfigValue<Integer> defaultDurability;
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

//    public static ConfigValue<Integer> overworldTinUpperTop;
//    public static ConfigValue<Integer> overworldSilverUpperTop;
//    public static ConfigValue<Integer> overworldCobaltUpperTop;
//    public static ConfigValue<Integer> overworldTinUpperBottom;
//    public static ConfigValue<Integer> overworldSilverUpperBottom;
//    public static ConfigValue<Integer> overworldCobaltUpperBottom;
//
//    public static ConfigValue<Integer> overworldTinMiddleTop;
//    public static ConfigValue<Integer> overworldSilverMiddleTop;
//    public static ConfigValue<Integer> overworldCobaltMiddleTop;
//    public static ConfigValue<Integer> overworldTinMiddleBottom;
//    public static ConfigValue<Integer> overworldSilverMiddleBottom;
//    public static ConfigValue<Integer> overworldCobaltMiddleBottom;
//
//    public static ConfigValue<Integer> overworldTinSmallTop;
//    public static ConfigValue<Integer> overworldSilverSmallTop;
//    public static ConfigValue<Integer> overworldCobaltSmallTop;
//    public static ConfigValue<Integer> overworldTinSmallBottom;
//    public static ConfigValue<Integer> overworldSilverSmallBottom;
//    public static ConfigValue<Integer> overworldCobaltSmallBottom;
//
//    public static ConfigValue<Integer> overworldTopazSmallTop;
//    public static ConfigValue<Integer> overworldTourmalineSmallTop;
//    public static ConfigValue<Integer> overworldRubySmallTop;
//    public static ConfigValue<Integer> overworldSapphireSmallTop;
//    public static ConfigValue<Integer> overworldTurquoiseSmallTop;
//    public static ConfigValue<Integer> overworldMoissaniteSmallTop;
//    public static ConfigValue<Integer> overworldTopazSmallBottom;
//    public static ConfigValue<Integer> overworldTourmalineSmallBottom;
//    public static ConfigValue<Integer> overworldRubySmallBottom;
//    public static ConfigValue<Integer> overworldSapphireSmallBottom;
//    public static ConfigValue<Integer> overworldTurquoiseSmallBottom;
//    public static ConfigValue<Integer> overworldMoissaniteSmallBottom;
//
//    public static ConfigValue<Integer> overworldTopazLargeTop;
//    public static ConfigValue<Integer> overworldTourmalineLargeTop;
//    public static ConfigValue<Integer> overworldRubyLargeTop;
//    public static ConfigValue<Integer> overworldSapphireLargeTop;
//    public static ConfigValue<Integer> overworldTurquoiseLargeTop;
//    public static ConfigValue<Integer> overworldMoissaniteLargeTop;
//    public static ConfigValue<Integer> overworldTopazLargeBottom;
//    public static ConfigValue<Integer> overworldTourmalineLargeBottom;
//    public static ConfigValue<Integer> overworldRubyLargeBottom;
//    public static ConfigValue<Integer> overworldSapphireLargeBottom;
//    public static ConfigValue<Integer> overworldTurquoiseLargeBottom;
//    public static ConfigValue<Integer> overworldMoissaniteLargeBottom;
//
//    public static ConfigValue<Integer> overworldTopazBuriedTop;
//    public static ConfigValue<Integer> overworldTourmalineBuriedTop;
//    public static ConfigValue<Integer> overworldRubyBuriedTop;
//    public static ConfigValue<Integer> overworldSapphireBuriedTop;
//    public static ConfigValue<Integer> overworldTurquoiseBuriedTop;
//    public static ConfigValue<Integer> overworldMoissaniteBuriedTop;
//    public static ConfigValue<Integer> overworldTopazBuriedBottom;
//    public static ConfigValue<Integer> overworldTourmalineBuriedBottom;
//    public static ConfigValue<Integer> overworldRubyBuriedBottom;
//    public static ConfigValue<Integer> overworldSapphireBuriedBottom;
//    public static ConfigValue<Integer> overworldTurquoiseBuriedBottom;
//    public static ConfigValue<Integer> overworldMoissaniteBuriedBottom;
//
//    public static ConfigValue<Integer> endOnyxTop;
//    public static ConfigValue<Integer> endOnyxBottom;
//
//    public static ConfigValue<Integer> netherSilverTop;
//    public static ConfigValue<Integer> netherTanzaniteTop;
//    public static ConfigValue<Integer> netherMoissaniteTop;
//    public static ConfigValue<Integer> netherSilverBottom;
//    public static ConfigValue<Integer> netherTanzaniteBottom;
//    public static ConfigValue<Integer> netherMoissaniteBottom;

    public static BooleanValue thornsOnShields;

    public static ForgeConfigSpec spec;

    public Config() {
        cfg = CommentedFileConfig
                .builder(new File(FMLPaths.CONFIGDIR.get().toString(), Mores.MODID + "-common.toml")).sync()
                .autosave().build();
        cfg.load();
        oreConfig();
        shieldConfig();
        entityConfig();
        ForgeConfigSpec spec = builder.build();
        Config.spec = spec;
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec, cfg.getFile().getName());
        spec.setConfig(cfg);
    }

    private void oreConfig(){
        builder.comment("The ore configuration for this mod \n\n" +
                "Ores that contain any kind of metal are generated in 3 separate veins;\n" +
                "\tfrequent veins relatively high in the world, referred to as 'upper'\n" +
                "\tmedium veins distributed fairly evenly across the middle layer of the world, referred to as 'middle'\n" +
                "\tsmaller veins that are generated in a very wide radius, referred to as 'small'\n\n" +
                "Ores that contain gemstones are also generated in 3 separate veins; Referred to as 'small', 'large' and 'buried'\n" +
                "Ores that have been generated buried means they will not spawn in contact with air, meaning they are rare.\n" +
                "The values for the vertical anchors correspond to the y value in your Minecraft world.\n" +
                "These values may also be below the world border of y=-64.").push(CATEGORY_ORES).pop();

        spawnTin = getBoolean("spawnTin", CATEGORY_ORES, true, "Should tin spawn in the overworld");
//        overworldTinUpperTop = getInt("overworldTinUpperTop", SUB_CATEGORY_ORES_TIN, 400, "Highest vertical anchor for tin ore generation in the upper layer");
//        overworldTinUpperBottom = getInt("overworldTinUpperBottom", SUB_CATEGORY_ORES_TIN, 90, "Lowest vertical anchor for tin ore generation in the upper layer");
//        overworldTinMiddleTop = getInt("overworldTinMiddleTop", SUB_CATEGORY_ORES_TIN, -10, "Highest vertical anchor for tin ore generation in the middle layer");
//        overworldTinMiddleBottom = getInt("overworldTinMiddleBottom", SUB_CATEGORY_ORES_TIN, 80, "Lowest vertical anchor for tin ore generation in the middle layer");
//        overworldTinSmallTop = getInt("overworldTinSmallTop", SUB_CATEGORY_ORES_TIN, 100, "Highest vertical anchor for tin ore generation in small veins");
//        overworldTinSmallBottom = getInt("overworldTinSmallBottom", SUB_CATEGORY_ORES_TIN, 0, "Lowest vertical anchor for tin ore generation in small veins");

        spawnSilver = getBoolean("spawnSilver", CATEGORY_ORES, true, "Should silver spawn in the overworld");
//        overworldSilverUpperTop = getInt("overworldSilverUpperTop", CATEGORY_ORES, 340, "Highest vertical anchor for silver ore generation in the upper layer");
//        overworldSilverUpperBottom = getInt("overworldSilverUpperBottom", CATEGORY_ORES, 60, "Lowest vertical anchor for silver ore generation in the upper layer");
//        overworldSilverMiddleTop = getInt("overworldSilverMiddleTop", CATEGORY_ORES, 65, "Highest vertical anchor for silver ore generation in the middle layer");
//        overworldSilverMiddleBottom = getInt("overworldSilverMiddleBottom", CATEGORY_ORES, -30, "Lowest vertical anchor for silver ore generation in the middle layer");
//        overworldSilverSmallTop = getInt("overworldSilverSmallTop", CATEGORY_ORES, 80, "Highest vertical anchor for silver ore generation in small veins");
//        overworldSilverSmallBottom = getInt("overworldSilverSmallBottom", CATEGORY_ORES, 0, "Lowest vertical anchor for silver ore generation in small veins");

        spawnCobalt = getBoolean("spawnCobalt", CATEGORY_ORES, true, "Should cobalt spawn in the overworld");
//        overworldCobaltUpperTop = getInt("overworldCobaltUpperTop", CATEGORY_ORES, 320, "Highest vertical anchor for cobalt ore generation in the upper layer");
//        overworldCobaltUpperBottom = getInt("overworldCobaltUpperBottom", CATEGORY_ORES, 85, "Lowest vertical anchor for cobalt ore generation in the upper layer");
//        overworldCobaltMiddleTop = getInt("overworldCobaltMiddleTop", CATEGORY_ORES, 80, "Highest vertical anchor for cobalt ore generation in the middle layer");
//        overworldCobaltMiddleBottom = getInt("overworldCobaltMiddleBottom", CATEGORY_ORES, -30, "Lowest vertical anchor for cobalt ore generation in the middle layer");
//        overworldCobaltSmallTop = getInt("overworldCobaltSmallTop", CATEGORY_ORES, 60, "Highest vertical anchor for cobalt ore generation in small veins");
//        overworldCobaltSmallBottom = getInt("overworldCobaltSmallBottom", CATEGORY_ORES, -40, "Lowest vertical anchor for cobalt ore generation in small veins");

        spawnTourmaline = getBoolean("spawnTourmaline", CATEGORY_ORES, true, "Should tourmaline spawn in the overworld");
//        overworldTourmalineSmallTop = getInt("overworldTourmalineSmallTop", CATEGORY_ORES, 95, "Highest vertical anchor for tourmaline ore generation in the upper layer");
//        overworldTourmalineSmallBottom = getInt("overworldTourmalineSmallBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for tourmaline ore generation in the upper layer");
//        overworldTourmalineLargeTop = getInt("overworldTourmalineLargeTop", CATEGORY_ORES, 95, "Highest vertical anchor for tourmaline ore generation in small veins");
//        overworldTourmalineLargeBottom = getInt("overworldTourmalineLargeBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for tourmaline ore generation in small veins");
//        overworldTourmalineBuriedTop = getInt("overworldTourmalineBuriedTop", CATEGORY_ORES, 95, "Highest vertical anchor for tourmaline ore generation in the middle layer");
//        overworldTourmalineBuriedBottom = getInt("overworldTourmalineBuriedBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for tourmaline ore generation in the middle layer");

        spawnTopaz = getBoolean("spawnTopaz", CATEGORY_ORES, true, "Should topaz spawn in the overworld");
//        overworldTopazSmallTop = getInt("overworldTopazSmallTop", CATEGORY_ORES, 110, "Highest vertical anchor for topaz ore generation in the upper layer");
//        overworldTopazSmallBottom = getInt("overworldTopazSmallBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for topaz ore generation in the upper layer");
//        overworldTopazLargeTop = getInt("overworldTopazLargeTop", CATEGORY_ORES, 110, "Highest vertical anchor for topaz ore generation in small veins");
//        overworldTopazLargeBottom = getInt("overworldTopazLargeBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for topaz ore generation in small veins");
//        overworldTopazBuriedTop = getInt("overworldTopazBuriedTop", CATEGORY_ORES, 110, "Highest vertical anchor for topaz ore generation in the middle layer");
//        overworldTopazBuriedBottom = getInt("overworldTopazBuriedBottom", CATEGORY_ORES, -80, "Lowest vertical anchor for topaz ore generation in the middle layer");

        spawnSapphire = getBoolean("spawnSapphire", CATEGORY_ORES, true, "Should sapphire spawn in the overworld");
//        overworldSapphireSmallTop = getInt("overworldSapphireSmallTop", CATEGORY_ORES, 65, "Highest vertical anchor for sapphire ore generation in the upper layer");
//        overworldSapphireSmallBottom = getInt("overworldSapphireSmallBottom", CATEGORY_ORES, -110, "Lowest vertical anchor for sapphire ore generation in the upper layer");
//        overworldSapphireLargeTop = getInt("overworldSapphireLargeTop", CATEGORY_ORES, 65, "Highest vertical anchor for sapphire ore generation in small veins");
//        overworldSapphireLargeBottom = getInt("overworldSapphireLargeBottom", CATEGORY_ORES, -110, "Lowest vertical anchor for sapphire ore generation in small veins");
//        overworldSapphireBuriedTop = getInt("overworldSapphireBuriedTop", CATEGORY_ORES, 65, "Highest vertical anchor for sapphire ore generation in the middle layer");
//        overworldSapphireBuriedBottom = getInt("overworldSapphireBuriedBottom", CATEGORY_ORES, -110, "Lowest vertical anchor for sapphire ore generation in the middle layer");

        spawnRuby = getBoolean("spawnRuby", CATEGORY_ORES, true, "Should ruby spawn in the overworld");
//        overworldRubySmallTop = getInt("overworldRubySmallTop", CATEGORY_ORES, 70, "Highest vertical anchor for ruby ore generation in the upper layer");
//        overworldRubySmallBottom = getInt("overworldRubySmallBottom", CATEGORY_ORES, -100, "Lowest vertical anchor for ruby ore generation in the upper layer");
//        overworldRubyLargeTop = getInt("overworldRubyLargeTop", CATEGORY_ORES, 70, "Highest vertical anchor for ruby ore generation in small veins");
//        overworldRubyLargeBottom = getInt("overworldRubyLargeBottom", CATEGORY_ORES, -100, "Lowest vertical anchor for ruby ore generation in small veins");
//        overworldRubyBuriedTop = getInt("overworldRubyBuriedTop", CATEGORY_ORES, 70, "Highest vertical anchor for ruby ore generation in the middle layer");
//        overworldRubyBuriedBottom = getInt("overworldRubyBuriedBottom", CATEGORY_ORES, -100, "Lowest vertical anchor for ruby ore generation in the middle layer");

        spawnTurquoise = getBoolean("spawnTurquoise", CATEGORY_ORES, true, "Should turquoise spawn in the overworld");
//        overworldTurquoiseSmallTop = getInt("overworldTurquoiseSmallTop", CATEGORY_ORES, 10, "Highest vertical anchor for turquoise ore generation in the upper layer");
//        overworldTurquoiseSmallBottom = getInt("overworldTurquoiseSmallBottom", CATEGORY_ORES, -60, "Lowest vertical anchor for turquoise ore generation in the upper layer");
//        overworldTurquoiseLargeTop = getInt("overworldTurquoiseLargeTop", CATEGORY_ORES, 10, "Highest vertical anchor for turquoise ore generation in small veins");
//        overworldTurquoiseLargeBottom = getInt("overworldTurquoiseLargeBottom", CATEGORY_ORES, -60, "Lowest vertical anchor for turquoise ore generation in small veins");
//        overworldTurquoiseBuriedTop = getInt("overworldTurquoiseBuriedTop", CATEGORY_ORES, 10, "Highest vertical anchor for turquoise ore generation in the middle layer");
//        overworldTurquoiseBuriedBottom = getInt("overworldTurquoiseBuriedBottom", CATEGORY_ORES, -60, "Lowest vertical anchor for turquoise ore generation in the middle layer");

        spawnMoissanite = getBoolean("spawnMoissanite", CATEGORY_ORES, true, "Should moissanite spawn in the overworld");
//        overworldMoissaniteSmallTop = getInt("overworldMoissaniteSmallTop", CATEGORY_ORES, 40, "Highest vertical anchor for turquoise ore generation in the upper layer");
//        overworldMoissaniteSmallBottom = getInt("overworldMoissaniteSmallBottom", CATEGORY_ORES, -120, "Lowest vertical anchor for turquoise ore generation in the upper layer");
//        overworldMoissaniteLargeTop = getInt("overworldMoissaniteLargeTop", CATEGORY_ORES, 40, "Highest vertical anchor for turquoise ore generation in small veins");
//        overworldMoissaniteLargeBottom = getInt("overworldMoissaniteLargeBottom", CATEGORY_ORES, -120, "Lowest vertical anchor for turquoise ore generation in small veins");
//        overworldMoissaniteBuriedTop = getInt("overworldMoissaniteBuriedTop", CATEGORY_ORES, 40, "Highest vertical anchor for turquoise ore generation in the middle layer");
//        overworldMoissaniteBuriedBottom = getInt("overworldMoissaniteBuriedBottom", CATEGORY_ORES, -120, "Lowest vertical anchor for turquoise ore generation in the middle layer");

        spawnNetherMoissanite = getBoolean("spawnNetherMoissanite", CATEGORY_ORES, true, "Should moissanite spawn in the nether");
//        netherMoissaniteTop = getInt("netherMoissaniteTop", CATEGORY_ORES, 256, "Highest vertical anchor for nether moissanite ore generation");
//        netherMoissaniteBottom = getInt("netherMoissaniteBottom", CATEGORY_ORES, -64, "Lowest vertical anchor for nether moissanite ore generation");

        spawnTanzanite = getBoolean("spawnTanzanite", CATEGORY_ORES, true, "Should tanzanite spawn in the nether");
//        netherTanzaniteTop = getInt("netherTanzaniteTop", CATEGORY_ORES, 256, "Highest vertical anchor for nether tanzanite ore generation");
//        netherTanzaniteBottom = getInt("netherTanzaniteBottom", CATEGORY_ORES, -64, "Lowest vertical anchor for nether tanzanite ore generation");

        spawnNetherSilver = getBoolean("spawnNetherSilver", CATEGORY_ORES, true, "Should silver spawn in the nether");
//        netherSilverTop = getInt("netherSilverTop", CATEGORY_ORES, 256, "Highest vertical anchor for nether silver ore generation");
//        netherSilverBottom = getInt("netherSilverBottom", CATEGORY_ORES, -64, "Lowest vertical anchor for nether silver ore generation");

        spawnEndOnyx = getBoolean("spawnEndOnyx", CATEGORY_ORES, true, "Should onyx spawn in the end");
//        endOnyxTop = getInt("endOnyxTop", CATEGORY_ORES, 256, "Highest vertical anchor for onyx ore generation");
//        endOnyxBottom = getInt("endOnyxBottom", CATEGORY_ORES, -64, "Lowest vertical anchor for onyx ore generation");

        spawnNetherSapphire = getBoolean("spawnNetherSapphire", CATEGORY_ORES, false, "Should sapphire spawn in the nether (coming soon)");
        spawnNetherRuby = getBoolean("spawnNetherRuby", CATEGORY_ORES, false, "Should ruby spawn in the nether (coming soon)");
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

        defaultDurability = getInt("copperDurability", CATEGORY_SHIELD, 336, "The durability of the default Shield.");
        copperDurability = getInt("copperDurability", CATEGORY_SHIELD, 112, "The durability of the Copper Shield.");
        tinDurability = getInt("tinDurability", CATEGORY_SHIELD, 84, "The durability of the Tin Shield.");
        silverDurability = getInt("silverDurability", CATEGORY_SHIELD, 134, "The durability of the Silver Shield.");
        bronzeDurability = getInt("bronzeDurability", CATEGORY_SHIELD, 299, "The durability of the Bronze Shield.");
        cobaltDurability = getInt("cobaltDurability", CATEGORY_SHIELD, 388, "The durability of the Cobalt Shield.");
        obsidianDurability = getInt("obsidianDurability", CATEGORY_SHIELD, 821, "The durability of the Obsidian Shield.");
        sterlingDurability = getInt("sterlingDurability", CATEGORY_SHIELD, 333, "The durability of the Sterling Silver Shield.");
        steelDurability = getInt("steelDurability", CATEGORY_SHIELD, 555, "The durability of the Steel Shield.");
        amethystDurability = getInt("amethystDurability", CATEGORY_SHIELD, 420, "The durability of the Amethyst Shield.");
        emeraldDurability = getInt("emeraldDurability", CATEGORY_SHIELD, 500, "The durability of the Emerald Shield.");
        topazDurability = getInt("topazDurability", CATEGORY_SHIELD, 632, "The durability of the Topaz Shield.");
        tourmalineDurability = getInt("tourmalineDurability", CATEGORY_SHIELD, 621, "The durability of the Tourmaline Shield.");
        tanzaniteDurability = getInt("tanzaniteDurability", CATEGORY_SHIELD, 784, "The durability of the Tanzanite Shield.");
        rubyDurability = getInt("rubyDurability", CATEGORY_SHIELD, 809, "The durability of the Ruby Shield.");
        sapphireDurability = getInt("sapphireDurability", CATEGORY_SHIELD, 711, "The durability of the Sapphire Shield.");
        turquoiseDurability = getInt("turquoiseDurability", CATEGORY_SHIELD, 1000, "The durability of the Turquoise Shield.");
        moissaniteDurability = getInt("moissaniteDurability", CATEGORY_SHIELD, 913, "The durability of the Moissanite Shield.");
        onyxDurability = getInt("onyxDurability", CATEGORY_SHIELD, 1111, "The durability of the Onyx Shield.");
        grapheneDurability = getInt("grapheneDurability", CATEGORY_SHIELD, 1333, "The durability of the Graphene Shield.");
//        diamondDurability = getInt("diamondDurability", CATEGORY_SHIELD, 4600,
//                "The durability of the Diamond Shield.");
//        netheriteDurability = getInt("netheriteDurability", CATEGORY_SHIELD, 6300,
//                "The durability of the Netherite Shield.");
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