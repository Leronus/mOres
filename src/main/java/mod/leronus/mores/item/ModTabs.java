package mod.leronus.mores.item;

import mod.leronus.mores.Mores;
import mod.leronus.mores.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Class that adds custom item group tabs for the items and blocks added by mOres
 * @author Leronus
 */
@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTabs {
    /**
     * Declaring all the itemgroups
     */
    public static CreativeModeTab MORES_MATERIALS;
    public static CreativeModeTab MORES_BLOCKS;
    public static CreativeModeTab MORES_ORES;
    public static CreativeModeTab MORES_TOOLS;
    public static CreativeModeTab MORES_WEAPONS;
    public static CreativeModeTab MORES_SHIELDS;
    public static CreativeModeTab MORES_ARMOR;
    public static CreativeModeTab MORES_HORSE_ARMOR;
    public static CreativeModeTab MORES_FOODS;
    public static CreativeModeTab MORES_ENTITIES;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MORES_MATERIALS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_materials"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RUBY_GEM.get()))
                        .title(Component.translatable("creativemodetab.mores_materials")));

        MORES_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_blocks"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.TURQUOISE_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.mores_blocks")));

        MORES_ORES = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_ores"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.DEEPSLATE_TURQUOISE_ORE.get()))
                        .title(Component.translatable("creativemodetab.mores_ores")));

        MORES_TOOLS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_tools"),
                builder -> builder.icon(() -> new ItemStack(ModItems.COBALT_PICKAXE.get()))
                        .title(Component.translatable("creativemodetab.mores_tools")));

        MORES_WEAPONS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_weapons"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SAPPHIRE_BATTLEAXE.get()))
                        .title(Component.translatable("creativemodetab.mores_weapons")));

        MORES_SHIELDS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_shields"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BRONZE_SHIELD.get()))
                        .title(Component.translatable("creativemodetab.mores_shields")));

        MORES_ARMOR = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_armor"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GRAPHENE_HELMET.get()))
                        .title(Component.translatable("creativemodetab.mores_armor")));

        MORES_HORSE_ARMOR = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_horse_armor"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TOURMALINE_HORSE_ARMOR.get()))
                        .title(Component.translatable("creativemodetab.mores_horse_armor")));

        MORES_FOODS = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_foods"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SILVER_APPLE.get()))
                        .title(Component.translatable("creativemodetab.mores_foods")));

        MORES_ENTITIES = event.registerCreativeModeTab(new ResourceLocation(Mores.MODID, "mores_entities"),
                builder -> builder.icon(() -> new ItemStack(ModItems.DUCK_SPAWN_EGG.get()))
                        .title(Component.translatable("creativemodetab.mores_entities")));
    }

}

