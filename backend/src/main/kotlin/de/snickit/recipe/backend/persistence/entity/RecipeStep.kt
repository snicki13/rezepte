package de.snickit.recipe.backend.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "recipe_step", schema = "public", catalog = "rezepte_db")
@IdClass(RecipeStepPK::class)
class RecipeStep {
    @Column(name = "recipe_id", nullable = false, insertable = false, updatable = false)
    @Id
    var recipeId: Long = 0

    @Column(name = "step_id", nullable = false, insertable = false, updatable = false)
    @Id
    var stepId = 0

    @Column(name = "title", nullable = true, length = 255)
    @Basic
    var title: String? = null

    @Column(name = "description", nullable = true, length = 20000)
    @Basic
    var description: String? = null

    @JoinColumn(name = "recipe_id", referencedColumnName = "recipe_id", nullable = false, insertable = false, updatable = false
    )
    @ManyToOne
    var recipeByRecipeId: Recipe? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
