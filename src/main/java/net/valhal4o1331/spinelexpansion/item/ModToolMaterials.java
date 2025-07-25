package net.valhal4o1331.spinelexpansion.item;

import net.minecraft.item.ToolMaterial;
import net.valhal4o1331.spinelexpansion.util.ModTags;

public class ModToolMaterials {

    public static final ToolMaterial SPINEL = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_SPINEL_TOOL, 3521, 7.0f,
            4.0f, 22, ModTags.Items.SPINEL_REPAIR);


//    SPINEL(ModTags.Blocks.INCORRECT_FOR_SPINEL_TOOL,
//            3521, 5.0F, 4.0F, 22, () -> Ingredient.ofItems(ModItems.SPINEL));
//
//    private final TagKey<Block> inverseTag;
//    private final int itemDurability;
//    private final float miningSpeed;
//    private final float attackDamage;
//    private final int enchantability;
//    private final Supplier<Ingredient> repairIngredient;
//
//    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
//                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
//        this.inverseTag = inverseTag;
//        this.itemDurability = itemDurability;
//        this.miningSpeed = miningSpeed;
//        this.attackDamage = attackDamage;
//        this.enchantability = enchantability;
//        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
//    }
//
//    @Override
//    public int getDurability() {
//        return this.itemDurability;
//    }
//
//    @Override
//    public float getMiningSpeedMultiplier() {
//        return this.miningSpeed;
//    }
//
//    @Override
//    public float getAttackDamage() {
//        return this.attackDamage;
//    }
//
//    @Override
//    public TagKey<Block> getInverseTag() {
//        return this.inverseTag;
//    }
//
//    @Override
//    public int getEnchantability() {
//        return this.enchantability;
//    }
//
//    @Override
//    public Ingredient getRepairIngredient() {
//        return this.repairIngredient.get();
//    }
}
