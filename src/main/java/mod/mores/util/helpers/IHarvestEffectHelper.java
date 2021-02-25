package mod.mores.util.helpers;

import net.minecraftforge.event.world.BlockEvent;

public interface IHarvestEffectHelper
{

    /**
     * This is the event handler that handles
     * the BlockEvent.HarvestDropsEvent. Original code improved by borrowing from
     * Tinker's Construct autosmelt code.
     *
     * @param event
     */
    public abstract void onHarvestDrops(BlockEvent.HarvestDropsEvent event);

} // end interface.