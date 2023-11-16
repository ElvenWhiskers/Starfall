package com.elvenwhiskers.starfall.event;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Starfall.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event) {
        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
                pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : GrassColor.getDefaultColor(), ModBlocks.STARCROSSED_GRASS_BLOCK.get());
    }

    @SubscribeEvent
    public static void registerColoredItems(RegisterColorHandlersEvent.Item event) {
        event.register((pStack, pTintIndex) -> {
            BlockState state = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, null, null, pTintIndex);
        }, ModBlocks.STARCROSSED_GRASS_BLOCK.get(),
                ModBlocks.FANTASY_LEAVES.get());
    }

    @SubscribeEvent
    public static void registerColoredFoliage(RegisterColorHandlersEvent.Block event) {
        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
                pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), ModBlocks.FANTASY_LEAVES.get());
    }
}
