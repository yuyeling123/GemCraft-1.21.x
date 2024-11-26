package com.github.herat.GemCraft.common.register;

import com.github.herat.GemCraft.GemCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RenderTooltipEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.github.herat.GemCraft.common.register.GemCraftItem.ITEMS;
import static com.github.herat.GemCraft.common.register.GemCraftItem.allItem;

/**
 * @author herat
 */
public class GemCraftBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, GemCraft.MODID);
    public static final Supplier<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));
    public static final Supplier<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));
    public static final Supplier<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)
    ));
    public static final Supplier<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.ofFullCopy(GemCraftBlock.RUBY_ORE.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)
    ));
    public static final Supplier<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.0F, 3.0F)
    ));
    public static final Supplier<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new DropExperienceBlock(
            UniformInt.of(3,7),
            BlockBehaviour.Properties.ofFullCopy(GemCraftBlock.SAPPHIRE_BLOCK.get()).mapColor(MapColor.DEEPSLATE).strength(5.0F, 4.0F).sound(SoundType.DEEPSLATE)
    ));
    public static final Supplier<Block> END_SAPPHIRE_ORE = registerBlock("end_sapphire_ore", () -> new DropExperienceBlock(
            UniformInt.of(3,7),
            BlockBehaviour.Properties.ofFullCopy(GemCraftBlock.SAPPHIRE_BLOCK.get()).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F, 9.0F)
    ));

    public static Supplier<Block> registerBlock(String name, Supplier<Block> block) {
        Supplier<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void registerBlockItem(String name, Supplier<Block> block) {
        registerBlockItem(name, block, new Item.Properties());
    }

    public static void registerBlockItem(String name, Supplier<Block> block, Item.Properties properties) {
        Supplier<Item> item = ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        allItem.add(item);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
