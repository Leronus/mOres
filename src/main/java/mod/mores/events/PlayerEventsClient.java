package mod.mores.events;

import mod.mores.Mores;
import mod.mores.init.BlockInit;
import mod.mores.init.SoundTypeInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEventsClient {
    @SubscribeEvent
    public static void onPlayerToss(ItemTossEvent itemTossEvent){
        PlayerEntity player = itemTossEvent.getPlayer();
        World world = player.getCommandSenderWorld();
        BlockState state = world.getBlockState(player.blockPosition().below());

        if (state.getBlock() == BlockInit.TURQUOISE_BLOCK.get()){
            Mores.LOGGER.info("Player tossed on turquoise block!");
            //Client
            itemTossEvent.getEntity().playSound(SoundTypeInit.DARUDE_SANDSTORM.get(), 0.6F, 1.0F);
            //Server
            world.playSound(null, player.blockPosition(), SoundTypeInit.DARUDE_SANDSTORM.get(), SoundCategory.MUSIC,0.6F, 1.0F);
        }
    }
}
