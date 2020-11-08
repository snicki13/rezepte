package de.snickit.recipe.backend.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "recipe_step_ingredient", schema = "public", catalog = "rezepte_db")
@IdClass(RecipeStepIngredientPK::class)
class RecipeStepIngredient {

    @Column(name = "recipe_id", nullable = false, insertable = false, updatable = false)
    @Id
    var recipeId: Long = 0

    @Column(name = "step_id", nullable = false, insertable = false, updatable = false)
    @Id
    var stepId = 0

    @Column(name = "ingredient_id", nullable = false, insertable = false, updatable = false)
    @Id
    var ingredientId: Long = 0

    @Column(name = "amount", nullable = true, precision = 0)
    @Basic
    var amount: Double? = null

    @Column(name = "unit", nullable = true, length = 15)
    @Basic
    var unit: String? = null

    @JoinColumns(JoinColumn(name = "recipe_id", referencedColumnName = "recipe_id", nullable = false, insertable = false, updatable = false
    ), JoinColumn(name = "step_id", referencedColumnName = "step_id", nullable = false, insertable = false, updatable = false
    ))
    @ManyToOne
    var recipeStep: RecipeStep? = null

    @JoinColumn(name = "ingredient_id", referencedColumnName = "ingredient_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    var ingredientByIngredientId: Ingredient? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
