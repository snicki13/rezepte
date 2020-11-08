package de.snickit.recipe.backend.persistence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Id

class RecipeTagsPK : Serializable {
    @Id
    @Column(name = "tag_name", nullable = false, length = 40)
    var tagName: String? = null

    @Id
    @Column(name = "recipe_id", nullable = false)
    var recipeId: Long = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as RecipeTagsPK
        if (recipeId != that.recipeId) return false
        return if (if (tagName != null) tagName != that.tagName else that.tagName != null) false else true
    }

    override fun hashCode(): Int {
        var result = if (tagName != null) tagName.hashCode() else 0
        result = 31 * result + (recipeId xor (recipeId ushr 32)).toInt()
        return result
    }
}
