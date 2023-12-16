package com.elvenwhiskers.starfall.block.custom;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class StrippedBlockManager {
    private static final Map<Block, Supplier<Block>> strippedBlocks = new HashMap<>();

    static {
        // Add your wood types to the map here
        addStrippedBlock(ModBlocks.OPAL_LOG, ModBlocks.STRIPPED_OPAL_LOG);
        addStrippedBlock(ModBlocks.OPAL_WOOD, ModBlocks.STRIPPED_OPAL_WOOD);
        addStrippedBlock(ModBlocks.MAGNOLIA_LOG, ModBlocks.STRIPPED_MAGNOLIA_LOG);
        addStrippedBlock(ModBlocks.MAGNOLIA_WOOD, ModBlocks.STRIPPED_MAGNOLIA_WOOD);
        addStrippedBlock(ModBlocks.LARKSPUR_LOG, ModBlocks.STRIPPED_LARKSPUR_LOG);
        addStrippedBlock(ModBlocks.LARKSPUR_WOOD, ModBlocks.STRIPPED_LARKSPUR_WOOD);
        addStrippedBlock(ModBlocks.CALLALILY_LOG, ModBlocks.STRIPPED_CALLALILY_LOG);
        addStrippedBlock(ModBlocks.CALLALILY_WOOD, ModBlocks.STRIPPED_CALLALILY_WOOD);
        addStrippedBlock(ModBlocks.SWEETPEA_LOG, ModBlocks.STRIPPED_SWEETPEA_LOG);
        addStrippedBlock(ModBlocks.SWEETPEA_WOOD, ModBlocks.STRIPPED_SWEETPEA_WOOD);
        // Add more wood types here
    }

    private static void addStrippedBlock(RegistryObject<Block> logBlock, RegistryObject<Block> strippedLogBlock) {
        strippedBlocks.put(logBlock.get(), strippedLogBlock);
    }

    @Nullable
    public static Block getStrippedBlock(Block logBlock) {
        return strippedBlocks.get(logBlock).get();
    }
}

