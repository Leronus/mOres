package mod.mores.entity.event;

import mod.mores.Mores;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

public class ModBusEvents {
    @Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBusEvents {
        @SubscribeEvent
        public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                               event) {
//            event.getRegistry().registerAll(
//                    new AutoSmeltToolModifier.Serializer().setRegistryName
//                            (new ResourceLocation(Mores.MODID,"auto_smelt_tool"))
//            );
        }
    }
}
