package mod.mores.recipes;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(BlockInit.AMETHYST_ORE), new ItemStack(ItemInit.AMETHYST_GEM), 3.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.COBALT_ORE), new ItemStack(ItemInit.COBALT_INGOT), 0.8F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER_INGOT), 0.5F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.RUBY_ORE), new ItemStack(ItemInit.RUBY_GEM), 5.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.SAPPHIRE_ORE), new ItemStack(ItemInit.SAPPHIRE_GEM), 5.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.SILVER_ORE), new ItemStack(ItemInit.SILVER_INGOT), 1.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.TOPAZ_ORE), new ItemStack(ItemInit.TOPAZ_GEM), 4.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.TURQUOISE_ORE), new ItemStack(ItemInit.TURQUOISE_GEM), 10.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.TIN_ORE), new ItemStack(ItemInit.TIN_INGOT), 0.4F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.TANZANITE_ORE), new ItemStack(ItemInit.TANZANITE_GEM), 4.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.MOISSANITE_NETHER_ORE), new ItemStack(ItemInit.MOISSANITE_GEM), 5.5F);
    }
}
