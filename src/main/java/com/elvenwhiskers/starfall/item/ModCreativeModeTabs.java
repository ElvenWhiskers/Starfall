package com.elvenwhiskers.starfall.item;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Starfall.MODID);

    public static final RegistryObject<CreativeModeTab> STARFALL_TAB = CREATIVE_MODE_TABS.register("starfall_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AEGIS_INGOT.get()))
                    .title(Component.translatable("creativetab.starfall_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.AEGIS_INGOT.get());
                        output.accept(ModItems.RAW_AEGIS.get());

                        output.accept(ModBlocks.AEGIS_BLOCK.get());
                        output.accept(ModBlocks.RAW_AEGIS_BLOCK.get());
                        output.accept(ModBlocks.AEGIS_ORE.get());

                        output.accept(ModBlocks.BRIGHTSTONE.get());
                        output.accept(ModBlocks.BRIGHTSTONE_BRICKS.get());
                        output.accept(ModBlocks.CHISELED_BRIGHTSTONE.get());
                        output.accept(ModBlocks.COBBLED_BRIGHTSTONE.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_BRIGHTSTONE.get());

                        output.accept(ModBlocks.SIOUX_QUARTZITE.get());

                        output.accept(ModBlocks.CATLINITE.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CATLINITE.get());
                        output.accept(ModBlocks.LIME_CATLINITE.get());
                        output.accept(ModBlocks.YELLOW_CATLINITE.get());
                        output.accept(ModBlocks.ORANGE_CATLINITE.get());
                        output.accept(ModBlocks.BLUE_CATLINITE.get());
                        output.accept(ModBlocks.MAGENTA_CATLINITE.get());
                        output.accept(ModBlocks.PURPLE_CATLINITE.get());
                        output.accept(ModBlocks.PINK_CATLINITE.get());

                        output.accept(ModBlocks.PUFFBALL_BLUE.get());
                        output.accept(ModBlocks.PUFFBALL_PINK.get());
                        output.accept(ModBlocks.PUFFBALL_ORANGE.get());
                        output.accept(ModBlocks.PUFFBALL_PURPLE.get());
                        output.accept(ModBlocks.PUFFBALL_WHITE.get());

                        output.accept(ModBlocks.OPAL_LOG.get());
                        output.accept(ModBlocks.OPAL_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_OPAL_LOG.get());
                        output.accept(ModBlocks.STRIPPED_OPAL_WOOD.get());
                        output.accept(ModBlocks.OPAL_PLANKS.get());
                        output.accept(ModBlocks.OPAL_SAPLING.get());
                        output.accept(ModBlocks.OPAL_LEAVES.get());
                        output.accept(ModBlocks.OPAL_STAIRS.get());
                        output.accept(ModBlocks.OPAL_SLAB.get());
                        output.accept(ModBlocks.OPAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.OPAL_BUTTON.get());
                        output.accept(ModBlocks.OPAL_FENCE.get());
                        output.accept(ModBlocks.OPAL_FENCE_GATE.get());
                        output.accept(ModBlocks.OPAL_WALL.get());
                        output.accept(ModBlocks.OPAL_DOOR.get());
                        output.accept(ModBlocks.OPAL_TRAPDOOR.get());

                        output.accept(ModBlocks.STARFALL_PORTAL.get());

                        output.accept(ModBlocks.STARCROSSED_GRASS_BLOCK.get());
                        output.accept(ModBlocks.STARCROSSED_DIRT.get());

                        output.accept(ModBlocks.MAGNOLIA_LOG.get());
                        output.accept(ModBlocks.MAGNOLIA_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_MAGNOLIA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_MAGNOLIA_WOOD.get());
                        output.accept(ModBlocks.MAGNOLIA_PLANKS.get());
                        output.accept(ModBlocks.MAGNOLIA_SAPLING.get());
                        output.accept(ModBlocks.FANTASY_LEAVES.get());
                        output.accept(ModBlocks.MAGNOLIA_STAIRS.get());
                        output.accept(ModBlocks.MAGNOLIA_SLAB.get());
                        output.accept(ModBlocks.MAGNOLIA_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.MAGNOLIA_BUTTON.get());
                        output.accept(ModBlocks.MAGNOLIA_FENCE.get());
                        output.accept(ModBlocks.MAGNOLIA_FENCE_GATE.get());
                        output.accept(ModBlocks.MAGNOLIA_WALL.get());
                        output.accept(ModBlocks.MAGNOLIA_DOOR.get());
                        output.accept(ModBlocks.MAGNOLIA_TRAPDOOR.get());

                        output.accept(ModBlocks.LARKSPUR_LOG.get());
                        output.accept(ModBlocks.LARKSPUR_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_LARKSPUR_LOG.get());
                        output.accept(ModBlocks.STRIPPED_LARKSPUR_WOOD.get());
                        output.accept(ModBlocks.LARKSPUR_PLANKS.get());
                        output.accept(ModBlocks.LARKSPUR_SAPLING.get());
                        output.accept(ModBlocks.LARKSPUR_STAIRS.get());
                        output.accept(ModBlocks.LARKSPUR_SLAB.get());
                        output.accept(ModBlocks.LARKSPUR_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.LARKSPUR_BUTTON.get());
                        output.accept(ModBlocks.LARKSPUR_FENCE.get());
                        output.accept(ModBlocks.LARKSPUR_FENCE_GATE.get());
                        output.accept(ModBlocks.LARKSPUR_WALL.get());
                        output.accept(ModBlocks.LARKSPUR_DOOR.get());
                        output.accept(ModBlocks.LARKSPUR_TRAPDOOR.get());

                        output.accept(ModBlocks.CALLALILY_LOG.get());
                        output.accept(ModBlocks.CALLALILY_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_CALLALILY_LOG.get());
                        output.accept(ModBlocks.STRIPPED_CALLALILY_WOOD.get());
                        output.accept(ModBlocks.CALLALILY_PLANKS.get());
                        output.accept(ModBlocks.CALLALILY_STAIRS.get());
                        output.accept(ModBlocks.CALLALILY_SLAB.get());
                        output.accept(ModBlocks.CALLALILY_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CALLALILY_BUTTON.get());
                        output.accept(ModBlocks.CALLALILY_FENCE.get());
                        output.accept(ModBlocks.CALLALILY_FENCE_GATE.get());
                        output.accept(ModBlocks.CALLALILY_WALL.get());
                        output.accept(ModBlocks.CALLALILY_DOOR.get());
                        output.accept(ModBlocks.CALLALILY_TRAPDOOR.get());

                        output.accept(ModBlocks.SWEETPEA_LOG.get());
                        output.accept(ModBlocks.SWEETPEA_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_SWEETPEA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_SWEETPEA_WOOD.get());
                        output.accept(ModBlocks.SWEETPEA_PLANKS.get());
                        output.accept(ModBlocks.SWEETPEA_STAIRS.get());
                        output.accept(ModBlocks.SWEETPEA_SLAB.get());
                        output.accept(ModBlocks.SWEETPEA_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SWEETPEA_BUTTON.get());
                        output.accept(ModBlocks.SWEETPEA_FENCE.get());
                        output.accept(ModBlocks.SWEETPEA_FENCE_GATE.get());
                        output.accept(ModBlocks.SWEETPEA_WALL.get());
                        output.accept(ModBlocks.SWEETPEA_DOOR.get());
                        output.accept(ModBlocks.SWEETPEA_TRAPDOOR.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}