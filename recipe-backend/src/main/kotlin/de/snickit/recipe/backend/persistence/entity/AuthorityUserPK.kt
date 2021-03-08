package de.snickit.recipe.backend.persistence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Id

@Embeddable
class AuthorityUserPK : Serializable {
    @Id
    @Column(name = "auth_id", nullable = false)
    var authId: Int = 0

    @Id
    @Column(name = "username", nullable = false, length = 40)
    var username: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

}
