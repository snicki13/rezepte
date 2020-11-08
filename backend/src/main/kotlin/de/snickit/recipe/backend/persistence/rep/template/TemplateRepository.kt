package de.snickit.recipe.backend.persistence.rep.template

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface TemplateRepository<T, ID> : JpaRepository<T, ID>, JpaSpecificationExecutor<T>
