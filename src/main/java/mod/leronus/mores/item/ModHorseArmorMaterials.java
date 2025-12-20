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

public class ModHorseArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, Mores.MODID);

    /**
     * Creates an ArmorMaterial that only has defense on BODY (used by AnimalArmorItem for horses).
     * The old HorseArmorItem(int protection, ...) value should go into BODY defense.
     * <p>
     * NOTE (1.20.6): ArmorMaterial expects the equip sound as Holder<SoundEvent>.
     */
    private static ArmorMaterial horseMat(
            String name,
            int bodyDefense,
            int enchantability,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repair
    ) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type t : ArmorItem.Type.values()) {
            defense.put(t, 0);
        }
        defense.put(ArmorItem.Type.BODY, bodyDefense);

        ArmorMaterial.Layer layer = new ArmorMaterial.Layer(new ResourceLocation(Mores.MODID, name));

        return new ArmorMaterial(
                defense,
                enchantability,
                equipSound,
                repair,
                List.of(layer),
                toughness,
                knockbackResistance
        );
    }

    // === Horse armor materials (BODY defense = your old HorseArmorItem protection value) ===

    public static final RegistryObject<ArmorMaterial> COPPER =
            ARMOR_MATERIALS.register("copper",
                    () -> horseMat("copper", 3, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT)));

    public static final RegistryObject<ArmorMaterial> TIN =
            ARMOR_MATERIALS.register("tin",
                    () -> horseMat("tin", 2, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TIN_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> SILVER =
            ARMOR_MATERIALS.register("silver",
                    () -> horseMat("silver", 5, 24, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.SILVER_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> COBALT =
            ARMOR_MATERIALS.register("cobalt",
                    () -> horseMat("cobalt", 6, 10, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.COBALT_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> BRONZE =
            ARMOR_MATERIALS.register("bronze",
                    () -> horseMat("bronze", 4, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.BRONZE_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> STEEL =
            ARMOR_MATERIALS.register("steel",
                    () -> horseMat("steel", 8, 15, SoundEvents.ARMOR_EQUIP_CHAIN, 1.0F, 0.1F,
                            () -> Ingredient.of(ModItems.STEEL_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> STERLING =
            ARMOR_MATERIALS.register("sterling",
                    () -> horseMat("sterling", 7, 17, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
                            () -> Ingredient.of(ModItems.STERLING_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> AMETHYST =
            ARMOR_MATERIALS.register("amethyst",
                    () -> horseMat("amethyst", 7, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.AMETHYST_SHARD)));

    public static final RegistryObject<ArmorMaterial> OBSIDIAN =
            ARMOR_MATERIALS.register("obsidian",
                    () -> horseMat("obsidian", 9, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.5F,
                            () -> Ingredient.of(ModItems.OBSIDIAN_INGOT.get())));

    public static final RegistryObject<ArmorMaterial> EMERALD =
            ARMOR_MATERIALS.register("emerald",
                    () -> horseMat("emerald", 8, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD)));

    public static final RegistryObject<ArmorMaterial> TOPAZ =
            ARMOR_MATERIALS.register("topaz",
                    () -> horseMat("topaz", 9, 8, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TOPAZ_GEM.get())));

    public static final RegistryObject<ArmorMaterial> TOURMALINE =
            ARMOR_MATERIALS.register("tourmaline",
                    () -> horseMat("tourmaline", 10, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TOURMALINE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> TANZANITE =
            ARMOR_MATERIALS.register("tanzanite",
                    () -> horseMat("tanzanite", 10, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TANZANITE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> RUBY =
            ARMOR_MATERIALS.register("ruby",
                    () -> horseMat("ruby", 12, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.RUBY_GEM.get())));

    public static final RegistryObject<ArmorMaterial> SAPPHIRE =
            ARMOR_MATERIALS.register("sapphire",
                    () -> horseMat("sapphire", 11, 16, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.SAPPHIRE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> TURQUOISE =
            ARMOR_MATERIALS.register("turquoise",
                    () -> horseMat("turquoise", 12, 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.TURQUOISE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> MOISSANITE =
            ARMOR_MATERIALS.register("moissanite",
                    () -> horseMat("moissanite", 13, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
                            () -> Ingredient.of(ModItems.MOISSANITE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> ONYX =
            ARMOR_MATERIALS.register("onyx",
                    () -> horseMat("onyx", 14, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F,
                            () -> Ingredient.of(ModItems.ONYX_GEM.get())));

    public static final RegistryObject<ArmorMaterial> GRAPHENE =
            ARMOR_MATERIALS.register("graphene",
                    () -> horseMat("graphene", 16, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F,
                            () -> Ingredient.of(ModItems.GRAPHENE_GEM.get())));

    public static final RegistryObject<ArmorMaterial> NETHERITE =
            ARMOR_MATERIALS.register("netherite",
                    () -> horseMat("netherite", 15, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
                            () -> Ingredient.of(net.minecraft.world.item.Items.NETHERITE_INGOT)));

    private ModHorseArmorMaterials() {}
}
