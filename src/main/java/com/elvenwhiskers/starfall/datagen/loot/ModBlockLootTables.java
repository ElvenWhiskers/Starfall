package com.elvenwhiskers.starfall.datagen.loot;

import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
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

        this.dropSelf(ModBlocks.COBBLED_BRIGHTSTONE.get());
        this.dropSelf(ModBlocks.BRIGHTSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_BRIGHTSTONE.get());
        this.dropSelf(ModBlocks.STARCROSSED_DIRT.get());

        this.add(ModBlocks.AEGIS_ORE.get(),
                block -> createOreDrop(ModBlocks.AEGIS_ORE.get(), ModItems.RAW_AEGIS.get()));

        this.dropSelf(ModBlocks.PUFFBALL_BLUE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_BLUE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_BLUE.get()));

        this.dropSelf(ModBlocks.PUFFBALL_PINK.get());
        this.add(ModBlocks.POTTED_PUFFBALL_PINK.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_PINK.get()));

        this.dropSelf(ModBlocks.OPAL_LOG.get());
        this.dropSelf(ModBlocks.OPAL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OPAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OPAL_WOOD.get());
        this.dropSelf(ModBlocks.OPAL_PLANKS.get());
        this.dropSelf(ModBlocks.OPAL_SAPLING.get());

        this.dropSelf(ModBlocks.MAGNOLIA_LOG.get());
        this.dropSelf(ModBlocks.MAGNOLIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGNOLIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGNOLIA_WOOD.get());
        this.dropSelf(ModBlocks.MAGNOLIA_PLANKS.get());
        this.dropSelf(ModBlocks.MAGNOLIA_SAPLING.get());

        this.add(ModBlocks.OPAL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OPAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.FANTASY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MAGNOLIA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.BRIGHTSTONE.get(), customSilkTouchDrop(ModBlocks.BRIGHTSTONE.get(), ModBlocks.COBBLED_BRIGHTSTONE.get()));
        this.add(ModBlocks.STARCROSSED_GRASS_BLOCK.get(), customSilkTouchDrop(ModBlocks.STARCROSSED_GRASS_BLOCK.get(), ModBlocks.STARCROSSED_DIRT.get()));



    }

    protected LootTable.Builder customSilkTouchDrop(Block blockItself, Block silkBlock) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(blockItself).when(HAS_SILK_TOUCH)
                        .otherwise(applyExplosionDecay(silkBlock, LootItem.lootTableItem(silkBlock)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))))));}


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}