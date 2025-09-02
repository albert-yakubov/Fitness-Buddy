package com.justme.fitnessbuddy.services;

import com.justme.fitnessbuddy.repositories.DietRepository;
import com.justme.fitnessbuddy.repositories.DietService;
import com.justme.fitnessbuddy.models.Diet;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "dietService")
public class DietServiceImplementation implements DietService {


    @Autowired
    private DietRepository dietRepository;

    @Override
    public List<Diet> findAllDiets() {


        List<Diet> list = new ArrayList<>();
        dietRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Diet findDietById(long id) {
        return dietRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Diet with id " + id + " not found"));
    }


    @Override
    public Diet findDietByName(String name) {
        Diet diet = findDietByName(name);
        if (diet == null) {throw new EntityNotFoundException("Diet with name " + name + " not found");}
        return diet;
    }

    @Override
    public List<Diet> findAllDietsByName(String dietName) {
        List<Diet> diets = new ArrayList<>();
        dietRepository.findAll().iterator().forEachRemaining(diets::add);
        return diets;

    }

}
