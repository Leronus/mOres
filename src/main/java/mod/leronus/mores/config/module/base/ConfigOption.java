package mod.leronus.mores.config.module.base;

import net.minecraftforge.common.ForgeConfigSpec;

import javax.annotation.Nullable;
import java.util.List;

public abstract class ConfigOption<T> {

    String name;
    ForgeConfigSpec.Builder builder;

    public ConfigOption(ForgeConfigSpec.Builder builder, String name, String description) {
        this.builder = builder;
        this.name = name;
        if (!"".equals(description)) {
            builder.comment(description);
        }
    }

    public abstract T get();

    public abstract void set(Object value);

    /**
     * Return the path of the config if the config is a simple one with one ConfigValue
     */
    @Nullable
    public abstract List<String> getConfigPath();

    @Override
    public String toString() {
        return "ConfigOpt{name='%s'}".formatted(name);
    }

    public static class GenericOption extends ConfigOption<Object> {

        public final ForgeConfigSpec.ConfigValue<Object> valueConfig;

        public GenericOption(ForgeConfigSpec.Builder builder, String name, String description, Object defaultValue) {
            super(builder, name, description);
            valueConfig = builder.define(name, defaultValue);
        }

        @Override
        public Object get() {
            return this.valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set(value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class DoubleOption extends ConfigOption<java.lang.Double> {

        public final ForgeConfigSpec.DoubleValue valueConfig;

        public DoubleOption(ForgeConfigSpec.Builder builder, String name, String description, double defaultValue, double min, double max) {
            super(builder, name, description);
            valueConfig = builder.defineInRange(name, defaultValue, min, max);
        }

        public java.lang.Double get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((Double) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class IntOption extends ConfigOption<Integer> {

        public final ForgeConfigSpec.IntValue valueConfig;

        public IntOption(ForgeConfigSpec.Builder builder, String name, String description, int defaultValue, int min, int max) {
            super(builder, name, description);
            valueConfig = builder.defineInRange(name, defaultValue, min, max);
        }

        public Integer get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((Integer) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class BoolOption extends ConfigOption<Boolean> {

        public final ForgeConfigSpec.BooleanValue valueConfig;

        public BoolOption(ForgeConfigSpec.Builder builder, String name, String description, boolean defaultValue) {
            super(builder, name, description);
            valueConfig = builder.define(name, defaultValue);
        }

        public Boolean get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((Boolean) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class StringOption extends ConfigOption<String> {

        public final ForgeConfigSpec.ConfigValue<String> valueConfig;

        public StringOption(ForgeConfigSpec.Builder builder, String name, String description, String defaultValue) {
            super(builder, name, description);
            valueConfig = builder.define(this.name, defaultValue);
        }

        public String get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((String) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class StringListOption extends ConfigOption<List<? extends String>> {

        public final ForgeConfigSpec.ConfigValue<List<? extends String>> valueConfig;

        public StringListOption(ForgeConfigSpec.Builder builder, String name, String description, List<String> defaultValue) {
            super(builder, name, description);
            valueConfig = builder.defineList(this.name, defaultValue, o -> o instanceof String);
        }

        public List<? extends String> get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((List<? extends String>) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }

    public static class EnumOption<T extends Enum<T>> extends ConfigOption<T> {

        public final ForgeConfigSpec.ConfigValue<T> valueConfig;

        public EnumOption(ForgeConfigSpec.Builder builder, String name, String description, T defaultValue) {
            super(builder, name, description);
            valueConfig = builder.defineEnum(name, defaultValue);
        }

        @Override
        public T get() {
            return valueConfig.get();
        }

        @Override
        public void set(Object value) {
            this.valueConfig.set((T) value);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return valueConfig.getPath();
        }
    }
}