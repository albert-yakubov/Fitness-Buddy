package com.justme.fitnessbuddy.repositories;

import com.justme.fitnessbuddy.models.Diet;

import java.util.List;

public interface DietService {

    List<Diet> findAllDiets();


    Diet findDietById(long id);


    Diet findDietByName(String name);


    List<Diet> findAllDietsByName(String name);

}
