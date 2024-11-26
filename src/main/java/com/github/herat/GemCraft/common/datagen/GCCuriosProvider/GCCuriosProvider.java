//package com.github.herat.GemCraft.common.datagen.GCCuriosProvider;
//
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//import top.theillusivec4.curios.api.CuriosDataProvider;
//import top.theillusivec4.curios.api.type.capability.ICurio;
//
//import java.util.concurrent.CompletableFuture;
//
//public class GCCuriosProvider extends CuriosDataProvider {
//    public GCCuriosProvider(String modid , PackOutput output, ExistingFileHelper existingFileHelper, CompletableFuture< HolderLookup.Provider> registries) {
//        super(modid, output, existingFileHelper, registries);
//    }
//
//    @Override
//    public void generate(HolderLookup.Provider registries, ExistingFileHelper fileHelper) {
//        this.createSlot("gemcraft_solt")
//                .size(1)
//                .dropRule(ICurio.DropRule.DEFAULT)
//                .addCosmetic(true);
//
//        this.createEntities("gemcraft_solt_entity")
//                .addPlayer()
//                .addSlots("necklace","head","back","curio");
//
//
//    }
//}
