package com.art22m.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AnimalService {
    private HashMap <String, Animal> animals = new HashMap<>();

    public AnimalService() {
//        animals.put("")
    }

    public Animal getAnimal(String animalName) {
        return animals.get(animalName);
    }

    public HashMap<String, Animal> getAnimals() {
        return animals;
    }
}
