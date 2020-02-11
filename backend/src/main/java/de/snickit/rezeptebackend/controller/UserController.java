package de.snickit.rezeptebackend.controller;

import de.snickit.rezeptebackend.entities.User;
import de.snickit.rezeptebackend.entities.repositories.UserRepo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    final
    UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public User addPerson(@RequestBody User person) {
        return userRepo.save(person);
    }
}
