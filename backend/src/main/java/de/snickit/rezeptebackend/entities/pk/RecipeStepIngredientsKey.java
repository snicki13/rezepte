package de.snickit.rezeptebackend.entities.pk;

import de.snickit.rezeptebackend.entities.Ingredient;
import de.snickit.rezeptebackend.entities.RecipeStep;

import java.io.Serializable;

public class RecipeStepIngredientsKey implements Serializable {

    private RecipeStep recipeStep;

    private Ingredient ingredient;
}
