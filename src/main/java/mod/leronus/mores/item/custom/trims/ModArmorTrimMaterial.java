//package mod.leronus.mores.item.custom.trims;
//
//import net.minecraft.core.Holder;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.item.ArmorMaterials;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.armortrim.TrimMaterial;
//import net.minecraft.world.item.armortrim.TrimMaterials;
//
//import java.util.Map;
//
//public class ModArmorTrimMaterial extends TrimMaterials {
//
//    public ModArmorTrimMaterial(String assetName, Holder<Item> ingredient, float itemModelIndex, Map<ArmorMaterials, String> overrideArmorMaterials, Component description) {
//        super();
//    }
//
//    public static TrimMaterial create(String p_268108_, Item p_268361_, float p_268202_, Component p_268273_, Map<ArmorMaterials, String> p_267977_) {
//        return new TrimMaterial(p_268108_, BuiltInRegistries.ITEM.wrapAsHolder(p_268361_), p_268202_, p_267977_, p_268273_);
//    }
//
//    public String assetName() {
//        return this.assetName;
//    }
//
//    public Holder<Item> ingredient() {
//        return this.ingredient;
//    }
//
//    public float itemModelIndex() {
//        return this.itemModelIndex;
//    }
//
//    public Map<ArmorMaterials, String> overrideArmorMaterials() {
//        return this.overrideArmorMaterials;
//    }
//
//    public Component description() {
//        return this.description;
//    }
//
//}
