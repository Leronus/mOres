package mod.mores.item.custom;

public class ModShieldItem {
    //
//    private final int durability;
//    private Supplier<Integer> damageReduction;
//
//    public ModShieldItem(Supplier<Integer> damageReduction, Tag<Item> repairMaterial, int durability, boolean fireProof){
//        this(damageReduction, ()-> Ingredient.of(repairMaterial), durability, fireProof);
//    }
//
//    public ModShieldItem(Supplier<Integer> damageReduction, Supplier<Ingredient> repairMaterial, int durability, boolean fireProof) {
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
}
