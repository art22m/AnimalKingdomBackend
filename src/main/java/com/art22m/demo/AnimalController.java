package com.art22m.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @RequestMapping("/get_animal/{animalName}")
    public Animal getAnimal(@PathVariable String animalName) {
        return animalService.getAnimal(animalName);
    }
}
