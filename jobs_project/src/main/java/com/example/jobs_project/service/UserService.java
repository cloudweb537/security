package com.example.jobs_project.service;

import com.example.jobs_project.model.User;
import com.example.jobs_project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);

    }

    public User findByUserName(String user) {
        User userOptional= userRepo.findByUsername(user);
        if(userOptional==null)
            return null;
        return userOptional;

    }
}
