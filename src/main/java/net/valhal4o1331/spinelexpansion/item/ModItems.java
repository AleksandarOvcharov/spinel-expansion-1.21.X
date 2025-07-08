package net.valhal4o1331.spinelexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.item.custom.HammerItem;

public class ModItems {
    public static final Item SPINEL = registerItem("spinel", new Item(new Item.Settings()));
    public static final Item RAW_SPINEL = registerItem("raw_spinel", new Item(new Item.Settings()));
    public static final Item RAW_ANTHRACITE = registerItem("raw_anthracite", new Item(new Item.Settings()));

    public static final Item REFINED_ANTHRACITE = registerItem("refined_anthracite", new Item(new Item.Settings()));

    public static final Item SPINEL_SWORD = registerItem("spinel_sword",
            new SwordItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 8, -2.4f))));

    public static final Item SPINEL_PICKAXE = registerItem("spinel_pickaxe",
            new PickaxeItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 1, -2.8f))));

    public static final Item SPINEL_SHOVEL = registerItem("spinel_shovel",
            new ShovelItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 1.5f, -3.0f))));

    public static final Item SPINEL_AXE = registerItem("spinel_axe",
            new AxeItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 6, -3.2f))));

    public static final Item SPINEL_HOE = registerItem("spinel_hoe",
            new HoeItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 1, -3f))));

    public static final Item SPINEL_HAMMER = registerItem("spinel_hammer",
            new HammerItem(ModToolMaterials.SPINEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers
                            (ModToolMaterials.SPINEL, 7, -3.4f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpinelExpansion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpinelExpansion.LOGGER.info("Registering Mod Items for " + SpinelExpansion.MOD_ID);
    }
}