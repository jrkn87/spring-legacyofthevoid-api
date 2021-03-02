package pl.jrkn.legacyofthevoidapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.jrkn.legacyofthevoidapi.model.character.Character;
import pl.jrkn.legacyofthevoidapi.service.CharacterService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<Character>> characters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Character>> findById(@PathVariable Long id) {
        return characterService.findCharacterById(id);
    }

    @PostMapping
    public ResponseEntity<Character> createNewCharacter(@RequestBody Character character) {
        return characterService.createNewCharacter(character);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Character> updateCharacter(@PathVariable Long id, @RequestBody Character character) {
        return characterService.updateCharacter(id, character);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCharacterById(@PathVariable Long id) {
        return characterService.deleteCharacterById(id);
    }
}
