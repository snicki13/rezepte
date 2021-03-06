package de.snickit.recipe.backend.persistence.entity

import javax.persistence.Basic
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Authority {
    @Column(name = "id", nullable = false)
    @Id
    var id: Int = 0

    @Column(name = "name", nullable = false, length = 20)
    var name: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
