package com.elvenwhiskers.starfall.worldgen.biome.surface;

import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(ModBlocks.STARCROSSED_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource STONE = makeStateRule(ModBlocks.BRIGHTSTONE.get());
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(ModBlocks.STARCROSSED_DIRT.get());
    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.AIR);
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

    public static SurfaceRules.RuleSource makeBiomeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isAboveWaterLevel = SurfaceRules.waterBlockCheck(0, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(

                SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),SurfaceRules.sequence(

                    SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.FLOWER_MEADOW),
                                    SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, GRASS_BLOCK)),

                    SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.CRYSTAL_FOREST),
                                    SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, GRASS_BLOCK))
                )))),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.FLOWER_MEADOW), SurfaceRules.ifTrue(SurfaceRules.yStartCheck(VerticalAnchor.absolute(64),0),
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), DIRT)))),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.CRYSTAL_FOREST), SurfaceRules.ifTrue(SurfaceRules.yStartCheck(VerticalAnchor.absolute(64),0),
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), DIRT)))),

                //BEDROCK
                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(1)), BEDROCK)
                );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}