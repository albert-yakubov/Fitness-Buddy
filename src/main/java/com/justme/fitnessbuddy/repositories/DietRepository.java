package com.justme.fitnessbuddy.repositories;

import com.justme.fitnessbuddy.models.Diet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DietRepository extends CrudRepository<Diet, Long> {

    Diet findDietByDietName(String diet_name);

    List<Diet> findAllDietsByDiet_name(String dietName);
}
