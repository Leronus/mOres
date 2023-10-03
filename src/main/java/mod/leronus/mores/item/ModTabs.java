package mod.leronus.mores.item;

import mod.leronus.mores.Mores;
import mod.leronus.mores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * Class that adds custom item group tabs for the items and blocks added by mOres
 * @author Leronus
 */
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mores.MODID);

    public static final RegistryObject<CreativeModeTab> MORES_MATERIALS = CREATIVE_MODE_TABS.register("mores_materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY_GEM.get()))
                    .title(Component.translatable("creativemodetab.mores_materials"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.ANTHRACITE.get());
                        event.accept(ModItems.RAW_TIN.get());
                        event.accept(ModItems.RAW_SILVER.get());
                        event.accept(ModItems.RAW_COBALT.get());
                        event.accept(ModItems.TIN_NUGGET.get());
                        event.accept(ModItems.BRONZE_NUGGET.get());
                        event.accept(ModItems.SILVER_NUGGET.get());
                        event.accept(ModItems.COBALT_NUGGET.get());
                        event.accept(ModItems.STERLING_NUGGET.get());
                        event.accept(ModItems.STEEL_NUGGET.get());
                        event.accept(ModItems.TIN_INGOT.get());
                        event.accept(ModItems.BRONZE_INGOT.get());
                        event.accept(ModItems.SILVER_INGOT.get());
                        event.accept(ModItems.COBALT_INGOT.get());
                        event.accept(ModItems.STERLING_INGOT.get());
                        event.accept(ModItems.STEEL_INGOT.get());
                        event.accept(ModItems.OBSIDIAN_INGOT.get());

                        event.accept(ModItems.TOPAZ_GEM.get());
                        event.accept(ModItems.TOURMALINE_GEM.get());
                        event.accept(ModItems.TANZANITE_GEM.get());
                        event.accept(ModItems.RUBY_GEM.get());
                        event.accept(ModItems.SAPPHIRE_GEM.get());
                        event.accept(ModItems.MOISSANITE_GEM.get());
                        event.accept(ModItems.TURQUOISE_GEM.get());
                        event.accept(ModItems.ONYX_GEM.get());
                        event.accept(ModItems.GRAPHENE_GEM.get());
                        event.accept(ModItems.CHAIN.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_BLOCKS = CREATIVE_MODE_TABS.register("mores_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TURQUOISE_BLOCK.get()))
                    .title(Component.translatable("creativemodetab.mores_blocks"))
                    .displayItems((pParameters, event) -> {
//                        event.accept(ModBlocks.ALLOY_FURNACE.get());
                        event.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        event.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        event.accept(ModBlocks.RAW_COBALT_BLOCK.get());
                        event.accept(ModBlocks.TIN_BLOCK.get());
                        event.accept(ModBlocks.BRONZE_BLOCK.get());
                        event.accept(ModBlocks.SILVER_BLOCK.get());
                        event.accept(ModBlocks.COBALT_BLOCK.get());
                        event.accept(ModBlocks.STERLING_BLOCK.get());
                        event.accept(ModBlocks.STEEL_BLOCK.get());
                        event.accept(ModBlocks.AMETHYST_BLOCK.get());
                        event.accept(ModBlocks.TOPAZ_BLOCK.get());
                        event.accept(ModBlocks.TOURMALINE_BLOCK.get());
                        event.accept(ModBlocks.TANZANITE_BLOCK.get());
                        event.accept(ModBlocks.RUBY_BLOCK.get());
                        event.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        event.accept(ModBlocks.MOISSANITE_BLOCK.get());
                        event.accept(ModBlocks.TURQUOISE_BLOCK.get());
                        event.accept(ModBlocks.ONYX_BLOCK.get());
                        event.accept(ModBlocks.GRAPHENE_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_ORES = CREATIVE_MODE_TABS.register("mores_ores",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DEEPSLATE_TURQUOISE_ORE.get()))
                    .title(Component.translatable("creativemodetab.mores_ores"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModBlocks.ANTHRACITE_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_ANTHRACITE_ORE.get());
                        event.accept(ModBlocks.NETHER_ANTHRACITE_ORE.get());
                        event.accept(ModBlocks.TIN_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        event.accept(ModBlocks.SILVER_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        event.accept(ModBlocks.NETHER_SILVER_ORE.get());
                        event.accept(ModBlocks.COBALT_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_COBALT_ORE.get());
                        event.accept(ModBlocks.TOPAZ_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
                        event.accept(ModBlocks.TOURMALINE_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_TOURMALINE_ORE.get());
                        event.accept(ModBlocks.NETHER_TANZANITE_ORE.get());
                        event.accept(ModBlocks.RUBY_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        event.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        event.accept(ModBlocks.SAPPHIRE_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        event.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        event.accept(ModBlocks.MOISSANITE_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_MOISSANITE_ORE.get());
                        event.accept(ModBlocks.TURQUOISE_ORE.get());
                        event.accept(ModBlocks.DEEPSLATE_TURQUOISE_ORE.get());
                        event.accept(ModBlocks.ONYX_ORE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_TOOLS = CREATIVE_MODE_TABS.register("mores_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBALT_PICKAXE.get()))
                    .title(Component.translatable("creativemodetab.mores_tools"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.TIN_PICKAXE.get());
                        event.accept(ModItems.TIN_AXE.get());
                        event.accept(ModItems.TIN_SHOVEL.get());
                        event.accept(ModItems.TIN_HOE.get());
                        event.accept(ModItems.COPPER_PICKAXE.get());
                        event.accept(ModItems.COPPER_AXE.get());
                        event.accept(ModItems.COPPER_SHOVEL.get());
                        event.accept(ModItems.COPPER_HOE.get());
                        event.accept(ModItems.BRONZE_PICKAXE.get());
                        event.accept(ModItems.BRONZE_AXE.get());
                        event.accept(ModItems.BRONZE_SHOVEL.get());
                        event.accept(ModItems.BRONZE_HOE.get());
                        event.accept(ModItems.SILVER_PICKAXE.get());
                        event.accept(ModItems.SILVER_AXE.get());
                        event.accept(ModItems.SILVER_SHOVEL.get());
                        event.accept(ModItems.SILVER_HOE.get());
                        event.accept(ModItems.COBALT_PICKAXE.get());
                        event.accept(ModItems.COBALT_AXE.get());
                        event.accept(ModItems.COBALT_SHOVEL.get());
                        event.accept(ModItems.COBALT_HOE.get());
                        event.accept(ModItems.STERLING_PICKAXE.get());
                        event.accept(ModItems.STERLING_AXE.get());
                        event.accept(ModItems.STERLING_SHOVEL.get());
                        event.accept(ModItems.STERLING_HOE.get());
                        event.accept(ModItems.STEEL_PICKAXE.get());
                        event.accept(ModItems.STEEL_AXE.get());
                        event.accept(ModItems.STEEL_SHOVEL.get());
                        event.accept(ModItems.STEEL_HOE.get());
                        event.accept(ModItems.AMETHYST_PICKAXE.get());
                        event.accept(ModItems.AMETHYST_AXE.get());
                        event.accept(ModItems.AMETHYST_SHOVEL.get());
                        event.accept(ModItems.AMETHYST_HOE.get());
                        event.accept(ModItems.EMERALD_PICKAXE.get());
                        event.accept(ModItems.EMERALD_AXE.get());
                        event.accept(ModItems.EMERALD_SHOVEL.get());
                        event.accept(ModItems.EMERALD_HOE.get());
                        event.accept(ModItems.TOPAZ_PICKAXE.get());
                        event.accept(ModItems.TOPAZ_AXE.get());
                        event.accept(ModItems.TOPAZ_SHOVEL.get());
                        event.accept(ModItems.TOPAZ_HOE.get());
                        event.accept(ModItems.TOURMALINE_PICKAXE.get());
                        event.accept(ModItems.TOURMALINE_AXE.get());
                        event.accept(ModItems.TOURMALINE_SHOVEL.get());
                        event.accept(ModItems.TOURMALINE_HOE.get());
                        event.accept(ModItems.RUBY_PICKAXE.get());
                        event.accept(ModItems.RUBY_AXE.get());
                        event.accept(ModItems.RUBY_SHOVEL.get());
                        event.accept(ModItems.RUBY_HOE.get());
                        event.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        event.accept(ModItems.SAPPHIRE_AXE.get());
                        event.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        event.accept(ModItems.SAPPHIRE_HOE.get());
                        event.accept(ModItems.TANZANITE_PICKAXE.get());
                        event.accept(ModItems.TANZANITE_AXE.get());
                        event.accept(ModItems.TANZANITE_SHOVEL.get());
                        event.accept(ModItems.TANZANITE_HOE.get());
                        event.accept(ModItems.MOISSANITE_PICKAXE.get());
                        event.accept(ModItems.MOISSANITE_AXE.get());
                        event.accept(ModItems.MOISSANITE_SHOVEL.get());
                        event.accept(ModItems.MOISSANITE_HOE.get());
                        event.accept(ModItems.TURQUOISE_PICKAXE.get());
                        event.accept(ModItems.TURQUOISE_AXE.get());
                        event.accept(ModItems.TURQUOISE_SHOVEL.get());
                        event.accept(ModItems.TURQUOISE_HOE.get());
                        event.accept(ModItems.OBSIDIAN_PICKAXE.get());
                        event.accept(ModItems.OBSIDIAN_AXE.get());
                        event.accept(ModItems.OBSIDIAN_SHOVEL.get());
                        event.accept(ModItems.OBSIDIAN_HOE.get());
                        event.accept(ModItems.ONYX_PICKAXE.get());
                        event.accept(ModItems.ONYX_AXE.get());
                        event.accept(ModItems.ONYX_SHOVEL.get());
                        event.accept(ModItems.ONYX_HOE.get());
                        event.accept(ModItems.GRAPHENE_PICKAXE.get());
                        event.accept(ModItems.GRAPHENE_AXE.get());
                        event.accept(ModItems.GRAPHENE_SHOVEL.get());
                        event.accept(ModItems.GRAPHENE_HOE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_WEAPONS = CREATIVE_MODE_TABS.register("mores_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_BATTLEAXE.get()))
                    .title(Component.translatable("creativemodetab.mores_weapons"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.WOOD_BATTLEAXE.get());
                        event.accept(ModItems.WOOD_MACE.get());
                        event.accept(ModItems.WOOD_DAGGER.get());
                        event.accept(ModItems.STONE_BATTLEAXE.get());
                        event.accept(ModItems.STONE_MACE.get());
                        event.accept(ModItems.STONE_DAGGER.get());
                        event.accept(ModItems.TIN_SWORD.get());
                        event.accept(ModItems.TIN_BATTLEAXE.get());
                        event.accept(ModItems.TIN_MACE.get());
                        event.accept(ModItems.TIN_DAGGER.get());
                        event.accept(ModItems.COPPER_SWORD.get());
                        event.accept(ModItems.COPPER_BATTLEAXE.get());
                        event.accept(ModItems.COPPER_MACE.get());
                        event.accept(ModItems.COPPER_DAGGER.get());
                        event.accept(ModItems.BRONZE_SWORD.get());
                        event.accept(ModItems.BRONZE_BATTLEAXE.get());
                        event.accept(ModItems.BRONZE_MACE.get());
                        event.accept(ModItems.BRONZE_DAGGER.get());
                        event.accept(ModItems.SILVER_SWORD.get());
                        event.accept(ModItems.SILVER_BATTLEAXE.get());
                        event.accept(ModItems.SILVER_MACE.get());
                        event.accept(ModItems.SILVER_DAGGER.get());
                        event.accept(ModItems.GOLD_BATTLEAXE.get());
                        event.accept(ModItems.GOLD_MACE.get());
                        event.accept(ModItems.GOLD_DAGGER.get());
                        event.accept(ModItems.IRON_BATTLEAXE.get());
                        event.accept(ModItems.IRON_MACE.get());
                        event.accept(ModItems.IRON_DAGGER.get());
                        event.accept(ModItems.COBALT_SWORD.get());
                        event.accept(ModItems.COBALT_BATTLEAXE.get());
                        event.accept(ModItems.COBALT_MACE.get());
                        event.accept(ModItems.COBALT_DAGGER.get());
                        event.accept(ModItems.STERLING_SWORD.get());
                        event.accept(ModItems.STERLING_BATTLEAXE.get());
                        event.accept(ModItems.STERLING_MACE.get());
                        event.accept(ModItems.STERLING_DAGGER.get());
                        event.accept(ModItems.STEEL_SWORD.get());
                        event.accept(ModItems.STEEL_BATTLEAXE.get());
                        event.accept(ModItems.STEEL_MACE.get());
                        event.accept(ModItems.STEEL_DAGGER.get());
                        event.accept(ModItems.AMETHYST_SWORD.get());
                        event.accept(ModItems.AMETHYST_BATTLEAXE.get());
                        event.accept(ModItems.AMETHYST_MACE.get());
                        event.accept(ModItems.AMETHYST_DAGGER.get());
                        event.accept(ModItems.EMERALD_SWORD.get());
                        event.accept(ModItems.EMERALD_BATTLEAXE.get());
                        event.accept(ModItems.EMERALD_MACE.get());
                        event.accept(ModItems.EMERALD_DAGGER.get());
                        event.accept(ModItems.TOPAZ_SWORD.get());
                        event.accept(ModItems.TOPAZ_BATTLEAXE.get());
                        event.accept(ModItems.TOPAZ_MACE.get());
                        event.accept(ModItems.TOPAZ_DAGGER.get());
                        event.accept(ModItems.TOURMALINE_SWORD.get());
                        event.accept(ModItems.TOURMALINE_BATTLEAXE.get());
                        event.accept(ModItems.TOURMALINE_MACE.get());
                        event.accept(ModItems.TOURMALINE_DAGGER.get());
                        event.accept(ModItems.DIAMOND_BATTLEAXE.get());
                        event.accept(ModItems.DIAMOND_MACE.get());
                        event.accept(ModItems.DIAMOND_DAGGER.get());
                        event.accept(ModItems.RUBY_SWORD.get());
                        event.accept(ModItems.RUBY_BATTLEAXE.get());
                        event.accept(ModItems.RUBY_MACE.get());
                        event.accept(ModItems.RUBY_DAGGER.get());
                        event.accept(ModItems.SAPPHIRE_SWORD.get());
                        event.accept(ModItems.SAPPHIRE_BATTLEAXE.get());
                        event.accept(ModItems.SAPPHIRE_MACE.get());
                        event.accept(ModItems.SAPPHIRE_DAGGER.get());
                        event.accept(ModItems.TANZANITE_SWORD.get());
                        event.accept(ModItems.TANZANITE_BATTLEAXE.get());
                        event.accept(ModItems.TANZANITE_MACE.get());
                        event.accept(ModItems.TANZANITE_DAGGER.get());
                        event.accept(ModItems.MOISSANITE_SWORD.get());
                        event.accept(ModItems.MOISSANITE_BATTLEAXE.get());
                        event.accept(ModItems.MOISSANITE_MACE.get());
                        event.accept(ModItems.MOISSANITE_DAGGER.get());
                        event.accept(ModItems.TURQUOISE_SWORD.get());
                        event.accept(ModItems.TURQUOISE_BATTLEAXE.get());
                        event.accept(ModItems.TURQUOISE_MACE.get());
                        event.accept(ModItems.TURQUOISE_DAGGER.get());
                        event.accept(ModItems.OBSIDIAN_SWORD.get());
                        event.accept(ModItems.OBSIDIAN_BATTLEAXE.get());
                        event.accept(ModItems.OBSIDIAN_MACE.get());
                        event.accept(ModItems.OBSIDIAN_DAGGER.get());
                        event.accept(ModItems.NETHERITE_BATTLEAXE.get());
                        event.accept(ModItems.NETHERITE_MACE.get());
                        event.accept(ModItems.NETHERITE_DAGGER.get());
                        event.accept(ModItems.ONYX_SWORD.get());
                        event.accept(ModItems.ONYX_BATTLEAXE.get());
                        event.accept(ModItems.ONYX_MACE.get());
                        event.accept(ModItems.ONYX_DAGGER.get());
                        event.accept(ModItems.GRAPHENE_SWORD.get());
                        event.accept(ModItems.GRAPHENE_BATTLEAXE.get());
                        event.accept(ModItems.GRAPHENE_MACE.get());
                        event.accept(ModItems.GRAPHENE_DAGGER.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_SHIELDS = CREATIVE_MODE_TABS.register("mores_shields",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_SHIELD.get()))
                    .title(Component.translatable("creativemodetab.mores_shields"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.TIN_SHIELD.get());
                        event.accept(ModItems.COPPER_SHIELD.get());
                        event.accept(ModItems.BRONZE_SHIELD.get());
                        event.accept(ModItems.SILVER_SHIELD.get());
                        event.accept(ModItems.COBALT_SHIELD.get());
                        event.accept(ModItems.STERLING_SHIELD.get());
                        event.accept(ModItems.STEEL_SHIELD.get());
                        event.accept(ModItems.AMETHYST_SHIELD.get());
                        event.accept(ModItems.EMERALD_SHIELD.get());
                        event.accept(ModItems.TOPAZ_SHIELD.get());
                        event.accept(ModItems.TOURMALINE_SHIELD.get());
                        event.accept(ModItems.RUBY_SHIELD.get());
                        event.accept(ModItems.SAPPHIRE_SHIELD.get());
                        event.accept(ModItems.TANZANITE_SHIELD.get());
                        event.accept(ModItems.MOISSANITE_SHIELD.get());
                        event.accept(ModItems.TURQUOISE_SHIELD.get());
                        event.accept(ModItems.OBSIDIAN_SHIELD.get());
                        event.accept(ModItems.ONYX_SHIELD.get());
                        event.accept(ModItems.GRAPHENE_SHIELD.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_ARMOR = CREATIVE_MODE_TABS.register("mores_armor",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GRAPHENE_HELMET.get()))
                    .title(Component.translatable("creativemodetab.mores_armor"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.TIN_HELMET.get());
                        event.accept(ModItems.TIN_CHESTPLATE.get());
                        event.accept(ModItems.TIN_LEGGINGS.get());
                        event.accept(ModItems.TIN_BOOTS.get());
                        event.accept(ModItems.COPPER_HELMET.get());
                        event.accept(ModItems.COPPER_CHESTPLATE.get());
                        event.accept(ModItems.COPPER_LEGGINGS.get());
                        event.accept(ModItems.COPPER_BOOTS.get());
                        event.accept(ModItems.BRONZE_HELMET.get());
                        event.accept(ModItems.BRONZE_CHESTPLATE.get());
                        event.accept(ModItems.BRONZE_LEGGINGS.get());
                        event.accept(ModItems.BRONZE_BOOTS.get());
                        event.accept(ModItems.SILVER_HELMET.get());
                        event.accept(ModItems.SILVER_CHESTPLATE.get());
                        event.accept(ModItems.SILVER_LEGGINGS.get());
                        event.accept(ModItems.SILVER_BOOTS.get());
                        event.accept(ModItems.COBALT_HELMET.get());
                        event.accept(ModItems.COBALT_CHESTPLATE.get());
                        event.accept(ModItems.COBALT_LEGGINGS.get());
                        event.accept(ModItems.COBALT_BOOTS.get());
                        event.accept(ModItems.STERLING_HELMET.get());
                        event.accept(ModItems.STERLING_CHESTPLATE.get());
                        event.accept(ModItems.STERLING_LEGGINGS.get());
                        event.accept(ModItems.STERLING_BOOTS.get());
                        event.accept(ModItems.STEEL_HELMET.get());
                        event.accept(ModItems.STEEL_CHESTPLATE.get());
                        event.accept(ModItems.STEEL_LEGGINGS.get());
                        event.accept(ModItems.STEEL_BOOTS.get());
                        event.accept(ModItems.AMETHYST_HELMET.get());
                        event.accept(ModItems.AMETHYST_CHESTPLATE.get());
                        event.accept(ModItems.AMETHYST_LEGGINGS.get());
                        event.accept(ModItems.AMETHYST_BOOTS.get());
                        event.accept(ModItems.EMERALD_HELMET.get());
                        event.accept(ModItems.EMERALD_CHESTPLATE.get());
                        event.accept(ModItems.EMERALD_LEGGINGS.get());
                        event.accept(ModItems.EMERALD_BOOTS.get());
                        event.accept(ModItems.TOPAZ_HELMET.get());
                        event.accept(ModItems.TOPAZ_CHESTPLATE.get());
                        event.accept(ModItems.TOPAZ_LEGGINGS.get());
                        event.accept(ModItems.TOPAZ_BOOTS.get());
                        event.accept(ModItems.TOURMALINE_HELMET.get());
                        event.accept(ModItems.TOURMALINE_CHESTPLATE.get());
                        event.accept(ModItems.TOURMALINE_LEGGINGS.get());
                        event.accept(ModItems.TOURMALINE_BOOTS.get());
                        event.accept(ModItems.RUBY_HELMET.get());
                        event.accept(ModItems.RUBY_CHESTPLATE.get());
                        event.accept(ModItems.RUBY_LEGGINGS.get());
                        event.accept(ModItems.RUBY_BOOTS.get());
                        event.accept(ModItems.SAPPHIRE_HELMET.get());
                        event.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        event.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        event.accept(ModItems.SAPPHIRE_BOOTS.get());
                        event.accept(ModItems.TANZANITE_HELMET.get());
                        event.accept(ModItems.TANZANITE_CHESTPLATE.get());
                        event.accept(ModItems.TANZANITE_LEGGINGS.get());
                        event.accept(ModItems.TANZANITE_BOOTS.get());
                        event.accept(ModItems.MOISSANITE_HELMET.get());
                        event.accept(ModItems.MOISSANITE_CHESTPLATE.get());
                        event.accept(ModItems.MOISSANITE_LEGGINGS.get());
                        event.accept(ModItems.MOISSANITE_BOOTS.get());
                        event.accept(ModItems.TURQUOISE_HELMET.get());
                        event.accept(ModItems.TURQUOISE_CHESTPLATE.get());
                        event.accept(ModItems.TURQUOISE_LEGGINGS.get());
                        event.accept(ModItems.TURQUOISE_BOOTS.get());
                        event.accept(ModItems.OBSIDIAN_HELMET.get());
                        event.accept(ModItems.OBSIDIAN_CHESTPLATE.get());
                        event.accept(ModItems.OBSIDIAN_LEGGINGS.get());
                        event.accept(ModItems.OBSIDIAN_BOOTS.get());
                        event.accept(ModItems.ONYX_HELMET.get());
                        event.accept(ModItems.ONYX_CHESTPLATE.get());
                        event.accept(ModItems.ONYX_LEGGINGS.get());
                        event.accept(ModItems.ONYX_BOOTS.get());
                        event.accept(ModItems.GRAPHENE_HELMET.get());
                        event.accept(ModItems.GRAPHENE_CHESTPLATE.get());
                        event.accept(ModItems.GRAPHENE_LEGGINGS.get());
                        event.accept(ModItems.GRAPHENE_BOOTS.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_HORSE_ARMOR = CREATIVE_MODE_TABS.register("mores_horse_armor",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOURMALINE_HORSE_ARMOR.get()))
                    .title(Component.translatable("creativemodetab.mores_horse_armor"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.TIN_HORSE_ARMOR.get());
                        event.accept(ModItems.COPPER_HORSE_ARMOR.get());
                        event.accept(ModItems.BRONZE_HORSE_ARMOR.get());
                        event.accept(ModItems.SILVER_HORSE_ARMOR.get());
                        event.accept(ModItems.COBALT_HORSE_ARMOR.get());
                        event.accept(ModItems.STERLING_HORSE_ARMOR.get());
                        event.accept(ModItems.STEEL_HORSE_ARMOR.get());
                        event.accept(ModItems.AMETHYST_HORSE_ARMOR.get());
                        event.accept(ModItems.EMERALD_HORSE_ARMOR.get());
                        event.accept(ModItems.TOPAZ_HORSE_ARMOR.get());
                        event.accept(ModItems.TOURMALINE_HORSE_ARMOR.get());
                        event.accept(ModItems.RUBY_HORSE_ARMOR.get());
                        event.accept(ModItems.SAPPHIRE_HORSE_ARMOR.get());
                        event.accept(ModItems.TANZANITE_HORSE_ARMOR.get());
                        event.accept(ModItems.MOISSANITE_HORSE_ARMOR.get());
                        event.accept(ModItems.TURQUOISE_HORSE_ARMOR.get());
                        event.accept(ModItems.OBSIDIAN_HORSE_ARMOR.get());
                        event.accept(ModItems.ONYX_HORSE_ARMOR.get());
                        event.accept(ModItems.GRAPHENE_HORSE_ARMOR.get());
                        event.accept(ModItems.NETHERITE_HORSE_ARMOR.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_FOODS = CREATIVE_MODE_TABS.register("mores_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHOCOLATE.get()))
                    .title(Component.translatable("creativemodetab.mores_foods"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.BRONZE_APPLE.get());
                        event.accept(ModItems.SILVER_APPLE.get());
                        event.accept(ModItems.COBALT_APPLE.get());
                        event.accept(ModItems.CHOCOLATE.get());
                        event.accept(ModItems.VELVET.get());
                        event.accept(ModItems.CARROT_PIE.get());
                        event.accept(ModItems.DUCK.get());
                        event.accept(ModItems.COOKED_DUCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MORES_ENTITIES = CREATIVE_MODE_TABS.register("mores_entities",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DUCK_SPAWN_EGG.get()))
                    .title(Component.translatable("creativemodetab.mores_entities"))
                    .displayItems((pParameters, event) -> {
                        event.accept(ModItems.DUCK_SPAWN_EGG.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

