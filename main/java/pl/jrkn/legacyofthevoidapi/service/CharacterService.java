package pl.jrkn.legacyofthevoidapi.service;

import org.springframework.http.ResponseEntity;
import pl.jrkn.legacyofthevoidapi.model.character.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterService {
    ResponseEntity<Character> createNewCharacter(Character character);
    ResponseEntity<Character> updateCharacter(Long id, Character character);
    ResponseEntity<List<Character>> getAllCharacters();
    ResponseEntity<Optional<Character>> findCharacterById(Long id);
    ResponseEntity deleteCharacterById(Long id);
}
