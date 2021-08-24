package mod.mores;

import mod.mores.config.MoresConfig;
//import mod.mores.helper.MoresLootModifiers;
import mod.mores.helper.MoresLootModifiers;
import mod.mores.init.RecipeTypeInit;
import mod.mores.recipe.FlagCondition;
import mod.mores.recipe.AlloyFurnaceRecipe;
import mod.mores.world.OreGeneration;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
    /**
     * Recipe Serializer event handler.
     * @param evt
     */
    @SubscribeEvent
    public static void onRegisterRecipeSerializers(RegistryEvent.Register<RecipeSerializer<?>> evt)
    {
        CraftingHelper.register(new FlagCondition.Serializer(MoresConfig.INSTANCE,
                new ResourceLocation(Mores.MOD_ID, "flag")));
        Registry.register(Registry.RECIPE_TYPE, AlloyFurnaceRecipe.TYPE_ID, RecipeTypeInit.ALLOY_TYPE);
        evt.getRegistry().register(RecipeTypeInit.ALLOY_SERIALIZER.setRegistryName(AlloyFurnaceRecipe.TYPE_ID));
    } // end onRegisterRecipeSerializers

    //TODO Fix Autosmeltmodifier
    @SubscribeEvent
    public static void onRegisterModifierSerializers(
            @Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
    {
        event.getRegistry().register(
                new MoresLootModifiers.AutoSmeltLootModifier.Serializer().setRegistryName(
                        new ResourceLocation(Mores.MOD_ID, "auto_smelt_tool")) );
    } // end registerModifierSerializers

    @SubscribeEvent
    public static void CommonSetup(FMLCommonSetupEvent event){
        OreGeneration.initOres();
        OreGeneration.setupOres();
    }
}
