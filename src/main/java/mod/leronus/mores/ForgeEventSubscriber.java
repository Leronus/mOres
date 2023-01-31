package mod.leronus.mores;

import mod.leronus.mores.util.ModVillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = Mores.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class ForgeEventSubscriber
{
//    private static final MoresInjectionLookup lootLookupMap = new MoresInjectionLookup();

    @SubscribeEvent
    public static void LootLoad(final LootTableLoadEvent event)
    {
//        if (MoresConfig.addChestLoot)
//        {
//            LootUtils.LootLoadHandler(Mores.MODID, event, lootLookupMap);
//        } // end-if config allows
    } // end LootLoad()

    /**
     * Intercept villager trades list and modify it.
     */
    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent evt)
    {
        if (evt.getType() == VillagerProfession.ARMORER)
        {
            ModVillagerTrades.ArmorerTrades(evt);
        } // end if ARMORER

        else if (evt.getType() == VillagerProfession.TOOLSMITH)
        {
            ModVillagerTrades.ToolsmithTrades(evt);
        } // end-if TOOLSMITH
        else if (evt.getType() == VillagerProfession.WEAPONSMITH)
        {
            ModVillagerTrades.WeaponsmithTrades(evt);
        } // end-if WEAPONSMITH
    } // end onVillagerTrades()

} // end class