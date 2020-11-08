package de.snickit.recipe.backend.persistence.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.sql.Timestamp
import javax.persistence.*

@Entity
class Recipe {
    @Column(name = "recipe_id", nullable = false)
    @Id
    var recipeId: Long = 0

    @Column(name = "title", nullable = true, length = 255)
    @Basic
    var title: String? = null

    @Column(name = "description", nullable = true, length = 20000)
    @Basic
    var description: String? = null

    @Column(name = "creation_time", nullable = true)
    @Basic
    var creationTime: Timestamp? = null

    @Column(name = "update_time", nullable = true)
    @Basic
    var updateTime: Timestamp? = null

    @Column(name = "username", nullable = true, length = 40)
    @Basic
    var username: String? = null

    @OneToMany(mappedBy = "recipeId")
    var recipeSteps: List<RecipeStep>? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
