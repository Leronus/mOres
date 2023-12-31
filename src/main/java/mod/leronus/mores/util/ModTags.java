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
                = create("needs_netherite_tool");

        private static TagKey<Block> create(String name) {
            return BlockTags.create(new ResourceLocation(Mores.MODID, name));
        }

        private static TagKey<Block> createForge(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TIN_INGOTS = createForge("ingots/tin");
        public static final TagKey<Item> SILVER_INGOTS = createForge("ingots/silver");
        public static final TagKey<Item> BRONZE_INGOTS = createForge("ingots/bronze");
        public static final TagKey<Item> COBALT_INGOTS = createForge("ingots/cobalt");
        public static final TagKey<Item> STEEL_INGOTS = createForge("ingots/steel");
        public static final TagKey<Item> STERLING_INGOTS = createForge("ingots/sterling_silver");
        public static final TagKey<Item> OBSIDIAN_INGOTS = createForge("ingots/obsidian");

        public static final TagKey<Item> TIN_NUGGETS = createForge("nuggets/tin");
        public static final TagKey<Item> SILVER_NUGGETS = createForge("nuggets/silver");
        public static final TagKey<Item> BRONZE_NUGGETS = createForge("nuggets/bronze");
        public static final TagKey<Item> COBALT_NUGGETS = createForge("nuggets/cobalt");
        public static final TagKey<Item> STEEL_NUGGETS = createForge("nuggets/steel");
        public static final TagKey<Item> STERLING_NUGGETS = createForge("nuggets/sterling_silver");

        public static final TagKey<Item> TOPAZ_GEMS = createForge("gems/topaz");
        public static final TagKey<Item> TOURMALINE_GEMS = createForge("gems/tourmaline");
        public static final TagKey<Item> RUBY_GEMS = createForge("gems/ruby");
        public static final TagKey<Item> SAPPHIRE_GEMS = createForge("gems/sapphire");
        public static final TagKey<Item> TANZANITE_GEMS = createForge("gems/tanzanite");
        public static final TagKey<Item> MOISSANITE_GEMS = createForge("gems/moissanite");
        public static final TagKey<Item> TURQUOISE_GEMS = createForge("gems/turquoise");
        public static final TagKey<Item> ONYX_GEMS = createForge("gems/onyx");
        public static final TagKey<Item> GRAPHENE_GEMS = createForge("gems/graphene");

        private static TagKey<Item> create(String name) {
            return ItemTags.create(new ResourceLocation(Mores.MODID, name));
        }

        private static TagKey<Item> createForge(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
