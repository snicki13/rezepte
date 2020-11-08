package de.snickit.recipe.backend.config.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.FORBIDDEN)
class EmailAlreadyExistException(email: String) : Exception("Email $email already exists!")
