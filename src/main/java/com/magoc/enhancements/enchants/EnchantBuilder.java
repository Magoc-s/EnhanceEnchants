package com.magoc.enhancements.enchants;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class EnchantBuilder extends Enchantment {
    Rarity enchantRarity;
    EquipmentSlot equipmentSlot;
    int givenMinPower = super.getMinPower();
    Int2IntFunction minPower = super::getMinPower;
    Int2IntFunction maxPower = super::getMaxPower;
    int givenMaxLevel = super.getMaxLevel();
    boolean isTreasure;
    boolean isCursed;

    public EnchantBuilder(Rarity rarity, EnchantmentTarget target, EquipmentSlot equipmentSlot) {
        super(rarity, target, new EquipmentSlot[] {equipmentSlot});
    }

    public EnchantBuilder minPower(int power) {
        givenMinPower = power;
        return this;
    }

    public EnchantBuilder maxLevel(int level) {
        givenMaxLevel = level;
        return this;
    }

    public EnchantBuilder treasure(boolean isTreasure) {
        this.isTreasure = isTreasure;
        return this;
    }

    public EnchantBuilder curse(boolean isCursed) {
        this.isCursed = isCursed;
        return this;
    }


    // Enchantment application properties
    @Override
    public int getMinPower(int level) {
        return givenMinPower;
    }
    @Override
    public int getMaxLevel() {
        return givenMaxLevel;
    }

    // Enchantment class properties
    @Override
    public boolean isTreasure() {
        return isTreasure;
    }
    @Override
    public boolean isCursed() {
        return isCursed;
    }


}
