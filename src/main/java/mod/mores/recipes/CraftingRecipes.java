package mod.mores.recipes;

import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {

    public static void init()
    {
        //Ruby
        ItemStack ruby_block = new ItemStack(BlockInit.RUBY_BLOCK);
        ItemStack ruby_gem = new ItemStack(ItemInit.RUBY_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("ruby"), null, ruby_gem, Ingredient.fromStacks(ruby_block));

        //Amethyst
        ItemStack amethyst_block = new ItemStack(BlockInit.AMETHYST_BLOCK);
        ItemStack amethyst_gem = new ItemStack(ItemInit.AMETHYST_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("amethyst"), null, amethyst_gem, Ingredient.fromStacks(amethyst_block));

        //Cobalt
        ItemStack cobalt_block = new ItemStack(BlockInit.COBALT_BLOCK);
        ItemStack cobalt_ingot = new ItemStack(ItemInit.COBALT_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("cobalt"), null, cobalt_ingot, Ingredient.fromStacks(cobalt_block));

        //Copper
        ItemStack copper_block = new ItemStack(BlockInit.COPPER_BLOCK);
        ItemStack copper_ingot = new ItemStack(ItemInit.COPPER_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("copper"), null, copper_ingot, Ingredient.fromStacks(copper_block));

        //Sapphire
        ItemStack sapphire_block = new ItemStack(BlockInit.SAPPHIRE_BLOCK);
        ItemStack sapphire_gem = new ItemStack(ItemInit.SAPPHIRE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("sapphire"), null, sapphire_gem, Ingredient.fromStacks(sapphire_block));

        //Silver
        ItemStack silver_block = new ItemStack(BlockInit.SILVER_BLOCK);
        ItemStack silver_ingot = new ItemStack(ItemInit.SILVER_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("silver"), null, silver_ingot, Ingredient.fromStacks(silver_block));

        //Topaz
        ItemStack topaz_block = new ItemStack(BlockInit.TOPAZ_BLOCK);
        ItemStack topaz_gem = new ItemStack(ItemInit.TOPAZ_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("topaz"), null, topaz_gem, Ingredient.fromStacks(topaz_block));

        //Turquoise
        ItemStack turquoise_block = new ItemStack(BlockInit.TURQUOISE_BLOCK);
        ItemStack turquoise_gem = new ItemStack(ItemInit.TURQUOISE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("turquoise"), null, turquoise_gem, Ingredient.fromStacks(turquoise_block));

        //Moissanite
        ItemStack moissanite_block = new ItemStack(BlockInit.MOISSANITE_BLOCK);
        ItemStack moissanite_gem = new ItemStack(ItemInit.MOISSANITE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("moissanite"), null, moissanite_gem, Ingredient.fromStacks(moissanite_block));

        //Steel
        ItemStack steel_block = new ItemStack(BlockInit.STEEL_BLOCK);
        ItemStack steel_ingot = new ItemStack(ItemInit.STEEL_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("steel"), null, steel_ingot, Ingredient.fromStacks(steel_block));

        //Onyx
        ItemStack onyx_block = new ItemStack(BlockInit.ONYX_BLOCK);
        ItemStack onyx_gem = new ItemStack(ItemInit.ONYX_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("onyx"), null, onyx_gem, Ingredient.fromStacks(onyx_block));

        //Tourmaline
        ItemStack tourmaline_block = new ItemStack(BlockInit.TOURMALINE_BLOCK);
        ItemStack tourmaline_gem = new ItemStack(ItemInit.TOURMALINE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("tourmaline"), null, tourmaline_gem, Ingredient.fromStacks(tourmaline_block));

        //Tin
        ItemStack tin_block = new ItemStack(BlockInit.TIN_BLOCK);
        ItemStack tin_ingot = new ItemStack(ItemInit.TIN_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("tin"), null, tin_ingot, Ingredient.fromStacks(tin_block));

        //Tanzanite
        ItemStack tanzanite_block = new ItemStack(BlockInit.TANZANITE_BLOCK);
        ItemStack tanzanite_gem = new ItemStack(ItemInit.TANZANITE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("tanzanite"), null, tanzanite_gem, Ingredient.fromStacks(tanzanite_block));

        //Bronze
        ItemStack bronze_block = new ItemStack(BlockInit.BRONZE_BLOCK);
        ItemStack bronze_ingot = new ItemStack(ItemInit.BRONZE_INGOT, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("bronze"), null, bronze_ingot, Ingredient.fromStacks(bronze_block));

        //Graphene
        ItemStack graphene_block = new ItemStack(BlockInit.GRAPHENE_BLOCK);
        ItemStack graphene_gem = new ItemStack(ItemInit.GRAPHENE_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("graphene"), null, graphene_gem, Ingredient.fromStacks(graphene_block));

        //Turquartz
        ItemStack turquartz_block = new ItemStack(BlockInit.TURQUARTZ_BLOCK);
        ItemStack turquartz_gem = new ItemStack(ItemInit.TURQUARTZ_GEM, 9);
        GameRegistry.addShapelessRecipe(new ResourceLocation("turquartz"), null, turquartz_gem, Ingredient.fromStacks(turquartz_block));

        //Sterling Silver
        //ItemStack sterling_block = new ItemStack(BlockInit.STERLING_BLOCK);
        //ItemStack sterling_ingot = new ItemStack(ItemInit.STERLING_INGOT, 9);
        //GameRegistry.addShapelessRecipe(new ResourceLocation("sterling"), null, sterling_ingot, Ingredient.fromStacks(sterling_block));
    }
}
