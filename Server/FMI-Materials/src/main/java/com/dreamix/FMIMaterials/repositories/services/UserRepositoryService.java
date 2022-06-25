package com.dreamix.FMIMaterials.repositories.services;

import com.dreamix.FMIMaterials.models.User;
import com.dreamix.FMIMaterials.repositories.contracts.UserDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryService {
    private UserDB repository;

    @Autowired
    public UserRepositoryService(UserDB db){
        this.repository = db;
    }

    public void addUser(User user) {
        this.repository.save(user);
    }

    public Optional<User> getUser(long id){
        return repository.findById(id);
    }

    public Iterable<User> getAllUsers(){
        return repository.findAll();
    }

    public void deleteUser(long id){
        repository.deleteById(id);
    }
}
