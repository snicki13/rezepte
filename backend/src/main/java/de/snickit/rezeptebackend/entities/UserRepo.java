package de.snickit.rezeptebackend.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
