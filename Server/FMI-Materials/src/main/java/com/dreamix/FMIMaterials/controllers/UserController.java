package com.dreamix.FMIMaterials.controllers;

import com.dreamix.FMIMaterials.models.User;
import com.dreamix.FMIMaterials.repositories.services.UserRepositoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Api(tags="User Controller")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepositoryService service;

    @GetMapping("/all")
    public Iterable<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable long id){
        return service.getUser(id);
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }


    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id){
        service.deleteUser(id);
    }
}
