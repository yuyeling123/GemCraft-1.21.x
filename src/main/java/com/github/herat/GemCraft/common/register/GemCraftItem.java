package com.github.herat.GemCraft.common.register;

import com.github.herat.GemCraft.GemCraft;
import com.github.herat.GemCraft.common.item.tool.GemCraftItemTiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author herat
 */
public class GemCraftItem {

    public static List<Supplier<? extends Item>> allItem = new ArrayList<>();

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM , GemCraft.MODID);
    public static final Supplier<Item> RUBY = register("ruby", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUBY_SWORD = register("ruby_sword", () -> new SwordItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(SwordItem.createAttributes(GemCraftItemTiers.RUBY, 3, -2.2F))));
    public static final Supplier<Item> RUBY_PICKAXE = register("ruby_pickaxe", () -> new PickaxeItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(PickaxeItem.createAttributes(GemCraftItemTiers.RUBY, 1, -2.8F))));
    public static final Supplier<Item> RUBY_SHOVEL = register("ruby_shovel",()-> new ShovelItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(ShovelItem.createAttributes(GemCraftItemTiers.RUBY,1.5F,-3.0F))));
    public static final Supplier<Item> RUBY_AXE = register("ruby_axe",()-> new AxeItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(AxeItem.createAttributes(GemCraftItemTiers.RUBY,5.0F,-3.0F))));
    public static final Supplier<Item> RUBY_HOE = register("ruby_hoe",()-> new HoeItem(GemCraftItemTiers.RUBY,new Item.Properties().attributes(HoeItem.createAttributes(GemCraftItemTiers.RUBY,-3.0F,0.0F))));
    public static final Supplier<Item> SAPPHIRE = register("sapphire", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> SAPPHIRE_SWORD = register("sapphire_sword", () -> new SwordItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(SwordItem.createAttributes(GemCraftItemTiers.SAPPHIRE, 1, -1.4F))));
    public static final Supplier<Item> SAPPHIRE_PICKAXE = register("sapphire_pickaxe", () -> new PickaxeItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(PickaxeItem.createAttributes(GemCraftItemTiers.SAPPHIRE, 2, -2.4F))));
    public static final Supplier<Item> SAPPHIRE_SHOVEL = register("sapphire_shovel",()-> new ShovelItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(ShovelItem.createAttributes(GemCraftItemTiers.SAPPHIRE, 2.0F, -2.5F))));
    public static final Supplier<Item> SAPPHIRE_AXE = register("sapphire_axe",()-> new AxeItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(AxeItem.createAttributes(GemCraftItemTiers.SAPPHIRE,6.0F,-2.0F))));
    public static final Supplier<Item> SAPPHIRE_HOE = register("sapphire_hoe",()-> new HoeItem(GemCraftItemTiers.SAPPHIRE,new Item.Properties().attributes(HoeItem.createAttributes(GemCraftItemTiers.SAPPHIRE,-3.0F,0.0F))));



    private static <ITEM extends Item> @NotNull Supplier<ITEM> register(String registerName, Supplier<? extends ITEM> sup) {
        Supplier<ITEM> item = ITEMS.register(registerName, sup);
        allItem.add(item);
        return item;
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
