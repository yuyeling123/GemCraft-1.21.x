package com.github.herat.GemCraft.common.datagen.worldgen;

import com.github.herat.GemCraft.GemCraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GCOrePlacements {
    public static final ResourceKey<PlacedFeature> ORE_RUBY = createKey("ore_ruby");
    public static final ResourceKey<PlacedFeature> ORE_SAPPHIRE = createKey("ore_sapphire");

    public static void bootstrap(BootstrapContext<PlacedFeature> pContext) {
        HolderGetter<ConfiguredFeature<?,?>> holderGetter = pContext.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?,?>> oreRubyHolder = holderGetter.getOrThrow(GCOreFeatures.ORE_RUBY);
        Holder<ConfiguredFeature<?,?>> oreSapphireHolder = holderGetter.getOrThrow(GCOreFeatures.ORE_SAPPHIRE);

        PlacementUtils.register(pContext,ORE_RUBY,oreRubyHolder,commonOrePlacement(16,HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(72))));
        PlacementUtils.register(pContext,ORE_SAPPHIRE,oreSapphireHolder,commonOrePlacement(7,HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(128))));

    }


    private static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    private static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    public static ResourceKey<PlacedFeature> createKey(String pKey) {
        return ResourceKey.create(Registries.PLACED_FEATURE,ResourceLocation.fromNamespaceAndPath(GemCraft.MODID,pKey));
    }
}
