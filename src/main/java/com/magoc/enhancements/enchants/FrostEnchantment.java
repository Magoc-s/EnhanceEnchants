package com.magoc.enhancements.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class FrostEnchantment extends Enchantment {

    /**
     * Enchantment initialiser, instantiate the rarity, target of enchantment (tool/wearable type), and the slot it works on.
     */
    public FrostEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return
    }
}
