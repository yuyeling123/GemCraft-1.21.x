package com.github.herat.GemCraft.common.datagen.GCModelProvider;

import com.github.herat.GemCraft.common.register.GemCraftItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;

/**
 * @author herat
 */
public class GCItemModelProvider extends ItemModelProvider {
    public GCItemModelProvider(PackOutput output, String modid , ExistingFileHelper existingFileHelper) {
        super(output,modid,existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.basicItem(GemCraftItem.RUBY.get());
        this.basicItem(GemCraftItem.RUBY_SWORD.get());
        this.basicItem(GemCraftItem.RUBY_PICKAXE.get());
        this.basicItem(GemCraftItem.RUBY_SHOVEL.get());
        this.basicItem(GemCraftItem.RUBY_AXE.get());
        this.basicItem(GemCraftItem.RUBY_HOE.get());
        this.basicItem(GemCraftItem.SAPPHIRE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_SWORD.get());
        this.basicItem(GemCraftItem.SAPPHIRE_PICKAXE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_SHOVEL.get());
        this.basicItem(GemCraftItem.SAPPHIRE_AXE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_HOE.get());
    }

    public ResourceLocation getResourceLocation(Item item) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
    }
}
