package com.github.herat.GemCraft.common.item.tool;

import com.github.herat.GemCraft.common.register.GemCraftItem;
import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;


/**
 * @author herat
 */

public enum GemCraftItemTiers implements Tier {
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,3,2048,9F,4F,15,()->Ingredient.of(GemCraftItem.RUBY.get())),
    SAPPHIRE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,4,3096,14F,5F,22,()->Ingredient.of(GemCraftItem.SAPPHIRE.get()));


    private final TagKey<Block> incorrectBlocksForDrops;
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;


    GemCraftItemTiers(TagKey<Block> incorrectBlocksForDrops, int pLevel, int pUsers, float pSpeed, float pDamage,int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.level = pLevel;
        this.uses = pUsers;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = Suppliers.memoize(pRepairIngredient::get);
    }


    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }


    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public @NotNull Tool createToolProperties(@NotNull TagKey<Block> block) {
        return Tier.super.createToolProperties(block);
    }

    public int getLevel() {
        return this.level;
    }
}