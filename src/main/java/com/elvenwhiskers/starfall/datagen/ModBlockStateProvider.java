package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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
        blockWithItem(ModBlocks.COBBLED_BRIGHTSTONE);

        blockWithItem(ModBlocks.SIOUX_QUARTZITE);

        blockWithItem(ModBlocks.CATLINITE);
        blockWithItem(ModBlocks.LIGHT_BLUE_CATLINITE);
        blockWithItem(ModBlocks.LIME_CATLINITE);
        blockWithItem(ModBlocks.YELLOW_CATLINITE);
        blockWithItem(ModBlocks.ORANGE_CATLINITE);
        blockWithItem(ModBlocks.BLUE_CATLINITE);
        blockWithItem(ModBlocks.MAGENTA_CATLINITE);
        blockWithItem(ModBlocks.PURPLE_CATLINITE);
        blockWithItem(ModBlocks.PINK_CATLINITE);

        blockWithItem(ModBlocks.STARFALL_PORTAL);

        //simpleBlock(ModBlocks.PUFFBALL_BLUE.get(),
        //        models().cross(blockTexture(ModBlocks.PUFFBALL_BLUE.get()).getPath(), blockTexture(ModBlocks.PUFFBALL_BLUE.get())).renderType("cutout"));
        //left for reference for later.

        logBlock(((RotatedPillarBlock) ModBlocks.OPAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.OPAL_WOOD.get()), blockTexture(ModBlocks.OPAL_LOG.get()), blockTexture(ModBlocks.OPAL_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_OPAL_LOG.get(), new ResourceLocation(Starfall.MODID, "block/stripped_opal_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_opal_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_OPAL_WOOD.get(), new ResourceLocation(Starfall.MODID, "block/stripped_opal_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_opal_log"));

        logBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAGNOLIA_WOOD.get()), blockTexture(ModBlocks.MAGNOLIA_LOG.get()), blockTexture(ModBlocks.MAGNOLIA_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MAGNOLIA_LOG.get(), new ResourceLocation(Starfall.MODID, "block/stripped_magnolia_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_magnolia_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MAGNOLIA_WOOD.get(), new ResourceLocation(Starfall.MODID, "block/stripped_magnolia_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_magnolia_log"));

        logBlock(((RotatedPillarBlock) ModBlocks.LARKSPUR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LARKSPUR_WOOD.get()), blockTexture(ModBlocks.LARKSPUR_LOG.get()), blockTexture(ModBlocks.LARKSPUR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LARKSPUR_LOG.get(), new ResourceLocation(Starfall.MODID, "block/stripped_larkspur_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_larkspur_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LARKSPUR_WOOD.get(), new ResourceLocation(Starfall.MODID, "block/stripped_larkspur_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_larkspur_log"));

        blockWithItem(ModBlocks.OPAL_PLANKS);
        blockItem(ModBlocks.OPAL_LOG);
        blockItem(ModBlocks.OPAL_WOOD);
        blockItem(ModBlocks.STRIPPED_OPAL_LOG);
        blockItem(ModBlocks.STRIPPED_OPAL_WOOD);

        plankShapes(ModBlocks.OPAL_PLANKS.get(), ModBlocks.OPAL_STAIRS.get(), ModBlocks.OPAL_SLAB.get(), ModBlocks.OPAL_BUTTON.get(),
                ModBlocks.OPAL_PRESSURE_PLATE.get(), ModBlocks.OPAL_FENCE.get(), ModBlocks.OPAL_FENCE_GATE.get(), ModBlocks.OPAL_WALL.get());
        doorBlockWithRenderType((DoorBlock)ModBlocks.OPAL_DOOR.get(), modLoc("block/opal_door_bottom"), modLoc("block/opal_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.OPAL_TRAPDOOR.get(), modLoc("block/opal_trapdoor"), true, "cutout");

        blockItem(ModBlocks.OPAL_STAIRS);
        blockItem(ModBlocks.OPAL_SLAB);
        blockItem(ModBlocks.OPAL_PRESSURE_PLATE);
        blockItem(ModBlocks.OPAL_FENCE_GATE);
        blockItem(ModBlocks.OPAL_TRAPDOOR, "_bottom");

        leavesBlock(ModBlocks.OPAL_LEAVES);
        saplingBlock(ModBlocks.OPAL_SAPLING);

        blockWithItem(ModBlocks.STARCROSSED_DIRT);

        blockItem(ModBlocks.MAGNOLIA_LOG);
        blockItem(ModBlocks.MAGNOLIA_WOOD);
        blockItem(ModBlocks.STRIPPED_MAGNOLIA_LOG);
        blockItem(ModBlocks.STRIPPED_MAGNOLIA_WOOD);

        blockWithItem(ModBlocks.MAGNOLIA_PLANKS);
        saplingBlock(ModBlocks.MAGNOLIA_SAPLING);

        blockItem(ModBlocks.LARKSPUR_LOG);
        blockItem(ModBlocks.LARKSPUR_WOOD);
        blockItem(ModBlocks.STRIPPED_LARKSPUR_LOG);
        blockItem(ModBlocks.STRIPPED_LARKSPUR_WOOD);
        blockWithItem(ModBlocks.LARKSPUR_PLANKS);

        //blockWithItem(ModBlocks.BRIGHTSTONE_FURNACE);

        //leavesBlock(ModBlocks.FANTASY_LEAVES);

    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("starfall:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("starfall:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void plankShapes(Block plankType, Block stairType, Block slabType, Block buttonType, Block pressureType, Block fenceType, Block fenceGateType, Block wallType){
        stairsBlock((StairBlock) stairType, blockTexture(plankType));
        slabBlock(((SlabBlock) slabType), blockTexture(plankType), blockTexture(plankType));
        buttonBlock((ButtonBlock) buttonType, blockTexture(plankType));
        pressurePlateBlock((PressurePlateBlock) pressureType, blockTexture(plankType));
        fenceBlock((FenceBlock) fenceType, blockTexture(plankType));
        fenceGateBlock((FenceGateBlock) fenceGateType, blockTexture(plankType));
        wallBlock((WallBlock) wallType, blockTexture(plankType));
    }
}