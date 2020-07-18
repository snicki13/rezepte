package de.snickit.recipe.backend.persistence.repositories

import de.snickit.recipe.backend.persistence.entities.Ingredient
import de.snickit.recipe.backend.persistence.repositories.template.TemplateRepository

interface IngredientRepo : TemplateRepository<Ingredient?, Long?>
