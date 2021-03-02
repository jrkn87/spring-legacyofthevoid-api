package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class StatPointsOld {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int currentHitPoints;
    private int maxHitPoints;
    private int defence;
    private int resistance;
    private int damage;
    private int damageMin;
    private int damageMax;
    private int dodgeChance;
    private int criticalStrikeChance;
    private boolean dodge;
    private boolean criticalStrike;

    public StatPointsOld() {
        this.currentHitPoints = 0;
        this.maxHitPoints = 0;
        this.defence = 0;
        this.resistance = 0;
        this.damage = 0;
        this.damageMin = 0;
        this.damageMax = 0;
        this.dodgeChance = 0;
        this.criticalStrikeChance = 0;
        this.dodge = false;
        this.criticalStrike = false;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public int getMaxHitPoints(int stamina, int level) {
        return maxHitPoints = stamina * 5 + level * 16;
    }

    public int getDefence(int stamina) {
        return defence = stamina / 2;
    }

    public int getResistance(int intelligence) {
        return resistance = intelligence / 2;
    }

    public int getDamageFromAttributes(Attributes attributes, CharacterClass characterClass) {
        damage = (int) ( attributes.getStrength() * characterClass.getStrengthMultiplier() +
                attributes.getDexterity() * characterClass.getDexterityMultiplier() +
                attributes.getIntelligence() * characterClass.getIntelligenceMultiplier() +
                attributes.getLuck() * characterClass.getLuckMultiplier());
        return damage;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public int getDodgeChance(int dexterity) {
        return dodgeChance = PercentageChanceOfSuccess.getChanceOfSuccess(dexterity);
    }

    public int getCriticalStrikeChance(int luck) {
        return criticalStrikeChance = PercentageChanceOfSuccess.getChanceOfSuccess(luck);
    }

    public boolean isDodge(int dexterity) {
        return dodge = PercentageChanceOfSuccess.chanceOfSuccess(dexterity);
    }

    public boolean isCriticalStrike(int luck) {
        return criticalStrike = PercentageChanceOfSuccess.chanceOfSuccess(luck);
    }

    public static long getAmountOfExperienceNeeded(int currentLevel) {
        int level;
        if (currentLevel == 1)
            level = 0;
        else if (currentLevel == 2)
            level = 1;
        else
            level = currentLevel - 2;

        long[] longs = Arrays.stream(ExperienceToNextLevel.values()).mapToLong(ExperienceToNextLevel::getAmountOfExperienceNeeded).toArray();
        return longs[level];
    }
}
