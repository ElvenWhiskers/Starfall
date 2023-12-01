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
        blockWithItem(ModBlocks.MOSSY_COBBLED_BRIGHTSTONE);

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


        //1. First add new log type here.
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

        logBlock(((RotatedPillarBlock) ModBlocks.CALLALILY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CALLALILY_WOOD.get()), blockTexture(ModBlocks.CALLALILY_LOG.get()), blockTexture(ModBlocks.CALLALILY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CALLALILY_LOG.get(), new ResourceLocation(Starfall.MODID, "block/stripped_callalily_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_callalily_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CALLALILY_WOOD.get(), new ResourceLocation(Starfall.MODID, "block/stripped_callalily_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_callalily_log"));

        logBlock(((RotatedPillarBlock) ModBlocks.SWEETPEA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SWEETPEA_WOOD.get()), blockTexture(ModBlocks.SWEETPEA_LOG.get()), blockTexture(ModBlocks.SWEETPEA_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SWEETPEA_LOG.get(), new ResourceLocation(Starfall.MODID, "block/stripped_sweetpea_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_sweetpea_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SWEETPEA_WOOD.get(), new ResourceLocation(Starfall.MODID, "block/stripped_sweetpea_log"),
                new ResourceLocation(Starfall.MODID, "block/stripped_sweetpea_log"));


        //2. Then add new log type here
        blockWithItem(ModBlocks.OPAL_PLANKS);
        blockItem(ModBlocks.OPAL_LOG);
        blockItem(ModBlocks.OPAL_WOOD);
        blockItem(ModBlocks.STRIPPED_OPAL_LOG);
        blockItem(ModBlocks.STRIPPED_OPAL_WOOD);

        //3. Add plank shapes for easier all around shaping. Must go AFTER planks otherwise error.
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
        plankShapes(ModBlocks.MAGNOLIA_PLANKS.get(), ModBlocks.MAGNOLIA_STAIRS.get(), ModBlocks.MAGNOLIA_SLAB.get(), ModBlocks.MAGNOLIA_BUTTON.get(),
                ModBlocks.MAGNOLIA_PRESSURE_PLATE.get(), ModBlocks.MAGNOLIA_FENCE.get(), ModBlocks.MAGNOLIA_FENCE_GATE.get(), ModBlocks.MAGNOLIA_WALL.get());
        doorBlockWithRenderType((DoorBlock)ModBlocks.MAGNOLIA_DOOR.get(), modLoc("block/magnolia_door_bottom"), modLoc("block/magnolia_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.MAGNOLIA_TRAPDOOR.get(), modLoc("block/magnolia_trapdoor"), true, "cutout");
        blockItem(ModBlocks.MAGNOLIA_STAIRS);
        blockItem(ModBlocks.MAGNOLIA_SLAB);
        blockItem(ModBlocks.MAGNOLIA_PRESSURE_PLATE);
        blockItem(ModBlocks.MAGNOLIA_FENCE_GATE);
        blockItem(ModBlocks.MAGNOLIA_TRAPDOOR, "_bottom");
        saplingBlock(ModBlocks.MAGNOLIA_SAPLING);

        blockItem(ModBlocks.LARKSPUR_LOG);
        blockItem(ModBlocks.LARKSPUR_WOOD);
        blockItem(ModBlocks.STRIPPED_LARKSPUR_LOG);
        blockItem(ModBlocks.STRIPPED_LARKSPUR_WOOD);
        blockWithItem(ModBlocks.LARKSPUR_PLANKS);
        plankShapes(ModBlocks.LARKSPUR_PLANKS.get(), ModBlocks.LARKSPUR_STAIRS.get(), ModBlocks.LARKSPUR_SLAB.get(), ModBlocks.LARKSPUR_BUTTON.get(),
                ModBlocks.LARKSPUR_PRESSURE_PLATE.get(), ModBlocks.LARKSPUR_FENCE.get(), ModBlocks.LARKSPUR_FENCE_GATE.get(), ModBlocks.LARKSPUR_WALL.get());
        doorBlockWithRenderType((DoorBlock)ModBlocks.LARKSPUR_DOOR.get(), modLoc("block/larkspur_door_bottom"), modLoc("block/larkspur_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LARKSPUR_TRAPDOOR.get(), modLoc("block/larkspur_trapdoor"), true, "cutout");
        blockItem(ModBlocks.LARKSPUR_STAIRS);
        blockItem(ModBlocks.LARKSPUR_SLAB);
        blockItem(ModBlocks.LARKSPUR_PRESSURE_PLATE);
        blockItem(ModBlocks.LARKSPUR_FENCE_GATE);
        blockItem(ModBlocks.LARKSPUR_TRAPDOOR, "_bottom");
        saplingBlock(ModBlocks.LARKSPUR_SAPLING);

        blockItem(ModBlocks.CALLALILY_LOG);
        blockItem(ModBlocks.CALLALILY_WOOD);
        blockItem(ModBlocks.STRIPPED_CALLALILY_LOG);
        blockItem(ModBlocks.STRIPPED_CALLALILY_WOOD);
        blockWithItem(ModBlocks.CALLALILY_PLANKS);
        plankShapes(ModBlocks.CALLALILY_PLANKS.get(), ModBlocks.CALLALILY_STAIRS.get(), ModBlocks.CALLALILY_SLAB.get(), ModBlocks.CALLALILY_BUTTON.get(),
                ModBlocks.CALLALILY_PRESSURE_PLATE.get(), ModBlocks.CALLALILY_FENCE.get(), ModBlocks.CALLALILY_FENCE_GATE.get(), ModBlocks.CALLALILY_WALL.get());
        doorBlockWithRenderType((DoorBlock)ModBlocks.CALLALILY_DOOR.get(), modLoc("block/callalily_door_bottom"), modLoc("block/callalily_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.CALLALILY_TRAPDOOR.get(), modLoc("block/callalily_trapdoor"), true, "cutout");
        blockItem(ModBlocks.CALLALILY_STAIRS);
        blockItem(ModBlocks.CALLALILY_SLAB);
        blockItem(ModBlocks.CALLALILY_PRESSURE_PLATE);
        blockItem(ModBlocks.CALLALILY_FENCE_GATE);
        blockItem(ModBlocks.CALLALILY_TRAPDOOR, "_bottom");

        blockItem(ModBlocks.SWEETPEA_LOG);
        blockItem(ModBlocks.SWEETPEA_WOOD);
        blockItem(ModBlocks.STRIPPED_SWEETPEA_LOG);
        blockItem(ModBlocks.STRIPPED_SWEETPEA_WOOD);
        blockWithItem(ModBlocks.SWEETPEA_PLANKS);
        plankShapes(ModBlocks.SWEETPEA_PLANKS.get(), ModBlocks.SWEETPEA_STAIRS.get(), ModBlocks.SWEETPEA_SLAB.get(), ModBlocks.SWEETPEA_BUTTON.get(),
                ModBlocks.SWEETPEA_PRESSURE_PLATE.get(), ModBlocks.SWEETPEA_FENCE.get(), ModBlocks.SWEETPEA_FENCE_GATE.get(), ModBlocks.SWEETPEA_WALL.get());
        doorBlockWithRenderType((DoorBlock)ModBlocks.SWEETPEA_DOOR.get(), modLoc("block/sweetpea_door_bottom"), modLoc("block/sweetpea_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.SWEETPEA_TRAPDOOR.get(), modLoc("block/sweetpea_trapdoor"), true, "cutout");
        blockItem(ModBlocks.SWEETPEA_STAIRS);
        blockItem(ModBlocks.SWEETPEA_SLAB);
        blockItem(ModBlocks.SWEETPEA_PRESSURE_PLATE);
        blockItem(ModBlocks.SWEETPEA_FENCE_GATE);
        blockItem(ModBlocks.SWEETPEA_TRAPDOOR, "_bottom");

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