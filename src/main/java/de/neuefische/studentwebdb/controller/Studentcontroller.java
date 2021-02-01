package de.neuefische.studentwebdb.controller;

import de.neuefische.studentwebdb.model.Teacher;
import de.neuefische.studentwebdb.service.StudentsService;
import de.neuefische.studentwebdb.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class Studentcontroller {
    StudentsService studentsService = new StudentsService();

    @GetMapping
    public List<Student> getStudentList(@RequestParam Optional<String> search){
        return studentsService.getStudentList(search.orElse(""));
    }

    @GetMapping("{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        if(studentsService.getStudentById(id).isPresent()) {
            return studentsService.getStudentById(id);
        } throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Not Found!!!");
    }

    @PutMapping
    public Student addStudent(@RequestBody Student student){
        return studentsService.addStudent(student);
    }

}
