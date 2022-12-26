package mod.leronus.mores.item.custom;

import mod.leronus.mores.config.Config;
import mod.leronus.mores.item.ModTabs;
import mod.leronus.mores.item.client.ShieldTileEntityRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.event.entity.living.ShieldBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModShieldItem extends ShieldItem {

    private Supplier<Integer> damageReduction;
    @SuppressWarnings("deprecation")
    private LazyLoadedValue<Ingredient> repairMaterial;
    public int durability;

    public ModShieldItem(ConfigValue<Integer> damageReduction, String repairTag, int durability,
                         boolean fireProof){
        this(damageReduction::get, () -> getTagIngredient(repairTag), durability, fireProof);
        this.durability = durability;
    }

    @SuppressWarnings("deprecation")
    public ModShieldItem(Supplier<Integer> damageReduction,
                            Supplier<Ingredient> repairMaterial, int durability, boolean fireProof) {
        super((fireProof ? new Properties().fireResistant() : new Properties()).tab(ModTabs.MORES_SHIELDS)
                .durability(durability));
        this.damageReduction = damageReduction;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
    }

    /**
     * Required for one jar to work in 1.18.1 and 1.18.2.
     * A reflection based hack that should not be used unless necessary.
     *
     * @param name	The name of the item tag to get.
     * @return	The ingredient representing the item tag for the given name.
     */
    private static Ingredient getTagIngredient(String name) {
        Ingredient ingredient = null;

        try {
            final Method getAllTags = ObfuscationReflectionHelper.findMethod(ItemTags.class, "m_13193_");
            final Object allTags = getAllTags.invoke(null);
            final Class<?> TagCollection = Class.forName("net.minecraft.tags.TagCollection");
            final Method getTag = ObfuscationReflectionHelper.findMethod(TagCollection, "m_13404_", ResourceLocation.class);
            Object tag = getTag.invoke(allTags, new ResourceLocation(name));
            final Class<?> Tag = Class.forName("net.minecraft.tags.Tag");
            final Method of = ObfuscationReflectionHelper.findMethod(Ingredient.class, "m_43911_", Tag);
            ingredient = (Ingredient) of.invoke(null, tag);
        } catch (ObfuscationReflectionHelper.UnableToFindMethodException e) {
            // Seems like we are in 1.18.2
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        if (ingredient == null) {// Seems like we are in 1.18.2
            try {
                final Method bind = ObfuscationReflectionHelper.findMethod(ItemTags.class, "m_203854_", String.class);
                Object tag = bind.invoke(null, name);
                final Class<?> TagKey = Class.forName("net.minecraft.tags.TagKey");
                final Method of = ObfuscationReflectionHelper.findMethod(Ingredient.class, "m_204132_", TagKey);
                ingredient = (Ingredient) of.invoke(null, tag);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return ingredient;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return ShieldTileEntityRenderer.instance;
            }
        });
    }

    /**
     * Gets the percentage of the damage received this shield blocks.
     *
     * @return The percentage of the damage received this shield blocks.
     */
    public int getDamageReduction() {
        return damageReduction.get();
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return repairMaterial.get().test(repair);
    }

    @SubscribeEvent
    public static void onShieldBlock(ShieldBlockEvent e) {
        if (Config.customShieldMaxReduction.get()) {
            float damage = e.getOriginalBlockedDamage();
            LivingEntity victim = e.getEntity();
            DamageSource source = e.getDamageSource();

            if (source.isProjectile()) {
                return;
            }

            float f1 = 0.0f;
            if (damage > 0.0F && victim.isDamageSourceBlocked(source)) {
                f1 = damage;
                float reduction = 1f;

                Item shield = victim.getUseItem().getItem();
                if (shield instanceof ModShieldItem) {
                    reduction = ((ModShieldItem) shield).getDamageReduction() / 100f;
                } else if (shield == Items.SHIELD || (!Config.customShieldMaxReduction.get()
                        && victim.getUseItem().getUseAnimation() == UseAnim.BLOCK)) {
                    reduction = Config.defaultDamageReduction.get() / 100f;
                }

                if (reduction < 1f) {
                    f1 = damage * reduction;
                }

                int level = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.THORNS, victim.getUseItem());
                if (level > 0 && reduction == 1f && source.getEntity() != null) {
                    Enchantments.THORNS.doPostHurt(victim, source.getEntity(), level);
                }
            }
            e.setBlockedDamage(f1);
        }
    }

//    /**
//     * Creates a {@link TranslatableComponent} for the 'when blocking' tooltip.
//     *
//     * @return the new text component.
//     */
//    public static Component getBlockingTextComponent() {
//        return new TranslatableComponent("mores.shield_blocking").withStyle(ChatFormatting.GRAY);
//    }

//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<TextComponent> tooltip, TooltipFlag flagIn) {
//        tooltip.add(TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + durability));
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//    }
}
