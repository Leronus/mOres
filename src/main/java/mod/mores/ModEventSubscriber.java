package mod.mores;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    //TODO Fix alloy furnace custom recipe
//    /**
//     * Recipe Serializer event handler.
//     * @param evt
//     */
//    @SubscribeEvent
//    public static void onRegisterRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> evt)
//    {
//        //Custom Alloying Recipes
//        CraftingHelper.register(new FlagCondition.Serializer(Config.cfg,
//                new ResourceLocation(Mores.MODID, "flag")));
//        Registry.register(Registry.RECIPE_TYPE, IAlloyFurnaceRecipe.TYPE_ID, RecipeTypeInit.ALLOY_TYPE);
//        evt.getRegistry().register(RecipeTypeInit.ALLOY_SERIALIZER.setRegistryName(IAlloyFurnaceRecipe.TYPE_ID));
//
//        //Shield Decoration Recipes
//        evt.getRegistry().register(RecipeTypeInit.SHIELD_SERIALIZER.setRegistryName(
//                new ResourceLocation(Mores.MODID, "shield_decoration")));
//    } // end onRegisterRecipeSerializers

    //TODO Fix auto smelt feature
//    @SubscribeEvent
//    public static void onRegisterModifierSerializers(
//            @Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
//    {
//        event.getRegistry().register(
//                new MoresLootModifiers.AutoSmeltLootModifier.Serializer().setRegistryName(
//                        new ResourceLocation(Mores.MODID, "auto_smelt_tool")) );
//    } // end registerModifierSerializers
}
