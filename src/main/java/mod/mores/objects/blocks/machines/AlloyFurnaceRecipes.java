package mod.mores.objects.blocks.machines;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import mod.mores.init.BlockInit;
import mod.mores.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceRecipes
{
    private static final AlloyFurnaceRecipes INSTANCE = new AlloyFurnaceRecipes();

    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static AlloyFurnaceRecipes getInstance()
    {
        return INSTANCE;
    }

    private AlloyFurnaceRecipes()
    {
        addAlloyRecipe(new ItemStack(Items.COAL), new ItemStack(Items.IRON_INGOT), new ItemStack(ItemInit.STEEL_INGOT), 5.0F);
        addAlloyRecipe(new ItemStack(Items.DIAMOND), new ItemStack(ItemInit.ONYX_GEM), new ItemStack(ItemInit.GRAPHENE_GEM), 10.0F);
        addAlloyRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.TIN_INGOT), new ItemStack(ItemInit.BRONZE_INGOT), 4.0F);
        addAlloyRecipe(new ItemStack(ItemInit.COPPER_INGOT), new ItemStack(ItemInit.SILVER_INGOT), new ItemStack(ItemInit.STERLING_INGOT), 5.0F);
        addAlloyRecipe(new ItemStack(Items.QUARTZ), new ItemStack(ItemInit.TURQUOISE_GEM), new ItemStack(ItemInit.TURQUARTZ_GEM), 6.0F);
    }



    public void addAlloyRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getAlloyResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.smeltingList.put(input2, input1, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getAlloyResult(ItemStack input1, ItemStack input2)
    {
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }


    public float getExperience(ItemStack stack)
    {
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
