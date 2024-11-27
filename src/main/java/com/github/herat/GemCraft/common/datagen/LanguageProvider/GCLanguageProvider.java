package com.github.herat.GemCraft.common.datagen.LanguageProvider;

import com.github.herat.GemCraft.GemCraftCreativeTab;
import com.github.herat.GemCraft.common.register.GemCraftBlock;
import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/**
 * @author herat
 */
public class GCLanguageProvider extends LanguageProvider {

    public GCLanguageProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add(GemCraftCreativeTab.GEMCRAFT_TAB_STRING, "GemCraft");
        this.add(GemCraftItem.RUBY.get(), "Ruby");
        this.add(GemCraftItem.RUBY_SWORD.get(), "Ruby Sword");
        this.add(GemCraftItem.RUBY_PICKAXE.get(), "Ruby Pickaxe");
        this.add(GemCraftItem.RUBY_SHOVEL.get(), "Ruby Shovel");
        this.add(GemCraftItem.RUBY_AXE.get(), "Ruby Axe");
        this.add(GemCraftItem.RUBY_HOE.get(), "Ruby Hoe");
        this.add(GemCraftItem.RUBY_HELMET.get(), "Ruby Helmet");
        this.add(GemCraftItem.RUBY_CHESTPLATE.get(), "Ruby Chestplate");
        this.add(GemCraftItem.RUBY_LEGGINGS.get(), "Ruby Leggings");
        this.add(GemCraftItem.RUBY_BOOT.get(), "Ruby Boot");
        this.add(GemCraftBlock.RUBY_BLOCK.get(), "Ruby Block");
        this.add(GemCraftBlock.RUBY_ORE.get(), "Ruby Ore");
        this.add(GemCraftBlock.DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
        this.add(GemCraftItem.SAPPHIRE.get(), "Sapphire");
        this.add(GemCraftItem.SAPPHIRE_SWORD.get(), "Sapphire Sword");
        this.add(GemCraftItem.SAPPHIRE_PICKAXE.get(), "Sapphire Pickaxe");
        this.add(GemCraftItem.SAPPHIRE_SHOVEL.get(), "Sapphire Shovel");
        this.add(GemCraftItem.SAPPHIRE_AXE.get(), "Sapphire Axe");
        this.add(GemCraftItem.SAPPHIRE_HOE.get(), "Sapphire Hoe");
        this.add(GemCraftItem.SAPPHIRE_HELMET.get(), "Sapphire Helmet");
        this.add(GemCraftItem.SAPPHIRE_CHESTPLATE.get(), "Sapphire Chestplate");
        this.add(GemCraftItem.SAPPHIRE_LEGGINGS.get(), "Sapphire Leggings");
        this.add(GemCraftItem.SAPPHIRE_BOOT.get(), "Sapphire Boot");
        this.add(GemCraftBlock.SAPPHIRE_BLOCK.get(), "Sapphire Block");
        this.add(GemCraftBlock.SAPPHIRE_ORE.get(), "Sapphire Ore");
        this.add(GemCraftBlock.END_SAPPHIRE_ORE.get(), "End Sapphire Ore");
        this.add(GemCraftBlock.DEEPSLATE_SAPPHIRE_ORE.get(), "Deepslate Sapphire Ore");
        this.add(GemCraftItem.SAPPHIRE_APPLE.get(), "Sapphire Apple");
    }
}
