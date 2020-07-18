package de.snickit.recipe.backend.persistence.entities

import java.util.*
import javax.persistence.*

@Entity
data class Category (
        var categoryName: String? = null
) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val categoryId: Long? = null

    @ManyToMany
    @JoinTable(name = "recipe_categories",
            joinColumns = [JoinColumn(name = "category_id")],
            inverseJoinColumns = [JoinColumn(name = "recipe_id")],
            foreignKey = ForeignKey(name = "category_reccat_fk"),
    inverseForeignKey = ForeignKey(name = "reccat_category_fk"))
    private var recipes: Set<Recipe> = HashSet()
}
