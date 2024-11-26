package com.github.herat.GemCraft.common.datagen;

import com.github.herat.GemCraft.GemCraft;
import com.github.herat.GemCraft.common.datagen.GCBlockTagProvider.GCBlockTagProvider;
import com.github.herat.GemCraft.common.datagen.GCLootTableProvider.GCBlockLootTableProvider;
import com.github.herat.GemCraft.common.datagen.GCLootTableProvider.GCLootTableProvider;
import com.github.herat.GemCraft.common.datagen.GCModelsProvider.GCBlockStatesProvider;
import com.github.herat.GemCraft.common.datagen.GCModelsProvider.GCItemModelProvider;
import com.github.herat.GemCraft.common.datagen.GCRecipeProvider.GCRecipeProvider;
import com.github.herat.GemCraft.common.datagen.LanguageProvider.GCLanguageProvider;
import com.github.herat.GemCraft.common.datagen.LanguageProvider.GCLanguageProviderCN;
import com.github.herat.GemCraft.common.datagen.worldgen.GCWorldGen;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

/**
 * @author herat
 */
@EventBusSubscriber(modid = GemCraft.MODID, bus = EventBusSubscriber.Bus.MOD)
public class GCDataGeneratorHandler {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        ExistingFileHelper efh = event.getExistingFileHelper();
        var lp = event.getLookupProvider();

        // recipe
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<GCRecipeProvider>) pOutput -> new GCRecipeProvider(pOutput, lp)
        );

        //blockstates

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCBlockStatesProvider>) pOutput -> new GCBlockStatesProvider(pOutput, GemCraft.MODID, efh)
        );

        //model

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCItemModelProvider>) pOutput -> new GCItemModelProvider(pOutput, GemCraft.MODID, efh)
        );

        //lang

        //en_us
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCLanguageProvider>) pOutput -> new GCLanguageProvider(pOutput, GemCraft.MODID, "en_us")
        );

        //zh_cn
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCLanguageProviderCN>) pOutput -> new GCLanguageProviderCN(pOutput, GemCraft.MODID, "zh_cn")
        );

        //Tag
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<GCBlockTagProvider>) pOutput -> new GCBlockTagProvider(pOutput, lp, GemCraft.MODID, efh)
        );

        //loottable
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<GCLootTableProvider>) pOutput -> new GCLootTableProvider(pOutput, Collections.emptySet(),
                        List.of(
                                new LootTableProvider.SubProviderEntry(GCBlockLootTableProvider::new, LootContextParamSets.BLOCK)
                        ),lp)
        );

        //worldgen
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<GCWorldGen>) pOutput -> new GCWorldGen(pOutput, lp)
        );

//        //curios
//        event.getGenerator().addProvider(
//                event.includeServer(),
//                (DataProvider.Factory<GCCuriosProvider>) pOutput -> new GCCuriosProvider(GemCraft.MODID,pOutput,efh,lp)
//        );
    }
}
