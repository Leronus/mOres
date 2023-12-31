package mod.leronus.mores.item.custom;

import mod.leronus.mores.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ModFuelItem extends Item {

    public ModFuelItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        var burnTime = 1600;

        if (itemStack.getItem() == ModItems.ANTHRACITE.get()){
            burnTime = 4000;
        }
        return burnTime;
    }

    /*
      Items.LAVA_BUCKET, 20000);
      Blocks.COAL_BLOCK, 16000);
      Items.BLAZE_ROD, 2400);
      Items.COAL, 1600);
      Items.CHARCOAL, 1600);
      ItemTags.LOGS, 300);
      ItemTags.PLANKS, 300);
     */
}
