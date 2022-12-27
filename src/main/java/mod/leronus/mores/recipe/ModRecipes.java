package mod.leronus.mores.recipe;

import mod.leronus.mores.Mores;
import mod.leronus.mores.api.recipe.AlloyRecipe;
import mod.leronus.mores.api.recipe.IAlloyRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes
{
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY.location(), Mores.MODID);

//    public static final RecipeType<IAlloyRecipe> ALLOY_TYPE = RecipeType.register(IAlloyRecipe.TYPE_ID.toString());
//    Registry.register(Registry.RECIPE_TYPE, IAlloyRecipe.TYPE_ID, ModRecipes.ALLOY_TYPE);

    public static final RegistryObject<RecipeType<IAlloyRecipe>> ALLOY_TYPE =
            RECIPE_TYPES.register(IAlloyRecipe.TYPE_ID.getPath(), ()-> new RecipeType<IAlloyRecipe>() {}) ;


    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.RECIPE_SERIALIZERS, Mores.MODID);

    //evt.getRegistry().register(ModRecipes.ALLOY_SERIALIZER.setRegistryName(IAlloyRecipe.TYPE_ID));

    public static final RegistryObject<RecipeSerializer<AlloyRecipe>> ALLOY_SERIALIZER =
            RECIPE_SERIALIZERS.register(IAlloyRecipe.TYPE_ID.getPath(), () -> new AlloyRecipe.AlloyRecipeSerializer());


} // end class ModRecipes