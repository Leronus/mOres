//package mod.leronus.mores.world.feature;
//
//import com.google.common.base.Suppliers;
//import mod.leronus.mores.Mores;
//import mod.leronus.mores.block.ModBlocks;
//import net.minecraft.core.Registry;
//import net.minecraft.data.worldgen.features.OreFeatures;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
//import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.RegistryObject;
//
//import java.util.List;
//import java.util.function.Supplier;
//
//public class ModConfiguredFeatures {
//    public static final RuleTest END_STONE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);
//
//    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
//            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Mores.MODID);
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COBALT_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TOPAZ_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TOURMALINE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOURMALINE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOURMALINE_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RUBY_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MOISSANITE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOISSANITE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MOISSANITE_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TURQUOISE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TURQUOISE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TURQUOISE_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ANTHRACITE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ANTHRACITE_ORE.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ANTHRACITE_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SILVER_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState())));
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_TANZANITE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_TANZANITE_ORE.get().defaultBlockState())
//            /*,OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_TANZANITE_ORE.get().defaultBlockState())*/));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RUBY_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MOISSANITE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_MOISSANITE_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_ANTHRACITE_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ANTHRACITE_ORE.get().defaultBlockState())));
//
//    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_ONYX_ORES = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(END_STONE_REPLACEABLES, ModBlocks.ONYX_ORE.get().defaultBlockState())));
//
//    /* -------------------------------------------------------------------------------------------------------------------------------------------------------- */
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(), 10))); /* pSize not below 2/3 */
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE_SMALL = CONFIGURED_FEATURES.register("tin_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(), 4))); /* pSize not below 2/3 */
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> COBALT_ORE = CONFIGURED_FEATURES.register("cobalt_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(), 8, 0.8F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> COBALT_ORE_SMALL = CONFIGURED_FEATURES.register("cobalt_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES.get(), 4, 0.5F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 8)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE_SMALL = CONFIGURED_FEATURES.register("silver_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 4)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE = CONFIGURED_FEATURES.register("nether_silver_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_SILVER_ORES.get(), 9)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_ORE_SMALL = CONFIGURED_FEATURES.register("topaz_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(), 4, 0.2F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_ORE_LARGE = CONFIGURED_FEATURES.register("topaz_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(), 12, 0.6F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_ORE_BURIED = CONFIGURED_FEATURES.register("topaz_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOPAZ_ORES.get(), 8, 0.8F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOURMALINE_ORE_SMALL = CONFIGURED_FEATURES.register("tourmaline_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(), 4, 0.1F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOURMALINE_ORE_LARGE = CONFIGURED_FEATURES.register("tourmaline_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(), 12, 0.8F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TOURMALINE_ORE_BURIED = CONFIGURED_FEATURES.register("tourmaline_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TOURMALINE_ORES.get(), 8, 0.6F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_TANZANITE_ORE = CONFIGURED_FEATURES.register("nether_tanzanite_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_TANZANITE_ORES.get(), 9, 0.5F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_SMALL = CONFIGURED_FEATURES.register("sapphire_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(), 4, 0.5F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_LARGE = CONFIGURED_FEATURES.register("sapphire_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(), 12, 0.7F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_BURIED = CONFIGURED_FEATURES.register("sapphire_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES.get(), 8, 1.0F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE = CONFIGURED_FEATURES.register("nether_sapphire_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_SAPPHIRE_ORES.get(), 4)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE_SMALL = CONFIGURED_FEATURES.register("ruby_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 4, 0.5F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE_LARGE = CONFIGURED_FEATURES.register("ruby_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 12, 0.7F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE_BURIED = CONFIGURED_FEATURES.register("ruby_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES.get(), 8, 1.0F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE = CONFIGURED_FEATURES.register("nether_ruby_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_RUBY_ORES.get(), 5)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TURQUOISE_ORE_SMALL = CONFIGURED_FEATURES.register("turquoise_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(), 4, 0.5F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TURQUOISE_ORE_LARGE = CONFIGURED_FEATURES.register("turquoise_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(), 12, 0.7F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> TURQUOISE_ORE_BURIED = CONFIGURED_FEATURES.register("turquoise_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TURQUOISE_ORES.get(), 8, 1.0F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> ONYX_ORE = CONFIGURED_FEATURES.register("onyx_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ONYX_ORES.get(), 6)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> MOISSANITE_ORE_SMALL = CONFIGURED_FEATURES.register("moissanite_ore_small",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(), 4, 0.5F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> MOISSANITE_ORE_LARGE = CONFIGURED_FEATURES.register("moissanite_ore_large",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(), 10, 0.7F)));
//    public static final RegistryObject<ConfiguredFeature<?, ?>> MOISSANITE_ORE_BURIED = CONFIGURED_FEATURES.register("moissanite_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MOISSANITE_ORES.get(), 6, 1.0F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_MOISSANITE_ORE = CONFIGURED_FEATURES.register("nether_moissanite_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_MOISSANITE_ORES.get(), 4)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> ANTHRACITE_ORE_UPPER = CONFIGURED_FEATURES.register("anthracite_ore_upper",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ANTHRACITE_ORES.get(), 12)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> ANTHRACITE_ORE_BURIED = CONFIGURED_FEATURES.register("anthracite_ore_buried",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ANTHRACITE_ORES.get(), 7, 0.3F)));
//
//    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_ANTHRACITE_ORE = CONFIGURED_FEATURES.register("nether_anthracite_ore",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ANTHRACITE_ORES.get(), 12)));
//
//    public static void register(IEventBus eventBus) {
//        CONFIGURED_FEATURES.register(eventBus);
//    }
//}
