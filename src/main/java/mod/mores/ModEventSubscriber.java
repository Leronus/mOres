package mod.mores;

import mod.mores.config.Config;
import mod.mores.util.MoresLootModifiers;
import mod.mores.init.RecipeTypeInit;
import mod.mores.recipe.FlagCondition;
import mod.mores.recipe.IAlloyFurnaceRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    /**
     * Recipe Serializer event handler.
     * @param evt
     */
    @SubscribeEvent
    public static void onRegisterRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> evt)
    {
        CraftingHelper.register(new FlagCondition.Serializer(Config.cfg,
                new ResourceLocation(Mores.MODID, "flag")));
        Registry.register(Registry.RECIPE_TYPE, IAlloyFurnaceRecipe.TYPE_ID, RecipeTypeInit.ALLOY_TYPE);
        evt.getRegistry().register(RecipeTypeInit.ALLOY_SERIALIZER.setRegistryName(IAlloyFurnaceRecipe.TYPE_ID));
    } // end onRegisterRecipeSerializers

    @SubscribeEvent
    public static void onRegisterModifierSerializers(
            @Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
    {
        event.getRegistry().register(
                new MoresLootModifiers.AutoSmeltLootModifier.Serializer().setRegistryName(
                        new ResourceLocation(Mores.MODID, "auto_smelt_tool")) );
    } // end registerModifierSerializers
}
