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

                        output.accept(ModBlocks.PUFFBALL_BLUE.get());
                        output.accept(ModBlocks.PUFFBALL_PINK.get());

                        output.accept(ModBlocks.OPAL_LOG.get());
                        output.accept(ModBlocks.OPAL_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_OPAL_LOG.get());
                        output.accept(ModBlocks.STRIPPED_OPAL_WOOD.get());
                        output.accept(ModBlocks.OPAL_PLANKS.get());
                        output.accept(ModBlocks.OPAL_SAPLING.get());
                        output.accept(ModBlocks.STARFALL_PORTAL.get());

                        output.accept(ModBlocks.STARCROSSED_GRASS_BLOCK.get());
                        output.accept(ModBlocks.STARCROSSED_DIRT.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}