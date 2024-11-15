package com.github.herat.GemCraft.common.datagen.LanguageProvider;

import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/**
 * @author herat
 */
public class GCLanguageProviderCN extends LanguageProvider {

    public GCLanguageProviderCN(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add(GemCraftItem.RUBY.get(),"红宝石");
        this.add(GemCraftItem.RUBY_SWORD.get(),"红宝石剑");
        this.add(GemCraftItem.RUBY_PICKAXE.get(),"红宝石镐");
        this.add(GemCraftItem.RUBY_SHOVEL.get(),"红宝石铲子");
        this.add(GemCraftItem.RUBY_AXE.get(),"红宝石斧头");
        this.add(GemCraftItem.RUBY_HOE.get(),"红宝石锄头");
        this.add(GemCraftItem.SAPPHIRE_HOE.get(),"蓝宝石锄头");
        this.add(GemCraftItem.SAPPHIRE.get(),"蓝宝石");
        this.add(GemCraftItem.SAPPHIRE_SWORD.get(),"蓝宝石剑");
        this.add(GemCraftItem.SAPPHIRE_PICKAXE.get(),"蓝宝石镐");
        this.add(GemCraftItem.SAPPHIRE_SHOVEL.get(),"蓝宝石铲子");
        this.add(GemCraftItem.SAPPHIRE_AXE.get(),"蓝宝石斧头");
        this.add(GemCraftItem.SAPPHIRE_HOE.get(),"蓝宝石锄头");
    }
}
