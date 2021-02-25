package mod.mores.recipes;

import com.google.common.collect.Maps;
import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Map;

public class AlternateSmeltingRecipes
{
    private static final SmeltingRecipes SMELTING_BASE = new SmeltingRecipes();
    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static SmeltingRecipes instance()
    {
        return SMELTING_BASE;
    }

    public AlternateSmeltingRecipes()
    {
        this.addSmeltingRecipeForBlock((BlockInit.AMETHYST_ORE), new ItemStack(ItemInit.AMETHYST_GEM), 3.0F);
        this.addSmeltingRecipeForBlock((BlockInit.COBALT_ORE), new ItemStack(ItemInit.COBALT_INGOT), 0.8F);
        this.addSmeltingRecipeForBlock((BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER_INGOT), 0.5F);
        this.addSmeltingRecipeForBlock((BlockInit.RUBY_ORE), new ItemStack(ItemInit.RUBY_GEM), 5.0F);
        this.addSmeltingRecipeForBlock((BlockInit.SAPPHIRE_ORE), new ItemStack(ItemInit.SAPPHIRE_GEM), 5.0F);
        this.addSmeltingRecipeForBlock((BlockInit.SILVER_ORE), new ItemStack(ItemInit.SILVER_INGOT), 1.0F);
        this.addSmeltingRecipeForBlock((BlockInit.TOPAZ_ORE), new ItemStack(ItemInit.TOPAZ_GEM), 4.0F);
        this.addSmeltingRecipeForBlock((BlockInit.TURQUOISE_ORE), new ItemStack(ItemInit.TURQUOISE_GEM), 10.0F);
        this.addSmeltingRecipeForBlock((BlockInit.TIN_ORE), new ItemStack(ItemInit.TIN_INGOT), 0.4F);
        this.addSmeltingRecipeForBlock((BlockInit.TANZANITE_ORE), new ItemStack(ItemInit.TANZANITE_GEM), 4.0F);
        this.addSmeltingRecipeForBlock((BlockInit.MOISSANITE_NETHER_ORE), new ItemStack(ItemInit.MOISSANITE_GEM), 5.5F);
    }

    public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addSmelting(Item.getItemFromBlock(input), stack, experience);
    }

    public void addSmelting(Item input, ItemStack stack, float experience)
    {
        this.addSmeltingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addSmeltingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getSmeltingResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.log.info("Ignored smelting recipe with conflicting input: {} = {}", input, stack); return; }
        this.smeltingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack stack)
    {
        for (Map.Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getSmeltingList()
    {
        return this.smeltingList;
    }

    public float getSmeltingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }

        return 0.0F;
    }
}

