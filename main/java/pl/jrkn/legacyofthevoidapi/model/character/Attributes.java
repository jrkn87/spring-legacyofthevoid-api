package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attributes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int stamina;
    private int luck;

    public Attributes() {

    }

    public Attributes(int strength, int dexterity, int intelligence, int stamina, int luck) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.stamina = stamina;
        this.luck = luck;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id=" + id +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", stamina=" + stamina +
                ", luck=" + luck +
                '}';
    }
}
