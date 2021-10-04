package mod.mores.tabs;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Class that adds custom itemgroup tabs for the items and blocks added by mOres
 * @author Leronus
 */
public class MoresTabs extends ItemGroup {
    /**
     * Declaring all the itemgroups
     */
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

    public static final ItemGroup MORES_SHIELDS = (new MoresTabs(17, "mores_shields") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.COPPER_SHIELD.get());
        }
    }).setRecipeFolderName("mores_shields");

    public static final ItemGroup MORES_ARMOR = (new MoresTabs(18, "mores_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.MOISSANITE_CHESTPLATE.get());
        }
    }).setRecipeFolderName("mores_armor");

    public static final ItemGroup MORES_HORSE_ARMOR = (new MoresTabs(19, "mores_horse_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.AMETHYST_HORSE_ARMOR.get());
        }
    }).setRecipeFolderName("mores_horse_armor");

    public static final ItemGroup MORES_FOODS = (new MoresTabs(20, "mores_foods") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SILVER_APPLE.get());
        }
    }).setRecipeFolderName("mores_foods");

    public static final ItemGroup MORES_ENTITIES = (new MoresTabs(21, "mores_entities") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.DUCK_SPAWN_EGG.get());
        }
    }).setRecipeFolderName("mores_entities");

    /**
     * Constructor that adds the itemgroups
     * @param index Position of itemgroup in creative menu
     * @param label Name of itemgroup
     */
    public MoresTabs(int index, String label) {
        super(index, label);
    }

    /**
     * Default icon
     * @return Item for icon
     */
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.TOPAZ_BATTLEAXE.get());
    }
}

