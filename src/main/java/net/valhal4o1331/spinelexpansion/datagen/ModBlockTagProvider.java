package net.valhal4o1331.spinelexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.valhal4o1331.spinelexpansion.block.ModBlocks;
import net.valhal4o1331.spinelexpansion.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SPINEL_BLOCK)
                .add(ModBlocks.SPINEL_ORE)
                .add(ModBlocks.SPINEL_DEEPSLATE_ORE)
                .add(ModBlocks.SPINEL_BLOCK)
                .add(ModBlocks.ANTHRACITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_SPINEL_BLOCK)
                .add(ModBlocks.SPINEL_ORE)
                .add(ModBlocks.ANTHRACITE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SPINEL_TOOL)
            .addTag(BlockTags.NEEDS_IRON_TOOL);

    }
}
