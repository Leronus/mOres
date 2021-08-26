package mod.mores.events;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import mod.mores.init.SoundInit;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Event that handles all sound easter eggs
 * @author Leronus
 */
@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {
    /**
     * Called when a player throws an item in the world
     * @author Leronus
     */
    @SubscribeEvent
    public static void onPlayerToss(ItemTossEvent itemTossEvent){
        Player player = itemTossEvent.getPlayer();
        Level level = player.getCommandSenderWorld();
        BlockState state = level.getBlockState(player.blockPosition().below());

        if (state.getBlock() == BlockInit.TURQUOISE_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundInit.DARUDE_SANDSTORM.get(), 0.1F, 1.0F);
            //Server
            level.playSound(null, player.blockPosition(), SoundInit.DARUDE_SANDSTORM.get(), SoundSource.MUSIC,0.1F, 1.0F);
        }
        else if (state.getBlock() == BlockInit.STERLING_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundInit.RICK_ASTLEY.get(), 0.1F, 1.0F);
            //Server
            level.playSound(null, player.blockPosition(), SoundInit.RICK_ASTLEY.get(), SoundSource.MUSIC,0.1F, 1.0F);
        }
        else if (state.getBlock() == BlockInit.BRONZE_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundInit.CRAZY_FROG.get(), 0.1F, 1.0F);
            //Server
            level.playSound(null, player.blockPosition(), SoundInit.CRAZY_FROG.get(), SoundSource.MUSIC, 0.1F, 1.0F);
        }
    }
}
