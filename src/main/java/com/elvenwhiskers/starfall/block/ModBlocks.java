package com.elvenwhiskers.starfall.block;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.custom.*;
import com.elvenwhiskers.starfall.item.ModItems;
import com.elvenwhiskers.starfall.worldgen.tree.LarkspurTreeGrower;
import com.elvenwhiskers.starfall.worldgen.tree.MagnoliaTreeGrower;
import com.elvenwhiskers.starfall.worldgen.tree.OpalTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks  {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Starfall.MODID);

    public static final RegistryObject<Block> AEGIS_BLOCK = registerBlock("aegis_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_AEGIS_BLOCK = registerBlock("raw_aegis_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> AEGIS_ORE = registerBlock("aegis_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRIGHTSTONE = registerBlock("brightstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BRIGHTSTONE_BRICKS = registerBlock("brightstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_BRIGHTSTONE = registerBlock("chiseled_brightstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLED_BRIGHTSTONE = registerBlock("cobbled_brightstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_COBBLED_BRIGHTSTONE = registerBlock("mossy_cobbled_brightstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SIOUX_QUARTZITE = registerBlock("sioux_quartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CATLINITE = registerBlock("catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CATLINITE = registerBlock("light_blue_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CATLINITE = registerBlock("lime_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CATLINITE = registerBlock("yellow_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CATLINITE = registerBlock("orange_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CATLINITE = registerBlock("blue_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CATLINITE = registerBlock("magenta_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CATLINITE = registerBlock("purple_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CATLINITE = registerBlock("pink_catlinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> PUFFBALL_BLUE = registerBlock("puffball_blue",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> PUFFBALL_PINK = registerBlock("puffball_pink",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> PUFFBALL_ORANGE = registerBlock("puffball_orange",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> PUFFBALL_PURPLE = registerBlock("puffball_purple",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> PUFFBALL_WHITE = registerBlock("puffball_white",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));

    public static final RegistryObject<Block> POTTED_PUFFBALL_BLUE = BLOCKS.register("potted_puffball_blue",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PUFFBALL_BLUE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> POTTED_PUFFBALL_PINK = BLOCKS.register("potted_puffball_pink",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PUFFBALL_PINK, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> POTTED_PUFFBALL_ORANGE = BLOCKS.register("potted_puffball_orange",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PUFFBALL_ORANGE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> POTTED_PUFFBALL_PURPLE = BLOCKS.register("potted_puffball_purple",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PUFFBALL_PURPLE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));
    public static final RegistryObject<Block> POTTED_PUFFBALL_WHITE = BLOCKS.register("potted_puffball_white",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PUFFBALL_WHITE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> OPAL_LOG = registerBlock("opal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OPAL_WOOD = registerBlock("opal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_OPAL_LOG = registerBlock("stripped_opal_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_OPAL_WOOD = registerBlock("stripped_opal_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> OPAL_PLANKS = registerBlock("opal_planks",
            () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OPAL_LEAVES = registerBlock("opal_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OPAL_STAIRS = registerBlock("opal_stairs",
            () -> new StairBlock(() -> ModBlocks.OPAL_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OPAL_SLAB = registerBlock("opal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OPAL_PRESSURE_PLATE = registerBlock("opal_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> OPAL_BUTTON = registerBlock("opal_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> OPAL_FENCE = registerBlock("opal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OPAL_FENCE_GATE = registerBlock("opal_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> OPAL_WALL = registerBlock("opal_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL)));
    public static final RegistryObject<Block> OPAL_DOOR = registerBlock("opal_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> OPAL_TRAPDOOR = registerBlock("opal_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> OPAL_SAPLING = registerBlock("opal_sapling",
            () -> new SaplingBlock(new OpalTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> STARFALL_PORTAL = registerBlock("starfall_portal",
            () -> new StarfallPortalBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_PORTAL).noLootTable()));

    public static final RegistryObject<Block> STARCROSSED_DIRT = registerBlock("starcrossed_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .randomTicks().strength(0.5F).sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> STARCROSSED_GRASS_BLOCK = registerBlock("starcrossed_grass_block",
            () -> new ModGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)
                    .randomTicks().strength(0.6F).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> FANTASY_LEAVES = registerBlock("fantasy_leaves",
            () -> new ModFlammableLeaves(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MAGNOLIA_LOG = registerBlock("magnolia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAGNOLIA_WOOD = registerBlock("magnolia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAGNOLIA_LOG = registerBlock("stripped_magnolia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAGNOLIA_WOOD = registerBlock("stripped_magnolia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> MAGNOLIA_PLANKS = registerBlock("magnolia_planks",
            () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGNOLIA_SAPLING = registerBlock("magnolia_sapling",
            () -> new SaplingBlock(new MagnoliaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MAGNOLIA_STAIRS = registerBlock("magnolia_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGNOLIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGNOLIA_SLAB = registerBlock("magnolia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGNOLIA_PRESSURE_PLATE = registerBlock("magnolia_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> MAGNOLIA_BUTTON = registerBlock("magnolia_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> MAGNOLIA_FENCE = registerBlock("magnolia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAGNOLIA_FENCE_GATE = registerBlock("magnolia_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MAGNOLIA_WALL = registerBlock("magnolia_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL)));
    public static final RegistryObject<Block> MAGNOLIA_DOOR = registerBlock("magnolia_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAGNOLIA_TRAPDOOR = registerBlock("magnolia_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> LARKSPUR_LOG = registerBlock("larkspur_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LARKSPUR_WOOD = registerBlock("larkspur_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LARKSPUR_LOG = registerBlock("stripped_larkspur_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LARKSPUR_WOOD = registerBlock("stripped_larkspur_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> LARKSPUR_PLANKS = registerBlock("larkspur_planks",
            () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LARKSPUR_SAPLING = registerBlock("larkspur_sapling",
            () -> new SaplingBlock(new LarkspurTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> LARKSPUR_STAIRS = registerBlock("larkspur_stairs",
            () -> new StairBlock(() -> ModBlocks.LARKSPUR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARKSPUR_SLAB = registerBlock("larkspur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARKSPUR_PRESSURE_PLATE = registerBlock("larkspur_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> LARKSPUR_BUTTON = registerBlock("larkspur_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> LARKSPUR_FENCE = registerBlock("larkspur_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> LARKSPUR_FENCE_GATE = registerBlock("larkspur_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> LARKSPUR_WALL = registerBlock("larkspur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL)));
    public static final RegistryObject<Block> LARKSPUR_DOOR = registerBlock("larkspur_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LARKSPUR_TRAPDOOR = registerBlock("larkspur_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));


    public static final RegistryObject<Block> CALLALILY_LOG = registerBlock("callalily_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CALLALILY_WOOD = registerBlock("callalily_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CALLALILY_LOG = registerBlock("stripped_callalily_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CALLALILY_WOOD = registerBlock("stripped_callalily_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> CALLALILY_PLANKS = registerBlock("callalily_planks",
            () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CALLALILY_STAIRS = registerBlock("callalily_stairs",
            () -> new StairBlock(() -> ModBlocks.CALLALILY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CALLALILY_SLAB = registerBlock("callalily_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CALLALILY_PRESSURE_PLATE = registerBlock("callalily_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> CALLALILY_BUTTON = registerBlock("callalily_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> CALLALILY_FENCE = registerBlock("callalily_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CALLALILY_FENCE_GATE = registerBlock("callalily_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CALLALILY_WALL = registerBlock("callalily_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL)));
    public static final RegistryObject<Block> CALLALILY_DOOR = registerBlock("callalily_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CALLALILY_TRAPDOOR = registerBlock("callalily_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));


    public static final RegistryObject<Block> SWEETPEA_LOG = registerBlock("sweetpea_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SWEETPEA_WOOD = registerBlock("sweetpea_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SWEETPEA_LOG = registerBlock("stripped_sweetpea_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SWEETPEA_WOOD = registerBlock("stripped_sweetpea_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SWEETPEA_PLANKS = registerBlock("sweetpea_planks",
            () -> new ModFlammablePlanks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SWEETPEA_STAIRS = registerBlock("sweetpea_stairs",
            () -> new StairBlock(() -> ModBlocks.SWEETPEA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SWEETPEA_SLAB = registerBlock("sweetpea_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SWEETPEA_PRESSURE_PLATE = registerBlock("sweetpea_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETPEA_BUTTON = registerBlock("sweetpea_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> SWEETPEA_FENCE = registerBlock("sweetpea_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SWEETPEA_FENCE_GATE = registerBlock("sweetpea_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> SWEETPEA_WALL = registerBlock("sweetpea_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_WALL)));
    public static final RegistryObject<Block> SWEETPEA_DOOR = registerBlock("sweetpea_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETPEA_TRAPDOOR = registerBlock("sweetpea_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
        };
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}