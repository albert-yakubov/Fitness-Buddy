package com.justme.fitnessbuddy.models;

import jakarta.persistence.*;

@Entity
@Table(name="food_items")
public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int food_item_id;
    @Column(unique = true, nullable = false)
    private String food_item_name;
    @Column(unique = true, nullable = false)
    private String food_item_description;
    private long calories;
    private long protein;



    @ManyToOne
    @JoinColumn(name = "diet_id", nullable = false)
    private FoodItems food_items;

    public FoodItems() {

    }


    public FoodItems(String food_item_name, String food_item_description, long calories, long protein) {
        this.food_item_name = food_item_name;
        this.food_item_description = food_item_description;
        this.calories = calories;
        this.protein = protein;
    }


}
