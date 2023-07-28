package mod.leronus.mores.loot;

import com.mojang.serialization.Codec;
import mod.leronus.mores.Mores;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Mores.MODID);


    //TODO Fix autosmelter
//    public static final RegistryObject<Codec<AutoSmeltModifier>> AUTO_SMELT =
//            LOOT_MODIFIER_SERIALIZERS.register("auto_smelt_tool", ()-> AutoSmeltModifier.CODEC);


    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}