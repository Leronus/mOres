//package mod.mores.objects;
//
//import java.util.List;
//import java.util.function.Supplier;
//
//import mod.mores.tabs.MoresTabs;
//import net.minecraft.ChatFormatting;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.tags.Tag;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.item.*;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.DispenserBlock;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import org.jetbrains.annotations.Nullable;
//
//public class ItemShield extends ShieldItem {
//
//    private final int durability;
//    private Supplier<Integer> damageReduction;
//
//    public ItemShield(Supplier<Integer> damageReduction, Tag<Item> repairMaterial, int durability, boolean fireProof){
//        this(damageReduction, ()-> Ingredient.of(repairMaterial), durability, fireProof);
//    }
//
//    public ItemShield(Supplier<Integer> damageReduction, Supplier<Ingredient> repairMaterial, int durability, boolean fireProof) {
//        super((fireProof ? new Properties().fireResistant() : new Properties()).setISTER(() -> getISTER()).durability(durability).tab(MoresTabs.MORES_SHIELDS));
//        this.damageReduction = damageReduction;
//        this.durability = durability;
//        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    private static Callable<ItemStackTileEntityRenderer> getISTER() {
//        return ShieldTileEntityRenderer::new;
//    }
//
//    /**
//     * Gets the percentage of the damage received this shield blocks.
//     *
//     * @return The percentage of the damage received this shield blocks.
//     */
//    public int getDamageReduction() {
//        return damageReduction.get();
//    }
//
//    @Override
//    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
//        return repairMaterial.get().test(repair) || super.isValidRepairItem(toRepair, repair);
//    }
//
//    public static DyeColor getColor(ItemStack p_195979_0_) {
//        return DyeColor.byId(p_195979_0_.getOrCreateTagElement("BlockEntityTag").getInt("Base"));
//    }
//
//    @Override
//    public boolean isShield(ItemStack stack, LivingEntity entity) {
//        return true;
//    }
//
//    /**
//     * Creates a {@link TextComponent} for the damage reduction tooltip.
//     *
//     * @param reduction the damage reduction of the shield for which the text
//     *                  component will be used.
//     * @return the new text component.
//     */
//    public static TextComponent getDamageReductionTextComponent(int reduction) {
//        TextComponent damageReduction = (TextComponent) new TextComponent("mores.shield_damage_reduction" + reduction).withStyle(ChatFormatting.DARK_GREEN);
//        TextComponent actualReduction = (TextComponent) new TextComponent(reduction + "% ").withStyle(ChatFormatting.GOLD);
//        return (TextComponent) actualReduction.append(damageReduction);
//    }
//
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<TextComponent> tooltip, TooltipFlag flagIn) {
//        tooltip.add(TextComponent("Max Uses: " + ChatFormatting.LIGHT_PURPLE + durability));
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//    }
//}