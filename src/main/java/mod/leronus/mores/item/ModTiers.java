package mod.leronus.mores.item;

import mod.leronus.mores.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

/**
 * Enum that initializes all the mOres tool materials
 * @author Leronus
 */
public class ModTiers {
    public static final ForgeTier TIN = new ForgeTier(0, 100, 4.8F, 1.5F, 6, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get()));
    public static final ForgeTier COPPER = new ForgeTier(1, 90, 5.0F, 1.5F, 4, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(Items.COPPER_INGOT));
    public static final ForgeTier SILVER = new ForgeTier(2, 230, 5.5F, 2.0F, 16, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ModItems.SILVER_INGOT.get()));
    public static final ForgeTier BRONZE = new ForgeTier(2, 270, 5.5F, 2.0F, 7, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier STERLING = new ForgeTier(2, 290, 6.0F, 2.2F, 14, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ModItems.STERLING_INGOT.get()));
    public static final ForgeTier COBALT = new ForgeTier(2, 350, 6.5F, 2.2F, 12, BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ModItems.COBALT_INGOT.get()));
    public static final ForgeTier STEEL = new ForgeTier(3, 600, 6.2F, 2.5F, 18, BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ModItems.STEEL_INGOT.get()));
    public static final ForgeTier OBSIDIAN = new ForgeTier(3, 1800, 6.5F, 2.5F, 6,  BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items.OBSIDIAN));
    public static final ForgeTier AMETHYST = new ForgeTier(2, 700, 6.5F, 2.5F, 8,  BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final ForgeTier EMERALD = new ForgeTier(3, 900, 7.0F, 3.0F, 17,  BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier TOPAZ = new ForgeTier(2, 1300, 7.5F, 3.0F, 14,  BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.TOPAZ_GEM.get()));
    public static final ForgeTier TOURMALINE = new ForgeTier(2, 1500, 7.5F, 3.0F, 13, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.TOURMALINE_GEM.get()));
    public static final ForgeTier DIAMOND = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));
    public static final ForgeTier TANZANITE = new ForgeTier(3, 2000, 8.0F, 3.0F, 21, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TANZANITE_GEM.get()));
    public static final ForgeTier RUBY = new ForgeTier(3, 1600, 10.0F, 3.5F, 16,  BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY_GEM.get()));
    public static final ForgeTier SAPPHIRE = new ForgeTier(3, 1750, 8.0F, 4.0F, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get()));
    public static final ForgeTier MOISSANITE = new ForgeTier(4, 2200, 9.0F, 4.5F, 12, ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.MOISSANITE_GEM.get()));
    public static final ForgeTier NETHERITE = new ForgeTier(4, 2031, 9.0F, 4.0F, 15, ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));
    public static final ForgeTier ONYX = new ForgeTier(4, 3000, 9.5F, 5.0F, 15, ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.ONYX_GEM.get()));
    public static final ForgeTier TURQUOISE = new ForgeTier(4, 2700, 10.0F, 3.5F, 14, ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.TURQUOISE_GEM.get()));
    public static final ForgeTier GRAPHENE = new ForgeTier(5, 5000, 14.0F, 6.0F, 16, ModTags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.GRAPHENE_GEM.get()));
}
