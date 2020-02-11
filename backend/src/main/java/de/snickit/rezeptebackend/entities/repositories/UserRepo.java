package de.snickit.rezeptebackend.entities.repositories;

import de.snickit.rezeptebackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
