package com.vanshikacodes.fullstackbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.vanshikacodes.fullstackbackend.repositary.UserRepository;
import com.vanshikacodes.fullstackbackend.model.User;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:5173")
public class UserController {
      
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
