package mod.leronus.mores.config.module.base.config;

import mod.leronus.mores.config.module.base.ConfigOption;
import mod.leronus.mores.config.module.util.ConfigUtils;
import mod.leronus.mores.config.module.util.IdTagMatcher;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.ForgeConfigSpec;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IdTagMatcher Black/Whitelist
 */
public class Blacklist {
    public List<IdTagMatcher> blacklist;
    public boolean blacklistAsWhitelist;

    public Blacklist(List<IdTagMatcher> blacklist, boolean blacklistAsWhitelist) {
        this.blacklist = blacklist;
        this.blacklistAsWhitelist = blacklistAsWhitelist;
    }

    public Blacklist(List<IdTagMatcher> blacklist) {
        this(blacklist, false);
    }

    public Blacklist() {
        this(Collections.emptyList(), false);
    }

    public List<String> getStringList() {
        List<String> list = new ArrayList<>();
        for (IdTagMatcher idTagMatcher : this.blacklist) {
            list.add(idTagMatcher.asString());
        }
        return list;
    }

    public boolean isBlockBlackOrNotWhiteListed(Block entry) {
        //Check for black/whitelist
        boolean isInWhitelist = false;
        boolean isInBlacklist = false;
        for (IdTagMatcher blacklistEntry : this.blacklist) {
            if (blacklistEntry.matchesBlock(entry)) {
                if (!this.blacklistAsWhitelist)
                    isInBlacklist = true;
                else
                    isInWhitelist = true;
                break;
            }
        }

        return isInBlacklist || (!isInWhitelist && this.blacklistAsWhitelist);
    }

    public boolean isItemBlackOrNotWhiteListed(Item entry) {
        //Check for black/whitelist
        boolean isInWhitelist = false;
        boolean isInBlacklist = false;
        for (IdTagMatcher blacklistEntry : this.blacklist) {
            if (blacklistEntry.matchesItem(entry)) {
                if (!this.blacklistAsWhitelist)
                    isInBlacklist = true;
                else
                    isInWhitelist = true;
                break;
            }
        }

        return isInBlacklist || (!isInWhitelist && this.blacklistAsWhitelist);
    }

    public boolean isFluidBlackOrNotWhiteListed(Fluid entry) {
        //Check for black/whitelist
        boolean isInWhitelist = false;
        boolean isInBlacklist = false;
        for (IdTagMatcher blacklistEntry : this.blacklist) {
            if (blacklistEntry.matchesFluid(entry)) {
                if (!this.blacklistAsWhitelist)
                    isInBlacklist = true;
                else
                    isInWhitelist = true;
                break;
            }
        }

        return isInBlacklist || (!isInWhitelist && this.blacklistAsWhitelist);
    }

    public boolean isEntityBlackOrNotWhitelist(Entity entry) {
        //Check for black/whitelist
        boolean isInWhitelist = false;
        boolean isInBlacklist = false;
        for (IdTagMatcher blacklistEntry : this.blacklist) {
            if (blacklistEntry.matchesEntity(entry)) {
                if (!this.blacklistAsWhitelist)
                    isInBlacklist = true;
                else
                    isInWhitelist = true;
                break;
            }
        }

        return isInBlacklist || (!isInWhitelist && this.blacklistAsWhitelist);
    }

    public boolean isEntityBlackOrNotWhitelist(EntityType<?> entry) {
        //Check for black/whitelist
        boolean isInWhitelist = false;
        boolean isInBlacklist = false;
        for (IdTagMatcher blacklistEntry : this.blacklist) {
            if (blacklistEntry.matchesEntity(entry)) {
                if (!this.blacklistAsWhitelist)
                    isInBlacklist = true;
                else
                    isInWhitelist = true;
                break;
            }
        }

        return isInBlacklist || (!isInWhitelist && this.blacklistAsWhitelist);
    }

    public List<? extends String> getListAsString() {
        ArrayList<String> list = new ArrayList<>();
        for (IdTagMatcher idTagMatcher : this.blacklist) {
            list.add(idTagMatcher.asString());
        }
        return list;
    }

    public static class Config extends ConfigOption<Blacklist> {
        public ForgeConfigSpec.ConfigValue<List<? extends String>> listConfig;
        public ForgeConfigSpec.ConfigValue<Boolean> listAsWhitelistConfig;

        public Config(ForgeConfigSpec.Builder builder, String name, String description, Blacklist defaultValue) {
            super(builder, name, description);
            List<String> split = ConfigUtils.split(name);
            builder.push(split);
            listConfig = builder.defineList("Blacklist", defaultValue.getStringList(), o -> o instanceof String);
            listAsWhitelistConfig = builder.comment("If true the list will be treated as a whitelist instead of blacklist").define("List as Whitelist", defaultValue.blacklistAsWhitelist);
            builder.pop(split.size());
        }

        @Override
        public Blacklist get() {
            return new Blacklist((ArrayList<IdTagMatcher>) IdTagMatcher.parseStringList(this.listConfig.get()), this.listAsWhitelistConfig.get());
        }

        @Override
        public void set(Object value) {
            Blacklist blacklist = (Blacklist) value;
            this.listConfig.set(blacklist.getListAsString());
            this.listAsWhitelistConfig.set(blacklist.blacklistAsWhitelist);
        }

        @Nullable
        @Override
        public List<String> getConfigPath() {
            return null;
        }
    }
}