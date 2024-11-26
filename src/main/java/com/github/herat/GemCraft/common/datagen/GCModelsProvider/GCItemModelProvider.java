package com.github.herat.GemCraft.common.datagen.GCModelsProvider;

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
        this.withExistingParent("ruby", mcLoc("item/generated")).texture("layer0", "gemcraft:item/ruby");
        this.withExistingParent("ruby_sword", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/ruby_sword");
        this.withExistingParent("ruby_pickaxe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/ruby_pickaxe");
        this.withExistingParent("ruby_shovel", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/ruby_shovel");
        this.withExistingParent("ruby_axe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/ruby_axe");
        this.withExistingParent("ruby_hoe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/ruby_hoe");
        this.withExistingParent("ruby_helmet", mcLoc("item/generated")).texture("layer0", "gemcraft:item/ruby_helmet");
        this.withExistingParent("ruby_chestplate", mcLoc("item/generated")).texture("layer0", "gemcraft:item/ruby_chestplate");
        this.withExistingParent("ruby_leggings", mcLoc("item/generated")).texture("layer0", "gemcraft:item/ruby_leggings");
        this.withExistingParent("ruby_boots", mcLoc("item/generated")).texture("layer0", "gemcraft:item/ruby_boots");
        this.withExistingParent("sapphire", mcLoc("item/generated")).texture("layer0", "gemcraft:item/sapphire");
        this.withExistingParent("sapphire_sword", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/sapphire_sword");
        this.withExistingParent("sapphire_pickaxe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/sapphire_pickaxe");
        this.withExistingParent("sapphire_shovel", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/sapphire_shovel");
        this.withExistingParent("sapphire_axe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/sapphire_axe");
        this.withExistingParent("sapphire_hoe", mcLoc("item/handheld")).texture("layer0", "gemcraft:item/sapphire_hoe");
        this.withExistingParent("sapphire_helmet", mcLoc("item/generated")).texture("layer0", "gemcraft:item/sapphire_helmet");
        this.withExistingParent("sapphire_chestplate", mcLoc("item/generated")).texture("layer0", "gemcraft:item/sapphire_chestplate");
        this.withExistingParent("sapphire_leggings", mcLoc("item/generated")).texture("layer0", "gemcraft:item/sapphire_leggings");
        this.withExistingParent("sapphire_boots", mcLoc("item/generated")).texture("layer0", "gemcraft:item/sapphire_boots");
    }

    public ResourceLocation getResourceLocation(Item item) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
    }
}
