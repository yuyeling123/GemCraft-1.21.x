package com.github.herat.GemCraft.common.util;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static com.github.herat.GemCraft.common.register.GemCraftBlock.BLOCKS;

class ItemSupplier implements CreativeModeTabCollection{
    private final Supplier<Item> itemStack;

    private ItemSupplier(Supplier<Item> itemStack) {
        this.itemStack = itemStack;
    }

    public Supplier<Item> getItemStack() {
        return itemStack;
    }
}
class BlockSupplier implements CreativeModeTabCollection{
    private final Supplier<Registry<Block>> itemStack;

    BlockSupplier(Supplier<Registry<Block>> itemStack) {
        this.itemStack = itemStack;
    }

    public Supplier<Registry<Block>> getItemStack() {
        return itemStack;
    }
}

public class BulkRegistration {
    public static List<CreativeModeTabCollection> getItem(Supplier<?> itemStack) {
        List<CreativeModeTabCollection> list =new ArrayList<>();
        list.add(new BlockSupplier(BLOCKS.getRegistry()));

        return list;
    }
    public void forItem(List<CreativeModeTabCollection> list, Supplier<?> itemStack) {
        for (CreativeModeTabCollection ignored : list) {

        }
    }
}
