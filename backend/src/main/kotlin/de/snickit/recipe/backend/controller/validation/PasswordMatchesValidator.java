package de.snickit.recipe.backend.controller.validation;

import de.snickit.recipe.backend.controller.RegisterController;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(final PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final UserDto user = (UserDto) obj;
        return Objects.equals(user.getPassword(), user.getMatchingPassword());
    }

}
