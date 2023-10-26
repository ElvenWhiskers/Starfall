package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Starfall.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AEGIS_BLOCK);
        blockWithItem(ModBlocks.RAW_AEGIS_BLOCK);

        blockWithItem(ModBlocks.AEGIS_ORE);
        blockWithItem(ModBlocks.BRIGHTSTONE);
        blockWithItem(ModBlocks.BRIGHTSTONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_BRIGHTSTONE);

        simpleBlock(ModBlocks.PUFFBALL_BLUE.get(),
                models().cross(blockTexture(ModBlocks.PUFFBALL_BLUE.get()).getPath(), blockTexture(ModBlocks.PUFFBALL_BLUE.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}