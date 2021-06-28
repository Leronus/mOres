package mod.mores.materials;

import mod.mores.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ToolMaterial implements IItemTier {
    TOOL_TIN(0, 100, 4.8F, 1.5F, 13, () -> Ingredient.of(ItemInit.TIN_INGOT.get())),
    TOOL_COPPER(1, 90, 5.0F, 1.5F, 9, () -> Ingredient.of(ItemInit.COPPER_INGOT.get())),
    TOOL_SILVER(2, 230, 5.5F, 1.8F, 24, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
    TOOL_BRONZE(2, 270, 5.5F, 2.0F, 12, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get())),
    TOOL_STERLING(2, 290, 6.0F, 2.2F, 14, () -> Ingredient.of(ItemInit.STERLING_INGOT.get())),
    TOOL_COBALT(3, 350, 6.5F, 2.2F, 20, () -> Ingredient.of(ItemInit.COBALT_INGOT.get())),
    TOOL_STEEL(3, 400, 6.2F, 2.5F, 12, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    TOOL_OBSIDIAN(3, 1800, 6.5F, 2.5F, 6, () -> Ingredient.of(Items.OBSIDIAN)),
    TOOL_AMETHYST(3, 700, 6.5F, 2.5F, 16, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get())),
    TOOL_EMERALD(4, 900, 7.0F, 3.0F, 18, () -> Ingredient.of(Items.EMERALD)),
    TOOL_TOPAZ(4, 1300, 7.2F, 3.0F, 15, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get())),
    TOOL_TOURMALINE(4, 1600, 7.5F, 3.0F, 22, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get())),
    TOOL_TANZANITE(5, 2000, 8.0F, 3.0F, 24, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get())),
    TOOL_RUBY(5, 1400, 8.0F, 4.0F, 12, () -> Ingredient.of(ItemInit.RUBY_GEM.get())),
    TOOL_SAPPHIRE(5, 1500, 8.5F, 3.5F, 16, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get())),
    TOOL_MOISSANITE(6, 2200, 9.0F, 4.0F, 10, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get())),
    TOOL_ONYX(6, 3000, 10.0F, 4.5F, 18, () -> Ingredient.of(ItemInit.ONYX_GEM.get())),
    TOOL_TURQUOISE(6, 2700, 8.0F, 4.2F, 22, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get())),
    TOOL_GRAPHENE(7, 5000, 10.5F, 5.0F, 16, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }
}
