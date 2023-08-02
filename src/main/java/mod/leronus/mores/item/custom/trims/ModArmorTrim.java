package mod.leronus.mores.item.custom.trims;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimPattern;

import java.util.Map;
import java.util.function.Function;

public class ModArmorTrim extends ArmorTrim {
    private final Holder<TrimMaterial> material;
    private final Holder<TrimPattern> pattern;
    private final Function<ArmorMaterial, ResourceLocation> innerTexture;
    private final Function<ArmorMaterial, ResourceLocation> outerTexture;

    public ModArmorTrim(Holder<TrimMaterial> material, Holder<TrimPattern> pattern) {
        super(material, pattern);
        this.material = material;
        this.pattern = pattern;
        this.innerTexture = Util.memoize((color) -> {
            ResourceLocation resourcelocation = pattern.value().assetId();
            String s = this.getColorPaletteSuffix(color);
            return resourcelocation.withPath((path) -> "trims/models/armor/" + path + "_leggings_" + s);
        });
        this.outerTexture = Util.memoize((color) -> {
            ResourceLocation resourcelocation = pattern.value().assetId();
            String s = this.getColorPaletteSuffix(color);
            return resourcelocation.withPath((path) -> "trims/models/armor/" + path + "_" + s);
        });
    }

    private String getColorPaletteSuffix(ArmorMaterial armorMaterial) {
        Map<ArmorMaterials, String> map = this.material.value().overrideArmorMaterials();
        return armorMaterial instanceof ArmorMaterials && map.containsKey(armorMaterial) ? map.get(armorMaterial) : this.material.value().assetName();
    }

    public boolean hasPatternAndMaterial(Holder<TrimPattern> trimPattern, Holder<TrimMaterial> trimMaterial) {
        return trimPattern == this.pattern && trimMaterial == this.material;
    }

    public Holder<TrimPattern> pattern() {
        return this.pattern;
    }

    public Holder<TrimMaterial> material() {
        return this.material;
    }

    public ResourceLocation innerTexture(ArmorMaterial armorMaterial) {
        return this.innerTexture.apply(armorMaterial);
    }

    public ResourceLocation outerTexture(ArmorMaterial armorMaterial) {
        return this.outerTexture.apply(armorMaterial);
    }

}
