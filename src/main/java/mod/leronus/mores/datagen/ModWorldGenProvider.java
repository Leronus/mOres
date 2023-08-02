package mod.leronus.mores.datagen;

import mod.leronus.mores.Mores;
import mod.leronus.mores.item.custom.trims.ModArmorTrimMaterials;
import mod.leronus.mores.item.custom.trims.ModArmorTrimPatterns;
import mod.leronus.mores.world.feature.ModConfiguredFeatures;
import mod.leronus.mores.world.feature.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(Registries.TRIM_PATTERN, ModArmorTrimPatterns::bootstrap)
            .add(Registries.TRIM_MATERIAL, ModArmorTrimMaterials::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Collections.singleton(Mores.MODID));
    }
}