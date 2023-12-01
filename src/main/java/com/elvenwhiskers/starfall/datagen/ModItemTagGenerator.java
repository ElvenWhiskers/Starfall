package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, Starfall.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.OPAL_LOG.get().asItem())
                .add(ModBlocks.OPAL_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_OPAL_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_OPAL_WOOD.get().asItem())
                .add(ModBlocks.MAGNOLIA_LOG.get().asItem())
                .add(ModBlocks.MAGNOLIA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_WOOD.get().asItem())
                .add(ModBlocks.LARKSPUR_LOG.get().asItem())
                .add(ModBlocks.LARKSPUR_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_LARKSPUR_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_LARKSPUR_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.OPAL_PLANKS.get().asItem())
                .add(ModBlocks.MAGNOLIA_PLANKS.get().asItem())
                .add(ModBlocks.LARKSPUR_PLANKS.get().asItem());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}