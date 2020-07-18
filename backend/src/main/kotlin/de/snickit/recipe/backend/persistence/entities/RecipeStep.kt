package de.snickit.recipe.backend.persistence.entities

import com.fasterxml.jackson.annotation.JsonManagedReference
import de.snickit.recipe.backend.persistence.pk.RecipeStepKey
import javax.persistence.*

@Entity
data class RecipeStep (

        @Column
        var title: String? = null

) {
    @EmbeddedId
    var recipeStepKey: RecipeStepKey? = null

    @Column(length = 20000)
    var description: String? = null

    @OneToMany(mappedBy = "recipeStepIngredientKey.recipeStep")
    @JsonManagedReference
    var ingredients: Collection<RecipeStepIngredient>? = null

}
