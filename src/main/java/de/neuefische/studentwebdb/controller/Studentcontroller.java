package de.neuefische.studentwebdb.controller;

import model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class Studentcontroller {
    @GetMapping
    public Student getStudent(){
        return new Student("Knickknack", "Horst");
    }

}
