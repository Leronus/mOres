package mod.leronus.mores.datagen;

import mod.leronus.mores.Mores;
import mod.leronus.mores.item.ModItems;
import mod.leronus.mores.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Mores.MODID);
    }

    @Override
    protected void start() {
        add("obsidian_upgrade_smithing_template_hoglin_stable_chest", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.10f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build() },
                ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE.get()));

        add("obsidian_upgrade_smithing_template_generic_chest", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.10f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build() },
                ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE.get()));

        add("obsidian_upgrade_smithing_template_bridge_chest", new AddItemModifier(new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(0.10f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build() },
                ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE.get()));

        add("obsidian_upgrade_smithing_template_treasure_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() }, ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}