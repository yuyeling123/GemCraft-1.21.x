package com.github.herat.GemCraft.common.datagen.GCLootTableProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * @author herat
 */
public class GCLootTableProvider extends LootTableProvider {
    public GCLootTableProvider(PackOutput pOutput, Set<ResourceKey<LootTable>> pRequiredTables, List<SubProviderEntry> pSubProviders, CompletableFuture<HolderLookup.Provider> pLookupProvider) {
        super(pOutput, pRequiredTables, pSubProviders, pLookupProvider);
    }
}
