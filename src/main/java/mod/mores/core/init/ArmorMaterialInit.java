package mod.mores.core.init;

import mod.mores.item.ModArmorMaterials;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    public static final ArmorMaterial TIN = new ModArmorMaterials("tin", 5, new int[] {1, 4, 4, 1}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.TIN_INGOT.get()));
    public static final ArmorMaterial COPPER = new ModArmorMaterials("copper", 6, new int[] {1, 4, 5, 1}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.COPPER_INGOT.get()));
    public static final ArmorMaterial SILVER = new ModArmorMaterials("silver", 13, new int[] {1, 4, 5, 1}, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.SILVER_INGOT.get()));
    public static final ArmorMaterial BRONZE = new ModArmorMaterials("bronze", 16, new int[] {2, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.BRONZE_INGOT.get()));
    public static final ArmorMaterial STERLING = new ModArmorMaterials("sterling", 18, new int[] {2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.STERLING_INGOT.get()));
    public static final ArmorMaterial COBALT = new ModArmorMaterials("cobalt", 20, new int[] {2, 5, 7, 2}, 20, SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.COBALT_INGOT.get()));
    public static final ArmorMaterial STEEL = new ModArmorMaterials("steel", 22, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.1F, () -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
    public static final ArmorMaterial OBSIDIAN = new ModArmorMaterials("obsidian", 44, new int[] {2, 5, 7, 3}, 6, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 0.2F, () -> Ingredient.of(Items.OBSIDIAN));
    public static final ArmorMaterial AMETHYST = new ModArmorMaterials("amethyst", 22, new int[] {2, 6, 7, 2}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.AMETHYST_GEM.get()));
    public static final ArmorMaterial EMERALD = new ModArmorMaterials("emerald", 24, new int[] {2, 5, 7, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD));
    public static final ArmorMaterial TOPAZ = new ModArmorMaterials("topaz", 26, new int[] {3, 6, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F, () -> Ingredient.of(ItemInit.TOPAZ_GEM.get()));
    public static final ArmorMaterial TOURMALINE = new ModArmorMaterials("tourmaline", 27, new int[] {2, 5, 7, 2}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> Ingredient.of(ItemInit.TOURMALINE_GEM.get()));
    public static final ArmorMaterial TANZANITE = new ModArmorMaterials("tanzanite", 36, new int[] {2, 5, 6, 2}, 24, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.TANZANITE_GEM.get()));
    public static final ArmorMaterial RUBY = new ModArmorMaterials("ruby", 38, new int[] {2, 6, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.RUBY_GEM.get()));
    public static final ArmorMaterial SAPPHIRE = new ModArmorMaterials("sapphire", 39, new int[] {3, 6, 8, 3}, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.SAPPHIRE_GEM.get()));
    public static final ArmorMaterial MOISSANITE = new ModArmorMaterials("moissanite", 42, new int[] {3, 7, 8, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.MOISSANITE_GEM.get()));
    public static final ArmorMaterial ONYX = new ModArmorMaterials("onyx", 50, new int[] {3, 7, 8, 4}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(ItemInit.ONYX_GEM.get()));
    public static final ArmorMaterial TURQUOISE = new ModArmorMaterials("turquoise", 38, new int[] {2, 6, 7, 3}, 22, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.01F, () -> Ingredient.of(ItemInit.TURQUOISE_GEM.get()));
    public static final ArmorMaterial GRAPHENE = new ModArmorMaterials("graphene", 60, new int[] {3, 7, 8, 4}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.1F, () -> Ingredient.of(ItemInit.GRAPHENE_GEM.get()));


    private ArmorMaterialInit() {
    }
}