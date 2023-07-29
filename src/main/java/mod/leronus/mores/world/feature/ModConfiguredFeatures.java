package mod.leronus.mores.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import mod.leronus.mores.Mores;
import mod.leronus.mores.block.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ANTHRACITE_ORE_KEY = registerKey("overworld_anthracite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ANTHRACITE_ORE_KEY = registerKey("nether_anthracite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_UPPER_ORE_KEY = registerKey("tin_upper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_MIDDLE_ORE_KEY = registerKey("tin_middle_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_SMALL_ORE_KEY = registerKey("tin_small_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_UPPER_ORE_KEY = registerKey("silver_upper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_MIDDLE_ORE_KEY = registerKey("silver_middle_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_SMALL_ORE_KEY = registerKey("silver_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_UPPER_ORE_KEY = registerKey("cobalt_upper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_MIDDLE_ORE_KEY = registerKey("cobalt_middle_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_SMALL_ORE_KEY = registerKey("cobalt_small_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_SMALL_ORE_KEY = registerKey("topaz_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_LARGE_ORE_KEY = registerKey("topaz_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_BURIED_ORE_KEY = registerKey("topaz_buried_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TOURMALINE_SMALL_ORE_KEY = registerKey("tourmaline_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOURMALINE_LARGE_ORE_KEY = registerKey("tourmaline_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOURMALINE_BURIED_ORE_KEY = registerKey("tourmaline_buried_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_SMALL_ORE_KEY = registerKey("ruby_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_LARGE_ORE_KEY = registerKey("ruby_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_BURIED_ORE_KEY = registerKey("ruby_buried_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_SMALL_ORE_KEY = registerKey("sapphire_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_LARGE_ORE_KEY = registerKey("sapphire_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_BURIED_ORE_KEY = registerKey("sapphire_buried_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MOISSANITE_SMALL_ORE_KEY = registerKey("moissanite_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOISSANITE_LARGE_ORE_KEY = registerKey("moissanite_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOISSANITE_BURIED_ORE_KEY = registerKey("moissanite_buried_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MOISSANITE_ORE_KEY = registerKey("nether_moissanite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TANZANITE_ORE_KEY = registerKey("nether_tanzanite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TURQUOISE_SMALL_ORE_KEY = registerKey("turquoise_small_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TURQUOISE_LARGE_ORE_KEY = registerKey("turquoise_large_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TURQUOISE_BURIED_ORE_KEY = registerKey("turquoise_buried_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ONYX_ORE_KEY = registerKey("end_onyx_ore");



    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COBALT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TOPAZ_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TOURMALINE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TOURMALINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_TOURMALINE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MOISSANITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.MOISSANITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_MOISSANITE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TURQUOISE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.TURQUOISE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_TURQUOISE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ANTHRACITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.ANTHRACITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_ANTHRACITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_TANZANITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_TANZANITE_ORE.get().defaultBlockState())
            /*,OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), BlockInit.DEEPSLATE_TANZANITE_ORE.get().defaultBlockState())*/));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MOISSANITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_MOISSANITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ANTHRACITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), ModBlocks.NETHER_ANTHRACITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ONYX_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ONYX_ORE.get().defaultBlockState())));

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------- */

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, OVERWORLD_ANTHRACITE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_ANTHRACITE_ORES.get(),6, 0.3F));
        register(context, NETHER_ANTHRACITE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_ANTHRACITE_ORES.get(),13, 0.65F));

        register(context, TIN_UPPER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(),10));
        register(context, TIN_MIDDLE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(),8));
        register(context, TIN_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(),4));

        register(context, COBALT_UPPER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(),8, 0.8F));
        register(context, COBALT_MIDDLE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(),8, 0.8F));
        register(context, COBALT_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(),4, 0.5F));

        register(context, SILVER_UPPER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),8));
        register(context, SILVER_MIDDLE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),8));
        register(context, SILVER_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),4));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_SILVER_ORES.get(),9));

        register(context, TOPAZ_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(),4, 0.2F));
        register(context, TOPAZ_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(),12, 0.6F));
        register(context, TOPAZ_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(),8, 0.8F));

        register(context, TOURMALINE_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(),4, 0.1F));
        register(context, TOURMALINE_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(),12, 0.8F));
        register(context, TOURMALINE_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(),8, 0.6F));

        register(context, NETHER_TANZANITE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_TANZANITE_ORES.get(),9, 0.5F));

        register(context, RUBY_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(),4, 0.5F));
        register(context, RUBY_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(),12, 0.7F));
        register(context, RUBY_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(),8, 1.0F));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_RUBY_ORES.get(),6, 0.8F));

        register(context, SAPPHIRE_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(),4, 0.5F));
        register(context, SAPPHIRE_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(),12, 0.7F));
        register(context, SAPPHIRE_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(),8, 1.0F));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_SAPPHIRE_ORES.get(),5, 0.7F));

        register(context, TURQUOISE_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(),4, 0.5F));
        register(context, TURQUOISE_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(),12, 0.7F));
        register(context, TURQUOISE_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(),8, 1.0F));

        register(context, END_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(END_ONYX_ORES.get(),6));

        register(context, MOISSANITE_SMALL_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(),4, 0.5F));
        register(context, MOISSANITE_LARGE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(),10, 0.7F));
        register(context, MOISSANITE_BURIED_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(),6, 1.0F));
        register(context, NETHER_MOISSANITE_ORE_KEY, Feature.ORE, new OreConfiguration(NETHER_MOISSANITE_ORES.get(),4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Mores.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
