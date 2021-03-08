package de.snickit.recipe.backend.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "authority_user", schema = "public", catalog = "rezepte_db")
@IdClass(AuthorityUserPK::class)
class AuthorityUser {
    @Column(name = "auth_id", nullable = false, insertable = false, updatable = false)
    @Id
    var authId: Int? = null

    @Column(name = "username", nullable = false, length = 40, insertable = false, updatable = false)
    @Id
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
