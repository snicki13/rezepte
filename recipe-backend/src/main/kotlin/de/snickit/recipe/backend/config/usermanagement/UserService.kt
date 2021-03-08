package de.snickit.recipe.backend.config.usermanagement

import de.snickit.recipe.backend.config.exceptions.EmailAlreadyExistException
import de.snickit.recipe.backend.config.exceptions.UserAlreadyExistException
import de.snickit.recipe.backend.controller.validation.UserDto
import de.snickit.recipe.backend.persistence.entity.Authority
import de.snickit.recipe.backend.persistence.entity.User
import de.snickit.recipe.backend.persistence.rep.AuthorityRepository
import de.snickit.recipe.backend.persistence.rep.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.sql.Timestamp
import java.time.Instant

@Service
class UserService(val userRepository: UserRepository, val passwordEncoder: PasswordEncoder, val authorityRepository: AuthorityRepository) {

    @Transactional
    @Throws(UserAlreadyExistException::class)
    fun registerNewUserAccount(userDto: UserDto): User? {
        if (usernameExists(userDto.username!!)) {
            throw UserAlreadyExistException(userDto.username!!)
        }
        if (emailExists(userDto.email!!)) {
            throw EmailAlreadyExistException(userDto.email!!)
        }
        val user = User()
        user.username = userDto.username
        user.firstName = userDto.firstName
        user.lastName = userDto.lastName
        user.password = passwordEncoder.encode(userDto.password)
        user.email = userDto.email
        user.active = true;
        user.locked = false;
        user.creationTime = Timestamp.from(Instant.now())
        user.lastUpdate = user.creationTime
        user.authorities = authorityRepository.getUserDefaultAuthority()
        // set Roles
        // user (Arrays.asList("ROLE_USER")
        return userRepository.save(user)
    }

    private fun usernameExists(username: String): Boolean {
        return userRepository.findByUsername(username) != null
    }

    private fun emailExists(email: String): Boolean {
        return userRepository.findByEmail(email) != null
    }
}
