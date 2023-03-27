package mod.leronus.mores.config;

import mod.leronus.mores.Mores;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.config.ModConfig;

public class MoresConfig {
    public static boolean spawnDuck = true;

    public static boolean spawnTin = true;
    public static boolean spawnCobalt = true;
    public static boolean spawnSilver = true;
    public static boolean spawnTourmaline = true;
    public static boolean spawnTopaz = true;
    public static boolean spawnMoissanite = true;
    public static boolean spawnRuby = true;
    public static boolean spawnSapphire = true;
    public static boolean spawnTurquoise = true;
    public static boolean spawnAnthracite = true;

    public static boolean spawnTanzanite = true;
    public static boolean spawnNetherMoissanite = true;
    public static boolean spawnNetherRuby = true;
    public static boolean spawnNetherSapphire = true;
    public static boolean spawnNetherSilver = true;
    public static boolean spawnNetherAnthracite = true;
    public static boolean spawnEndOnyx = true;

//    public static boolean customShieldMaxReduction = true;
//    public static int defaultDamageReduction = 60;

    public static boolean enableCustomDeathSounds = true;
    public static boolean enableCustomPlayerSleepingSound = false;
    public static boolean enableCustomPlayerHurtSound = false;

//    public static int tinDamageReduction = 60;
//    public static int copperDamageReduction = 60;
//    public static int silverDamageReduction = 65;
//    public static int bronzeDamageReduction = 70;
//    public static int cobaltDamageReduction = 70;
//    public static int sterlingDamageReduction = 70;
//    public static int steelDamageReduction = 75;
//    public static int amethystDamageReduction = 75;
//    public static int emeraldDamageReduction = 80;
//    public static int topazDamageReduction = 80;
//    public static int tourmalineDamageReduction = 80;
//    public static int tanzaniteDamageReduction = 90;
//    public static int rubyDamageReduction = 90;
//    public static int sapphireDamageReduction = 90;
//    public static int moissaniteDamageReduction = 90;
//    public static int obsidianDamageReduction = 100;
//    public static int turquoiseDamageReduction = 100;
//    public static int onyxDamageReduction = 100;
//    public static int grapheneDamageReduction = 100;

    public static int tinDurability = 200;
    public static int copperDurability = 240;
    public static int silverDurability = 350;
    public static int bronzeDurability = 385;
    public static int cobaltDurability = 500;
    public static int obsidianDurability = 1200;
    public static int sterlingDurability = 600;
    public static int steelDurability = 690;
    public static int amethystDurability = 550;
    public static int emeraldDurability = 550;
    public static int topazDurability = 680;
    public static int tourmalineDurability = 700;
    public static int tanzaniteDurability = 720;
    public static int rubyDurability = 800;
    public static int sapphireDurability = 825;
    public static int turquoiseDurability = 1000;
    public static int moissaniteDurability = 850;
    public static int onyxDurability = 1500;
    public static int grapheneDurability = 2000;

    public static int overworldTinUpperTop = 210;
    public static int overworldTinUpperBottom = 85;
    public static int overworldTinMiddleTop = 85;
    public static int overworldTinMiddleBottom = 40;
    public static int overworldTinSmallTop = -40;

    public static int overworldSilverUpperTop = 190;
    public static int overworldSilverUpperBottom = 90;
    public static int overworldSilverMiddleTop = 90;
    public static int overworldSilverMiddleBottom = 60;
    public static int overworldSilverSmallTop = 0;

    public static int overworldCobaltUpperTop = 120;
    public static int overworldCobaltUpperBottom = 100;
    public static int overworldCobaltMiddleTop = 100;
    public static int overworldCobaltMiddleBottom = 60;
    public static int overworldCobaltSmallTop = -10;

    public static int overworldTopazLargeTop = 110;
    public static int overworldTopazLargeBottom = -80;
    public static int overworldTopazSmallTop = 110;
    public static int overworldTopazSmallBottom = -80;
    public static int overworldTopazBuriedTop = 110;
    public static int overworldTopazBuriedBottom = -80;

    public static int overworldTourmalineLargeTop = 95;
    public static int overworldTourmalineLargeBottom = -80;
    public static int overworldTourmalineSmallTop = 95;
    public static int overworldTourmalineSmallBottom = -80;
    public static int overworldTourmalineBuriedTop = 95;
    public static int overworldTourmalineBuriedBottom = -80;

    public static int overworldRubyLargeTop = 65;
    public static int overworldRubyLargeBottom = -110;
    public static int overworldRubySmallTop = 65;
    public static int overworldRubySmallBottom = -110;
    public static int overworldRubyBuriedTop = 65;
    public static int overworldRubyBuriedBottom = -110;

    public static int overworldSapphireLargeTop = 70;
    public static int overworldSapphireLargeBottom = -100;
    public static int overworldSapphireSmallTop = 70;
    public static int overworldSapphireSmallBottom = -100;
    public static int overworldSapphireBuriedTop = 70;
    public static int overworldSapphireBuriedBottom = -100;

    public static int overworldTurquoiseLargeTop = 20;
    public static int overworldTurquoiseLargeBottom = -60;
    public static int overworldTurquoiseSmallTop = 20;
    public static int overworldTurquoiseSmallBottom = -60;
    public static int overworldTurquoiseBuriedTop = 20;
    public static int overworldTurquoiseBuriedBottom = -60;

    public static int overworldMoissaniteLargeTop = 40;
    public static int overworldMoissaniteLargeBottom = -120;
    public static int overworldMoissaniteSmallTop = 40;
    public static int overworldMoissaniteSmallBottom = -120;
    public static int overworldMoissaniteBuriedTop = 40;
    public static int overworldMoissaniteBuriedBottom = -120;

    public static int overworldAnthraciteUpperBottom = -64;
    public static int overworldAnthraciteLowerTop = 192;
    public static int overworldAnthraciteLowerBottom = -64;
    public static int endOnyxTop = 256;
    public static int endOnyxBottom = -64;
    public static int netherSilverTop = 256;
    public static int netherSilverBottom = -64;
    public static int netherTanzaniteTop = 256;
    public static int netherTanzaniteBottom = -64;
    public static int netherRubyTop = 256;
    public static int netherRubyBottom = -64;
    public static int netherSapphireTop = 256;
    public static int netherSapphireBottom = -64;
    public static int netherMoissaniteTop = 256;
    public static int netherMoissaniteBottom = -64;
    public static int netherAnthraciteTop = 256;
    public static int netherAnthraciteBottom = -64;

//    public static boolean thornsOnShields = true;
//    public static boolean enableDamageReduction = true;


    public static void bake(ModConfig config) {
        try {
            spawnDuck = ConfigHolder.COMMON.spawnDuck.get();

//            spawnTin = ConfigHolder.COMMON.spawnTin.get();
//            spawnCobalt = ConfigHolder.COMMON.spawnCobalt.get();
//            spawnSilver = ConfigHolder.COMMON.spawnSilver.get();
//            spawnTourmaline = ConfigHolder.COMMON.spawnTourmaline.get();
//            spawnTopaz = ConfigHolder.COMMON.spawnTopaz.get();
//            spawnMoissanite = ConfigHolder.COMMON.spawnMoissanite.get();
//            spawnRuby = ConfigHolder.COMMON.spawnRuby.get();
//            spawnSapphire = ConfigHolder.COMMON.spawnSapphire.get();
//            spawnTurquoise = ConfigHolder.COMMON.spawnTurquoise.get();
//            spawnAnthracite = ConfigHolder.COMMON.spawnAnthracite.get();
//            spawnTanzanite = ConfigHolder.COMMON.spawnTanzanite.get();
//            spawnNetherMoissanite = ConfigHolder.COMMON.spawnNetherMoissanite.get();
//            spawnNetherRuby = ConfigHolder.COMMON.spawnNetherRuby.get();
//            spawnNetherSapphire = ConfigHolder.COMMON.spawnNetherSapphire.get();
//            spawnNetherSilver = ConfigHolder.COMMON.spawnNetherSilver.get();
//            spawnNetherAnthracite = ConfigHolder.COMMON.spawnNetherAnthracite.get();
//            spawnEndOnyx = ConfigHolder.COMMON.spawnEndOnyx.get();


//            customShieldMaxReduction = ConfigHolder.COMMON.customShieldMaxReduction.get();
//            defaultDamageReduction = ConfigHolder.COMMON.defaultDamageReduction.get();

//            tinDamageReduction = ConfigHolder.COMMON.tinDamageReduction.get();
//            copperDamageReduction = ConfigHolder.COMMON.copperDamageReduction.get();
//            silverDamageReduction = ConfigHolder.COMMON.silverDamageReduction.get();
//            bronzeDamageReduction = ConfigHolder.COMMON.bronzeDamageReduction.get();
//            cobaltDamageReduction = ConfigHolder.COMMON.cobaltDamageReduction.get();
//            sterlingDamageReduction = ConfigHolder.COMMON.sterlingDamageReduction.get();
//            steelDamageReduction = ConfigHolder.COMMON.steelDamageReduction.get();
//            amethystDamageReduction = ConfigHolder.COMMON.amethystDamageReduction.get();
//            emeraldDamageReduction = ConfigHolder.COMMON.emeraldDamageReduction.get();
//            topazDamageReduction = ConfigHolder.COMMON.topazDamageReduction.get();
//            tourmalineDamageReduction = ConfigHolder.COMMON.tourmalineDamageReduction.get();
//            tanzaniteDamageReduction = ConfigHolder.COMMON.tanzaniteDamageReduction.get();
//            rubyDamageReduction = ConfigHolder.COMMON.rubyDamageReduction.get();
//            sapphireDamageReduction = ConfigHolder.COMMON.sapphireDamageReduction.get();
//            moissaniteDamageReduction = ConfigHolder.COMMON.moissaniteDamageReduction.get();
//            obsidianDamageReduction = ConfigHolder.COMMON.obsidianDamageReduction.get();
//            turquoiseDamageReduction = ConfigHolder.COMMON.turquoiseDamageReduction.get();
//            onyxDamageReduction = ConfigHolder.COMMON.onyxDamageReduction.get();
//            grapheneDamageReduction = ConfigHolder.COMMON.grapheneDamageReduction.get();
            tinDurability = ConfigHolder.COMMON.tinDurability.get();
            copperDurability = ConfigHolder.COMMON.copperDurability.get();
            silverDurability = ConfigHolder.COMMON.silverDurability.get();
            bronzeDurability = ConfigHolder.COMMON.bronzeDurability.get();
            cobaltDurability = ConfigHolder.COMMON.cobaltDurability.get();
            obsidianDurability = ConfigHolder.COMMON.obsidianDurability.get();
            sterlingDurability = ConfigHolder.COMMON.sterlingDurability.get();
            steelDurability = ConfigHolder.COMMON.steelDurability.get();
            amethystDurability = ConfigHolder.COMMON.amethystDurability.get();
            emeraldDurability = ConfigHolder.COMMON.emeraldDurability.get();
            topazDurability = ConfigHolder.COMMON.topazDurability.get();
            tourmalineDurability = ConfigHolder.COMMON.tourmalineDurability.get();
            tanzaniteDurability = ConfigHolder.COMMON.tanzaniteDurability.get();
            rubyDurability = ConfigHolder.COMMON.rubyDurability.get();
            sapphireDurability = ConfigHolder.COMMON.sapphireDurability.get();
            turquoiseDurability = ConfigHolder.COMMON.turquoiseDurability.get();
            moissaniteDurability = ConfigHolder.COMMON.moissaniteDurability.get();
            onyxDurability = ConfigHolder.COMMON.onyxDurability.get();
            grapheneDurability = ConfigHolder.COMMON.grapheneDurability.get();
            overworldTinUpperTop = ConfigHolder.COMMON.overworldTinUpperTop.get();
            overworldTinUpperBottom = ConfigHolder.COMMON.overworldTinUpperBottom.get();
            overworldTinMiddleTop = ConfigHolder.COMMON.overworldTinMiddleTop.get();
            overworldTinMiddleBottom = ConfigHolder.COMMON.overworldTinMiddleBottom.get();
            overworldTinSmallTop = ConfigHolder.COMMON.overworldTinSmallTop.get();
            overworldSilverUpperTop = ConfigHolder.COMMON.overworldSilverUpperTop.get();
            overworldSilverUpperBottom = ConfigHolder.COMMON.overworldSilverUpperBottom.get();
            overworldSilverMiddleTop = ConfigHolder.COMMON.overworldSilverMiddleTop.get();
            overworldSilverMiddleBottom = ConfigHolder.COMMON.overworldSilverMiddleBottom.get();
            overworldSilverSmallTop = ConfigHolder.COMMON.overworldSilverSmallTop.get();
            overworldCobaltUpperTop = ConfigHolder.COMMON.overworldCobaltUpperTop.get();
            overworldCobaltUpperBottom = ConfigHolder.COMMON.overworldCobaltUpperBottom.get();
            overworldCobaltMiddleTop = ConfigHolder.COMMON.overworldCobaltMiddleTop.get();
            overworldCobaltMiddleBottom = ConfigHolder.COMMON.overworldCobaltMiddleBottom.get();
            overworldCobaltSmallTop = ConfigHolder.COMMON.overworldCobaltSmallTop.get();
            overworldTopazLargeTop = ConfigHolder.COMMON.overworldTopazLargeTop.get();
            overworldTopazLargeBottom = ConfigHolder.COMMON.overworldTopazLargeBottom.get();
            overworldTopazSmallTop = ConfigHolder.COMMON.overworldTopazSmallTop.get();
            overworldTopazSmallBottom = ConfigHolder.COMMON.overworldTopazSmallBottom.get();
            overworldTopazBuriedTop = ConfigHolder.COMMON.overworldTopazBuriedTop.get();
            overworldTopazBuriedBottom = ConfigHolder.COMMON.overworldTopazBuriedBottom.get();
            overworldTourmalineLargeTop = ConfigHolder.COMMON.overworldTourmalineLargeTop.get();
            overworldTourmalineLargeBottom = ConfigHolder.COMMON.overworldTourmalineLargeBottom.get();
            overworldTourmalineSmallTop = ConfigHolder.COMMON.overworldTourmalineSmallTop.get();
            overworldTourmalineSmallBottom = ConfigHolder.COMMON.overworldTourmalineSmallBottom.get();
            overworldTourmalineBuriedTop = ConfigHolder.COMMON.overworldTourmalineBuriedTop.get();
            overworldTourmalineBuriedBottom = ConfigHolder.COMMON.overworldTourmalineBuriedBottom.get();
            overworldRubyLargeTop = ConfigHolder.COMMON.overworldRubyLargeTop.get();
            overworldRubyLargeBottom = ConfigHolder.COMMON.overworldRubyLargeBottom.get();
            overworldRubySmallTop = ConfigHolder.COMMON.overworldRubySmallTop.get();
            overworldRubySmallBottom = ConfigHolder.COMMON.overworldRubySmallBottom.get();
            overworldRubyBuriedTop = ConfigHolder.COMMON.overworldRubyBuriedTop.get();
            overworldRubyBuriedBottom = ConfigHolder.COMMON.overworldRubyBuriedBottom.get();
            overworldSapphireLargeTop = ConfigHolder.COMMON.overworldSapphireLargeTop.get();
            overworldSapphireLargeBottom = ConfigHolder.COMMON.overworldSapphireLargeBottom.get();
            overworldSapphireSmallTop = ConfigHolder.COMMON.overworldSapphireSmallTop.get();
            overworldSapphireSmallBottom = ConfigHolder.COMMON.overworldSapphireSmallBottom.get();
            overworldSapphireBuriedTop = ConfigHolder.COMMON.overworldSapphireBuriedTop.get();
            overworldSapphireBuriedBottom = ConfigHolder.COMMON.overworldSapphireBuriedBottom.get();
            overworldTurquoiseLargeTop = ConfigHolder.COMMON.overworldTurquoiseLargeTop.get();
            overworldTurquoiseLargeBottom = ConfigHolder.COMMON.overworldTurquoiseLargeBottom.get();
            overworldTurquoiseSmallTop = ConfigHolder.COMMON.overworldTurquoiseSmallTop.get();
            overworldTurquoiseSmallBottom = ConfigHolder.COMMON.overworldTurquoiseSmallBottom.get();
            overworldTurquoiseBuriedTop = ConfigHolder.COMMON.overworldTurquoiseBuriedTop.get();
            overworldTurquoiseBuriedBottom = ConfigHolder.COMMON.overworldTurquoiseBuriedBottom.get();
            overworldMoissaniteLargeTop = ConfigHolder.COMMON.overworldMoissaniteLargeTop.get();
            overworldMoissaniteLargeBottom = ConfigHolder.COMMON.overworldMoissaniteLargeBottom.get();
            overworldMoissaniteSmallTop = ConfigHolder.COMMON.overworldMoissaniteSmallTop.get();
            overworldMoissaniteSmallBottom = ConfigHolder.COMMON.overworldMoissaniteSmallBottom.get();
            overworldMoissaniteBuriedTop = ConfigHolder.COMMON.overworldMoissaniteBuriedTop.get();
            overworldMoissaniteBuriedBottom = ConfigHolder.COMMON.overworldMoissaniteBuriedBottom.get();
            overworldAnthraciteUpperBottom = ConfigHolder.COMMON.anthraciteUpperBottom.get();
            overworldAnthraciteLowerTop = ConfigHolder.COMMON.anthraciteLowerTop.get();
            overworldAnthraciteLowerBottom = ConfigHolder.COMMON.anthraciteLowerBottom.get();
            endOnyxTop = ConfigHolder.COMMON.endOnyxTop.get();
            endOnyxBottom = ConfigHolder.COMMON.endOnyxBottom.get();
            netherSilverTop = ConfigHolder.COMMON.netherSilverTop.get();
            netherSilverBottom = ConfigHolder.COMMON.netherSilverBottom.get();
            netherTanzaniteTop = ConfigHolder.COMMON.netherTanzaniteTop.get();
            netherTanzaniteBottom = ConfigHolder.COMMON.netherTanzaniteBottom.get();
            netherRubyTop = ConfigHolder.COMMON.netherRubyTop.get();
            netherRubyBottom = ConfigHolder.COMMON.netherRubyBottom.get();
            netherSapphireTop = ConfigHolder.COMMON.netherSapphireTop.get();
            netherSapphireBottom = ConfigHolder.COMMON.netherSapphireBottom.get();
            netherMoissaniteTop = ConfigHolder.COMMON.netherMoissaniteTop.get();
            netherMoissaniteBottom = ConfigHolder.COMMON.netherMoissaniteBottom.get();
            netherAnthraciteTop = ConfigHolder.COMMON.netherAnthraciteTop.get();
            netherAnthraciteBottom = ConfigHolder.COMMON.netherAnthraciteBottom.get();
//            thornsOnShields = ConfigHolder.COMMON.thornsOnShields.get();
//            enableDamageReduction = ConfigHolder.COMMON.enableDamageReduction.get();
            enableCustomDeathSounds = ConfigHolder.COMMON.enableCustomDeathSounds.get();
            enableCustomPlayerSleepingSound = ConfigHolder.COMMON.enableCustomPlayerSleepingSound.get();
            enableCustomPlayerHurtSound = ConfigHolder.COMMON.enableCustomPlayerHurtSound.get();
        } catch (Exception e) {
            Mores.LOGGER.warn("An exception was caused trying to load the config for mOres.");
            e.printStackTrace();
        }
    }
}