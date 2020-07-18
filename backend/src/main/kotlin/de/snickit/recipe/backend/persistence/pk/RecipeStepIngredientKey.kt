package de.snickit.recipe.backend.persistence.pk

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import de.snickit.recipe.backend.persistence.entities.Ingredient
import de.snickit.recipe.backend.persistence.entities.RecipeStep
import java.io.Serializable
import javax.persistence.*

@Embeddable
data class RecipeStepIngredientKey (

        @ManyToOne
        @JsonBackReference
        val recipeStep: RecipeStep,

        @ManyToOne(targetEntity = Ingredient::class)
        @JoinColumn(name = "ingredientId", foreignKey = ForeignKey(name = "recipe_step_ingredient_ingredient_fk"))
        @JsonManagedReference
        val ingredient: Ingredient

): Serializable
