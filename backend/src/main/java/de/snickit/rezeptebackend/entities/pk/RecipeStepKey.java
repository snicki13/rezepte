package de.snickit.rezeptebackend.entities.pk;

import de.snickit.rezeptebackend.entities.Recipe;

import javax.persistence.Column;
import java.io.Serializable;

public class RecipeStepKey implements Serializable {

    private Recipe recipeId;

    private Long stepId;
}
