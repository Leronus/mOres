package mod.mores.event;

import mod.mores.Mores;
import mod.mores.entity.ModEntityTypes;
import mod.mores.entity.custom.Duck;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
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
        @SubscribeEvent
        public static void entityAttributes(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.DUCK.get(), Duck.createAttributes().build());
        }
    }
}
