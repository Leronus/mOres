package mod.leronus.mores.item.custom;

import mod.leronus.mores.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        super.onArmorTick(stack, level, player);

        // Apply effects server-side only
        if (level.isClientSide) return;

        Item helmet = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
        Item chest  = player.getItemBySlot(EquipmentSlot.CHEST).getItem();
        Item legs   = player.getItemBySlot(EquipmentSlot.LEGS).getItem();
        Item boots  = player.getItemBySlot(EquipmentSlot.FEET).getItem();

        // Turquoise: Water breathing & Dolphins Grace
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.TURQUOISE_HELMET.get(), ModItems.TURQUOISE_CHESTPLATE.get(),
                ModItems.TURQUOISE_LEGGINGS.get(), ModItems.TURQUOISE_BOOTS.get())) {

            apply(player, MobEffects.WATER_BREATHING, 220, 0);
            apply(player, MobEffects.DOLPHINS_GRACE, 220, 0);
            return;
        }

        // Sapphire: Night Vision
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.SAPPHIRE_HELMET.get(), ModItems.SAPPHIRE_CHESTPLATE.get(),
                ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.SAPPHIRE_BOOTS.get())) {

            apply(player, MobEffects.NIGHT_VISION, 220, 0);
            return;
        }

        // Ruby: Fire Resistance
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.RUBY_HELMET.get(), ModItems.RUBY_CHESTPLATE.get(),
                ModItems.RUBY_LEGGINGS.get(), ModItems.RUBY_BOOTS.get())) {

            apply(player, MobEffects.FIRE_RESISTANCE, 220, 0);
            return;
        }

        // Tanzanite: Speed Boost
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.TANZANITE_HELMET.get(), ModItems.TANZANITE_CHESTPLATE.get(),
                ModItems.TANZANITE_LEGGINGS.get(), ModItems.TANZANITE_BOOTS.get())) {

            apply(player, MobEffects.MOVEMENT_SPEED, 220, 0);
            return;
        }

        // Cobalt: Mining Boost
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.COBALT_HELMET.get(), ModItems.COBALT_CHESTPLATE.get(),
                ModItems.COBALT_LEGGINGS.get(), ModItems.COBALT_BOOTS.get())) {

            apply(player, MobEffects.DIG_SPEED, 220, 0);
            return;
        }

        // Tourmaline: Regeneration
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.TOURMALINE_HELMET.get(), ModItems.TOURMALINE_CHESTPLATE.get(),
                ModItems.TOURMALINE_LEGGINGS.get(), ModItems.TOURMALINE_BOOTS.get())) {

            apply(player, MobEffects.REGENERATION, 60, 0);
            return;
        }

        // Emerald: Luck
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(),
                ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get())) {

            apply(player, MobEffects.LUCK, 220, 0);
            return;
        }

        // Steel: Strength
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.STEEL_HELMET.get(), ModItems.STEEL_CHESTPLATE.get(),
                ModItems.STEEL_LEGGINGS.get(), ModItems.STEEL_BOOTS.get())) {

            apply(player, MobEffects.DAMAGE_BOOST, 220, 0);
            return;
        }

        // Tin: Jump Boost
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.TIN_HELMET.get(), ModItems.TIN_CHESTPLATE.get(),
                ModItems.TIN_LEGGINGS.get(), ModItems.TIN_BOOTS.get())) {

            apply(player, MobEffects.JUMP, 220, 1);
            return;
        }

        // Amethyst: Slow Falling
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(),
                ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get())) {

            apply(player, MobEffects.SLOW_FALLING, 220, 0);
            return;
        }

        // Topaz: Mining Boost 2
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.TOPAZ_HELMET.get(), ModItems.TOPAZ_CHESTPLATE.get(),
                ModItems.TOPAZ_LEGGINGS.get(), ModItems.TOPAZ_BOOTS.get())) {

            apply(player, MobEffects.DIG_SPEED, 220, 1);
            return;
        }

        // Moissanite
        if (hasFullSet(helmet, chest, legs, boots,
                ModItems.MOISSANITE_HELMET.get(), ModItems.MOISSANITE_CHESTPLATE.get(),
                ModItems.MOISSANITE_LEGGINGS.get(), ModItems.MOISSANITE_BOOTS.get())) {

            apply(player, MobEffects.CONDUIT_POWER, 220, 0);
        }
    }

    private static boolean hasFullSet(Item helmet, Item chest, Item legs, Item boots,
                                      Item reqHelmet, Item reqChest, Item reqLegs, Item reqBoots) {
        return helmet == reqHelmet && chest == reqChest && legs == reqLegs && boots == reqBoots;
    }

    // ✅ MobEffects.* are Holder<MobEffect> in your mappings
    private static void apply(Player player, Holder<MobEffect> effect, int durationTicks, int amplifier) {
        player.addEffect(new MobEffectInstance(effect, durationTicks, amplifier, false, false, true));
    }
}
