package pl.jrkn.legacyofthevoidapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import pl.jrkn.legacyofthevoidapi.model.character.*;
import pl.jrkn.legacyofthevoidapi.model.character.Character;
import pl.jrkn.legacyofthevoidapi.repository.CharacterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService{
    private CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public ResponseEntity<Character> createNewCharacter(Character character) {
        Character createCharacter = new Character();
        createCharacter.getCharacterDetails().setName(character.getCharacterDetails().getName());
        createCharacter.setCharacterRace(character.getCharacterRace());
        createCharacter.setCharacterClass(character.getCharacterClass());
        createCharacter.setCharacterGender(character.getCharacterGender());
        createCharacter.initAttributes(character.getCharacterClass());
        characterRepository.save(createCharacter);
        return ResponseEntity.status(201).body(createCharacter);
    }

    @Override
    public ResponseEntity<Character> updateCharacter(Long id, Character character) {
        Optional<Character> optionalCharacter = characterRepository.findById(id);
        if (optionalCharacter.isPresent()) {
            character.setId(id);
            characterRepository.save(character);
            return ResponseEntity.ok(character);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Character>> getAllCharacters() {
        return ResponseEntity.ok(characterRepository.findAll());
    }

    public ResponseEntity<Optional<Character>> findCharacterById(Long id) {
        Optional<Character> character = characterRepository.findById(id);
        if (character.isPresent())
            return ResponseEntity.ok(character);
        else
            return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity deleteCharacterById(Long id) {
        Optional<Character> character = characterRepository.findById(id);
        if (character.isPresent()) {
            characterRepository.delete(character.get());
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.notFound().build();
    }
}
