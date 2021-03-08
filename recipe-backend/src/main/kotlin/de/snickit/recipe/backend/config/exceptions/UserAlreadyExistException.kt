package de.snickit.recipe.backend.config.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.FORBIDDEN)
class UserAlreadyExistException(username: String) : Exception("Username $username already exists!")
