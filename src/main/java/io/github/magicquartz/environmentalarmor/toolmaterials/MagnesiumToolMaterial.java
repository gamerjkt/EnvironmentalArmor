package io.github.magicquartz.environmentalarmor.toolmaterials;

import io.github.magicquartz.environmentalarmor.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MagnesiumToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.MAGNESIUM_DUST);
    }
}
