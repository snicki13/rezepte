package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.Authority
import de.snickit.recipe.backend.persistence.rep.template.TemplateRepository
import org.springframework.data.jpa.repository.Query

interface AuthorityRepository : TemplateRepository<Authority, Int> {

    @Query("select a from Authority a where a.name = 'USER'")
    fun getUserDefaultAuthority(): Set<Authority>
}
