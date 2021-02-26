package pl.jrkn.legacyofthevoidapi.model.character;

public class PercentageChanceOfSuccess {
    public static boolean chanceOfSuccess(int attribute) {
        return Math.random() >= (1 - getChance(attribute));
    }

    private static float getChance(int atrr) {
        return (atrr * .2F) / 100;
    }
}
