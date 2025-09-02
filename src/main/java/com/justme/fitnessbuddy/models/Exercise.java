package com.justme.fitnessbuddy.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue()
    private long exercise_id;
    @Column(unique = true, nullable = false)
    private String exercise_name;
    @Column(unique = true, nullable = false)
    private String exercise_description;
    @Column(unique = true, nullable = false)
    private long calories_burned;



    @ManyToMany(mappedBy = "exercises")
    List<Diet> diets = new ArrayList<>();

    public Exercise() {
    }

    public Exercise(String exercise_name, String exercise_description) {
        this.exercise_name = exercise_name;
        this.exercise_description = exercise_description;
        this.calories_burned = 0;
    }

    public long getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(long exercise_id) {
        this.exercise_id = exercise_id;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public void setExercise_name(String exercise_name) {
        this.exercise_name = exercise_name;
    }

    public String getExercise_description() {
        return exercise_description;
    }

    public void setExercise_description(String exercise_description) {
        this.exercise_description = exercise_description;
    }

    public long getCalories_burned() {
        return calories_burned;
    }

    public void setCalories_burned(long calories_burned) {
        this.calories_burned = calories_burned;
    }
}
