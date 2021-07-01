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

@Mod.EventBusSubscriber(modid = "mores", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HarvestCheck {
    @SubscribeEvent
    public static void doPlayerHarvestCheck(PlayerEvent.HarvestCheck event) {
        Item mainhandItem = event.getPlayer().getMainHandItem().getItem();
        Block targetBlock = event.getTargetBlock().getBlock();
        boolean success = false;

        if (mainhandItem == Items.DIAMOND_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 5) {
                success = true;
            }
        } else if (mainhandItem == Items.NETHERITE_PICKAXE) {
            if (event.getTargetBlock().getHarvestLevel() <= 7) {
                success = true;
            }
        } else if (targetBlock == Blocks.DIAMOND_BLOCK || targetBlock ==  Blocks.NETHERITE_BLOCK){
            String mainhandItemName = String.valueOf(mainhandItem);
            String[] tooltypeName = mainhandItemName.split("_");
            ToolType toolType = ToolType.get(tooltypeName[0]);
            //Diamond & netherite block should be minable with harvest level 5 or higher
            if (event.getPlayer().getMainHandItem().getHarvestLevel(toolType, event.getPlayer(), event.getTargetBlock().getBlockState()) >= 5){
                success = true;
            } else{
                success = false;
            }
        }
        event.setCanHarvest(success);
    }
}
