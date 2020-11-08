package de.snickit.recipe.backend.controller.validation

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@PasswordMatches
class UserDto {
    @NotNull
    @NotEmpty
    var username: String? = null

    @NotNull
    @NotEmpty
    var firstName: String? = null

    @NotNull
    @NotEmpty
    var lastName: String? = null

    @NotNull
    @NotEmpty
    var password: String? = null
    var matchingPassword: String? = null

    @NotNull
    @NotEmpty
    @Email
    var email: String? = null
}
