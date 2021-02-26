package pl.jrkn.legacyofthevoidapi.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.jrkn.legacyofthevoidapi.model.Quest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestService {
    List<Quest> quests = new ArrayList<>(0);


    public void createRandomQuest() {
        quests.add(new Quest("Quest 1", .33, new Random(5).nextLong(), 1800000));
        System.out.println(quests.size());
    }
}
