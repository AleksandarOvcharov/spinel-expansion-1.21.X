package net.valhal4o1331.spinelexpansion.item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.util.ModTags;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ArmorMaterial SPINEL_ARMOR_MATERIAL = new ArmorMaterial(500,
            Util.make(new EnumMap<>(EquipmentType.class), map -> {
                map.put(EquipmentType.BOOTS, 3);
                map.put(EquipmentType.LEGGINGS, 6);
                map.put(EquipmentType.CHESTPLATE, 8);
                map.put(EquipmentType.HELMET, 3);
                map.put(EquipmentType.BODY, 3);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 0, 0, ModTags.Items.SPINEL_REPAIR,
                    Identifier.of(SpinelExpansion.MOD_ID, "spinel"));
}
