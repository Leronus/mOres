package mod.leronus.mores.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mod.leronus.mores.Mores;
import mod.leronus.mores.api.recipe.AlloyRecipe;
import mod.leronus.mores.api.recipe.IAlloyRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
    public static RecipeType<AlloyRecipe> ALLOY_TYPE =
            new RecipeType<>(AlloyFurnaceRecipeCategory.UID, AlloyRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Mores.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                AlloyFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<AlloyRecipe> recipesAlloying = rm.getAllRecipesFor(AlloyRecipe.Type.INSTANCE);
        registration.addRecipes(ALLOY_TYPE, recipesAlloying);
    }
}
