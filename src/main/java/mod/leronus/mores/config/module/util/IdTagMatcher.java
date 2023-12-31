package mod.leronus.mores.config.module.util;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import mod.leronus.mores.config.module.base.ConfigOption;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITag;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonAdapter(IdTagMatcher.Serializer.class)
public class IdTagMatcher {
    public Type type;
    public ResourceLocation location;
    @Nullable
    public ResourceLocation dimension;

    public IdTagMatcher(Type type, ResourceLocation location, @Nullable ResourceLocation dimension) {
        Objects.requireNonNull(type, "type can't be null");
        Objects.requireNonNull(location, "location can't be null");

        this.type = type;
        this.location = location;
        this.dimension = dimension;
    }

    public IdTagMatcher(Type type, ResourceLocation location) {
        this(type, location, null);
    }

    public IdTagMatcher(Type type, String location, String dimension) {
        this(type, new ResourceLocation(location), new ResourceLocation(dimension));
    }

    public IdTagMatcher(Type type, String location) {
        this(type, new ResourceLocation(location), null);
    }

    /**
     * Returns null if it can't parse the line
     */
    @Nullable
    public static IdTagMatcher parseLine(String line) {
        String[] split = line.split(",");
        if (split.length < 1 || split.length > 2) {
//            LogHelper.warn("Invalid line \"%s\". Format must be modid:entry_or_tag,modid:dimension", line);
            return null;
        }
        ResourceLocation dimension = null;
        if (split.length == 2) {
            dimension = ResourceLocation.tryParse(split[1]);
            if (dimension == null) {
//                LogHelper.warn(String.format("Invalid dimension. Ignoring it. '%s'", line));
            }
        }
        if (split[0].startsWith("#")) {
            ResourceLocation tag = ResourceLocation.tryParse(split[0].substring(1));
            if (tag == null) {
//                LogHelper.warn("Tag is not valid. '%s'", line);
                return null;
            }
            return new IdTagMatcher(Type.TAG, tag, dimension);
        }
        else {
            ResourceLocation id = ResourceLocation.tryParse(split[0]);
            if (id == null) {
//                LogHelper.warn("Id is not valid. '%s'", line);
                return null;
            }
            return new IdTagMatcher(Type.ID, id, dimension);
        }
    }

    public String asString() {
        String s = type == Type.TAG ? "#" : "";
        s += this.location.toString();
        if (this.dimension != null)
            s += "," + this.dimension;
        return s;
    }

    public static ArrayList<? extends IdTagMatcher> parseStringList(List<? extends String> list) {
        ArrayList<IdTagMatcher> idTagMatchers = new ArrayList<>();
        for (String line : list) {
            IdTagMatcher idTagMatcher = IdTagMatcher.parseLine(line);
            if (idTagMatcher != null)
                idTagMatchers.add(idTagMatcher);
        }
        return idTagMatchers;
    }

    public boolean matchesBlock(Block block) {
        return matchesBlock(block, null);
    }

    public boolean matchesBlock(Block block, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<Block> tagKey = TagKey.create(Registries.BLOCK, this.location);
            ITag<Block> tag = ForgeRegistries.BLOCKS.tags().getTag(tagKey);
            if (!tag.contains(block))
                return false;
            return this.dimension == null || this.dimension.equals(dimensionId);
        }
        else {
            ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
            if (id != null && id.equals(this.location))
                return this.dimension == null || this.dimension.equals(dimensionId);
        }
        return false;
    }

    public boolean matchesItem(Item item) {
        return matchesItem(item, null);
    }

    public boolean matchesItem(Item item, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<Item> tagKey = TagKey.create(Registries.ITEM, this.location);
            ITag<Item> tag = ForgeRegistries.ITEMS.tags().getTag(tagKey);
            if (!tag.contains(item))
                return false;
            return this.dimension == null || this.dimension.equals(dimensionId);
        }
        else {
            ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
            if (id != null && id.equals(this.location))
                return this.dimension == null || this.dimension.equals(dimensionId);
        }
        return false;
    }

    public boolean matchesFluid(Fluid fluid) {
        return matchesFluid(fluid, null);
    }

    public boolean matchesFluid(Fluid fluid, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<Fluid> tagKey = TagKey.create(Registries.FLUID, this.location);
            ITag<Fluid> fluidTag = ForgeRegistries.FLUIDS.tags().getTag(tagKey);
            if (!fluidTag.contains(fluid))
                return false;
            return this.dimension == null || this.dimension.equals(dimensionId);
        }
        else {
            ResourceLocation id = ForgeRegistries.FLUIDS.getKey(fluid);
            if (id != null && id.equals(this.location))
                return this.dimension == null || this.dimension.equals(dimensionId);
        }
        return false;
    }

    public boolean matchesEntity(Entity entity) {
        return matchesEntity(entity.getType(), null);
    }
    public boolean matchesEntity(Entity entity, @Nullable ResourceLocation dimensionId) {
        return matchesEntity(entity.getType(), dimensionId);
    }
    public boolean matchesEntity(EntityType<?> entityType) {
        return matchesEntity(entityType, null);
    }

    public boolean matchesEntity(EntityType<?> entityType, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<EntityType<?>> tagKey = TagKey.create(Registries.ENTITY_TYPE, this.location);
            ITag<EntityType<?>> tag = ForgeRegistries.ENTITY_TYPES.tags().getTag(tagKey);
            if (!tag.contains(entityType))
                return false;
            return this.dimension == null || this.dimension.equals(dimensionId);
        }
        else {
            ResourceLocation id = ForgeRegistries.ENTITY_TYPES.getKey(entityType);
            if (id != null && id.equals(this.location))
                return this.dimension == null || this.dimension.equals(dimensionId);
        }
        return false;
    }

    public boolean matchesBiome(Holder<Biome> biome) {
        return matchesBiome(biome, null);
    }

    public boolean matchesBiome(Holder<Biome> biome, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<Biome> tagKey = TagKey.create(Registries.BIOME, this.location);
            return biome.is(tagKey) && (this.dimension == null || this.dimension.equals(dimensionId));
        }
        else {
            return biome.is(this.location) && (this.dimension == null || this.dimension.equals(dimensionId));
        }
    }

    public boolean matchesEnchantment(Enchantment enchantment) {
        return matchesEnchantment(enchantment, null);
    }

    public boolean matchesEnchantment(Enchantment enchantment, @Nullable ResourceLocation dimensionId) {
        if (this.type == Type.TAG) {
            TagKey<Enchantment> tagKey = TagKey.create(Registries.ENCHANTMENT, this.location);
            ITag<Enchantment> tag = ForgeRegistries.ENCHANTMENTS.tags().getTag(tagKey);
            if (!tag.contains(enchantment))
                return false;
            return this.dimension == null || this.dimension.equals(dimensionId);
        }
        else {
            ResourceLocation id = ForgeRegistries.ENCHANTMENTS.getKey(enchantment);
            if (id != null && id.equals(this.location))
                return this.dimension == null || this.dimension.equals(dimensionId);
        }
        return false;
    }

    public boolean matchesDimension(ResourceLocation dimension) {
        return this.dimension == null || this.dimension.equals(dimension);
    }

    public List<Block> getAllBlocks() {
        List<Block> blocks = new ArrayList<>();
        if (this.type == Type.ID) {
            if (!ForgeRegistries.BLOCKS.containsKey(this.location))
                return blocks;
            Block block = ForgeRegistries.BLOCKS.getValue(this.location);
            if (block != null)
                blocks.add(block);
        }
        else {
            TagKey<Block> tagKey = TagKey.create(Registries.BLOCK, this.location);
            ITag<Block> blockTag = ForgeRegistries.BLOCKS.tags().getTag(tagKey);
            blocks.addAll(blockTag.stream().toList());
        }
        return blocks;
    }

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        if (this.type == Type.ID) {
            if (!ForgeRegistries.ITEMS.containsKey(this.location))
                return items;
            Item item = ForgeRegistries.ITEMS.getValue(this.location);
            if (item != null)
                items.add(item);
        }
        else {
            TagKey<Item> tagKey = TagKey.create(Registries.ITEM, this.location);
            ITag<Item> itemTag = ForgeRegistries.ITEMS.tags().getTag(tagKey);
            items.addAll(itemTag.stream().toList());
        }
        return items;
    }

    public List<ItemStack> getAllItemStacks() {
        List<ItemStack> itemStacks = new ArrayList<>();
        this.getAllItems().forEach(item -> itemStacks.add(new ItemStack(item)));
        return itemStacks;
    }

    public List<Fluid> getAllFluids() {
        List<Fluid> fluids = new ArrayList<>();
        if (this.type == Type.ID) {
            if (!ForgeRegistries.FLUIDS.containsKey(this.location))
                return fluids;
            Fluid fluid = ForgeRegistries.FLUIDS.getValue(this.location);
            if (fluid != null)
                fluids.add(fluid);
        }
        else {
            TagKey<Fluid> tagKey = TagKey.create(Registries.FLUID, this.location);
            ITag<Fluid> fluidTag = ForgeRegistries.FLUIDS.tags().getTag(tagKey);
            fluids.addAll(fluidTag.stream().toList());
        }
        return fluids;
    }

    public List<FluidStack> getAllFluidStacks() {
        List<FluidStack> fluidStacks = new ArrayList<>();
        this.getAllFluids().forEach(item -> fluidStacks.add(new FluidStack(item, 1000)));
        return fluidStacks;
    }

    public List<EntityType<?>> getAllEntityTypes() {
        List<EntityType<?>> entityTypes = new ArrayList<>();
        if (this.type == Type.ID) {
            if (!ForgeRegistries.ENTITY_TYPES.containsKey(this.location))
                return entityTypes;
            EntityType<?> entityType = ForgeRegistries.ENTITY_TYPES.getValue(this.location);
            if (entityType != null)
                entityTypes.add(entityType);
        }
        else {
            TagKey<EntityType<?>> tagKey = TagKey.create(Registries.ENTITY_TYPE, this.location);
            ITag<EntityType<?>> entityTag = ForgeRegistries.ENTITY_TYPES.tags().getTag(tagKey);
            entityTypes.addAll(entityTag.stream().toList());
        }
        return entityTypes;
    }

    public static class Config extends ConfigOption<IdTagMatcher> {

        private final ForgeConfigSpec.ConfigValue<String> idTagMatcherValue;

        public Config(ForgeConfigSpec.Builder builder, String name, String description, IdTagMatcher defaultValue) {
            super(builder, name, description);
            idTagMatcherValue = builder.define(name, defaultValue.asString());
        }

        @Override
        public IdTagMatcher get() {
            return IdTagMatcher.parseLine(idTagMatcherValue.get());
        }

        @Override
        public void set(Object value) {
            this.idTagMatcherValue.set(((IdTagMatcher)value).asString());
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return idTagMatcherValue.getPath();
        }
    }

    public enum Type {
        ID,
        TAG
    }

    public static class Serializer implements JsonDeserializer<IdTagMatcher>, JsonSerializer<IdTagMatcher> {
        @Override
        public IdTagMatcher deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if (json.isJsonPrimitive()) {
                String s = json.getAsString();
                return new IdTagMatcher(s.startsWith("#") ? Type.TAG : Type.ID, s.replace("#", ""));
            }

            String id = GsonHelper.getAsString(json.getAsJsonObject(), "id", "");
            String tag = GsonHelper.getAsString(json.getAsJsonObject(), "tag", "");
            String dimension = GsonHelper.getAsString(json.getAsJsonObject(), "dimension", "");

            if (!id.equals("") && !ResourceLocation.isValidResourceLocation(id)) {
                throw new JsonParseException("Invalid id for IdTagMatcher: %s".formatted(id));
            }
            if (!tag.equals("") && !ResourceLocation.isValidResourceLocation(id)) {
                throw new JsonParseException("Invalid tag for IdTagMatcher: %s".formatted(tag));
            }
            if (!dimension.equals("") && !ResourceLocation.isValidResourceLocation(dimension)) {
                throw new JsonParseException("Invalid dimension for IdTagMatcher: %s".formatted(dimension));
            }

            if (!id.equals("") && !tag.equals("")){
                throw new JsonParseException("Invalid IdTagMatcher containing both tag (%s) and id (%s)".formatted(tag, id));
            }
            else if (!id.equals("")) {
                if (dimension.equals("")) {
                    return new IdTagMatcher(Type.ID, id);
                }
                else {
                    return new IdTagMatcher(Type.ID, id, dimension);
                }
            }
            else if (!tag.equals("")){
                if (dimension.equals("")) {
                    return new IdTagMatcher(Type.TAG, tag);
                }
                else {
                    return new IdTagMatcher(Type.TAG, tag, dimension);
                }
            }
            else {
                throw new JsonParseException("Invalid IdTagMatcher missing either tag and id");
            }
        }

        @Override
        public JsonElement serialize(IdTagMatcher src, java.lang.reflect.Type typeOfSrc, JsonSerializationContext context) {
            JsonObject jsonObject = new JsonObject();
            if (src.type == Type.ID) {
                jsonObject.addProperty("id", src.location.toString());
            }
            else if (src.type == Type.TAG) {
                jsonObject.addProperty("tag", src.location.toString());
            }
            if (src.dimension != null) {
                jsonObject.addProperty("dimension", src.dimension.toString());
            }
            return jsonObject;
        }
    }
}