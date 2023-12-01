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
        this.dropSelf(ModBlocks.MOSSY_COBBLED_BRIGHTSTONE.get());
        this.dropSelf(ModBlocks.CHISELED_BRIGHTSTONE.get());
        this.dropSelf(ModBlocks.STARCROSSED_DIRT.get());

        this.dropSelf(ModBlocks.SIOUX_QUARTZITE.get());

        this.dropSelf(ModBlocks.CATLINITE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CATLINITE.get());
        this.dropSelf(ModBlocks.LIME_CATLINITE.get());
        this.dropSelf(ModBlocks.YELLOW_CATLINITE.get());
        this.dropSelf(ModBlocks.ORANGE_CATLINITE.get());
        this.dropSelf(ModBlocks.BLUE_CATLINITE.get());
        this.dropSelf(ModBlocks.MAGENTA_CATLINITE.get());
        this.dropSelf(ModBlocks.PURPLE_CATLINITE.get());
        this.dropSelf(ModBlocks.PINK_CATLINITE.get());

        this.add(ModBlocks.AEGIS_ORE.get(),
                block -> createOreDrop(ModBlocks.AEGIS_ORE.get(), ModItems.RAW_AEGIS.get()));

        this.dropSelf(ModBlocks.PUFFBALL_BLUE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_BLUE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_BLUE.get()));
        this.dropSelf(ModBlocks.PUFFBALL_PINK.get());
        this.add(ModBlocks.POTTED_PUFFBALL_PINK.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_PINK.get()));
        this.dropSelf(ModBlocks.PUFFBALL_ORANGE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_ORANGE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_ORANGE.get()));
        this.dropSelf(ModBlocks.PUFFBALL_PURPLE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_PURPLE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_PURPLE.get()));
        this.dropSelf(ModBlocks.PUFFBALL_WHITE.get());
        this.add(ModBlocks.POTTED_PUFFBALL_WHITE.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_PUFFBALL_WHITE.get()));

        this.dropSelf(ModBlocks.OPAL_LOG.get());
        this.dropSelf(ModBlocks.OPAL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OPAL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OPAL_WOOD.get());
        this.dropSelf(ModBlocks.OPAL_PLANKS.get());
        this.dropSelf(ModBlocks.OPAL_SAPLING.get());
        this.dropSelf(ModBlocks.OPAL_STAIRS.get());
        this.add(ModBlocks.OPAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OPAL_SLAB.get()));
        this.dropSelf(ModBlocks.OPAL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.OPAL_BUTTON.get());
        this.dropSelf(ModBlocks.OPAL_FENCE.get());
        this.dropSelf(ModBlocks.OPAL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OPAL_WALL.get());
        this.dropSelf(ModBlocks.OPAL_TRAPDOOR.get());
        this.add(ModBlocks.OPAL_DOOR.get(),
                block -> createDoorTable(ModBlocks.OPAL_DOOR.get()));

        this.dropSelf(ModBlocks.MAGNOLIA_LOG.get());
        this.dropSelf(ModBlocks.MAGNOLIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGNOLIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAGNOLIA_WOOD.get());
        this.dropSelf(ModBlocks.MAGNOLIA_PLANKS.get());
        this.dropSelf(ModBlocks.MAGNOLIA_SAPLING.get());
        this.dropSelf(ModBlocks.MAGNOLIA_STAIRS.get());
        this.add(ModBlocks.MAGNOLIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGNOLIA_SLAB.get()));
        this.dropSelf(ModBlocks.MAGNOLIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_BUTTON.get());
        this.dropSelf(ModBlocks.MAGNOLIA_FENCE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGNOLIA_WALL.get());
        this.dropSelf(ModBlocks.MAGNOLIA_TRAPDOOR.get());
        this.add(ModBlocks.MAGNOLIA_DOOR.get(),
                block -> createDoorTable(ModBlocks.MAGNOLIA_DOOR.get()));

        this.dropSelf(ModBlocks.LARKSPUR_LOG.get());
        this.dropSelf(ModBlocks.LARKSPUR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LARKSPUR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LARKSPUR_WOOD.get());
        this.dropSelf(ModBlocks.LARKSPUR_PLANKS.get());
        this.dropSelf(ModBlocks.LARKSPUR_SAPLING.get());
        this.dropSelf(ModBlocks.LARKSPUR_STAIRS.get());
        this.add(ModBlocks.LARKSPUR_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LARKSPUR_SLAB.get()));
        this.dropSelf(ModBlocks.LARKSPUR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LARKSPUR_BUTTON.get());
        this.dropSelf(ModBlocks.LARKSPUR_FENCE.get());
        this.dropSelf(ModBlocks.LARKSPUR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LARKSPUR_WALL.get());
        this.dropSelf(ModBlocks.LARKSPUR_TRAPDOOR.get());
        this.add(ModBlocks.LARKSPUR_DOOR.get(),
                block -> createDoorTable(ModBlocks.LARKSPUR_DOOR.get()));

        this.dropSelf(ModBlocks.CALLALILY_LOG.get());
        this.dropSelf(ModBlocks.CALLALILY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CALLALILY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CALLALILY_WOOD.get());
        this.dropSelf(ModBlocks.CALLALILY_PLANKS.get());
        this.dropSelf(ModBlocks.CALLALILY_STAIRS.get());
        this.add(ModBlocks.CALLALILY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CALLALILY_SLAB.get()));
        this.dropSelf(ModBlocks.CALLALILY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CALLALILY_BUTTON.get());
        this.dropSelf(ModBlocks.CALLALILY_FENCE.get());
        this.dropSelf(ModBlocks.CALLALILY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CALLALILY_WALL.get());
        this.dropSelf(ModBlocks.CALLALILY_TRAPDOOR.get());
        this.add(ModBlocks.CALLALILY_DOOR.get(),
                block -> createDoorTable(ModBlocks.CALLALILY_DOOR.get()));

        this.dropSelf(ModBlocks.SWEETPEA_LOG.get());
        this.dropSelf(ModBlocks.SWEETPEA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SWEETPEA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SWEETPEA_WOOD.get());
        this.dropSelf(ModBlocks.SWEETPEA_PLANKS.get());
        this.dropSelf(ModBlocks.SWEETPEA_STAIRS.get());
        this.add(ModBlocks.SWEETPEA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SWEETPEA_SLAB.get()));
        this.dropSelf(ModBlocks.SWEETPEA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SWEETPEA_BUTTON.get());
        this.dropSelf(ModBlocks.SWEETPEA_FENCE.get());
        this.dropSelf(ModBlocks.SWEETPEA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SWEETPEA_WALL.get());
        this.dropSelf(ModBlocks.SWEETPEA_TRAPDOOR.get());
        this.add(ModBlocks.SWEETPEA_DOOR.get(),
                block -> createDoorTable(ModBlocks.SWEETPEA_DOOR.get()));

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