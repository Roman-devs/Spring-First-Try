package de.neuefische.studentwebdb.controller;

import model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class Studentcontroller {
    @GetMapping
    public List<Student> getStudent(){
        List<Student> list = new ArrayList<>();
        Student student1 =  new Student("Knickknack", "Horst");
        Student student2 =  new Student("Mueller", "Peter");
        Student student3 =  new Student("Dafoe", "Willem");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }

}
