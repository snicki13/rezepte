package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.Ingredient
import de.snickit.recipe.backend.persistence.rep.template.TemplateRepository

interface IngredientRepository : TemplateRepository<Ingredient?, Long?>
