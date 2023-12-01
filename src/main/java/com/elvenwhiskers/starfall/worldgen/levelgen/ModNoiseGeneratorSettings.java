package com.elvenwhiskers.starfall.worldgen.levelgen;

import com.elvenwhiskers.starfall.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.NoiseSettings;

public class ModNoiseGeneratorSettings {

    //public static final ResourceKey<NoiseGeneratorSettings> STARFALLDIM = ResourceKey.create(Registries.NOISE_SETTINGS, new ResourceLocation("starfalldim"));

    //public static void bootstrap(BootstapContext<NoiseGeneratorSettings> pContext) {
    //    pContext.register(STARFALLDIM, starfalldim(pContext, false, false));
    //}

    //@Override
    //public static NoiseGeneratorSettings overworld(BootstapContext<?> pContext, boolean pAmplified, boolean pLarge) {
    //   return new NoiseGeneratorSettings(-64, 384, 1, 2, ModBlocks.BRIGHTSTONE.get(), Blocks.WATER.defaultBlockState(), NoiseRouterData.overworld(pContext.lookup(Registries.DENSITY_FUNCTION), pContext.lookup(Registries.NOISE), pLarge, pAmplified), SurfaceRuleData.overworld(), (new OverworldBiomeBuilder()).spawnTarget(), 63, false, true, true, false);
    //}

}
