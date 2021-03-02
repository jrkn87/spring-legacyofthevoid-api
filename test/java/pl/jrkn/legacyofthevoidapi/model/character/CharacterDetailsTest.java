package pl.jrkn.legacyofthevoidapi.model.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterDetailsTest {
    @Test
    void getAmountOfExperienceNeededShouldReturnCorrectValue() {
        //given
        Character character = new Character();
        //when
        long neededExperience = character.getCharacterDetails().getAmountOfExperienceNeeded();

        //then
        assertEquals(50, neededExperience);
    }
    @Test
    void getAmountOfExperienceNeededShouldReturnCorrectValue2() {
        //given
        Character character = new Character();
        character.getCharacterDetails().setLevel(2);
        //when
        long neededExperience = character.getCharacterDetails().getAmountOfExperienceNeeded();

        //then
        assertEquals(100, neededExperience);
    }
    @Test
    void getAmountOfExperienceNeededShouldReturnCorrectValue3Plus() {
        //given
        Character character = new Character();
        character.getCharacterDetails().setLevel(8);
        //when
        long neededExperience = character.getCharacterDetails().getAmountOfExperienceNeeded();

        //then
        assertEquals(4500, neededExperience);
    }
}