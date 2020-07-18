package de.snickit.recipe.backend.persistence.repositories

import de.snickit.recipe.backend.persistence.entities.Category
import de.snickit.recipe.backend.persistence.repositories.template.TemplateRepository

interface CategoryRepo : TemplateRepository<Category?, Long?>
