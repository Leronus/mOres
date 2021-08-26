package mod.mores.events;

import mod.mores.Mores;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID)
public class AttributeEvents {
    @SubscribeEvent
    public void EntityAttributeCreationEvent(){
//        EntityAttributeCreationEvent.put(EntityTypeInit.DUCK.get(), DuckEntity.createAttributes()))
    }
}
