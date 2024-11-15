package com.github.herat.GemCraft.common.datagen.LanguageProvider;

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
        this.add(GemCraftItem.RUBY.get(),"Ruby");
        this.add(GemCraftItem.RUBY_SWORD.get(),"Ruby Sword");
        this.add(GemCraftItem.RUBY_PICKAXE.get(),"Ruby Pickaxe");
        this.add(GemCraftItem.RUBY_SHOVEL.get(),"Ruby Shovel");
        this.add(GemCraftItem.RUBY_AXE.get(),"Ruby Axe");
        this.add(GemCraftItem.RUBY_HOE.get(),"Ruby Hoe");
        this.add(GemCraftItem.SAPPHIRE.get(),"Sapphire");
        this.add(GemCraftItem.SAPPHIRE_SWORD.get(),"Sapphire Sword");
        this.add(GemCraftItem.SAPPHIRE_PICKAXE.get(),"Sapphire Pickaxe");
        this.add(GemCraftItem.SAPPHIRE_SHOVEL.get(),"Sapphire Shovel");
        this.add(GemCraftItem.SAPPHIRE_AXE.get(),"Sapphire Axe");
        this.add(GemCraftItem.SAPPHIRE_HOE.get(),"Sapphire Hoe");
    }
}
