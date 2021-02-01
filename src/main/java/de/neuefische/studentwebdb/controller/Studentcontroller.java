package de.neuefische.studentwebdb.controller;

import de.neuefische.studentwebdb.service.StudentsService;
import de.neuefische.studentwebdb.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")

public class Studentcontroller {
    StudentsService studentsService = new StudentsService();

    @GetMapping
    public List<Student> getStudentList(){
        return studentsService.getStudentList();
    }

    @GetMapping("{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        if(studentsService.getStudentById(id).isPresent()) {
            return studentsService.getStudentById(id);
        } throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Not Found!!!");
    }


}
