package com.msoft.elearning.controllers;

import com.msoft.elearning.models.Users;
import com.msoft.elearning.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/users")
    public List<Users> getAllUsers(){return repository.findAll();}
    @PostMapping("/users")
    public Users addUser(@RequestBody Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

}
