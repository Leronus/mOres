package mod.leronus.mores.recipe;

import mod.leronus.mores.Mores;
import mod.leronus.mores.api.recipe.AlloyRecipe;
import mod.leronus.mores.api.recipe.IAlloyRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes
{
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Mores.MODID);


    public static final RegistryObject<RecipeType<AlloyRecipe>> ALLOY_TYPE =
            RECIPE_TYPES.register(AlloyRecipe.TYPE_ID.getPath(), ()-> new RecipeType<>() {}) ;


    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Mores.MODID);

    public static final RegistryObject<RecipeSerializer<AlloyRecipe>> ALLOY_SERIALIZER =
            RECIPE_SERIALIZERS.register(IAlloyRecipe.TYPE_ID.getPath(), AlloyRecipe.AlloyRecipeSerializer::new);

    public static final RegistryObject<SimpleCraftingRecipeSerializer<ShieldRecipe>> SHIELD_DECORATION_RECIPE = RECIPE_SERIALIZERS.register("shield_decoration_recipe", () -> new SimpleCraftingRecipeSerializer<>(ShieldRecipe::new));


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
} // end class ModRecipes