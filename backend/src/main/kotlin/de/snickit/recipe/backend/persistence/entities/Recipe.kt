package de.snickit.recipe.backend.persistence.entities

import com.fasterxml.jackson.annotation.JsonManagedReference
import java.util.*
import javax.persistence.*

@Entity
@SequenceGenerator(name = "recipeSeq",
        sequenceName = "RECIPE_SEQUENCE",
        allocationSize = 1,
        initialValue = 2000000)
@Table
data class Recipe (
        @Column
        var title: String? = null
) {
    @Id
    @GeneratedValue(generator = "recipeSeq")
    var recipeId: Long? = null

    @ManyToOne
    @JoinColumn(name = "userId", foreignKey = ForeignKey(name = "recipe_user_fk"))
    var user: User? = null

    @OneToMany(mappedBy = "recipeStepKey.recipe")
    @JsonManagedReference
    var recipeSteps: MutableList<RecipeStep>? = null

    @ManyToMany(mappedBy = "recipes")
    @JsonManagedReference
    var categories: MutableSet<Category>? = null

    @Column(length = 20000)
    var description: String? = ""

    @Temporal(value = TemporalType.TIMESTAMP)
    var creationTime: Calendar = Calendar.getInstance()

    @Temporal(value = TemporalType.TIMESTAMP)
    var updateTime: Calendar = Calendar.getInstance()


}
