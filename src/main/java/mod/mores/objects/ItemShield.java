package mod.mores.objects;

import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

import mod.mores.Mores;
import mod.mores.client.entity.render.ShieldTileEntityRenderer;
import mod.mores.tabs.MoresTabs;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.tags.ITag;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemShield extends ShieldItem {

    private Supplier<Integer> damageReduction;
    private LazyValue<Ingredient> repairMaterial;

    public ItemShield(Supplier<Integer> damageReduction, ITag<Item> repairMaterial, int durability, boolean fireProof){
        this(damageReduction, ()-> Ingredient.of(repairMaterial), durability, fireProof);
    }

    public ItemShield(Supplier<Integer> damageReduction, Supplier<Ingredient> repairMaterial, int durability, boolean fireProof) {
        super((fireProof ? new Properties().fireResistant() : new Properties()).setISTER(() -> getISTER()).durability(durability).tab(MoresTabs.MORES_SHIELDS));
        this.damageReduction = damageReduction;
        this.repairMaterial = new LazyValue<>(repairMaterial);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> getISTER() {
        return ShieldTileEntityRenderer::new;
    }

    /**
     * Gets the percentage of the damage received this shield blocks.
     *
     * @return The percentage of the damage received this shield blocks.
     */
    public int getDamageReduction() {
        return damageReduction.get();
    }

    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return repairMaterial.get().test(repair) || super.isValidRepairItem(toRepair, repair);
    }

    public static DyeColor getColor(ItemStack p_195979_0_) {
        return DyeColor.byId(p_195979_0_.getOrCreateTagElement("BlockEntityTag").getInt("Base"));
    }

    @Override
    public boolean isShield(ItemStack stack, LivingEntity entity) {
        return true;
    }
    /**
     * Creates a {@link TranslationTextComponent} for the when blocking tooltip.
     *
     * @return the new text component.
     */
    public static ITextComponent getBlockingTextComponent() {
        return new TranslationTextComponent("mores.shield_blocking").withStyle(TextFormatting.GRAY);
    }

    /**
     * Creates a {@link TranslationTextComponent} for the damage reduction tooltip.
     *
     * @param reduction the damage reduction of the shield for which the text
     *                  component will be used.
     * @return the new text component.
     */
    public static ITextComponent getDamageReductionTextComponent(int reduction) {
        return new TranslationTextComponent("mores.shield_damage_reduction", reduction)
                .withStyle(TextFormatting.DARK_GREEN);
    }

}