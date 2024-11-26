package com.github.herat.GemCraft.common.datagen.worldgen;

import com.github.herat.GemCraft.GemCraft;
import com.github.herat.GemCraft.common.register.GemCraftBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.common.Tags;

import java.util.List;


public class GCOreFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_RUBY = createKey("ruby");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SAPPHIRE = createKey("sapphire");

    public static void  bootstrap(BootstrapContext<ConfiguredFeature<?,?>> pContext) {
        RuleTest stoneOreReplaceRuleTest = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceRuleTest = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest theEndStoneOreReplaceRuleTest = new TagMatchTest(Tags.Blocks.END_STONES);

        List<OreConfiguration.TargetBlockState> oreRubyList = List.of(
                OreConfiguration.target(stoneOreReplaceRuleTest, GemCraftBlock.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateOreReplaceRuleTest,GemCraftBlock.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> oreSapphireList = List.of(
                OreConfiguration.target(stoneOreReplaceRuleTest,GemCraftBlock.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateOreReplaceRuleTest,GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(theEndStoneOreReplaceRuleTest,GemCraftBlock.END_SAPPHIRE_ORE.get().defaultBlockState())
        );

        FeatureUtils.register(pContext, ORE_RUBY, Feature.ORE, new OreConfiguration(oreRubyList,9));
        FeatureUtils.register(pContext, ORE_SAPPHIRE, Feature.ORE, new OreConfiguration(oreSapphireList,9));
    }

    public static ResourceKey<ConfiguredFeature<?,?>> createKey(String pName) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(GemCraft.MODID, pName));
    }


}
