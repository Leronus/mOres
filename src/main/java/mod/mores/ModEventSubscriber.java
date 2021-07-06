package mod.mores;

import mod.mores.config.MoresConfig;
import mod.mores.init.RecipeTypeInit;
import mod.mores.recipe.FlagCondition;
import mod.mores.recipe.IAlloyFurnaceRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    /**
     * Recipe Serializer event handler.
     * @param evt
     */
    @SubscribeEvent
    public static void onRegisterRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> evt)
    {
        CraftingHelper.register(new FlagCondition.Serializer(MoresConfig.INSTANCE,
                new ResourceLocation(Mores.MOD_ID, "flag")));
        Registry.register(Registry.RECIPE_TYPE, IAlloyFurnaceRecipe.TYPE_ID, RecipeTypeInit.ALLOY_TYPE);
        evt.getRegistry().register(RecipeTypeInit.ALLOY_SERIALIZER.setRegistryName(IAlloyFurnaceRecipe.TYPE_ID));
    } // end onRegisterRecipeSerializers
}