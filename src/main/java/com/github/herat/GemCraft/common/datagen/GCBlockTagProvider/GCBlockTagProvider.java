package com.github.herat.GemCraft.common.datagen.GCBlockTagProvider;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class GCBlockTagProvider extends BlockTagsProvider {
    public GCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modid, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modid, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(GemCraftBlock.SAPPHIRE_BLOCK.get())
                .add(GemCraftBlock.RUBY_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GemCraftBlock.SAPPHIRE_BLOCK.get())
                .add(GemCraftBlock.RUBY_BLOCK.get());
    }
}
