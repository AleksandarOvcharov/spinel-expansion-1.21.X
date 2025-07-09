package net.valhal4o1331.spinelexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.block.ModBlocks;
import net.valhal4o1331.spinelexpansion.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> SPINEL_SMELTABLES = List.of(ModItems.RAW_SPINEL, ModBlocks.SPINEL_ORE,
                ModBlocks.SPINEL_DEEPSLATE_ORE);

        offerSmelting(exporter, SPINEL_SMELTABLES, RecipeCategory.MISC, ModItems.SPINEL, 0.25f, 200, "spinel_smelting");
        offerBlasting(exporter, SPINEL_SMELTABLES, RecipeCategory.MISC, ModItems.SPINEL, 0.25f, 200, "spinel_blasting");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SPINEL, RecipeCategory.DECORATIONS, ModBlocks.SPINEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_SPINEL_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_SPINEL)
                .criterion(hasItem(ModItems.RAW_SPINEL), conditionsFromItem(ModItems.RAW_SPINEL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_SPINEL, 9)
                .input(ModBlocks.RAW_SPINEL_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_SPINEL_BLOCK), conditionsFromItem(ModBlocks.RAW_SPINEL_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_SWORD)
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_PICKAXE)
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_AXE)
                .pattern("SS ")
                .pattern("ST ")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_SHOVEL)
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_HOE)
                .pattern("SS ")
                .pattern(" T ")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_HAMMER)
                .pattern("SSS")
                .pattern("STS")
                .pattern(" T ")
                .input('S', ModItems.SPINEL)
                .input('T', Items.STICK)
                .criterion(hasItem(ModItems.SPINEL), conditionsFromItem(ModItems.SPINEL))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', ModItems.SPINEL)
                .criterion("has_spinel", conditionsFromItem(ModItems.SPINEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SPINEL)
                .criterion("has_spinel", conditionsFromItem(ModItems.SPINEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SPINEL)
                .criterion("has_spinel", conditionsFromItem(ModItems.SPINEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SPINEL_BOOTS)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SPINEL)
                .criterion("has_spinel", conditionsFromItem(ModItems.SPINEL))
                .offerTo(exporter);

        offerSmithingTrimRecipe(exporter, ModItems.SPINEL_SMITHING_TEMPLATE, Identifier.of(SpinelExpansion.MOD_ID,
                "spinel"));



    }
}
