package mod.mores.harvestlevel;

import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mores", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HarvestCheck {
    @SubscribeEvent
    public static void doPlayerHarvestCheck(PlayerEvent.HarvestCheck event) {
        boolean success = false;
        if (event.getPlayer().getMainHandItem().getItem() == Items.DIAMOND_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 5) {
                success = true;
            }
        } else if (event.getPlayer().getMainHandItem().getItem() == Items.NETHERITE_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 7) {
                success = true;
            }
            event.setCanHarvest(success);
        }
    }
}
