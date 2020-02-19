package de.snickit.rezeptebackend.entities;

import de.snickit.rezeptebackend.entities.pk.RecipeStepKey;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "recipe_step", schema = "public")
@IdClass(RecipeStepKey.class)
public class RecipeStep {

    @Id
    @ManyToOne
    private Recipe recipeId;

    @Id
    private Long stepId;

    @OneToMany(mappedBy = "recipeStep")
    private Collection<RecipeStepIngredients> ingredients;

    public Collection<RecipeStepIngredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<RecipeStepIngredients> ingredients) {
        this.ingredients = ingredients;
    }
}
