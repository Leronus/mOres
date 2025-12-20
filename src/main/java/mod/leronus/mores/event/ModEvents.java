package mod.leronus.mores.event;

import mod.leronus.mores.Mores;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.entity.custom.DuckEntity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ModEvents
{
    @Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.DUCK.get(), DuckEntity.createAttributes().build());
        }
    }

} // end class