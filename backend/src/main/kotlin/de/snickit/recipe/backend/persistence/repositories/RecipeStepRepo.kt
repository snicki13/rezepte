package de.snickit.recipe.backend.persistence.repositories

import de.snickit.recipe.backend.persistence.entities.RecipeStep
import de.snickit.recipe.backend.persistence.pk.RecipeStepKey
import de.snickit.recipe.backend.persistence.repositories.template.TemplateRepository

interface RecipeStepRepo : TemplateRepository<RecipeStep?, RecipeStepKey?>
