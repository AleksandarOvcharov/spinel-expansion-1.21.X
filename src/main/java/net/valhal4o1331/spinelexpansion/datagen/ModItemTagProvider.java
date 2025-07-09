package net.valhal4o1331.spinelexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.valhal4o1331.spinelexpansion.item.ModItems;
import net.valhal4o1331.spinelexpansion.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.SPINEL_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.SPINEL_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.SPINEL_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.SPINEL_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.SPINEL_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SPINEL_HELMET)
                .add(ModItems.SPINEL_CHESTPLATE)
                .add(ModItems.SPINEL_LEGGINGS)
                .add(ModItems.SPINEL_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.SPINEL_REPAIR)
                .add(ModItems.SPINEL);

    }
}
