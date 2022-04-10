package mod.mores.item;

import mod.mores.Mores;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    TIN("tin", 5, new int[] {1, 4, 4, 1}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
    COPPER("copper", 6, new int[] {1, 4, 5, 1}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT)),
    SILVER("silver", 13, new int[] {1, 4, 5, 1}, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
    BRONZE("bronze", 16, new int[] {2, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STERLING("sterling", 18, new int[] {2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ModItems.STERLING_INGOT.get())),
    COBALT("cobalt", 20, new int[] {2, 5, 7, 2}, 20, SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> Ingredient.of(ModItems.COBALT_INGOT.get())),
    STEEL("steel", 22, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.1F, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
    OBSIDIAN("obsidian", 44, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 0.2F, () -> Ingredient.of(Items.OBSIDIAN)),
    AMETHYST("amethyst", 22, new int[] {2, 6, 7, 2}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ModItems.AMETHYST_GEM.get())),
    EMERALD("emerald", 24, new int[] {2, 5, 7, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD)),
    TOPAZ("topaz", 26, new int[] {3, 6, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F, () -> Ingredient.of(ModItems.TOPAZ_GEM.get())),
    TOURMALINE("tourmaline", 27, new int[] {2, 5, 7, 2}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> Ingredient.of(ModItems.TOURMALINE_GEM.get())),
    TANZANITE("tanzanite", 36, new int[] {2, 5, 6, 2}, 24, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.TANZANITE_GEM.get())),
    RUBY("ruby", 38, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.RUBY_GEM.get())),
    SAPPHIRE("sapphire", 39, new int[] {3, 6, 8, 3}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get())),
    MOISSANITE("moissanite", 42, new int[] {3, 7, 8, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.MOISSANITE_GEM.get())),
    ONYX("onyx", 50, new int[] {3, 7, 8, 4}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ModItems.ONYX_GEM.get())),
    TURQUOISE("turquoise", 38, new int[] {2, 6, 7, 3}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.01F, () -> Ingredient.of(ModItems.TURQUOISE_GEM.get())),
    GRAPHENE("graphene", 60, new int[] {3, 7, 8, 4}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.1F, () -> Ingredient.of(ModItems.GRAPHENE_GEM.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Mores.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}