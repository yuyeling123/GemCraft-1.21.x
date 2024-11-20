package com.github.herat.GemCraft.common.datagen.LanguageProvider;

import com.github.herat.GemCraft.GemCraftCreativeTab;
import com.github.herat.GemCraft.common.register.GemCraftBlock;
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
        this.add(GemCraftCreativeTab.GEMCRAFT_TAB_STRING, "宝石工艺");
        this.add(GemCraftItem.RUBY.get(),"红宝石");
        this.add(GemCraftItem.RUBY_SWORD.get(),"红宝石剑");
        this.add(GemCraftItem.RUBY_PICKAXE.get(),"红宝石镐");
        this.add(GemCraftItem.RUBY_SHOVEL.get(),"红宝石铲");
        this.add(GemCraftItem.RUBY_AXE.get(),"红宝石斧");
        this.add(GemCraftItem.RUBY_HOE.get(),"红宝石锄");
        this.add(GemCraftItem.RUBY_HELMET.get(), "红宝石头盔");
        this.add(GemCraftItem.RUBY_CHESTPLATE.get(), "红宝石胸甲");
        this.add(GemCraftItem.RUBY_LEGGINGS.get(), "红宝石护腿");
        this.add(GemCraftItem.RUBY_BOOT.get(), "红宝石靴子");
        this.add(GemCraftBlock.RUBY_BLOCK.get(),"红宝石块");
        this.add(GemCraftItem.SAPPHIRE.get(),"蓝宝石");
        this.add(GemCraftItem.SAPPHIRE_SWORD.get(),"蓝宝石剑");
        this.add(GemCraftItem.SAPPHIRE_PICKAXE.get(),"蓝宝石镐");
        this.add(GemCraftItem.SAPPHIRE_SHOVEL.get(),"蓝宝石铲");
        this.add(GemCraftItem.SAPPHIRE_AXE.get(),"蓝宝石斧");
        this.add(GemCraftItem.SAPPHIRE_HOE.get(),"蓝宝石锄");
        this.add(GemCraftItem.SAPPHIRE_HELMET.get(), "蓝宝石头盔");
        this.add(GemCraftItem.SAPPHIRE_CHESTPLATE.get(), "蓝宝石胸甲");
        this.add(GemCraftItem.SAPPHIRE_LEGGINGS.get(), "蓝宝石护腿");
        this.add(GemCraftItem.SAPPHIRE_BOOT.get(), "蓝宝石靴子");
        this.add(GemCraftBlock.SAPPHIRE_BLOCK.get(),"蓝宝石块");
    }
}
