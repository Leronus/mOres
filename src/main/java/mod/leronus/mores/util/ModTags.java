package mod.leronus.mores.util;

import mod.leronus.mores.Mores;
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

        public static final TagKey<Item> TIN_INGOTS = forgeTag("ingots/tin");
        public static final TagKey<Item> SILVER_INGOTS = forgeTag("ingots/silver");
        public static final TagKey<Item> BRONZE_INGOTS = forgeTag("ingots/bronze");
        public static final TagKey<Item> COBALT_INGOTS = forgeTag("ingots/cobalt");
        public static final TagKey<Item> STEEL_INGOTS = forgeTag("ingots/steel");
        public static final TagKey<Item> STERLING_INGOTS = forgeTag("ingots/sterling_silver");
        public static final TagKey<Item> OBSIDIAN_INGOTS = forgeTag("ingots/obsidian");

        public static final TagKey<Item> TOPAZ_GEMS = forgeTag("gems/topaz");
        public static final TagKey<Item> TOURMALINE_GEMS = forgeTag("gems/tourmaline");
        public static final TagKey<Item> RUBY_GEMS = forgeTag("gems/ruby");
        public static final TagKey<Item> SAPPHIRE_GEMS = forgeTag("gems/sapphire");
        public static final TagKey<Item> TANZANITE_GEMS = forgeTag("gems/tanzanite");
        public static final TagKey<Item> MOISSANITE_GEMS = forgeTag("gems/moissanite");
        public static final TagKey<Item> TURQUOISE_GEMS = forgeTag("gems/turquoise");
        public static final TagKey<Item> ONYX_GEMS = forgeTag("gems/onyx");
        public static final TagKey<Item> GRAPHENE_GEMS = forgeTag("gems/graphene");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Mores.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
