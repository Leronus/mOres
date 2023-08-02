package mod.leronus.mores.item.custom.trims;

import mod.leronus.mores.Mores;
import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimPattern;

public class ModArmorTrimPatterns {
    public static final ResourceKey<TrimPattern> SICKO = registryKey("sicko");

    public static void bootstrap(BootstapContext<TrimPattern> pattern) {
        register(pattern, Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, SICKO);
    }
    private static void register(BootstapContext<TrimPattern> pattern, Item item, ResourceKey<TrimPattern> resourceKey) {
        TrimPattern trimpattern = new TrimPattern(resourceKey.location(), BuiltInRegistries.ITEM.wrapAsHolder(item), Component.translatable(Util.makeDescriptionId("trim_pattern", resourceKey.location())));
        pattern.register(resourceKey, trimpattern);
    }

    private static ResourceKey<TrimPattern> registryKey(String trimPattern) {
        return ResourceKey.create(Registries.TRIM_PATTERN, new ResourceLocation(Mores.MODID, trimPattern));
    }

}
