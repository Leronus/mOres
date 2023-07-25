//package mod.leronus.mores.util;
//
//import java.util.List;
//
//import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
//import mod.leronus.mores.item.ModItems;
//import net.minecraft.world.entity.npc.VillagerTrades;
//import net.minecraft.world.entity.npc.VillagerTrades.ItemListing;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraftforge.common.BasicItemListing;
//import net.minecraftforge.event.village.VillagerTradesEvent;
//
//public class ModVillagerTrades
//{
//    public static void ArmorerTrades(VillagerTradesEvent evt)
//    {
//        Int2ObjectMap<List<ItemListing>> trades = evt.getTrades();
//
//        // novice trades
//        trades.get(1).add(new BasicItemListing( new ItemStack(Items.EMERALD, 3),
//                new ItemStack(ModItems.BRONZE_HELMET.get()), 12, 1, 0.2F));
//        trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7),
//                new ItemStack(ModItems.BRONZE_CHESTPLATE.get()), 12, 1, 0.2F));
//        trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),
//                new ItemStack(ModItems.BRONZE_LEGGINGS.get()), 12, 1, 0.2F));
//        trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),
//                new ItemStack(ModItems.BRONZE_BOOTS.get()), 12, 1, 0.2F));
//
//        // apprentice trades
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.COBALT_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.STEEL_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 3),
//                new ItemStack(ModItems.STEEL_LEGGINGS.get()), 12, 5, 0.2F));
//        trades.get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_BOOTS.get()), 12, 5, 0.2F));
//
//        // journeyman trades
//        trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_HELMET.get()), 12, 10, 0.2F));
//        trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),
//                new ItemStack(ModItems.STEEL_CHESTPLATE.get()), 12, 10, 0.2F));
//
//        // expert trades
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.STEEL_LEGGINGS.get(),
//                14, 3, 15, 0.2F));
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.STEEL_BOOTS.get(),
//                8, 3, 15, 0.2F));
//
//        // master trades
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.STEEL_HELMET.get(),
//                8, 3, 30, 0.2F));
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.STEEL_CHESTPLATE.get(),
//                16, 3, 30, 0.2F));
//
//    } // end ArmorerTrades()
//
//    public static void ToolsmithTrades(VillagerTradesEvent evt)
//    {
//        Int2ObjectMap<List<ItemListing>> trades = evt.getTrades();
//        // novice
//        trades.get(1).add(new BasicItemListing(new ItemStack(ModItems.TIN_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//
//        // apprentice
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.BRONZE_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.STEEL_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.BRONZE_AXE.get()), 12, 1, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.BRONZE_SHOVEL.get()), 12, 1, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.BRONZE_HOE.get()), 12, 1, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.BRONZE_PICKAXE.get()), 12, 1, 0.2F));
//
//        // journeyman
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_AXE.get()), 12, 10, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_SHOVEL.get()), 12, 10, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_HOE.get()), 12, 10, 0.2F));
//        trades.get(2).add(new BasicItemListing( new ItemStack(Items.EMERALD, 1),
//                new ItemStack(ModItems.STEEL_PICKAXE.get()), 12, 10, 0.2F));
//
//        // expert trades
//        trades.get(3).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.COBALT_AXE.get(),
//                2, 3, 20, 0.2F));
//        trades.get(3).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.COBALT_SHOVEL.get(),
//                3, 3, 20, 0.2F));
//        trades.get(3).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.COBALT_PICKAXE.get(),
//                3, 3, 20, 0.2F));
//
//        // journeyman trades
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.TOURMALINE_AXE.get(),
//                4, 3, 20, 0.2F));
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.TOPAZ_SHOVEL.get(),
//                6, 3, 20, 0.2F));
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.TOURMALINE_PICKAXE.get(),
//                6, 3, 20, 0.2F));
//
//
//        // master trades
//        trades.get(5).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.RUBY_PICKAXE.get(),
//                23, 3, 30, 0.2F));
//        trades.get(5).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.SAPPHIRE_PICKAXE.get(),
//                19, 3, 30, 0.2F));
//    } // end ArmorerTrades()
//
//    public static void WeaponsmithTrades(VillagerTradesEvent evt)
//    {
//        Int2ObjectMap<List<ItemListing>> trades = evt.getTrades();
//        // novice
//        trades.get(1).add(new BasicItemListing( new ItemStack(Items.EMERALD, 3),
//                new ItemStack(ModItems.STERLING_AXE.get()), 12, 1, 0.2F));
//        trades.get(1).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.STERLING_SWORD.get(),
//                2, 3, 1, 0.05F));
//
//        // apprentice
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.STEEL_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//        trades.get(2).add(new BasicItemListing(new ItemStack(ModItems.STERLING_INGOT.get(), 4),
//                new ItemStack(Items.EMERALD), 12, 10, 0.05F));
//
//        // journeyman
//        trades.get(3).add(new BasicItemListing(new ItemStack(ModItems.TOPAZ_SWORD.get()),
//                new ItemStack(Items.EMERALD), 12, 20, 0.05F));
//
//        // expert trades
//        trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.SAPPHIRE_BATTLEAXE.get(),
//                14, 3, 15, 0.2F));
//
//        // master trades
//        trades.get(5).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.TURQUOISE_SWORD.get(),
//                19, 3, 30, 0.2F));
//        trades.get(5).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.TANZANITE_MACE.get(),
//                13, 3, 15, 0.2F));
//        trades.get(5).add(new VillagerTrades.EnchantedItemForEmeralds(ModItems.MOISSANITE_MACE.get(),
//                14, 3, 15, 0.2F));
//    } // end ArmorerTrades()
//
//} // end class