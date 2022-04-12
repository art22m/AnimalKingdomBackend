package com.art22m.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @RequestMapping("/get_animal/{animalName}")
    public Animal getAnimal(@PathVariable String animalName) {
        return animalService.getAnimal(animalName);
    }

    @RequestMapping("/get_all_animals/")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }
}
