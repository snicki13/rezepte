package de.snickit.recipe.backend.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class SiteController {

    @GetMapping(value = ["/"])
    fun index() = "index"

}
