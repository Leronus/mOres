package mod.mores.util;

import mod.mores.Mores;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL
                = tag("needs_netherite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Mores.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TOPAZ_GEMS = forgeTag("gems/topaz");
        public static final TagKey<Item> TOURMALINE_GEMS = forgeTag("gems/tourmaline");
        public static final TagKey<Item> RUBY_GEMS = forgeTag("gems/ruby");
        public static final TagKey<Item> SAPPHIRE_GEMS = forgeTag("gems/sapphire");
        public static final TagKey<Item> TANZANITE_GEMS = forgeTag("gems/tanzanite");
        public static final TagKey<Item> MOISSANITE_GEMS = forgeTag("gems/moissanite");
        public static final TagKey<Item> TURQUOISE_GEMS = forgeTag("gems/turquoise");
        public static final TagKey<Item> CARBONADO_GEMS = forgeTag("gems/carbonado");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Mores.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
