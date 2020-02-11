package de.snickit.rezeptebackend.entities;

import de.snickit.rezeptebackend.entities.pk.RecipeStepKey;

import javax.persistence.*;

@Entity
@Table
@IdClass(RecipeStepKey.class)
public class RecipeStep {

    @Id
    @ManyToOne
    private Recipe recipe;

    @Id
    private Long stepId;
}
