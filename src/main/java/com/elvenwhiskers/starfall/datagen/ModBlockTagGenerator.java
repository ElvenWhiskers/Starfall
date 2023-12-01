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
                        ModBlocks.CHISELED_BRIGHTSTONE.get(),
                        ModBlocks.COBBLED_BRIGHTSTONE.get(),
                        ModBlocks.SIOUX_QUARTZITE.get(),
                        ModBlocks.CATLINITE.get(),
                        ModBlocks.LIGHT_BLUE_CATLINITE.get(),
                        ModBlocks.LIME_CATLINITE.get(),
                        ModBlocks.YELLOW_CATLINITE.get(),
                        ModBlocks.ORANGE_CATLINITE.get(),
                        ModBlocks.BLUE_CATLINITE.get(),
                        ModBlocks.MAGENTA_CATLINITE.get(),
                        ModBlocks.PURPLE_CATLINITE.get(),
                        ModBlocks.PINK_CATLINITE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OPAL_LOG.get(),
                        ModBlocks.OPAL_WOOD.get(),
                        ModBlocks.OPAL_PLANKS.get(),
                        ModBlocks.STRIPPED_OPAL_LOG.get(),
                        ModBlocks.STRIPPED_OPAL_WOOD.get(),
                        ModBlocks.MAGNOLIA_LOG.get(),
                        ModBlocks.MAGNOLIA_WOOD.get(),
                        ModBlocks.MAGNOLIA_PLANKS.get(),
                        ModBlocks.STRIPPED_MAGNOLIA_LOG.get(),
                        ModBlocks.STRIPPED_MAGNOLIA_WOOD.get(),
                        ModBlocks.LARKSPUR_LOG.get(),
                        ModBlocks.LARKSPUR_WOOD.get(),
                        ModBlocks.LARKSPUR_PLANKS.get(),
                        ModBlocks.STRIPPED_LARKSPUR_LOG.get(),
                        ModBlocks.STRIPPED_LARKSPUR_WOOD.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.AEGIS_BLOCK.get(),
                        ModBlocks.RAW_AEGIS_BLOCK.get(),
                        ModBlocks.AEGIS_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BRIGHTSTONE.get(),
                        ModBlocks.BRIGHTSTONE_BRICKS.get(),
                        ModBlocks.CHISELED_BRIGHTSTONE.get(),
                        ModBlocks.COBBLED_BRIGHTSTONE.get(),
                        ModBlocks.SIOUX_QUARTZITE.get(),
                        ModBlocks.CATLINITE.get(),
                        ModBlocks.LIGHT_BLUE_CATLINITE.get(),
                        ModBlocks.LIME_CATLINITE.get(),
                        ModBlocks.YELLOW_CATLINITE.get(),
                        ModBlocks.ORANGE_CATLINITE.get(),
                        ModBlocks.BLUE_CATLINITE.get(),
                        ModBlocks.MAGENTA_CATLINITE.get(),
                        ModBlocks.PURPLE_CATLINITE.get(),
                        ModBlocks.PINK_CATLINITE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.OPAL_LOG.get(),
                        ModBlocks.OPAL_WOOD.get(),
                        ModBlocks.STRIPPED_OPAL_LOG.get(),
                        ModBlocks.STRIPPED_OPAL_WOOD.get(),
                        ModBlocks.MAGNOLIA_LOG.get(),
                        ModBlocks.MAGNOLIA_WOOD.get(),
                        ModBlocks.STRIPPED_MAGNOLIA_LOG.get(),
                        ModBlocks.STRIPPED_MAGNOLIA_WOOD.get(),
                        ModBlocks.LARKSPUR_LOG.get(),
                        ModBlocks.LARKSPUR_WOOD.get(),
                        ModBlocks.STRIPPED_LARKSPUR_LOG.get(),
                        ModBlocks.STRIPPED_LARKSPUR_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.OPAL_PLANKS.get(),
                        ModBlocks.MAGNOLIA_PLANKS.get(),
                        ModBlocks.LARKSPUR_PLANKS.get());

        this.tag(BlockTags.FLOWERS)
                .add(ModBlocks.PUFFBALL_BLUE.get(),
                        ModBlocks.PUFFBALL_PINK.get(),
                        ModBlocks.PUFFBALL_ORANGE.get(),
                        ModBlocks.PUFFBALL_PURPLE.get(),
                        ModBlocks.PUFFBALL_WHITE.get());

        this.tag(BlockTags.DIRT)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.AZALEA_GROWS_ON)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.BAMBOO_PLANTABLE_ON)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.FOXES_SPAWNABLE_ON)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.OPAL_LEAVES.get());

        this.tag(BlockTags.VALID_SPAWN)
                .add(ModBlocks.STARCROSSED_DIRT.get(),
                        ModBlocks.STARCROSSED_GRASS_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.OPAL_FENCE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.OPAL_WALL.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.OPAL_FENCE_GATE.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}