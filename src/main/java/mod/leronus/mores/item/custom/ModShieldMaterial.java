package mod.leronus.mores.item.custom;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModShieldMaterial {
    public String materialName;
    public double damageBlocked;
    public int durability;
    public Item repairItem;
    public TagKey<Item> repairTag;
    public int enchantmentValue;
    public Rarity rarity;

    public ModShieldMaterial(String materialName, double damageBlocked, int durability, Item repairItem, int enchantmentValue, Rarity rarity) {
        this.materialName = materialName;
        this.damageBlocked = damageBlocked;
        this.durability = durability;
        this.repairItem = repairItem;
        this.enchantmentValue = enchantmentValue;
        this.rarity = rarity;
    }

    public ModShieldMaterial(String materialName, double damageBlocked, int durability, TagKey<Item> repairTag, int enchantmentValue, Rarity rarity) {
        this.materialName = materialName;
        this.damageBlocked = damageBlocked;
        this.durability = durability;
        this.repairTag = repairTag;
        this.enchantmentValue = enchantmentValue;
        this.rarity = rarity;
    }
}
