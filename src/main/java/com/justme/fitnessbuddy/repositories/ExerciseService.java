package com.justme.fitnessbuddy.repositories;

import com.justme.fitnessbuddy.models.Exercise;

import java.util.List;

public interface ExerciseService {

    List<Exercise> findAllExercises();


    Exercise findExerciseById(int id);

    Exercise findExerciseByName(String name);

    List<Exercise> findAllExercisesByName(String name);
}
