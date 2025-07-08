package net.valhal4o1331.spinelexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;

public class ModItems {
    public static final Item SPINEL = registerItem("spinel", new Item(new Item.Settings()));
    public static final Item RAW_SPINEL = registerItem("raw_spinel", new Item(new Item.Settings()));
    public static final Item RAW_ANTHRACITE = registerItem("raw_anthracite", new Item(new Item.Settings()));

    public static final Item REFINED_ANTHRACITE = registerItem("refined_anthracite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpinelExpansion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpinelExpansion.LOGGER.info("Registering Mod Items for " + SpinelExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(SPINEL);
           entries.add(RAW_SPINEL);
        });
    }
}