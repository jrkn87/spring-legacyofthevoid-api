package pl.jrkn.legacyofthevoidapi.model.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatPointsOldTest {
    @Test
    void getAmoundOfExperienceNeededShouldReturnCorrectValue() {
        //given
        //when
        long neededExperience = StatPointsOld.getAmoundOfExperienceNeeded(1);

        //then
        assertEquals(50, neededExperience);
    }
    @Test
    void getAmoundOfExperienceNeededShouldReturnCorrectValue2() {
        //given
        //when
        long neededExperience = StatPointsOld.getAmoundOfExperienceNeeded(2);

        //then
        assertEquals(100, neededExperience);
    }
    @Test
    void getAmoundOfExperienceNeededShouldReturnCorrectValue3Plus() {
        //given
        //when
        long neededExperience = StatPointsOld.getAmoundOfExperienceNeeded(8);

        //then
        assertEquals(4500, neededExperience);
    }
}