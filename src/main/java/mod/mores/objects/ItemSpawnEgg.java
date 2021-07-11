package mod.mores.objects;

import mod.mores.helper.ModifiedDispenseItemBehavior;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemSpawnEgg extends SpawnEggItem {
    protected static final List<ItemSpawnEgg> EGGS_TO_ADD = new ArrayList<>();
    private final Lazy<? extends EntityType<?>> lazyEntity;

    public static ModifiedDispenseItemBehavior behavior = new ModifiedDispenseItemBehavior() {
        @Override
        public ItemStack dispense(IBlockSource source, ItemStack stack) {
            Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
            EntityType<?> eType = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());

            eType.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), SpawnReason.DISPENSER,
                    direction != Direction.UP, false);
            stack.shrink(1);
            return stack;
        }
    };

    public ItemSpawnEgg(final RegistryObject<? extends EntityType<?>> entity, int primaryColor, int secondaryColor, final Item.Properties properties) {
        super(null, primaryColor, secondaryColor, properties);
        this.lazyEntity = Lazy.of(entity::get);
        EGGS_TO_ADD.add(this);
    }
    public static void initSpawnEggs() {
        final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class,
                null, "field_195987_b");

        for (final SpawnEggItem item : EGGS_TO_ADD) {
            EGGS.put(item.getType(null), item);
            DispenserBlock.registerBehavior(item, behavior);
        }

        EGGS_TO_ADD.clear();
    }

    @Override
    public EntityType<?> getType(CompoundNBT nbt) {
        return this.lazyEntity.get();
    }
}
