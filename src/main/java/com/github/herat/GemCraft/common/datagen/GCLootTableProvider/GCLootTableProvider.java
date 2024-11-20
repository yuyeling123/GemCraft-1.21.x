package com.github.herat.GemCraft.common.datagen.GCLootTableProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class GCLootTableProvider extends LootTableProvider {
    public GCLootTableProvider(PackOutput pOutput, Set<ResourceKey<LootTable>> pRequiredTables, List<LootTableProvider.SubProviderEntry> pSubProviders, CompletableFuture<HolderLookup.Provider> pRegistres) {
        super(pOutput,pRequiredTables,pSubProviders,pRegistres);
    }
}
