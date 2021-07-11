package mod.mores.events;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import mod.mores.init.SoundTypeInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {
    @SubscribeEvent
    public static void onPlayerToss(ItemTossEvent itemTossEvent){
        PlayerEntity player = itemTossEvent.getPlayer();
        World world = player.getCommandSenderWorld();
        BlockState state = world.getBlockState(player.blockPosition().below());

        if (state.getBlock() == BlockInit.TURQUOISE_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundTypeInit.DARUDE_SANDSTORM.get(), 0.6F, 1.0F);
            //Server
            world.playSound(null, player.blockPosition(), SoundTypeInit.DARUDE_SANDSTORM.get(), SoundCategory.MUSIC,0.05F, 1.0F);
        }
        else if (state.getBlock() == BlockInit.STERLING_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundTypeInit.RICK_ASTLEY.get(), 0.6F, 1.0F);
            //Server
            world.playSound(null, player.blockPosition(), SoundTypeInit.RICK_ASTLEY.get(), SoundCategory.MUSIC,0.05F, 1.0F);
        }
        else if (state.getBlock() == BlockInit.BRONZE_BLOCK.get()){
            //Client
            itemTossEvent.getEntity().playSound(SoundTypeInit.CRAZY_FROG.get(), 0.6F, 1.0F);
            //Server
            world.playSound(null, player.blockPosition(), SoundTypeInit.CRAZY_FROG.get(), SoundCategory.MUSIC, 0.05F, 1.0F);
        }
    }
}
