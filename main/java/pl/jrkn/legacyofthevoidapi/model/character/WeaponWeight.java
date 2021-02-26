package pl.jrkn.legacyofthevoidapi.model.character;

public enum WeaponWeight {
    HEAVY(24),
    MEDIUM_HEAVY(16),
    LIGHTWEIGHT(8);

    private int percentageDifferenceInDamage;

    WeaponWeight(int percentageDifferenceInDamage) {
        this.percentageDifferenceInDamage = percentageDifferenceInDamage;
    }

    public int getPercentageDifferenceInDamage() {
        return percentageDifferenceInDamage;
    }
}
