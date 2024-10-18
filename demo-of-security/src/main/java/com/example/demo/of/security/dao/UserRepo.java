package com.example.demo.of.security.dao;

import com.example.demo.of.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
