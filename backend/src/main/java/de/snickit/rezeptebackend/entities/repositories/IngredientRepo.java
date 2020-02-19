package de.snickit.rezeptebackend.entities.repositories;

import de.snickit.rezeptebackend.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient, Integer> {

}
