package de.snickit.recipe.backend.config.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class RecipeNotFoundException(id: Long) : Exception("Could not find recipe with id $id")
