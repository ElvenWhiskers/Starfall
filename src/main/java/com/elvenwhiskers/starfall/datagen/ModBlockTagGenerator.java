package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Starfall.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AEGIS_BLOCK.get(),
                        ModBlocks.RAW_AEGIS_BLOCK.get(),
                        ModBlocks.AEGIS_ORE.get(),
                        ModBlocks.BRIGHTSTONE.get(),
                        ModBlocks.BRIGHTSTONE_BRICKS.get(),
                        ModBlocks.CHISELED_BRIGHTSTONE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AEGIS_BLOCK.get(),
                        ModBlocks.RAW_AEGIS_BLOCK.get(),
                        ModBlocks.AEGIS_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BRIGHTSTONE.get(),
                        ModBlocks.BRIGHTSTONE_BRICKS.get(),
                        ModBlocks.CHISELED_BRIGHTSTONE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.OPAL_LOG.get(),
                        ModBlocks.OPAL_WOOD.get(),
                        ModBlocks.STRIPPED_OPAL_LOG.get(),
                        ModBlocks.STRIPPED_OPAL_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.OPAL_PLANKS.get());

        this.tag(BlockTags.FLOWERS)
                .add(ModBlocks.PUFFBALL_BLUE.get(),
                        ModBlocks.PUFFBALL_PINK.get());

        this.tag(BlockTags.DIRT)
                .add(ModBlocks.STARCROSSED_DIRT.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}