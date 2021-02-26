package pl.jrkn.legacyofthevoidapi.model;

public class Quest {
    private long id;
    private String description;
    private double gold;
    private long experience;
    private long time;

    public Quest(String description, double gold, long experience, long time) {
        this.description = description;
        this.gold = gold;
        this.experience = experience;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getGold() {
        return gold;
    }

    public long getExperience() {
        return experience;
    }

    public long getTime() {
        return time;
    }
}
