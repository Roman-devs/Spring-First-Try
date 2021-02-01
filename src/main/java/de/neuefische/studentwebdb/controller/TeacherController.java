package de.neuefische.studentwebdb.controller;

import de.neuefische.studentwebdb.model.Teacher;
import de.neuefische.studentwebdb.service.StudentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    StudentsService studentsService = new StudentsService();

    @GetMapping
    public List<Teacher> getTeacher(){
        return studentsService.getTeacherList();
    }

    @GetMapping("{id}")
    public Optional<Teacher> getTeacherById(@PathVariable int id){
        return studentsService.getTeacherById(id);
    }

}
