package de.snickit.recipe.backend.persistence.pk

import de.snickit.recipe.backend.persistence.entities.Recipe
import java.io.Serializable
import javax.persistence.*

@Embeddable
data class RecipeStepKey (

    @ManyToOne
    @JoinColumn(name = "recipeId", foreignKey = ForeignKey(name = "recipe_step_recipe_fk"))
    val recipe: Recipe? = null,

    val stepId: Int = recipe?.recipeSteps?.size?.plus(1) ?: 1

) : Serializable
