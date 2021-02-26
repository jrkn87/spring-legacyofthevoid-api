package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CharacterDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int level;
    private int maxLevel;
    private long experience;
    private long amountOfExperienceNeeded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public long getAmountOfExperienceNeeded() {
        return amountOfExperienceNeeded;
    }

    public void setAmountOfExperienceNeeded(long amountOfExperienceNeeded) {
        this.amountOfExperienceNeeded = amountOfExperienceNeeded;
    }
}
