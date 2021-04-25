package mod.mores.init;

import mod.mores.main.Mores;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class to initialise all blocks from mores
 */
public class BlockInit {
    /**
     * Register all mores blocks
     */
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mores.MOD_ID);

    //Item Registry
    /**
     * .strength(destroyTime, blastResistance)
     */
    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(3.0F, 3.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).harvestTool(ToolType.PICKAXE).harvestLevel(3).strength(5.0F, 6.0F).sound(SoundType.METAL)));
}

