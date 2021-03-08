package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.RecipeTags
import de.snickit.recipe.backend.persistence.entity.RecipeTagsPK
import org.springframework.data.jpa.repository.JpaRepository

interface RecipeTagsRepository : JpaRepository<RecipeTags?, RecipeTagsPK?>
