package mod.mores.events;

import mod.mores.Mores;
import mod.mores.entity.DuckEntity;
import mod.mores.init.EntityTypeInit;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.IModBusEvent;

import java.util.Map;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID)
public class AttributeEvents {
    @SubscribeEvent
    public void EntityAttributeCreationEvent(){
//        EntityAttributeCreationEvent.put(EntityTypeInit.DUCK.get(), DuckEntity.createAttributes()))
    }
}
