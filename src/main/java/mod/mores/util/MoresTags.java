package mod.mores.util;

import mod.mores.Mores;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class MoresTags {


    public static class Blocks{
        //Mores Tags
        public static final Tags.IOptionalNamedTag<Block> GEMSTONE_BLOCKS = createTag("gemstones");



        private static Tags.IOptionalNamedTag<Block> createTag(String name){
            return BlockTags.createOptional(new ResourceLocation(Mores.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name){
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }
    public static class Items{
        //Mores Tags
        public static final Tags.IOptionalNamedTag<Item> GEMSTONES = createTag("gemstones");
        public static final Tags.IOptionalNamedTag<Item> METALS = createTag("metals");

        //Forge Tags
        public static final Tags.IOptionalNamedTag<Item> COPPER = createForgeTag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> TIN = createForgeTag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> COBALT = createForgeTag("ingots/cobalt");
        public static final Tags.IOptionalNamedTag<Item> BRONZE = createForgeTag("ingots/bronze");
        public static final Tags.IOptionalNamedTag<Item> STEEL = createForgeTag("ingots/steel");
        public static final Tags.IOptionalNamedTag<Item> SILVER = createForgeTag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> STERLING_SILVER = createForgeTag("ingots/sterling_silver");

        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");
        public static final Tags.IOptionalNamedTag<Item> TOPAZ = createForgeTag("gems/topaz");
        public static final Tags.IOptionalNamedTag<Item> TANZANITE = createForgeTag("gems/tanzanite");
        public static final Tags.IOptionalNamedTag<Item> TOURMALINE = createForgeTag("gems/tourmaline");

        public static final Tags.IOptionalNamedTag<Item> RUBY = createForgeTag("gems/ruby");
        public static final Tags.IOptionalNamedTag<Item> SAPPHIRE = createForgeTag("gems/sapphire");
        public static final Tags.IOptionalNamedTag<Item> TURQUOISE = createForgeTag("gems/turquoise");
        public static final Tags.IOptionalNamedTag<Item> ONYX = createForgeTag("gems/onyx");
        public static final Tags.IOptionalNamedTag<Item> GRAPHENE = createForgeTag("gems/graphene");
        public static final Tags.IOptionalNamedTag<Item> MOISSANITE = createForgeTag("gems/moissanite");






        private static Tags.IOptionalNamedTag<Item> createTag(String name){
            return ItemTags.createOptional(new ResourceLocation(Mores.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name){
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}