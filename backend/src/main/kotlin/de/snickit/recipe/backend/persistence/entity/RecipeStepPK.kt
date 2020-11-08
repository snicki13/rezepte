package de.snickit.recipe.backend.persistence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Id

class RecipeStepPK : Serializable {
    @Id
    @Column(name = "recipe_id", nullable = false)
    var recipeId: Long = 0

    @Id
    @Column(name = "step_id", nullable = false)
    var stepId = 0
    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as RecipeStepPK
        if (recipeId != that.recipeId) return false
        return if (stepId != that.stepId) false else true
    }

    override fun hashCode(): Int {
        var result = (recipeId xor (recipeId ushr 32)).toInt()
        result = 31 * result + stepId
        return result
    }
}
