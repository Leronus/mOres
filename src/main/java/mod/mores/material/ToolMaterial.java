package mod.mores.material;

import mod.mores.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

/**
 * Enum that initializes all the mOres toolmaterials
 * @author Leronus
 */
public enum ToolMaterial implements IItemTier {
    TOOL_TIN(0, 100, 4.8F, 1.5F, 6, () -> Ingredient.of(ItemInit.TIN_INGOT.get())),
    TOOL_COPPER(1, 90, 5.0F, 1.5F, 4, () -> Ingredient.of(ItemInit.COPPER_INGOT.get())),
    TOOL_SILVER(2, 230, 5.5F, 2.0F, 16, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
    TOOL_BRONZE(2, 270, 5.5F, 2.0F, 7, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get())),
    TOOL_STERLING(3, 290, 6.0F, 2.2F, 14, () -> Ingredient.of(ItemInit.STERLING_INGOT.get())),
    TOOL_COBALT(3, 350, 6.5F, 2.2F, 12, () -> Ingredient.of(ItemInit.COBALT_INGOT.get())),
    TOOL_STEEL(3, 600, 6.2F, 2.5F, 18, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    TOOL_OBSIDIAN(4, 1800, 6.5F, 2.5F, 6, () -> Ingredient.of(Items.OBSIDIAN)),
    TOOL_AMETHYST(3, 700, 6.5F, 2.5F, 8, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get())),
    TOOL_EMERALD(4, 900, 7.0F, 3.0F, 17, () -> Ingredient.of(Items.EMERALD)),
    TOOL_TOPAZ(4, 1300, 7.5F, 3.0F, 14, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get())),
    TOOL_TOURMALINE(4, 1500, 7.5F, 3.0F, 13, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get())),
    TOOL_DIAMOND(5, 1561, 8.0F, 3.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    TOOL_TANZANITE(5, 2000, 8.0F, 3.0F, 21, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get())),
    TOOL_RUBY(5, 1600, 9.0F, 3.5F, 16, () -> Ingredient.of(ItemInit.RUBY_GEM.get())),
    TOOL_SAPPHIRE(5, 1750, 8.0F, 4.0F, 10, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get())),
    TOOL_MOISSANITE(6, 2200, 8.5F, 3.5F, 12, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get())),
    TOOL_NETHERITE(6, 2031, 9.0F, 4.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    TOOL_ONYX(6, 3000, 10.0F, 5.0F, 15, () -> Ingredient.of(ItemInit.ONYX_GEM.get())),
    TOOL_TURQUOISE(6, 2700, 9.0F, 3.5F, 14, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get())),
    TOOL_GRAPHENE(7, 5000, 11.0F, 6.0F, 16, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    /**
     * Constructor that adds the toolmaterial
     * @param harvestLevel Tools harvest level
     * @param maxUses Tools durability
     * @param efficiency Tools efficiency
     * @param attackDamage Tools attack damage
     * @param enchantability Tools enchantibility
     * @param repairMaterial Tools repair material
     */
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
