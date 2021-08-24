package mod.mores.materials;

import mod.mores.init.ItemInit;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

/**
 * Enum that initializes all the mOres toolmaterials
 * @author Leronus
 */
public enum ToolMaterial implements Tier {
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(Items.OAK_PLANKS)),
    STONE(1, 131, 4.0F, 1.0F, 5, () -> Ingredient.of(Items.STONE)),
    IRON(2, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    GOLD(0, 32, 12.0F, 0.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () ->  Ingredient.of(Items.NETHERITE_INGOT)),
    TIN(0, 100, 4.8F, 1.5F, 13, () -> Ingredient.of(ItemInit.TIN_INGOT.get())),
    COPPER(1, 90, 5.0F, 1.5F, 9, () -> Ingredient.of(ItemInit.COPPER_INGOT.get())),
    SILVER(2, 230, 5.5F, 2.0F, 24, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
    BRONZE(2, 270, 5.5F, 2.0F, 12, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get())),
    STERLING(2, 290, 6.0F, 2.2F, 14, () -> Ingredient.of(ItemInit.STERLING_INGOT.get())),
    COBALT(3, 350, 6.5F, 2.2F, 20, () -> Ingredient.of(ItemInit.COBALT_INGOT.get())),
    STEEL(3, 600, 6.2F, 2.5F, 12, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    OBSIDIAN(4, 1800, 6.5F, 2.5F, 6, () -> Ingredient.of(Items.OBSIDIAN)),
    AMETHYST(3, 700, 6.5F, 2.5F, 8, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get())),
    EMERALD(4, 900, 7.0F, 3.0F, 18, () -> Ingredient.of(Items.EMERALD)),
    TOPAZ(4, 1300, 7.5F, 3.0F, 15, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get())),
    TOURMALINE(4, 1500, 7.5F, 3.0F, 22, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get())),
    TANZANITE(5, 2000, 8.0F, 3.0F, 24, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get())),
    RUBY(5, 1600, 10.0F, 3.5F, 16, () -> Ingredient.of(ItemInit.RUBY_GEM.get())),
    SAPPHIRE(5, 1750, 8.0F, 4.0F, 10, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get())),
    MOISSANITE(6, 2200, 9.0F, 4.5F, 12, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get())),
    ONYX(6, 3000, 9.5F, 5.0F, 15, () -> Ingredient.of(ItemInit.ONYX_GEM.get())),
    TURQUOISE(6, 2700, 10.0F, 3.5F, 22, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get())),
    GRAPHENE(7, 5000, 14.0F, 6.0F, 16, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));

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
