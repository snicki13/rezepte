package de.snickit.recipe.backend.persistence.entities

import java.io.Serializable
import java.sql.Date
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Entity
@SequenceGenerator(name = "userSeq",
        sequenceName = "USER_SEQUENCE",
        allocationSize = 1,
        initialValue = 60000)

@Table(name = "user", schema = "public")
data class User (

        @Column(unique = true, nullable = false, length = 40)
        var username: String? = null

): Serializable {
    @Id
    @GeneratedValue(generator = "userSeq")
    var id: Long? = null

    @Column(unique = true, nullable = false, length = 50)
    var email: String? = null

    @Column(nullable = false)
    var password: String? = null

    @Column(nullable = false, length = 40)
    var forename: String? = null

    @Column(nullable = false, length = 40)
    var surname: String? = null

    @Column
    var birthday: Date? = null

    @Version
    var lastUpdate: Timestamp? = null

    @Column
    var creationTime: Timestamp? = null

    @OneToMany(mappedBy = "user")
    var userRecipes: Set<Recipe> = HashSet()

}
