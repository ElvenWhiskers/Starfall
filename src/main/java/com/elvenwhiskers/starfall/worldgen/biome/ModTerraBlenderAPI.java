package com.elvenwhiskers.starfall.worldgen.biome;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.worldgen.biome.custom.ModOverworldRegion;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerraBlenderAPI {
    public static void registerRegions() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(Starfall.MODID, "overworld"), 5));
    }
}