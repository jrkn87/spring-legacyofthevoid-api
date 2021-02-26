package pl.jrkn.legacyofthevoidapi.model.character;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StatPointsOld {
    private static int minDamage;
    private static int maxDamage;
    private static boolean criticalStrikeInfo;

    public static long getAmoundOfExperienceNeeded(int currentLevel) {
        int level;
        if (currentLevel == 1)
            level = 0;
        else if (currentLevel == 2)
            level = 1;
        else
            level = currentLevel - 2;

        long[] longs = Arrays.stream(ExperienceToNextLevel.values()).mapToLong(ExperienceToNextLevel::getAmoundOfExperienceNeeded).toArray();
        return longs[level];

    }

    public static int getHitPoints(int stamina) {
        return stamina * 5;
    }

    public static int getDefence(int stamina) {
        return stamina / 2;
    }

    public static int getResistance(int intelligence) {
        return intelligence / 2;
    }

    public static int getDamageMin() {
        return minDamage;
    }

    public static int getDamageMax() {
        return maxDamage;
    }

    public static int getPower(int strength, int dexterity, int luck, int damageWeapon, int weaponWeightPercentage) {
        int damage = damageFormula(strength, dexterity, damageWeapon);
        int x = new Random().nextInt(weaponWeightPercentage);
        minDamage = damage;
        maxDamage = damage + weaponWeightPercentage;

        damage += x;

        if (isCriticalStrike(luck)) {
            System.out.println("Critical strike !!");
            damage += damage * .75;
            criticalStrikeInfo = true;
        } else
            criticalStrikeInfo = false;

        return damage;
    }

/*    public static int getDodgeChance(Hero hero) {
        float dodgeChance = getChance(hero.getAttribute().getDexterity());
        return (int) (dodgeChance * 100);
    }*/

    public static boolean criticalStrikeInfo() {
        return criticalStrikeInfo;
    }

    private static boolean isDodge(int dexterity) {
        return PercentageChanceOfSuccess.chanceOfSuccess(dexterity);
    }

    private static boolean isCriticalStrike(int luck) {
        return PercentageChanceOfSuccess.chanceOfSuccess(luck);
    }

    private static int damageFormula(int strength, int dexterity, int demageWeapon) {
        return (int) (strength * 1.3 + dexterity * .25 + demageWeapon);
    }
}