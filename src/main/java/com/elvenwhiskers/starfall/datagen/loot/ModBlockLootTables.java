package com.elvenwhiskers.starfall.datagen.loot;

import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AEGIS_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_AEGIS_BLOCK.get());

        this.dropSelf(ModBlocks.BRIGHTSTONE.get());
        this.dropSelf(ModBlocks.BRIGHTSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_BRIGHTSTONE.get());

        this.add(ModBlocks.AEGIS_ORE.get(),
                block -> createOreDrop(ModBlocks.AEGIS_ORE.get(), ModItems.RAW_AEGIS.get()));

        this.dropSelf(ModBlocks.PUFFBALL_BLUE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_BLUE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_BLUE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}