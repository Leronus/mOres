package mod.mores.recipe;

import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;

import java.util.List;
import java.util.function.Consumer;

public class AlloyRecipeSetBuilder extends RecipeSetBuilder
{

    public AlloyRecipeSetBuilder(String modid)
    {
        super(modid);
    }

    public void buildBasicAlloyRecipes(Consumer<IFinishedRecipe> consumer, List<Ingredient> primaryInputs,
                                       Ingredient[] catalysts, IItemProvider ingot,
                                       float experience, int cooktime, ICondition condition)
    {
        buildBasicAlloyRecipes(consumer, primaryInputs, catalysts, ingot,
                experience, cooktime, condition, null);
    }

    /**
     * Create the alloy_furnace alloy recipes for ingots, for a given pair of
     * ingredients and set of catalysts.
     *
     * @param consumer passed in from RecipeProvider to builder() call.
     * @param primaryInputs a list of two ingredients that will be alloyed.
     * @param catalysts 3-item array of catalysts, in order [ingot, medium_chunk, large_chunk]; null for non-existent
     *  recipes.
     * @param ingot ingot item to be created by fusion alloying recipe.
     * @param experience experience for creating ingot item. Will be multiplied x2 for medium, x4 for large.
     * @param cooktime standard fusion furnace cooking time, usually 600.
     * @param condition Usually a flag condition, could be more complex.
     */
    public void buildBasicAlloyRecipes(Consumer<IFinishedRecipe> consumer, List<Ingredient> primaryInputs,
                                       Ingredient[] catalysts, IItemProvider ingot,
                                       float experience, int cooktime, ICondition condition, String suffix)
    {
        if (suffix == null) {
            suffix = "";
        }

        ResourceLocation ingot_name = (ingot != null)
                ? AbstractAlloyFurnaceRecipeProvider.id(modid, ingot.asItem().toString() + suffix)
                : null;

        if (condition == null)
        {
            if (ingot != null)
            {
                consumer.accept(new AbstractAlloyFurnaceRecipeProvider.FinishedRecipe(ingot_name,
                        new ItemStack(ingot.asItem()), cooktime, experience, catalysts[0], primaryInputs.get(0),
                        primaryInputs.get(1)));
            }
        } // end-if no condition
        else {
            if (ingot != null)
            {
                ConditionalRecipe.builder()
                        .addCondition(condition)
                        .addRecipe(new AbstractAlloyFurnaceRecipeProvider.FinishedRecipe(ingot_name,
                                new ItemStack(ingot.asItem()), cooktime, experience, catalysts[0], primaryInputs.get(0),
                                primaryInputs.get(1)))
                        .build(consumer, ingot_name);
            }
        } // end-else condition exists
    } // end buildBasicAlloyRecipes()

    /**
     * Create the alloy_furnace recipes for recycling of the list of ingredients.
     *
     * @param consumer passed in from RecipeProvider to builder() call.
     * @param ingredients all the possible inputs that will produce a single output_item.
     * @param ingrs_doubleoutput all the possible inputs that will produce 2 output items.
     * @param input2 2nd input ingredient (often minecraft:gravel)
     * @param catalyst catalyst ingredient.
     * @param output_item output from recycling.
     * @param experience experience
     * @param cooktime cooking time; usually 600.
     * @param condition must be here; a flag or mod_loaded or some combination.
     * @param name simple name of recipe.
     */
    public void buildAlloyRecyclingRecipes(Consumer<IFinishedRecipe> consumer, Ingredient ingredients,
                                            Ingredient ingrs_doubleoutput, Ingredient input2, Ingredient catalyst, IItemProvider output_item, float experience,
                                            int cooktime, ICondition condition, String name)
    {
        ResourceLocation recipe1 = AbstractAlloyFurnaceRecipeProvider.id(modid, name + '1');
        if (ingredients != null)
        {
            ConditionalRecipe.builder()
                    .addCondition(condition)
                    .addRecipe(new AbstractAlloyFurnaceRecipeProvider.FinishedRecipe(recipe1,
                            new ItemStack(output_item.asItem()), cooktime, experience,
                            catalyst, ingredients, input2))
                    .build(consumer, recipe1);
        }
        if (ingrs_doubleoutput != null)
        {
            ResourceLocation recipe2 = AbstractAlloyFurnaceRecipeProvider.id(modid, name + '2');
            ConditionalRecipe.builder()
                    .addCondition(condition)
                    .addRecipe(new AbstractAlloyFurnaceRecipeProvider.FinishedRecipe(recipe1,
                            new ItemStack(output_item.asItem(), 2), cooktime, experience * 2.0F,
                            catalyst, ingrs_doubleoutput, input2))
                    .build(consumer, recipe2);
        }
    } // end buildFusionRecyclingRecipes

} // end class