package mod.mores.core.init;

import mod.mores.Mores;
import mod.mores.core.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    public static final ArmorMaterial ARMOR_TIN = new BaseArmorMaterial("tin", 5, new int[] {1, 4, 4, 1}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.TIN_INGOT.get()));
    public static final ArmorMaterial ARMOR_COPPER = new BaseArmorMaterial("copper", 6, new int[] {1, 4, 5, 1}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.COPPER_INGOT.get()));
    public static final ArmorMaterial ARMOR_SILVER = new BaseArmorMaterial("silver", 13, new int[] {1, 4, 5, 1}, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.SILVER_INGOT.get()));
    public static final ArmorMaterial ARMOR_BRONZE = new BaseArmorMaterial("bronze", 16, new int[] {2, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get()));
    public static final ArmorMaterial ARMOR_STERLING = new BaseArmorMaterial("sterling", 18, new int[] {2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.STERLING_INGOT.get()));
    public static final ArmorMaterial ARMOR_COBALT = new BaseArmorMaterial("cobalt", 20, new int[] {2, 5, 7, 2}, 20, SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.COBALT_INGOT.get()));
    public static final ArmorMaterial ARMOR_STEEL = new BaseArmorMaterial("steel", 22, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.1F, () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
    public static final ArmorMaterial ARMOR_OBSIDIAN = new BaseArmorMaterial("obsidian", 44, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 0.2F, () -> Ingredient.of(Items.OBSIDIAN));
    public static final ArmorMaterial ARMOR_AMETHYST = new BaseArmorMaterial("amethyst", 22, new int[] {2, 6, 7, 2}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get()));
    public static final ArmorMaterial ARMOR_EMERALD = new BaseArmorMaterial("emerald", 24, new int[] {2, 5, 7, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD));
    public static final ArmorMaterial ARMOR_TOPAZ = new BaseArmorMaterial("topaz", 26, new int[] {3, 6, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get()));
    public static final ArmorMaterial ARMOR_TOURMALINE = new BaseArmorMaterial("tourmaline", 27, new int[] {2, 5, 7, 2}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get()));
    public static final ArmorMaterial ARMOR_TANZANITE = new BaseArmorMaterial("tanzanite", 36, new int[] {2, 5, 6, 2}, 24, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get()));
    public static final ArmorMaterial ARMOR_RUBY = new BaseArmorMaterial("ruby", 38, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.RUBY_GEM.get()));
    public static final ArmorMaterial ARMOR_SAPPHIRE = new BaseArmorMaterial("sapphire", 39, new int[] {3, 6, 8, 3}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get()));
    public static final ArmorMaterial ARMOR_MOISSANITE = new BaseArmorMaterial("moissanite", 42, new int[] {3, 7, 8, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get()));
    public static final ArmorMaterial ARMOR_ONYX = new BaseArmorMaterial("onyx", 50, new int[] {3, 7, 8, 4}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.ONYX_GEM.get()));
    public static final ArmorMaterial ARMOR_TURQUOISE = new BaseArmorMaterial("turquoise", 38, new int[] {2, 6, 7, 3}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.01F, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get()));
    public static final ArmorMaterial ARMOR_GRAPHENE = new BaseArmorMaterial("graphene", 60, new int[] {3, 7, 8, 4}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.1F, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));


    private ArmorMaterialInit() {
    }
}