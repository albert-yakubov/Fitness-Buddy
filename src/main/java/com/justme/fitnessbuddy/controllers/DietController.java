package com.justme.fitnessbuddy.controllers;


import com.justme.fitnessbuddy.repositories.DietService;
import com.justme.fitnessbuddy.models.Diet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diets")
public class DietController {

    //creates a constructor , autowires by name from implementation class
    @Autowired
    private DietService dietService;

    // list all
    //http://localhost:2025/diets/diets
    @GetMapping(value = "/diets", produces = {"application/json"})
    public ResponseEntity<?> listAllDiets() {
        List<Diet> myDiets = dietService.findAllDiets();
        return new ResponseEntity<>(myDiets, HttpStatus.OK);
    }

    // list by id
    //http://localhost:2025/diets/diets/1
    @GetMapping(value = "/diets/{diet_id}", produces = {"application/json"})
    public ResponseEntity<?> findById(@PathVariable long diet_id) {
        Diet myDiet = dietService.findDietById(diet_id);
        return new ResponseEntity<>(myDiet, HttpStatus.OK);
    }
    // list by name
    //http://localhost:2025/diets/diets/name
    @GetMapping(value = "/diets/{diet_name}", produces = {"application/json"})
    public ResponseEntity<?> listDietByName(@PathVariable String diet_name) {
        Diet myDiet = dietService.findDietByName(diet_name);
        return new ResponseEntity<>(myDiet, HttpStatus.OK);
    }
    // list all alike
    //http://localhost:2025/diets/diets/name
    @GetMapping(value = "/diets/{diet_name}", produces = {"application/json"})
    public ResponseEntity<?> listAllDietsByNameLike(@PathVariable String diet_name) {
        List<Diet> myDiets = dietService.findAllDietsByName(diet_name);
        return new ResponseEntity<>(myDiets, HttpStatus.OK);
    }


}
