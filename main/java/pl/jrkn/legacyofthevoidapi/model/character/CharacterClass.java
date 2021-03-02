package pl.jrkn.legacyofthevoidapi.model.character;

public enum CharacterClass {

    WARRIOR(3, 2, 1, 2, 2, 1.3F, .25F, 1, 1),
    MAGE(1, 1, 5, 1, 2, 1, 1, 1.5F, 1),
    HUNTER(1, 4, 1, 1, 3, .2F, 1.3F, 1, .2F);

    private int strength;
    private int dexterity;
    private int intelligence;
    private int stamina;
    private int luck;
    private float strengthMultiplier;
    private float dexterityMultiplier;
    private float intelligenceMultiplier;
    private float luckMultiplier;

    CharacterClass(int strength, int dexterity, int intelligence, int stamina, int luck, float strengthMultiplier, float dexterityMultiplier, float intelligenceMultiplier, float luckMultiplier) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.luck = luck;
        this.strengthMultiplier = strengthMultiplier;
        this.dexterityMultiplier = dexterityMultiplier;
        this.intelligenceMultiplier = intelligenceMultiplier;
        this.luckMultiplier = luckMultiplier;
    }

    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getStamina() {
        return stamina;
    }
    public int getLuck() {
        return luck;
    }
    public float getStrengthMultiplier() {
        return strengthMultiplier;
    }
    public float getDexterityMultiplier() {
        return dexterityMultiplier;
    }
    public float getIntelligenceMultiplier() {
        return intelligenceMultiplier;
    }
    public float getLuckMultiplier() {
        return luckMultiplier;
    }
}
