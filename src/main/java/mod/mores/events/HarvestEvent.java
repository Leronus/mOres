package mod.mores.events;

import mod.mores.Mores;
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

/**
 * Event that handles vanilla tool/block harvestlevel changes
 * @author Leronus
 */
@Mod.EventBusSubscriber(modid = Mores.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HarvestEvent {
    public static final Logger LOGGER = LogManager.getLogger();

    /**
     * Called when a player harvests a block
     * @author Leronus
     */
    @SubscribeEvent
    public static void doPlayerHarvestCheck(PlayerEvent.HarvestCheck event) {
        Item mainhandItem = event.getPlayer().getMainHandItem().getItem();
        Block targetBlock = event.getTargetBlock().getBlock();
        //Change vanilla diamond pickaxe harvestlevel
        if (mainhandItem == Items.DIAMOND_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 5) {
                event.setCanHarvest(true);
            }
        //Change vanilla netherite pickaxe harvestlevel
        } else if (mainhandItem == Items.NETHERITE_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 7) {
                event.setCanHarvest(true);
            }
        //Change vanilla netherite & diamond block harvestlevel
        } else if (targetBlock == Blocks.DIAMOND_BLOCK || targetBlock == Blocks.NETHERITE_BLOCK) {
            String mainhandItemName = String.valueOf(mainhandItem);
            String[] tooltypeName = mainhandItemName.split("_");
            ToolType toolType = ToolType.get(tooltypeName[1]);
            //Diamond & netherite block should be minable with harvest level 5 or higher
            if (event.getPlayer().getMainHandItem().getHarvestLevel(toolType, event.getPlayer(), event.getTargetBlock().getBlockState()) >= 5) {
                event.setCanHarvest(true);
            } else {
                event.setCanHarvest(false);
            }
        //Change vanilla obsidian harvestlevel
        } else if (targetBlock == Blocks.OBSIDIAN) {
            String mainhandItemName = String.valueOf(mainhandItem);
            String[] tooltypeName = mainhandItemName.split("_");
            ToolType toolType = ToolType.get(tooltypeName[1]);
            //Obsidian should be minable with harvest level 3 or higher
            if (event.getPlayer().getMainHandItem().getHarvestLevel(toolType, event.getPlayer(), event.getTargetBlock().getBlockState()) >= 3) {
                event.setCanHarvest(true);
            } else {
                event.setCanHarvest(false);
            }
        }
    }
}
