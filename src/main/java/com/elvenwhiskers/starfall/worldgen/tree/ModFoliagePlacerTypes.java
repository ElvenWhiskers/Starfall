package com.elvenwhiskers.starfall.worldgen.tree;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.worldgen.tree.custom.ConeFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Starfall.MODID);

    public static final RegistryObject<FoliagePlacerType<ConeFoliagePlacer>> CONE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("cone_foliage_placer", () -> new FoliagePlacerType<>(ConeFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
