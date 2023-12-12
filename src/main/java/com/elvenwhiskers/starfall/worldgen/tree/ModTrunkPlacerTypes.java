package com.elvenwhiskers.starfall.worldgen.tree;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.worldgen.tree.custom.SmallStraightTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Starfall.MODID);

    public static final RegistryObject<TrunkPlacerType<SmallStraightTrunkPlacer>> SMALL_STRAIGHT_TRUNK_PLACER =
            TRUNK_PLACERS.register("small_straight_trunk_placer", () -> new TrunkPlacerType<>(SmallStraightTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}