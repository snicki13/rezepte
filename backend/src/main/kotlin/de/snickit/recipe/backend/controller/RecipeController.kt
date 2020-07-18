package de.snickit.recipe.backend.controller

import de.snickit.recipe.backend.config.exceptions.RecipeNotFoundException
import de.snickit.recipe.backend.persistence.repositories.RecipeRepo
import de.snickit.recipe.backend.persistence.repositories.RecipeStepRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController(value = "/recipe")
class RecipeController(val recipeRepo: RecipeRepo, val recipeStepRepo: RecipeStepRepo) {

    @GetMapping("/{id}")
    @Throws(RecipeNotFoundException::class)
    fun getRecipe(@PathVariable id: Long): Any {
        return recipeRepo.findById(id)
    }
}
