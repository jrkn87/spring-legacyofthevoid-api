package pl.jrkn.legacyofthevoidapi.model.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int damage;
    private WeaponWeight weaponWeight;

    public Weapon(String name, int damage, WeaponWeight weaponWeight) {
        this.name = name;
        this.damage = damage;
        this.weaponWeight = weaponWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public WeaponWeight getWeaponWeight() {
        return weaponWeight;
    }

    public void setWeaponWeight(WeaponWeight weaponWeight) {
        this.weaponWeight = weaponWeight;
    }
}
