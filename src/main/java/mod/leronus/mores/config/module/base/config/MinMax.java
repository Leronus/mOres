package mod.leronus.mores.config.module.base.config;

import mod.leronus.mores.config.module.base.ConfigOption;
import mod.leronus.mores.config.module.util.ConfigUtils;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.common.ForgeConfigSpec;

import javax.annotation.Nullable;
import java.util.List;

public class MinMax {
    public double min, max;

    public MinMax(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public MinMax(double value) {
        this.min = value;
        this.max = value;
    }

    /**
     * Returns a random number between min (included) and max (excluded)
     */
    public double getRandBetween(RandomSource random) {
        return Mth.nextDouble(random, this.min, this.max - 1);
    }

    /**
     * Returns an integer random number between min (included) and max (excluded)
     */
    public int getIntRandBetween(RandomSource random) {
        return Mth.nextInt(random, (int) this.min, (int) this.max - 1);
    }

    public static class Config extends ConfigOption<MinMax> {

        private final ForgeConfigSpec.DoubleValue minConfig;
        private final ForgeConfigSpec.DoubleValue maxConfig;

        public Config(ForgeConfigSpec.Builder builder, String name, String description, MinMax defaultValue, double rangeMin, double rangeMax) {
            super(builder, name, description);
            List<String> split = ConfigUtils.split(name);
            builder.push(split);
            minConfig = builder.defineInRange("Minimum", defaultValue.min, rangeMin, rangeMax);
            maxConfig = builder.defineInRange("Maximum", defaultValue.max, rangeMin, rangeMax);
            builder.pop(split.size());
        }

        @Override
        public MinMax get() {
            return new MinMax(minConfig.get(), maxConfig.get());
        }

        @Override
        public void set(Object value) {
            MinMax minMax = (MinMax) value;
            this.minConfig.set(minMax.min);
            this.maxConfig.set(minMax.max);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return null;
        }
    }
}