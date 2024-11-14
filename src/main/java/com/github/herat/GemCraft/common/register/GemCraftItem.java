package com.github.herat.GemCraft.common.register;

import com.github.herat.GemCraft.GemCraft;
import com.github.herat.GemCraft.common.item.tool.GemCraftItemTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GemCraftItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM , GemCraft.MODID);
    public static final Supplier<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(SwordItem.createAttributes(GemCraftItemTiers.RUBY, 3, -2.2F))));
    public static final Supplier<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(SwordItem.createAttributes(GemCraftItemTiers.SAPPHIRE, 1, -1.4F))));
    public static final Supplier<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(PickaxeItem.createAttributes(GemCraftItemTiers.RUBY, 1, -2.8F))));
    public static final Supplier<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(PickaxeItem.createAttributes(GemCraftItemTiers.RUBY, 2, -2.4F))));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
