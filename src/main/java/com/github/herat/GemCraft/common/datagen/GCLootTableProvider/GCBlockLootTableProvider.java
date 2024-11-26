package com.github.herat.GemCraft.common.datagen.GCLootTableProvider;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * @author herat
 */
public class GCBlockLootTableProvider extends BlockLootSubProvider {

    public static final Set<Block> BLOCK = Set.of(
            GemCraftBlock.RUBY_ORE.get(),
            GemCraftBlock.SAPPHIRE_ORE.get(),
            GemCraftBlock.DEEPSLATE_RUBY_ORE.get(),
            GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get(),
            GemCraftBlock.END_SAPPHIRE_ORE.get(),
            GemCraftBlock.RUBY_BLOCK.get(),
            GemCraftBlock.SAPPHIRE_BLOCK.get()
    );

    public GCBlockLootTableProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        this.dropOther(GemCraftBlock.RUBY_ORE.get(), GemCraftItem.RUBY.get());
        this.dropOther(GemCraftBlock.SAPPHIRE_ORE.get(), GemCraftItem.SAPPHIRE.get());
        this.dropOther(GemCraftBlock.DEEPSLATE_RUBY_ORE.get(), GemCraftItem.RUBY.get());
        this.dropOther(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get(), GemCraftItem.SAPPHIRE.get());
        this.dropOther(GemCraftBlock.END_SAPPHIRE_ORE.get(), GemCraftItem.SAPPHIRE.get());
        this.dropSelf(GemCraftBlock.RUBY_BLOCK.get());
        this.dropSelf(GemCraftBlock.SAPPHIRE_BLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BLOCK;
    }
}
