package de.snickit.recipe.backend.persistence.entities

import de.snickit.recipe.backend.persistence.pk.RecipeStepIngredientKey
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "recipe_step_ingredient", schema = "public")
data class RecipeStepIngredient (

        @EmbeddedId
        var recipeStepIngredientKey: RecipeStepIngredientKey? = null

) : Serializable {

    @Column(precision = 10, scale = 3)
    var amount = 0.0

    @Column(length = 15)
    @Enumerated(EnumType.STRING)
    var unit: IngredientUnit? = null

    enum class IngredientUnit {
        ml,

        l,

        g,

        kg,

        teaspoon,

        spoon
    }

}
