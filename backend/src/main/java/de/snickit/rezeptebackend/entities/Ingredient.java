package de.snickit.rezeptebackend.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ingredient", schema = "public")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ingredientId;

    @ManyToMany
    @JoinTable(
            name = "recipe_step_ingredients",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = {@JoinColumn(name = "recipe_id"), @JoinColumn(name = "recipe_step_id")})
    private Set<RecipeStep> recipeSteps = new HashSet<>();

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Set<RecipeStep> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(Set<RecipeStep> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }
}
