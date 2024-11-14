package com.github.herat.GemCraft;

import com.github.herat.GemCraft.common.register.GemCraftBlock;
import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/**
 * @author herat
 */
public class GemCraftCreativeTab  {
    public static final DeferredRegister<CreativeModeTab> GEMCRAFT_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,GemCraft.MODID);
    public static final String GEMCRAFT_TAB_STRING = "creative.gemcraft.tab";
    public static Supplier<CreativeModeTab> GEMCRAFT_MOD_TAB = GEMCRAFT_TAB.register("gemcraft_tab",()-> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable(GEMCRAFT_TAB_STRING))
            .icon(() -> GemCraftItem.RUBY.get().getDefaultInstance())
            .displayItems((pParameters,pOutput) -> {
//                pOutput.accept(GemCraftItem.RUBY.get());
//                pOutput.accept(GemCraftItem.SAPPHIRE.get());
//                pOutput.accept(GemCraftItem.RUBY_SWORD.get());
//                pOutput.accept(GemCraftItem.RUBY_PICKAXE.get());
//                pOutput.accept(GemCraftItem.SAPPHIRE_SWORD.get());
//                pOutput.accept(GemCraftItem.SAPPHIRE_PICKAXE.get());
//                pOutput.accept(GemCraftBlock.RUBY_BLOCK.get());
                pOutput.accept(GemCraftBlock.SAPPHIRE_BLOCK.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        GEMCRAFT_TAB.register(eventBus);
    }
}
