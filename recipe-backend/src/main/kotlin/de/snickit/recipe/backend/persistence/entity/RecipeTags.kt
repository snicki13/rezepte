package de.snickit.recipe.backend.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "recipe_tags", schema = "public", catalog = "rezepte_db")
@IdClass(RecipeTagsPK::class)
class RecipeTags {
    @Column(name = "tag_name", nullable = false, length = 40, insertable = false, updatable = false)
    @Id
    var tagName: String? = null

    @Column(name = "recipe_id", nullable = false, insertable = false, updatable = false)
    @Id
    var recipeId: Long = 0

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
