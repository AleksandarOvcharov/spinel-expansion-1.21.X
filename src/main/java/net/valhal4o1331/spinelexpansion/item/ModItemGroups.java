package net.valhal4o1331.spinelexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SPINEL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SpinelExpansion.MOD_ID, "spinel_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPINEL))
                    .displayName(Text.translatable("itemgroup.spinelexpansion.spinel_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPINEL);
                        entries.add(ModItems.RAW_SPINEL);

                        entries.add(ModItems.SPINEL_SWORD);
                        entries.add(ModItems.SPINEL_PICKAXE);
                        entries.add(ModItems.SPINEL_SHOVEL);
                        entries.add(ModItems.SPINEL_AXE);
                        entries.add(ModItems.SPINEL_HOE);

                        entries.add(ModItems.SPINEL_HAMMER);

                        entries.add(ModItems.SPINEL_HELMET);
                        entries.add(ModItems.SPINEL_CHESTPLATE);
                        entries.add(ModItems.SPINEL_LEGGINGS);
                        entries.add(ModItems.SPINEL_BOOTS);
                    }).build());

    public static final ItemGroup SPINEL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SpinelExpansion.MOD_ID, "spinel_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SPINEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.spinelexpansion.spinel_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SPINEL_BLOCK);
                        entries.add(ModBlocks.RAW_SPINEL_BLOCK);

                        entries.add(ModBlocks.SPINEL_ORE);
                        entries.add(ModBlocks.SPINEL_DEEPSLATE_ORE);
                    }).build());

    public static final ItemGroup ANTHRACITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SpinelExpansion.MOD_ID, "anthracite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANTHRACITE_ORE))
                    .displayName(Text.translatable("itemgroup.spinelexpansion.anthracite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANTHRACITE_ORE);
                        entries.add(ModItems.RAW_ANTHRACITE);
                        entries.add(ModItems.REFINED_ANTHRACITE);
                    }).build());

    public static void registerItemGroups() {
        SpinelExpansion.LOGGER.info("Registering Item Groups for " + SpinelExpansion.MOD_ID);
    }

}
