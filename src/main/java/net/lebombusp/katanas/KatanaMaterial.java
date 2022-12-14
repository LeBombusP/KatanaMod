package net.lebombusp.katanas;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KatanaMaterial implements ToolMaterial {

    public static final KatanaMaterial INSTANCE = new KatanaMaterial();

    @Override
    public int getDurability() {
        return 460;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0F;
    }

    @Override
    public float getAttackDamage() {
        return 0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
