package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.RecipeStep
import de.snickit.recipe.backend.persistence.entity.RecipeStepPK
import org.springframework.data.jpa.repository.JpaRepository

interface RecipeStepRepository : JpaRepository<RecipeStep?, RecipeStepPK?>
