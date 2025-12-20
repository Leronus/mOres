package mod.leronus.mores.item;

import mod.leronus.mores.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

/**
 * Tool tiers for mOres (Forge 50.2.0 / MC 1.20.6).
 *
 * ForgeTier signature (1.20.6):
 * ForgeTier(int uses, float speed, float attackDamageBonus, int enchantmentValue,
 *           TagKey<Block> tag, Supplier<Ingredient> repairIngredient,
 *           TagKey<Block> incorrectBlocks)
 */
public final class ModTiers {

    // Stone-ish tier
    public static final ForgeTier TIN = new ForgeTier(
            100, 4.8F, 1.5F, 6,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.TIN_INGOT.get()),
            BlockTags.INCORRECT_FOR_STONE_TOOL
    );

    // Between stone and iron (you used level 1 previously; pick whichever incorrect-tag feels right)
    public static final ForgeTier COPPER = new ForgeTier(
            90, 5.0F, 1.5F, 4,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT),
            BlockTags.INCORRECT_FOR_STONE_TOOL
    );

    // Iron-ish tier
    public static final ForgeTier SILVER = new ForgeTier(
            230, 5.5F, 2.0F, 16,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.SILVER_INGOT.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );

    public static final ForgeTier BRONZE = new ForgeTier(
            270, 6.0F, 2.0F, 7,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );

    public static final ForgeTier IRON = new ForgeTier(
            250, 6.0F, 2.0F, 14,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.IRON_INGOT),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );

    public static final ForgeTier STERLING = new ForgeTier(
            320, 6.0F, 2.2F, 14,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.STERLING_INGOT.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );

    public static final ForgeTier COBALT = new ForgeTier(
            350, 6.5F, 2.2F, 12,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.COBALT_INGOT.get()),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );

    // Diamond-ish tier
    public static final ForgeTier STEEL = new ForgeTier(
            600, 6.5F, 2.5F, 18,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier AMETHYST = new ForgeTier(
            700, 6.5F, 2.7F, 8,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.AMETHYST_SHARD),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier EMERALD = new ForgeTier(
            900, 7.5F, 2.7F, 17,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier TOPAZ = new ForgeTier(
            1300, 7.0F, 2.7F, 14,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier TOURMALINE = new ForgeTier(
            1500, 7.0F, 2.7F, 13,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOURMALINE_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier DIAMOND = new ForgeTier(
            1561, 8.0F, 3.0F, 10,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.DIAMOND),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier SAPPHIRE = new ForgeTier(
            1782, 8.0F, 3.5F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier TANZANITE = new ForgeTier(
            1957, 8.0F, 3.5F, 17,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TANZANITE_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier OBSIDIAN = new ForgeTier(
            2169, 8.5F, 3.5F, 13,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.OBSIDIAN_INGOT.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier RUBY = new ForgeTier(
            1601, 8.0F, 3.5F, 11,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.RUBY_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    public static final ForgeTier MOISSANITE = new ForgeTier(
            1723, 8.0F, 3.5F, 23,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MOISSANITE_GEM.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );

    // Netherite-ish tier
    public static final ForgeTier NETHERITE = new ForgeTier(
            2031, 9.0F, 4.0F, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.NETHERITE_INGOT),
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL
    );

    public static final ForgeTier ONYX = new ForgeTier(
            2700, 9.5F, 4.0F, 14,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ONYX_GEM.get()),
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL
    );

    public static final ForgeTier TURQUOISE = new ForgeTier(
            2400, 9.0F, 4.0F, 14,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.TURQUOISE_GEM.get()),
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL
    );

    public static final ForgeTier GRAPHENE = new ForgeTier(
            3569, 11.0F, 6.0F, 18,
            ModTags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.GRAPHENE_GEM.get()),
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL
    );

    private ModTiers() {}
}
