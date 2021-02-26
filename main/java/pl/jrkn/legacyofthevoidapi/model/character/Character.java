package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private CharacterDetails characterDetails;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private CharacterGender characterGender;
    @OneToOne
    private StatPoints statPoints;
    @OneToOne
    private Attributes attributes;
    @OneToOne
    private Weapon weapon;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CharacterDetails getCharacterDetails() {
        return characterDetails;
    }

    public void setCharacterDetails(CharacterDetails characterDetails) {
        this.characterDetails = characterDetails;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterRace getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(CharacterRace characterRace) {
        this.characterRace = characterRace;
    }

    public CharacterGender getCharacterGender() {
        return characterGender;
    }

    public void setCharacterGender(CharacterGender characterGender) {
        this.characterGender = characterGender;
    }

    public StatPoints getStatPoints() {
        return statPoints;
    }

    public void setStatPoints(StatPoints statPoints) {
        this.statPoints = statPoints;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
