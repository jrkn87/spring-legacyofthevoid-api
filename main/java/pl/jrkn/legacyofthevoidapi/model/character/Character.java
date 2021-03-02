package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private CharacterDetails characterDetails;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private CharacterGender characterGender;
    @Transient
    private StatPoints statPoints;
    @OneToOne(cascade = CascadeType.ALL)
    private Attributes attributes;
    @OneToOne(cascade = CascadeType.ALL)
    private Weapon weapon;

    public Character() {
        this.characterDetails = new CharacterDetails();
        this.characterClass = CharacterClass.WARRIOR;
        this.characterRace = CharacterRace.HUMAN;
        this.characterGender = CharacterGender.MALE;
        this.attributes = new Attributes();
        this.statPoints = new StatPoints(this);
        this.weapon = new Weapon();
    }

    public void levelUp() {
        this.getCharacterDetails().setLevel(this.characterDetails.getLevel() + 1);
        this.getCharacterDetails().setAttributePoints(7);
    }

    public void setAttributePoints(Attributes attributes) {
        getAttributes().setStrength(getAttributes().getStrength() + attributes.getStrength());
        getAttributes().setDexterity(getAttributes().getDexterity() + attributes.getDexterity());
        getAttributes().setIntelligence(getAttributes().getIntelligence() + attributes.getIntelligence());
        getAttributes().setStamina(getAttributes().getStamina() + attributes.getStamina());
        getAttributes().setLuck(getAttributes().getLuck() + attributes.getLuck());
    }

    public void initAttributes(CharacterClass characterClass) {
        getAttributes().setStrength(characterClass.getStrength());
        getAttributes().setDexterity(characterClass.getDexterity());
        getAttributes().setIntelligence(characterClass.getIntelligence());
        getAttributes().setStamina(characterClass.getStamina());
        getAttributes().setLuck(characterClass.getLuck());
    }

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

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", characterDetails=" + characterDetails +
                ", characterClass=" + characterClass +
                ", characterRace=" + characterRace +
                ", characterGender=" + characterGender +
                ", statPoints=" + statPoints +
                ", attributes=" + attributes +
                ", weapon=" + weapon +
                '}';
    }
}
