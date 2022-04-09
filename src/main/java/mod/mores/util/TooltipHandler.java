//package mod.mores.util;
//
//import mod.mores.Mores;
//import mod.mores.config.Config;
//import net.minecraft.network.chat.Component;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.ShieldItem;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.event.entity.player.ItemTooltipEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//
//import java.util.List;
//
//@EventBusSubscriber(value = Dist.CLIENT, modid = Mores.MODID)
//public class TooltipHandler {
//    @SubscribeEvent
//    public static void onTooltip(ItemTooltipEvent e) {
//        if (e.getItemStack().getItem() instanceof ShieldItem) {
//            Item shield = e.getItemStack().getItem();
//            List<Component> tooltip = e.getToolTip();
//            tooltip.add(new TextComponent(""));
//            if (shield == Items.SHIELD) {
//                tooltip.add(ItemShield.getDamageReductionTextComponent(Config.defaultDamageReduction.get()));
//            } else if (shield instanceof ItemShield) {
//                tooltip.add(ItemShield
//                        .getDamageReductionTextComponent(((ItemShield) shield).getDamageReduction()));
//            } else {
//                tooltip.add(ItemShield.getDamageReductionTextComponent(
//                        Config.customShieldMaxReduction.get() ? 100 : Config.defaultDamageReduction.get()));
//            }
//        }
//    }
//}