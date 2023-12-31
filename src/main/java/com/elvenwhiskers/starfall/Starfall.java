package com.elvenwhiskers.starfall;

import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModCreativeModeTabs;
import com.elvenwhiskers.starfall.item.ModItems;
import com.elvenwhiskers.starfall.worldgen.biome.ModTerraBlenderAPI;
import com.elvenwhiskers.starfall.worldgen.biome.surface.ModSurfaceRules;
import com.elvenwhiskers.starfall.worldgen.tree.ModFoliagePlacerTypes;
import com.elvenwhiskers.starfall.worldgen.tree.ModTrunkPlacerTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

@Mod(Starfall.MODID)
public class Starfall {
    public static final String MODID = "starfall";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Starfall() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);

        ModTerraBlenderAPI.registerRegions();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFBALL_BLUE.getId(), ModBlocks.POTTED_PUFFBALL_BLUE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFBALL_PINK.getId(), ModBlocks.POTTED_PUFFBALL_PINK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFBALL_ORANGE.getId(), ModBlocks.POTTED_PUFFBALL_ORANGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFBALL_PURPLE.getId(), ModBlocks.POTTED_PUFFBALL_PURPLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFBALL_WHITE.getId(), ModBlocks.POTTED_PUFFBALL_WHITE);

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, ModSurfaceRules.makeBiomeRules());
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            //removed items from vanilla tabs
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}