package mod.mores.recipe;

import mod.mores.Mores;
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

    public static final RegistryObject<RecipeType<IAlloyRecipe>> ALLOY_TYPE =
            RECIPE_TYPES.register(IAlloyRecipe.TYPE_ID.getPath(), ()-> new RecipeType<IAlloyRecipe>() {}) ;


    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.RECIPE_SERIALIZERS, Mores.MODID);


    public static final RegistryObject<RecipeSerializer<AlloyRecipe>> ALLOY_SERIALIZER =
            RECIPE_SERIALIZERS.register(IAlloyRecipe.TYPE_ID.getPath(), () -> new AlloyRecipe.AlloyRecipeSerializer());

    public static final RegistryObject<RecipeSerializer<ShieldRecipe>> SHIELD_SERIALIZER =
            RECIPE_SERIALIZERS.register("shield_decoration", ()-> ShieldRecipe.SERIALIZER);

} // end class ModRecipes