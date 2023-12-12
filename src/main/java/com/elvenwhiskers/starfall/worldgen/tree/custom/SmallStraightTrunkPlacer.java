package com.elvenwhiskers.starfall.worldgen.tree.custom;

import com.elvenwhiskers.starfall.worldgen.tree.ModTrunkPlacerTypes;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class SmallStraightTrunkPlacer extends TrunkPlacer {
    public static final Codec<SmallStraightTrunkPlacer> CODEC = RecordCodecBuilder.create(smallStraightTrunkPlacerInstance ->
            trunkPlacerParts(smallStraightTrunkPlacerInstance).apply(smallStraightTrunkPlacerInstance, SmallStraightTrunkPlacer::new));

    public SmallStraightTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.SMALL_STRAIGHT_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter,
                                                            RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        // THIS IS WHERE THE BLOCK PLACING LOGIC IS!
        //Also this is basically the same as vanilla. Ops
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        for(int i = 0; i < pFreeTreeHeight; i++) {
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
        }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(pFreeTreeHeight), 0, false));
    }
}