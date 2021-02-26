package pl.jrkn.legacyofthevoidapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jrkn.legacyofthevoidapi.model.character.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
