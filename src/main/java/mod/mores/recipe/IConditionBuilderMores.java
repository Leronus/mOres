package mod.mores.recipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;

/**
 * Condition builders. Inspired by Forge's IConditionBuilder.
 * Borrowed from SimpleOres2 Fusion fork
 * @author Sinhika
 *
 */
public interface IConditionBuilderMores
{
    /**
     * Builds an ICondition representing FlagCondition...
     *
     */
    public ICondition flag(String name);

    default ICondition impl_flag(String modid, String name )
    {
        return new FlagCondition(name, new ResourceLocation(modid, "flag"));
    }
} // end interface