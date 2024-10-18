package com.example.demo.of.security.controllers;

import com.example.demo.of.security.model.User;
import com.example.demo.of.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
