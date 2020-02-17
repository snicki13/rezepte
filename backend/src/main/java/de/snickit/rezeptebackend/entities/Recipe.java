package de.snickit.rezeptebackend.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "recipe", schema = "public")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recipeId;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy="recipeId")
    private Collection<RecipeStep> recipeSteps;

    @ManyToMany(mappedBy="recipes")
    private Collection<Category> categories;
}
