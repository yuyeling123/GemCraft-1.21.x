package com.github.herat.GemCraft.common.datagen;

import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/**
 * @author herat
 */
public class GCRecipeProvider extends RecipeProvider {
    public GCRecipeProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pPackOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_SWORD.get())
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .save(pRecipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GemCraftItem.RUBY_SWORD.get())
    }
}
