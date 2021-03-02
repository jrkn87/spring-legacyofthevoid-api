package pl.jrkn.legacyofthevoidapi.model.character;

public enum ExperienceToNextLevel {
    LVL_2(2, 50),
    LVL_3(3, 100),
    LVL_4(4, 300),
    LVL_5(5, 700),
    LVL_6(6, 1600),
    LVL_7(7, 2500),
    LVL_8(8, 4500),
    LVL_9(9, 7500),
    LVL_10(10, 12000);

    private int level;
    private long amountOfExperienceNeeded;

    ExperienceToNextLevel(int level, long amoundOfExperienceNeeded) {
        this.level = level;
        this.amountOfExperienceNeeded = amoundOfExperienceNeeded;
    }

    public int getLevel() {
        return level;
    }

    public long getAmountOfExperienceNeeded() {
        return amountOfExperienceNeeded;
    }
}
