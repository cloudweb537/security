package com.example.demo.of.security.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Hello " + request.getSession().getId();
    }

    @GetMapping("/home")
    public String home(HttpServletRequest request){
        return "home " + request.getSession().getId();
    }

    //CSRF: Cross Site Request Forgery

    @GetMapping("/csrftoken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
