package com.github.herat.GemCraft.common.item.GCArmorMaterial;

import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;


public class GCArmorMaterial extends ArmorMaterials {
    public static final Holder<ArmorMaterial> RUBY = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class), map->{
        map.put(ArmorItem.Type.BOOTS,4);
        map.put(ArmorItem.Type.LEGGINGS,7);
        map.put(ArmorItem.Type.CHESTPLATE,8);
        map.put(ArmorItem.Type.HELMET,5);
    }),10,SoundEvents.ARMOR_EQUIP_DIAMOND,2.0F,0.0F,()-> Ingredient.of(GemCraftItem.RUBY.get()));

    public static final Holder<ArmorMaterial> SAPPHIRE = register("sapphire",Util.make(new EnumMap<>(ArmorItem.Type.class), map->{
        map.put(ArmorItem.Type.BOOTS,7);
        map.put(ArmorItem.Type.LEGGINGS,10);
        map.put(ArmorItem.Type.CHESTPLATE,12);
        map.put(ArmorItem.Type.HELMET,8);
    }),20,SoundEvents.ARMOR_EQUIP_NETHERITE,5.0F,0.2F,()-> Ingredient.of(GemCraftItem.SAPPHIRE.get()));
}
