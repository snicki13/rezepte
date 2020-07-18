package de.snickit.recipe.backend.persistence.repositories

import de.snickit.recipe.backend.persistence.entities.Recipe
import de.snickit.recipe.backend.persistence.repositories.template.TemplateRepository

interface RecipeRepo : TemplateRepository<Recipe?, Long?>
