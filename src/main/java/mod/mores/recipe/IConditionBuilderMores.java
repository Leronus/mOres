package mod.mores.recipe;

import mod.mores.Mores;
import mod.mores.config.IConfig;
import mod.mores.config.MoresConfig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;

/**
 * Condition builders. Inspired by Forge's IConditionBuilder.
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

    default ICondition impl_flag(String modid, MoresConfig cfg, String name )
    {
        return new FlagCondition(cfg, name, new ResourceLocation(modid, "flag"));
    }
} // end interface