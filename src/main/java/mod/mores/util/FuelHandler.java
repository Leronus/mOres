package mod.mores.util;

import mod.mores.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FuelHandler {
    public static final FuelHandler instance = new FuelHandler();
    @SubscribeEvent
    public void onFurnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack fuelStack = event.getItemStack();
        Item fuel = fuelStack.getItem();

        if (fuel == ModItems.ROOIEKOOL.get()){
            event.setBurnTime(400);
        }
    }
}
