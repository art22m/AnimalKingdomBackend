package com.art22m.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AnimalService {
    private HashMap <String, Animal> animals = new HashMap<>();

    public AnimalService() {
        animals.put("penguin", new Animal("logo.com/penguin",
                "I have zero cycles for this. What do you feel you would bring to the table if you were hired for this position paddle on both sides, and to be inspired is to become creative, innovative and energized we want this philosophy to trickle down to all our stakeholders but hammer out herding cats. Going forward drop-dead date.\n\nI also believe it's important for every member to be involved and invested in our company and this is one way to do so out of the loop, but beef up, but hit the ground running, or it just needs more cowbell. We're ahead of the curve on that one innovation is hot right now shotgun approach. Value-added take five, punch the tree, and come back in here with a clear head we need to start advertising on social media.",
                "Penguin",
                "0",
                "White",
                "Arctic Developer"));
    }

    public Animal getAnimal(String animalName) {
        return animals.get(animalName);
    }

    public HashMap<String, Animal> getAnimals() {
        return animals;
    }
}
