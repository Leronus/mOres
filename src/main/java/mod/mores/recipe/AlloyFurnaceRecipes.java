package mod.mores.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mod.mores.Mores;
import mod.mores.config.MoresConfig;
import mod.mores.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

/**
 * Alloy RecipeProvider
 */
public class AlloyFurnaceRecipes extends RecipeProvider
        implements IConditionBuilder, IConditionBuilderMores {
    private AlloyRecipeSetBuilder alloybuilder;

    public AlloyFurnaceRecipes(DataGenerator generatorIn) {
        super(generatorIn);
        alloybuilder = new AlloyRecipeSetBuilder(Mores.MOD_ID);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        registerBronzeRecipes(consumer);
        registerSteelRecipes(consumer);
        registerSterlingSilverRecipes(consumer);
    }

    /**
     * Steel alloying recipes and steel recycling recipes.
     *
     * @param consumer
     */
    protected void registerSteelRecipes(Consumer<IFinishedRecipe> consumer) {
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];

        primary_inputs.add(Ingredient.of(ItemTags.COALS));
        primary_inputs.add(Ingredient.of(Items.IRON_INGOT));
        catalysts[0] = Ingredient.of(ItemTags.COALS);
        catalysts[1] = Ingredient.of(Items.GUNPOWDER);
        catalysts[2] = Ingredient.of(Items.REDSTONE);

        alloybuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, ItemInit.STEEL_INGOT.get(), 2.0F, 600,
                flag("steel_making"));
    }

    /**
     * Bronze alloy recipes and bronze recycling recipes.
     *
     * @param consumer
     */
    protected void registerBronzeRecipes(Consumer<IFinishedRecipe> consumer) {
        // bronze alloy recipes
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];

        primary_inputs.add(Ingredient.of(ItemInit.COPPER_INGOT.get()));
        primary_inputs.add(Ingredient.of(ItemInit.TIN_INGOT.get()));
        catalysts[0] = Ingredient.of(Items.BONE_MEAL);
        catalysts[1] = Ingredient.of(Items.GUNPOWDER);
        catalysts[2] = Ingredient.of(Items.REDSTONE);

        alloybuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, ItemInit.BRONZE_INGOT.get(), 2.0F, 600,
                flag("bronze_making"));
    } // end registerBronzeRecipes

    /**
     * Bronze alloy recipes and bronze recycling recipes.
     *
     * @param consumer
     */
    protected void registerSterlingSilverRecipes(Consumer<IFinishedRecipe> consumer) {
        // sterling silver alloy recipes
        List<Ingredient> primary_inputs = new ArrayList<Ingredient>(2);
        Ingredient[] catalysts = new Ingredient[3];

        primary_inputs.add(Ingredient.of(ItemInit.SILVER_INGOT.get()));
        primary_inputs.add(Ingredient.of(ItemInit.COPPER_INGOT.get()));
        catalysts[0] = Ingredient.of(Items.BONE_MEAL);
        catalysts[1] = Ingredient.of(Items.GUNPOWDER);
        catalysts[2] = Ingredient.of(Items.REDSTONE);

        alloybuilder.buildBasicAlloyRecipes(consumer, primary_inputs, catalysts, ItemInit.STERLING_INGOT.get(), 2.0F, 600,
                flag("sterling_silver_making"));
    } // end registerBronzeRecipes

    /**
     * Builds an ICondition representing FlagCondition...
     */
    public ICondition flag(String name) {
        return impl_flag(Mores.MOD_ID, MoresConfig.INSTANCE, name);
    }
}
