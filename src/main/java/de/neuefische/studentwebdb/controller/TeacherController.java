package de.neuefische.studentwebdb.controller;

import de.neuefische.studentwebdb.model.Student;
import de.neuefische.studentwebdb.model.Teacher;
import de.neuefische.studentwebdb.service.StudentsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    StudentsService studentsService = new StudentsService();

    @GetMapping
    public List<Teacher> getTeacher(@RequestParam Optional<String> search){
        return studentsService.getTeacherList(search.orElse(""));
    }

    @GetMapping("{id}")
    public Optional<Teacher> getTeacherById(@PathVariable int id){
        if(studentsService.getTeacherById(id).isPresent()) {
            return studentsService.getTeacherById(id);
        } throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Not Found!!!");
    }

    @PutMapping
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return studentsService.addTeacher(teacher);
    }

}
