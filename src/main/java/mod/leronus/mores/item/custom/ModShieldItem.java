package mod.leronus.mores.item.custom;

import mod.leronus.mores.item.client.ShieldBlockEntityRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
public class ModShieldItem extends ShieldItem {
    public static final EnchantmentCategory SHIELD = EnchantmentCategory.create("shield", s -> s instanceof ShieldItem);
    public static final ResourceLocation BLOCKING = new ResourceLocation("minecraft:blocking");
    public final ModShieldMaterial material;

    public ModShieldItem(ModShieldMaterial material, Properties properties) {
        super(properties);
        this.material = material;
    }

    public double getBlockedDamage() {
        return this.material.damageBlocked;
    }
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return ShieldBlockEntityRenderer.instance;
            }
        });
    }
    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return this.material.enchantmentValue;
    }
    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, components, tooltipFlag);
        addDamageBlockedText(itemStack, components, this.getBlockedDamage());
    }
    public static void addDamageBlockedText(ItemStack itemStack, List<Component> components, double blockedDamage) {
//        int reinforced = itemStack.getEnchantmentLevel(ModEnchantments.REINFORCED.get());
//        float finalBlockedDamage = (float) (blockedDamage + ShieldReinforcedEnchantment.getDamageBlocked(reinforced));
//        int reflection = itemStack.getEnchantmentLevel(ModEnchantments.REFLECTION.get());
//        float reflectedDamage = ShieldReflectionEnchantment.getReflectedDamage(reflection);
//        components.add(Component.translatable(Strings.Translatable.DAMAGE_BLOCKED, new DecimalFormat("#.#").format(finalBlockedDamage)).withStyle(ChatFormatting.BLUE));


        /*if (reinforced > 0) {
            components.add(Component.translatable(Strings.Translatable.REINFORCED_BONUS, new DecimalFormat("#.#").format(ShieldReinforcedEnchantment.getDamageBlocked(reinforced))).withStyle(ChatFormatting.DARK_GRAY));
        }*/


        //Add here more blocking damage modifiers
//        if (reflection > 0) {
//            components.add(Component.translatable(Strings.Translatable.DAMAGE_REFLECTED, new DecimalFormat("#.#").format(reflectedDamage * 100)).withStyle(ChatFormatting.BLUE));
//            components.add(Component.translatable(Strings.Translatable.CAPPED_DAMAGE_REFLECTED, new DecimalFormat("#.#").format(ShieldReflectionEnchantment.getCappedReflectedDamage(reflection))).withStyle(ChatFormatting.DARK_GRAY));
//        }
    }
    @Override
    public boolean isValidRepairItem(@NotNull ItemStack repaired, @NotNull ItemStack repairingMaterial) {
        if (this.material.repairItem != null)
            return repairingMaterial.is(this.material.repairItem);
        return repairingMaterial.is(this.material.repairTag);
    }
}
