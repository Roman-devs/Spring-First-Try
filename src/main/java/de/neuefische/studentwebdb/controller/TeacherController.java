package de.neuefische.studentwebdb.controller;

import model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @GetMapping
    public List<Teacher> getTeacher(){
        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 =  new Teacher("Knick", "Wilhelm");
        Teacher teacher2 =  new Teacher("Knack", "Knick");
        Teacher teacher3 =  new Teacher("Back", "Knackund");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        return list;
    }

}
