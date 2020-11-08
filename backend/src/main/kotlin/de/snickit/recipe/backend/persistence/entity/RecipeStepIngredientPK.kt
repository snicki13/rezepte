package de.snickit.recipe.backend.persistence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Id

class RecipeStepIngredientPK : Serializable {
    @Id
    @Column(name = "recipe_id", nullable = false)
    var recipeId: Long = 0

    @Id
    @Column(name = "step_id", nullable = false)
    var stepId = 0

    @Id
    @Column(name = "ingredient_id", nullable = false)
    var ingredientId: Long = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
