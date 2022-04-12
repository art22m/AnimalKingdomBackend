package com.art22m.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/get_all_animals")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @RequestMapping(value = "/add_animal", method = RequestMethod.POST)
    public ResponseEntity<String> persistAnimal(@RequestBody Animal animal) {
        if (animalService.isValid(animal)) {
            animalService.addAnimal(animal);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
