package com.example.demo.of.security.controllers;

import com.example.demo.of.security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"Mahesh","Java"),
            new Student(2,"Babu","Python")

    ));

    @GetMapping("/student")
    public List<Student> getStudent(){
        return students;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        students.add(student);

    }
}
