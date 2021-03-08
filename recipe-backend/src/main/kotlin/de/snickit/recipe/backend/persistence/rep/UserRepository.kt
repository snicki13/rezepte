package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.User
import de.snickit.recipe.backend.persistence.rep.template.TemplateRepository

interface UserRepository : TemplateRepository<User, String> {
    fun findByUsernameOrEmail(username: String, email: String): User?

    fun findByUsername(username: String): User?

    fun findByEmail(email: String): User?

}
