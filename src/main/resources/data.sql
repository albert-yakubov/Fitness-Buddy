DELETE from diets;
DELETE from exercises;
DELETE from food_items;

INSERT INTO diets (diet_id, diet_name, description)
values  (1, "weight loss", "Diet to lose weight"),
        (2,"gains", "diet to gain weight"),
        (3,"maintain", "diet to maintain weight");

insert into food_items (food_item_id, food_item_name, food_item_description, calories, protein)
values (1, "banana", "rich of potassium", 100, 1),
       (2, "steak", "rich of protein", 300, 30),
       (3, "chicken", "white meat", 300, 30),
       (4, "pork", "good source of protein", 300, 30),
       (5, "coffee", "low calorie, rich sugar", 10, 1),
       (6, "protein shake", "food suplement", 200, 30),
       (7, "eggs", "calcium", 100, 11),
       (8, "oatmeal", "rich of calcium, add milk to boost", 100, 11);

insert into exercise (exercise_id, exercise_name,exercise_description, calories_burned)
values (1, "push ups", "chest exercise", -30),
       (2, "pull ups", "back exercise", -30),
       (3, "sit ups", "abs exercise", -30),
       (4, "weights", "bicepts", -30),
       (5, "burpees", "chest exercise", -30),
       (6, "coaster", "abs exercise", -30);



alter sequence hibernate_sequence restart with 100;
