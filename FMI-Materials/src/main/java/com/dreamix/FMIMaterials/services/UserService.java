package com.dreamix.FMIMaterials.services;

import com.dreamix.FMIMaterials.models.User;
import com.dreamix.FMIMaterials.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        //checks to be added
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        userRepository.findAll().forEach(u -> users.add(u));
        return users;
    }

    public User getUser(long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("USER NOT FOUND"));
    }

    public void deleteUser (long id) {
        //checks
        userRepository.deleteById(id);
    }

}
