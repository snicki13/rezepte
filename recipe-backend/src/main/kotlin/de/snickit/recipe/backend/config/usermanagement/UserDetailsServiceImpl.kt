package de.snickit.recipe.backend.config.usermanagement

import de.snickit.recipe.backend.persistence.entity.User
import de.snickit.recipe.backend.persistence.rep.UserRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service("userDetailsService")
class UserDetailsServiceImpl(val userRepository: UserRepository) : UserDetailsService {

    private val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails? {
        val user: User = userRepository.findByUsernameOrEmail(username, username)
                ?: throw UsernameNotFoundException(
                        "No user found with given username or email: $username")
        return MyUserDetails(user)
    }

}
