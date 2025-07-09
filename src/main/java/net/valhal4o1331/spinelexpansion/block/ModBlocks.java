package net.valhal4o1331.spinelexpansion.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;

public class ModBlocks {

    public static final Block SPINEL_BLOCK = registerBlock("spinel_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID + "spinel_block")))
                    .strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_SPINEL_BLOCK = registerBlock("raw_spinel_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID + "raw_spinel_block")))
                    .strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block SPINEL_ORE = registerBlock("spinel_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID + "spinel_ore")))
                            .strength(3f).requiresTool()));
    public static final Block SPINEL_DEEPSLATE_ORE = registerBlock("spinel_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID + "spinel_deepslate_ore")))
                            .strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ANTHRACITE_ORE = registerBlock("anthracite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID + "anthracite_ore")))
                            .strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SpinelExpansion.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SpinelExpansion.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID , name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        SpinelExpansion.LOGGER.info("Registering Mod Blocks for " + SpinelExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SPINEL_BLOCK);
            entries.add(ModBlocks.RAW_SPINEL_BLOCK);

            entries.add(ModBlocks.SPINEL_ORE);
            entries.add(ModBlocks.SPINEL_DEEPSLATE_ORE);
            entries.add(ModBlocks.ANTHRACITE_ORE);
        });
    }
}