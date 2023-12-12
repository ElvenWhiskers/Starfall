package com.elvenwhiskers.starfall.worldgen.tree.custom;

import com.elvenwhiskers.starfall.worldgen.tree.ModFoliagePlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class ConeFoliagePlacer extends FoliagePlacer {
    public static final Codec<ConeFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance)
            .and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height)).apply(instance, ConeFoliagePlacer::new));
    protected final int height;

    public ConeFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.CONE_FOLIAGE_PLACER.get();
    }


    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource pRandom, TreeConfiguration pConfig, int maxFreeTreeHeight,
                                 FoliagePlacer.FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {

        if (foliageHeight > 0) {
            BlockPos basePosition = attachment.pos().above(-offset + 1); // Start one block higher

            // Loop through each layer
            for (int layer = 1; layer <= 7; layer++) {
                int layerHeight = layer; // Raise the height by 1 for each layer

                // Generate a 5 by 5 square with tiny corners cut off for layer 2
                if (layer == 2) {
                    for (int x = -2; x <= 2; x++) {
                        for (int z = -2; z <= 2; z++) {
                            if (!(Math.abs(x) == 2 && Math.abs(z) == 2)) {
                                BlockPos leavesPos = basePosition.offset(x, layerHeight, z);
                                this.placeLeaves(pLevel, foliageSetter, pRandom, pConfig, leavesPos, 1, attachment.doubleTrunk());
                            }
                        }
                    }
                } else if (layer == 3) {
                    // Generate a slightly thinner circle for layer 3 with an increased radius
                    int layerRadius = 2;
                    for (int x = -layerRadius; x <= layerRadius; x++) {
                        for (int z = -layerRadius; z <= layerRadius; z++) {
                            if (Math.abs(x) + Math.abs(z) <= layerRadius) {
                                BlockPos leavesPos = basePosition.offset(x, layerHeight, z);
                                this.placeLeaves(pLevel, foliageSetter, pRandom, pConfig, leavesPos, 1, attachment.doubleTrunk());
                            }
                        }
                    }
                } else if (layer == 4) {
                    // Generate a perfect 3 by 3 square for layer 4
                    for (int x = -1; x <= 1; x++) {
                        for (int z = -1; z <= 1; z++) {
                            BlockPos leavesPos = basePosition.offset(x, layerHeight, z);
                            this.placeLeaves(pLevel, foliageSetter, pRandom, pConfig, leavesPos, 1, attachment.doubleTrunk());
                        }
                    }
                } else {
                    // Generate the circular shape for other layers
                    int layerRadius = (layer == 1 || layer == 5) ? 1 : (layer == 6 || layer == 7) ? 0 : 1;
                    for (int x = -layerRadius; x <= layerRadius; x++) {
                        for (int z = -layerRadius; z <= layerRadius; z++) {
                            if (Math.abs(x) + Math.abs(z) <= layerRadius) {
                                BlockPos leavesPos = basePosition.offset(x, layerHeight, z);
                                this.placeLeaves(pLevel, foliageSetter, pRandom, pConfig, leavesPos, 1, attachment.doubleTrunk());
                            }
                        }
                    }
                }
            }
        }
    }





    // Your placeLeaves method (replace this with your actual implementation)
    private void placeLeaves(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource pRandom, TreeConfiguration pConfig, BlockPos pPos, int pHeight, boolean pDoubleTrunk) {
        if (pLevel instanceof LevelReader) {
            LevelReader levelReader = (LevelReader) pLevel;
            BlockState existingState = levelReader.getBlockState(pPos);
            if (existingState.isAir()) {
                BlockState leavesState = pConfig.foliageProvider.getState(pRandom, pPos);
                // Optionally, you can add more logic for handling double trunk or other features

                foliageSetter.set(pPos, leavesState);
            }
        }
    }









    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        return false;
    }
}
