package de.snickit.recipe.backend.persistence.entities

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@SequenceGenerator(name = "ingredientSeq",
        sequenceName = "INGREDIENT_SEQUENCE",
        allocationSize = 1,
        initialValue = 7000)
@Table
data class Ingredient(
        @Column
        var name: String? = null
) {
    @Id
    @GeneratedValue(generator = "ingredientSeq")
    var ingredientId: Long? = null
}
