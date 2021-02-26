package pl.jrkn.legacyofthevoidapi.model.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponWeightTest {
    @Test
    void meadiumHeavyShouldBeReturn16() {
        //given
        int percentageDifferenceInDamage = WeaponWeight.MEDIUM_HEAVY.getPercentageDifferenceInDamage();

        //when
        //then
        assertEquals(16, percentageDifferenceInDamage);
    }
}