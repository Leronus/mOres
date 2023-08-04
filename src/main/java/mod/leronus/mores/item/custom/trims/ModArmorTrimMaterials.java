package mod.leronus.mores.item.custom.trims;

import mod.leronus.mores.Mores;
import mod.leronus.mores.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;

import java.util.Map;
import java.util.Optional;

public class ModArmorTrimMaterials extends TrimMaterials {
    public static final ResourceKey<TrimMaterial> BRONZE = registryKey("bronze");
    public static final ResourceKey<TrimMaterial> STERLING = registryKey("sterling");
    public static final ResourceKey<TrimMaterial> STEEL = registryKey("steel");
    public static final ResourceKey<TrimMaterial> TOPAZ = registryKey("topaz");
    public static final ResourceKey<TrimMaterial> TOURMALINE = registryKey("tourmaline");
    public static final ResourceKey<TrimMaterial> TANZANITE = registryKey("tanzanite");
    public static final ResourceKey<TrimMaterial> RUBY = registryKey("ruby");
    public static final ResourceKey<TrimMaterial> TURQUOISE = registryKey("turquoise");
    public static final ResourceKey<TrimMaterial> SAPPHIRE = registryKey("sapphire");
    public static final ResourceKey<TrimMaterial> GRAPHENE = registryKey("graphene");

    public ModArmorTrimMaterials() {
    }

    public static void bootstrap(BootstapContext<TrimMaterial> material) {
        register(material, BRONZE, ModItems.BRONZE_INGOT.get(), Style.EMPTY.withColor(13395456), 0.31F);
        register(material, STERLING, ModItems.STERLING_INGOT.get(), Style.EMPTY.withColor(16777164), 1.2F);
        register(material, STEEL, ModItems.STEEL_INGOT.get(), Style.EMPTY.withColor(4210752), 1.3F);
        register(material, TOPAZ, ModItems.TOPAZ_GEM.get(), Style.EMPTY.withColor(1745919), 1.4F);
        register(material, TOURMALINE, ModItems.TOURMALINE_GEM.get(), Style.EMPTY.withColor(16751069), 1.5F);
        register(material, TANZANITE, ModItems.TANZANITE_GEM.get(), Style.EMPTY.withColor(5832883), 1.6F);
        register(material, RUBY, ModItems.RUBY_GEM.get(), Style.EMPTY.withColor(16724787), 1.7F);
        register(material, TURQUOISE, ModItems.TURQUOISE_GEM.get(), Style.EMPTY.withColor(8454058), 1.8F);
        register(material, SAPPHIRE, ModItems.SAPPHIRE_GEM.get(), Style.EMPTY.withColor(204), 1.9F);
        register(material, GRAPHENE, ModItems.GRAPHENE_GEM.get(), Style.EMPTY.withColor(2519885), 2.0F);
    }

    public static Optional<Holder.Reference<TrimMaterial>> getFromIngredient(RegistryAccess registryAccess, ItemStack itemStack) {
        return registryAccess.registryOrThrow(Registries.TRIM_MATERIAL).holders().filter((item) -> {
            return itemStack.is(((TrimMaterial)item.value()).ingredient());
        }).findFirst();
    }

    private static void register(BootstapContext<TrimMaterial> p_268176_, ResourceKey<TrimMaterial> p_268293_, Item p_268156_, Style p_268174_, float p_268274_) {
        register(p_268176_, p_268293_, p_268156_, p_268174_, p_268274_, Map.of());
    }

    private static void register(BootstapContext<TrimMaterial> p_268244_, ResourceKey<TrimMaterial> p_268139_, Item p_268311_, Style p_268232_, float p_268197_, Map<ArmorMaterials, String> p_268352_) {
        TrimMaterial $$6 = TrimMaterial.create(p_268139_.location().getPath(), p_268311_, p_268197_, Component.translatable(Util.makeDescriptionId("trim_material", p_268139_.location())).withStyle(p_268232_), p_268352_);
        p_268244_.register(p_268139_, $$6);
    }

    private static ResourceKey<TrimMaterial> registryKey(String material) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, new ResourceLocation(Mores.MODID, material));
    }

}
