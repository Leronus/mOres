package mod.mores.util;

import mod.mores.Mores;
import mod.mores.config.Config;
import mod.mores.objects.ItemShield;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.List;

@EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID)
public class TooltipHandler {

    @SubscribeEvent
    public static void onTooltip(ItemTooltipEvent e) {
        if (e.getItemStack().getItem() instanceof ItemShield) {
            Item shield = e.getItemStack().getItem();
            List<ITextComponent> tooltip = e.getToolTip();
            tooltip.add(new StringTextComponent(""));
            tooltip.add(ItemShield.getBlockingTextComponent());
            if (shield == Items.SHIELD) {
                tooltip.add(ItemShield.getDamageReductionTextComponent(Config.defaultDamageReduction.get()));
            } else if (shield instanceof ItemShield) {
                tooltip.add(ItemShield
                        .getDamageReductionTextComponent(((ItemShield) shield).getDamageReduction()));
            } else {
                tooltip.add(ItemShield.getDamageReductionTextComponent(
                        Config.customShieldMaxReduction.get() ? 100 : Config.defaultDamageReduction.get()));
            }
        }
    }
}