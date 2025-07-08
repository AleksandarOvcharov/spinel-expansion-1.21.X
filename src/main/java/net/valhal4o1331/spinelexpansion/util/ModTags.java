package net.valhal4o1331.spinelexpansion.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SPINEL_TOOL = createTag("needs_spinel_tool");
        public static final TagKey<Block> INCORRECT_FOR_SPINEL_TOOL = createTag("incorrect_for_spinel_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SpinelExpansion.MOD_ID, name));
        }
    }
}
