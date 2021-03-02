package pl.jrkn.legacyofthevoidapi.model.character;

public class StatPoints {

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
    private Character character;

    public StatPoints(Character character) {
        this.character = character;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public int getMaxHitPoints() {
        return maxHitPoints = character.getAttributes().getStamina() * 5 + character.getCharacterDetails().getLevel() * 16;
    }

    public int getDefence() {
        return character.getAttributes().getStamina() / 2;
    }

    public int getResistance(int intelligence) {
        return character.getAttributes().getIntelligence() / 2;
    }

    public int getDamageFromAttributes() {
        CharacterClass characterClass = character.getCharacterClass();
        Attributes attributes = character.getAttributes();
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

    public int getDodgeChance() {
        return PercentageChanceOfSuccess.getChanceOfSuccess(character.getAttributes().getDexterity());
    }

    public int getCriticalStrikeChance() {
        return PercentageChanceOfSuccess.getChanceOfSuccess(character.getAttributes().getLuck());
    }

    public boolean isDodge(int dexterity) {
        return PercentageChanceOfSuccess.chanceOfSuccess(dexterity);
    }

    public boolean isCriticalStrike(int luck) {
        return PercentageChanceOfSuccess.chanceOfSuccess(luck);
    }
}
