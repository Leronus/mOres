package mod.leronus.mores.item;

import mod.leronus.mores.Mores;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, Mores.MODID);

    /**
     * Vanilla-like base durability per slot (Boots, Leggings, Chestplate, Helmet)
     * This matches your old HEALTH_PER_SLOT, but mapped to ArmorItem.Type directly.
     */
    private static final Map<ArmorItem.Type, Integer> BASE_DURABILITY = new EnumMap<>(ArmorItem.Type.class);
    static {
        BASE_DURABILITY.put(ArmorItem.Type.BOOTS, 13);
        BASE_DURABILITY.put(ArmorItem.Type.LEGGINGS, 15);
        BASE_DURABILITY.put(ArmorItem.Type.CHESTPLATE, 16);
        BASE_DURABILITY.put(ArmorItem.Type.HELMET, 11);
        BASE_DURABILITY.put(ArmorItem.Type.BODY, 0); // not used for player armor
    }

    /**
     * Use this in ModItems registrations:
     * new Item.Properties().durability(ModArmorMaterials.getDurability(ModArmorMaterials.TIN, ArmorItem.Type.HELMET))
     */
    public static int getDurability(RegistryObject<ArmorMaterial> mat, ArmorItem.Type type) {
        // Use your old per-slot base values + multiplier stored in the mat's name mapping below
        int base = BASE_DURABILITY.getOrDefault(type, 0);
        int mult = durabilityMultiplierFor(mat);
        return base * mult;
    }

    /**
     * Keep the exact same durability multipliers you had in the enum version.
     */
    private static int durabilityMultiplierFor(RegistryObject<ArmorMaterial> mat) {
        if (mat == TIN) return 5;
        if (mat == COPPER) return 6;
        if (mat == SILVER) return 12;
        if (mat == BRONZE) return 11;
        if (mat == STERLING) return 17;
        if (mat == COBALT) return 18;
        if (mat == STEEL) return 22;
        if (mat == AMETHYST) return 22;
        if (mat == EMERALD) return 26;
        if (mat == TOPAZ) return 22;
        if (mat == TOURMALINE) return 25;
        if (mat == RUBY) return 35;
        if (mat == SAPPHIRE) return 39;
        if (mat == MOISSANITE) return 36;
        if (mat == TANZANITE) return 38;
        if (mat == OBSIDIAN) return 44;
        if (mat == TURQUOISE) return 38;
        if (mat == ONYX) return 51;
        if (mat == GRAPHENE) return 66;

        return 0;
    }

    private static ArmorMaterial wearableMat(
            String name,
            int boots, int leggings, int chestplate, int helmet,
            int enchantability,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        defense.put(ArmorItem.Type.BOOTS, boots);
        defense.put(ArmorItem.Type.LEGGINGS, leggings);
        defense.put(ArmorItem.Type.CHESTPLATE, chestplate);
        defense.put(ArmorItem.Type.HELMET, helmet);
        defense.put(ArmorItem.Type.BODY, 0);

        ArmorMaterial.Layer layer = new ArmorMaterial.Layer(new ResourceLocation(Mores.MODID, name));

        return new ArmorMaterial(
                defense,
                enchantability,
                equipSound,
                repairIngredient,
                List.of(layer),
                toughness,
                knockbackResistance
        );
    }

    // === Materials (same defense/enchant/sound/toughness as your current file) ===

    public static final RegistryObject<ArmorMaterial> TIN =
            ARMOR_MATERIALS.register("tin", () ->
                    wearableMat("tin", 1, 4, 5, 1, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TIN_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> COPPER =
            ARMOR_MATERIALS.register("copper", () ->
                    wearableMat("copper", 1, 4, 5, 1, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT))
            );

    public static final RegistryObject<ArmorMaterial> SILVER =
            ARMOR_MATERIALS.register("silver", () ->
                    wearableMat("silver", 1, 4, 5, 1, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.SILVER_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> BRONZE =
            ARMOR_MATERIALS.register("bronze", () ->
                    wearableMat("bronze", 2, 5, 6, 2, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> STERLING =
            ARMOR_MATERIALS.register("sterling", () ->
                    wearableMat("sterling", 2, 5, 6, 2, 17, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.STERLING_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> COBALT =
            ARMOR_MATERIALS.register("cobalt", () ->
                    wearableMat("cobalt", 2, 5, 6, 2, 10, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.COBALT_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> STEEL =
            ARMOR_MATERIALS.register("steel", () ->
                    wearableMat("steel", 2, 6, 7, 2, 15, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.1F,
                            () -> Ingredient.of(ModItems.STEEL_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> AMETHYST =
            ARMOR_MATERIALS.register("amethyst", () ->
                    wearableMat("amethyst", 2, 6, 7, 3, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.AMETHYST_SHARD))
            );

    public static final RegistryObject<ArmorMaterial> EMERALD =
            ARMOR_MATERIALS.register("emerald", () ->
                    wearableMat("emerald", 2, 6, 7, 3, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD))
            );

    public static final RegistryObject<ArmorMaterial> TOPAZ =
            ARMOR_MATERIALS.register("topaz", () ->
                    wearableMat("topaz", 2, 6, 7, 3, 8, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TOPAZ_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> TOURMALINE =
            ARMOR_MATERIALS.register("tourmaline", () ->
                    wearableMat("tourmaline", 2, 6, 7, 3, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TOURMALINE_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> RUBY =
            ARMOR_MATERIALS.register("ruby", () ->
                    wearableMat("ruby", 2, 6, 8, 3, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.RUBY_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> SAPPHIRE =
            ARMOR_MATERIALS.register("sapphire", () ->
                    wearableMat("sapphire", 3, 6, 8, 3, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> MOISSANITE =
            ARMOR_MATERIALS.register("moissanite", () ->
                    wearableMat("moissanite", 3, 6, 8, 3, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.MOISSANITE_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> TANZANITE =
            ARMOR_MATERIALS.register("tanzanite", () ->
                    wearableMat("tanzanite", 3, 7, 8, 4, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TANZANITE_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> OBSIDIAN =
            ARMOR_MATERIALS.register("obsidian", () ->
                    wearableMat("obsidian", 3, 7, 8, 4, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.5F,
                            () -> Ingredient.of(ModItems.OBSIDIAN_INGOT.get()))
            );

    public static final RegistryObject<ArmorMaterial> TURQUOISE =
            ARMOR_MATERIALS.register("turquoise", () ->
                    wearableMat("turquoise", 3, 6, 8, 3, 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TURQUOISE_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> ONYX =
            ARMOR_MATERIALS.register("onyx", () ->
                    wearableMat("onyx", 3, 7, 8, 4, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F,
                            () -> Ingredient.of(ModItems.ONYX_GEM.get()))
            );

    public static final RegistryObject<ArmorMaterial> GRAPHENE =
            ARMOR_MATERIALS.register("graphene", () ->
                    wearableMat("graphene", 3, 7, 8, 4, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F,
                            () -> Ingredient.of(ModItems.GRAPHENE_GEM.get()))
            );

    private ModArmorMaterials() {}
}
