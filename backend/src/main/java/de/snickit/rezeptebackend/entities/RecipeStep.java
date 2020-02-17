package de.snickit.rezeptebackend.entities;

import de.snickit.rezeptebackend.entities.pk.RecipeStepKey;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "recipe_step", schema = "public")
@IdClass(RecipeStepKey.class)
public class RecipeStep {

    @Id
    @ManyToOne
    private Recipe recipeId;

    @Id
    private Long stepId;

    @ManyToMany(mappedBy = "recipeSteps")
    private Collection<Ingredient> ingredients;

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
