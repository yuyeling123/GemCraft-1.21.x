package com.github.herat.GemCraft.common.datagen.GCModelsProvider;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

/**
 * @author herat
 */
public class GCBlockStatesProvider extends BlockStateProvider {
    public GCBlockStatesProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(GemCraftBlock.RUBY_BLOCK.get(), cubeAll(GemCraftBlock.RUBY_BLOCK.get()));
        this.simpleBlockWithItem(GemCraftBlock.SAPPHIRE_BLOCK.get(), cubeAll(GemCraftBlock.SAPPHIRE_BLOCK.get()));
        this.simpleBlockWithItem(GemCraftBlock.DEEPSLATE_RUBY_ORE.get(), cubeAll(GemCraftBlock.DEEPSLATE_RUBY_ORE.get()));
        this.simpleBlockWithItem(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get(),cubeAll(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get()));
        this.simpleBlockWithItem(GemCraftBlock.RUBY_ORE.get(), cubeAll(GemCraftBlock.RUBY_ORE.get()));
        this.simpleBlockWithItem(GemCraftBlock.SAPPHIRE_ORE.get(), cubeAll(GemCraftBlock.SAPPHIRE_ORE.get()));
        this.simpleBlockWithItem(GemCraftBlock.END_SAPPHIRE_ORE.get(), cubeAll(GemCraftBlock.END_SAPPHIRE_ORE.get()));
    }
}
