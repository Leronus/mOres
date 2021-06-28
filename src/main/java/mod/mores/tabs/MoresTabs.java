package mod.mores.tabs;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MoresTabs extends ItemGroup {
    public static final ItemGroup MORES_MATERIALS = (new MoresTabs(12, "mores_materials") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY_GEM.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final ItemGroup MORES_BLOCKS = (new MoresTabs(13, "mores_blocks") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.GRAPHENE_BLOCK.get());
        }
    }).setRecipeFolderName("mores_blocks");

    public static final ItemGroup MORES_ORES = (new MoresTabs(14, "mores_ores") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.DEEPSLATE_TOURMALINE_ORE.get());
        }
    }).setRecipeFolderName("mores_ores");

    public static final ItemGroup MORES_TOOLS = (new MoresTabs(15, "mores_tools") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.COBALT_PICKAXE.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final ItemGroup MORES_WEAPONS = (new MoresTabs(16, "mores_weapons") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SAPPHIRE_BATTLEAXE.get());
        }
    }).setRecipeFolderName("mores_weapons");

    public static final ItemGroup MORES_ARMOR = (new MoresTabs(17, "mores_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.MOISSANITE_CHESTPLATE.get());
        }
    }).setRecipeFolderName("mores_armor");

    public static final ItemGroup MORES_HORSE_ARMOR = (new MoresTabs(18, "mores_horse_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.AMETHYST_HORSE_ARMOR.get());
        }
    }).setRecipeFolderName("mores_horse_armor");

    public MoresTabs(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.COBALT_PICKAXE.get());
    }
}

