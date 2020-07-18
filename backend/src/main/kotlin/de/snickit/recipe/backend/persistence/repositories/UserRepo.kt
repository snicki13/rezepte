package de.snickit.recipe.backend.persistence.repositories

import de.snickit.recipe.backend.persistence.entities.User
import de.snickit.recipe.backend.persistence.repositories.template.TemplateRepository

interface UserRepo : TemplateRepository<User, Long>
