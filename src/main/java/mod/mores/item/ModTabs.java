package mod.mores.item;

import mod.mores.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Class that adds custom itemgroup tabs for the items and blocks added by mOres
 * @author Leronus
 */
public class ModTabs extends CreativeModeTab {
    /**
     * Declaring all the itemgroups
     */
    public static final CreativeModeTab MORES_MATERIALS = (new ModTabs(12, "mores_materials") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY_GEM.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final CreativeModeTab MORES_BLOCKS = (new ModTabs(13, "mores_blocks") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GRAPHENE_BLOCK.get());
        }
    }).setRecipeFolderName("mores_blocks");

    public static final CreativeModeTab MORES_ORES = (new ModTabs(14, "mores_ores") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DEEPSLATE_TOURMALINE_ORE.get());
        }
    }).setRecipeFolderName("mores_ores");

    public static final CreativeModeTab MORES_TOOLS = (new ModTabs(15, "mores_tools") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_PICKAXE.get());
        }
    }).setRecipeFolderName("mores_tools");

    public static final CreativeModeTab MORES_WEAPONS = (new ModTabs(16, "mores_weapons") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE_BATTLEAXE.get());
        }
    }).setRecipeFolderName("mores_weapons");

    //TODO Fix shields
    public static final CreativeModeTab MORES_SHIELDS = (new ModTabs(17, "mores_shields") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COPPER_SHIELD.get());
        }
    }).setRecipeFolderName("mores_shields");

    public static final CreativeModeTab MORES_ARMOR = (new ModTabs(18, "mores_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOISSANITE_CHESTPLATE.get());
        }
    }).setRecipeFolderName("mores_armor");

    public static final CreativeModeTab MORES_HORSE_ARMOR = (new ModTabs(19, "mores_horse_armor") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST_HORSE_ARMOR.get());
        }
    }).setRecipeFolderName("mores_horse_armor");

    public static final CreativeModeTab MORES_FOODS = (new ModTabs(20, "mores_foods") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER_APPLE.get());
        }
    }).setRecipeFolderName("mores_foods");

    public static final CreativeModeTab MORES_ENTITIES = (new ModTabs(21, "mores_entities") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DUCK_SPAWN_EGG.get());
        }
    }).setRecipeFolderName("mores_entities");

    /**
     * Constructor that adds the itemgroups
     * @param index Position of itemgroup in creative menu
     * @param label Name of itemgroup
     */
    public ModTabs(int index, String label) {
        super(index, label);
    }

    /**
     * Default icon
     * @return Item for icon
     */
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.TOPAZ_BATTLEAXE.get());
    }
}

