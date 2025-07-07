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
                    }).build());

    public static final ItemGroup SPINEL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SpinelExpansion.MOD_ID, "spinel_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SPINEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.spinelexpansion.spinel_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SPINEL_BLOCK);
                        entries.add(ModBlocks.RAW_SPINEL_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        SpinelExpansion.LOGGER.info("Registering Item Groups for " + SpinelExpansion.MOD_ID);
    }

}
