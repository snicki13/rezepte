package de.snickit.rezeptebackend.entities.repositories;

import de.snickit.rezeptebackend.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe, Integer> {

}
