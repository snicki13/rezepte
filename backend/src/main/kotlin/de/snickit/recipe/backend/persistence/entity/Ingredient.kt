package de.snickit.recipe.backend.persistence.entity

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Ingredient {
    @Column(name = "ingredient_id", nullable = false)
    @Id
    var ingredientId: Long = 0

    @Column(name = "name", nullable = true, length = 255)
    var name: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

}
