package mod.leronus.mores.config.module.base;

import mod.leronus.mores.config.module.base.config.LoadFeature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.language.ModFileScanData;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Module {

    static final HashMap<ResourceLocation, Module> modules = new HashMap<>();

    private ForgeConfigSpec.ConfigValue<Boolean> enabledConfig;

    ForgeConfigSpec.Builder configBuilder;

    private boolean enabled;
    private boolean canBeDisabled;

    private final ResourceLocation id;
    private final String name;
    private String description = "";

    private final String modId;
    private final ModConfig.Type modConfigType;

    private static final Map<Class<? extends Feature>, Feature> loadedFeatures = new HashMap<>();
    private final Map<Class<? extends Feature>, Feature> features = new HashMap<>();

    Module(String modId, String moduleId, String name, ModConfig.Type modConfigType, ForgeConfigSpec.Builder configBuilder) {
        this.id = new ResourceLocation(modId, moduleId);
        this.name = name;
        this.enabled = true;
        this.canBeDisabled = true;
        this.modId = modId;
        this.modConfigType = modConfigType;
        this.configBuilder = configBuilder;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::readConfig);
    }

    static final Object _lock = new Object();

    public static class Builder {
        private final Module module;

        private Builder(String modId, String id, String name, ModConfig.Type modConfigType, ForgeConfigSpec.Builder configBuilder) {
            this.module = new Module(modId, id, name, modConfigType, configBuilder);
        }

        public static Builder create(String modId, String id, String name, ModConfig.Type modConfigType, ForgeConfigSpec.Builder configBuilder)  {
            return new Builder(modId, id, name, modConfigType, configBuilder);
        }

        public static Builder create(String id, String name, ModConfig.Type modConfigType, ForgeConfigSpec.Builder configBuilder)  {
            String[] split = id.split(":");
            if (split.length != 2)
                throw new IllegalArgumentException("id seems to not be a valid Resource Location. Must be modid:module_id");
            return new Builder(split[0], split[1], name, modConfigType, configBuilder);
        }

        public Builder setDescription(String description) {
            module.description = description;
            return this;
        }

        public Builder canBeDisabled(boolean canBeDisabled) {
            module.canBeDisabled = canBeDisabled;
            return this;
        }

        public Builder enabledByDefault(boolean enabledByDefault) {
            module.enabled = enabledByDefault;
            return this;
        }

        public Module build() {
            module.loadConfig();

            synchronized (_lock) {
                Module.modules.putIfAbsent(module.id, module);
            }

            return module;
        }
    }

    public void setConfigBuilder(final ForgeConfigSpec.Builder builder) {
        if (this.configBuilder == null)
            this.configBuilder = builder;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public ResourceLocation getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Map<Class<? extends Feature>, Feature> getFeatures() {
        return this.features;
    }

    public void loadConfig() {
        if (this.canBeDisabled) {
            if (!this.description.equals("")) {
                this.enabledConfig = this.configBuilder.comment(this.description).define("Enable %s".formatted(this.name), this.enabled);
            }
            else {
                this.enabledConfig = this.configBuilder.define("Enable %s".formatted(this.name), this.enabled);
            }
        }
        else {
            this.enabledConfig = null;
        }
    }

    public void readConfig(final ModConfigEvent event) {
        if (event.getConfig().getType() != this.modConfigType
                || !event.getConfig().getModId().equals(this.modId))
            return;

        if (canBeDisabled)
            this.enabled = enabledConfig.get();
        else
            this.enabled = true;
        this.features.forEach((clazz, feature) -> feature.readConfig(event));
    }

    public void pushConfig() {
        if (this.canBeDisabled) {
            if (this.description.equals("")) {
                this.configBuilder.push(this.getName());
            }
            else {
                this.configBuilder.comment(this.description).push(this.getName());
            }
        }
    }

    public void popConfig() {
        if (this.canBeDisabled) {
            this.configBuilder.pop();
        }
    }

    private static final Type LOAD_FEATURE_TYPE = Type.getType(LoadFeature.class);

    public static void loadFeatures(ModConfig.Type modConfigType, String modId, ClassLoader classLoader) {
        ArrayList<Module> moduleToLoad = new ArrayList<>();
        ModFileScanData modFileScanData = ModList.get().getModFileById(modId).getFile().getScanResult();
        modFileScanData.getAnnotations().stream()
                .filter(annotationData -> LOAD_FEATURE_TYPE.equals(annotationData.annotationType()))
                .sorted(Comparator.comparing(d -> d.getClass().getName()))
                .forEach(annotationData -> {
                    try {
                        Map<String, Object> annotationDataMap = annotationData.annotationData();
                        String moduleString = (String) annotationDataMap.get("module");
                        ResourceLocation moduleId = new ResourceLocation(moduleString);
                        Module module = Module.modules.get(moduleId);
                        if (!Module.modules.containsKey(moduleId)) {
                            return;
                        }
                        if (module.modConfigType != modConfigType)
                            return;

                        Type type = annotationData.clazz();
                        Class<?> clazz = Class.forName(type.getClassName(), false, classLoader);
                        @SuppressWarnings("unchecked")
                        Class<? extends Feature> featureClazz = (Class<? extends Feature>) clazz;
//                        LogHelper.info("Found (%s) InsaneLib Feature class %s".formatted(modConfigType, type.getClassName()));

                        boolean enabledByDefault = true;
                        if (annotationDataMap.containsKey("enabledByDefault")) {
                            enabledByDefault = (Boolean) annotationDataMap.get("enabledByDefault");
                        }

                        boolean canBeDisabled = true;
                        if (annotationDataMap.containsKey("canBeDisabled")) {
                            canBeDisabled = (Boolean) annotationDataMap.get("canBeDisabled");
                        }

                        Feature feature = (Feature) clazz.getDeclaredConstructor(Module.class, boolean.class, boolean.class).newInstance(module, enabledByDefault, canBeDisabled);
                        module.features.put(featureClazz, feature);
                        loadedFeatures.put(featureClazz, feature);
                        if (!moduleToLoad.contains(module)) {
                            moduleToLoad.add(module);
                        }
                    }
                    catch (Exception e) {
                        throw new RuntimeException("Failed to load Module %s".formatted(annotationData), e);
                    }
                });
        moduleToLoad.forEach(m -> {
            m.pushConfig();
            m.getFeatures().forEach((clazz, feature) -> feature.loadConfig());
            m.popConfig();
        });
    }

    public static Map<Class<? extends Feature>, Feature> getAllLoadedFeatures() {
        return loadedFeatures;
    }

    public static Feature getFeature(Class<? extends Feature> featureClazz) {
        return loadedFeatures.get(featureClazz);
    }
}