package com.justme.fitnessbuddy.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "diets")
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long diet_id;
    @Column(unique = true, nullable = false)
    private String diet_name;
    @Column(unique = true, nullable = false)
    private String diet_description;


//    @OneToMany(mappedBy = "food_items", cascade = CascadeType.ALL,  orphanRemoval = true)
//    @JsonIgnoreProperties("diets")
//    private List<FoodItems> food_items = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "exercises_diets", joinColumns = @JoinColumn(name = "diet_id"), inverseJoinColumns = @JoinColumn(name = "exercises"))
    @JsonIgnoreProperties("diets")
    private List<Exercise> exercises = new ArrayList<>();


    // spring data jpa empty constructor
    public Diet() {}
    public Diet(String diet_name, String diet_description) {
        this.diet_name = diet_name;
        this.diet_description = diet_description;
    }

    public long getDiet_id() {
        return diet_id;
    }

    public String getDiet_name() {
        return diet_name;
    }

    public String getDiet_description() {
        return diet_description;
    }



    public void setDiet_id(long diet_id) {
        this.diet_id = diet_id;
    }

    public void setDiet_name(String diet_name) {
        this.diet_name = diet_name;
    }

    public void setDiet_description(String diet_description) {
        this.diet_description = diet_description;
    }


}
