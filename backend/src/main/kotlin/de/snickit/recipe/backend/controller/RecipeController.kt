package de.snickit.recipe.backend.controller

import de.snickit.recipe.backend.config.exceptions.RecipeNotFoundException
import de.snickit.recipe.backend.persistence.entity.Recipe
import de.snickit.recipe.backend.persistence.rep.RecipeRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/recipe")
class RecipeController(val recipeRepository: RecipeRepository) {

    @RequestMapping(method = [RequestMethod.GET])
    @Throws(RecipeNotFoundException::class)
    fun getRecipe(model: Model): String {
        model["recipe"] = recipeRepository.findById(1L).get()
        return "recipe"
    }
}
