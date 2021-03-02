package pl.jrkn.legacyofthevoidapi.model.character;

public class PercentageChanceOfSuccess {
    public static boolean chanceOfSuccess(int attribute) {
        return Math.random() >= (1 - getChance(attribute));
    }
    public static int getChanceOfSuccess(int attribute) {
        return (int) (attribute * .2F);
    }

    private static float getChance(int atrr) {
        return (atrr * .2F) / 100;
    }
}
