package com.example.jobs_project.controller;


import com.example.jobs_project.dto.UserDto;
import com.example.jobs_project.model.User;
import com.example.jobs_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public User userSigup(@RequestBody UserDto userDto){
        System.out.println("UserName:"+userDto.getUsername()+"Password:"+userDto.getPassword());
        User user=userService.findByUserName(userDto.getUsername());
        if(user==null){
            return userService.saveUser(userDto.todo());
        }
        return null;


    }
}
