package com.github.herat.GemCraft.common.datagen;

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
        this.withExistingParent("ruby",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby");
        this.withExistingParent("ruby_sword",mcLoc("item/handheld")).texture("layer0","gemcraft:item/ruby_sword");
//        this.withExistingParent("ruby_sword",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_sword");
//        this.withExistingParent("ruby_pickaxe",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_pickaxe");
//        this.withExistingParent("ruby_shovel",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_shovel");
//        this.withExistingParent("ruby_axe",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_axe");
//        this.withExistingParent("ruby_hoe",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_hoe");
//        this.withExistingParent("sapphire",mcLoc("item/generated")).texture("layer0","gemcraft:item/sapphire");
//        this.withExistingParent("sapphire_sword",mcLoc("item/generated")).texture("layer0","gemcraft:item/sapphire_sword");
//        this.withExistingParent("sapphire_pickaxe",mcLoc("item/generated")).texture("layer0","gemcraft:item/sapphire_pickaxe");
//        this.withExistingParent("ruby_shovel",mcLoc("item/generated")).texture("layer0","gemcraft:item/ruby_shovel");
//        this.withExistingParent("sapphire_axe",mcLoc("item/generated")).texture("layer0","gemcraft:item/sapphire_axe");
//        this.withExistingParent("sapphire_hoe",mcLoc("item/generated")).texture("layer0","gemcraft:item/sapphire_hoe");
    }

    public ResourceLocation getResourceLocation(Item item) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item));
    }
}
