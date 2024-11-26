package com.github.herat.GemCraft.common.datagen.GCRecipeProvider;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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

        //item recipe

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GemCraftItem.RUBY.get(),9)
                .pattern("#")
                .define('#', GemCraftBlock.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", has(GemCraftBlock.RUBY_BLOCK.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GemCraftItem.SAPPHIRE.get(),9)
                .pattern("#")
                .define('#', GemCraftBlock.SAPPHIRE_BLOCK.get())
                .unlockedBy("has_sapphire_block", has(GemCraftBlock.SAPPHIRE_BLOCK.get()))
                .save(pRecipeOutput);

        //smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GemCraftBlock.RUBY_ORE.get()),RecipeCategory.MISC,GemCraftItem.RUBY.get(),0.3F,100)
                .unlockedBy("has_ruby_ore", has(GemCraftBlock.RUBY_ORE.get()))
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GemCraftBlock.DEEPSLATE_RUBY_ORE.get()),RecipeCategory.MISC,GemCraftItem.RUBY.get(),0.3F,100)
                .unlockedBy("has_deepslate_ruby_ore", has(GemCraftBlock.DEEPSLATE_RUBY_ORE.get()))
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GemCraftBlock.SAPPHIRE_ORE.get()),RecipeCategory.MISC,GemCraftItem.SAPPHIRE.get(),0.3F,100)
                .unlockedBy("has_sapphire_ore", has(GemCraftBlock.SAPPHIRE_ORE.get()))
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get()),RecipeCategory.MISC,GemCraftItem.SAPPHIRE.get(),0.3F,100)
                .unlockedBy("has_deepslate_sapphire_ore", has(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get()))
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GemCraftBlock.END_SAPPHIRE_ORE.get()),RecipeCategory.MISC,GemCraftItem.SAPPHIRE.get(),0.3F,100)
                .unlockedBy("has_end_sapphire_ore", has(GemCraftBlock.END_SAPPHIRE_ORE.get()))
                .save(pRecipeOutput);


        //ruby tool recipe

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_SWORD.get())
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.RUBY_PICKAXE.get())
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.RUBY_SHOVEL.get())
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.RUBY_AXE.get())
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.RUBY_HOE.get())
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .define('a', GemCraftItem.RUBY.get())
                .define('b', Items.STICK)
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', GemCraftItem.RUBY.get())
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', GemCraftItem.RUBY.get())
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', GemCraftItem.RUBY.get())
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.RUBY_BOOT.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', GemCraftItem.RUBY.get())
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);

        //sapphire tool recipe

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.SAPPHIRE_SWORD.get())
                .pattern(" a ")
                .pattern(" a ")
                .pattern(" b ")
                .define('a', GemCraftItem.SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.SAPPHIRE_PICKAXE.get())
                .pattern("aaa")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', GemCraftItem.SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.SAPPHIRE_SHOVEL.get())
                .pattern(" a ")
                .pattern(" b ")
                .pattern(" b ")
                .define('a', GemCraftItem.SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.SAPPHIRE_AXE.get())
                .pattern("aa")
                .pattern("ab")
                .pattern(" b")
                .define('a', GemCraftItem.SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, GemCraftItem.SAPPHIRE_HOE.get())
                .pattern("aa")
                .pattern(" b")
                .pattern(" b")
                .define('a', GemCraftItem.SAPPHIRE.get())
                .define('b', Items.STICK)
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.SAPPHIRE_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .define('#', GemCraftItem.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.SAPPHIRE_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', GemCraftItem.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.SAPPHIRE_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', GemCraftItem.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, GemCraftItem.SAPPHIRE_BOOT.get())
                .pattern("# #")
                .pattern("# #")
                .define('#', GemCraftItem.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);

        //block recipe

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GemCraftBlock.RUBY_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', GemCraftItem.RUBY.get())
                .unlockedBy("has_ruby", has(GemCraftItem.RUBY.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GemCraftBlock.SAPPHIRE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', GemCraftItem.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(GemCraftItem.SAPPHIRE.get()))
                .save(pRecipeOutput);
    }
}
