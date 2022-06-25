package com.dreamix.FMIMaterials.controllers;

import com.dreamix.FMIMaterials.models.User;
import com.dreamix.FMIMaterials.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/test1")
    public String dummyGet() {
        return "test1234";
    }
//
//    @DeleteMapping(path = "{id}")
//    public void deleteUser(@PathVariable("id") long id) {
//        userService.deleteUser(id);
//    }
}