package mod.mores.data;

import mod.mores.Mores;
import mod.mores.init.ItemInit;
import mod.mores.init.RecipeTypeInit;
import mod.mores.recipe.ShieldRecipes;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ShieldsRecipeProvider extends RecipeProvider {

    private static final char SHIELD_CHAR = 'C';
    private static final char MATERIAL_CHAR = 'M';

    public ShieldsRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ItemInit.COPPER_SHIELD.get()).define(SHIELD_CHAR, Items.SHIELD)
                .define(MATERIAL_CHAR, ItemInit.COPPER_INGOT.get())
                .pattern("" + MATERIAL_CHAR + SHIELD_CHAR + MATERIAL_CHAR).pattern(" " + MATERIAL_CHAR + " ")
                .unlockedBy("has_copper_ingot", has(ItemInit.COPPER_INGOT.get())).save(consumer);
//        ShapedRecipeBuilder.shapedRecipe(Mores.goldShield).key(SHIELD_CHAR, Items.SHIELD)
//                .key(MATERIAL_CHAR, Tags.Items.INGOTS_GOLD)
//                .patternLine("" + MATERIAL_CHAR + SHIELD_CHAR + MATERIAL_CHAR).patternLine(" " + MATERIAL_CHAR + " ")
//                .addCriterion("has_gold_ingot", hasItem(Tags.Items.INGOTS_GOLD)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(Mores.diamondShield).key(SHIELD_CHAR, Items.SHIELD)
//                .key(MATERIAL_CHAR, Tags.Items.GEMS_DIAMOND)
//                .patternLine("" + MATERIAL_CHAR + SHIELD_CHAR + MATERIAL_CHAR).patternLine(" " + MATERIAL_CHAR + " ")
//                .addCriterion("has_diamond", hasItem(Tags.Items.GEMS_DIAMOND)).build(consumer);
//        smithingReinforce(consumer, Mores.diamondShield, Mores.netheriteShield);
        specialRecipe(consumer, RecipeTypeInit.SHIELD_SERIALIZER);
    }

    private void specialRecipe(Consumer<IFinishedRecipe> consumer, SpecialRecipeSerializer<?> serializer) {
        CustomRecipeBuilder.special(serializer).save(consumer,
                Mores.MODID + ":" + serializer.getRegistryName().getPath());
    }

//    private static void smithingReinforce(Consumer<IFinishedRecipe> recipeConsumer, Item itemToReinforce, Item output) {
//        SmithingRecipeBuilder
//                .smithingRecipe(Ingredient.fromItems(itemToReinforce), Ingredient.fromItems(Items.NETHERITE_INGOT),
//                        output)
//                .addCriterion("has_netherite_ingot", hasItem(Items.NETHERITE_INGOT)).build(recipeConsumer,
//                Mores.MODID + ":smithing/" + output.asItem().getRegistryName().getPath());
//    }

}
