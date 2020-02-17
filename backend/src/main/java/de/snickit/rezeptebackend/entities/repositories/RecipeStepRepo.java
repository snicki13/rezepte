package de.snickit.rezeptebackend.entities.repositories;

import de.snickit.rezeptebackend.entities.Recipe;
import de.snickit.rezeptebackend.entities.RecipeStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeStepRepo extends JpaRepository<RecipeStep, Integer> {

}
