package com.github.herat.GemCraft.common.datagen.GCLootTableProvider;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Set;

public class GCBlockLootTableProvider extends BlockLootSubProvider {
    public GCBlockLootTableProvider() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }

    public static final Set<Block> BLOCK = Set.of(
            GemCraftBlock.RUBY_BLOCK.get()
    );

    @Override
    protected void generate() {
        this.dropSelf(GemCraftBlock.RUBY_BLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BLOCK;
    }
}
