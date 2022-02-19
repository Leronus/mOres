package mod.mores.core.init;

import mod.mores.core.BaseToolMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
    protected static final Tier TOOL_TIN = new BaseToolMaterial(1.5F, 6, 0, 4.8F, 100, () -> Ingredient.of(ItemInit.TIN_INGOT.get()));
    protected static final Tier TOOL_COPPER = new BaseToolMaterial(1.5F, 4, 1, 5.0F, 90, () -> Ingredient.of(ItemInit.COPPER_INGOT.get()));
    protected static final Tier TOOL_SILVER = new BaseToolMaterial(2.0F, 16, 2, 5.5F, 230, () -> Ingredient.of(ItemInit.SILVER_INGOT.get()));
    protected static final Tier TOOL_BRONZE = new BaseToolMaterial(2.0F, 7, 2, 5.5F, 270, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get()));
    protected static final Tier TOOL_STERLING = new BaseToolMaterial(2.2F, 14, 3, 6.0F, 290, () -> Ingredient.of(ItemInit.STERLING_INGOT.get()));
    protected static final Tier TOOL_COBALT = new BaseToolMaterial(2.2F, 12, 3, 6.5F, 350, () -> Ingredient.of(ItemInit.COBALT_INGOT.get()));
    protected static final Tier TOOL_STEEL = new BaseToolMaterial(2.5F, 18, 3, 6.2F, 600, () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
    protected static final Tier TOOL_OBSIDIAN = new BaseToolMaterial(2.5F, 6, 4, 6.5F, 1800, () -> Ingredient.of(Items.OBSIDIAN));
    protected static final Tier TOOL_AMETHYST = new BaseToolMaterial(2.5F, 8, 3, 6.0F, 700, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get()));
    protected static final Tier TOOL_EMERALD = new BaseToolMaterial(3.0F, 17, 4, 7.0F, 900, () -> Ingredient.of(Items.EMERALD));
    protected static final Tier TOOL_TOPAZ = new BaseToolMaterial(3.0F, 14, 4, 7.5F, 1300, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get()));
    protected static final Tier TOOL_TOURMALINE = new BaseToolMaterial(3.0F, 13, 4, 7.5F, 1500, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get()));
    protected static final Tier TOOL_DIAMOND = new BaseToolMaterial(3.0F, 10, 5, 8.0F, 1561, () -> Ingredient.of(Items.DIAMOND));
    protected static final Tier TOOL_TANZANITE = new BaseToolMaterial(3.0F, 21, 5, 8.0F, 2000, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get()));
    protected static final Tier TOOL_RUBY = new BaseToolMaterial(3.5F, 16, 5, 8.5F, 1600, () -> Ingredient.of(ItemInit.RUBY_GEM.get()));
    protected static final Tier TOOL_SAPPHIRE = new BaseToolMaterial(4.0F, 10, 5, 8.0F, 1750, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get()));
    protected static final Tier TOOL_MOISSANITE = new BaseToolMaterial(3.5F, 12, 6, 8.5F, 2200, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get()));
    protected static final Tier TOOL_NETHERITE = new BaseToolMaterial(4.0F, 15, 6, 9.0F, 2031, () -> Ingredient.of(Items.NETHERITE_INGOT));
    protected static final Tier TOOL_ONYX = new BaseToolMaterial(5.0F, 15, 6, 10.0F, 3000, () -> Ingredient.of(ItemInit.ONYX_GEM.get()));
    protected static final Tier TOOL_TURQUOISE = new BaseToolMaterial(3.5F, 14, 6, 9.0F, 2700, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get()));
    protected static final Tier TOOL_GRAPHENE = new BaseToolMaterial(6.0F, 16, 7, 12.0F, 5000, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));

    private ToolMaterialInit() {
    }
}
