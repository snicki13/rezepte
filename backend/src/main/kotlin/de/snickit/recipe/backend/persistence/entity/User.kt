package de.snickit.recipe.backend.persistence.entity

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "user", schema = "public")
class User {
    @Column(name = "username", nullable = false, length = 40)
    @Id
    var username: String? = null

    @Column(name = "email", nullable = false, length = 50)
    var email: String? = null

    @Column(name = "password", nullable = true)
    var password: String? = null

    @Column(name = "forename", nullable = false, length = 40)
    var firstName: String? = null

    @Column(name = "surname", nullable = false, length = 40)
    var lastName: String? = null

    @Column(name = "creation_time", nullable = true)
    var creationTime: Timestamp? = null

    @Column(name = "last_update", nullable = true)
    @Basic
    var lastUpdate: Timestamp? = null

    @Column(name = "active", nullable = false)
    var active: Boolean? = null

    @Column(name = "locked", nullable = false)
    var locked: Boolean? = null

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(name = "authority_user", joinColumns = [JoinColumn(name = "username")], inverseJoinColumns = [JoinColumn(name = "auth_id")])
    var authorities: Set<Authority> = HashSet()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

}
