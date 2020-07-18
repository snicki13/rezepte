package de.snickit.recipe.backend.controller

import de.snickit.recipe.backend.persistence.entities.User
import de.snickit.recipe.backend.persistence.repositories.UserRepo
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController(value = "/user")
class UserController(private val userRepo: UserRepo) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun allUsers(): MutableList<User> = userRepo.findAll()

    @CrossOrigin
    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun addPerson(@RequestBody person: User): User {
        return userRepo.save(person)
    }

}
