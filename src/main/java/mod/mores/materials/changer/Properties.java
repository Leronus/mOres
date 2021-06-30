package mod.mores.materials.changer;

import net.minecraft.block.SoundType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.ToolType;

public final class Properties {
    public static class Block {
        public Float HARDNESS = null;
        public Float RESISTANCE = null;
        public Integer HARVEST_LEVEL = null;
        public ToolType HARVEST_TOOL = null;
        public Boolean REQUIRES_TOOL = null;
        public Integer LIGHT_LEVEL = null;
        public Float SLIPPERINESS = null;
        public Float SPEED_FACTOR = null;
        public Float JUMP_FACTOR = null;
        public SoundType SOUND_TYPE = null;
    }

    public static class Item {
        public Integer MAX_DAMAGE = null;
        public Integer MAX_STACK_SIZE = null;
        public ItemGroup GROUP = null;
        public Boolean IS_IMMUNE_TO_FIRE = null;
        public Rarity RARITY = null;
        public Integer ENCHANTABILITY = null;
        public LazyValue<Ingredient> REPAIR_MATERIAL = null;
    }

    public static class Tool extends Item {
        public Float ATTACK_DAMAGE = null;
        public Float ATTACK_SPEED = null;
        public Integer HARVEST_LEVEL = null;
        public Float EFFICIENCY = null;
    }

}
