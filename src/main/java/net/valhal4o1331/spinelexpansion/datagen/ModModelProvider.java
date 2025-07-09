package net.valhal4o1331.spinelexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.valhal4o1331.spinelexpansion.block.ModBlocks;
import net.valhal4o1331.spinelexpansion.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPINEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SPINEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANTHRACITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPINEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPINEL_DEEPSLATE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SPINEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SPINEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ANTHRACITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_ANTHRACITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SPINEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPINEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPINEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPINEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPINEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SPINEL_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.SPINEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SPINEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SPINEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SPINEL_BOOTS);
    }
}
