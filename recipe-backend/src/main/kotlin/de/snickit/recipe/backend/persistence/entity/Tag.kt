package de.snickit.recipe.backend.persistence.entity

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Tag {
    @Column(name = "tag_name", nullable = false, length = 40)
    @Id
    var tagName: String? = null

    @Column(name = "description", nullable = true, length = 2000)
    var description: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
