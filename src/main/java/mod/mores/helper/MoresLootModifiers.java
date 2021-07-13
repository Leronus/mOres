package mod.mores.helper;

import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class MoresLootModifiers
{

    public static class AutoSmeltLootModifier extends LootModifier
    {

        protected AutoSmeltLootModifier(ILootCondition[] conditionsIn)
        {
            super(conditionsIn);
        }

        @Nonnull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context)
        {
            ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
            generatedLoot.forEach((stack) -> ret.add(smelt(stack, context)));
            return ret;
        }

        protected static ItemStack smelt(ItemStack stack, LootContext context)
        {
            return context.getLevel().getRecipeManager()
                    .getRecipeFor(IRecipeType.SMELTING, new Inventory(stack),context.getLevel())
                    .map(FurnaceRecipe::getResultItem)
                    .filter(itemStack -> !itemStack.isEmpty())
                    .map(itemStack -> ItemHandlerHelper.copyStackWithSize(itemStack, stack.getCount() * itemStack.getCount()))
                    .orElse(stack);
        }

        public static class Serializer extends GlobalLootModifierSerializer<AutoSmeltLootModifier>
        {

            @Override
            public AutoSmeltLootModifier read(ResourceLocation location, JsonObject object,
                                              ILootCondition[] ailootcondition)
            {
                return new AutoSmeltLootModifier(ailootcondition);
            }

            @Override
            public JsonObject write(AutoSmeltLootModifier instance)
            {
                return makeConditions(instance.conditions);
            }

        } // end class Serializer

    } // end class AutoSmeltLootModifier

} // end class