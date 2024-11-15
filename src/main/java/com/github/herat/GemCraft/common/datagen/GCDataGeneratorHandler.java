package com.github.herat.GemCraft.common.datagen;

import com.github.herat.GemCraft.GemCraft;
import com.github.herat.GemCraft.common.datagen.LanguageProvider.GCLanguageProvider;
import com.github.herat.GemCraft.common.datagen.LanguageProvider.GCLanguageProviderCN;
import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

/**
 * @author herat
 */
@EventBusSubscriber(modid = GemCraft.MODID,bus = EventBusSubscriber.Bus.MOD)
public class GCDataGeneratorHandler {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        ExistingFileHelper efh = event.getExistingFileHelper();
        var lp = event.getLookupProvider();

        // recipe
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<GCRecipeProvider>) pOutput -> new GCRecipeProvider(pOutput,lp)
        );

        //blockstates

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCBlockStatesProvider>) pOutput -> new GCBlockStatesProvider(pOutput, GemCraft.MODID,efh)
        );

        //model

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCItemModelProvider>) pOutput -> new GCItemModelProvider(pOutput,GemCraft.MODID,efh)
        );

        //lang

        //en_us
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCLanguageProvider>) pOutput -> new GCLanguageProvider(pOutput,GemCraft.MODID,"en_us")
        );

        //zh_cn
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<GCLanguageProviderCN>) pOutput -> new GCLanguageProviderCN(pOutput,GemCraft.MODID,"zh_cn")
        );
    }
}
