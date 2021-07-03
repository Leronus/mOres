package mod.mores.harvestlevel;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = "mores", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HarvestCheck {
    public static final Logger LOGGER = LogManager.getLogger();
    @SubscribeEvent
    public static void doPlayerHarvestCheck(PlayerEvent.HarvestCheck event) {
        Item mainhandItem = event.getPlayer().getMainHandItem().getItem();
        Block targetBlock = event.getTargetBlock().getBlock();

        if (mainhandItem == Items.DIAMOND_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 5) {
                event.setCanHarvest(true);
            }
        } else if (mainhandItem == Items.NETHERITE_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 7) {
                event.setCanHarvest(true);
            }
        } else if (targetBlock == Blocks.DIAMOND_BLOCK || targetBlock ==  Blocks.NETHERITE_BLOCK){
            String mainhandItemName = String.valueOf(mainhandItem);
            String[] tooltypeName = mainhandItemName.split("_");
            ToolType toolType = ToolType.get(tooltypeName[1]);
            //Diamond & netherite block should be minable with harvest level 5 or higher
            if (event.getPlayer().getMainHandItem().getHarvestLevel(toolType, event.getPlayer(), event.getTargetBlock().getBlockState()) >= 5){
                event.setCanHarvest(true);
            } else{
                event.setCanHarvest(false);
            }
        }
    }
}
