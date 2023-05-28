package mod.leronus.mores.event;

import mod.leronus.mores.Mores;
import mod.leronus.mores.block.ModBlocks;
import mod.leronus.mores.config.Config;
import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.entity.custom.DuckEntity;
import mod.leronus.mores.sound.ModSounds;
import mod.leronus.mores.util.ModVillagerTrades;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
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

    /**
     * Fires when the player dies
     * When player dies to lava, play bruh sound
     * When player dies to fall damage, play yeah sound
     * @param event LivingDeathEvent
     * @author Leronus7000
     */
    @SubscribeEvent
    public static void LivingDeathEvent(final LivingDeathEvent event)
    {
        if (Config.enableCustomDeathSounds.get()) {
            if (event.getEntity() instanceof ServerPlayer) {
                if (event.getSource() == DamageSource.LAVA) {
                    // Get the player entity
                    Player player = (Player) event.getEntity();
                    // Play the 'bruh' sound for the player at their position
                    player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.BRUH.get(), SoundSource.AMBIENT, 0.7f, 1.0f);
                } else if (event.getSource() == DamageSource.FALL) {
                    // Get the player entity
                    Player player = (Player) event.getEntity();
                    // Play the 'yeahhh' sound for the player at their position
                    player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.YEAH.get(), SoundSource.AMBIENT, 0.7f, 1.0f);
                } else if (event.getSource().getDirectEntity() instanceof ServerPlayer){
                    // Get the player entity
                    Player player = (Player) event.getEntity();
                    player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.WATWAAROM.get(), SoundSource.AMBIENT, 0.7f, 1.0f);
                }
            }
        }
    } // end LivingDeathEvent()

    /**
     * Fires when the player hurts
     * When a player is hurt by another player, play oof sound
     * @param event LivingHurtEvent
     * @author Leronus7000
     */
    @SubscribeEvent
    public static void LivingHurtEvent(final LivingHurtEvent event)
    {
        if (Config.enableCustomPlayerHurtSound.get()) {
            if (event.getEntity() instanceof ServerPlayer) {
                //Get the entity that deals the damage
                if (event.getSource().getEntity() instanceof ServerPlayer) {
                    // Get the player entity
                    Player player = (Player) event.getEntity();
                    // Play the 'oof' sound for the player at their position
                    player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.OOF.get(), SoundSource.AMBIENT, 0.45f, 1.0f);
                }
            }
        }
    } // end LivingDeathEvent()


    /**
     * Fires when the player sleeps
     * When player goes to bed, play aauugh sound
     * @param event PlayerSleepInBedEvent
     * @author Leronus7000
     */
    @SubscribeEvent
    public static void PlayerSleepInBedEvent(final PlayerSleepInBedEvent event) {
        if (Config.enableCustomPlayerSleepingSound.get()) {
            if (event.getEntity() instanceof ServerPlayer player) {
                // Play the 'aauugh' sound for the player at their position
                player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.AAUUGH.get(), SoundSource.AMBIENT, 0.2f, 1.0f);
            }
        }
    } // end PlayerSleepInBedEvent()

    @SubscribeEvent
    public static void ItemTossEvent(final ItemTossEvent tossEvent){
        if (tossEvent.getPlayer() instanceof ServerPlayer player) {
            BlockState state = tossEvent.getPlayer().getBlockStateOn();
            if (state.getBlock() == ModBlocks.TURQUOISE_BLOCK.get()) {
                player.level.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.WORTEL9.get(), SoundSource.AMBIENT, 0.8f, 1.0f);
            }
        }
    }

    //LivingHurtEvent


} // end class