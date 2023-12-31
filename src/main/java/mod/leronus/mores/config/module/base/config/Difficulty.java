package mod.leronus.mores.config.module.base.config;

import mod.leronus.mores.config.module.base.ConfigOption;
import mod.leronus.mores.config.module.util.ConfigUtils;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeConfigSpec;

import javax.annotation.Nullable;
import java.util.List;

public class Difficulty {
    public double easy, normal, hard;

    public Difficulty(double easy, double normal, double hard) {
        this.easy = easy;
        this.normal = normal;
        this.hard = hard;
    }

    public double getByDifficulty(Level level) {
        return switch (level.getDifficulty()) {
            case PEACEFUL, EASY -> this.easy;
            case NORMAL -> this.normal;
            case HARD -> this.hard;
        };
    }

    public static class Config extends ConfigOption<Difficulty> {

        private final ForgeConfigSpec.DoubleValue easyConfig;
        private final ForgeConfigSpec.DoubleValue normalConfig;
        private final ForgeConfigSpec.DoubleValue hardConfig;

        public Config(ForgeConfigSpec.Builder builder, String name, String description, Difficulty defaultValue, double rangeMin, double rangeMax) {
            super(builder, name, description);
            List<String> split = ConfigUtils.split(name);
            builder.push(split);
            this.easyConfig = builder.defineInRange("Easy/Peaceful", defaultValue.easy, rangeMin, rangeMax);
            this.normalConfig = builder.defineInRange("Normal", defaultValue.normal, rangeMin, rangeMax);
            this.hardConfig = builder.defineInRange("Hard", defaultValue.hard, rangeMin, rangeMax);
            builder.pop(split.size());
        }

        @Override
        public Difficulty get() {
            return new Difficulty(easyConfig.get(), normalConfig.get(), hardConfig.get());
        }

        @Override
        public void set(Object value) {
            Difficulty difficulty = (Difficulty) value;
            this.easyConfig.set(difficulty.easy);
            this.normalConfig.set(difficulty.normal);
            this.hardConfig.set(difficulty.hard);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return null;
        }
    }
}