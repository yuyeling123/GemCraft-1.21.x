package com.github.herat.GemCraft.common.register;

import com.github.herat.GemCraft.GemCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.github.herat.GemCraft.common.register.GemCraftItem.ITEMS;
import static com.github.herat.GemCraft.common.register.GemCraftItem.allItem;

/**
 * @author herat
 */
public class GemCraftBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK,GemCraft.MODID);

    public static Supplier<Block> registerBlock(String name, Supplier<Block> block) {
        Supplier<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void registerBlockItem(String name , Supplier<Block> block) {
        registerBlockItem(name,block,new Item.Properties());
    }

    public static void registerBlockItem(String name, Supplier<Block> block , Item.Properties properties) {
        Supplier<Item> item = ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        allItem.add(item);
    }

    public static final Supplier<Block> RUBY_BLOCK = registerBlock("ruby_block" ,() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));
    public static final Supplier<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block" ,() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
