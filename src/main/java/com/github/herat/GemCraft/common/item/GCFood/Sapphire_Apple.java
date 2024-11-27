package com.github.herat.GemCraft.common.item.GCFood;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Sapphire_Apple extends Item {
    public static final FoodProperties SAPPHIRE_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 3), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL,200,4),1.0F)
            .alwaysEdible()
            .build();

    public Sapphire_Apple() {
        super(new Properties().food(Sapphire_Apple.SAPPHIRE_APPLE).rarity(Rarity.EPIC));
    }
}
