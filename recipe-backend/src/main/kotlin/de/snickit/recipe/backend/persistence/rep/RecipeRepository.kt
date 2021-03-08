package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.Recipe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecipeRepository : JpaRepository<Recipe?, Long?>
