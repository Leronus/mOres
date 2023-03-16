package mod.leronus.mores.integration;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mod.leronus.mores.Mores;
import mod.leronus.mores.api.recipe.AlloyRecipe;
import mod.leronus.mores.block.ModBlocks;
import mod.leronus.mores.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class AlloyFurnaceRecipeCategory implements IRecipeCategory<AlloyRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Mores.MODID, "alloying");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Mores.MODID, "textures/gui/alloy_furnace_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;

    public AlloyFurnaceRecipeCategory(IGuiHelper helper) {
        this.staticFlame = helper.createDrawable(TEXTURE, 82, 114, 14, 14);
        this.animatedFlame = helper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 80);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ALLOY_FURNACE.get()));
    }


    @Override
    public RecipeType<AlloyRecipe> getRecipeType() {
        return JEIPlugin.ALLOY_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Alloy Furnace");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }


    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloyRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 17).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 17).addIngredients(recipe.getIngredients().get(1));

        builder.addSlot(RecipeIngredientRole.CATALYST, 8, 53).addIngredients(recipe.getCatalyst());

        builder.addSlot(RecipeIngredientRole.INPUT, 56, 53).addIngredients(Ingredient.of(ModItems.ANTHRACITE.get(), Items.COAL, Items.COAL_BLOCK, Items.LAVA_BUCKET, Items.OAK_PLANKS,
                Items.ACACIA_PLANKS, Items.BIRCH_PLANKS, Items.JUNGLE_PLANKS, Items.CRIMSON_PLANKS, Items.DARK_OAK_PLANKS, Items.MANGROVE_PLANKS, Items.SPRUCE_PLANKS, Items.WARPED_PLANKS, Items.OAK_LOG,
                Items.ACACIA_LOG, Items.BIRCH_LOG, Items.MANGROVE_LOG, Items.JUNGLE_LOG, Items.DARK_OAK_LOG, Items.SPRUCE_LOG));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 115, 36).addItemStack(recipe.getResultItem());
    }
}