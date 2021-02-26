package pl.jrkn.legacyofthevoidapi.service;

import pl.jrkn.legacyofthevoidapi.model.character.CharacterGender;
import pl.jrkn.legacyofthevoidapi.model.character.CharacterRace;

public interface CharacterService {
    Character createNewWarriorCharacter(String name, CharacterRace characterRace, CharacterGender characterGender);
}
