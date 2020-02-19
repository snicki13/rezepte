package de.snickit.rezeptebackend.entities;

import de.snickit.rezeptebackend.entities.pk.RecipeStepIngredientsKey;

import javax.persistence.*;

@Entity
@Table(name = "recipe_step_ingredients", schema = "public")
@IdClass(RecipeStepIngredientsKey.class)
public class RecipeStepIngredients {

    @Id
    @ManyToOne
    private RecipeStep recipeStep;

    @Id
    @ManyToOne
    private Ingredient ingredient;

    @Column(precision = 10, scale = 3)
    private double amount;

    @Column(length = 5)
    private String unit;

}
