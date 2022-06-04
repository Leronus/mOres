package mod.mores.util;
import java.util.function.ToIntFunction;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public final class LightUtils
{
    public static ToIntFunction<BlockState> setFixedLight(int foo)
    {
        return (bar) -> { return foo; };
    }

    public static ToIntFunction<BlockState> setSwitchedLight(BooleanProperty prop, int foo)
    {
        return (bar) -> {return bar.getValue(prop) ? foo : 0;};
    }

} // end class