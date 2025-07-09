package net.valhal4o1331.spinelexpansion.item;

import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.item.custom.HammerItem;
import net.valhal4o1331.spinelexpansion.item.custom.ModArmorItem;

public class ModItems {
    public static final Item SPINEL = registerItem("spinel", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel")))));
    public static final Item RAW_SPINEL = registerItem("raw_spinel", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "raw_spinel")))));
    public static final Item RAW_ANTHRACITE = registerItem("raw_anthracite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "raw_anthracite")))));

    public static final Item REFINED_ANTHRACITE = registerItem("refined_anthracite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "refined_anthracite")))));

    public static final Item SPINEL_SWORD = registerItem("spinel_sword",
            new SwordItem(ModToolMaterials.SPINEL, 8, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_sword")))));

    public static final Item SPINEL_PICKAXE = registerItem("spinel_pickaxe",
            new PickaxeItem(ModToolMaterials.SPINEL, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_pickaxe")))));

    public static final Item SPINEL_SHOVEL = registerItem("spinel_shovel",
            new ShovelItem(ModToolMaterials.SPINEL, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_shovel")))));

    public static final Item SPINEL_AXE = registerItem("spinel_axe",
            new AxeItem(ModToolMaterials.SPINEL, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_axe")))));

    public static final Item SPINEL_HOE = registerItem("spinel_hoe",
            new HoeItem(ModToolMaterials.SPINEL, 1, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_hoe")))));

    public static final Item SPINEL_HAMMER = registerItem("spinel_hammer",
            new HammerItem(ModToolMaterials.SPINEL, 7, -3.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_hammer")))));

    public static final Item SPINEL_HELMET = registerItem("spinel_helmet",
            new ModArmorItem(ModArmorMaterials.SPINEL_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_helmet")))));

    public static final Item SPINEL_CHESTPLATE = registerItem("spinel_chestplate",
            new ArmorItem(ModArmorMaterials.SPINEL_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_chestplate")))));

    public static final Item SPINEL_LEGGINGS = registerItem("spinel_leggings",
            new ArmorItem(ModArmorMaterials.SPINEL_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_leggings")))));

    public static final Item SPINEL_BOOTS = registerItem("spinel_boots",
            new ArmorItem(ModArmorMaterials.SPINEL_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SpinelExpansion.MOD_ID, "spinel_boots")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpinelExpansion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpinelExpansion.LOGGER.info("Registering Mod Items for " + SpinelExpansion.MOD_ID);
    }
}