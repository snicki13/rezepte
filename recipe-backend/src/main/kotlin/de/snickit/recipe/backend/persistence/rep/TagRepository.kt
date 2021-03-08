package de.snickit.recipe.backend.persistence.rep

import de.snickit.recipe.backend.persistence.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface TagRepository : JpaRepository<Tag?, String?>, JpaSpecificationExecutor<Tag?>
