package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int currentHitPoints;
    private int maxHitPoints;
    private int defPoints;
    private int damage;
    private int damageMin;
    private int damageMax;
    private int dodgeChance;
    private int criticalStrikeChance;
    private boolean criticalStrike;

    public StatPoints() {
    }

    public StatPoints(int currentHitPoints, int maxHitPoints, int defPoints, int damage, int damageMin, int damageMax, int dodgeChance, int criticalStrikeChance, boolean criticalStrike) {
        this.currentHitPoints = currentHitPoints;
        this.maxHitPoints = maxHitPoints;
        this.defPoints = defPoints;
        this.damage = damage;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.dodgeChance = dodgeChance;
        this.criticalStrikeChance = criticalStrikeChance;
        this.criticalStrike = criticalStrike;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getDefPoints() {
        return defPoints;
    }

    public void setDefPoints(int defPoints) {
        this.defPoints = defPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public void setDamageMin(int damageMin) {
        this.damageMin = damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public int getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(int criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public boolean isCriticalStrike() {
        return criticalStrike;
    }

    public void setCriticalStrike(boolean criticalStrike) {
        this.criticalStrike = criticalStrike;
    }
}
