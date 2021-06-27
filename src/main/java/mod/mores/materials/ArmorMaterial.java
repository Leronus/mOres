package mod.mores.materials;

import mod.mores.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ArmorMaterial implements IArmorMaterial {
    //TODO Adjust armorVal accordingly, since toughness changes
    ARMOR_TIN("tin", 5, new int[] {1, 4, 4, 1}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.TIN_INGOT.get())),
    ARMOR_COPPER("copper", 6, new int[] {1, 4, 5, 1}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.COPPER_INGOT.get())),
    ARMOR_SILVER("silver", 13, new int[] {1, 4, 5, 1}, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
    ARMOR_BRONZE("bronze", 16, new int[] {2, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get())),
    //    ARMOR_STERLING("sterling", 18, new int[] {2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.STERLING_INGOT.get())),
    ARMOR_COBALT("cobalt", 20, new int[] {2, 5, 7, 2}, 20, SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.COBALT_INGOT.get())),
    ARMOR_STEEL("steel", 22, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.5F, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    ARMOR_OBSIDIAN("obsidian", 44, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 1.0F, () -> Ingredient.of(Items.OBSIDIAN)),
    ARMOR_AMETHYST("amethyst", 22, new int[] {2, 6, 7, 2}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get())),
    ARMOR_EMERALD("emerald", 24, new int[] {2, 5, 7, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD)),
    ARMOR_TOPAZ("topaz", 26, new int[] {3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get())),
    ARMOR_TOURMALINE("tourmaline", 27, new int[] {2, 5, 7, 2}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get())),
    //    ARMOR_TANZANITE("tanzanite", 36, new int[] {2, 5, 6, 2}, 24, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get())),
    ARMOR_RUBY("ruby", 38, new int[] {3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.RUBY_GEM.get())),
    ARMOR_SAPPHIRE("sapphire", 39, new int[] {3, 6, 8, 3}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get())),
    ARMOR_MOISSANITE("moissanite", 42, new int[] {2, 5, 7, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get())),
    ARMOR_ONYX("onyx", 50, new int[] {3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.ONYX_GEM.get())),
//    ARMOR_TURQUOISE("turquoise", 38, new int[] {2, 5, 7, 3}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get())),
    ARMOR_GRAPHENE("graphene", 60, new int[] {3, 7, 8, 4}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.2F, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));


    private static final int[] baseDurability = { 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private Ingredient repairIngredient;

    ArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }


    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return baseDurability[slot.getIndex()] * durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
