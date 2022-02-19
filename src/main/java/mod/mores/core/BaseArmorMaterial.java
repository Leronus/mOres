package mod.mores.core;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class BaseArmorMaterial implements ArmorMaterial {
    private static final int[] baseDurability = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private Ingredient repairIngredient;

    /**
     * Constructor that adds the armormaterial
     *
     * @param name                 Armor name
     * @param durabilityMultiplier Armor durability multiplier
     * @param armorVal             Armor values per body part
     * @param enchantability       Armor enchantability
     * @param equipSound           Armor equipping sound
     * @param toughness            Armor toughness points
     * @param knockbackResistance  Armor knockback resistance
     * @param repairIngredient     Armor repair item
     */
    public BaseArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }

    /**
     * Gets the durability for a certain slot
     *
     * @param slot Armor slot
     * @return Base durability times multiplier for that slot
     */
    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return baseDurability[slot.getIndex()] * durabilityMultiplier;
    }

    /**
     * Gets the defense for a certain slot
     *
     * @param slot Armor slot
     * @return Armor value for that slot
     */
    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.armorVal[slot.getIndex()];
    }

    /**
     * Gets the enchantability for a certain armor
     *
     * @return Enchantability value
     */
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    /**
     * Gets the equip sound for a certain armor
     *
     * @return Equip sound
     */
    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    /**
     * Gets the repair item for a certain armor
     *
     * @return Repair item
     */
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    /**
     * Gets the name for a certain armor
     *
     * @return Name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Gets the toughness value for a certain armor
     *
     * @return Toughness value
     */
    @Override
    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the knockback resistance for a certain armor
     *
     * @return Knockback resistance value
     */
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
