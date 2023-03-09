package mod.leronus.mores.event;

import mod.leronus.mores.Mores;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.entity.custom.DuckEntity;
import mod.leronus.mores.sound.ModSounds;
import mod.leronus.mores.util.ModVillagerTrades;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ModEvents
{
//    private static final MoresInjectionLookup lootLookupMap = new MoresInjectionLookup();

    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
//        if (MoresConfig.addChestLoot)
//        {
//            LootUtils.LootLoadHandler(Mores.MODID, event, lootLookupMap);
//        } // end-if config allows
    } // end LootLoad()

    /**
     * Intercept villager trades list and modify it.
     */
    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent evt)
    {
        if (evt.getType() == VillagerProfession.ARMORER)
        {
            ModVillagerTrades.ArmorerTrades(evt);
        } // end if ARMORER

        else if (evt.getType() == VillagerProfession.TOOLSMITH)
        {
            ModVillagerTrades.ToolsmithTrades(evt);
        } // end-if TOOLSMITH
        else if (evt.getType() == VillagerProfession.WEAPONSMITH)
        {
            ModVillagerTrades.WeaponsmithTrades(evt);
        } // end-if WEAPONSMITH
    } // end onVillagerTrades()

    @Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.DUCK.get(), DuckEntity.createAttributes().build());
        }
    }

    //PlayerTickEvent
    @SubscribeEvent
    public static void LivingHurtEvent(final LivingHurtEvent event)
    {
        if (event.getEntity() instanceof Player && event.getSource() == DamageSource.LAVA) {
            // Get the player entity
            Player player = (Player) event.getEntity();

            // Stop the 'music' sound from playing for the player
//            player.level.playSound(player, player, SoundEvents.UI_BUTTON_CLICK, SoundSource.MASTER, 1.0f, 1.0f);

            // Play the 'bruh' sound for the player at their position
            Mores.LOGGER.debug("Player hurt by lava");
            System.out.println("Player hurt by lava");
            player.level.playSound(player, player, new SoundEvent(new ResourceLocation("mores:bruh")), SoundSource.AMBIENT, 0.7f, 1.0f);
        }
    } // end LivingHurtEvent()


    //FluidPlaceBlockEvent

    //PlayerSleepInBedEvent
    //LivingHurtEvent
    //LivingDeathEvent
    //LivingFallEvent

} // end class