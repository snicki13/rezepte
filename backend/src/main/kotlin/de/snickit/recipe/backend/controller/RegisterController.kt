package de.snickit.recipe.backend.controller

import de.snickit.recipe.backend.config.exceptions.UserAlreadyExistException
import de.snickit.recipe.backend.config.usermanagement.UserService
import de.snickit.recipe.backend.controller.validation.UserDto
import de.snickit.recipe.backend.persistence.entity.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.validation.Valid


@Controller
class RegisterController(val userService: UserService) {

    @GetMapping("/register")
    fun showRegistrationForm(model: Model): String? {
        val userDto = UserDto()
        model["user"] =  userDto
        return "sign-up"
    }

    @CrossOrigin
    @PostMapping("/register")
    fun registerUserAccount(
            @ModelAttribute("user") userDto: @Valid UserDto,
            request: HttpServletRequest?, errors: Errors?): ModelAndView? {
        try {
            val registered: User? = userService.registerNewUserAccount(userDto)
        } catch (uaeEx: UserAlreadyExistException) {
            val mav = ModelAndView()
            mav.addObject("message", "An account for that username/email already exists.")
            return mav
        }
        return ModelAndView("index") //"user", userDto)
    }
}
