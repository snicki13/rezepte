package de.snickit.recipe.backend

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RecipeBackendApplication

fun main(args: Array<String>) {
    SpringApplication.run(RecipeBackendApplication::class.java, *args)
}

