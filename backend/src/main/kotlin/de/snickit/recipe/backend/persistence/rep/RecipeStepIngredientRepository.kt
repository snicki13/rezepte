package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.RecipeStepIngredient
import de.snickit.recipe.backend.persistence.entity.RecipeStepIngredientPK
import org.springframework.data.jpa.repository.JpaRepository

interface RecipeStepIngredientRepository : JpaRepository<RecipeStepIngredient?, RecipeStepIngredientPK?>
