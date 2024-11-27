package com.github.herat.GemCraft.common.datagen.GCModelsProvider;

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
    public GCItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.basicItem(GemCraftItem.RUBY.get());
        this.basicItem(GemCraftItem.RUBY_SWORD.get());
        this.basicItem(GemCraftItem.RUBY_PICKAXE.get());
        this.basicItem(GemCraftItem.RUBY_SHOVEL.get());
        this.basicItem(GemCraftItem.RUBY_AXE.get());
        this.basicItem(GemCraftItem.RUBY_HOE.get());
        this.basicItem(GemCraftItem.RUBY_HELMET.get());
        this.basicItem(GemCraftItem.RUBY_CHESTPLATE.get());
        this.basicItem(GemCraftItem.RUBY_LEGGINGS.get());
        this.basicItem(GemCraftItem.RUBY_BOOT.get());
        this.basicItem(GemCraftItem.SAPPHIRE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_SWORD.get());
        this.basicItem(GemCraftItem.SAPPHIRE_PICKAXE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_SHOVEL.get());
        this.basicItem(GemCraftItem.SAPPHIRE_AXE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_HOE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_HELMET.get());
        this.basicItem(GemCraftItem.SAPPHIRE_CHESTPLATE.get());
        this.basicItem(GemCraftItem.SAPPHIRE_LEGGINGS.get());
        this.basicItem(GemCraftItem.SAPPHIRE_BOOT.get());
        this.basicItem(GemCraftItem.SAPPHIRE_APPLE.get());
    }

    public ResourceLocation getResourceLocation(Item item) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
    }
}
