package mod.mores.util;

import mod.mores.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FuelHandler {
    public static final FuelHandler instance = new FuelHandler();
    @SubscribeEvent
    public void onFurnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack fuelStack = event.getItemStack();
        Item fuel = fuelStack.getItem();

        if (fuel == ItemInit.ROOIEKOOL.get()){
            event.setBurnTime(400);
        }
    }
}
