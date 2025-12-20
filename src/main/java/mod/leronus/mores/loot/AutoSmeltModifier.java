package mod.leronus.mores.loot;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.items.ItemHandlerHelper;
import org.jetbrains.annotations.NotNull;

public class AutoSmeltModifier extends LootModifier {

    // NOTE: Forge 1.20.6+ uses MapCodec for global loot modifiers
    public static final MapCodec<AutoSmeltModifier> CODEC =
            RecordCodecBuilder.mapCodec(inst -> codecStart(inst).apply(inst, AutoSmeltModifier::new));

    public AutoSmeltModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot,
                                                 @NotNull LootContext context) {
        // config toggle
        if (!mod.leronus.mores.config.module.base.feature.BaseFeature.rubyAutoSmelt) {
            return generatedLoot;
        }

        ObjectArrayList<ItemStack> ret = new ObjectArrayList<>();
        for (ItemStack stack : generatedLoot) {
            ret.add(smelt(stack, context));
        }
        return ret;
    }

    private static ItemStack smelt(ItemStack in, LootContext context) {
        return context.getLevel()
                .getRecipeManager()
                .getRecipeFor(RecipeType.SMELTING, new SimpleContainer(in), context.getLevel())
                .map(holder -> holder.value().getResultItem(context.getLevel().registryAccess()))
                .filter(out -> !out.isEmpty())
                .map(out -> ItemHandlerHelper.copyStackWithSize(out, in.getCount() * out.getCount()))
                .orElse(in);
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        // If your ModLootModifiers registry stores MapCodec<...>, return that:
        return ModLootModifiers.AUTO_SMELT.get();

        // If you *aren’t* using a registry object, you can also just do:
        // return CODEC;
    }
}
