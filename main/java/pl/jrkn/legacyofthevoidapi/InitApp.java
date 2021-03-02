package pl.jrkn.legacyofthevoidapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.jrkn.legacyofthevoidapi.model.character.*;
import pl.jrkn.legacyofthevoidapi.model.character.Character;
import pl.jrkn.legacyofthevoidapi.service.CharacterService;

@Component
public class InitApp implements CommandLineRunner {
    @Autowired
    CharacterService characterService;

    @Override
    public void run(String... args) throws Exception {
        Character janusz = new Character();
        janusz.getCharacterDetails().setName("janusz");
        janusz.setCharacterClass(CharacterClass.HUNTER);
        janusz.setCharacterGender(CharacterGender.MALE);
        janusz.setCharacterRace(CharacterRace.ELF);

        characterService.createNewCharacter(janusz);

        System.out.println("init ");
    }
}
