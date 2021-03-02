package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;

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
    private int attributePoints;

    public CharacterDetails() {
        this.name = "";
        this.level = 1;
        this.maxLevel = 60;
        this.experience = 0;
        this.amountOfExperienceNeeded = 0;
        this.attributePoints = 0;
    }

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
            int nextLevel;
            if (this.level == 1)
                nextLevel = 0;
            else if (this.level == 2)
                nextLevel = 1;
            else
                nextLevel = this.level - 2;

            long[] longs = Arrays.stream(ExperienceToNextLevel.values()).mapToLong(ExperienceToNextLevel::getAmountOfExperienceNeeded).toArray();
            return amountOfExperienceNeeded = longs[nextLevel];
    }

    public void setAmountOfExperienceNeeded(long amountOfExperienceNeeded) {
        this.amountOfExperienceNeeded = amountOfExperienceNeeded;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAttributePoints() {
        return attributePoints;
    }

    public void setAttributePoints(int attributePoints) {
        this.attributePoints = attributePoints;
    }
}
