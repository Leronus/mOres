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
            return BlockTags.createOptional(new ResourceLocation(Mores.MOD_ID, name));
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
        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");



        private static Tags.IOptionalNamedTag<Item> createTag(String name){
            return ItemTags.createOptional(new ResourceLocation(Mores.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name){
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}